package org.apache.commons.math3.primes;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

public class PrimesGrok_COC3Test {

    @Test
    public void testNextPrime_P0() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_P1() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_P2() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_P3() {
        assertEquals(3, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_P4() {
        assertEquals(5, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_P5() {
        assertEquals(11, Primes.nextPrime(7));
    }

    @Test
    public void testNextPrime_P6() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_P7() {
        assertEquals(13, Primes.nextPrime(9));
    }
}
// ```