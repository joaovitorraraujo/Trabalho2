public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("José","gerente",0);
        Employee e2 = new Employee("Maria","chefe",20000.00);

        System.out.println("Informações dos funcionários:");
        e1.status();
        System.out.println();
        e2.status();

        Client c1 = new Client("Carlos","carlos@gmail.com","rua jose medeiros, nº18",0);
        Client c2 = new Client("Pedro","pedro@hotmail.com","rua jose medeiros, nº19",40);

        System.out.println("\nInformações dos clientes:");
        c1.status();
        System.out.println();
        c2.status();
    }
}