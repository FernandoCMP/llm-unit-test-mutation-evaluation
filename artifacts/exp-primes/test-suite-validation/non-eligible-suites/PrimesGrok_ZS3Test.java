package org.apache.commons.math3.primes;

 import static org.junit.jupiter.api.Assertions.*;
 
 import org.junit.jupiter.api.Test;
 
 import org.apache.commons.math3.primes.Primes;
 
 import org.apache.commons.math3.exception.MathIllegalArgumentException;
 
 public class PrimesGrok_ZS3Test {
 
     @Test
     public void testNextPrime_Negative() {
         assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(-1));
     }
 
     @Test
     public void testNextPrime_Zero() {
         assertThrows(MathIllegalArgumentException.class, () -> Primes.nextPrime(0));
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
     public void testNextPrime_EvenNumber() {
         assertEquals(11, Primes.nextPrime(10));
     }
 
     @Test
     public void testNextPrime_OddNonPrime() {
         assertEquals(11, Primes.nextPrime(9));
     }
 
     @Test
     public void testNextPrime_LargeNumber() {
         assertEquals(101, Primes.nextPrime(100));
     }
 
     @Test
     public void testNextPrime_Prime() {
         assertEquals(13, Primes.nextPrime(13));
     }
 
     @Test
     public void testNextPrime_MultipleOfThree() {
         assertEquals(17, Primes.nextPrime(15));
     }
 }
