package org.apache.commons.codec.binary;

// ```java
@Test
public void testEncodeHex() {
    char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    String expected = "0123456789ABCDEF";
    String actual = Hex.encodeHex(data);
    assertEquals(expected, actual);
}

@Test
public void testDecodeHex() {
    char[] data = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    String expected = "0123456789ABCDEF";
    String actual = Hex.decodeHex(data);
    assertEquals(expected, actual);
}
// ```

public class HexLlama_POT2Test { }
