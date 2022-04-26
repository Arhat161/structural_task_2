public class BinOps {

    public String sum(String a, String b) {

        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int sumAB = intA + intB;

        return Integer.toBinaryString(sumAB);

    }

    public String mult(String a, String b) {

        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int multAB = intA * intB;

        return Integer.toBinaryString(multAB);
    }

}