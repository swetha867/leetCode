package leetcode;

class GetNoZeroIntegers {
    public static int[] getNoZeroIntegers(int n) {
        
        int a=1;
        while(!containsNoZero(a) ||! containsNoZero(n-a)){
            a++;
        }
        return new int[]{a,n-a};
    }
     private static boolean containsNoZero(int n){
        while(n> 0){
            if(n%10 ==0)
                return false;
            n= n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println( getNoZeroIntegers(999)        );
    }
}