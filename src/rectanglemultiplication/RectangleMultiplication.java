
package rectanglemultiplication;
import java.util.Scanner;   // Input from the user

public class RectangleMultiplication {
  public static void main(String[] args) 
    {
        //array for two numbers are defined
        int x[]=new int[20];
        int y[]=new int[20];

        Scanner scanner=new Scanner(System.in);
        System.out.println("Number1");
        // defined a integer number1 which is the first number from the user
        int num1=scanner.nextInt();
        
       //Intializing length of two numbers
        int n1=0,n2=0;
        int p=0,q=0;
         
        //Loop is created to enter the first number in an array 
        while(num1>0)
         
        {
            x[p]=num1%10;
            num1=num1/10;
            n1++;
            p++;
         }
  
        
        System.out.println("Numbers in array1 are");
   

        
  //Reverse the array x[]
        for(int i = 0; i < n1 / 2; i++)
        
        {   
            int t = x[i];
            x[i] = x[n1 - i - 1];
            x[n1 - i - 1] = t;
        }
        
       //print the array x[]
        
        for(int i=0;i<n1;i++)
         
        {
             System.out.println(x[i]); 
         }

  
        System.out.println("Number2");
  
// defined the second integer number       
        int num2=scanner.nextInt();
     // Array is created for the second number 
        while(num2>0)
         {
            y[q]=num2%10;
            num2=num2/10;
            n2++;
            q++;
         }
        
        System.out.println("Numbers in array2 are");

          //Similar loop to reverse array y[] 

        for(int i = 0; i < n2 / 2; i++)
        {   
           int t1 = y[i];
           y[i] = y[n2 - i - 1];
           y[n2 - i - 1] = t1;
        }

      
       for(int i=0; i<n1; i++)
         
        {
             System.out.println(y[i]); 
         }
        
        
       
       
       // The diagonal matrix is created
       int RectangleMatrix_Length = n1+n2;
		
        int[] RectMatrix = new int[RectangleMatrix_Length];
		
        for (int i = 0; i < n1; i++) {
			
            for (int j = 0; j < n2; j++) {
				
                RectMatrix[i + j + 1] += (Integer.parseInt(String.valueOf(x[i]))*Integer.parseInt(String.valueOf(y[j]))) % 10;
				
                RectMatrix[i + j] += (Integer.parseInt(String.valueOf(x[i]))*Integer.parseInt(String.valueOf(y[j]))) / 10;
			}
		}
		
        int output=0;
	// Adding numbers along the diagonal	
        for (int i = 0; i <RectangleMatrix_Length; i++) {
			
            int index=RectangleMatrix_Length-i-1;
			
            while(index>=1)
			
            {
				
                RectMatrix[i]=RectMatrix[i]*10;
				
                index--;
			
            }
			
            output+=RectMatrix[i];
		
        }
		
        System.out.println("Output is "+output);
    
    }
   

}