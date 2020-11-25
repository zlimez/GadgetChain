import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class one implements Serializable{
    private static final long serialVersionUID = 1L;
    private run Two;

    public one() {
        Two = null;
    }

    public one(run arg) {
        this.Two = arg;
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        Two.troll();
    }
}