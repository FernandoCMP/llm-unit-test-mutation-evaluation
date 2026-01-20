package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesGrok_ZS1Test {

    @Test
    public void testNextPrime_Negative() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_Zero() {
        assertEquals(2, Primes.nextPrime(0));
    }

    @Test
    public void testNextPrime_One() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_Two() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_Three() {
        assertEquals(3, Primes.nextPrime(3));
    }

    @Test
    public void testNextPrime_Four() {
        assertEquals(5, Primes.nextPrime(4));
    }

    @Test
    public void testNextPrime_Five() {
        assertEquals(5, Primes.nextPrime(5));
    }

    @Test
    public void testNextPrime_Six() {
        assertEquals(7, Primes.nextPrime(6));
    }

    @Test
    public void testNextPrime_Seven() {
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    public void testNextPrime_Eight() {
        assertEquals(11, Primes.nextPrime(8));
    }

    @Test
    public void testNextPrime_Nine() {
        assertEquals(11, Primes.nextPrime(9));
    }

    @Test
    public void testNextPrime_Ten() {
        assertEquals(11, Primes.nextPrime(10));
    }

    @Test
    public void testNextPrime_Eleven() {
        assertEquals(11, Primes.nextPrime(11));
    }

    @Test
    public void testNextPrime_Twelve() {
        assertEquals(13, Primes.nextPrime(12));
    }
}
// ```