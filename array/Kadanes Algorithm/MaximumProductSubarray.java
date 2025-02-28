public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
         
         int maxProd = nums[0], minProd = nums[0], result = nums[0];
         
         for (int i = 1; i < nums.length; i++) {
             if (nums[i] < 0) {
                 int temp = maxProd;
                 maxProd = minProd;
                 minProd = temp;
             }
             
             maxProd = Math.max(nums[i], nums[i] * maxProd);
             minProd = Math.min(nums[i], nums[i] * minProd);
             
             result = Math.max(result, maxProd);
         }
         
         return result;
     }
}
