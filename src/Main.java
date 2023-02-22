import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static Collection<User> sortUsers(Collection<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge).thenComparing(User::getName)).collect(Collectors.toList());
    }

    public static void main(String[]args) {
    }
}
