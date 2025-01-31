import java.util.Scanner;

class calculator{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.err.print("Enter The aValue : ");
        int a = scan.nextInt();
        System.err.print("Enter The bValue : ");
        int b = scan.nextInt();
        
        scan.nextLine();
        String symbol = scan.nextLine();

        switch (symbol) {
             case "+":
             System.out.println(a + b);
             break;

             case "-":
             System.out.println(a - b);
             break;

             case "*":
             System.out.println((float)a * b);
             break;

             case "/":
             System.out.println((float)a / b);
             break;

             default:
             System.out.println("Invalid Input.");
             break;
        }


    }
}