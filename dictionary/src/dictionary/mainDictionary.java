package dictionary;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class mainDictionary {
	public void Dictionary() throws IOException {
		Hashtable<String,String> music = new Hashtable<String,String>();
		String filePath = "dictionaryProject.txt";
		String line;
		BufferedReader reader1 = new BufferedReader(new FileReader(filePath));
		while ((line = reader1.readLine()) != null) {
			String[] parts = line.split(":",2);
			if (parts.length >= 2)
			{
				String letter = parts[0];
				String insturment = parts[1];
				music.put(letter, insturment);
			} else {
				System.out.println("ignore this line " + line);
			}
		}
		for (String letter : music.keySet()) {
			System.out.println(letter + ":" + music.get(letter));
		}	
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Hashtable<String,String> music = new Hashtable<String,String>();
	String filePath = "dictionaryProject.txt";
	String line;
	BufferedReader reader = new BufferedReader(new FileReader(filePath));
	while ((line = reader.readLine()) != null) {
		String[] parts = line.split(":",2);
		if (parts.length >= 2)
		{
			String letter = parts[0];
			String insturment = parts[1];
			music.put(letter, insturment);
		} else {
			System.out.println("ignore this line " + line);
		}
	}
	for (String letter : music.keySet()) {
		System.out.println(letter + ":" + music.get(letter));
	}
	System.out.println("please type the number option you would like ");
	Scanner keyboard1 = new Scanner(System.in);
	int firstChoice = keyboard1.nextInt();
	System.out.println("1. view contents \n");
	System.out.println("2. update contents \n");
	System.out.println("3. delete contents \n");
	switch (firstChoice) {
	case 1:
		System.out.println("you have chosen to view the dictionary contents ");
		System.out.println(music.get("a"));
		System.out.println(music.get("b"));
		System.out.println(music.get("c"));
		System.out.println(music.get("d"));
		System.out.println(music.get("e"));
		System.out.println(music.get("f"));
		System.out.println(music.get("g"));
		System.out.println(music.get("h"));
		System.out.println(music.get("i"));
		System.out.println(music.get("j"));
		System.out.println(music.get("k"));
		System.out.println(music.get("l"));
		System.out.println(music.get("m"));
		System.out.println(music.get("n"));
		System.out.println(music.get("o"));
		System.out.println(music.get("p"));
		System.out.println(music.get("q"));
		System.out.println(music.get("r"));
		System.out.println(music.get("s"));
		System.out.println(music.get("t"));
		System.out.println(music.get("u"));
		System.out.println(music.get("v"));
		System.out.println(music.get("w"));
		System.out.println(music.get("x"));
		System.out.println(music.get("y"));
		System.out.println(music.get("z"));
		

		break;
	case 2:
		System.out.println("you have chosen to update the dictionary contents ");
		System.out.println("type the letter you want to chose for the new item");
		Scanner keyboard2 = new Scanner(System.in);
		String letterChoice = keyboard2.next();
		System.out.println("type the insturment you want to add for the new item");
		Scanner keyboard3 = new Scanner(System.in);
		String insturmentChoice = keyboard3.next();
		music.put(letterChoice, insturmentChoice);
		System.out.println("music dictionary has been updated");
		break;
	case 3: 
		System.out.println("you have chosen to delete the dictionary contents ");
		System.out.println("type the letter a-z of the item you want to delete ");
		Scanner keyboard4 = new Scanner(System.in);
		String deleteItem = keyboard4.next();
		music.remove(deleteItem);
		System.out.println("item deleted. ");

		break;
	}
	
	
	
	
	
	
	}
	
	

}
