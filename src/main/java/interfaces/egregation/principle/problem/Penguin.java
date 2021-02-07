package interfaces.egregation.principle.problem;

public class Penguin implements Bird
{

    @Override
    public void peck()
    {
        // can peck
    }

    @Override
    public void hatchEggs()
    {
        // can hatch eggs
    }

    @Override
    public void fly()
    {
        // CAN'T FLY!
    }
}
