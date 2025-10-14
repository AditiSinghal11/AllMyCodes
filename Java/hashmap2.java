//merge two hasmap<string,integer> objects.if a key exists in both the maps the program should add their correspoiding values and store the result in the merged map.finally diplay the merged map.
import java.util.Map;
import java.util.HashMap;
public class hashmap2 {
    public static void main(String[] args){
        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("Alice",50);
        map1.put("Bob",60);
        map1.put("Charlie",70);

        HashMap<String,Integer> map2=new HashMap<>();
        map2.put("Ben",40);
        map2.put("Doody",80);
        map2.put("lulu",90);

        HashMap<String,Integer> mergedMap=new HashMap<>();
        for(Map.Entry<String,Integer> entry:map1.entrySet()){
            if(map2.containsKey(entry.getKey())){
                mergedMap.put(entry.getKey(),entry.getValue()+map2.get(entry.getKey()));
            }
            else{
                mergedMap.put(entry.getKey(),entry.getValue());
            }
        }
        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            if(!mergedMap.containsKey(entry.getKey())){
                mergedMap.put(entry.getKey(),entry.getValue());
            }
        }
       

        System.out.println("Merged Map: "+mergedMap);
    }
}


