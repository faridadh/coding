import org.junit.Test;

public class CoinsChangeJavaTest {
    private CoinsChangeJava testingObject = new CoinsChangeJava();

    @Test
    public  void testSolution(){
        int result = testingObject.solution(new int[]{3,7,405,436},8839);

        System.out.println(result);
    }
}
