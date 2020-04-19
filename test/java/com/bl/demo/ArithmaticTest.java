package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ArithmaticTest {
    @Test
    public void givenTwoInteger_WhenAdd_ShouldReturnAddition() {
        Arithmatic arithmatic = new Arithmatic();
        int result = arithmatic.add(2,3);
        System.out.println("Addition : "+result);
        Assert.assertEquals( 5,result);
    }

    @Test
    public void givenTwoInteger_WhenSub_ShouldReturnSubstration() {
        Arithmatic arithmatic = new Arithmatic();
        int result = arithmatic.sub(3,2);
        System.out.println("Substraction : "+result);
        Assert.assertEquals(1,result);
    }

    @Test
    public void givenTwoInteger_WhenDiv_ShouldReturnDivision() {
        Arithmatic arithmatic = new Arithmatic();
        int result = arithmatic.div(6,2);
        System.out.println("Division : "+result);
        Assert.assertEquals(3,result);
    }

    @Test
    public void givenTwoInteger_WhenMul_ShouldReturnMultiplication() {
        Arithmatic arithmatic = new Arithmatic();
        int result =arithmatic.mul(3,2);
        System.out.println("Multiplication : "+result);
        Assert.assertEquals(6,result);
    }
}