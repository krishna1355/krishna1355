import java.util.HashMap;
import java.util.Map;

public class Hashmapppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String ,Integer>hm=new HashMap<>();
hm.put("Sony",30);
hm.put("Ram",330);
hm.put("Ramga",3);
System.out.println("Hashmapdata");
for (Map.Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+""+m.getValue());
}

	}

}
