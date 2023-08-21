
import java.util.Scanner;

public class SQLGeneraattori {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna käyttäjätunnuksen nimi: ");
		String nimi = lukija.nextLine();
		System.out.println("CREATE USER '" + nimi + "'@\'localhost\' IDENTIFIED BY \'password\';");
		System.out.println("CREATE DATABASE " + nimi + ";");
		System.out.println("GRANT ALL ON " + nimi + ".* to \'" + nimi + "\'@\'localhost\';");
	}
}
