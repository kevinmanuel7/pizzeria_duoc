
package pizzeriaduoc;


public class PizzeriaDuoc {


    public static void main(String[] args) {
        
        Pizza pizzapepperoni = new Pizza(); 
        pizzapepperoni.setNombre("pepperoni");
        pizzapepperoni.setTamanio("XL");
        pizzapepperoni.setMasa("delgada");
        pizzapepperoni.setPrecio(10000);
        
        pizzapepperoni.mostrardetalle();
    }

}
