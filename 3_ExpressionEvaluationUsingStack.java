// Expression Evaluation Using Stack 
    // infix
      //1*5*(5+9)/8
    /*
        Disadvantages infix 
        -use parentheses   
        -need precedence 
    */

    // postfix => suffix or reverse polish notation
        //1*5*(5 9 +)/8
           //1 5 * *(5 9 +)/8
           //1 5 * (5 9 +) * 8 /
           //1 5 * 5 9 + * 8 /
      //5/5+2-1*9
        //5 5 / +2-1*9
        //5 5 / +2 - 1 9 *
        // 5 5 / 2 +  1 9 * -
      //(A*B)+(C/D)
        //( A B * ) + ( C D / )
        // A B * + C D /
        // A B * C D / +

    // pretfix => pollis notation
       //1*5*(5 9 +)/8
           // * 1 5  *( + 5 9 )/8
           //* 1 5   * ( + 5 9 )/ 8 
           //* 1 5 + * 5 9 / 8 
      //5/5+2-1*9
        // /5 5  +2-1*9
        // / 5 5  +2 - * 1 9 
        // / 5 5 + 2   *  - 1 9 
      //(A*B)+(C/D)
        //( * A B  ) + ( / C D  )
        // * A B  + / C D 
        //  + * A B / C D 
        
    /*
        Advantage postfix or prefix  
        + Precedence has been conidered 
    */




import java.util.*;

class InFixToPostfix {

    public static void main(String[] args) {
        String expression = "1+2*9";
        String postfix = inFixToPostfix(expression);
        System.out.println(postfix); 
    }

    public static boolean isOperand(char c){
        return (c>='0' && c<='9')
            ||(c>='a' && c<='z')
            ||(c>='A' && c<='Z');
    }
 
    public static boolean isOperator(char c){
        return c=='+'
            || c=='-'
            || c=='*'
            || c=='/'
            || c == '$';
    }
    
    public static boolean hasHigherPrecedence(char op1, char op2){
        int op1Weight = getOperatorWeight(op1);
    	int op2Weight = getOperatorWeight(op2);        
    	if (op1Weight == op2Weight)
            return isRightAssociative(op1);
        return op1Weight > op2Weight ;
    }
    
    public static boolean isRightAssociative(char op){
        return op == '$';
    }
    
    public static int getOperatorWeight(char op){
        switch(op){
            case '-':
            case '+': 
                return 1;
            case '*':
            case '/': 
                return 2;
            case '$':  
                return 3;
            default :
                 return 0;
        }     
    }
    
    public static String inFixToPostfix(String expression){
        Stack<Character> s = new Stack<Character>();
        String postfix = "";
        for(int i =0; i<expression.length(); i++){
            char c =expression.charAt(i);
            if(c==' '||c==',') 
                continue;
            else if (isOperator(c)){
                while(!s.empty() && s.peek() != '(' && hasHigherPrecedence(s.peek(), c)){
                    postfix += s.peek();
    				s.pop();
                }
                s.push(c);
            }else if (isOperand(c))
                postfix += c;
		    else if (c == '(')
                s.push(c);
		    else if (c == ')'){
                while (!s.empty() && s.peek() != '(') {
                    postfix += s.peek();
    				s.pop();
    			}
    			s.pop();
		    }	
        }
        while (!s.empty()) {
            postfix += s.peek();
            s.pop();
        }
	
        return postfix;
    }
       
}

