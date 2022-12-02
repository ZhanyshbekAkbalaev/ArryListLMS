import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1,100);
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(number));
        for (int i = 0; i < 50; i++) {
            integers.add(i);


        }
        System.out.println(integers);


}
}