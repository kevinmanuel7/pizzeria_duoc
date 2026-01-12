
package pizzeriaduoc;


public class PizzeriaDuoc {


    public static void main(String[] args) {
        
        Pedido miPedido = new Pedido(false);
        
        Pizza pizzapepperoni = new Pizza("Pepperoni", "XL", "Delgada", 10000); 
        pizzapepperoni.mostrardetalle();
        miPedido.agregarPizza(pizzapepperoni);
        
        Pizza pizzanapo = new Pizza("Napolitana ", "L", "Gruesa", 8000);
        pizzanapo.mostrardetalle();
        miPedido.agregarPizza(pizzanapo);
        
        Cliente kevin = new Cliente("Kevin Maturana", miPedido);

        kevin.mostrarResumen(kevin);
        
        System.out.println("===========================");
        pizzanapo.procesarDatosPizza();
    }

}
