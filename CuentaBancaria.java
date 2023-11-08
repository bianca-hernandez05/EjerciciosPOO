public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private String email;
    private String numeroTelefono;

    public CuentaBancaria(String numeroCuenta, double saldo, String nombreCliente, String email, String numeroTelefono) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado $" + cantidad + ". Nuevo saldo: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado $" + cantidad + ". Nuevo saldo: $" + saldo);
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        } else {
            System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123erfy5", 1000.00, "Bianca Hernandez", "bdhm@gmail.com", "5730-2998");

        System.out.println("Cliente: " + cuenta.getNombreCliente() + ", Saldo Inicial: $" + cuenta.getSaldo());
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(1500);
    }
}
