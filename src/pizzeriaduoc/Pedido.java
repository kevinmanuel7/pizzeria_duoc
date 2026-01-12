package pizzeriaduoc;


public class Pedido {
    private String detallePizzas;
    private int totalPagar;
    private boolean tieneDelivery;
    private double dsctoPromocional;

    public Pedido() {
    }

    public Pedido(boolean tieneDelivery) {
        this.detallePizzas = "";
        this.totalPagar = 0;
        this.tieneDelivery = tieneDelivery;
        this.dsctoPromocional = 0.10;
    }

    
    public String getDetallePizzas() {
        return detallePizzas;
    }

    public void setDetallePizzas(String detallePizzas) {
        this.detallePizzas = detallePizzas;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public boolean isTieneDelivery() {
        return tieneDelivery;
    }

    public void setTieneDelivery(boolean tieneDelivery) {
        this.tieneDelivery = tieneDelivery;
    }

    public double getDsctoPromocional() {
        return dsctoPromocional;
    }

    public void setDsctoPromocional(double dsctoPromocional) {
        this.dsctoPromocional = dsctoPromocional;
    }
    
    public void agregarPizza(Pizza pizza) {
        int precioPizza = pizza.calcularprecio();
        this.totalPagar += precioPizza;
        this.detallePizzas += pizza.getNombre();
    }
    
    public int calcularTotalFinal() {
        double descuento = this.totalPagar * this.getDsctoPromocional();
        int descuentoAplicado = (int) (this.totalPagar - descuento);
        
        if (this.tieneDelivery) {
            return descuentoAplicado + 3000;
        }
        else {
            return descuentoAplicado;
        }
    }
}

