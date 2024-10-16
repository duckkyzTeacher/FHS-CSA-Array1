package src.main.java;

public class Array1Driver {

    public static void main(String[] args) {
        Array1 array1 = new Array1();

        // Running tests for firstLast6
        runFirstLast6Tests(array1);
        
        // Running tests for commonEnd
        runCommonEndTests(array1);
        
        // Running tests for reverse3
        runReverse3Tests(array1);
        
        // Running tests for middleWay
        runMiddleWayTests(array1);
        
        // Running tests for no23
        runNo23Tests(array1);
        
        // Running tests for fix23
        runFix23Tests(array1);
        
        // Running tests for makeMiddle
        runMakeMiddleTests(array1);
        
        // Running tests for midThree
        runMidThreeTests(array1);
        
        // Running tests for unlucky1
        runUnlucky1Tests(array1);
        
        // Running tests for sameFirstLast
        runSameFirstLastTests(array1);
        
        // Running tests for sum3
        runSum3Tests(array1);
        
        // Running tests for maxEnd3
        runMaxEnd3Tests(array1);
        
        // Running tests for makeEnds
        runMakeEndsTests(array1);
        
        // Running tests for makeLast
        runMakeLastTests(array1);
        
        // Running tests for start1
        runStart1Tests(array1);
        
        // Running tests for plusTwo
        runPlusTwoTests(array1);
        
        // Running tests for maxTriple
        runMaxTripleTests(array1);
        
        // Running tests for make2
        runMake2Tests(array1);
        
        // Running tests for makePi
        runMakePiTests(array1);
        
        // Running tests for rotateLeft3
        runRotateLeft3Tests(array1);
        
        // Running tests for sum2
        runSum2Tests(array1);
        
        // Running tests for has23
        runHas23Tests(array1);
        
        // Running tests for double23
        runDouble23Tests(array1);
        
        // Running tests for biggerTwo
        runBiggerTwoTests(array1);
        
        // Running tests for swapEnds
        runSwapEndsTests(array1);
        
        // Running tests for frontPiece
        runFrontPieceTests(array1);
        
        // Running tests for front11
        runFront11Tests(array1);
    }

    // Test methods below
    private static void runFirstLast6Tests(Array1 array1) {
        System.out.println("Testing firstLast6:");
        printResult(array1.firstLast6(new int[]{6, 1, 2}), new int[]{6, 1, 2});
        printResult(array1.firstLast6(new int[]{1, 2, 6}), new int[]{1, 2, 6});
        printResult(array1.firstLast6(new int[]{1, 6, 3}), new int[]{1, 6, 3});
        System.out.println();
    }

    private static void runCommonEndTests(Array1 array1) {
        System.out.println("Testing commonEnd:");
        printResult(array1.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}), new int[]{1, 2, 3}, new int[]{7, 3});
        printResult(array1.commonEnd(new int[]{1, 2, 3}, new int[]{3, 2}), new int[]{1, 2, 3}, new int[]{3, 2});
        printResult(array1.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}), new int[]{1, 2, 3}, new int[]{1, 3});
        System.out.println();
    }

    private static void runReverse3Tests(Array1 array1) {
        System.out.println("Testing reverse3:");
        printArrayResult(array1.reverse3(new int[]{1, 2, 3}));
        printArrayResult(array1.reverse3(new int[]{7, 8, 9}));
        printArrayResult(array1.reverse3(new int[]{0, 0, 7}));
        System.out.println();
    }

    private static void runMiddleWayTests(Array1 array1) {
        System.out.println("Testing middleWay:");
        printArrayResult(array1.middleWay(new int[]{1, 2, 3}, new int[]{2, 5, 6}));
        printArrayResult(array1.middleWay(new int[]{7, 7, 7}, new int[]{5, 6, 8}));
        printArrayResult(array1.middleWay(new int[]{5, 6, 3}, new int[]{9, 4, 5}));
        System.out.println();
    }

    private static void runNo23Tests(Array1 array1) {
        System.out.println("Testing no23:");
        printResult(array1.no23(new int[]{4, 5}));
        printResult(array1.no23(new int[]{3, 4}));
        printResult(array1.no23(new int[]{4, 9}));
        System.out.println();
    }

    private static void runFix23Tests(Array1 array1) {
        System.out.println("Testing fix23:");
        printArrayResult(array1.fix23(new int[]{1, 2, 3}));
        printArrayResult(array1.fix23(new int[]{2, 3, 5}));
        printArrayResult(array1.fix23(new int[]{1, 3, 2}));
        System.out.println();
    }

    private static void runMakeMiddleTests(Array1 array1) {
        System.out.println("Testing makeMiddle:");
        printArrayResult(array1.makeMiddle(new int[]{1, 2, 3, 4}));
        printArrayResult(array1.makeMiddle(new int[]{1, 2, 3, 4, 5, 10}));
        printArrayResult(array1.makeMiddle(new int[]{5, 7}));
        System.out.println();
    }

    private static void runMidThreeTests(Array1 array1) {
        System.out.println("Testing midThree:");
        printArrayResult(array1.midThree(new int[]{1, 2, 3, 4, 5}));
        printArrayResult(array1.midThree(new int[]{1, 7, 7, 5, 3, 6, 6}));
        printArrayResult(array1.midThree(new int[]{1, 2, 3}));
        System.out.println();
    }

    private static void runUnlucky1Tests(Array1 array1) {
        System.out.println("Testing unlucky1:");
        printResult(array1.unlucky1(new int[]{1, 3, 4, 5}));
        printResult(array1.unlucky1(new int[]{2, 1, 3, 4, 5}));
        printResult(array1.unlucky1(new int[]{1, 1, 1}));
        System.out.println();
    }

    private static void runSameFirstLastTests(Array1 array1) {
        System.out.println("Testing sameFirstLast:");
        printResult(array1.sameFirstLast(new int[]{1, 2, 3, 1}));
        printResult(array1.sameFirstLast(new int[]{1, 2, 3}));
        printResult(array1.sameFirstLast(new int[]{1, 2, 1}));
        System.out.println();
    }

    private static void runSum3Tests(Array1 array1) {
        System.out.println("Testing sum3:");
        System.out.println(array1.sum3(new int[]{1, 2, 3}));
        System.out.println(array1.sum3(new int[]{4, 5, 6}));
        System.out.println(array1.sum3(new int[]{0, 0, 0}));
        System.out.println();
    }

    private static void runMaxEnd3Tests(Array1 array1) {
        System.out.println("Testing maxEnd3:");
        System.out.println(array1.maxEnd3(new int[]{1, 2, 3}));
        System.out.println(array1.maxEnd3(new int[]{7, 5, 6}));
        System.out.println(array1.maxEnd3(new int[]{1, 2, 1}));
        System.out.println();
    }

    private static void runMakeEndsTests(Array1 array1) {
        System.out.println("Testing makeEnds:");
        printArrayResult(array1.makeEnds(new int[]{1, 2, 3}));
        printArrayResult(array1.makeEnds(new int[]{7, 8, 9, 5}));
        printArrayResult(array1.makeEnds(new int[]{1, 2, 3, 1}));
        System.out.println();
    }

    private static void runMakeLastTests(Array1 array1) {
        System.out.println("Testing makeLast:");
        printArrayResult(array1.makeLast(new int[]{1, 2, 3}));
        printArrayResult(array1.makeLast(new int[]{6, 7}));
        printArrayResult(array1.makeLast(new int[]{1}));
        System.out.println();
    }

    private static void runStart1Tests(Array1 array1) {
        System.out.println("Testing start1:");
        System.out.println(array1.start1(new int[]{1, 2, 3}, new int[]{1, 4, 5}));
        System.out.println(array1.start1(new int[]{1, 2}, new int[]{2}));
        System.out.println(array1.start1(new int[]{2, 3}, new int[]{}));
        System.out.println();
    }

    private static void runPlusTwoTests(Array1 array1) {
        System.out.println("Testing plusTwo:");
        printArrayResult(array1.plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        printArrayResult(array1.plusTwo(new int[]{1, 3}, new int[]{2, 4}));
        printArrayResult(array1.plusTwo(new int[]{9, 2}, new int[]{3, 4}));
        System.out.println();
    }

    private static void runMaxTripleTests(Array1 array1) {
        System.out.println("Testing maxTriple:");
        System.out.println(array1.maxTriple(new int[]{1, 2, 3}));
        System.out.println(array1.maxTriple(new int[]{7}));
        System.out.println(array1.maxTriple(new int[]{4, 1, 2, 3, 2, 3, 1, 1, 2, 3, 0}));
        System.out.println();
    }

    private static void runMake2Tests(Array1 array1) {
        System.out.println("Testing make2:");
        printArrayResult(array1.make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        printArrayResult(array1.make2(new int[]{4}, new int[]{1, 2, 3}));
        printArrayResult(array1.make2(new int[]{}, new int[]{2, 9}));
        System.out.println();
    }

    private static void runMakePiTests(Array1 array1) {
        System.out.println("Testing makePi:");
        printArrayResult(array1.makePi());
        System.out.println();
    }

    private static void runRotateLeft3Tests(Array1 array1) {
        System.out.println("Testing rotateLeft3:");
        printArrayResult(array1.rotateLeft3(new int[]{1, 2, 3}));
        printArrayResult(array1.rotateLeft3(new int[]{7, 8, 9}));
        printArrayResult(array1.rotateLeft3(new int[]{3, 8, 5}));
        System.out.println();
    }

    private static void runSum2Tests(Array1 array1) {
        System.out.println("Testing sum2:");
        System.out.println(array1.sum2(new int[]{1, 2, 3}));
        System.out.println(array1.sum2(new int[]{7, 8, 9}));
        System.out.println(array1.sum2(new int[]{6}));
        System.out.println(array1.sum2(new int[]{}));
        System.out.println();
    }

    private static void runHas23Tests(Array1 array1) {
        System.out.println("Testing has23:");
        printResult(array1.has23(new int[]{2, 3}), new int[]{2, 3});
        printResult(array1.has23(new int[]{4, 3}), new int[]{4, 3});
        printResult(array1.has23(new int[]{5, 6}), new int[]{5, 6});
        System.out.println();
    }

    private static void runDouble23Tests(Array1 array1) {
        System.out.println("Testing double23:");
        printResult(array1.double23(new int[]{2, 2}), new int[]{2, 2});
        printResult(array1.double23(new int[]{3, 3}), new int[]{3, 3});
        printResult(array1.double23(new int[]{2, 3}), new int[]{2, 3});
        System.out.println();
    }

    private static void runBiggerTwoTests(Array1 array1) {
        System.out.println("Testing biggerTwo:");
        printArrayResult(array1.biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
        printArrayResult(array1.biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
        printArrayResult(array1.biggerTwo(new int[]{1, 1}, new int[]{1, 2}));
        System.out.println();
    }

    private static void runSwapEndsTests(Array1 array1) {
        System.out.println("Testing swapEnds:");
        printArrayResult(array1.swapEnds(new int[]{1, 2, 3}));
        printArrayResult(array1.swapEnds(new int[]{7, 4, 5}));
        printArrayResult(array1.swapEnds(new int[]{1, 2, 1}));
        System.out.println();
    }

    private static void runFrontPieceTests(Array1 array1) {
        System.out.println("Testing frontPiece:");
        printArrayResult(array1.frontPiece(new int[]{1, 2, 3}));
        printArrayResult(array1.frontPiece(new int[]{1, 3, 2, 4}));
        printArrayResult(array1.frontPiece(new int[]{1}));
        System.out.println();
    }

    private static void runFront11Tests(Array1 array1) {
        System.out.println("Testing front11:");
        printArrayResult(array1.front11(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        printArrayResult(array1.front11(new int[]{1}, new int[]{2}));
        printArrayResult(array1.front11(new int[]{1, 7}, new int[]{}));
        System.out.println();
    }

    // Helper methods to print results
    private static void printResult(boolean result, int[]... inputs) {
        StringBuilder inputStr = new StringBuilder();
        for (int[] input : inputs) {
            inputStr.append("[");
            for (int num : input) {
                inputStr.append(num).append(", ");
            }
            inputStr.setLength(inputStr.length() - 2); // Remove last comma
            inputStr.append("] ");
        }
        System.out.printf("Input: %s | Result: %s\n", inputStr.toString(), result);
    }

    private static void printArrayResult(int[] result) {
        String resultStr = "[ ";
        for(int num : result){
            resultStr += num + " ";
        }
        resultStr += "]";
        System.out.printf("Result: %s\n", resultStr);
    }
    
}
