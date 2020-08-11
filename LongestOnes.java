public class LongestOnes {
    public int longestOnes(int[] A, int K) {
        int ws = 0, we;
        for (we = 0; we< A.length; ++we) {
            if (A[we] == 0) K--;
            if (K < 0 && A[ws++] == 0) K++;
        }
        return we - ws;
    }
}