
package race;

public class Wheels {
    private String wheels_brand;
    private int size;
    
    public Wheels(String wheels_brand, int size){
        this.wheels_brand = wheels_brand;
        this.size = size;
        
    }
    
    public double getFactor() {
        return this.size / 20.0;
    }
    
}
