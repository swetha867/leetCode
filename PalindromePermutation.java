public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[128];
        for(char c:s.toCharArray()){
            map[c]++;
        }
        int count=0;
        for(int key=0;key<map.length && count<=1;key++){
            count+=map[key]%2;
        }
        return count<=1;
        
    }
}