class Solution {
    public int[] runningSum(int[] nums) {
        //create new array runningSum
        int runningSum[] = new int[nums.length];
        //initilize first element of runningSum array with first element of nums array
        runningSum[0] = nums[0]; 
        
        // run loop form second element 
        for(int i=1;i<nums.length;i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        return runningSum;
    }
}