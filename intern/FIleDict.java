import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FIleDict {
    public static void main(String art[]){
   
        try {
            File file=new File("F:\\file.txt");
            Scanner reader=new Scanner(file);
            HashMap<String, Integer> map=new HashMap<>();

            while(reader.hasNext()){
                String word=reader.next();
                Integer num =map.get(word);
                if(num==null){
                    map.put(word,1);
                }else{
                    map.put(word,num+1);
                }
            }
            System.out.println(map);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}
