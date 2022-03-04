
package coche;

/**
 *
 * @author Fran
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche;
        int stockActual;
        
        miCoche = new Coche("Opel",12000,500);
        operatoriaVentaHinojoCaparrosPepe2122(miCoche);
        
        operatoriaCompraHinojoCaparrosPepe2122(miCoche);
        stockActual = miCoche.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operatoriaCompraHinojoCaparrosPepe2122(Coche miCoche) {
        try
        {
            System.out.println("Compra de Coches");
            miCoche.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    private static void operatoriaVentaHinojoCaparrosPepe2122(Coche miCoche) {
        try
        {
            System.out.println("Venta de Coches");
            miCoche.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
