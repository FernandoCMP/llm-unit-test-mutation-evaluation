package com.thealgorithms.strings;

// {
//   "variables": [
//     { "name": "a", "role": "parâmetro" },
//     { "name": "b", "role": "parâmetro" },
//     { "name": "m", "role": "array de frequência de a" },
//     { "name": "n", "role": "array de frequência de b" },
//     { "name": "c", "role": "variável de iteração" },
//     { "name": "i", "role": "controle de laço" }
//   ],
//   "definitions": [
//     { "id": "D1", "variable": "a", "description": "definição como parâmetro formal" },
//     { "id": "D2", "variable": "b", "description": "definição como parâmetro formal" },
//     { "id": "D3", "variable": "m", "description": "alocação new int[26]" },
//     { "id": "D4", "variable": "m", "description": "incrementos m[c - 'a']++" },
//     { "id": "D5", "variable": "n", "description": "alocação new int[26]" },
//     { "id": "D6", "variable": "n", "description": "incrementos n[c - 'a']++" },
//     { "id": "D7", "variable": "c", "description": "iteração sobre a" },
//     { "id": "D8", "variable": "c", "description": "iteração sobre b" },
//     { "id": "D9", "variable": "i", "description": "controle do laço for" }
//   ],
//   "uses": [
//     { "id": "U1", "variable": "a,b", "type": "p-use", "description": "a.length() != b.length()" },
//     { "id": "U2", "variable": "a", "type": "c-use", "description": "a.length(), a.toCharArray()" },
//     { "id": "U3", "variable": "b", "type": "c-use", "description": "b.length(), b.toCharArray()" },
//     { "id": "U4", "variable": "m", "type": "c-use", "description": "m[c - 'a'], m[i]" },
//     { "id": "U5", "variable": "n", "type": "c-use", "description": "n[c - 'a'], n[i]" },
//     { "id": "U6", "variable": "i", "type": "p-use", "description": "i < 26" },
//     { "id": "U7", "variable": "m,n", "type": "p-use", "description": "m[i] != n[i]" }
//   ],
//   "du_paths": [
//     { "id": "P1", "description": "retorno imediato por tamanhos diferentes" },
//     { "id": "P2", "description": "tamanhos iguais, frequências coincidem em todas as posições" },
//     { "id": "P3", "description": "tamanhos iguais, divergência em ao menos uma posição do array" }
//   ],
//   "planned_tests": [
//     { "test_id": "T1", "covers": ["P1"] },
//     { "test_id": "T2", "covers": ["P2"] },
//     { "test_id": "T3", "covers": ["P3"] }
//   ],
//   "constraints": {
//     "no_intermediate_redefinition": true,
//     "all_defs_covered": true,
//     "all_uses_covered": true,
//     "complete_loop_evaluation": true
//   }
// }
// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramsGrok_POT1Test {
    private final Anagrams anagrams = new Anagrams();

    @Test
    void testApproach2_DifferentLengths() {
        assertFalse(anagrams.approach2("a", "ab"));
    }

    @Test
    void testApproach2_SameFrequencies() {
        assertTrue(anagrams.approach2("listen", "silent"));
    }

    @Test
    void testApproach2_DifferentFrequencies() {
        assertFalse(anagrams.approach2("hello", "world"));
    }
}
// ```