package liskov.substitution.principle.solution;

public class Main
{
    public static void main(String[] args)
    {
        //Rectangle rectangle = new Square(); // error

        /* Structurally, Squares are a specialization of Rectangles, since both have four sides and all internal angles right.
        A Square is special because it has its height equal to its width.

        Functionally, Squares do not behave like Rectangles. A Rectangle should have independent methods to change its height or its width.
        Clearly, these methods would not be appropriate for a Square.

        Inheritance should be used only if the is-a relationship is both structural and functional */

        // text take from https://effectivesoftwaredesign.com/2010/09/20/when-a-square-is-not-a-rectangle/#:~:text=Structurally%2C%20Squares%20are%20a%20specialization,its%20height%20or%20its%20width
    }
}
