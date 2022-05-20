public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Javier");
        cliente.setEdad(38);
        cliente.setTelefono("2264-8975");
        cliente.setCredito(12000);

        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Telefono: "+cliente.getTelefono());
        System.out.println("Credito otorgado: "+cliente.getCredito());


    }
}