class Solution {
    public int[] searchRange(int[] nums, int tar) {
        int[] res =new int[2];
        res[0]=first(nums,tar);
        if(res[0]==-1)  return new int[]{-1,-1};
        res[1]=last(nums,tar);
        return res;
    }
    public int first(int[] nums, int tar){
        int low=0,high=nums.length-1,first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==tar){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<tar)  low=mid+1;
            else    high=mid-1;
        }
        return first;
    }
    public int last(int[] nums, int tar){
        int low=0,high=nums.length-1,last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==tar){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<tar)  low=mid+1;
            else high=mid-1;
        }
        return last;
    }
}