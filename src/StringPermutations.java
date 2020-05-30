public class StringPermutations {
    public static void main(String[] args) {
        permutation("abbc", "");
    }

    private static void permutation(String str, String prefix) {

        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + c);
            }
        }
    }
}
