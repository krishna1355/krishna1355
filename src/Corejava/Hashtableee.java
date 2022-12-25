package Corejava;

import java.util.Hashtable;
import java.util.Map;

public class Hashtableee {
	 public static void main(String args[])
	   {
	       //----------HashTable Declaration -------------------------
	       Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
	       ht.put("Aman",3);
	       ht.put("Nandini",2);
	       ht.put("Rohan",10);
	       System.out.println("-------------HashTable Data--------------");
	       for (Map.Entry m:ht.entrySet()) {
	           System.out.println(m.getKey()+" "+m.getValue());
	       }
}
}