package org.apache.commons.lang3;

// ```json
{
  "semantic_roles": [
    {
      "name": "input_str",
      "description": "string de entrada fornecida ao método squeeze"
    },
    {
      "name": "input_set",
      "description": "conjunto de caracteres fornecido ao método squeeze"
    },
    {
      "name": "observable_return",
      "description": "string efetivamente retornada por squeeze(input_str, input_set)"
    }
  ],
  "variables": [
    { "name": "str", "role": "parâmetro formal" },
    { "name": "set", "role": "parâmetro formal (varargs)" },
    { "name": "chars", "role": "estrutura de conjunto de caracteres" },
    { "name": "buffer", "role": "acumulador de saída" },
    { "name": "chrs", "role": "array de caracteres de str" },
    { "name": "sz", "role": "tamanho do array chrs" },
    { "name": "lastChar", "role": "estado do caractere anterior" },
    { "name": "ch", "role": "caractere atual do laço" },
    { "name": "i", "role": "contador do laço" }
  ],
  "definitions": [
    { "id": "D1", "variable": "str", "description": "definição inicial como parâmetro formal" },
    { "id": "D2", "variable": "set", "description": "definição inicial como parâmetro formal" },
    { "id": "D3", "variable": "chars", "description": "definição por CharSet.getInstance(set)" },
    { "id": "D4", "variable": "buffer", "description": "definição por new StringBuilder(str.length())" },
    { "id": "D5", "variable": "chrs", "description": "definição por str.toCharArray()" },
    { "id": "D6", "variable": "sz", "description": "definição por chrs.length" },
    { "id": "D7", "variable": "lastChar", "description": "definição inicial literal" },
    { "id": "D8", "variable": "lastChar", "description": "redefinição por lastChar = ch" },
    { "id": "D9", "variable": "ch", "description": "redefinição em cada iteração do laço" },
    { "id": "D10", "variable": "i", "description": "definição inicial do laço" },
    { "id": "D11", "variable": "i", "description": "redefinição implícita por incremento do laço" }
  ],
  "uses": [
    { "id": "U1", "variable": "str", "type": "p-use", "description": "StringUtils.isEmpty(str)" },
    { "id": "U2", "variable": "set", "type": "p-use", "description": "deepEmpty(set)" },
    { "id": "U3", "variable": "i", "type": "p-use", "description": "condição do laço i < sz" },
    { "id": "U4", "variable": "i", "type": "p-use", "description": "condição i != 0" },
    { "id": "U5", "variable": "ch", "type": "p-use", "description": "comparação ch == lastChar" },
    { "id": "U6", "variable": "chars", "type": "p-use", "description": "chars.contains(ch)" },
    { "id": "U7", "variable": "ch", "type": "c-use", "description": "buffer.append(ch)" },
    { "id": "U8", "variable": "ch", "type": "c-use", "description": "atribuição a lastChar" },
    { "id": "U9", "variable": "buffer", "type": "c-use", "description": "buffer.toString()" }
  ],
  "du_paths": [
    {
      "id": "P0",
      "description": "retorno imediato quando str é nula ou vazia",
      "post_condition": "observable_return == input_str"
    },
    {
      "id": "P1",
      "description": "retorno imediato quando set é nulo ou vazio",
      "post_condition": "observable_return == input_str"
    },
    {
      "id": "P2",
      "description": "iteração do laço sem acionamento do continue",
      "post_condition": "buffer acumulado com todos os caracteres"
    },
    {
      "id": "P3",
      "description": "iteração do laço com acionamento do continue (remoção de repetição)",
      "post_condition": "caractere repetido não é adicionado ao buffer"
    }
  ],
  "planned_tests": [
    { "test_id": "T0", "covers": ["P0"], "asserts": ["observable_return == input_str"] },
    { "test_id": "T1", "covers": ["P1"], "asserts": ["observable_return == input_str"] },
    { "test_id": "T2", "covers": ["P2"], "asserts": ["observable_return == input_str ou equivalente"] },
    { "test_id": "T3", "covers": ["P3"], "asserts": ["remoção correta de repetições consecutivas"] }
  ],
  "constraints": {
    "all_defs_covered": true,
    "all_uses_covered": true,
    "representative_loop_coverage": true,
    "observable_contract_preserved": true
  }
}
// ```

public class CharSetUtilsLlama_POT1Test { }
