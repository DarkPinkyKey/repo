package prueba;

public class TarjetaCredito {
    private boolean activo;
    private double saldo;

    // Constructor por defecto
    public TarjetaCredito() {
        activo = true;
        saldo = 1000.0;
    }

    // Método para pagar
    public void pagar(double cantidad) {
        if (activo && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Pago realizado correctamente. Saldo actual: " + saldo + "€");
        } else if (!activo) {
            System.out.println("La tarjeta está anulada. No se puede realizar el pago.");
        } else {
            System.out.println("El saldo no es suficiente para realizar el pago.");
        }
    }

    // Método para ver el saldo actual
    public void verSaldo() {
        System.out.println("Saldo actual: " + saldo + "€");
    }

    // Método para activar o anular la tarjeta
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito();

        // Ejemplo de pagos
        tarjeta.pagar(500); // Pago exitoso, saldo actual: 500.0€
        tarjeta.pagar(800); // Saldo insuficiente
        tarjeta.setActivo(false);
        tarjeta.pagar(200); // Tarjeta anulada
        tarjeta.setActivo(true);
        tarjeta.pagar(300); // Pago exitoso, saldo actual: 200.0€

        tarjeta.verSaldo(); // Saldo actual: 200.0€
    }
}
