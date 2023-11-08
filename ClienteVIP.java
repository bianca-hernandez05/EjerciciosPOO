public class ClienteVIP {
    private String nombre;
    private double limiteCredito;
    private String correoElectronico;

    //el constructor vacio comienza a llamar a los metodos declarados , es decir a los 3 parametros anteriores
    public ClienteVIP() {
        this(".", 0.0, "");
    }

   //en este establecemos 2 , que serian el nombre y el limite de 
    public ClienteVIP(String nombre, double limiteCredito) {
        this(nombre, limiteCredito, "");
    }

    // Constructor con todos los campos
    public ClienteVIP(String nombre, double limiteCredito, String correoElectronico) {
        setNombre(nombre);
        setLimiteCredito(limiteCredito);
        setCorreoElectronico(correoElectronico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido.");
        }
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito > 0) {
            this.limiteCredito = limiteCredito;
        } else {
            System.out.println("Límite de crédito no válido.");
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null && !correoElectronico.isEmpty()) {
            this.correoElectronico = correoElectronico;
        } else {
            System.out.println("Correo electrónico no válido.");
        }
    }

    public static void main(String[] args) {
        ClienteVIP cliente1 = new ClienteVIP();
        cliente1.setNombre("Bianca Hernandez");
        cliente1.setLimiteCredito(60000.0);
        cliente1.setCorreoElectronico("bdhm101105@gmail.com");

        ClienteVIP cliente2 = new ClienteVIP("Marian Hernandez", 1000.0);
        ClienteVIP cliente3 = new ClienteVIP("Mario Hernandez", -1000.0, "mehv1974@gmail.com");
        ClienteVIP cliente4 = new ClienteVIP("Stacy Francis", 0, "NOse@gmail.com");
        ClienteVIP cliente5 = new ClienteVIP("Benito Molina", 90.0);
        ClienteVIP cliente6 = new ClienteVIP("Marisol Zelaya", -1000.0, "jefgt@gmail.com");
        ClienteVIP cliente7 = new ClienteVIP("Isabella Lopez", -1, "Isabel456@gmail.com");


        System.out.println("Cliente 1: " + cliente1.getNombre() + ", Límite de Crédito: $" + cliente1.getLimiteCredito() + ", Correo Electrónico: " + cliente1.getCorreoElectronico());
        System.out.println("Cliente 2: " + cliente2.getNombre() + ", Límite de Crédito: $" + cliente2.getLimiteCredito() + ", Correo Electrónico: " + cliente2.getCorreoElectronico());
        System.out.println("Cliente 3: " + cliente3.getNombre() + ", Límite de Crédito: $" + cliente3.getLimiteCredito() + ", Correo Electrónico: " + cliente3.getCorreoElectronico());
        System.out.println("Cliente 4: " + cliente4.getNombre() + ", Límite de Crédito: $" + cliente4.getLimiteCredito() + ", Correo Electrónico: " + cliente4.getCorreoElectronico());
        System.out.println("Cliente 5: " + cliente2.getNombre() + ", Límite de Crédito: $" + cliente2.getLimiteCredito() + ", Correo Electrónico: " + cliente5.getCorreoElectronico());
        System.out.println("Cliente 6: " + cliente3.getNombre() + ", Límite de Crédito: $" + cliente3.getLimiteCredito() + ", Correo Electrónico: " + cliente6.getCorreoElectronico());
        System.out.println("Cliente 7: " + cliente4.getNombre() + ", Límite de Crédito: $" + cliente4.getLimiteCredito() + ", Correo Electrónico: " + cliente7.getCorreoElectronico());

    }
}
