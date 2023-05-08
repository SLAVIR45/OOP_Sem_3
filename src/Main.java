import Figure_class.Circle;
import Figure_class.Rectangle;
import Figure_class.Square;
import Figure_class.Triangle;
import User_console.Console;
import User_console.User_console;

import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(10.0);
//        circle.getInfo_circumference_length();
//        circle.getInfoArea();
//        System.out.println(circle);
//        System.out.println("_________________________________________");
        Rectangle rectangle = new Rectangle(5.0,10.0);
//        rectangle.getInfoArea();
//        rectangle.getInfoPerimeter();
//        System.out.println(rectangle);
        Square square = new Square(15.0);
//        square.getInfoArea();
//        square.getInfoPerimeter();
//        System.out.println(square);
//        System.out.println();
        Triangle triangle = new Triangle(3.0,4.0, 5.0);
//        triangle.getInfoArea();
//        triangle.getInfoPerimeter();
//        System.out.println(triangle);
//        User_console.Class_collection collection = new User_console.Class_collection();
//        collection.add_figure(circle);
//        collection.add_figure(rectangle);
//        collection.add_figure(square);
//        collection.add_figure(triangle);
//        collection.get_info_all();
//        System.out.println("___________________________________");
//        collection.sort_square();
//        collection.get_info_all();

        User_console console = new User_console();
        console.Start();


    }
}
