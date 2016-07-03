/**
 *Create by luca on 03-Jul-2016
 *
 */
public class Triangle extends Formula implements Shape{
      private double side;

      public Triangle(double base, double heigth, double side) {
            super(base, heigth);
            this.side = side;
      }

      public double getSide() {
            return side;
      }

      public void setSide(double side) {
            this.side = side;
      }
      
                  
      @Override
      public double perimeter() {
            return side*3;
      }

      @Override
      public double area() {
            return ((this.base * this.heigth)/2);
      }
      
}
