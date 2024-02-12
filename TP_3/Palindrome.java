public class Palindrome {
    static int [] t1= { 1,2,3,1,3,2,4};
    public static void main(String[] args) {
        System.out.println("Le mot matam est un palindrome => " + palindromeWord("matam"));
        System.out.println("Le tableau est un palindrome => " + palindromeTab(t1));
    }

    public static boolean palindromeWord(String chaine){
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) != chaine.charAt(chaine.length()-i-1)) {
                return false;
            }

        }
        return true;
    }

        public static boolean palindromeTab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != tab[tab.length-i-1]) {
                return false;
            }

        }
        return true;
    }
}
