package padroescomportamentais.templatemethod;

public abstract class Funcionario {

    private int matricula;
    protected String nome;
    private float salarioBase;
    private float adicional;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    public float calcularSalarioTotal() {
        return this.salarioBase + this.adicional;
    }

    public abstract String verificarBonus();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.matricula +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarBonus() +
                '}';
    }
}
