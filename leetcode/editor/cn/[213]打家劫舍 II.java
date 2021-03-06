//你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋
//装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。 
//
// 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。 
//
// 示例 1: 
//
// 输入: [2,3,2]
//输出: 3
//解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
// 
//
// 示例 2: 
//
// 输入: [1,2,3,1]
//输出: 4
//解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
//     偷窃到的最高金额 = 1 + 3 = 4 。 
// Related Topics 动态规划 
// 👍 340 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp1 = new int[nums.length + 1];
        int[] dp2 = new int[nums.length + 1];
        dp1[0] = dp1[1] = dp2[0] = dp2[1] = 0;
        for(int i =0;i<nums.length - 1;i++){
            int index = i + 2;
            dp1[index] = Math.max(dp1[index - 1],dp1[index - 2] + nums[i]);
        }

        for(int i =1;i<nums.length;i++){
            int index = i + 1;
            dp2[index] = Math.max(dp2[index - 1],dp2[index - 2] + nums[i]);
        }

        return Math.max(dp1[nums.length],dp2[nums.length]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
