public class Employee {
    private String name;
    private String position;
    private double salary;


    //construtor
    Employee(String name, String position, double salary){
        if(salary>0) {
            this.name = name;
            this.position = position;
            setSalary(salary);
        }
        else {
            System.out.println("=============================================");
            System.out.println("Funcionário "+name+" não pode ser cadastrado!\nO salário deve ser maior que 0!");
            System.out.println("=============================================");
        }
    }

    //set e get para o salario
    public void setSalary(double salary){
        if(salary>0){
            this.salary = salary;
        }
        else {
            System.out.println("O salário deve ser maior que 0!");
        }
    }

    //método
    void status(){
        System.out.println("Nome: " + name);
        System.out.println("Posição: " + position);
        System.out.println("Salário:$ " + salary);
    }
}
