import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag = 0;
        while(flag == 0)
        {
            System.out.println("Enter 2 integers.");
            try{
                int a = scan.nextInt();
                int b = Integer.parseInt(scan.nextLine().trim());
                int c = a/b;
                System.out.println("Result: " + c);
                flag = 1;
            }
            catch(ArithmeticException e)
            { System.out.println("A"); }
            catch(NumberFormatException e)
            { System.out.println("C");}
            catch(Exception e)
            {
                System.out.println("B");
                if (scan.hasNextLine())
                    scan.nextLine();
            }
            finally
            { System.out.println("D"); }
        }
        scan.close();
        System.out.println("E");
    }}
