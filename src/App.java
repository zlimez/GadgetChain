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
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
        ) {
            user newuser = (user) ois.readObject();
            System.out.println("server started");
            System.out.println(newuser.displayContents());
        }
    }
}