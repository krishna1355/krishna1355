package Corejava;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,row=6;
for (i=0; i<row; i++)   
{  
    
for (j=2*(row-i); j>=0; j--)         
{  
     
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
    
System.out.print("* ");   
}   
  
System.out.println();   
}   
	
	}
	}

