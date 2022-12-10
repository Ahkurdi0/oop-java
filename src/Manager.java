

import java.util.Scanner;

public class Manager extends FullTimeEmp{


    private String car ;
    private String phone ;


    public Manager(float salary, Name name, Date date, String nic, String car, String phone) {
        super(salary, name, date, nic);
        this.car = car;
        this.phone = phone;
    }


    public Manager() {
        super();
        this.car = "";
        this.phone = "";
    }

    @Override
    public String toString() {
        return "Manager";
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Manager");
        super.input();
        System.out.println("Car Number");
        car = sc.nextLine();
        System.out.println("Phone Number  ");
        phone= sc.nextLine();

    }

    public void print(){
        System.out.println("Manager ");
        super.print();
        System.out.println("Car"+car);
        System.out.println("phone "+ phone);

    }



}
