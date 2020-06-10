package TasksForTraining;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(10, 1);
        map.put(20, 1);
        map.put(30, 2);
        map.put(40, 1);
        map.put(50, 2);

//        System.out.println(map.get(50));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
            }
        }
    }


}
