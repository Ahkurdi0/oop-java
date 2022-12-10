import java.util.Scanner;

public class Main {




    static Employee[] e = new Employee[100];   // 100 employee can register ....
    static int EmployeeCount;
    public static void mainMenu(){

        System.out.println("Employee Application");
        System.out.println("+++++++++++++++++++++");
        System.out.println("1. Add new Employee");
        System.out.println("2. print ALL");
        System.out.println("3. print given Employee");
        System.out.println("4. Exit");

    }

    public static int getMenuOption(){

        int option ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Option : ");
        option = sc.nextInt();
        return option;
    }

    public static void printAll(){


        //display data

        for (int i = 0 ; i<EmployeeCount; i++){
            e[i].print();
        }

    }

    public static void printGive(){
        String NIC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NIC : ");
        NIC= sc.next();
        for (int i = 0 ; i<EmployeeCount;i++){
            if (NIC.equals(e[i].getNic())){

                System.out.println("******GIEVN EMPLOYEE DETAILS*******");
                e[i].print();


            }
        }

    }

    public static void AddNewEmployee(){
        int type = 0 ;
        System.out.println("Enter Employee type");
        System.out.println("1-FULL , 2-MANAGER , 3-contractor");
        type = getMenuOption();
        switch (type){
            case 1 :
                //Manager obj     = new Manger();
                e[EmployeeCount]  = new FullTimeEmp();
                e[EmployeeCount].input();
                EmployeeCount++;
            break;

            case 2 :
                e[EmployeeCount]  = new Manager();
                e[EmployeeCount].input();
                  EmployeeCount++;
                break;

            case 3 :
                e[EmployeeCount]  = new Contractor();
                e[EmployeeCount].input();
                EmployeeCount++;
                break;
        }
     }


    public static void main(String[] args) {
        EmployeeCount = 0 ;
        int optionValue = 0 ;
        do {
            mainMenu();
            optionValue = getMenuOption();

            switch (optionValue){

                case 1 :
                    System.out.println("ADD");
                    AddNewEmployee();
                    break;
                case 2:
                    System.out.println("Print ALL");
                    printAll();
                    break;
                case 3 :
                    System.out.println("print given");
                    printGive();
                    break;
                case 4:
                    System.out.println("Thanks ");
                    break;
                default:
                    System.out.println("ERROR INPUT");
            }
        }
        while (optionValue != 4 );



    }



}