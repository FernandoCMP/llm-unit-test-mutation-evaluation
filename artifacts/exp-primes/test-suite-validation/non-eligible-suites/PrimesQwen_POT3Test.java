package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_POT3Test {

    @Test
    public void testNextPrime_T0_negativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_T1_inputTwo() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_T2_inputOne() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_T3_alreadyPrime() {
        assertEquals(5, Primes.nextPrime(5));
    }

    @Test
    public void testNextPrime_T4_remZero() {
        assertEquals(5, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_T5_remOne() {
        assertEquals(7, Primes.nextPrime(4));
    }

    @Test
    public void testNextPrime_T6_remTwo() {
        assertEquals(5, Primes.nextPrime(0));
    }

    @Test
    public void testNextPrime_T7_firstCheckInLoop() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_T8_secondCheckInLoop() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_T9_fullLoopIteration() {
        assertEquals(29, Primes.nextPrime(25));
    }
}
// ```