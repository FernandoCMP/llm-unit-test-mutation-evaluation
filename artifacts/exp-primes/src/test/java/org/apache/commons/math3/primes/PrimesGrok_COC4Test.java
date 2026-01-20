package org.apache.commons.math3.primes;

// ```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

public class PrimesGrok_COC4Test {

    @Test
    public void testNextPrime_Negative() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_Two() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_One() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_Prime() {
        assertEquals(3, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_RemZero() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_RemOne() {
        assertEquals(29, Primes.nextPrime(25));
    }

    @Test
    public void testNextPrime_LoopIncrementTwo() {
        assertEquals(37, Primes.nextPrime(33));
    }
}
// ```