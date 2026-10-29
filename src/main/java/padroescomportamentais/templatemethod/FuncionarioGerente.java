package padroescomportamentais.templatemethod;

public class FuncionarioGerente extends Funcionario {

    public String verificarBonus() {
        if (this.calcularSalarioTotal() >= 5000.0f) {
            return "Elegivel";
        }
        else {
            return "Nao Elegivel";
        }
    }

    @Override
    public String getTipo() {
        return "FuncionarioGerente";
    }
}
