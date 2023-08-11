import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        // System.out.println(4/0); cant be done
        Scanner s = new Scanner(System.in); //class for taking input -- system.in= user is sending ,accept it
        int a = s.nextInt();
        try {
            System.out.println(4 / a);// dynamic coding
        } catch (Exception e)
        {

            System.out.println("if the code is giving error because of "+e);
    }

} }
