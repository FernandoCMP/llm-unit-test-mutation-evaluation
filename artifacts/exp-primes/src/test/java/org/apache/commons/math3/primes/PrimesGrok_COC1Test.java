package org.apache.commons.math3.primes;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

public class PrimesGrok_COC1Test {

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
    public void testNextPrime_IsPrimeBeforeLoop() {
        assertEquals(3, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_RemZeroThenPrime() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_RemOneThenPrime() {
        assertEquals(29, Primes.nextPrime(25));
    }

    @Test
    public void testNextPrime_PrimeAtLoopEntry() {
        assertEquals(29, Primes.nextPrime(29));
    }

    @Test
    public void testNextPrime_PrimeAfterIncrement() {
        assertEquals(37, Primes.nextPrime(35));
    }
}
// ```