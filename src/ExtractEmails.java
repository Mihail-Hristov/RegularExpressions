import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^|\\s+(?<name>[A-Za-z0-9]+[.\\-_]?[A-Za-z0-9]+)@(?<domain>[A-Za-z]+[\\-]?[A-Za-z]+)([.][A-Za-z]+)*";
        Pattern pattern = Pattern.compile(regex);
        List<String> validEmails = new ArrayList<>();

        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            validEmails.add(matcher.group());
        }

        validEmails
                .forEach(e -> System.out.println(e));
    }
}
