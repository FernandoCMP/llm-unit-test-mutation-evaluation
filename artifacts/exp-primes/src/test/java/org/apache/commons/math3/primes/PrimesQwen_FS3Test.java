package org.apache.commons.math3.primes;

// ```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;

public class PrimesQwen_FS3Test {

    @Test
    void testNextPrime_zero() {
        assertEquals(2, Primes.nextPrime(0));
    }

    @Test
    void testNextPrime_one() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    void testNextPrime_two() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    void testNextPrime_three() {
        assertEquals(3, Primes.nextPrime(3));
    }

    @Test
    void testNextPrime_four() {
        assertEquals(5, Primes.nextPrime(4));
    }

    @Test
    void testNextPrime_largeNonPrime() {
        assertEquals(101, Primes.nextPrime(99));
    }

    @Test
    void testNextPrime_largePrime() {
        assertEquals(97, Primes.nextPrime(97));
    }

    @Test
    void testNextPrime_negativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-5));
    }

    @Test
    void testNextPrime_maxInt() {
        assertEquals(Integer.MAX_VALUE, Primes.nextPrime(Integer.MAX_VALUE));
    }

    @Test
    void testNextPrime_caseBeforeBigPrime() {
        assertEquals(1009, Primes.nextPrime(1000));
    }
}
// ```