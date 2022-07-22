package desafiodecodigo;

public class Empregado {
    String nome;
    String sobrenome;
    double salario;
    public Empregado(String nome, String sobrenome, double salario) {
        if (salario > 0.0){
            salario = salario;
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) {this.salario = salario;}
    double salarioComDezporcento(){
        return salario / 100 * 10;
    }
}
