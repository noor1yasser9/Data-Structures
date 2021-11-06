/********************************************************************************************
********************************************************************************************
😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄
*****************😄😄😄😄The question was resolved in two hours😄😄😄😄*****************
😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄😄
********************************************************************************************
********************************************************************************************/

// 43. Multiply Strings
// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

// Example 1:
  // Input: num1 = "2", num2 = "3"
  // Output: "6"

// Example 2:
  // Input: num1 = "123", num2 = "456"
  // Output: "56088"

// Constraints:
  // 1 <= num1.length, num2.length <= 200
  // num1 and num2 consist of digits only.
  // Both num1 and num2 do not contain any leading zero, except the number 0 itself.
  
// Question Link
// https://leetcode.com/problems/multiply-strings/

class Solution {
    public String multiply(String num1, String num2) {
        
         char[] chNum1 = num1.toCharArray();
         char[] chNum2 = num2.toCharArray();
        
         if (chNum1.length == 0 || chNum2.length == 0)
             return "0";
 
         int result[] = new int[chNum1.length + chNum2.length];

        int iN1 = 0,
        iN2=0,
        nu1=0,
        nu2=0,
        sum=0;
        
         for (int i = chNum1.length - 1; i >= 0; i--){
             nu1 = chNum1[i] - '0';
             iN2 = 0;
             sum=0;
             for (int j = chNum2.length - 1; j >= 0; j--){
                nu2 = chNum2[j] - '0';
                 sum = nu1 * nu2 + result[iN1 + iN2] + sum / 10;
                 result[iN1 + iN2] = sum % 10;                 
                 iN2++;
             }
             if (sum / 10 > 0)
                 result[iN1 + iN2] += sum / 10;
             iN1++;
         }
       
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0)
            i--;
        if (i == -1)
            return "0";
     
        String s = "";  
        StringBuilder sb = new StringBuilder(Arrays.toString(result).replaceAll("\\[|\\]|,|\\s", ""));
        s = sb.reverse().toString();
        if(s.charAt(0)=='0')
            s = s.substring(1,s.length());
             
        return s;
        
    }
    

}
