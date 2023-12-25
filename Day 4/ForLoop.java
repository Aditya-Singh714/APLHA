import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Hello World!");
        }

        System.out.println();

        // print square pattern
        for(int lines = 1; lines <= 4; lines++){
            System.out.println("* * * *");
        }

        System.out.println();

        // using break statement
        int num = 5;
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("I am out of the loop");

        System.out.println();


        for(int i = 0;i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
