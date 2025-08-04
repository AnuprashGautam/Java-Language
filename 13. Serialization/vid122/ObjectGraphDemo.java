import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
    Cat c = new Cat();
}

class Cat implements Serializable {
    Rat r = new Rat();
}

class Rat implements Serializable {
    int j = 20;
}

public class ObjectGraphDemo {
    public static void main(String[] args) {
        try {
            Dog d = new Dog();

            // Serialization
            FileOutputStream fos = new FileOutputStream("dog.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);

            // Serialization
            FileInputStream fis = new FileInputStream("dog.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d1 = (Dog) ois.readObject();

            System.out.println(d1.c.r.j);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
