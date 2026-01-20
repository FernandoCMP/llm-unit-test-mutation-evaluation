package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_POT4Test {

    @Test
    public void testNextPrime_negativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_inputTwo() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_inputOne() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_alreadyPrime() {
        assertEquals(5, Primes.nextPrime(5));
        assertEquals(7, Primes.nextPrime(7));
        assertEquals(11, Primes.nextPrime(11));
    }

    @Test
    public void testNextPrime_remZero() {
        assertEquals(5, Primes.nextPrime(3));
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_remOne() {
        assertEquals(7, Primes.nextPrime(4));
        assertEquals(13, Primes.nextPrime(10));
    }

    @Test
    public void testNextPrime_remTwo() {
        assertEquals(5, Primes.nextPrime(0));
        assertEquals(23, Primes.nextPrime(20));
    }

    @Test
    public void testNextPrime_loopFirstCheck() {
        assertEquals(17, Primes.nextPrime(15));
    }

    @Test
    public void testNextPrime_loopSecondCheck() {
        assertEquals(19, Primes.nextPrime(16));
    }

    @Test
    public void testNextPrime_fullLoopIteration() {
        assertEquals(29, Primes.nextPrime(25));
    }
}
// ```