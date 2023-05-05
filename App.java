public class App {

    public static void main(String[] args) {
        System.out.println(section1());
        System.out.println(section2());
        System.out.println(section3());
        System.out.println(section4());
    }

    public static String section1() {
        int num = 42;
        float average = (float) 95.5;
        boolean isTrue = true;
        char letter = 'A';
        return "num: "+num+"\n"+"average: "+average+"\n"+"letter: "+letter+"\n"+"isTrue: "+isTrue+"\n";

        // Hint: How to return the values as a string
        // return "num: " + num + "\n" + "average: " + average + "\n" +"letter: " + letter + "\n" +"isTrue: " + isTrue + "\n";
    }
    public static String section2() {
        int num = 42;
        float average = (float) 95.5;
        boolean isTrue = true;
        boolean isFalse = false;

        int sum = num+25;
        float product = average*2;
        int modulus= num%10;
        boolean logicalAnd = isTrue && isFalse;
        return "sum: "+sum+"\n"+"product: "+product+"\n"+"modulus: "+modulus+"\n"+"logicalAnd: "+logicalAnd+"\n";
    }
    public static String section3() {
        String result1 = "";
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            result1 = result1 + ("Square of " + i + ": " + square + "\n");
        }

        int num = 42;
        String result2 = "";
        while (num < 100) {
            num *= 2;
            result2 = result2 + "num: " + num + " ";
        }
        // Combine the two results
        return result1 + "\n" + result2 + "\n";
    }

    public static String section4() {
        int num = 42;
        char letter = 'A';
        String result = "";

        if (num % 2 == 0) {
            result += "Even" +"\n";
        } else {
            result += "Odd" +"\n";
        }
        switch (letter) {
            case 'A':
                result += "Excellent" +"\n";
                break;
            case 'B':
                result += "Good" +"\n";
                break;
            case 'C':
                result += "Average" +"\n";
                break;
            case 'D':
                result += "Poor" +"\n";
                break;
            case 'F':
                result += "Fail" +"\n";
                break;
            default:
                result += "Invalid grade" +"\n";
                break;
        }
        return result;
    }
}