package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testCalcularIMC() {
        Pessoa pessoa = new Pessoa(70, 1.75); // peso = 70kg, altura = 1.75m
        double imcEsperado = 70 / (1.75 * 1.75);
        assertEquals(imcEsperado, pessoa.calcularIMC(), 0.01);
    }
}
