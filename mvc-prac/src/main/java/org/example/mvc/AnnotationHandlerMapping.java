package org.example.mvc;


import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;

public class AnnotationHandlerMapping implements HandlerMapping{
    private final Object[] basePackage;

    private Map<HandlerKey, AnnotationHandler> handlers = new HashMap<>();


    public AnnotationHandlerMapping(Object... basePackage){
        this.basePackage = basePackage;
    }

    public void initialize(){
        Reflections
    }
    @Override
    public Object findHandler(HandlerKey handlerKey) {
        return handlers.get(handlerKey);
    }
}
