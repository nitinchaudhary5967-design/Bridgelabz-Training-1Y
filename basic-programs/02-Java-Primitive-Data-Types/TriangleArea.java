import java.util.Scanner;

class TriangleArea{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;
        System.out.println("The area of the triangle is " + areaInSqInches +
							" square inches and " + areaInSqCm +
							" square centimeters.");
    }
}