package Corejava;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String[] ch="i like this program very much".split("");
String ans="";
for(int i=ch.length-1;i>=0;i--) {
	ans+=ch[i]+"";
}
System.out.println(ans.substring(0,ans.length()-1));

	}

}
