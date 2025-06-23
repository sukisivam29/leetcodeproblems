class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double d = 0;
        int ind =0;
        int[] arr = new int[(nums1.length)+(nums2.length)];
        for(int i=0;i<nums1.length;i++){
            arr[ind]=nums1[i];
            ind++;
        }
        
        for(int i=0;i<nums2.length;i++){
            arr[ind]=nums2[i];
            ind++;
        }
        Arrays.sort(arr);
        double med = 0;
        if(arr.length%2==0){
            med = (arr[(arr.length/2)-1]+arr[(arr.length/2)])/2.0;
            return med;
        }
        d=arr[arr.length/2];
        return d;
    }
}