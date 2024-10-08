package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Array1Test. Dont edit or it will mess up your grade :)
 *
 * @author Mr. Johnson
 * @version 10/7/24 v1.5 (a version number or a date)
 */

public class Array1Test {

    Array1 array1 = new Array1();

    @Test
    public void firstLast6Test() {
        assertEquals(true, array1.firstLast6(new int[]{6, 1, 2}));
        assertEquals(true, array1.firstLast6(new int[]{1, 2, 6}));
        assertEquals(false, array1.firstLast6(new int[]{1, 6, 3}));
    }

    @Test
    public void commonEndTest() {
        assertEquals(true, array1.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        assertEquals(false, array1.commonEnd(new int[]{1, 2, 3}, new int[]{3, 2}));
        assertEquals(true, array1.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }

    @Test
    public void reverse3Test() {
        assertArrayEquals(new int[]{3, 2, 1}, array1.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 8, 7}, array1.reverse3(new int[]{7, 8, 9}));
        assertArrayEquals(new int[]{7, 0, 0}, array1.reverse3(new int[]{0, 0, 7}));
    }

    @Test
    public void middleWayTest() {
        assertArrayEquals(new int[]{2, 5}, array1.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{7, 6}, array1.middleWay(new int[]{7, 7, 7}, new int[]{5, 6, 8}));
        assertArrayEquals(new int[]{6, 4}, array1.middleWay(new int[]{5, 6, 3}, new int[]{9, 4, 5}));
    }

    @Test
    public void no23Test() {
        assertEquals(true, array1.no23(new int[]{4, 5}));
        assertEquals(false, array1.no23(new int[]{3, 4}));
        assertEquals(true, array1.no23(new int[]{4, 9}));
    }

    @Test
    public void fix23Test() {
        assertArrayEquals(new int[]{1, 2, 0}, array1.fix23(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 5}, array1.fix23(new int[]{2, 3, 5}));
        assertArrayEquals(new int[]{1, 3, 2}, array1.fix23(new int[]{1, 3, 2}));
    }

    @Test
    public void makeMiddleTest() {
        assertArrayEquals(new int[]{2, 3}, array1.makeMiddle(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{3, 4}, array1.makeMiddle(new int[]{1, 2, 3, 4, 5, 10}));
        assertArrayEquals(new int[]{5, 7}, array1.makeMiddle(new int[]{5, 7}));
    }

    @Test
    public void midThreeTest() {
        assertArrayEquals(new int[]{2, 3, 4}, array1.midThree(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 5, 3}, array1.midThree(new int[]{1, 7, 7, 5, 3, 6, 6}));
        assertArrayEquals(new int[]{1, 2, 3}, array1.midThree(new int[]{1, 2, 3}));
    }

    @Test
    public void unlucky1Test() {
        assertEquals(true, array1.unlucky1(new int[]{1, 3, 4, 5}));
        assertEquals(true, array1.unlucky1(new int[]{2, 1, 3, 4, 5}));
        assertEquals(false, array1.unlucky1(new int[]{1, 1, 1}));
    }

    @Test
    public void sameFirstLastTest() {
        assertEquals(true, array1.sameFirstLast(new int[]{1, 2, 3, 1}));
        assertEquals(false, array1.sameFirstLast(new int[]{1, 2, 3}));
        assertEquals(true, array1.sameFirstLast(new int[]{1, 2, 1}));
    }

    @Test
    public void sum3Test() {
        assertEquals(6, array1.sum3(new int[]{1, 2, 3}));
        assertEquals(15, array1.sum3(new int[]{4, 5, 6}));
        assertEquals(0, array1.sum3(new int[]{0, 0, 0}));
    }

    @Test
    public void maxEnd3Test() {
        assertEquals(new int[]{3,3,3}, array1.maxEnd3(new int[]{1, 2, 3}));
        assertEquals(new int[]{7,7,7}, array1.maxEnd3(new int[]{7, 5, 6}));
        assertEquals(new int[]{1,1,1}, array1.maxEnd3(new int[]{1, 2, 1}));
    }

    @Test
    public void makeEndsTest() {
        assertArrayEquals(new int[]{1, 3}, array1.makeEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{7, 5}, array1.makeEnds(new int[]{7, 8, 9, 5}));
        assertArrayEquals(new int[]{1, 1}, array1.makeEnds(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void makeLastTest() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 3}, array1.makeLast(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{0, 0, 0, 7}, array1.makeLast(new int[]{6, 7}));
        assertArrayEquals(new int[]{0, 1}, array1.makeLast(new int[]{1}));
    }

    @Test
    public void start1Test() {
        assertEquals(2, array1.start1(new int[]{1, 2, 3}, new int[]{1, 4, 5}));
        assertEquals(1, array1.start1(new int[]{1, 2}, new int[]{2}));
        assertEquals(0, array1.start1(new int[]{2, 3}, new int[]{}));
    }

    @Test
    public void plusTwoTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, array1.plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{1, 3, 2, 4}, array1.plusTwo(new int[]{1, 3}, new int[]{2, 4}));
        assertArrayEquals(new int[]{9, 2, 3, 4}, array1.plusTwo(new int[]{9, 2}, new int[]{3, 4}));
    }

    @Test
    public void maxTripleTest() {
        assertEquals(3, array1.maxTriple(new int[]{1, 2, 3}));
        assertEquals(7, array1.maxTriple(new int[]{7}));
        assertEquals(4, array1.maxTriple(new int[]{4, 1, 2, 3, 2, 3, 1, 1, 2, 3, 0}));
    }

    @Test
    public void make2Test() {
        assertArrayEquals(new int[]{1, 2}, array1.make2(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, array1.make2(new int[]{1}));
        assertArrayEquals(new int[]{4, 5}, array1.make2(new int[]{4, 5}));
    }

    @Test
    public void makePiTest() {
        assertArrayEquals(new int[]{3, 1, 4}, array1.makePi());
    }

    @Test
    public void rotateLeft3Test() {
        assertArrayEquals(new int[]{2, 3, 1}, array1.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{8, 9, 7}, array1.rotateLeft3(new int[]{7, 8, 9}));
        assertArrayEquals(new int[]{1, 2, 3}, array1.rotateLeft3(new int[]{1, 2, 3}));
    }

    @Test
    public void sum2Test() {
        assertEquals(3, array1.sum2(new int[]{1, 2, 3}));
        assertEquals(15, array1.sum2(new int[]{7, 8, 9}));
        assertEquals(0, array1.sum2(new int[]{0}));
    }

    @Test
    public void has23Test() {
        assertEquals(true, array1.has23(new int[]{1, 2, 3}));
        assertEquals(false, array1.has23(new int[]{1, 4, 5}));
        assertEquals(false, array1.has23(new int[]{1, 5, 6}));
    }

    @Test
    public void double23Test() {
        assertEquals(true, array1.double23(new int[]{2, 2}));
        assertEquals(true, array1.double23(new int[]{3, 3}));
        assertEquals(false, array1.double23(new int[]{2, 3}));
    }

    @Test
    public void biggerTwoTest() {
        assertEquals(true, array1.biggerTwo(new int[]{1, 2}, new int[]{1, 3}));
        assertEquals(false, array1.biggerTwo(new int[]{1, 3}, new int[]{1, 2}));
        assertEquals(true, array1.biggerTwo(new int[]{5, 6}, new int[]{4, 7}));
    }

    @Test
    public void swapEndsTest() {
        assertArrayEquals(new int[]{3, 2, 1}, array1.swapEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 4, 7}, array1.swapEnds(new int[]{7, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 1}, array1.swapEnds(new int[]{1, 2, 1}));
    }

    @Test
    public void frontPieceTest() {
        assertArrayEquals(new int[]{1, 2}, array1.frontPiece(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, array1.frontPiece(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1}, array1.frontPiece(new int[]{1}));
    }

    @Test
    public void front11Test() {
        assertArrayEquals(new int[]{1}, array1.front11(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{1}, array1.front11(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, array1.front11(new int[]{1, 2, 3}, new int[]{1, 4, 5}));
    }
}
