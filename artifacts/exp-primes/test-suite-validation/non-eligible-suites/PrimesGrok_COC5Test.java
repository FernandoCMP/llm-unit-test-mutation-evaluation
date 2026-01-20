package org.apache.commons.math3.primes;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

public class PrimesGrok_COC5Test {

    @Test
    public void testNextPrime_NegativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_EqualsTwo() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_EqualsOne() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_IsPrimeAfterBitwise() {
        assertEquals(3, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_RemZero() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_RemOne() {
        assertEquals(11, Primes.nextPrime(7));
    }

    @Test
    public void testNextPrime_LoopEntryPrime() {
        assertEquals(17, Primes.nextPrime(15));
    }

    @Test
    public void testNextPrime_LoopIncrementPrime() {
        assertEquals(37, Primes.nextPrime(33));
    }
}
// ```