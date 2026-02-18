package practice;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class FileWriting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------\n1. Write to file\n2. Read from file\n---------------");
		int inp = sc.nextInt();
		
		switch(inp) {
		case(1):
			Scanner writer = new Scanner(System.in);
			System.out.println("Insert what you would like to write to the file:");
			String in = writer.next();
			
			try {
			FileWriter myWriter = new FileWriter("file.txt");
			myWriter.write(in);
			myWriter.close();
			System.out.println("Successfully written");
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		case(2):
			
			try {
				File myFile = new File("file.txt");
				Scanner reader = new Scanner(myFile);
				while (reader.hasNextLine()) {
					String data = reader.nextLine();
					System.out.println(data);
				}
				reader.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("File not found error");
				e.printStackTrace();
			}
		}
		
		
		
		
		
		

	}

}
