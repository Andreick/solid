package liskov.substitution.principle.solution;

public class Square extends Quadrilateral
{
    @Override
    public void setHeight(double height)
    {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width)
    {
        super.setHeight(width);
        super.setWidth(width);
    }
}
