class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] tot=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            tot[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            tot[i+nums1.length]=nums2[i];
        }
        Arrays.sort(tot);
        if(tot.length%2==1) return (float)tot[tot.length/2];
        else    return (float)(tot[tot.length/2]+tot[(tot.length/2)-1])/2;
    }
}