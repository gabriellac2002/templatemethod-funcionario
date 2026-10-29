package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioOperacionalTest {

    @Test
    void deveRetornarElegivel() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setSalarioBase(2500.0f);
        funcionario.setAdicional(500.0f);
        assertEquals("Elegivel", funcionario.verificarBonus());
    }

    @Test
    void deveRetornarNaoElegivel() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setSalarioBase(2500.0f);
        funcionario.setAdicional(499.0f);
        assertEquals("Nao Elegivel", funcionario.verificarBonus());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioOperacional funcionario = new FuncionarioOperacional();
        funcionario.setSalarioBase(2500.0f);
        funcionario.setAdicional(499.0f);
        funcionario.setNome("Marcelo");
        funcionario.setMatricula(2);
        assertEquals("Funcionario{matricula=2, nome='Marcelo', resultado=Nao Elegivel}", funcionario.getInfo());
    }
}
