package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimesLlama_COC1Test {

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
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    public void testNextPrime_NMultipleOfThreePlusOne() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_NMultipleOfThree() {
        assertEquals(11, Primes.nextPrime(10));
    }

    @Test
    public void testNextPrime_NNotPrime() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_NLargeNotPrime() {
        assertEquals(23, Primes.nextPrime(20));
    }
}
// ```