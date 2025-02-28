class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // kadanes algo 
        int max_sum=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max_sum=Math.max(max_sum,sum);
            if(sum<0)
                sum=0;
        }
        return max_sum;
    }
}