package com.thealgorithms.maths;

// {
//   "semantic_roles": [
//     {
//       "name": "input_radius",
//       "description": "valor original fornecido ao parâmetro radius"
//     },
//     {
//       "name": "input_height",
//       "description": "valor original fornecido ao parâmetro height"
//     },
//     {
//       "name": "observable_return",
//       "description": "valor efetivamente retornado por surfaceAreaCone(input_radius, input_height)"
//     }
//   ],
//   "variables": [
//     { "name": "radius", "role": "parâmetro de entrada" },
//     { "name": "height", "role": "parâmetro de entrada" }
//   ],
//   "definitions": [
//     {
//       "id": "D1",
//       "variable": "radius",
//       "description": "definição inicial a partir de input_radius"
//     },
//     {
//       "id": "D2",
//       "variable": "height",
//       "description": "definição inicial a partir de input_height"
//     }
//   ],
//   "uses": [
//     {
//       "id": "U1",
//       "variable": "radius",
//       "type": "p-use",
//       "description": "verificação de validade (radius <= 0)"
//     },
//     {
//       "id": "U2",
//       "variable": "height",
//       "type": "p-use",
//       "description": "verificação de validade (height <= 0)"
//     },
//     {
//       "id": "U3",
//       "variable": "radius",
//       "type": "c-use",
//       "description": "cálculo da área superficial no retorno"
//     },
//     {
//       "id": "U4",
//       "variable": "height",
//       "type": "c-use",
//       "description": "cálculo da geratriz e da área superficial no retorno"
//     }
//   ],
//   "du_paths": [
//     {
//       "id": "P0",
//       "description": "exceção lançada quando radius <= 0",
//       "post_condition": "observable_return não é definido"
//     },
//     {
//       "id": "P1",
//       "description": "exceção lançada quando height <= 0 e radius > 0",
//       "post_condition": "observable_return não é definido"
//     },
//     {
//       "id": "P2",
//       "description": "retorno normal com radius > 0 e height > 0",
//       "post_condition": "observable_return == Math.PI * radius * (radius + sqrt(height^2 + radius^2))"
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
//       "asserts": ["exceção lançada"]
//     },
//     {
//       "test_id": "T2",
//       "covers": ["P2"],
//       "asserts": ["observable_return > 0"]
//     }
//   ],
//   "constraints": {
//     "all_defs_covered": true,
//     "all_uses_covered": true,
//     "exception_paths_covered": true,
//     "observable_contract_preserved": true
//   }
// }

public class AreaQwen_POT1Test { }
