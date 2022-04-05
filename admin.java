import java.util.*;
public class admin{
    void menuprint()
    {
        System.out.println("Operations for Administrator menu");
        System.out.println("1. Create all tables\n2. Delete all\n3. Load from datafile\n4. Show number of records in each table\n5.Return to the main menu");
    }

    void createTable()
    {

    }

    void deletetable()
    {

    }
    void LoadData()
    {
        //User will enter path of the folder that contains data files,

    }
    void Show_records()
    {

    }
    

    public static void main(String [] k)
    {
        admin obj = new admin();
        obj.menuprint();
        int n;
        Scanner s1 = new Scanner(System.in);
        n=s1.nextInt();

        switch(n)
        {
            case 1:
             obj.createTable();
             break;

             case 2:
             obj.deletetable();
             break;

             case 3:
             obj.LoadData();
             break;

             case 4:
             obj.Show_records();
             break;

            //  case 5:
            //  break;

            default:
            System.out.println("INVAlid input!!!!");

        }

    }
}
