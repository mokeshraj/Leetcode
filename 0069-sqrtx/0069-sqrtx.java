class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        int res=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<=x/mid){
                s=mid+1;
                res=mid;
            }else{
                e=mid-1;
            }
        }
        return res;
    }
}