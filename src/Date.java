import java.util.Scanner;

public class Date  {

    private int day ;
    private int month ;
    private int year ;

        public Date() {
            this.day   = 0;
            this.month = 0;
            this.year  = 0;
        }
/// object
    public Date(int day, int mon, int year) {
        this.day = day;
        this.month = mon;
        this.year = year;
    }

    public Date(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }




    @Override
    public String toString() {
        return
                 day +
                "/" + month +
                "/" + year ;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        day = sc.nextInt();
        System.out.print("Enter the Month : ");
        month= sc.nextInt();
        System.out.print("Enter the Year : ");
        year=sc.nextInt();
    }
}
