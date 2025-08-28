package Assignment;

import java.util.*;
public class ChecksortedArray {
    public static boolean checkPossibility(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;


            }
            if(nums[nums.length-2]<nums[nums.length]) count++;
            if(count>1) return false;
        }
        System.out.println(Arrays.toString(nums));
        return true;
//        {4,2,3}
    }

    public static void main(String[] args) {

        int nums[]={4,2,3};
//        System.out.println(checkPossibility(nums));
        System.out.println(checkPossibility(nums));
        System.out.println(Arrays.toString(nums));
    }
}
