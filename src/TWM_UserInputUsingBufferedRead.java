import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TWM_UserInputUsingBufferedRead {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        //int num = System.in.read();

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

        br.close();

        Scanner sc = new Scanner(System.in);
    }
}
