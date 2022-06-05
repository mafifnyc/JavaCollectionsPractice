import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> studentID = new HashMap<>();
        studentID.put(1001, "John");
        studentID.put(1002,"Ron");
        studentID.put(1003,"Steve");
        studentID.put(1004,"Mark");
        studentID.put(1005,"Leo");
        studentID.put(1006,"Jamie");
        System.out.println(studentID);

//        System.out.println(studentID.size());

//        HashMap<Integer, String> newStudentID = new HashMap<>();
//        newStudentID.put(1007,"Rod");
//        newStudentID.put(1008,"Frank");
//        newStudentID.put(1009,"Mary");
//        newStudentID.put(1010,"Anna");
//        newStudentID.put(1011,"Sasha");
//        newStudentID.put(1012,"Vicki");
//        System.out.println(newStudentID);
//
//        newStudentID.putAll(studentID);
//        System.out.println(newStudentID);
//        newStudentID.clear();
//        System.out.println(newStudentID);

//        System.out.println(studentID.isEmpty());

//        HashMap<Integer, String> cloneStudentID = new HashMap<>();
//        cloneStudentID = (HashMap<Integer, String>)studentID.clone();
//        System.out.println(cloneStudentID);
//        System.out.println(studentID.values());

//        System.out.println(studentID.containsKey(1002));
//        System.out.println(studentID.containsValue("Steve"));

//        Set studentSet = studentID.entrySet();
//        System.out.println(studentSet);

//        System.out.println(studentID.get(1003));

//        Set studentSet = studentID.keySet();
//        System.out.println(studentSet);

        System.out.println(studentID.values());

        System.out.println(studentID);
    }
}
