public class Use_Rectangle {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.length = 15.854;
        rect.width = 22.65;
        System.out.println("Length = " + rect.length);
        System.out.println("Width = " + rect.width);
        rect.Area();
        rect.Perimeter();
    }
}


//to compile=
 javac Rectangle.java Use_Rectangle.java
   //to run=
   java Use_Rectangle


