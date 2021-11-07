
// 28. Implement strStr()

// Implement strStr().

// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Clarification:

// What should we return when needle is an empty string? This is a great question to ask during an interview.

// For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

// Example 1:
  // Input: haystack = "hello", needle = "ll"
  // Output: 2
  
// Example 2:
  // Input: haystack = "aaaaa", needle = "bba"
  // Output: -1
  
// Example 3:
  // Input: haystack = "", needle = ""
  // Output: 0

// Constraints:
  // 0 <= haystack.length, needle.length <= 5 * 104
  // haystack and needle consist of only lower-case English characters.

// Question Link
// https://leetcode.com/problems/implement-strstr/

class Solution {
    public int strStr(String haystack, String needle) {
        
         if (haystack == null || needle == null)
            return -1;
         
        if (haystack.equals(needle))
            return 0;
        
        
            int i=0,lh = haystack.length() , ln =needle.length();
            for(; i<lh-ln+1 ; i++)
                if(haystack.substring(i,i+ln).equals(needle))
                    return i;
        
            return -1;        
    }
}
