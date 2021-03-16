import java.util.HashMap;

public class UsingMap {

    public static void main(String[] args) {

        HashMap<String, String> tele_dir = new HashMap<String, String>();

        tele_dir.put("Mr. X", "999999");
        tele_dir.put("Mr. Sharma", "76254");
        tele_dir.put("Mr. Leon Kennedy", "45678");

        System.out.println(tele_dir.get("Mr. Leon Kennedy"));

        for (String key : tele_dir.keySet()) {
            System.out.println(key);
        }
        for (String value : tele_dir.values()) {
            System.out.println(value);
        }

    }
}
