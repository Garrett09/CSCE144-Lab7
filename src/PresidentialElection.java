import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.awt.Polygon;
import java.awt.Graphics;
import java.awt.Color;

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
		if(stateCounty == "county" && electionYear == 2000 || "County" && 2000)
		 File file = new File(USA-county-2000.txt)
		 else if ("county" && 2004 || "County" && 2004)
		 File file = new File(USA-county-2004.txt)
		 else if ("county" && 2008 || "County" && 2008)
		 File file = new File(USA-county-2008.txt)
		 else if ("county" && 2012 || "County" && 2012)
		 File file = new File(USA-county-2012.txt)
		 else if




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
