import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void countFrequency(int[] data) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : data) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 10, 30, 20, 20, 10, 40};
        countFrequency(data);
    }
}
