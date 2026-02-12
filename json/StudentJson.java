import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class StudentJson {
    public static void main(String[] args) {

        JsonObject student = new JsonObject();
        student.addProperty("name", "Rahul");
        student.addProperty("age", 20);

        JsonArray subjects = new JsonArray();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        student.add("subjects", subjects);

        System.out.println(student.toString());
    }
}
