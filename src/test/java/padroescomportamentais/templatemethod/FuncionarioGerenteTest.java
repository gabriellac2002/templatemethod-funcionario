package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioGerenteTest {

    @Test
    void deveRetornarElegivel() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(4000.0f);
        funcionario.setAdicional(1000.0f);
        assertEquals("Elegivel", funcionario.verificarBonus());
    }

    @Test
    void deveRetornarNaoElegivel() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(4000.0f);
        funcionario.setAdicional(999.0f);
        assertEquals("Nao Elegivel", funcionario.verificarBonus());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioGerente funcionario = new FuncionarioGerente();
        funcionario.setSalarioBase(4000.0f);
        funcionario.setAdicional(1000.0f);
        funcionario.setNome("Marco");
        funcionario.setMatricula(1);
        assertEquals("FuncionarioGerente{matricula=1, nome='Marco', resultado=Elegivel}", funcionario.getInfo());
    }
}
