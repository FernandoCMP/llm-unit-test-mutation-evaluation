package org.apache.commons.math3.primes;

// ```java
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_POT5Test {

    @Test
    public void testNextPrime_T0_NegativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-10));
    }

    @Test
    public void testNextPrime_T1_InputTwo() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    public void testNextPrime_T2_InputOne() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    public void testNextPrime_T3_PrimeInputNoAdjustment() {
        assertEquals(3, Primes.nextPrime(3));
        assertEquals(5, Primes.nextPrime(5));
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    public void testNextPrime_T4_RemZeroPath() {
        assertEquals(5, Primes.nextPrime(3)); // 3 % 3 == 0 => n += 2 => 5
        assertEquals(11, Primes.nextPrime(9)); // 9 % 3 == 0 => n += 2 => 11
    }

    @Test
    public void testNextPrime_T5_RemOnePath() {
        assertEquals(7, Primes.nextPrime(4)); // 4|1=5, 5%3==2, loop entry, 5+=2=>7
        assertEquals(7, Primes.nextPrime(7)); // Already prime
        assertEquals(11, Primes.nextPrime(10)); // 10|1=11, 11%3==2, loop entry, 11 prime
    }

    @Test
    public void testNextPrime_T6_RemTwoPathDirectReturn() {
        assertEquals(5, Primes.nextPrime(4)); // 4|1=5, 5%3==2, direct check and return
    }

    @Test
    public void testNextPrime_T7_FirstIsPrimeInLoop() {
        assertEquals(11, Primes.nextPrime(8)); // 8|1=9, 9%3==0 => 11 (first isPrime in loop)
    }

    @Test
    public void testNextPrime_T8_SecondIsPrimeInLoop() {
        assertEquals(13, Primes.nextPrime(11)); // 11->13 via n+=2 inside loop
    }

    @Test
    public void testNextPrime_T9_FullLoopIteration() {
        assertEquals(17, Primes.nextPrime(15)); // 15|1=15, 15%3==0 => 17 after full cycle
        assertEquals(23, Primes.nextPrime(20)); // 20|1=21, 21%3==0 => 23 after full cycle
    }
}
// ```