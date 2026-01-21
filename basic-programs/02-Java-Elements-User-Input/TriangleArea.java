import java.util.Scanner;

class TriangleArea{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInSqCm = 0.5 * base * height;
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;
        double areaInSqInches = 0.5 * baseInInches * heightInInches;
        System.out.println("The Area of the triangle in sq in is " + areaInSqInches +
                           " and sq cm is " + areaInSqCm);
    }
}
