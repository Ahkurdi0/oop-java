import java.util.Scanner;

public class Contractor extends Employee {

    private float hrate ;
    private int nh;


    public Contractor() {

        super();
        this.hrate = 0;
        this.nh = 0;
    }

    public Contractor(Name name, Date date, String nic, float hrate, int nh) {
        super(name, date, nic);
        this.hrate = hrate;
        this.nh = nh;
    }


    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Contract Employee");
        super.input();
        System.out.println("H Rate");
        hrate=in.nextFloat();
        System.out.println("Total hours");
        nh = in.nextInt();
    }

    public void print(){
        System.out.println("Contract Employee");
        super.print();
        System.out.println("H rate"+hrate);
        System.out.println("number of hours"+nh);
   }

    @Override
    public String toString() {
        return "Contractor";
    }
}
