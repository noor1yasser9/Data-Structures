// Using Stack

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:
  // Open brackets must be closed by the same type of brackets.
  // Open brackets must be closed in the correct order.
 
// Example 1:
  // Input: s = "()"
  // Output: true

// Example 2:
  // Input: s = "()[]{}"
  // Output: true
  
// Example 3:
  // Input: s = "(]"
  // Output: false
  
// Example 4:
  // Input: s = "([)]"
  // Output: false
  
// Example 5:
  // Input: s = "{[]}"
  // Output: true

// Constraints:
  // 1 <= s.length <= 104
  // s consists of parentheses only '()[]{}'.


#include <iostream>
#include <stack>

using namespace std;

bool arePair(char open, char close){
    return (open=='('&&close==')')||
     (open=='{'&&close=='}')||
      (open=='['&&close==']');
}

bool areBalanced(string exp){
    stack<char>s;
    for(size_t i=0; i<exp.length();i++){
        if(exp[i]=='('||exp[i]=='{'||exp[i]=='['){
            s.push(exp[i]);
        }else if(exp[i]==')'||exp[i]=='}'||exp[i]==']'){
            if(s.empty() || !arePair(s.top(),exp[i])){
                return false;
            }
            s.pop();
        }
    }
    
    return s.empty();
}



int main()
{
        string  expression = "({}{}{}[]()){()}";
        cout << "Enter an Expression\n";
        if(areBalanced(expression))
          cout << "Balanced";
        else 
          cout << "Not Balanced";
          
   return 0;
}


// JAVA CODE
// class Solution {
//     public boolean isValid(String s) {
//         char[] chars = s.toCharArray();
//         Stack<Character> stack = new Stack<Character>();
//         for(int i=0; i<chars.length; i++){
//             char type = chars[i];
//             if(type == '['||type=='{'||type=='(') stack.push(type);
//             if((type == ']'||type=='}'||type==')')){
//                 if(stack.isEmpty())return false;
//                 char typePop=stack.pop(); 
//                 if((typePop == '(' &&  type !=')') || (typePop == '{' &&  type!='}')||(typePop == '[' &&  type !=']') ){
//                     return false; 
//                 }
//             }
//         } 
//         return !stack.isEmpty()?false:true;
//     }
// }


