package org.apache.commons.math3.primes;

// ```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.primes.Primes;

public class PrimesGrok_POT2Test {

    @Test
    void testNextPrime_T0() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    void testNextPrime_T1() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    void testNextPrime_T2() {
        assertEquals(2, Primes.nextPrime(1));
    }

    @Test
    void testNextPrime_T3() {
        int input = 3;
        int result = Primes.nextPrime(input);
        assertTrue(result >= input);
        assertTrue(Primes.isPrime(result));
    }

    @Test
    void testNextPrime_T4() {
        int input = 6; // n=6, after n|1=7, 7%3=1, so n+=4 to 11, but wait, for P4: rem==0, n+=2
        // For rem==0: input such that after adjustments, rem=0 and then return if prime or enter loop
        // Let's use input=8: 8|1=9, 9%3=0, n+=2=11, 11 is prime, so returns 11
        int input = 8;
        int result = Primes.nextPrime(input);
        assertTrue(result >= input);
        assertTrue(Primes.isPrime(result));
    }

    @Test
    void testNextPrime_T5() {
        // For rem==1: input=4, 4|1=5, 5%3=2, not 0 or 1, so enter loop without adjustment
        // Wait, for P5: rem==1, n+=4
        // input=10: 10|1=11, 11%3=2, not 0 or 1, enter loop
        // input=7: 7%3=1, n+=4=11, 11 is prime, returns 11
        int input = 7;
        int result = Primes.nextPrime(input);
        assertTrue(result >= input);
        assertTrue(Primes.isPrime(result));
    }

    @Test
    void testNextPrime_T6() {
        // rem==2, enter loop without initial adjustment
        // input=5: 5%3=2, not prime, enter loop, n+=2=7, prime
        int input = 5;
        int result = Primes.nextPrime(input);
        assertTrue(result >= input);
        assertTrue(Primes.isPrime(result));
    }

    @Test
    void testNextPrime_T7() {
        // Return in first isPrime(n) inside loop
        // For example, input=9: 9|1=9, 9%3=0, n+=2=11, not prime, enter loop, n=11, isPrime(11)=true, return 11
        int input = 9;
        int result = Primes.nextPrime(input);
        assertTrue(result >= input);
        assertTrue(Primes.isPrime(result));
    }

    @Test
    void testNextPrime_T8() {
        // Return in second isPrime(n) after n+=2 inside loop
        // input=11: already prime, but to force loop: input=13? Wait, 13 is prime.
        // input=15: 15|1=15, 15%3=0, n+=2=17, 17 prime, returns 17 before loop?
        // To enter loop: input=17, prime, returns 17.
        // input=21: 21|1=21, 21%3=0, n+=2=23, 23 prime, returns 23.
        // To force second check: need n not prime, n+=2 not prime, then n+=4 prime.
        // input=25: 25|1=25, 25%3=1, n+=4=29, 29 prime, returns 29.
        // input=27: 27|1=27, 27%3=0, n+=2=29, 29 prime.
        // input=33: 33|1=33, 33%3=0, n+=2=35, 35 not prime, enter loop, n=35, not prime, n+=2=37, 37 prime, return 37.
        int input = 33;
        int result = Primes.nextPrime(input);
        assertTrue(result >= input);
        assertTrue(Primes.isPrime(result));
    }

    @Test
    void testNextPrime_T9() {
        // Iteration complete: n+=2 and n+=4 before return
        // Similar to T8, but ensure full iteration.
        // input=35: 35|1=35, 35%3=2, enter loop, 35 not prime, n+=2=37, 37 prime, return 37. (only n+=2)
        // input=41: 41 prime, return 41.
        // input=49: 49|1=49, 49%3=1, n+=4=53, 53 prime.
        // To force n+=2 then n+=4: input=55: 55|1=55, 55%3=1, n+=4=59, 59 prime.
        // input=65: 65|1=65, 65%3=2, enter loop, 65 not, n+=2=67, 67 prime.
        // input=77: 77|1=77, 77%3=2, enter loop, 77 not, n+=2=79, 79 prime.
        // input=85: 85|1=85, 85%3=1, n+=4=89, 89 prime.
        // input=95: 95|1=95, 95%3=2, enter loop, 95 not, n+=2=97, 97 prime.
        // input=115: 115|1=115, 115%3=1, n+=4=119, 119 not prime, enter loop, n=119, not, n+=2=121, 121 not, n+=4=125, 125 not, continue...
        // Actually, 119 not prime, 121 not, 125 not, 127 prime? Wait, loop: after n+=4 to 125, then if not, n+=2=127, 127 prime.
        // So for T9, input=115, result=127, which involves n+=2 and n+=4.
        int input = 115;
        int result = Primes.nextPrime(input);
        assertTrue(result >= input);
        assertTrue(Primes.isPrime(result));
    }
}
// ```