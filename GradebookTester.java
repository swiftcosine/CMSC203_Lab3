package gradebook;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradebookTester {

    // Declare GradeBook objects outside of any methods
    private GradeBook g1;
    private GradeBook g2;

    @Before
    public void setUp() {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        g1.addScore(50);
        g1.addScore(75);
        g2.addScore(60);
        g2.addScore(85);
    }

    @After
    public void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore() {
        System.out.println("Testing addScore: " + g1.toString());
        assertTrue(g1.toString().equals("50.0 75.0"));
        assertEquals(2, g1.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(125, g1.sum(), 0.001);
    }

    @Test
    public void testMinimum() {
        assertEquals(50, g1.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(75, g1.finalScore(), 0.001);
    }
}
