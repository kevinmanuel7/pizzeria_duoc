package pizzeriaduoc;


public class Cliente {
    private String nombre;
    private Pedido pedido;
    

    public Cliente() {
    }

    public Cliente(String nombre, Pedido pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void mostrarResumen(Cliente cliente) {
        System.out.println("-------RESUMEN PEDIDO-------");
        System.out.println("Nombre cliente: " + nombre);
        System.out.println("Detalle Pizzas: " + this.pedido.getDetallePizzas());
        System.out.println("Total a pagar: " + this.pedido.getTotalPagar());
        System.out.println("Total final (con desc. y delivery): $" + this.pedido.calcularTotalFinal());
        System.out.println("----------------------------");
        
    }
    
}

