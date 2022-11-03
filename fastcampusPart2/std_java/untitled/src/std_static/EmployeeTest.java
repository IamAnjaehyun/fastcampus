package std_static;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName()+" 이름을 가진 사원의 사번은 " +employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+" 이름을 가진 사원의 사번은 " +employeeKim.getEmployeeId());
//        System.out.println(employeeKim.serialNum);

    }
}
