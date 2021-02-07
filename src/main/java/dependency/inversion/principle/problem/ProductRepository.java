package dependency.inversion.principle.problem;

public class ProductRepository
{
    //private MySqlConnection mySqlConnection; // old
    private OracleConnection OracleConnection; // new

    public ProductRepository()
    {
        //this.mySqlConnection = new MySqlConnection(); // old
        this.OracleConnection = new OracleConnection(); // new
    }

    // Breaks the open closed principle
}
