package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesLlama_POT5Test {

    @Test
    public void testNextPrime_Negative() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_Two() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_One() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_Prime() {
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    public void testNextPrime_MultipleOfThreePlusZero() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_MultipleOfThreePlusOne() {
        assertEquals(11, Primes.nextPrime(10));
    }

    @Test
    public void testNextPrime_NotMultipleOfThree() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_FirstPrimeInLoop() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_SecondPrimeInLoop() {
        int n = 4;
        while (Primes.isPrime(n)) {
            n++;
        }
        assertEquals(Primes.nextPrime(n), Primes.nextPrime(n - 1) + 2);
    }

    @Test
    public void testNextPrime_MultipleIterations() {
        assertEquals(23, Primes.nextPrime(20));
    }
}
// ```