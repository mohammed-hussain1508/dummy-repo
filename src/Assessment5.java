import java.util.Scanner;
import java.util.regex.Pattern;

public class Assessment5 {

    public static void ValidateIP(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an IP address:");
        String ipAddress = sc.nextLine();
        String regex =
                "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.matcher(ipAddress).matches());


    }
}
