//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])<=nums.length)
            {
                nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
            }
        }

        for (int i=0;i<nums.length;i++)
        {
            if(nums[i] >0) ans.add(i+1);
        }

        return ans;

    }
    
}
