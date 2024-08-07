public class Client {
    // Atributos do Cliente
    private String name;
    private String email;
    private String endereco;
    private int age;

    //Construtor
    Client(String name, String email, String endereco, int age){
        if(age>0 && age<200) {
            this.name = name;
            this.email = email;
            this.endereco = endereco;
            setAge(age);
        }
        else {
            System.out.println("=============================================");
            System.out.println("Cliente "+name+" não pode ser cadastrado!\nIdade inválida!");
            System.out.println("=============================================");
        }
    }

    //set e get para o salario
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
        else {
            System.out.println("Idade inválida!");
        }
    }

    //método
    void status(){
        System.out.println("Nome: " + name);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " +age+" anos");
    }
}
