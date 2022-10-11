package org.example.di;

import javassist.tools.reflect.Reflection;
import org.example.annotation.Inject;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class BeanFactory {

    private final Set<Class<?>> preInstantiatedClazz;

    private Map<Class<?>, Object> beans = new HashMap<>();

    public BeanFactory(Set<Class<?>> preInstantiatedClazz) {
        this.preInstantiatedClazz = preInstantiatedClazz;
        initialize();
    }

    private void initialize() {
        for (Class<?> clazz : preInstantiatedClazz) {
            Object instance = createInstance(clazz);
            beans.put(clazz, instance);
        }
    }


    //UserController 에 대한 calzz 객체 들어오면 생성자 가져옴 생성자의 파라미터 정보 가져와서 파라미터에 대한 겟파라미터 바이 클래스 호출 유저컨트롤러에대한 파라미터는유저서비스임
    //유저서비스가 들어옴 클래스 타입 객체로 겟파라미터 바이 클래스 호출 겟 빈 호출했는데 유저컨드롤러에 대한 인스턴스도 생성되기전임 유저서비스에 대한 빈은 없음 유저서비스 다시생성(유저컨트롤러에
    //유저서비스가 필요한데 그에대한 인스턴스가없어서 유저서비스 먼저만듬 , 유저서비스가 두번쨰로 들어옴 그럼 유저서비스도 컨스트럭터랑 파라미터 타입 가져옴 근데 파라미터가 없음 유저서비스는
    //겟파라미터바이클래스했을때 겟빈하면 다시생성해줄 필요가 없음 유저서비스는 인스턴스를 생성하고 생성이 완료되면 겟빈해서 유저서비스에대한 빈을 찾아서
    //유저서비스인스턴스를 받고 파라미터에 세팅하고 유저컨트롤러인스턴스를 생성함
    //겟빈해서 유저서비스에대한 빈을 찾아서 유저서비스 인스턴스 받고 유저서비스인스턴스를 생성해줌 = 재귀함수호출코드
    private Object createInstance(Class<?> clazz) {
        //생성자
        Constructor<?> constructor = findConstructor(clazz);

        //파라미터
        List<Object> parameters = new ArrayList<>();
        for (Class<?> typeClass : constructor.getParameterTypes()) {
            parameters.add(getParameterByClass(typeClass));
        }

        //인스턴스 생성
        try {
            return constructor.newInstance(parameters.toArray());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private Constructor<?> findConstructor(Class<?> clazz) {
        Constructor<?> constructor = BeanFactoryUtils.getInjectedConstructor(clazz);
        if (Objects.nonNull(constructor)) {
            return constructor;
        }
        return clazz.getConstructors()[0];

    }

    private Object getParameterByClass(Class<?> typeClass) {
        Object instanceBean = getBean(typeClass);

        if(Objects.nonNull(instanceBean)){
            return instanceBean;
        }
        return createInstance(typeClass);
    }

    public <T> T getBean(Class<T> requiredType) {
        return (T) beans.get(requiredType);
    }
}
