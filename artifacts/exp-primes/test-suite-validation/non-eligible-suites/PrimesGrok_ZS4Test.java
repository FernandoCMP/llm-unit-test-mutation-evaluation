package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesGrok_ZS4Test {

    @Test
    void testNextPrime_Negative() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    void testNextPrime_Zero() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(0));
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
    void testNextPrime_Prime() {
        assertEquals(3, Primes.nextPrime(3));
        assertEquals(5, Primes.nextPrime(5));
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    void testNextPrime_EvenNonPrime() {
        assertEquals(2, Primes.nextPrime(4));
        assertEquals(5, Primes.nextPrime(4));
        assertEquals(7, Primes.nextPrime(6));
    }

    @Test
    void testNextPrime_OddNonPrime() {
        assertEquals(5, Primes.nextPrime(4));
        assertEquals(7, Primes.nextPrime(6));
        assertEquals(11, Primes.nextPrime(9));
        assertEquals(13, Primes.nextPrime(12));
    }

    @Test
    void testNextPrime_MultipleOfThree() {
        assertEquals(5, Primes.nextPrime(3));
        assertEquals(7, Primes.nextPrime(6));
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    void testNextPrime_LargerNumbers() {
        assertEquals(23, Primes.nextPrime(20));
        assertEquals(29, Primes.nextPrime(25));
        assertEquals(31, Primes.nextPrime(30));
    }
}
// ```