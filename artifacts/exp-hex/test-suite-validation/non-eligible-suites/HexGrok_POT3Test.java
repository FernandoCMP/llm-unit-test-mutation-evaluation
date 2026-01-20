package org.apache.commons.codec.binary;

// {
//   "semantic_roles": [
//     {
//       "name": "input_data",
//       "description": "array de bytes fornecido como entrada ao método encodeHex"
//     },
//     {
//       "name": "output_array",
//       "description": "array de caracteres resultante da codificação hexadecimal"
//     }
//   ],
//   "variables": [
//     { "name": "data", "role": "parâmetro formal de entrada" },
//     { "name": "l", "role": "tamanho do array de entrada" },
//     { "name": "out", "role": "array de saída" },
//     { "name": "i", "role": "controle do laço" },
//     { "name": "j", "role": "controle do índice de escrita" }
//   ],
//   "definitions": [
//     { "id": "D1", "variable": "data", "description": "definição inicial como parâmetro formal" },
//     { "id": "D2", "variable": "l", "description": "definição por data.length" },
//     { "id": "D3", "variable": "out", "description": "alocação do array de saída com tamanho l << 1" },
//     { "id": "D4", "variable": "i", "description": "inicialização do contador do laço" },
//     { "id": "D5", "variable": "j", "description": "inicialização do índice de escrita" }
//   ],
//   "uses": [
//     {
//       "id": "U1",
//       "variable": "i",
//       "type": "p-use",
//       "description": "condição do laço i < l"
//     },
//     {
//       "id": "U2",
//       "variable": "data",
//       "type": "c-use",
//       "description": "acesso a data[i] para operações bitwise"
//     },
//     {
//       "id": "U3",
//       "variable": "out",
//       "type": "c-use",
//       "description": "atribuições sucessivas no array de saída"
//     }
//   ],
//   "du_paths": [
//     {
//       "id": "P1",
//       "description": "entrada com array vazio, laço não executado",
//       "post_condition": "output_array com comprimento zero"
//     },
//     {
//       "id": "P2",
//       "description": "entrada com um único byte, uma iteração do laço",
//       "post_condition": "output_array com dois caracteres hexadecimais"
//     },
//     {
//       "id": "P3",
//       "description": "entrada com múltiplos bytes, múltiplas iterações do laço",
//       "post_condition": "output_array com comprimento igual a 2 * data.length"
//     }
//   ],
//   "planned_tests": [
//     {
//       "test_id": "T1",
//       "covers": ["P1"],
//       "asserts": ["output_array.length == 0"]
//     },
//     {
//       "test_id": "T2",
//       "covers": ["P2"],
//       "asserts": ["output_array.length == 2"]
//     },
//     {
//       "test_id": "T3",
//       "covers": ["P3"],
//       "asserts": ["output_array.length == 2 * input_data.length"]
//     }
//   ],
//   "constraints": {
//     "all_defs_covered": true,
//     "all_uses_covered": true,
//     "representative_loop_coverage": true,
//     "observable_contract_preserved": true
//   }
// }

public class HexGrok_POT3Test { }
