import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ParqueAcuatico parqueAcuatico = new ParqueAcuatico(100.0, 200.0, 100.0, 100.0);

        //Menu
        String[] paquetes = { "Comida Buffet", "Espectáculo Nocturno", "Nado con Delfines" };
        double[] precios = { parqueAcuatico.getPrecioComidaBuffet(), parqueAcuatico.getPrecioEspectaculoNocturno(), parqueAcuatico.getPrecioNadoDelfines() };

        double totalCompra = parqueAcuatico.getPrecioEntrada();

        for (int i = 0; i < paquetes.length; i++) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas agregar " + paquetes[i] + "? (Precio: $" + precios[i] + ")", "Parque Acuático", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                totalCompra += precios[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El total a pagar es de: $" + totalCompra, "Resumen de la compra", JOptionPane.INFORMATION_MESSAGE);
    }
}

