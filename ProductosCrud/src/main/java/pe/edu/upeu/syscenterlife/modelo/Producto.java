package pe.edu.upeu.syscenterlife.modelo;

import lombok.Data;

@Data
public class Producto {
    String codigo;
    String nombre;
    double precio;
    int cantidad;
    double totalGanancias=0;
    
}
