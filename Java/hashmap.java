//hashmap
import java.util.HashMap;
import java.util.Map;
class mapping{
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        System.out.println("HashMap: "+map);
        System.out.println("Get value for key 3: "+map.get(3));
        System.out.println("Contains key 4? "+map.containsKey(4));
        System.out.println("Contains value 'six'? "+map.containsValue("six"));
        map.remove(2);
        System.out.println("After removing key 2: "+map);
        System.out.println("Iterating over keys and values:");
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }
}