/**
 * 
 */

package Day3_Excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class filess {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		try {
			File fil = new File("F:\\file2.txt");
			Scanner reader = new Scanner(fil);
			
			while(reader.hasNext()) {
				String currword=reader.next();
				
				if(currword.length()==4) {
					Integer num=hm.get(currword);
					if(num==null) {
						hm.put(currword, 1);
					}else {
						hm.put(currword, num+1);
					}
				}	
			}
			reader.close();
			
			Set s=hm.entrySet(); //make the hashmap to set 
			Iterator i=s.iterator(); //using iterator to make the set to iterate
			while(i.hasNext()) { //get the set value till end of the set
				Map.Entry map = (Map.Entry) i.next(); //type cast set.set to Entry(for seperate key and values for access)
				
				System.out.println(map.getKey()+" is a length 4 word and its ocuur on "+map.getValue()+" times");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}