package com.bignum;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIneger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1234567891234567890");
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger("100");
        BigInteger add=bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger sub=bigInteger.subtract(bigInteger1);
        System.out.println(sub);

        BigDecimal bigDecimal = new BigDecimal("123.123123123123123");
        System.out.println(bigDecimal);

    }
}
