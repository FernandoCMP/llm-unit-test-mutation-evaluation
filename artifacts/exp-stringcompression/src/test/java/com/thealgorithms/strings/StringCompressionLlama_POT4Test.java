package com.thealgorithms.strings;

// ```json
//{
//  "variables": [
//    { "name": "input", "role": "parâmetro" },
//    { "name": "count", "role": "variável local" },
//    { "name": "compressedString", "role": "variável local" },
//    { "name": "i", "role": "variável de controle" }
//  ],
//  "definitions": [
//    { "id": "D1", "variable": "input", "description": "definição inicial como parâmetro formal" },

//    { "id": "D2", "variable": "count", "description": "definição inicial com valor 1" },
//    { "id": "D3", "variable": "count", "description": "redefinição por incremento aritmético (count = count + 1)" },
//    { "id": "D4", "variable": "count", "description": "redefinição explícita para reinício da contagem (count = 1)" },

//    { "id": "D5", "variable": "compressedString", "description": "definição inicial como string vazia" },
//    { "id": "D6", "variable": "compressedString", "description": "redefinição por retorno de appendCount(compressedString, count, ch)" },
//    { "id": "D7", "variable": "compressedString", "description": "redefinição por concatenação com caractere final" },

//    { "id": "D8", "variable": "i", "description": "definição inicial no laço for (i = 0)" },
//    { "id": "D9", "variable": "i", "description": "redefinição por incremento do laço (i++)" }
//  ],
//  "uses": [
//    { "id": "U1", "variable": "input", "type": "p-use", "description": "verificação de comprimento igual a 1 (input.length() == 1)" },
//    { "id": "U2", "variable": "input", "type": "p-use", "description": "comparação de caracteres adjacentes (input.charAt(i) == input.charAt(i + 1))" },
//    { "id": "U3", "variable": "input", "type": "p-use", "description": "verificação de último índice ((i + 1) == input.length() - 1)" },
//    { "id": "U4", "variable": "i", "type": "p-use", "description": "condição do laço (i < input.length() - 1)" },

//    { "id": "U5", "variable": "input", "type": "c-use", "description": "uso em input.length()" },
//    { "id": "U6", "variable": "input", "type": "c-use", "description": "uso em input.charAt(0)" },
//    { "id": "U7", "variable": "input", "type": "c-use", "description": "uso em input.charAt(i)" },
//    { "id": "U8", "variable": "input", "type": "c-use", "description": "uso em input.charAt(i + 1)" },

//    { "id": "U9", "variable": "count", "type": "c-use", "description": "uso em incremento aritmético" },
//    { "id": "U10", "variable": "count", "type": "c-use", "description": "uso como argumento em appendCount" },

//    { "id": "U11", "variable": "compressedString", "type": "c-use", "description": "uso como argumento em appendCount" },
//    { "id": "U12", "variable": "compressedString", "type": "c-use", "description": "atribuição do retorno de appendCount" },
//    { "id": "U13", "variable": "compressedString", "type": "c-use", "description": "concatenação com caractere final" },
//    { "id": "U14", "variable": "compressedString", "type": "c-use", "description": "retorno do método" },

//    { "id": "U15", "variable": "i", "type": "c-use", "description": "uso em expressão aritmética (i + 1)" },
//    { "id": "U16", "variable": "i", "type": "c-use", "description": "incremento do laço (i++)" }
//  ],
//  "du_paths": [
//    { "id": "P1", "description": "retorno imediato para string de tamanho 1" },
//    { "id": "P2", "description": "compressão com sequência de caracteres repetidos" },
//    { "id": "P3", "description": "compressão com alternância de caracteres" },
//    { "id": "P4", "description": "compressão envolvendo último caractere fora da repetição" }
//  ],
//  "planned_tests": [
//    { "test_id": "T1", "covers": ["P1"] },
//    { "test_id": "T2", "covers": ["P2"] },
//    { "test_id": "T3", "covers": ["P3"] },
//    { "test_id": "T4", "covers": ["P4"] }
//  ],
//  "constraints": {
//    "all_defs_covered": true,
//    "all_p_uses_covered": true,
//    "all_c_uses_covered": true,
//    "all_uses_covered": true,
//    "loop_coverage": "partial_and_complete"
//  }
//}
// ```
// 
// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompressionLlama_POT4Test {

    @Test
    public void testCompress_SingleCharacter() {
        String input = "a";
        String expected = "a";
        String result = StringCompression.compress(input);
        assertEquals(expected, result);
    }

    @Test
    public void testCompress_RepeatedCharacters() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = StringCompression.compress(input);
        assertEquals(expected, result);
    }

    @Test
    public void testCompress_AlternatingCharacters() {
        String input = "ababab";
        String expected = "ababab";
        String result = StringCompression.compress(input);
        assertEquals(expected, result);
    }

    @Test
    public void testCompress_LastCharacterNotRepeated() {
        String input = "aabcc";
        String expected = "a2bc2";
        String result = StringCompression.compress(input);
        assertEquals(expected, result);
    }
}
// ```
