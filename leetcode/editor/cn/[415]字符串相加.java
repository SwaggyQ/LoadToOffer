//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。 
//
// 
//
// 提示： 
//
// 
// num1 和num2 的长度都小于 5100 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式 
// 
// Related Topics 字符串 
// 👍 238 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        char[] onec = num1.toCharArray();
        char[] twoc = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int add = 0;
        for(int i = 0;i <= Math.max(onec.length -1 ,twoc.length -1 );i++){
            int a = i > onec.length - 1 ? 0 : onec[onec.length -1 - i] - '0';
            int b = i > twoc.length - 1 ? 0 : twoc[twoc.length -1 - i] - '0';
            sb.append( (a+b + add) % 10);
            add = (a + b + add) / 10;

        }
        if(add != 0){
            sb.append(add);
        }
        return sb.reverse().toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)
