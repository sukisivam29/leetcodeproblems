class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lhb = height[l]; int rhb = height[height.length-1]; int res=0;
        while(l<=r){
            if(lhb<=rhb){
                if(height[l]>=lhb){
                lhb=height[l];
                }
                else{
                    res+=lhb-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rhb){
                    rhb=height[r];
                }
                else{
                    res+=rhb-height[r];
                }
                r--;
            }
        }
        return res;
    }
}