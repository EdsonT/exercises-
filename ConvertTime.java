import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ConvertTime {

static String timeConversion(String time) {
    DateFormat f1 = new SimpleDateFormat("hh:mm:ssa"); //11:00pm
    Date d = null;
    try {
        d = f1.parse(time);
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    DateFormat f2 = new SimpleDateFormat("HH:mm:ss");
    String x = f2.format(d); // "23:00"

    return x;
    }

private static final Scanner scan = new Scanner(System.in);

public static void main(String[] args)  throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
