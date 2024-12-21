class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int more=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
                more=Math.max(more,count);
            }
            else    count=0;
        }
        return more;
    }
}