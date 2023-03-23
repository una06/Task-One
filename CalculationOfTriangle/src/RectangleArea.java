import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = input.nextDouble();
        System.out.print("Enter width of rectangle: ");
        width = input.nextDouble();
        input.close();
    }
    public void computeField(){
        area = length * width;
    }
    public void fieldDisplay() {
        System.out.println("Rectangle length = " + length);
        System.out.println("Rectangle width = " + width);
        System.out.println("Area of Rectangle  = " + area);
    }

}
