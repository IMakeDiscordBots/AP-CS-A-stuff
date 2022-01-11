

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AccountTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AccountTest
{
    /**
     * Default constructor for test class AccountTest
     */
    public AccountTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }



    @Test
    public void noPrevSmallNew()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$0.00\nAdditional Charges:\t$20.00\nInterest:\t\t$0.00\n\nNew Balance:\t\t$20.00\n\nMinimum Payment:\t$20.00", Account.processStatement(0, 20));
    }
    
    @Test
    public void noPrevMedNew()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$0.00\nAdditional Charges:\t$80.00\nInterest:\t\t$0.00\n\nNew Balance:\t\t$80.00\n\nMinimum Payment:\t$50.00", Account.processStatement(0, 80));
    }
    
    @Test
    public void noPrevLargeNew()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$0.00\nAdditional Charges:\t$600.00\nInterest:\t\t$0.00\n\nNew Balance:\t\t$600.00\n\nMinimum Payment:\t$120.00", Account.processStatement(0, 600));
    }
    
    @Test
    public void interestUnder50()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$20.00\nAdditional Charges:\t$20.00\nInterest:\t\t$0.80\n\nNew Balance:\t\t$40.80\n\nMinimum Payment:\t$40.80", Account.processStatement(20, 20));
    }
    
    @Test
    public void interest50()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$40.00\nAdditional Charges:\t$10.00\nInterest:\t\t$1.00\n\nNew Balance:\t\t$51.00\n\nMinimum Payment:\t$50.00", Account.processStatement(40, 10));
    }
    
    @Test
    public void interestOver50()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$300.00\nAdditional Charges:\t$100.00\nInterest:\t\t$8.00\n\nNew Balance:\t\t$408.00\n\nMinimum Payment:\t$81.60", Account.processStatement(300, 100));
    }
    
    @Test
    public void interest4999()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$40.00\nAdditional Charges:\t$9.01\nInterest:\t\t$0.98\n\nNew Balance:\t\t$49.99\n\nMinimum Payment:\t$49.99", Account.processStatement(40, 9.01));
    }
    
    @Test
    public void interest29999()
    {
        assertEquals("\nCS CARD International Statement\n===============================\n\nPrevious Balance:\t$200.00\nAdditional Charges:\t$94.11\nInterest:\t\t$5.88\n\nNew Balance:\t\t$299.99\n\nMinimum Payment:\t$50.00", Account.processStatement(200, 94.11));
    }
}


