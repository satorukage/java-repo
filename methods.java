public class methods {
    public static void main(String[] args){

        // Calling of he method 'SayHi'
        SayHi();

        // printing out the result of the method 'sum'
        System.out.println(sum(5,9));

        // adding 2 return values of the 'sum' method
        System.out.println(sum(7, 8) + sum(8, 5));
        

    }
    // This method returns a Hello
    public static void SayHi(){
        System.out.println("Hello");
    } 
    // This method returns the sum of the two numbers
    public static int sum(int x, int y){
        return x + y;
    }
}
