

public class Subregion {
    Polygon region;
    String name;
    String region;
    int republican, democratic, independent;

    public Subregion(String subregionName, String regionName, int r, int d, int i ){
      this.name = subregionName;
      this.region = regionName;
      this.independent == i;
      this.republican == r;
      this.democratic == d;
      
    }

    public void addBoundry(double x, double y){
      region.addPoint(x,y);
    }
}
