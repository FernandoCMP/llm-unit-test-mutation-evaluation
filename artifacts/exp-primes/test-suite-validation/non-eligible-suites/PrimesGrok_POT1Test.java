package org.apache.commons.math3.primes;

// ```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.primes.Primes;

public class PrimesGrok_POT1Test {

    @Test
    public void testNextPrime_T0() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    public void testNextPrime_T1() {
        int result = Primes.nextPrime(2);
        assertEquals(2, result);
    }

    @Test
    public void testNextPrime_T2() {
        int result = Primes.nextPrime(1);
        assertEquals(2, result);
    }

    @Test
    public void testNextPrime_T3() {
        int n = 3;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n && Primes.isPrime(result));
    }

    @Test
    public void testNextPrime_T4() {
        int n = 9;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n && Primes.isPrime(result));
    }

    @Test
    public void testNextPrime_T5() {
        int n = 25;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n && Primes.isPrime(result));
    }

    @Test
    public void testNextPrime_T6() {
        int n = 5;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n && Primes.isPrime(result));
    }

    @Test
    public void testNextPrime_T7() {
        int n = 35;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n && Primes.isPrime(result));
    }

    @Test
    public void testNextPrime_T8() {
        int n = 65;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n && Primes.isPrime(result));
    }

    @Test
    public void testNextPrime_T9() {
        int n = 215;
        int result = Primes.nextPrime(n);
        assertTrue(result >= n && Primes.isPrime(result));
    }
}
// ```