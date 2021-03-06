package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {
        String pattern = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            String input = scan.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
    }
}
