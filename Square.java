import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Enter Lenght");
        double l = length.nextDouble();
        double Area = Math.pow(l, 2);
        System.out.println("Your Square Area is :" + Area);
    }
}
