import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку, состоящую из латинских букв и цифр. Количество символов в строке не превышает 100");
        String str = reader.readLine();
        Pattern pt = Pattern.compile("([\\D\\d0-9]+){8,100}");
//        2 вариант
//        Pattern pt = Pattern.compile("([a-zA-Z0-9]+){8,100}");

        Matcher mt = pt.matcher(str);
        if (mt.matches()) {
            System.out.println("YES");
        } else System.out.println("NO");


    }
}
