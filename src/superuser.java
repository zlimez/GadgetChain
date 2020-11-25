import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
// import java.nio.file.Path;
import java.nio.file.Paths;

public class superuser extends user {
    private static final long serialVersionUID = 7861081199088406452L;
    private File myRoute;
    private String error = "Transmission error";
    private File file = new File("/home/pcadmin/playground/Hacking1.1/src/file.txt");
    

    public superuser() {
        super();
    }

    public superuser(String name, int SN, String route) {
        super(name, SN);
        myRoute = new File(route);
    }

    public File getFile() {
        return file;
    }

    public String displayContents() {
        // Path path = Paths.get("/home/pcadmin/playground/Hacking1.1/src/records.txt");
        try {
            String line = Files.readString(Paths.get(myRoute.getAbsolutePath()));
            return "Hello " + super.getInfo() + " " + line;
        } catch (IOException e) {
            return error;
        }  
    }
}
