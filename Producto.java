package tienda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Karasu
 */
public class Producto {
    



    private String producto;
    private double precioVenta;
    private double precio;
    private int IVA = 9;
    private String fecha;

    public Producto( String producto, double precioVenta, double precio, String fecha) {
        
        this.producto = producto;
        this.precioVenta = precioVenta;
        this.precio = precio;
        this.fecha = fecha;
    }

    

    public Producto() {
         }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public void Producto(){
        
        
        
    }
 
    public void PrecioDeVenta(){
        
 
    }
    
    public Random codigo(){
        Random cod = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println();
            
        }
       return cod;
        
        
    }
    
    public String obtenerFechaFormateada(Date fecha, String formato) {
    SimpleDateFormat sdf = new SimpleDateFormat(formato);
    return sdf.format(fecha);
}
    
    public static void main(String[] args) {
      String productos[]=new String[5];
      double PrecioTotal[]=new double[5];
      double precio[]=new double[5];
      String fecha[]=new String[5];
        ArrayList<Producto> producto = new ArrayList<Producto>();
        Producto estud = new Producto();
         Scanner scannear = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el producto:");
            productos[i]=scannear.nextLine();
            System.out.println("Ingrese el precio:");
            precio[i]=scannear.nextDouble();
           double PrecioIVA= (precio[i] * 9)/100;
            PrecioTotal[i] = precio[i] + PrecioIVA;
            fecha[i]=scannear.nextLine();
         producto.add(new Producto(productos[i] ,PrecioTotal[i], precio[i],fecha[i]));
        }System.out.println("El producto " + productos[0] + " tiene un precio de  " + precio[0] +"$" +" , su precio con iva es de " + PrecioTotal[0] + " con codigo de " + 1 + " y su fecha de creacion es el " + "12/07/20");
         System.out.println("El producto " + productos[1] + " tiene un precio de  " + precio[1] +"$" + " , su precio con iva es de " + PrecioTotal[1]+ " con codigo de " + 2 + " y su fecha de creacion es el " + "12/07/20");
        System.out.println("El producto " + productos[2] + " tiene un precio de  " + precio[2] +"$" + " , su precio con iva es de " + PrecioTotal[2]+ " con codigo de " + 3 + " y su fecha de creacion es el " + "18/07/20");
        System.out.println("El producto " + productos[3] + " tiene un precio de  " + precio[3] +"$" + " , su precio con iva es de " + PrecioTotal[3]+ " con codigo de " + 4 + " y su fecha de creacion es el " + "20/07/20");
        System.out.println("El producto " + productos[4] + " tiene un precio de  " + precio[4] +"$" + " , su precio con iva es de " + PrecioTotal[4]+ " con codigo de " + 5 + " y su fecha de creacion es el " + "20/07/20");

            System.out.println("/**********/"); 
               
 }
    
}
