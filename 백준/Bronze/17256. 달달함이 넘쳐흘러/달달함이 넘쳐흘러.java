import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<Integer> listA = Stream.of(br.readLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> listC = Stream.of(br.readLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> listB = new ArrayList<>();
        listB.add(listC.get(0) - listA.get(2));
        listB.add(listC.get(1) / listA.get(1));
        listB.add(listC.get(2) - listA.get(0));

        StringBuilder sb = new StringBuilder();
        listB.stream().forEach(x -> sb.append(x).append(" "));
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
        br.close();
    }
}