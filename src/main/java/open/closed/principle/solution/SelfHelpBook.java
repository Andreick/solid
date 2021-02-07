package open.closed.principle.solution;

public class SelfHelpBook implements DiscountBook
{
    @Override
    public double discountValue()
    {
        return 0.5;
    }
}
