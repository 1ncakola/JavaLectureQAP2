public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 1);

        MyRectangle rect = new MyRectangle(p1, p2);

        System.out.println(rect); 

        // Test width, height, area, and perimeter
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

    }     
}

