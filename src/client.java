// import java.io.BufferedInputStream;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
// import java.util.ArrayList;
// import java.util.List;

public class client {
    public static void main(String[] args) throws Exception {
        // user user1 = new user(args[0]);
        // user user1 = new user(args[0], Integer.parseInt(args[1]));
        one One = new one(new two(new three("google-chrome")));
        String hostname = "127.0.0.1";
        int port = Integer.parseInt(args[0]);
        Socket clientSocket = new Socket(hostname, port);
        try (
            // ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.dat"));
            // BufferedInputStream in = new BufferedInputStream(new FileInputStream("data.dat"));
            ObjectOutputStream out2 = new ObjectOutputStream(clientSocket.getOutputStream());
        ){
            // List<Integer> bytes = new ArrayList<Integer>();
            // int byteread;
            // while ((byteread = in.read()) != -1) {
            //     bytes.add(byteread);
            // }
            // out.writeObject(One);
            out2.writeObject(One);
        } catch (Exception e) {
        }
        clientSocket.close();
    }
}
