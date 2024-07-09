class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int temp=x;
        while(x>0)
        {
            ans=ans*10+x%10;
            x/=10;
        }if(temp==ans)
        return true;
       
 return false;
    }
   
}