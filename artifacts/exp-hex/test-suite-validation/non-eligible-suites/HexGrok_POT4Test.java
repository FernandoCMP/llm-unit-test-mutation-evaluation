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
//     },
//     {
//       "id": "U4",
//       "variable": "l",
//       "type": "c-use",
//       "description": "usado em l << 1 para tamanho de out e em i < l"
//     },
//     {
//       "id": "U5",
//       "variable": "i",
//       "type": "c-use",
//       "description": "incremento i++ no laço"
//     },
//     {
//       "id": "U6",
//       "variable": "j",
//       "type": "c-use",
//       "description": "incrementos j++ nas atribuições"
//     }
//   ],
//   "du_paths": [
//     {
//       "id": "P1",
//       "description": "D1-U2: entrada com array vazio, laço não executado, data acessado implicitamente via length",
//       "post_condition": "output_array com comprimento zero"
//     },
//     {
//       "id": "P2",
//       "description": "D2-U4: cálculo de l e uso em tamanho de out e condição do laço",
//       "post_condition": "output_array alocado com tamanho correto"
//     },
//     {
//       "id": "P3",
//       "description": "D3-U3: alocação de out e uso nas atribuições",
//       "post_condition": "output_array preenchido corretamente"
//     },
//     {
//       "id": "P4",
//       "description": "D4-U1, D4-U5: inicialização de i e uso na condição e incremento",
//       "post_condition": "laço executa corretamente"
//     },
//     {
//       "id": "P5",
//       "description": "D5-U6: inicialização de j e uso nos incrementos",
//       "post_condition": "índices de escrita corretos"
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
//       "covers": ["P2", "P3", "P4", "P5"],
//       "asserts": ["output_array.length == 2 * input_data.length", "conteúdo correto para um byte"]
//     },
//     {
//       "test_id": "T3",
//       "covers": ["P2", "P3", "P4", "P5"],
//       "asserts": ["output_array.length == 2 * input_data.length", "conteúdo correto para múltiplos bytes"]
//     }
//   ],
//   "constraints": {
//     "all_defs_covered": true,
//     "all_uses_covered": true,
//     "representative_loop_coverage": true,
//     "observable_contract_preserved": true
//   }
// }

public class HexGrok_POT4Test { }
