package Figure_class;

import Abstracct_class.Figure;
import Interface.Calculate_area;
import Interface.GetInfoArea;
import Interface.GetInfoPerimeter;
import Interface.Perimeter_�alculation;

public class Triangle extends Figure implements Calculate_area, Perimeter_�alculation, GetInfoArea, GetInfoPerimeter
{
    private  Double side_ab;
    private  Double side_bc;
    private  Double side_ac;


    public Triangle(Double side_ab, Double side_bc, Double side_ac) {
        this.side_ab = side_ab;
        this.side_bc = side_bc;
        this.side_ac = side_ac;
    }

    @Override
    public Double calculateArea()
    {
        Double p = calculatePerimetr()/2;
        return Math.sqrt(p * (p - this.side_ab) * (p - this.side_bc) * (p - this.side_ac));
    }

    @Override
    public void getInfoArea()
    {
        System.out.println("������� ������������ = " + calculateArea());
    }

    @Override
    public void getInfoPerimeter()
    {
        System.out.println("�������� ������������ = " + calculatePerimetr());
    }



    @Override
    public Double calculatePerimetr() {
        return this.side_ab + this.side_bc + this.side_ac;
    }

    @Override
    public String toString() {
        return String.format("������: ����������� || ������� ab: %f || ������� bc: %f || ������� ca: %f ||������� ������������: %f || �������� ������������: %f",
                this.side_ab, this.side_bc, this.side_ac, calculateArea(), calculatePerimetr());
    }
}
