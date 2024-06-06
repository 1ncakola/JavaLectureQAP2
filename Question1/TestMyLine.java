public class TestMyLine {
    public static void main(String[] args) {
        
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("p1: (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("p2: (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        
        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

       
    }
}
