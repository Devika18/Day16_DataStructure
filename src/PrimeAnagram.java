/* Extend the Prime Number Program and store only the numbers in that range that are Anagrams.
For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
*/

public class PrimeAnagram {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean anagram(int n1, int n2) {
        int[] n1count = count(n1);
        int[] n2count = count(n2);
        for (int i = 0; i < n2count.length; i++) {
            if (n1count[i] != n2count[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] count(int n) {
        int[] count = new int[10];
        int temp = n;
        while (temp != 0) {
            int r = temp % 10;
            count[r]++;
            temp = temp / 10;
        }
        return count;
    }


    public static void main(String[] args) {
        int array[][] = new int[10][100];
        int prime[][] = new int[10][100];

        int temp = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                array[i][j] = temp;
                temp++;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if (PrimeAnagram.isPrime(array[i][j])) {
                    prime[i][j] = array[i][j];
                } else {
                    prime[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if (prime[i][j] != -1) {
                    for (int k = j + 1; k < 100; k++) {
                        if (prime[i][k] != -1 && PrimeAnagram.anagram(prime[i][j], prime[i][k])) {
                            System.out.println(prime[i][j] + "  " + prime[i][k]);
                        }
                    }
                }
            }
        }
    }
}
