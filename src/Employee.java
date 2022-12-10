import java.util.Scanner;

public class Employee {




    private Name name ;
    private Date date ;
    private String nic;


    public Employee(Name name, Date date,String nic) {
        this.name = new Name(name);
        this.date = new Date(date);
        this.nic = nic;
    }



    public Employee() {
        this.name = new Name();
        this.date = new Date();
        this.nic  ="00000000000v";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                '}';
    }

    public void input (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Informatio");
        name.input();
        date.input();
        System.out.print("Nick Name : ");
        nic = sc.nextLine();

    }

    public void print(){
        System.out.println("all information : ");
        System.out.println("Name : " +name);
        System.out.println("Date : " +date);
        System.out.println("Nick Name  : "  +nic);
    }


    public String getNic() {
        return nic;
    }
}
