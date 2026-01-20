package org.apache.commons.math3.primes;

// {
//   "semantic_roles": [
//     {
//       "name": "input_n",
//       "description": "valor original fornecido ao método nextPrime"
//     },
//     {
//       "name": "return_candidate",
//       "description": "valor intermediário elegível ao retorno ao longo da execução"
//     },
//     {
//       "name": "observable_return",
//       "description": "valor efetivamente retornado por nextPrime(input_n)"
//     }
//   ],
//   "variables": [
//     { "name": "n", "role": "parâmetro derivado de input_n" },
//     { "name": "rem", "role": "variável local" }
//   ],
//   "definitions": [
//     {
//       "id": "D1",
//       "variable": "n",
//       "description": "definição inicial a partir de input_n"
//     },
//     {
//       "id": "D2",
//       "variable": "n",
//       "description": "redefinição por operação bitwise n | 1"
//     },
//     {
//       "id": "D3",
//       "variable": "n",
//       "description": "redefinições sucessivas por n += 2 e n += 4"
//     },
//     {
//       "id": "D4",
//       "variable": "rem",
//       "description": "definição por n % 3"
//     }
//   ],
//   "uses": [
//     {
//       "id": "U1",
//       "variable": "n",
//       "type": "p-use",
//       "description": "condições iniciais de decisão (n < 0, n == 2, n == 1)"
//     },
//     {
//       "id": "U2",
//       "variable": "n",
//       "type": "c-use",
//       "description": "chamadas isPrime(n) e operações aritméticas"
//     },
//     {
//       "id": "U3",
//       "variable": "rem",
//       "type": "p-use",
//       "description": "decisões de fluxo baseadas em rem == 0 e rem == 1"
//     }
//   ],
//   "du_paths": [
//     {
//       "id": "P0",
//       "description": "exceção lançada para input_n < 0",
//       "post_condition": "observable_return não é definido"
//     },
//     {
//       "id": "P1",
//       "description": "retorno imediato para input_n == 2",
//       "post_condition": "observable_return == 2"
//     },
//     {
//       "id": "P2",
//       "description": "retorno imediato para input_n == 1 após ajuste n | 1",
//       "post_condition": "observable_return == 2"
//     },
//     {
//       "id": "P3",
//       "description": "retorno imediato quando isPrime(n) é verdadeiro antes do laço",
//       "post_condition": "observable_return é o menor primo >= input_n"
//     },
//     {
//       "id": "P4",
//       "description": "ajuste inicial com rem == 0 (n += 2) antes do laço",
//       "post_condition": "observable_return é o menor primo >= input_n"
//     },
//     {
//       "id": "P5",
//       "description": "ajuste inicial com rem == 1 (n += 4) antes do laço",
//       "post_condition": "observable_return é o menor primo >= input_n"
//     },
//     {
//       "id": "P6",
//       "description": "entrada no laço sem ajuste inicial (rem == 2)",
//       "post_condition": "observable_return é o menor primo >= input_n"
//     },
//     {
//       "id": "P7",
//       "description": "retorno na primeira verificação de isPrime(n) dentro do laço",
//       "post_condition": "observable_return é o menor primo >= input_n"
//     },
//     {
//       "id": "P8",
//       "description": "retorno na segunda verificação após n += 2 dentro do laço",
//       "post_condition": "observable_return é o menor primo >= input_n"
//     },
//     {
//       "id": "P9",
//       "description": "iteração completa do laço com n += 2 e n += 4 antes do retorno",
//       "post_condition": "observable_return é o menor primo >= input_n"
//     }
//   ],
//   "planned_tests": [
//     {
//       "test_id": "T0",
//       "covers": ["P0"],
//       "asserts": ["exceção lançada"]
//     },
//     {
//       "test_id": "T1",
//       "covers": ["P1"],
//       "asserts": ["observable_return == 2"]
//     },
//     {
//       "test_id": "T2",
//       "covers": ["P2"],
//       "asserts": ["observable_return == 2"]
//     },
//     {
//       "test_id": "T3",
//       "covers": ["P3"],
//       "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
//     },
//     {
//       "test_id": "T4",
//       "covers": ["P4"],
//       "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
//     },
//     {
//       "test_id": "T5",
//       "covers": ["P5"],
//       "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
//     },
//     {
//       "test_id": "T6",
//       "covers": ["P6"],
//       "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
//     },
//     {
//       "test_id": "T7",
//       "covers": ["P7"],
//       "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
//     },
//     {
//       "test_id": "T8",
//       "covers": ["P8"],
//       "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
//     },
//     {
//       "test_id": "T9",
//       "covers": ["P9"],
//       "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
//     }
//   ],
//   "constraints": {
//     "no_intermediate_redefinition": true,
//     "all_defs_covered": true,
//     "all_uses_covered": true,
//     "representative_loop_coverage": true,
//     "observable_contract_preserved": true
//   }
// }
// ```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.primes.Primes;

public class PrimesGrok_POT5Test {

    @Test
    void testNextPrime_ExceptionNegative() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    void testNextPrime_ReturnTwoForTwo() {
        int result = Primes.nextPrime(2);
        assertEquals(2, result);
    }

    @Test
    void testNextPrime_ReturnTwoForOne() {
        int result = Primes.nextPrime(1);
        assertEquals(2, result);
    }

    @Test
    void testNextPrime_ImmediateReturnPrime() {
        int n = 3;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n);
        assertTrue(Primes.isPrime(result));
        assertEquals(3, result);
    }

    @Test
    void testNextPrime_AdjustRemZero() {
        int n = 9; // 9 | 1 = 9, 9 % 3 == 0, n += 2 -> 11
        int result = Primes.nextPrime(n);
        assertTrue(result >= n);
        assertTrue(Primes.isPrime(result));
        assertEquals(11, result);
    }

    @Test
    void testNextPrime_AdjustRemOne() {
        int n = 7; // 7 | 1 = 7, 7 % 3 == 1, n += 4 -> 11
        int result = Primes.nextPrime(n);
        assertTrue(result >= n);
        assertTrue(Primes.isPrime(result));
        assertEquals(11, result);
    }

    @Test
    void testNextPrime_NoAdjustRemTwo() {
        int n = 5; // 5 | 1 = 5, 5 % 3 == 2, entra no laço
        int result = Primes.nextPrime(n);
        assertTrue(result >= n);
        assertTrue(Primes.isPrime(result));
        assertEquals(5, result);
    }

    @Test
    void testNextPrime_ReturnFirstInLoop() {
        int n = 8; // 8 | 1 = 9, 9 % 3 == 0, n += 2 -> 11, entra laço, isPrime(11) true
        int result = Primes.nextPrime(n);
        assertTrue(result >= n);
        assertTrue(Primes.isPrime(result));
        assertEquals(11, result);
    }

    @Test
    void testNextPrime_ReturnSecondInLoop() {
        int n = 10; // 10 | 1 = 11, isPrime(11) true, mas para entrar laço: n=10, 10|1=11, isPrime(11) true, retorna imediatamente. Para P8: precisa entrar laço.
        // Para cobrir retorno na segunda verificação: n tal que primeiro isPrime false, n+=2, segundo true.
        // Ex: n=14, 14|1=15, 15%3=0, n+=2=17, entra laço, isPrime(17) true (primeira no laço)
        // Para segunda: n=17, já primo. n=19, primo. n=21, 21|1=21, 21%3=0, n+=2=23, entra laço, isPrime(23) true.
        // Para segunda: precisa que isPrime(n) false, n+=2, isPrime(n) true.
        // Ex: n=25, 25|1=25, 25%3=1, n+=4=29, entra laço, isPrime(29) true.
        // Para segunda: n=23, já primo. n=27, 27|1=27, 27%3=0, n+=2=29, entra laço, isPrime(29) true.
        // Para segunda: n=31, primo. n=33, 33|1=33, 33%3=0, n+=2=35, entra laço, isPrime(35) false, n+=2=37, isPrime(37) true.
        int n = 33;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n);
        assertTrue(Primes.isPrime(result));
        assertEquals(37, result);
    }

    @Test
    void testNextPrime_FullLoopIteration() {
        int n = 35; // 35|1=35, 35%3=2, entra laço, isPrime(35) false, n+=2=37, isPrime(37) true, mas para full: precisa de mais iterações.
        // Para P9: iteração completa com n+=2 e n+=4.
        // Ex: n=49, 49|1=49, 49%3=1, n+=4=53, entra laço, isPrime(53) true.
        // Para full: n=55, 55|1=55, 55%3=1, n+=4=59, entra laço, isPrime(59) true.
        // Para forçar mais: n=77, 77|1=77, 77%3=2, entra laço, isPrime(77) false, n+=2=79, isPrime(79) true.
        // Para full: n=89, primo. n=91, 91|1=91, 91%3=1, n+=4=95, entra laço, isPrime(95) false, n+=2=97, isPrime(97) true.
        int n = 91;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n);
        assertTrue(Primes.isPrime(result));
        assertEquals(97, result);
    }
}
// ```