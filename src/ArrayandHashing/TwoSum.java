package ArrayandHashing;

import java.util.HashMap;

public class TwoSum {

    public static void Brute(int[] nums,int target) {
        //Using Two Loop

        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i]+nums[j]==target){
                    System.out.println(nums[i]+" "+nums[j]);
                    return;
                }
            }
        }
    }

    public static void Better(int[] nums,int target) {
        int start = 0,end = nums.length-1;
        while (start<end){
            int sum = nums[start]+nums[end];
            if(sum==target){
                System.out.println(nums[start]+" "+nums[end]);
                return;
            } else if (sum>target) {
                end--;
            }else {
                start++;
            }
        }
    }

    public static void Optimal(int[] nums,int target) {
        //Using hashmap
        HashMap<Integer,Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target-nums[i];
            if (indices.containsKey(diff) && indices.get(diff)!=i){
                System.out.println(i+" "+ indices.get(diff));
                return;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;

        Brute(nums,target);
        Better(nums,target);
        Optimal(nums,target);
    }
}
