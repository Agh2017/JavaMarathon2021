package day19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.Entry;

import static java.util.Comparator.reverseOrder;


public class Task1 {

    private static final int COUNT = 100;

    public static void main(String[] args) throws FileNotFoundException {
        String path = "src\\main\\resources\\dushi.txt";
        FileReader fr = new FileReader(path);

        Scanner scanner = new Scanner(fr);
        scanner.useDelimiter("[ .,…«»“:;(<>)?!\"\\s–]+");

        final Map<String, Integer> bookMap = new HashMap<>();

        int count = 1;

        while (scanner.hasNext()) {

            String scannerValue = scanner.next().toLowerCase(); // coercion
            if (!bookMap.containsKey(scannerValue)) {
                bookMap.put(scannerValue, count); //add only new words
            } else {
                int currentCount = bookMap.get(scannerValue);
                bookMap.replace(scannerValue, currentCount, currentCount + 1); //count the same words
            }

        }
        //if (bookMap.containsKey("чичиков")) System.out.println("Чичиков =" + bookMap.get("чичиков")); // Чичиков = 608
        System.out.println("bookMap.size()  =" + bookMap.size());

        Map<String, Integer> sortedMap = bookMap.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, reverseOrder() /*reverse*/))
                .limit(COUNT) /*cut 100*/
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c, vl) -> vl /*sort by value*/, LinkedHashMap::new));
        toString(sortedMap);
    }

    public static void toString(Map<String, Integer> map) {
        for (Entry<String, Integer> entryInner : map.entrySet()) {
            System.out.println(entryInner.getKey() + " : " + entryInner.getValue());
        }
    }
}
