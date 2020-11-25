import java.net.*;
// import java.util.ArrayList;
// import java.util.List;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        int portnumber = Integer.parseInt(args[0]);

        try (
            ServerSocket serverSocket = new ServerSocket(portnumber);
            Socket clientSocket = serverSocket.accept();
            // BufferedInputStream in = new BufferedInputStream(clientSocket.getInputStream());
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
        ) {
            user newuser = (user) ois.readObject();
            // List<Integer> bytes = new ArrayList<Integer>();
            // int byteread;
            // while ((byteread = in.read()) != -1) {
            //     bytes.add(byteread); //lets say last 10 bytes fixed to be the hash of the data in front
            // }
            System.out.println("server started");
            System.out.println(newuser.displayContents());
        }
    }
}