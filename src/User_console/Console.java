package User_console;

import Abstracct_class.Figure;
import Figure_class.Circle;
import Figure_class.Rectangle;
import Figure_class.Square;
import Figure_class.Triangle;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Console extends Class_collection {
    protected void action() {
        System.out.println("Выбирите действие которое хотите сделать");
        System.out.println("Если хотите выйти, введите -1");
        view_selection_interface();
        int user_value = input_value_int();
        while (user_value != -1) {

            switch (user_value) {
                case 1:
                    addFigure();
                    break;
                case 2:
                    removeFigure();
                    break;
                case 3:
                    info();
                    break;
                case 4:
                    changeFigure();
                case 5:
                    sortSquare();
                    break;
            }
            System.out.println("Выбирите действие которое хотите сделать");
            System.out.println("Если хотите выйти, введите -1");
            view_selection_interface();
            user_value = input_value_int();
        }

    }


    public Integer input_value_int() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число");
        int result = scanner.nextInt();
        return result;
    }

    public Double input_value_double() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число");
        Double result = scanner.nextDouble();
        return result;
    }

    public Double input_value_double(String text) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" Введите " + text);
            Double result = scanner.nextDouble();
            return result;
        } catch (Exception e) {
            System.out.println("Введено неправильное значение, повторите ввод");
            System.out.println("Введите цифру");
            return input_value_double(text);
        }


    }

    private HashMap<Integer, String> selection_interface() {
        HashMap<Integer, String> interace = new HashMap<Integer, String>();
        interace.put(1, " Добавить новую фигуру");
        interace.put(2, " Удаление фигуры ");
        interace.put(3, " Вывод информации о фигурах ");
        interace.put(4, " Изменить фигуру ");
        interace.put(5, " Сортировка по площади и вывод информации о фигурах ");
        return interace;
    }

    private HashMap<Integer, String> selection_figure() {
        HashMap<Integer, String> interace = new HashMap<Integer, String>();
        interace.put(1, " Треугольник ");
        interace.put(2, " Квадрат");
        interace.put(3, " Прямоугольник");
        interace.put(4, " Круг");

        return interace;
    }

    public void view_selection_figure() {
        selection_figure().entrySet().forEach(entry ->
        {
            System.out.println(entry.getKey() + entry.getValue());
        });
    }

    public void view_selection_interface() {
        selection_interface().entrySet().forEach(entry ->
        {
            System.out.println(entry.getKey() + entry.getValue());
        });
    }

    private void addFigure() {
        System.out.println("Выбирите какую фигуру хотите создать");
        view_selection_figure();

        switch (input_value_int()) {
            case 1:
                boolean triangle_ok = false;
                Double size1 = 0.0;
                Double size2 = 0.0;
                Double size3 = 0.0;

                while (!triangle_ok) {
                    size1 = input_value_double("значение стороны ab");
                    size2 = input_value_double("значение стороны bc");
                    size3 = input_value_double("значение стороны ac");
                    if (size1 < (size2 + size3) && (size2 < (size1 + size3) && (size3 < (size2 + size1)))) {
                        System.out.println("треугольник существует");
                        triangle_ok = true;
                    } else {
                        System.out.println("треугольник не существует");
                        triangle_ok = false;
                    }
                }
                Triangle triangle = new Triangle(size1, size2, size3);
                add_figure(triangle);
                System.out.println("Треугольник создан");
                break;

            case 2:
                size1 = input_value_double("значение стороны квадрата");
                Square square = new Square(size1);
                add_figure(square);
                System.out.println("Квадрат создан");
                break;

            case 3:
                size1 = input_value_double("значениеи щирины прямоугольника");
                size2 = input_value_double("значениеи длины прямоугольника");
                Rectangle rectangle = new Rectangle(size1, size2);
                add_figure(rectangle);
                System.out.println("Прямоугольник создан");
                break;

            case 4:
                size1 = input_value_double("значение диаметр круга");
                Circle circle = new Circle(size1);
                add_figure(circle);
                System.out.println("Круг создан");
                break;
        }
    }

    private Figure addFigure_return() {
        System.out.println("Выбирите какую фигуру хотите создать");
        view_selection_figure();

        switch (input_value_int()) {
            case 1:
                boolean triangle_ok = false;
                Double size1 = 0.0;
                Double size2 = 0.0;
                Double size3 = 0.0;

                while (!triangle_ok) {
                    size1 = input_value_double("значение стороны ab");
                    size2 = input_value_double("значение стороны bc");
                    size3 = input_value_double("значение стороны ac");
                    if (size1 < (size2 + size3) && (size2 < (size1 + size3) && (size3 < (size2 + size1)))) {
                        System.out.println("треугольник существует");
                        triangle_ok = true;
                    } else {
                        System.out.println("треугольник не существует");
                        triangle_ok = false;
                    }
                }
                Triangle triangle = new Triangle(size1, size2, size3);
                System.out.println("Треугольник создан");
                return triangle;

            case 2:
                size1 = input_value_double("значение стороны квадрата");
                Square square = new Square(size1);
                System.out.println("Квадрат создан");
                return square;

            case 3:
                size1 = input_value_double("значениеи щирины прямоугольника");
                size2 = input_value_double("значениеи длины прямоугольника");
                Rectangle rectangle = new Rectangle(size1, size2);
                System.out.println("Прямоугольник создан");
                return rectangle;

            case 4:
                size1 = input_value_double("значение диаметр круга");
                Circle circle = new Circle(size1);
                System.out.println("Круг создан");
                return circle;

        }
        return null;
    }





    private void removeFigure()
    {
        System.out.println("Введите индекс фигуры, которую хотите удалить");
        remove_figure(input_value_int());
    }

    private void info()
    {
        get_info_all();
    }


    private void changeFigure()
    {
        System.out.println("Введите индекс фигуры которую хотите заменить");
        change_figure(input_value_int(),addFigure_return());
    }


    private void sortSquare()
    {
        sort_square();
        get_info_all();
    }




}
