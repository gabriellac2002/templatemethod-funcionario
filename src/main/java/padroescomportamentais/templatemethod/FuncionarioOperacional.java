package padroescomportamentais.templatemethod;

public class FuncionarioOperacional extends Funcionario {

    public String verificarBonus() {
        if (this.calcularSalarioTotal() >= 3000.0f) {
            return "Elegivel";
        }
        else {
            return "Nao Elegivel";
        }
    }

}
