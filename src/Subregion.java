

public class Subregion {
    Polygon region;
    String name;
    String regionName;
    
    public Subregion(String regionName ){
      this.name = regionName;

    }

    public void addBoundry(double x, double y){
      region.addPoint(x,y);
    }
}
