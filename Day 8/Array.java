import java.util.Scanner;

public class Array{
    public static void updateMarks(int marks[]) {
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 2;
        }
    }
    public static void main(String[] args) {
        // creating an array
        int marks[] = new int[3];

        int numbers[] = {1,2,3}; // size: 3

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage = " + percentage);

        updateMarks(marks);
        
        //  print updated marks
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }

        System.out.println();
        // marks[2] = 98;  // upadtion
        // System.out.println("math: " + marks[2]);

    }
}