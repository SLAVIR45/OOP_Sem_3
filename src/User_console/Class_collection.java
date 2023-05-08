package User_console;

import Abstracct_class.Figure;
import Figure_class.Circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Class_collection
{
    private ArrayList <Figure>  collection_figure = new ArrayList<Figure>();

public void  get_info_all ()
{
    for (Figure element: this.collection_figure)
    {
        System.out.println(element);
    }
}

public void add_figure(Figure figure)
{
    this.collection_figure.add(figure);
}

public  void remove_figure(int index)
{
    this.collection_figure.remove(index);
}

public void change_figure(int index, Figure figure)
{
    this.collection_figure.set(index, figure);
}

public  void sort_square()
{
    this.collection_figure.sort(((o1, o2) -> Double.compare(o1.calculateArea(), o2.calculateArea())));
}
}

