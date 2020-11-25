import java.io.Serializable;

public class user implements Serializable {
    private static final long serialVersionUID = 3436370970422221194L;
    private String myName;
    private int SN;

    public user() {
        myName = "";
        SN = 0;
    }

    public user(String name, int val) {
        myName = name;
        SN = val;
    }

    public String getInfo() {
        return myName + " :" + SN;
    }

    public String displayContents() {
        return "Hello " + myName;
    }
}
