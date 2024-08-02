class Solution {
    public int[] plusOne(int[] digits) {
        int d=digits.length-1;
        while(digits[d]==9){
            if(d==0){
                int[] n=new int[digits.length+1];
                n[0]=1;
                return n;
            }
            digits[d]=0;
            d--;
        }
        digits[d]++;
        return digits;
    }
}