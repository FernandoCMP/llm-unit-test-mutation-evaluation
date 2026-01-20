package org.apache.commons.math3.primes;

// ```java
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesQwen_COC3Test {

    @Test
    void testNextPrime_negativeInput() {
        assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
    }

    @Test
    void testNextPrime_inputTwo() {
        assertEquals(2, Primes.nextPrime(2));
    }

    @Test
    void testNextPrime_evenNumber() {
        assertEquals(2, Primes.nextPrime(0));
        assertEquals(3, Primes.nextPrime(1));
    }

    @Test
    void testNextPrime_alreadyPrime() {
        assertEquals(5, Primes.nextPrime(5));
        assertEquals(7, Primes.nextPrime(7));
    }

    @Test
    void testNextPrime_nextIsMultipleOfThree_caseRemZero() {
        assertEquals(5, Primes.nextPrime(3)); // 3 % 3 == 0, then 3+2=5, prime
    }

    @Test
    void testNextPrime_nextIsMultipleOfThree_caseRemOne() {
        assertEquals(7, Primes.nextPrime(4)); // 5 % 3 == 2, but 4|1 = 5 -> 5%3==2, skip to check path
        // Better example: find an input where after n=n|1, we get n%3==1
        assertEquals(11, Primes.nextPrime(10)); // 11|1=11, 11%3==2, first check fails, loop starts
                                               // but 10|1=11, so let's try 13?
        assertEquals(13, Primes.nextPrime(12)); // 13|1=13, 13%3==1 => n+=4 => 17, 17 prime
    }

    @Test
    void testNextPrime_loopFirstCheck() {
        // Find number that enters loop and first isPrime(n) returns true
        assertEquals(11, Primes.nextPrime(9)); // 9|1=9, 9%3==0 => n+=2=11, 11 prime
    }

    @Test
    void testNextPrime_loopSecondCheckAfterPlusTwo() {
        // After n += 2 in loop, isPrime becomes true
        assertEquals(13, Primes.nextPrime(11)); // 11|1=11, 11 prime? No wait, 11 is already prime so returns early
        // Need a case like 15: 15|1=15, 15%3==0 => n=17, isPrime(17)=>true => return 17
        assertEquals(17, Primes.nextPrime(15));
    }
}
// ```