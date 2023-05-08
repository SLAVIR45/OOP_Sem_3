package Figure_class;

import Abstracct_class.Figure;
import Interface.Calculate_area;
import Interface.GetInfoArea;
import Interface.GetInfoPerimeter;
import Interface.Perimeter_сalculation;

public class Rectangle extends Figure implements Calculate_area, Perimeter_сalculation, GetInfoArea, GetInfoPerimeter
{
    protected Double side_a;
    private Double side_b;


    public Rectangle(Double side_a, Double side_b)
    {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    protected Rectangle(Double side_a) {
        this.side_a = side_a;
    }

    @Override
    public Double calculateArea() {
        return this.side_a * this.side_b;
    }

    @Override
    public void getInfoArea()
    {
        System.out.println("Площадь прямоугольника = " + calculateArea());
    }



    @Override
    public Double calculatePerimetr()
    {
        return (this.side_b + this.side_a) * 2;

    }

    @Override
    public void getInfoPerimeter()
    {
        System.out.println("Периметр прямоугольника = " + calculatePerimetr());
    }

    @Override
    public String toString() {
        return String.format("Фигура: Прямоугольник || Сторона a: %f || Сторона b: %f || Площадь прямоугольника: %f || Периметр прямоугольника: %f",
                this.side_a, this.side_b, calculateArea(), calculatePerimetr());
    }
}
