class Solution {
    public String largestNumber(int[] nums) {
        List<String> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
             arr.add(String.valueOf(nums[i]));
        }
        arr.sort((a, b) ->(b+a).compareTo(a+b));
        if("0".equals(arr.get(0)))
        {
            return "0";
        }
        return String.join("",arr);
        
    }
}