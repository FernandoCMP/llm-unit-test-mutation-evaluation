package org.apache.commons.math3.primes;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;

public class PrimesLlama_OS1Test {

    @Test
    void testNextPrime_NegativeNumber() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    void testNextPrime_Zero() {
        assertEquals(2, Primes.nextPrime(0));
    }

    @Test
    void testNextPrime_One() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    void testNextPrime_Two() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    void testNextPrime_PrimeNumber() {
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    void testNextPrime_NonPrimeNumber() {
        assertEquals(7, Primes.nextPrime(6));
    }

    @Test
    void testNextPrime_LargeNumber() {
        assertEquals(997, Primes.nextPrime(991));
    }

    @Test
    void testNextPrime_MaxInt() {
        assertEquals(Integer.MAX_VALUE - (Integer.MAX_VALUE % 2), Primes.nextPrime(Integer.MAX_VALUE - 1));
    }
}
// ```