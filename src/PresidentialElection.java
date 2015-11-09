import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class PresidentialElection {

	public static void main(String[] args) throws IOException {
		String isbn; // the books isbn number
		String author; // the author of the text
		String title; // the title of the text
		String prepub; // "AW" (publisher)
		String postpub; // converted "aw" to "Addison Wesley"
		int ed = 0; // the edition of the text
		int quant = 0; // the amount of a text needed
		double price = 0; // the price of the book
		double total = 0; // amount of books*price of books
		double avgPrice = 0; //the average price of the books in text file
		double sumPrice = 0; //The sum of all of the totals
		double totalValue = 0; //The value of the inventory
		int numBooks = 0; // The amount of books (counting duplicates)
		// in the text file.
		//Read in file name from user
		System.out.println("Please enter the name of your file in the "
			+ "format \"filename.txt\" ");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.nextLine();


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
