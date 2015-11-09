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

		/* the loop reads isbn, author, title, edition, quantity,
		and price*/
                System.out.printf( "%-14s %-14s %-30s %-2s %-4s %-4s "
			+" %-6s\t%-10s \n",  "ISBN",
			"AUTHOR","TITLE",
			"ED", "QUANT", "PRICE","TOTAL","PUBLISHER");
		while(inFile.hasNext()) {
			isbn = inFile.next();
			author = inFile.next();
			title = inFile.next();
			ed = inFile.nextInt();
			prepub = inFile.next();
			quant = inFile.nextInt();
			price = inFile.nextDouble();
			total = quant*price;

			System.out.printf( "%-10s %-15s %-30s %-2s %4d %.2f "
			+" %.2f \t%-10s \n",  formatISBN(isbn),
			getLastName(author),truncateTitle(title),
			edition(ed), quant, price,total,publisher(prepub));


numBooks = numBooks + quant;
sumPrice = sumPrice + total;




} //end of reading loop
inFile.close();
avgPrice = sumPrice/numBooks;
totalValue = avgPrice*numBooks;
System.out.println("Total books:    " + numBooks);
System.out.printf("Average price:  %.2f \n", avgPrice);
System.out.printf("Total value:    %.2f \n", totalValue);
}

//Takes a string of numbers and puts it into the proper ISBN format
// #-###-#####-#
public static String formatISBN(String num){
//String number = "1023486870";
String newNumber = num.substring(0,1) + "-" +
num.substring(1,4) + "-" + num.substring(4,9) + "-"
+ num.substring(9,10);
return newNumber;
}

/*Takes a string (a first and last name) and takes everything past the space
and stores it as the last name. This only works if the string is in the form
"first last". So a name like "Garrett L. Green" would print
"L. Green".
*/
public static String getLastName(String name){

int space;
String lastName;
space = name.indexOf(' ');
lastName = name.substring(space,name.length());
return lastName;
}
/*
This method truncates the title of the book at 27 characters.
*/
public static String truncateTitle( String title) {
int length = title.length();
String newTitle;
if (length >= 27)
newTitle = title.substring(0,26) + "...";
else
newTitle = title;
return newTitle;

}
// This method takes a number x, between 1-20, and outputs it as "xth".
public static String edition(int ed){
String ordinalEd = ed + "th";
return ordinalEd;

} // end of edition method

// This method converts "AW" to "Addison Wesley".
public static String publisher( String prepub){
String postpub = "";
if(prepub.equalsIgnoreCase("aw"))
postpub = "Addison Wesley";

if(prepub.equalsIgnoreCase("ct"))
postpub = "Course Technology";
if(prepub.equalsIgnoreCase("fb"))
postpub = "Franklin Beedle & Assoc.";
if(prepub.equalsIgnoreCase("hc"))
postpub ="Harper Collins";
if(prepub.equalsIgnoreCase("mh"))
postpub = "McGraw-Hill";
if(prepub.equalsIgnoreCase("or"))
postpub = "O'Reilly Media, Inc.";
if(prepub.equalsIgnoreCase("ph"))
postpub = "Prentice Hall";
if(prepub.equalsIgnoreCase("pm"))
postpub = "Palgrave Macmillan";
if(prepub.equalsIgnoreCase("vi"))
postpub = "Vintage";
return postpub;
} //end of publisher method







//main method
}//end class
