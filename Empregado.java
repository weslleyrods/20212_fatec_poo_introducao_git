

public class Empregado{

    //private é um modificador de acesso, que  cria um encapsulamento da variavel, para outra variavel não ter acesso
    private String nome;
    private int idade;

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


