	public static void main(String[] args) {
	  /*
       odd,event,prime
       |9,4,2|
       |15,6,3|
       |21,8,5|
       */
       
       int []arr = {4,5,3,33,44,55,66,77,88,99,98,87,89,76,54,43,32,21,97,12,311};
       int [][]arr2 = new int[6][3];

       for(int i=0; i<=arr2.length-1; i++){
               for(int ii=0; ii<arr.length; ii++){
                  if( arr[ii] == 0)
                  continue; 
                   if(primeCheck(arr[ii]) && arr2[i][0] == 0){
                     arr2[i][0] =  arr[ii];
                      arr[ii] = 0;}
                    else if(arr[ii] % 2 == 0 && arr2[i][1] ==0){
                    arr2[i][1] = arr[ii];
                     arr[ii] = 0;
                    }
                    else if(!primeCheck(arr[ii]) && !(arr[ii] % 2 == 0) && arr2[i][2] ==0){
                    arr2[i][2] = arr[ii];
                     arr[ii] = 0;
                    }
                
                  if( arr2[i][0] != 0 &&  arr2[i][1] != 0 &&  arr2[i][2] !=0){
                      break;
                  }
                  
               }
       }
       
       for(int i=0; i<=arr2.length-1; i++){
            System.out.print("|");
           for(int j=0; j<=arr2[i].length-1; j++){
               System.out.print(arr2[i][j]);
               if(j!=arr2[i].length-1){
                 System.out.print(",");  
               }
           }
           System.out.println("|");
       }

	}
	

	private static boolean primeCheck(int value){
    if(value < 2) return true;
    for(int i = 2; i <= value / 2; i++) if(value % i == 0) return false;
    return true;
	}
}
