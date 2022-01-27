
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        
        HashMap<String, String> map = new HashMap<>();
        
        for (int i = 0; i < 100; i++) {
            map.add("" + i, "" + i*i);
        }

        System.out.println(map.get("2"));
    }

}
