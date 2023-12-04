import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<String[]> avoid = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String a = scanner.next();
            String b = scanner.next();
            avoid.add(new String[]{"$" + a + "$", "$" + b + "$"});
        }
        List<Integer> lis = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            lis.add(i);
        }
        List<List<Integer>> ways = new ArrayList<>();
        powerset(lis, ways, new ArrayList<>(), 0);
        List<String> possible = new ArrayList<>();
        for (List<Integer> way : ways) {
            String wayStr = "$" + String.join("$", way.stream().map(Object::toString).toArray(String[]::new)) + "$";
            possible.add(wayStr);
        }
        Map<String, Integer> possibleMap = new HashMap<>();
        for (String i : possible) {
            possibleMap.put(i, 1);
        }
        for (String[] i : avoid) {
            for (String j : possible) {
                if (j.contains(i[0]) && j.contains(i[1])) {
                    possibleMap.put(j, 0);
                }
            }
        }
        int sum = 0;
        for (int value : possibleMap.values()) {
            sum += value;
        }
        System.out.println(sum);
    }

    private static void powerset(List<Integer> seq, List<List<Integer>> result, List<Integer> current, int index) {
        if (index >= seq.size()) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(seq.get(index));
        powerset(seq, result, current, index + 1);
        current.remove(current.size() - 1);
        powerset(seq, result, current, index + 1);
    }
}