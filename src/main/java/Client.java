import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws IOException {
        String host = "netology.homework";
        int port = 80;
        Scanner scanner = new Scanner(System.in);
        String value;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            System.out.println(br.readLine());
            value = scanner.next();
            pw.println(value);
            System.out.println(br.readLine());
            value = scanner.next();
            pw.println(value);
            System.out.println(br.readLine());
        }
    }
}
