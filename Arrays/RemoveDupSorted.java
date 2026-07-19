// Remove Duplicates from Sorted Array

class Solution {
    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        int j=0;

        for(int i=0; i<n-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[n-1];
        return j;
    }
}