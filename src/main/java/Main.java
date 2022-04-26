public class Main {
    public static void main(String[] args) {

        BinOps bins = new BinOps(); // new Facade Class Object

        String binA = "10111"; // 23
        String binB = "11011"; // 27
        int intA = Integer.parseInt(binA, 2); // 10111
        int intB = Integer.parseInt(binB, 2); // 11011

        String binSumAB = bins.sum(binA, binB); // 10111 + 11011
        int intSumAB = Integer.parseInt(binSumAB, 2); // bin -> int

        System.out.println("При сложении '" + binA + "' (т.е " + intA + ") и '" + binB + "' (т.е " + intB + ") получится '"
                + binSumAB + "', или " + intSumAB + " в десятичной системе исчисления.");

        String binMultAB = bins.mult(binA, binB); // 10111 * 11011
        int intMultAB = Integer.parseInt(binMultAB, 2); // bin -> int

        System.out.println("При умножении '" + binA + "' (т.е " + intA + ") и '" + binB + "' (т.е " + intB + ") получится '"
                + binMultAB + "', или " + intMultAB + " в десятичной системе исчисления.");
    }
}
