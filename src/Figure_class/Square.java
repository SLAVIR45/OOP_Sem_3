package Figure_class;

public class Square extends Rectangle
{
    public Square(Double side_a) {
        super(side_a);
    }

    @Override
    public Double calculateArea() {
        return super.side_a * 2;
    }

    @Override
    public Double calculatePerimetr() {
        return 4 * super.side_a;
    }

    @Override
    public void getInfoArea() {
        System.out.println("������� �������� = " + calculateArea());;
    }

    @Override
    public void getInfoPerimeter() {
        System.out.println("�������� �������� = " + calculatePerimetr());;
    }

    @Override
    public String toString() {
        return String.format("������: ������� || ������� a: %f || ������� ��������: %f || �������� ��������: %f",
                this.side_a, calculateArea(), calculatePerimetr());
    }
}
