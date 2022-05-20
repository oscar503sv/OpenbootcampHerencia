public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Javier");
        cliente.setEdad(38);
        cliente.setTelefono("2264-8975");
        cliente.setCredito(12000);

        System.out.println("****CLASE CLIENTE****");
        System.out.println("Nombre de cliente: "+cliente.getNombre());
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Telefono: "+cliente.getTelefono());
        System.out.println("Credito otorgado: "+cliente.getCredito()+"\n");

        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Henry");
        trabajador.setEdad(36);
        trabajador.setTelefono("6458-7894");
        trabajador.setSalario(1675.10);

        System.out.println("****CLASE TRABAJADOR****");
        System.out.println("Nombre de trabajador: "+trabajador.getNombre());
        System.out.println("Edad: "+trabajador.getEdad());
        System.out.println("Telefono: "+trabajador.getTelefono());
        System.out.println("Salario: "+trabajador.getSalario());
    }
}