package module08._02constructors;

// 1. Make the class square inherit from Rectangle
public class Square extends Rectangle {
     // 2. Add a Square no-argument constructor
     public Square (){
      super();
     }
     // 3. Add a Square constructor with 1 argument for a side\
     public Square (int sideLength){
      super(sideLength, sideLength);
     }

     public static void main(String[] args)
     {
        Rectangle r = new Rectangle(3,5);
        r.draw();
        // 4. Uncomment these to test
        Square s1 = new Square();
        s1.draw();
        Square s = new Square(3);
        s.draw();

        // testing area() methods
        System.out.println(r.area());
        System.out.println(s1.area());
        System.out.println(s.area());

        //testing LongRectangle subclass
        LongRectangle lr1 = new LongRectangle();
        lr1.draw();
        LongRectangle lr2 = new LongRectangle(3);
        lr2.draw();
        System.out.println(lr1.area());
        System.out.println(lr2.area());
     }
}
