package org.apache.commons.math3.primes;

// ```json
//{
//  "variables": [
//    { "name": "n", "role": "parâmetro" },
//    { "name": "rem", "role": "variável local" }
//  ],
//  "definitions": [
//    { "id": "D1", "variable": "n", "description": "definição como parâmetro formal" },
//    { "id": "D2", "variable": "n", "description": "redefinição por n | 1" },
//    { "id": "D3", "variable": "n", "description": "redefinições por n += 2 e n += 4" },
//    { "id": "D4", "variable": "rem", "description": "definição por n % 3" }
//  ],
//  "uses": [
//    { "id": "U1", "variable": "n", "type": "p-use", "description": "condições iniciais (n < 0, n == 2, n == 1)" },
//    { "id": "U2", "variable": "n", "type": "c-use", "description": "isPrime(n) e cálculos" },
//    { "id": "U3", "variable": "rem", "type": "p-use", "description": "condições rem == 0 e rem == 1" }
//  ],
//  "du_paths": [
//    { "id": "P1", "description": "retorno imediato antes do laço (n == 2 ou n == 1)" },
//    { "id": "P2", "description": "retorno imediato após verificar se n é primo" },
//    { "id": "P3", "description": "execução de ao menos uma iteração completa do laço" }
//  ],
//  "planned_tests": [
//    { "test_id": "T1", "covers": ["P1"] },
//    { "test_id": "T2", "covers": ["P2"] },
//    { "test_id": "T3", "covers": ["P3"] }
//  ],
//  "constraints": {
//    "no_intermediate_redefinition": true,
//    "all_defs_covered": true,
//    "all_uses_covered": true,
//    "representative_loop_coverage": true
//  }
//}
// ```
// 
// ```java
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimesLlama_POT5Test {

    @Test
    public void testNextPrime_BeforeLoop() {
        assertEquals(2, Primes.nextPrime(1));
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_PrimeNumber() {
        assertEquals(3, Primes.nextPrime(3));
        assertEquals(5, Primes.nextPrime(5));
    }

    @Test
    public void testNextPrime_LoopExecution() {
        assertEquals(5, Primes.nextPrime(4));
        assertEquals(7, Primes.nextPrime(6));
    }

    @Test
    public void testNextPrime_NegativeNumber() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }
}
// ```
