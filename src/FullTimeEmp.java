import java.util.Scanner;

public class FullTimeEmp extends Employee {

    private float salary ;


    public FullTimeEmp() {
        super();
        this.salary = 0;
    }

    public FullTimeEmp(float salary , Name name, Date date, String nic ) {
        super(name, date, nic);
        this.salary = salary;
    }


    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Full Time Employee");
        super.input();
        System.out.print("Salary : ");
        salary=in.nextFloat();
    }

    public void print(){
        System.out.println("Full Time Employee");
        super.print();
        System.out.println("salary"+salary);

    }

    @Override
    public String toString() {
        return "Full Time Employee}";
    }
}
