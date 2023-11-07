import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        for (String name : names
        ) {
            if (!name.equals("Sam")) {
                System.out.println(name);
            }
        }
        System.out.println("---------");
        List<User> usersList=names.stream()
                .filter(FilterExample::isNotSam)
                .map(User::new)
                .collect(Collectors.toList());
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }

     static class User {
        private String name;
        private Integer age;

        public User(String name) {
            this.name = name;
            this.age= 30;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

         @Override
         public String toString() {
             return "name : " + name+ " Age : "+ age;
         }
     }

}
