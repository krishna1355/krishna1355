package Corejava;

public class Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,row=6;
for(i=0;i<row;i++) {
	for(j=row-i;j>1;j--) {
		System.out.print(" ");   
	}   
	//inner loop for columns  
	for (j=0; j<=i; j++ )   
	{   
	//prints star      
	System.out.print("* ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}
}
	}


