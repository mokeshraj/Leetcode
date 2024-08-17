class Solution {
    public String largestNumber(int[] nums) {
        List<String> arr= new ArrayList<>();
        for(int num:nums)
        {
             arr.add(String.valueOf(num));
        }
        arr.sort((a, b) ->(b+a).compareTo(a+b));
        if("0".equals(arr.get(0)))
        {
            return "0";
        }
        return String.join("",arr);
        
    }
}