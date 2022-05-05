class TwoSum {
    public static void main(String[] args){

    }
}

class Solution{

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }
}
