import java.util.Arrays;


class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        return A.length < 3 ? 0 : A[A.length-3] * A[1] * A[2];
    }
}