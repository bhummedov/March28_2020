package March28_2020;

public class TilingTest {
    public static void main(String[] args) {
        Tiling myTiles = new Tiling("Alma",5000,0,"wood");
        System.out.println(myTiles.calculateTotalMaterialPrice());
        myTiles.printQuete();
    }
}
