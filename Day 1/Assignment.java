import java.util.Scanner;

public class Assignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1)  In a program, input 3 numbers: A, B andC. Youhave to output the average of
        //    these 3 numbers.
        System.out.println("Enter three numbers: ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        int avg = (input1 + input2+ input3)/3;
        System.out.println("Average of " + input1 + ", " + input2 + ", " + input3 + " is " + avg);
        
        System.out.println();

        // Q2) In a program, input the side of a square. You have to output the area of the square.
        System.out.println("Enter the length of a side of a square:");
        int side = sc.nextInt();
        int squareArea = side*side;

        System.out.println("Area of sqaure is "+ squareArea);

        System.out.println();

        // Q3) Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
        // an eraser. You have to output the total cost of the items back to the user as their bill.
        System.out.print("Cost of Pencil: $");
        float pencilPrice = sc.nextFloat();
        System.out.print("Cost of Pen: $");
        float penPrice = sc.nextFloat();
        System.out.print("Cost of Eraser: $");
        float eraserPrice = sc.nextFloat();

        float totalBill = (pencilPrice + penPrice + eraserPrice);
        System.out.println("Total bill : $" + totalBill);

        float billGST = (float) (totalBill + totalBill*0.18); 
        System.out.println("Total bill after 18% of GST $" + billGST);

        System.out.println();

        // Q4) What will be the type of result in the following Java code?
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f*b) + (i%c) - (d*s);
        System.out.println("Result is " + result);

        System.out.println();


        // Q5) Will the following statement give any error in Java
        int $ = 24;
        System.out.println(" No, the statement will not give any error.\r\n" + //
                " NamesofvariablesarecalledidentifiersinJava. Identifierrulesays, identifierscanstartwith\r\n" + //
                " any alphabet or underscore (“_”) or dollar (“$”).\r\n" + //
                " According to the rule the given variable name is a valid identifier.");
    }
}