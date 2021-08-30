import java.util.*;
class classlist{
	public static void main(String[] args)
	{
		Map<String, String> classlist = new HashMap<String,String>();
		classlist.put("Bob", "A");
		classlist.put("mary", "C");
		classlist.put("Sarah", "B");
		classlist.put("Philip", "A");
		classlist.put("Grey", "F");
		
		Iterator<Map.Entry<String, String>> entries = classlist.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		}
		
	}
