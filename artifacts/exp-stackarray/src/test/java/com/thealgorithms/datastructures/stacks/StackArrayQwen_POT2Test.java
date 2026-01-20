package com.thealgorithms.datastructures.stacks;

// ```java
// {
//   "variables": [
//     { "name": "value", "role": "elemento a ser inserido na pilha" },
//     { "name": "top", "role": "variável de estado da pilha" },
//     { "name": "stackArray", "role": "estrutura interna da pilha" },
//     { "name": "maxSize", "role": "capacidade atual da pilha" }
//   ],
//   "definitions": [
//     { "id": "D1", "variable": "value", "description": "definição inicial como parâmetro formal" },
//     { "id": "D2", "variable": "top", "description": "redefinição por incremento (top++)" },
//     { "id": "D3", "variable": "stackArray", "description": "atribuição de value em stackArray[top]" },
//     { "id": "D4", "variable": "stackArray", "description": "redefinição indireta por resize(int)" },
//     { "id": "D5", "variable": "maxSize", "description": "redefinição indireta por resize(int)" }
//   ],
//   "uses": [
//     { "id": "U1", "variable": "top", "type": "p-use", "description": "verificação de pilha cheia via isFull()" },
//     { "id": "U2", "variable": "maxSize", "type": "p-use", "description": "uso implícito na condição de isFull()" },
//     { "id": "U3", "variable": "value", "type": "c-use", "description": "valor atribuído ao topo da pilha" },
//     { "id": "U4", "variable": "top", "type": "c-use", "description": "uso como índice em stackArray[top]" },
//     { "id": "U5", "variable": "top", "type": "c-use", "description": "incremento do topo (top++)" },
//     { "id": "U6", "variable": "maxSize", "type": "c-use", "description": "uso como argumento em resize(maxSize * 2)" }
//   ],
//   "du_paths": [
//     {
//       "id": "P1",
//       "description": "inserção direta quando a pilha não está cheia"
//     },
//     {
//       "id": "P2",
//       "description": "inserção após redimensionamento quando a pilha está cheia"
//     }
//   ],
//   "planned_tests": [
//     { "test_id": "T1", "covers": ["P1"] },
//     { "test_id": "T2", "covers": ["P2"] }
//   ],
//   "constraints": {
//     "all_defs_covered": true,
//     "all_uses_covered": true,
//     "state_dependency_explicit": true
//   }
// }
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackArrayQwen_POT2Test {

    private StackArray stack;

    @BeforeEach
    void setUp() {
        stack = new StackArray(3);
    }

    @Test
    public void testPush_directInsertionWhenNotFull() {
        stack.push(10);
        assertEquals(10, stack.peek());
        assertEquals(1, stack.size());

        stack.push(20);
        assertEquals(20, stack.peek());
        assertEquals(2, stack.size());

        stack.push(30);
        assertEquals(30, stack.peek());
        assertEquals(3, stack.size());

        assertTrue(stack.isFull());
    }

    @Test
    public void testPush_withResizeWhenFull() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertTrue(stack.isFull());

        stack.push(40);

        assertFalse(stack.isFull());
        assertEquals(4, stack.size());
        assertEquals(40, stack.peek());

        stack.push(50);
        assertEquals(5, stack.size());
        assertEquals(50, stack.peek());
    }
}
// ```