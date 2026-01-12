package pizzeriaduoc;

public class Pizza {
    private String nombre;
    private String tamanio;
    private String masa;
    private int precioBase;

    public Pizza() {
    }

    
    public Pizza(String nombre, String tamanio, String masa, int precioBase) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.masa = masa;
        this.precioBase = precioBase;
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

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecio(int precio) {
        this.precioBase = precio;
    }

    public void mostrardetalle() {
            System.out.println("----DETALLE PEDIDO----");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Tamaño: " + this.tamanio);
            System.out.println("Masa: " + this.masa);
            System.out.println("Precio Base: " + this.precioBase);
    }
    
    public void preparando() {
        System.out.println("Preparando " + this.nombre);
    }
        
    public void calentando() {
        System.out.println("La pizza " + this.nombre + " está en el horno.");
    }
    
    public int calcularprecio() {
        if (this.tamanio.equalsIgnoreCase("L")){
            return this.precioBase + 2000;
        }
        else if (this.tamanio.equalsIgnoreCase("XL")){
            return this.precioBase + 4000;
        }
        else {
            return this.precioBase;
        }
    }
    
    public void procesarDatosPizza() {
        String precio = String.valueOf(precioBase); //convertir int a String
        System.out.println(precio);
        
        int precioint = Integer.parseInt(precio); //convertir String a int
        System.out.println(precioint);
        
        double preciodouble = precioint; //conversión int a double (implícita o widening)
        System.out.println(precioint);
        
        String preciostring = String.valueOf(preciodouble);//convertir de double a String
        System.out.println(preciostring);
        
        char tamaniochar = this.tamanio.charAt(0);//Convertir "Tamanio" a char
        System.out.println(tamaniochar);
        
        boolean escara = this.calcularprecio() > 10000;//boolean
        System.out.println("¿Es cara?: " + escara);
        
        
    }
    
}

