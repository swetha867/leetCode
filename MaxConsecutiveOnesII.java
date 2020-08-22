public class SingleNumber {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0 ,zeroLeft=0 ,zeroRight=0;
        for(int i=0;i<nums.length;i++){
            zeroRight++;
            if(nums[i]==0){
                zeroLeft=zeroRight;
                zeroRight=0;
            }
            max=Math.max(max,zeroLeft+zeroRight);
        }
        return Math.max(max,zeroLeft+zeroRight);
    }
    
}