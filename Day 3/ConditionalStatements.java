public class ConditionalStatements {
    public static void main(String[] args) {

        // if,else statements
        int age = 12; // change the value of age to test different scenarios.
        if (age >= 18) {
            System.out.println("You are an adult");
        }
        if (age > 12 && age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not an adult");
        }

        System.out.println();

        // else if statements
        int marks = 75;
        if (marks >= 90) {
            System.out.println("A+ grade");
        } else if (marks >= 80) {
            System.out.println("A grade");
        } else if (marks >= 60) {
            System.out.println("B grade");
        } else {
            System.out.println("C grade");
        }

        System.out.println();

        // Ternary operator
        boolean isRaining = false;
        String weatherReport = "Today's weather report: ";
        weatherReport += isRaining ? "It's raining" : "It's sunny";
        System.out.println(weatherReport);
        
        System.out.println();

        // Switch statements
        int number = 2;
        switch (number) {
            case 1: System.out.println("Samosa");    
                break;
            
            case 2: System.out.println("Chole Bhature");
                break;
                
            case 3: System.out.println("Mango shake");
                break;
                
            case 4: System.out.println("Kadi Chawal"); 
                break;   
            default: System.out.println("A glass of milk");
                break;
        }
    }
}