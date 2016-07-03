/**
 *Create by luca on 03-Jul-2016
 *
 */
public class Reactangle extends Formula implements Shape{

      public Reactangle(double base, double heigth) {
            super(base, heigth);
      }

      @Override
      public double perimeter() {
            return this.base*this.heigth;
      }

      @Override
      public double area() {
            return (this.base*2 + this.heigth*2);
      }
    
}
