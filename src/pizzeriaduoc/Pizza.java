package pizzeriaduoc;

public class Pizza {
    private String nombre;
    private String tamanio;
    private String masa;
    private int precio = 2000;

    public Pizza() {
    }

    
    public Pizza(String nombre, String tamanio, String masa, int precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.masa = masa;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void mostrardetalle() {
            System.out.println("----DETALLE PEDIDO----");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Tamaño: " + this.tamanio);
            System.out.println("Masa: " + this.masa);
            System.out.println("Precio: " + this.precio);
    }
    
    public void preparando() {
        System.out.println("Preparando " + this.nombre);
    }
        
    public void calentando() {
        System.out.println("Calentando " + this.nombre);
    }
    
    public int calcularprecio() {
        if (this.tamanio.equalsIgnoreCase("M")) {
            return this.precio;
        }
        if (this.tamanio.equalsIgnoreCase("L")){
            this.precio += 2000;
            return this.precio;
        }
        if (this.tamanio.equalsIgnoreCase("XL")){
            this.precio += 4000;
            return this.precio;
        }
        return 0;
    }
}

