package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_COC5Test {

    @Test
    public void testNextPrime_negativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> {
            Primes.nextPrime(-1);
        });
    }

    @Test
    public void testNextPrime_inputIsTwo() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_inputOne() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_alreadyPrime() {
        assertEquals(5, Primes.nextPrime(5));
    }

    @Test
    public void testNextPrime_remZero() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_remOne() {
        assertEquals(7, Primes.nextPrime(4));
    }

    @Test
    public void testNextPrime_loopFirstCheck() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_loopSecondCheck() {
        assertEquals(11, Primes.nextPrime(7));
    }
}
// ```