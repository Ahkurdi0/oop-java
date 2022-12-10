import java.util.Scanner;
public class Name{


    private String firstName ;
    private String middleName;
    private String lastName ;



    public Name() {
        this.firstName = "";
        this.middleName = " ";
        this.lastName = " ";
    }



    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(Name name) {
        this.firstName = name.firstName;
        this.middleName = name.middleName;
        this.lastName = name.lastName;
    }

    @Override
    public String toString() {
        return firstName+","+middleName+" "+lastName;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        firstName= sc.next();
        System.out.print("Enter Middle Name : ");
        middleName=sc.next();
        System.out.print("Enter Last Name : ");
        lastName=sc.next();

    }
}

