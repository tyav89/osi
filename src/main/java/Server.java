import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port =80;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket clientSocket = serverSocket.accept();
        PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        pw.println("Write your name");
        String name = br.readLine();
        pw.println("Are you child? (yes/no)");
        String value = br.readLine();
        if ("no".equals(value)) {
            pw.println(String.format("Welcome to the adult zone, %s! Have a good rest, or a good working day!", name));
        } else {
            pw.println(String.format("Welcome to the kids area, %s! Let's play!", name));
        }
    }
}
