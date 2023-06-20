public class ParqueAcuatico {
    private double precioEntrada;
    private double precioComidaBuffet;
    private double precioEspectaculoNocturno;
    private double precioNadoDelfines;

    public ParqueAcuatico(double precioEntrada, double precioComidaBuffet, double precioEspectaculoNocturno, double precioNadoDelfines) {
        this.precioEntrada = precioEntrada;
        this.precioComidaBuffet = precioComidaBuffet;
        this.precioEspectaculoNocturno = precioEspectaculoNocturno;
        this.precioNadoDelfines = precioNadoDelfines;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public double getPrecioComidaBuffet() {
        return precioComidaBuffet;
    }

    public void setPrecioComidaBuffet(double precioComidaBuffet) {
        this.precioComidaBuffet = precioComidaBuffet;
    }

    public double getPrecioEspectaculoNocturno() {
        return precioEspectaculoNocturno;
    }

    public void setPrecioEspectaculoNocturno(double precioEspectaculoNocturno) {
        this.precioEspectaculoNocturno = precioEspectaculoNocturno;
    }

    public double getPrecioNadoDelfines() {
        return precioNadoDelfines;
    }

    public void setPrecioNadoDelfines(double precioNadoDelfines) {
        this.precioNadoDelfines = precioNadoDelfines;
    }

    public double calcularTotalCompra(double precioEntrada, double... paquetes) {
        double total = precioEntrada;
        for (double paquete : paquetes) {
            total += paquete;
        }
        return total;
    }
}
