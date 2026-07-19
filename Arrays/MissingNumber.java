class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int csum = (n*(1+n))/2;
        int asum = 0;

        for(int i=0; i<n; i++){
            asum += nums[i];
        }

        return csum-asum;
    }
}