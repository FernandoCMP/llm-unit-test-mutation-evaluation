package com.thealgorithms.maths;

// {
//   "semantic_roles": [
//     {
//       "name": "input_matrix1",
//       "description": "primeira matriz fornecida como entrada"
//     },
//     {
//       "name": "input_matrix2",
//       "description": "segunda matriz fornecida como entrada"
//     },
//     {
//       "name": "computed_cell",
//       "description": "valor acumulado do produto escalar de uma célula"
//     },
//     {
//       "name": "observable_return",
//       "description": "matriz resultante encapsulada em Optional"
//     }
//   ],
//   "variables": [
//     { "name": "matrix1", "role": "parâmetro de entrada" },
//     { "name": "matrix2", "role": "parâmetro de entrada" },
//     { "name": "size", "role": "controle do laço interno" },
//     { "name": "matrix1RowSize", "role": "controle do laço externo" },
//     { "name": "matrix2ColumnSize", "role": "controle do laço intermediário" },
//     { "name": "result", "role": "estrutura de saída" },
//     { "name": "rowIndex", "role": "índice de linha" },
//     { "name": "columnIndex", "role": "índice de coluna" },
//     { "name": "index", "role": "índice do produto escalar" },
//     { "name": "value1", "role": "operando da multiplicação" },
//     { "name": "value2", "role": "operando da multiplicação" }
//   ],
//   "definitions": [
//     { "id": "D1", "variable": "matrix1", "description": "definição inicial como parâmetro" },
//     { "id": "D2", "variable": "matrix2", "description": "definição inicial como parâmetro" },
//     { "id": "D3", "variable": "size", "description": "matrix1[0].length" },
//     { "id": "D4", "variable": "matrix1RowSize", "description": "matrix1.length" },
//     { "id": "D5", "variable": "matrix2ColumnSize", "description": "matrix2[0].length" },
//     { "id": "D6", "variable": "result", "description": "alocação da matriz resultante" },
//     { "id": "D7", "variable": "rowIndex", "description": "controle do laço externo" },
//     { "id": "D8", "variable": "columnIndex", "description": "controle do laço intermediário" },
//     { "id": "D9", "variable": "index", "description": "controle do laço interno" },
//     { "id": "D10", "variable": "value1", "description": "matrix1[rowIndex][index]" },
//     { "id": "D11", "variable": "value2", "description": "matrix2[index][columnIndex]" }
//   ],
//   "uses": [
//     {
//       "id": "U1",
//       "variable": "matrix1",
//       "type": "p-use",
//       "description": "verificação de compatibilidade via canMultiply"
//     },
//     {
//       "id": "U2",
//       "variable": "matrix2",
//       "type": "p-use",
//       "description": "verificação de compatibilidade via canMultiply"
//     },
//     {
//       "id": "U3",
//       "variable": "matrix1",
//       "type": "c-use",
//       "description": "matrix1[0].length"
//     },
//     {
//       "id": "U4",
//       "variable": "matrix1",
//       "type": "c-use",
//       "description": "matrix1.length"
//     },
//     {
//       "id": "U5",
//       "variable": "matrix2",
//       "type": "c-use",
//       "description": "matrix2[0].length"
//     },
//     {
//       "id": "U6",
//       "variable": "matrix1",
//       "type": "c-use",
//       "description": "matrix1[rowIndex][index]"
//     },
//     {
//       "id": "U7",
//       "variable": "matrix2",
//       "type": "c-use",
//       "description": "matrix2[index][columnIndex]"
//     },
//     {
//       "id": "U8",
//       "variable": "size",
//       "type": "p-use",
//       "description": "condição do laço interno"
//     },
//     {
//       "id": "U9",
//       "variable": "matrix1RowSize",
//       "type": "p-use",
//       "description": "condição do laço externo"
//     },
//     {
//       "id": "U10",
//       "variable": "matrix2ColumnSize",
//       "type": "p-use",
//       "description": "condição do laço intermediário"
//     },
//     {
//       "id": "U11",
//       "variable": "size",
//       "type": "c-use",
//       "description": "limite superior do laço interno"
//     },
//     {
//       "id": "U12",
//       "variable": "matrix1RowSize",
//       "type": "c-use",
//       "description": "limite superior do laço externo"
//     },
//     {
//       "id": "U13",
//       "variable": "matrix2ColumnSize",
//       "type": "c-use",
//       "description": "limite superior do laço intermediário"
//     },
//     {
//       "id": "U14",
//       "variable": "matrix1RowSize",
//       "type": "c-use",
//       "description": "dimensão de alocação de result"
//     },
//     {
//       "id": "U15",
//       "variable": "matrix2ColumnSize",
//       "type": "c-use",
//       "description": "dimensão de alocação de result"
//     },
//     {
//       "id": "U16",
//       "variable": "value1",
//       "type": "c-use",
//       "description": "value1.multiply(value2)"
//     },
//     {
//       "id": "U17",
//       "variable": "value2",
//       "type": "c-use",
//       "description": "value1.multiply(value2)"
//     },
//     {
//       "id": "U18",
//       "variable": "result",
//       "type": "c-use",
//       "description": "result[rowIndex][columnIndex] = ..."
//     },
//     {
//       "id": "U19",
//       "variable": "result",
//       "type": "c-use",
//       "description": "return Optional.of(result)"
//     }
//   ],
//   "du_paths": [
//     {
//       "id": "P0",
//       "description": "dimensões incompatíveis, caminho direto para return Optional.empty()",
//       "post_condition": "observable_return vazio"
//     },
//     {
//       "id": "P1",
//       "description": "multiplicação válida com size == 1, executa laços com uma iteração interna",
//       "post_condition": "observable_return presente"
//     },
//     {
//       "id": "P2",
//       "description": "multiplicação válida com iteração completa, executa laços com múltiplas iterações",
//       "post_condition": "observable_return presente"
//     }
//   ],
//   "planned_tests": [
//     {
//       "test_id": "T0",
//       "covers": ["P0"],
//       "asserts": ["Optional.empty"]
//     },
//     {
//       "test_id": "T1",
//       "covers": ["P1"],
//       "asserts": ["Optional.isPresent"]
//     },
//     {
//       "test_id": "T2",
//       "covers": ["P2"],
//       "asserts": ["Optional.isPresent"]
//     }
//   ],
//   "constraints": {
//     "all_defs_covered": true,
//     "all_uses_covered": true,
//     "representative_loop_coverage": true,
//     "observable_contract_preserved": true
//   }
// }
// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.util.Optional;

public class MatrixUtilGrok_POT2Test {

    @Test
    public void testMultiply_IncompatibleDimensions() {
        BigDecimal[][] matrix1 = {
            {BigDecimal.ONE, BigDecimal.ZERO}
        };
        BigDecimal[][] matrix2 = {
            {BigDecimal.ONE},
            {BigDecimal.ZERO},
            {BigDecimal.ONE}
        };
        Optional<BigDecimal[][]> result = MatrixUtil.multiply(matrix1, matrix2);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMultiply_SizeOne() {
        BigDecimal[][] matrix1 = {
            {BigDecimal.valueOf(2)}
        };
        BigDecimal[][] matrix2 = {
            {BigDecimal.valueOf(3)}
        };
        Optional<BigDecimal[][]> result = MatrixUtil.multiply(matrix1, matrix2);
        assertTrue(result.isPresent());
        BigDecimal[][] expected = {
            {BigDecimal.valueOf(6)}
        };
        assertArrayEquals(expected, result.get());
    }

    @Test
    public void testMultiply_FullIteration() {
        BigDecimal[][] matrix1 = {
            {BigDecimal.ONE, BigDecimal.valueOf(2)},
            {BigDecimal.valueOf(3), BigDecimal.valueOf(4)}
        };
        BigDecimal[][] matrix2 = {
            {BigDecimal.valueOf(5), BigDecimal.valueOf(6)},
            {BigDecimal.valueOf(7), BigDecimal.valueOf(8)}
        };
        Optional<BigDecimal[][]> result = MatrixUtil.multiply(matrix1, matrix2);
        assertTrue(result.isPresent());
        BigDecimal[][] expected = {
            {BigDecimal.valueOf(19), BigDecimal.valueOf(22)},
            {BigDecimal.valueOf(43), BigDecimal.valueOf(50)}
        };
        assertArrayEquals(expected, result.get());
    }
}
// ```