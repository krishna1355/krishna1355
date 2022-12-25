package Com.Ecommerce.Utils;

public class Java {
	  public static void main(String[] args) {

	       String str = "Hello12334World54611";
	       String str1 = numberString(str);
	       char[] arr = str1.toCharArray();
	       int n =arr.length;
	       
	       countFreq(arr, n); //count of frequency of number
	       System.out.println(" ");
	       
	   }
	       public static String numberString(String str) {
	       
	       String numberString = "";
	       for(int i = 0 ; i<str.length(); i++) {
	           
	           if(str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9'  )
	           {
	               numberString = numberString + str.charAt(i);
	           }
	       }
	       return numberString;
	   }
	       
	       static void countFreq(char[] arr, int n) {
	           boolean visited[] = new boolean [n];
	           for(int i = 0; i< n ; i++) {
	               if(visited[i] == true) {
	                   continue;
	               }
	               int count = 1;
	               for (int j = i + 1; j < n; j++) {
	                   if (arr[i] == arr[j]) {
	                       visited[j] = true;
	                       count++;
	                   }
	               }
	               System.out.println(arr[i] + " " + count);
	           }
	       }

}
