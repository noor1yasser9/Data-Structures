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


