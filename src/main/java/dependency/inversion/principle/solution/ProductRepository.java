package dependency.inversion.principle.solution;

public class ProductRepository
{
    private DbConnection dbConnection;

    public ProductRepository(DbConnection dbConnection)
    {
        this.dbConnection = dbConnection;
    }

    // Preserves the open closed principle
}
