import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.awt.Polygon;
import java.awt.Graphics;
import java.awt.Color;

public class PresidentialElection {

	public static void main(String[] args) throws IOException {

    Scanner keyboard = new Scanner(System.in);
		int year;
		char scheme = 'p';
		String color, region, fileName;
		/**
		System.out.print("Election year? ");
		year = keyboard.nextInt();

		System.out.print("Election results color scheme (r) Red/Blue or (p) Purple? ");
		color = keyboard.next();
		if( color.toLowerCase().equals("r") )
			scheme = 'r';
		else if( color.toLowerCase().equals("p") )
			scheme = 'p';
		else{
			System.out.println("Please enter either 'r' or 'p'.");
			System.exit(1);
		}

		System.out.print("State or County? ");
		region = keyboard.next();
		if( region.toLowerCase().equals("county") )
			region = "county-";
		else if( region.toLowerCase().equals("state") )
			region = "";
		else{
			System.out.println("Please enter either 'state' or 'county'.");
			System.exit(0);
		}

		fileName = "USA-"+region+year+".txt";
		*/
		fileName = "USA-2000.txt";
		System.out.println("Loading: "+fileName);

		draw(fileName, scheme);

		}

		public static void draw(String fName, char scheme) throws IOException{
			File file;
			Scanner fileIn;
			int numPoints;
			double minLat, maxLat, minLon, maxLon,latDif, lonDif;
			String nextLine;

			double width = 930;
			double height = 400;


			// open file and check if the file exists
			file = new File("fName");
			if(!file.exists()){
				file = new File("../files/"+fName);
				if(!file.exists()){
					System.out.println("The file " + fName + " could not be found.");
					System.exit(0);
				}
			}

			fileIn = new Scanner(file);
			minLat = fileIn.nextDouble();
			minLon = fileIn.nextDouble();
			maxLat = fileIn.nextDouble();
			maxLon = fileIn.nextDouble();
			numPoints = fileIn.nextInt();
			latDif = maxLat - minLat;
			lonDif = maxLon - minLon;

			System.out.println("minLat: "+minLat);
			System.out.println("maxLat : "+maxLat);
			System.out.println("minLon: "+minLon);
			System.out.println("maxLon: "+maxLon);
			System.out.println("numPoints: "+numPoints);
			System.out.println("Lat Dif: "+ (maxLat - minLat));
			System.out.println("Lon Dif: "+ (maxLon - minLon));


			DrawingCanvas canvas = new DrawingCanvas((int)width,(int)height);
			Graphics g;
			Polygon region = new Polygon();
			int regionPts,x,y;
			Color color;

			//loop through all regions
			for( int i=0; i<numPoints; i++ ){
				g = canvas.getGraphics();
				region.reset();
				System.out.println(fileIn.nextLine());
				System.out.println(fileIn.nextLine());
				System.out.println(fileIn.nextLine());
				System.out.println(fileIn.nextLine());
				regionPts = fileIn.nextInt();
				color = computeColor(scheme, fileIn.nextInt(),fileIn.nextInt(),fileIn.nextInt());
				System.out.println("Color: "+color.toString());
				System.out.println("PolyPoints :"+regionPts);
				//loop through all points
				for( int j=0; j<regionPts; j++ ){
					double longitude = fileIn.nextDouble();
					double latitude = fileIn.nextDouble();
					//System.out.println("long: "+ longitude);
					//System.out.println("lat: "+latitude);
					x = (int)((width / lonDif) * (longitude - minLon));
					y = (int)((height / latDif) * (latitude - minLat));
					//System.out.println("X :" + x);
					//System.out.println("Y :" + y);
					region.addPoint(x,y);
				}
				//draw region to JFrame
				g.setColor(color);
				g.drawPolygon(region);
				g.fillPolygon(region);
			}



	}

	public static Color computeColor(char scheme, int votesR, int votesD, int votesI){
		System.out.println("R :" + votesR);
		System.out.println("D :" + votesD);
		System.out.println("I :" + votesI);

		Color color;
		if( scheme == 'p'){
			float sum = votesR + votesD + votesI;
			color = new Color(votesR/sum, votesI/sum, votesD/sum);
		}else{
			if( votesR > votesI ){
				if( votesD > votesR )
					color = Color.BLUE;
				else
					color = Color.RED;
			}else
				color = Color.GREEN;
		}
		System.out.println(color.toString());
		return color;
	}


}//end class
