package org.apache.commons.math3.primes;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;

public class PrimesLlama_FS1Test {

    @Test
    void testNextPrime_NegativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-5));
    }

    @Test
    void testNextPrime_ZeroInput() {
        assertEquals(2, Primes.nextPrime(0));
    }

    @Test
    void testNextPrime_OneInput() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    void testNextPrime_TwoInput() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    void testNextPrime_PrimeInput() {
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    void testNextPrime_NonPrimeInput() {
        assertEquals(7, Primes.nextPrime(6));
    }

    @Test
    void testNextPrime_LargeNonPrimeInput() {
        assertEquals(2147483647, Primes.nextPrime(2147483646));
    }

    @Test
    void testNextPrime_MaxIntInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(Integer.MAX_VALUE));
    }
}
// ```