class Solution {
    public int findDuplicate(int[] nums) {
      int dup=-1;
    for(int i=0;i<nums.length;i++) {
    int curr=Math.abs(nums[i]);
    if(nums[curr]<0) {
    dup=curr;
        break;
    }
        nums[curr]*=-1;
    }
    for(int i=0;i<nums.length;i++)
        nums[i]=Math.abs(nums[i]);
        return dup;
    }
}