/*

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

*/

class Solution {
    public int[] plusOne(int[] digits) {
         
//         cause a problem in [9,8,7,6,5,4,3,2,1,0]
//         int num = 0;  
//         for (int digit : digits) {
//             num = 10*num + digit;
//         } 
//         int n=num+1; 
//         String str=String.valueOf(n); 
//         int arr[]=new int[str.length()];  
//         for(int i=0;i<str.length();i++){  
//             arr[i]=str.charAt(i)-'0';  
//         }  
//         return arr;  
     
            boolean carry = true;

            for (int i = digits.length - 1; carry && i >= 0; i--) {
                carry = digits[i] == 9;
                digits[i] = carry ? 0 : digits[i] + 1;
            }

            if (carry) {
                int[] tmp = new int[digits.length + 1];
                tmp[0] = 1;
                System.arraycopy(digits, 0, tmp, 1, digits.length);
                digits = tmp;
            }

            return digits;
    }
}


