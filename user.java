public class user{
    void search(){
        //search using three methods
    }
    void show(){
        //show renting record based on user id
    }

    public static void main(String [] args){
        user obj = new user();
        obj.menuprint();
        int n;
        Scanner s1 = new Scanner(System.in);
        n=s1.nextInt();

        switch(n)
        {
            case 1:
             obj.search();
             break;

             case 2:
             obj.show();
             break;

            //  case 5:
            //  break;

            default:
            System.out.println("INVAlid input!!!!");

        }

    }
}
