public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = s.length(), length = 0;
        while (len > 0) {
            len--;
            // we're in the middle of the last word
            if (s.charAt(len) != ' ') {
                length++;
            }
            // here is the end of last word
            else if (length > 0) {
                return length;
            }
        }
        return length;
    }
}