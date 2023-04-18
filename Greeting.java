import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String greeting = generateGreeting(name);
        System.out.println(greeting);
    }
    
    public static String generateGreeting(String name) {
        return "Hello, " + name + "! Welcome to GitHub Classroom!";
    }
}
