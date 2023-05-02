public class App {
    public static void main(String[] args) {
        System.out.println(section1());
        System.out.println(section2());
        System.out.println(section3());
        //System.out.println(section4());
    }

    public static String section1() {
        // Write section 1 code here
        int num = 42;
        float average = (float) 95.5;
        char letter = 'A';
        boolean isTrue = true;

        return "num: " + num + "\n" +
             "average: " + average + "\n" +
            "letter: " + letter + "\n" +
              "isTrue: " + isTrue + "\n";

        // Hint: How to return the values as a string
//        return "num: " + num + "\n" +
//                "average: " + average + "\n" +
//                "letter: " + letter + "\n" +
//                "isTrue: " + isTrue + "\n";
    }

    public static String section2() {
        // Write section 2 code here
        int num = 42;
        float average = (float) 95.5;
        boolean isTrue = true;

        int sum = num + 25;
        float product = average * 2;
        int modulus = num % 10;
        boolean logic = isTrue && false;

        return "sum: " + sum + "\n" +
                "product: " + product + "\n" +
                "modulus: " + modulus + "\n" +
                "logicalAnd: " + logic + "\n" ;
    }

   /*  public static String section3() {
        // Write section 3 code here

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int square = i*i;
            sb.append(square).append("");           
        }
        String result = sb.toString();

        int num = 42;
        while (num < 100) {
            sb.append(num).append("");
            num *= 2;
        }

        String result2 = sb.toString();

        return result;
       
    }*/

    public static String section4() {
        // Write section 4 code here

    }

    
}
