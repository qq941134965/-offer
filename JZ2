import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param s string字符串 
     * @return string字符串
     */
    /**
    不直接用String 和 + 来拼接，因为底层每次都会创建StringBuilder，
    用StringBuilder更加高效
    不要忘记判断空串的情况
    */
    public String replaceSpace (String s) {
        // write code here
        StringBuilder result = new StringBuilder();
        char targetChar = ' ';
        int length = s.length();
        
        if(length == 0) return s;
        
        for(int i = 0; i < length; i++){
            char a = s.charAt(i);
            if(a == targetChar)
                result.append("%20");
            else result.append(a);
                
        }
        return result.toString();
        
        
    }
}
