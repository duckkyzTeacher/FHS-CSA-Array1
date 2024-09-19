package src.main.java;


public class Array1Driver {
    public static void main(String[] args) {
        Array1 array1 = new Array1();

        // Testing firstLast6
        System.out.println("firstLast6");
        System.out.println("Input: [6, 1, 2], Output: " + array1.firstLast6(new int[]{6, 1, 2}));
        System.out.println("Input: [1, 2, 6], Output: " + array1.firstLast6(new int[]{1, 2, 6}));
        System.out.println("Input: [1, 2, 3], Output: " + array1.firstLast6(new int[]{1, 2, 3}));

        // Testing commonEnd
        System.out.println("\ncommonEnd");
        System.out.println("Input: [1, 2, 3], [7, 3], Output: " + array1.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println("Input: [1, 2, 3], [7, 8], Output: " + array1.commonEnd(new int[]{1, 2, 3}, new int[]{7, 8}));
        System.out.println("Input: [1, 2, 3], [1, 7], Output: " + array1.commonEnd(new int[]{1, 2, 3}, new int[]{1, 7}));

        // Testing reverse3
        System.out.println("\nreverse3");
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.reverse3(new int[]{1, 2, 3})));
        System.out.println("Input: [7, 8, 9], Output: " + java.util.Arrays.toString(array1.reverse3(new int[]{7, 8, 9})));
        System.out.println("Input: [3, 2, 1], Output: " + java.util.Arrays.toString(array1.reverse3(new int[]{3, 2, 1})));

        // Testing middleWay
        System.out.println("\nmiddleWay");
        System.out.println("Input: [1, 2, 3], [4, 5, 6], Output: " + java.util.Arrays.toString(array1.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println("Input: [1, 2, 3, 4], [5, 6, 7, 8], Output: " + java.util.Arrays.toString(array1.middleWay(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8})));
        System.out.println("Input: [1, 2, 3], [5, 6, 7], Output: " + java.util.Arrays.toString(array1.middleWay(new int[]{1, 2, 3}, new int[]{5, 6, 7})));

        // Testing no23
        System.out.println("\nno23");
        System.out.println("Input: [1, 2, 3], Output: " + array1.no23(new int[]{1, 2, 3}));
        System.out.println("Input: [1, 4, 5], Output: " + array1.no23(new int[]{1, 4, 5}));
        System.out.println("Input: [1, 2, 4], Output: " + array1.no23(new int[]{1, 2, 4}));

        // Testing fix23
        System.out.println("\nfix23");
        System.out.println("Input: [1, 2, 3, 4], Output: " + java.util.Arrays.toString(array1.fix23(new int[]{1, 2, 3, 4})));
        System.out.println("Input: [1, 2, 4], Output: " + java.util.Arrays.toString(array1.fix23(new int[]{1, 2, 4})));
        System.out.println("Input: [1, 3, 2], Output: " + java.util.Arrays.toString(array1.fix23(new int[]{1, 3, 2})));

        // Testing makeMiddle
        System.out.println("\nmakeMiddle");
        System.out.println("Input: [1, 2, 3, 4], Output: " + java.util.Arrays.toString(array1.makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println("Input: [1, 2, 3, 4, 5], Output: " + java.util.Arrays.toString(array1.makeMiddle(new int[]{1, 2, 3, 4, 5})));
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.makeMiddle(new int[]{1, 2, 3})));

        // Testing midThree
        System.out.println("\nmidThree");
        System.out.println("Input: [1, 2, 3, 4, 5], Output: " + java.util.Arrays.toString(array1.midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println("Input: [7, 2, 3, 4, 6], Output: " + java.util.Arrays.toString(array1.midThree(new int[]{7, 2, 3, 4, 6})));
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.midThree(new int[]{1, 2, 3})));

        // Testing unlucky1
        System.out.println("\nunlucky1");
        System.out.println("Input: [1, 2, 1], Output: " + array1.unlucky1(new int[]{1, 2, 1}));
        System.out.println("Input: [1, 2, 3], Output: " + array1.unlucky1(new int[]{1, 2, 3}));
        System.out.println("Input: [1, 1, 1], Output: " + array1.unlucky1(new int[]{1, 1, 1}));

        // Testing sameFirstLast
        System.out.println("\nsameFirstLast");
        System.out.println("Input: [1, 2, 3, 1], Output: " + array1.sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println("Input: [1, 2, 3], Output: " + array1.sameFirstLast(new int[]{1, 2, 3}));
        System.out.println("Input: [1, 1], Output: " + array1.sameFirstLast(new int[]{1, 1}));

        // Testing sum3
        System.out.println("\nsum3");
        System.out.println("Input: [1, 2, 3], Output: " + array1.sum3(new int[]{1, 2, 3}));
        System.out.println("Input: [4, 5, 6], Output: " + array1.sum3(new int[]{4, 5, 6}));
        System.out.println("Input: [0, 0, 0], Output: " + array1.sum3(new int[]{0, 0, 0}));

        // Testing maxEnd3
        System.out.println("\nmaxEnd3");
        System.out.println("Input: [1, 2, 3], Output: " + array1.maxEnd3(new int[]{1, 2, 3}));
        System.out.println("Input: [7, 5, 6], Output: " + array1.maxEnd3(new int[]{7, 5, 6}));
        System.out.println("Input: [1, 2, 1], Output: " + array1.maxEnd3(new int[]{1, 2, 1}));

        // Testing makeEnds
        System.out.println("\nmakeEnds");
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.makeEnds(new int[]{1, 2, 3})));
        System.out.println("Input: [7, 8, 9, 5], Output: " + java.util.Arrays.toString(array1.makeEnds(new int[]{7, 8, 9, 5})));
        System.out.println("Input: [1, 2, 3, 1], Output: " + java.util.Arrays.toString(array1.makeEnds(new int[]{1, 2, 3, 1})));

        // Testing makeLast
        System.out.println("\nmakeLast");
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.makeLast(new int[]{1, 2, 3})));
        System.out.println("Input: [5, 4, 6, 7], Output: " + java.util.Arrays.toString(array1.makeLast(new int[]{5, 4, 6, 7})));
        System.out.println("Input: [1], Output: " + java.util.Arrays.toString(array1.makeLast(new int[]{1})));

        // Testing start1
        System.out.println("\nstart1");
        System.out.println("Input: [1, 2, 3], [1, 4, 5], Output: " + array1.start1(new int[]{1, 2, 3}, new int[]{1, 4, 5}));
        System.out.println("Input: [1, 2], [2, 1], Output: " + array1.start1(new int[]{1, 2}, new int[]{2, 1}));
        System.out.println("Input: [2, 3], [4, 5], Output: " + array1.start1(new int[]{2, 3}, new int[]{4, 5}));

        // Testing plusTwo
        System.out.println("\nplusTwo");
        System.out.println("Input: [1, 2], [3, 4], Output: " + java.util.Arrays.toString(array1.plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println("Input: [1], [2], Output: " + java.util.Arrays.toString(array1.plusTwo(new int[]{1}, new int[]{2})));
        System.out.println("Input: [7, 8], [9], Output: " + java.util.Arrays.toString(array1.plusTwo(new int[]{7, 8}, new int[]{9})));

        // Testing maxTriple
        System.out.println("\nmaxTriple");
        System.out.println("Input: [1, 2, 3], Output: " + array1.maxTriple(new int[]{1, 2, 3}));
        System.out.println("Input: [7, 5, 6], Output: " + array1.maxTriple(new int[]{7, 5, 6}));
        System.out.println("Input: [4, 1, 2, 3], Output: " + array1.maxTriple(new int[]{4, 1, 2, 3}));

        // Testing make2
        System.out.println("\nmake2");
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.make2(new int[]{1, 2, 3})));
        System.out.println("Input: [1], Output: " + java.util.Arrays.toString(array1.make2(new int[]{1})));
        System.out.println("Input: [4, 5], Output: " + java.util.Arrays.toString(array1.make2(new int[]{4, 5})));

        // Testing makePi
        System.out.println("\nmakePi");
        System.out.println("Output: " + java.util.Arrays.toString(array1.makePi()));

        // Testing rotateLeft3
        System.out.println("\nrotateLeft3");
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.rotateLeft3(new int[]{1, 2, 3})));
        System.out.println("Input: [7, 8, 9], Output: " + java.util.Arrays.toString(array1.rotateLeft3(new int[]{7, 8, 9})));
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.rotateLeft3(new int[]{1, 2, 3})));

        // Testing sum2
        System.out.println("\nsum2");
        System.out.println("Input: [1, 2, 3], Output: " + array1.sum2(new int[]{1, 2, 3}));
        System.out.println("Input: [7, 8, 9], Output: " + array1.sum2(new int[]{7, 8, 9}));
        System.out.println("Input: [0], Output: " + array1.sum2(new int[]{0}));

        // Testing has23
        System.out.println("\nhas23");
        System.out.println("Input: [1, 2, 3], Output: " + array1.has23(new int[]{1, 2, 3}));
        System.out.println("Input: [1, 4, 5], Output: " + array1.has23(new int[]{1, 4, 5}));
        System.out.println("Input: [1, 5, 6], Output: " + array1.has23(new int[]{1, 5, 6}));

        // Testing double23
        System.out.println("\ndouble23");
        System.out.println("Input: [2, 2], Output: " + array1.double23(new int[]{2, 2}));
        System.out.println("Input: [3, 3], Output: " + array1.double23(new int[]{3, 3}));
        System.out.println("Input: [2, 3], Output: " + array1.double23(new int[]{2, 3}));

        // Testing biggerTwo
        System.out.println("\nbiggerTwo");
        System.out.println("Input: [1, 2], [1, 3], Output: " + array1.biggerTwo(new int[]{1, 2}, new int[]{1, 3}));
        System.out.println("Input: [1, 3], [1, 2], Output: " + array1.biggerTwo(new int[]{1, 3}, new int[]{1, 2}));
        System.out.println("Input: [5, 6], [4, 7], Output: " + array1.biggerTwo(new int[]{5, 6}, new int[]{4, 7}));

        // Testing swapEnds
        System.out.println("\nswapEnds");
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.swapEnds(new int[]{1, 2, 3})));
        System.out.println("Input: [7, 4, 5], Output: " + java.util.Arrays.toString(array1.swapEnds(new int[]{7, 4, 5})));
        System.out.println("Input: [1, 2, 1], Output: " + java.util.Arrays.toString(array1.swapEnds(new int[]{1, 2, 1})));

        // Testing frontPiece
        System.out.println("\nfrontPiece");
        System.out.println("Input: [1, 2, 3], Output: " + java.util.Arrays.toString(array1.frontPiece(new int[]{1, 2, 3})));
        System.out.println("Input: [1, 2, 3, 4], Output: " + java.util.Arrays.toString(array1.frontPiece(new int[]{1, 2, 3, 4})));
        System.out.println("Input: [1], Output: " + java.util.Arrays.toString(array1.frontPiece(new int[]{1})));

        // Testing front11
        System.out.println("\nfront11");
        System.out.println("Input: [1, 2, 3], [4, 5, 6], Output: " + java.util.Arrays.toString(array1.front11(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println("Input: [1], [2], Output: " + java.util.Arrays.toString(array1.front11(new int[]{1}, new int[]{2})));
        System.out.println("Input: [1, 2, 3], [1, 4, 5], Output: " + java.util.Arrays.toString(array1.front11(new int[]{1, 2, 3}, new int[]{1, 4, 5})));
    }
}
