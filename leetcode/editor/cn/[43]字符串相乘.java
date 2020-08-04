//给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。 
//
// 示例 1: 
//
// 输入: num1 = "2", num2 = "3"
//输出: "6" 
//
// 示例 2: 
//
// 输入: num1 = "123", num2 = "456"
//输出: "56088" 
//
// 说明： 
//
// 
// num1 和 num2 的长度小于110。 
// num1 和 num2 只包含数字 0-9。 
// num1 和 num2 均不以零开头，除非是数字 0 本身。 
// 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。 
// 
// Related Topics 数学 字符串 
// 👍 405 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        // 假设lenA > lenB
        int lenA = num1.length();
        int lenB = num2.length();
        List<String> list= new LinkedList<>();
        for(int i = 0 ;i <lenB ; i++){
            int idxNum = (num2.charAt(i) - '0' );
            list.add(multi(num1 , idxNum, lenB - 1 - i));
        }
        String res = "0";
        for(String s : list){
            res = plus(s,res);
        }
        return res;
    }

    public String multi(String num, int x, int cnt){
        int add = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = num.length() - 1 ;i>=0 ; i--){
            int a = num.charAt(i) - '0';
            sb.append( (a * x + add) % 10);
            add = (a * x + add) /10;
        }
        String tail = "";
        for(int i = 0;i < cnt;i++){
            tail = tail + "0";
        }

        String res = sb.reverse().toString() + tail;
        if(add != 0){
            res = add + res;
        }
        return res;
    }

    public String plus(String num1, String num2){
        int add = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i <= Math.max(num1.length() - 1 ,num2.length() - 1) ; i++){
            int a = i > num1.length() - 1 ? 0 : num1.charAt(num1.length() -1 - i) - '0';
            int b = i > num2.length() - 1 ? 0 : num2.charAt(num2.length() -1 - i) - '0';
            sb.append( ( a + b + add) % 10);
            add = (a + b + add) / 10;
        }
        if(add != 0){
            sb.append(add);
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
