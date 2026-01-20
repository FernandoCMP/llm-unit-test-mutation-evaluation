package org.apache.commons.codec.binary;

// ```java
//{
//  "semantic_roles": [
//    {
//      "name": "input_data",
//      "description": "array de bytes fornecido como entrada ao método encodeHex"
//    },
//    {
//      "name": "output_array",
//      "description": "array de caracteres resultante da codificação hexadecimal"
//    }
//  ],
//  "variables": [
//    { "name": "data", "role": "parâmetro formal de entrada" },
//    { "name": "l", "role": "tamanho do array de entrada" },
//    { "name": "out", "role": "array de saída" },
//    { "name": "i", "role": "controle do laço" },
//    { "name": "j", "role": "controle do índice de escrita" }
//  ],
//  "definitions": [
//    { "id": "D1", "variable": "data", "description": "definição inicial como parâmetro formal" },
//    { "id": "D2", "variable": "l", "description": "definição por data.length" },
//    { "id": "D3", "variable": "out", "description": "alocação do array de saída com tamanho l << 1" },
//    { "id": "D4", "variable": "i", "description": "inicialização do contador do laço" },
//    { "id": "D5", "variable": "j", "description": "inicialização do índice de escrita" }
//  ],
//  "uses": [
//    {
//      "id": "U1",
//      "variable": "i",
//      "type": "p-use",
//      "description": "condição do laço i < l"
//    },
//    {
//      "id": "U2",
//      "variable": "data",
//      "type": "c-use",
//      "description": "acesso a data[i] para operações bitwise"
//    },
//    {
//      "id": "U3",
//      "variable": "out",
//      "type": "c-use",
//      "description": "atribuições sucessivas no array de saída"
//    }
//  ],
//  "du_paths": [
//    {
//      "id": "P1",
//      "description": "entrada com array vazio, laço não executado",
//      "post_condition": "output_array com comprimento zero"
//    },
//    {
//      "id": "P2",
//      "description": "entrada com um único byte, uma iteração do laço",
//      "post_condition": "output_array com dois caracteres hexadecimais"
//    },
//    {
//      "id": "P3",
//      "description": "entrada com múltiplos bytes, múltiplas iterações do laço",
//      "post_condition": "output_array com comprimento igual a 2 * data.length"
//    }
//  ],
//  "planned_tests": [
//    {
//      "test_id": "T1",
//      "covers": ["P1"],
//      "asserts": ["output_array.length == 0"]
//    },
//    {
//      "test_id": "T2",
//      "covers": ["P2"],
//      "asserts": ["output_array.length == 2"]
//    },
//    {
//      "test_id": "T3",
//      "covers": ["P3"],
//      "asserts": ["output_array.length == 2 * input_data.length"]
//    }
//  ],
//  "constraints": {
//    "all_defs_covered": true,
//    "all_uses_covered": true,
//    "representative_loop_coverage": true,
//    "observable_contract_preserved": true
//  }
//}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexQwen_POT1Test {

    @Test
    public void testEncodeHex_emptyArray() {
        byte[] input = new byte[0];
        char[] result = org.apache.commons.codec.binary.Hex.encodeHex(input);
        assertEquals(0, result.length);
    }

    @Test
    public void testEncodeHex_singleByte() {
        byte[] input = new byte[]{(byte) 0xAB};
        char[] result = org.apache.commons.codec.binary.Hex.encodeHex(input);
        assertEquals(2, result.length);
        assertEquals('a', result[0]);
        assertEquals('b', result[1]);
    }

    @Test
    public void testEncodeHex_multipleBytes() {
        byte[] input = new byte[]{(byte) 0xAB, (byte) 0xCD, (byte) 0xEF};
        char[] result = org.apache.commons.codec.binary.Hex.encodeHex(input);
        assertEquals(6, result.length);
        assertEquals('a', result[0]);
        assertEquals('b', result[1]);
        assertEquals('c', result[2]);
        assertEquals('d', result[3]);
        assertEquals('e', result[4]);
        assertEquals('f', result[5]);
    }
}
// ```