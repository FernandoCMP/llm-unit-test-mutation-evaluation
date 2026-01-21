package org.apache.commons.codec.binary;

// ```json
{
  "semantic_roles": [
    {
      "name": "input_raw",
      "description": "array de bytes fornecido como entrada ao método toAsciiBytes"
    },
    {
      "name": "observable_return",
      "description": "array de bytes retornado por toAsciiBytes(input_raw)"
    }
  ],
  "variables": [
    { "name": "raw", "role": "parâmetro formal de entrada" },
    { "name": "l_ascii", "role": "array de saída" },
    { "name": "ii", "role": "controle do laço externo" },
    { "name": "jj", "role": "controle auxiliar decrescente" },
    { "name": "bits", "role": "controle do laço interno" }
  ],
  "definitions": [
    { "id": "D1", "variable": "raw", "description": "definição inicial como parâmetro formal" },
    { "id": "D2", "variable": "l_ascii", "description": "alocação do array de saída com tamanho raw.length << 3" },
    { "id": "D3", "variable": "ii", "description": "inicialização e redefinição por incremento no laço externo" },
    { "id": "D4", "variable": "jj", "description": "inicialização e redefinição por decremento no laço externo" },
    { "id": "D5", "variable": "bits", "description": "inicialização e redefinição por incremento no laço interno" }
  ],
  "uses": [
    {
      "id": "U1",
      "variable": "raw",
      "type": "p-use",
      "description": "verificação de entrada nula ou array vazio (raw == null || raw.length == 0)"
    },
    {
      "id": "U2",
      "variable": "raw",
      "type": "c-use",
      "description": "operação bitwise para extração de bits (raw[ii] & BITS[bits])"
    },
    {
      "id": "U3",
      "variable": "ii",
      "type": "p-use",
      "description": "condição do laço externo (ii < raw.length)"
    },
    {
      "id": "U4",
      "variable": "bits",
      "type": "p-use",
      "description": "condição do laço interno (bits < BITS.length)"
    },
    {
      "id": "U5",
      "variable": "jj",
      "type": "c-use",
      "description": "indexação do array de saída (jj - bits)"
    }
  ],
  "du_paths": [
    {
      "id": "P0",
      "description": "p-use inicial verdadeiro: raw é nulo ou vazio",
      "post_condition": "observable_return é um array vazio"
    },
    {
      "id": "P1",
      "description": "execução completa dos laços com raw contendo um único byte",
      "post_condition": "observable_return possui tamanho igual a 8"
    },
    {
      "id": "P2",
      "description": "execução completa dos laços com raw contendo múltiplos bytes",
      "post_condition": "observable_return possui tamanho igual a 8 * raw.length"
    },
    {
      "id": "P3",
      "description": "ramificação do p-use ((raw[ii] & BITS[bits]) == 0)",
      "post_condition": "posição correspondente em l_ascii recebe o valor '0'"
    },
    {
      "id": "P4",
      "description": "ramificação do p-use ((raw[ii] & BITS[bits]) != 0)",
      "post_condition": "posição correspondente em l_ascii recebe o valor '1'"
    }
  ],
  "planned_tests": [
    {
      "test_id": "T0",
      "covers": ["P0"],
      "asserts": ["tamanho do retorno == 0"]
    },
    {
      "test_id": "T1",
      "covers": ["P1", "P3", "P4"],
      "asserts": ["tamanho do retorno == 8"]
    },
    {
      "test_id": "T2",
      "covers": ["P2", "P3", "P4"],
      "asserts": ["tamanho do retorno == 8 * input_raw.length"]
    }
  ],
  "constraints": {
    "all_defs_covered": true,
    "all_uses_covered": true,
    "representative_loop_coverage": true,
    "observable_contract_preserved": true
  }
}
// ```

public class BinaryCodecLlama_POT5Test { }
