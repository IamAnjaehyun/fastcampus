import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        std_singletone.Company company1 = std_singletone.Company.getInstance();
        std_singletone.Company company2 = std_singletone.Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        //SingleTone\외부에서 생성 x 내부에 private로 생성되어있고
        //메서드 하나만 생성되어있어서 하나만 사용 가능

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());
    }
}
