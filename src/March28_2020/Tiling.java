package March28_2020;

public class Tiling extends Quete {
    private String material;

    Tiling() {
        super();
    }

    Tiling(String customerName, int totalSquareFeet, double price, String material) {
        super(customerName, totalSquareFeet, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    double calculateTotalMaterialPrice() {
        if (this.material.equalsIgnoreCase("wood")) {
            return this.getTotalSquareFeet() * 2.4;
        } else if (this.material.equalsIgnoreCase("tile")) {
            return this.getTotalSquareFeet() * 1.99;
        } else {
            System.out.println("wrong material");
            return 0.0;
        }
    }


    double calculateTotalPrice() {
        this.setPrice(this.calculateTotalMaterialPrice() + 4 * this.getTotalSquareFeet());
        return this.getPrice();
    }

    void printQuete() {
        System.out.println("" +
                "Customer Name : \t" + this.getCustomerName() +
                "Total sqrFeet :\t" + this.getTotalSquareFeet() +
                "Material Price : \t" + this.calculateTotalMaterialPrice() +
                "Total Price :\t" + this.getPrice());
    }


    @Override
    public String toString() {
        return "Tiling{" +
                "material='" + material + '\'' +
                '}';
    }
}