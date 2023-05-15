public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empcheck=(int)((Math.random()*10)%2);
        if(empcheck==1){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}