import java.io.*;

public class Serial1 {
    public static void main(String[] args) throws  Exception {
        Serial obj = new Serial();
        obj.i = 5;

        File f = new File("hi.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Serial obj1 = (Serial) ois.readObject();
        System.out.println(obj1.i);
    }
}

class Serial implements Serializable {

    int i;
}