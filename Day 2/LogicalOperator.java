public class LogicalOperator {
    public static void main(String[] args) {

        // Logical AND(&&)
        System.out.println( (3 > 2) && (5 < 8));
        System.out.println( (3 > 2) && (5 > 8));
        System.out.println( (3 < 2) && (5 < 8));
        System.out.println( (3 != 2) && (5 == 8));

        /*
            Truth table
            1st condition | 2nd condition | result of AND operation
            T       |      T       |         T
            T       |      F       |         F
            F       |      T       |         F
            F       |      F       |         F
         */

        System.out.println();
        System.out.println(); 

        // Logical OR(||)
        System.out.println((3 > 2) || (5 < 8));
        System.out.println((3 > 2) || (5 > 8));
        System.out.println((3 < 2) || (5 < 8));
        System.out.println((3 == 2) || (5 >= 8));

        /*
            Truth table
            1st condition | 2nd condition | result of OR operation
            T       |      T       |         T
            T       |      F       |         T
            F       |      T       |         T
            F       |      F       |         F

         */

        System.out.println();
        System.out.println(); 
        
        // Logical NOT(!) 
        System.out.println(!(3 > 4));
        System.out.println(!(3 <= 4));
        System.out.println(!(3 == 4));
        System.out.println(!(3 != 4));

        /*
            Truth table
            input | output
            T     |   F
            F     |   T

        */

    }
}
