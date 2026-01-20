package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_ZS1Test {

    @Test
    public void testNextPrime_negativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-100));
    }

    @Test
    public void testNextPrime_zero() {
        assertEquals(2, Primes.nextPrime(0));
    }

    @Test
    public void testNextPrime_one() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_two() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_smallNonPrime() {
        assertEquals(3, Primes.nextPrime(3));
        assertEquals(5, Primes.nextPrime(4));
        assertEquals(5, Primes.nextPrime(5));
        assertEquals(7, Primes.nextPrime(6));
        assertEquals(7, Primes.nextPrime(7));
        assertEquals(11, Primes.nextPrime(8));
        assertEquals(11, Primes.nextPrime(9));
        assertEquals(11, Primes.nextPrime(10));
        assertEquals(11, Primes.nextPrime(11));
    }

    @Test
    public void testNextPrime_largeNonPrime() {
        assertEquals(101, Primes.nextPrime(99));
        assertEquals(101, Primes.nextPrime(100));
        assertEquals(101, Primes.nextPrime(101));
    }

    @Test
    public void testNextPrime_largePrime() {
        assertEquals(97, Primes.nextPrime(97));
        assertEquals(101, Primes.nextPrime(98));
    }

    @Test
    public void testNextPrime_edgeCaseBeforeLargeGap() {
        assertEquals(2147483647, Primes.nextPrime(2147483647));
    }
}
// ```