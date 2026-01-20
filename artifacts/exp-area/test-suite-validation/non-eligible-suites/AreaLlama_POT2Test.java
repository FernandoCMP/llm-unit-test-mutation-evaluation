package com.thealgorithms.maths;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaLlama_POT2Test {

    @Test
    public void testSurfaceAreaCone() {
        // Arrange
        double radius = 5.0;
        double height = 10.0;

        // Act
        double surfaceArea = Area.surfaceAreaCone(radius, height);

        // Assert
        assertEquals(471.2388980384688, surfaceArea, 0.001);
    }
}
// ```