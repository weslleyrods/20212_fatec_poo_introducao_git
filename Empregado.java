

public class Empregado{

    //private é um modificador de acesso, que  cria um encapsulamento da variavel, para outra variavel não ter acesso
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    //os metodos abaixo nao precisaram do get, porque nao precisaram do previlegio de leitura
    //como os demais
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    public void setBonus (double bonus){
        this.bonus = bonus;
    }

    //metodo p/ a variavel tipo ser acessada no TesteEmpregado
    //porque a variavel esta como private
    public void setTipo (int tipo){
        this.tipo = tipo;
    }
    public int getTipo(){
        return this.tipo;
    }

    public double calculaSalario(){
        if (tipo == 1){
            return salario;
        }
        else if (tipo == 2){
            return salario + salario * comissao;
        }
        else if (tipo == 3){
            return salario + bonus;
        }
        return 0;
    }


    //método/função para acesso das váriaveis acima por meio indireto
    //setName escrito em pad~rao camel case
    //método seter, o uso this.nome é para apontar para a váriavel acima
    //diferente do (String nome), que aponta pra variavel nome dentro do método
    public void setNome (String nome){  
        this.nome = nome;
    }

    //metodo para devolver a string
    public String getNome(){
        return this.nome;
    }

    public void setIdade (int idade){  
        this.idade = idade;
    }

    //metodo para devolver o int
    public int getIdade(){
        return this.idade;
    }
}


