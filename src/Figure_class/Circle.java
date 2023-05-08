package Figure_class;

import Abstracct_class.Figure;
import Interface.Calculate_area;
import Interface.GetInfoArea;
import Interface.GetInfo_circumference_length;

public class Circle extends Figure implements Calculate_area, GetInfoArea, GetInfo_circumference_length
{
    private  Double diameter;

    public Circle(Double diameter)
    {
        this.diameter = diameter;
    }

    @Override
    public Double calculateArea()
    {
        return  (Math.PI * Math.pow(this.diameter,2)) / 4;

    }

     private Double circumference_length()
     {
         return Math.PI * this.diameter;
     }

    @Override
    public void getInfoArea()
    {
        System.out.println("������� ����� = " + calculateArea());

    }

    @Override
    public void getInfo_circumference_length()
    {
        System.out.println("����� ���������� = " + circumference_length());
    }


    @Override
    public String toString()
    {
        return String.format("������: ���� || �������: %f || ������� �����: %f || ����� ����������: %f",
                this.diameter, calculateArea(), circumference_length());
    }
}
