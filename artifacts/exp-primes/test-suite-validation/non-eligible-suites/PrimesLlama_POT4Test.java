package org.apache.commons.math3.primes;

// ```json
{
  "semantic_roles": [
    {
      "name": "input_n",
      "description": "valor original fornecido ao método nextPrime"
    },
    {
      "name": "return_candidate",
      "description": "valor intermediário elegível ao retorno ao longo da execução"
    },
    {
      "name": "observable_return",
      "description": "valor efetivamente retornado por nextPrime(input_n)"
    }
  ],
  "variables": [
    { "name": "n", "role": "parâmetro derivado de input_n" },
    { "name": "rem", "role": "variável local" }
  ],
  "definitions": [
    {
      "id": "D1",
      "variable": "n",
      "description": "definição inicial a partir de input_n"
    },
    {
      "id": "D2",
      "variable": "n",
      "description": "redefinição por operação bitwise n | 1"
    },
    {
      "id": "D3",
      "variable": "n",
      "description": "redefinições sucessivas por n += 2 e n += 4"
    },
    {
      "id": "D4",
      "variable": "rem",
      "description": "definição por n % 3"
    }
  ],
  "uses": [
    {
      "id": "U1",
      "variable": "n",
      "type": "p-use",
      "description": "condições iniciais de decisão (n < 0, n == 2, n == 1)"
    },
    {
      "id": "U2",
      "variable": "n",
      "type": "c-use",
      "description": "chamadas isPrime(n) e operações aritméticas"
    },
    {
      "id": "U3",
      "variable": "rem",
      "type": "p-use",
      "description": "decisões de fluxo baseadas em rem == 0 e rem == 1"
    }
  ],
  "du_paths": [
    {
      "id": "P0",
      "description": "exceção lançada para input_n < 0",
      "post_condition": "observable_return não é definido"
    },
    {
      "id": "P1",
      "description": "retorno imediato para input_n == 2",
      "post_condition": "observable_return == 2"
    },
    {
      "id": "P2",
      "description": "retorno imediato para input_n == 1 após ajuste n | 1",
      "post_condition": "observable_return == 2"
    },
    {
      "id": "P3",
      "description": "retorno imediato quando isPrime(n) é verdadeiro antes do laço",
      "post_condition": "observable_return é o menor primo >= input_n"
    },
    {
      "id": "P4",
      "description": "ajuste inicial com rem == 0 (n += 2) antes do laço",
      "post_condition": "observable_return é o menor primo >= input_n"
    },
    {
      "id": "P5",
      "description": "ajuste inicial com rem == 1 (n += 4) antes do laço",
      "post_condition": "observable_return é o menor primo >= input_n"
    },
    {
      "id": "P6",
      "description": "entrada no laço sem ajuste inicial (rem == 2)",
      "post_condition": "observable_return é o menor primo >= input_n"
    },
    {
      "id": "P7",
      "description": "retorno na primeira verificação de isPrime(n) dentro do laço",
      "post_condition": "observable_return é o menor primo >= input_n"
    },
    {
      "id": "P8",
      "description": "retorno na segunda verificação após n += 2 dentro do laço",
      "post_condition": "observable_return é o menor primo >= input_n"
    },
    {
      "id": "P9",
      "description": "iteração completa do laço com n += 2 e n += 4 antes do retorno",
      "post_condition": "observable_return é o menor primo >= input_n"
    }
  ],
  "planned_tests": [
    {
      "test_id": "T0",
      "covers": ["P0"],
      "asserts": ["exceção lançada"]
    },
    {
      "test_id": "T1",
      "covers": ["P1"],
      "asserts": ["observable_return == 2"]
    },
    {
      "test_id": "T2",
      "covers": ["P2"],
      "asserts": ["observable_return == 2"]
    },
    {
      "test_id": "T3",
      "covers": ["P3"],
      "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
    },
    {
      "test_id": "T4",
      "covers": ["P4"],
      "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
    },
    {
      "test_id": "T5",
      "covers": ["P5"],
      "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
    },
    {
      "test_id": "T6",
      "covers": ["P6"],
      "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
    },
    {
      "test_id": "T7",
      "covers": ["P7"],
      "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
    },
    {
      "test_id": "T8",
      "covers": ["P8"],
      "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
    },
    {
      "test_id": "T9",
      "covers": ["P9"],
      "asserts": ["observable_return >= input_n", "isPrime(observable_return)"]
    }
  ],
  "constraints": {
    "no_intermediate_redefinition": true,
    "all_defs_covered": true,
    "all_uses_covered": true,
    "representative_loop_coverage": true,
    "observable_contract_preserved": true
  }
}
// ```

public class PrimesLlama_POT4Test { }
