package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_COC4Test {

    @Test
    public void testNextPrime_negativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> {
            Primes.nextPrime(-1);
        });
    }

    @Test
    public void testNextPrime_nIsTwo() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_nIsOne() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_evenNumber() {
        assertEquals(5, Primes.nextPrime(4));
    }

    @Test
    public void testNextPrime_alreadyPrime() {
        assertEquals(11, Primes.nextPrime(11));
    }

    @Test
    public void testNextPrime_remZero() {
        assertEquals(5, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_remOne() {
        assertEquals(7, Primes.nextPrime(10));
    }

    @Test
    public void testNextPrime_loopFirstCheck() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_loopSecondCheck() {
        assertEquals(13, Primes.nextPrime(12));
    }
}
// ```