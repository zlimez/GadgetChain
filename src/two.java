import java.io.IOException;
import java.io.Serializable;

public class two implements run, Serializable {
    private static final long serialVersionUID = -4952834433232314219L;
    private three Three;

    public two() {
        Three = null;
    }

    public two(three arg) {
        Three = arg;
    }

    @Override
    public void troll() {
        try {
            Three.invoke();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
