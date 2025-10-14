import java.util.HashMap;
import java.util.Map;
public class hashmap1 {
    //you are given a map<string, integer> containing student names as keys and their marks as values . determine the student who has scored the highest marks ans display both the stdent's name and the coreresponding mark.
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 88);
        studentMarks.put("David", 95);
        studentMarks.put("Eve", 90);

        String topStudent = "";
        int highestMark = -1;

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > highestMark) {
                highestMark = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Top Student: " + topStudent + " with marks: " + highestMark);
    }
}
