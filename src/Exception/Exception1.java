package Exception;

public class Exception1 {
    public static void main(String[] args) {
        int marks=50;
        if(marks<40){
            throw new ArithmeticException("Shivansh Failed!");
        }
        System.out.print("Shivansh Passed!");
    }
}
