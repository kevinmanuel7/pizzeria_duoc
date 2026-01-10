
package pizzeriaduoc;


public class PizzeriaDuoc {


    public static void main(String[] args) {
        
        Pizza pizzapepperoni = new Pizza(); 
        pizzapepperoni.setNombre("Pepperoni");
        pizzapepperoni.setTamanio("XL");
        pizzapepperoni.setMasa("delgada");
        pizzapepperoni.setPrecio(10000);
        
        pizzapepperoni.mostrardetalle();
        
        pizzapepperoni.preparando();
        System.out.println("Precio final: " + pizzapepperoni.getNombre() + " $" + pizzapepperoni.calcularprecio());
        
        
        System.out.println("====================");
        
        
        Pizza pizzanapolitana = new Pizza("Napolitana", "L", "Gruesa", 8000);
        
        pizzanapolitana.mostrardetalle();
        pizzanapolitana.calentando();
        System.out.println("Precio final: " + pizzanapolitana.getNombre() + " $" + pizzanapolitana.calcularprecio());
        
        
        System.out.println("====================");
        
        
        Pizza pizzavegan = new Pizza("Vegana", "M", "Gruesa", 8000);
        
        pizzavegan.mostrardetalle();
        pizzavegan.calentando();
        System.out.println("Precio Final: " + pizzavegan.getNombre() + " $" + pizzavegan.calcularprecio());
        
    }

}
