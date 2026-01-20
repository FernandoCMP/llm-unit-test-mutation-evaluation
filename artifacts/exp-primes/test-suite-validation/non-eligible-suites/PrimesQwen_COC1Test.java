package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_COC1Test {

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
    public void testNextPrime_oddPrimeInput() {
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    public void testNextPrime_nMod3Equals0() {
        assertEquals(5, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_nMod3Equals1() {
        assertEquals(7, Primes.nextPrime(4));
    }

    @Test
    public void testNextPrime_loopFirstCondition() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_loopSecondCondition() {
        assertEquals(13, Primes.nextPrime(10));
    }
}
// ```