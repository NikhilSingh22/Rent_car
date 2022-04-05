import java.util.*;

public class manager {
    
    void menuprint()
    {
        System.out.println("Operations for Manager menu");
        System.out.println("1. manager a car copy \n2. Return a car \n3. List all-unreturned car copies which are checked within a period");
    }
    void Rent(){

        int call_no,copy_no,user_id;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Call Number");
        call_no=inp.nextInt();

        System.out.println("Enter Copy Number");
        copy_no=inp.nextInt();

        System.out.println("User Id");
        user_id=inp.nextInt();
        //Check whether car is rented or not in database. if yes return null.

    }
    void Return(){
        int call_no,copy_no,user_id;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Call Number:");
        call_no=inp.nextInt();

        System.out.println("Enter Copy Number:");
        copy_no=inp.nextInt();

        System.out.println("User Id:");
        user_id=inp.nextInt();
        //Check whether car is with given specifications if rented or not in database
        //if found in database then return it & update database


    }
    void List_all(){
        //check all un-return
        String start,end;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Start Date:");
        start=inp.nextLine();
        System.out.println("Enter End Date:");
        end=inp.nextLine();
        //Now check in database all un-returned cars between start & end interval

    }

    public static void main(String []k)
    {
        manager obj = new manager();
        obj.menuprint();
        int n;
        Scanner s1 = new Scanner(System.in);
        n=s1.nextInt();

        switch(n)
        {
            case 1:
             obj.Rent();
             break;

             case 2:
             obj.Return();
             break;

             case 3:
             obj.List_all();
             break;

            default:
            System.out.println("INVAlid input!!!!");
        }
    }
}
