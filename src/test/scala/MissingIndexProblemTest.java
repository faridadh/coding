import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIndexProblemTest {
    private MissingValueProblem testing = new MissingValueProblem();

    @Test
    public void testSolveLastMissing(){
        int[] a = new int[] {1,2,3};
        int result = testing.solve(a);

        assertEquals(4, result);
    }

    @Test
    public void testSolveEmpty_shouldReturnOne(){
        assertEquals( 1, testing.solve( new int[0]));
    }

    @Test
    public void testSolveFirstMissing_shouldReturnOne(){
        assertEquals( 1, testing.solve(new int[] { 2, 4, 3}));
    }
}
