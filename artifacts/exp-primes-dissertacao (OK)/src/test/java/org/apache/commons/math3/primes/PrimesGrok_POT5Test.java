package org.apache.commons.math3.primes;

// {
//   "variables": [
//     { "name": "n", "role": "parâmetro" },
//     { "name": "rem", "role": "variável local" }
//   ],
//   "definitions": [
//     { "id": "D1", "variable": "n", "description": "definição como parâmetro formal" },
//     { "id": "D2", "variable": "n", "description": "redefinição por n | 1" },
//     { "id": "D3", "variable": "n", "description": "redefinições por n += 2 e n += 4" },
//     { "id": "D4", "variable": "rem", "description": "definição por n % 3" }
//   ],
//   "uses": [
//     { "id": "U1", "variable": "n", "type": "p-use", "description": "condições iniciais" },
//     { "id": "U2", "variable": "n", "type": "c-use", "description": "isPrime(n) e cálculos" },
//     { "id": "U3", "variable": "rem", "type": "p-use", "description": "condições rem == 0 e rem == 1" }
//   ],
//   "du_paths": [
//     { "id": "P1", "description": "retorno imediato antes do laço" },
//     { "id": "P2", "description": "entrada no laço e retorno na primeira verificação" },
//     { "id": "P3", "description": "execução de ao menos uma iteração completa do laço" }
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
//     "representative_loop_coverage": true
//   }
// }
// ```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.primes.Primes;

public class PrimesGrok_POT5Test {

    @Test
    void testNextPrime_T1() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    void testNextPrime_T2() {
        assertEquals(5, Primes.nextPrime(4));
    }

    @Test
    void testNextPrime_T3() {
        assertEquals(7, Primes.nextPrime(6));
    }
}
// ```