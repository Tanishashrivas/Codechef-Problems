import java.util.Scanner;

/*Question: The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content. */
public class EOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
            String s=sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
        sc.close();
}
}