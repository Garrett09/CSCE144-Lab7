import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.awt.Polygon;

public class PresidentialElection {

	public static void main(String[] args) throws IOException {
    Scanner keyboard = new Scanner(System.in);

		String state, county;

		System.out.println("Election year? ")
		int electionYear = keyboard.nextInt();

		System.out.println("Election results color scheme (r) Red/Blue or (p) Purple? ")
		String colorScheme = keyboard.nextLine();

		System.out.println("State or County? ");
		String stateCounty = keyboard.nextLine();

		System.out.println("Loading: ")



		// open file and check if the file exists
		File file = new File(fileName);
		if(!file.exists())
		{System.out.println("The file " + fileName + " could not be "
		+ "found.");
		System.exit(0);}
		// Read in file.
		Scanner inFile = new Scanner(file);

		// Set delimiters
		inFile.useDelimiter("_|/|\\r?\\n");

		while(inFile.hasNext()) {
			isbn = inFile.next();
			author = inFile.next();
			title = inFile.next();
			ed = inFile.nextInt();
			prepub = inFile.next();
			quant = inFile.nextInt();
			price = inFile.nextDouble();
			total = quant*price;








//main method
}//end class
