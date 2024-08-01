class Solution {
    public int diagonalPrime(int[][] nums) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int one=nums[i][i];
            int two=nums[i][nums.length-i-1];
            li.add(one);
            li.add(two);
        }
        Collections.sort(li);
        for(int i=li.size()-1;i>=0;i--)
        {
            if(pr(li.get(i)))
            {
                return li.get(i);
            }
        }
        return 0;
    }
    public static boolean pr(int n){
        if(n==1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}