import java.io.IOException;
import java.io.Serializable;

public class three implements Serializable {
    private static final long serialVersionUID = -5629487837740150761L;
    private String command;

    public three() {
        this.command = "";
    }

    public three(String arg) {
        this.command = arg;
    }

    public void invoke() throws IOException {
        Runtime.getRuntime().exec(command);
    }
}
