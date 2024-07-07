class Solution {
    public static int removeDuplicates(int[] nums)
    {
        int u=0;
        for(int i=1;i<nums.length;i++){
            if(nums[u]!=nums[i]){
                nums[u+1]=nums[i];
                u++;
            }
        }
        return u+1;
    }
}