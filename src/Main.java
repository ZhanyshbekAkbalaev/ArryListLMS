import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 100);
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(1,100));
        }
        System.out.println(integers);
        ArrayList<Integer> integersOne = new ArrayList<>();
        ArrayList<Integer> integersTwo = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer %2 == 0){
                integersOne.add(integer);
            }else {
                integersTwo.add(integer);
            }
        }

        System.out.println("Чётные символы: "+integersOne);
        System.out.println("Не чётные символы: "+integersTwo);
    }
}