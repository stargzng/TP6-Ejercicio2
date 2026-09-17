package Entidades;


public class Producto implements Comparable<Producto>{
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria categoria;

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion=descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.codigo, o.getCodigo());
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
    
    
    
}
