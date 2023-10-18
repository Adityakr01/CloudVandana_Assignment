import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create a list 
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        
        // Shuffle the list
        Collections.shuffle(list);
        
        // Print the shuffled list
        System.out.println("Shuffled List: " + list);
    }
}
