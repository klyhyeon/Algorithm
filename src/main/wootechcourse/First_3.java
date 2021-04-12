package wootechcourse;

public class First_3 {
    static int[] pobiPages = new int[2];
    static int[] crongPages = new int[2];
    static int[] pobiResults = new int[4];
    static int[] crongResults = new int[4];
    static int pobiMax = 0;
    static int crongMax = 0;
    static int answer;

    public static void main(String[] args) {
        pobiPages = new int[]{99, 102};
        crongPages = new int[]{211, 212};
        System.out.println(pageResult(pobiPages, crongPages));
    }

    public static int pageResult(int[] pobiPages, int[] crongPages) {
        if (pobiPages[1] - pobiPages[0] != 1 || crongPages[1] - crongPages[0] != 1) {
            answer = -1;
        } else {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                        pobiResults[i] = makePlus(pobiPages[0]);
                        crongResults[i] = makePlus(crongPages[0]);
                        pobiResults[i] = makeMultiply(pobiPages[0]);
                        crongResults[i] = makeMultiply(crongPages[0]);
                } else {
                        pobiResults[i] = makePlus(pobiPages[1]);
                        crongResults[i] = makePlus(crongPages[1]);
                        pobiResults[i] = makeMultiply(pobiPages[1]);
                        crongResults[i] = makeMultiply(crongPages[1]);
                }
            }
            for (int k = 0; k < 4; k++) {
                if (pobiResults[k] >= pobiMax)
                    pobiMax = pobiResults[k];
                if (crongResults[k] >= crongMax)
                    crongMax = crongResults[k];
            }
            if (pobiMax == crongMax) {
                answer = 0;
            } else if (pobiMax > crongMax) {
                answer = 1;
            } else {
                answer = 2;
            }
        }

        return answer;
    }

    public static int makePlus(int n) {
        int makePlusResult = 0;
        while (n > 0) {
            makePlusResult += n % 10;
            n /= 10;
        }
        return makePlusResult;
    }

    public static int makeMultiply(int m) {
        int makeMultiplyResult = 1;
        while (m > 0) {
            makeMultiplyResult *= m % 10;
            m /= 10;
        }
        return makeMultiplyResult;
    }
}
