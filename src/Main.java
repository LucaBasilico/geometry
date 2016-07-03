/**
 * Created by luca on 03-Jul-2016
 * 
 */
public class Main {

    public static void main(String[] args) {
          System.out.println("Result triangle");
          Triangle triangle = new Triangle(5, 5, 2);
          System.out.println(triangle.area());
          System.out.println(triangle.perimeter());
          
          System.out.println("Result square");
          Square square = new Square(10);
          System.out.println(square.area());
          System.out.println(square.perimeter());
          
          System.out.println("Result reactangle");
          Reactangle reactangle = new Reactangle(10.3, 23.2);
          System.out.println(reactangle.area());
          System.out.println(reactangle.perimeter());
    }
    
}
