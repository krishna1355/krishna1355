package Corejava;

public class Reversestring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String("i like this program very much");
char[] ch=str.toCharArray();
for(int i=ch.length-1;i>=0;i--) {
	System.out.print(ch[i]);
}
	}

}
