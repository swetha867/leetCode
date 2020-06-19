package leetcode;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public static void main(String[] args) {
        //Input
        int[] nums= new int[] {2, 7, 11, 15};
        int target=9;



        int[] result= new int[2];
        Map<Integer,Integer> numsMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
                if(numsMap.containsKey(target-nums[i])){
                    result[0]=numsMap.get(target-nums[i]);
                    result[1]=i;
                    break;
                }
                numsMap.put(nums[i], i);

        }
    }
}

