import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        for (String name : names
        ) {
            if (!name.equals("Sam")) {
                System.out.println(name);
            }
        }
        System.out.println("---------");
        names.stream()
                .filter(FilterExample::isNotSam)
                .forEach(System.out::println);
    }

    static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }
}
