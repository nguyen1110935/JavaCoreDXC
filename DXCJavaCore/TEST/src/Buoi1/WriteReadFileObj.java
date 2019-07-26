package Buoi1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteReadFileObj {
	public static void main(String[] args) {

		Employee p1 = new Employee("John", "12000", "12 Ton Duc Thang", 1993);
		Employee p2 = new Employee("Rachel", "18000", "178 Hai Ba Trung", 1989);

		try {
			FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(p1);
			o.writeObject(p2);

			o.close();
			f.close();

			FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			Employee pr1 = (Employee) oi.readObject();
			Employee pr2 = (Employee) oi.readObject();

			System.out.println(pr1.showEmployee());
			System.out.println(pr2.showEmployee());

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
