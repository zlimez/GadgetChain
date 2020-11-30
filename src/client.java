import java.io.ObjectOutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws Exception {
        // user user1 = new user(args[0]);
        // user user1 = new user(args[0], Integer.parseInt(args[1]));
        one One = new one(new two(new three(args[1])));
        String hostname = "127.0.0.1";
        int port = Integer.parseInt(args[0]);
        Socket clientSocket = new Socket(hostname, port);
        try (
            ObjectOutputStream out2 = new ObjectOutputStream(clientSocket.getOutputStream());
        ){
            out2.writeObject(One);
        } catch (Exception e) {
        }
        clientSocket.close();
    }
}
