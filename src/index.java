import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao ma sinh vien");
            String num = sc.nextLine();
//        validate input
//        Pattern pattern = Pattern.compile("(0[3|5|7|9][0-9]{8})");
            Pattern pattern = Pattern.compile("([a-z A-Z]+)@[a-z A-Z]{1,10}\\.[a-z]{1,10}");

            Matcher check = pattern.matcher(num);
            if (check.matches()) {
                System.out.println("Cam on");
                break;
            } else {
                System.err.println("Nhap sai dinh dang");
            }

        } while (true);

    }
}
