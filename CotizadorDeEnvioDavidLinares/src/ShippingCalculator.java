public class ShippingCalculator {

    private double IVA=0.16;
    private double ZONA_REMOTA=0.10;

    public double calcularSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota) {
        double subtotal = 0;
        if (tipoServicio == 1) {
            subtotal = 50;
            subtotal = subtotal * (pesoKg * 12);
            if (distanciaKm <= 50) {
                subtotal = subtotal + 20;
            } else if (distanciaKm >= 51 || distanciaKm <= 200) {
                subtotal = subtotal + 60;
            } else {
                subtotal = subtotal + 120;
            }
            if (zonaRemota) {
                subtotal = subtotal * ZONA_REMOTA;

            }
        } else if (tipoServicio==2) {
            subtotal = 90;
            subtotal = subtotal * (pesoKg * 12);
            if (distanciaKm <= 50) {
                subtotal = subtotal + 20;
            } else if (distanciaKm >= 51 || distanciaKm <= 200) {
                subtotal = subtotal + 60;
            } else {
                subtotal = subtotal + 120;
            }
            if (zonaRemota) {
                subtotal = subtotal * ZONA_REMOTA;

            }
        }
        return subtotal;
    }

    public double calcularIVA(double subtotal) {
        return subtotal * IVA;
    }

    public double calcularTotal(double subtotal, double iva) {
        return subtotal + iva;
    }

}
