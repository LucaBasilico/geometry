/**
 *Create by luca on 03-Jul-2016
 *
 */
public class Square implements Shape{
      private double side;

      public Square(double side) {
            this.side = side;
      }
      

      @Override
      public double perimeter() {
            return side*4;
      }

      @Override
      public double area() {
            return side*2;
      }
      
}
