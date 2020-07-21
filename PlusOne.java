class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        for(int i=digits.length-1;i>=0;i--){
              carry=1;
              digits[i]= digits[i]+carry;
            if(digits[i]<=9){
                return digits;
            }
            carry= digits[i]/10;
             digits[i]= digits[i]%10;
            
        }
        if(carry>0){
    //          int[] tempArr = new int[digits.length + 1];
    //          tempArr[0] = carry;
    // System.arraycopy(digits, 0, tempArr, 1, digits.length);
    //         return tempArr;
             int[] newNumber = new int [digits.length+1];
             newNumber[0] = 1;
             return newNumber;
        }
            
        return digits;
    }
}