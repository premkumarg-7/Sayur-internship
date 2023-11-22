import java.util.HashMap;

public class wordcount {
    public static void main(String args[]){
        String str="a a a b c a a d d e d d a b a a";

        if(str==null || str.isEmpty()){
            System.out.println("Give some strings !");
        }
        HashMap<String,Integer> dict  = new HashMap<>();
        String[] words= str.split(" ");
        for(String word : words){
            Integer integer = dict.get(word);
            if(integer==null){
                dict.put(word,1);
            }
            else{
                dict.put(word ,integer+1);
            }
        }
        System.out.println(dict);
    }
}
