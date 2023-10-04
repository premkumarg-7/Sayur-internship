//program 2
//Word Frequency Counter (Using Java) 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class File_reader {
public static void main(String[] args) {

	try {
		BufferedReader reader = new BufferedReader(new FileReader("E:\\intern\\essay_file.txt"));
		String line;
		Map<String, Integer> wordFrequency =new HashMap<>();
		
		while((line=reader.readLine())!=null) {
			String[] words=line.split("\\s+");
			for(String word:words) {
				word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
				wordFrequency.put(word, wordFrequency.getOrDefault(word, 0)+1);
			}
		}
		reader.close();
		
		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
			
		}
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}


/*Output:
: 1
spectral: 1
till: 1
polari: 1
lander: 2
launched: 1
sriharikota: 1
payload: 1
from: 2
orbit: 2
has: 1
lvm: 1
surface: 1
shape: 1
in: 1
planet: 1
module: 2
propulsion: 2
is: 1
it: 2
followon: 1
habitable: 1
mission: 1
roving: 1
safe: 1
demonstrate: 1
carry: 1
rover: 2
study: 1
be: 1
configuration: 2
chandrayaan: 2
capability: 1
sdsc: 1
and: 4
of: 3
by: 1
spectropolarimetry: 1
lunar: 3
on: 1
measurements: 1
a: 1
km: 1
will: 2
the: 6
landing: 1
shar: 1
metric: 1
earth: 2
consists: 1
endtoend: 1
to: 3
*/