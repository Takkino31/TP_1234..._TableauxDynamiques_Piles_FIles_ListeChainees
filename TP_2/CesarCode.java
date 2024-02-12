class CesarCode {
    static char [] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {

        System.out.println("Le message codé est :::> " + (crypter("Je vais au marche", 13)));
        System.out.println("Le message décodé est :::> " + (decrypter(crypter("Je vais au marche", 13),13)));
    
    }

    public static String crypter(String message, int key){
        message = message.toLowerCase();
        char[] tabMessage = message.toCharArray();
        System.out.println(tabMessage);
        String tabCypher = "";

            for (int k = 0; k < tabMessage.length; k++) {
                
                    if (tabMessage[k] == ' ') {
                        tabCypher+= ' ';
                    }
                    else {
                        // Substitution grâce à la clé
                        for (int i = 0; i < alphabetArray.length; i++) {
                            if (tabMessage[k] == alphabetArray[i]) {
                                int j = i+key;
                                if (j >= alphabetArray.length){
                                    j = j-26;
                                }
                                tabCypher += alphabetArray[j];
                            }
                        }
                    }                 
                
        }
        return tabCypher;
        
    }


    public static String decrypter(String message, int key){
        char[] tabMessage = message.toCharArray();
            System.out.println(tabMessage);
            String tabCypher = "";
                for (int k = 0; k < tabMessage.length; k++) {
                        if (tabMessage[k] == ' ') {
                            tabCypher+= ' ';
                        }
                        else {
                            // Substitution grâce à la clé
                            for (int i = 0; i < alphabetArray.length; i++) {
                                if (tabMessage[k] == alphabetArray[i]) {
                                    int j = i - key;
                                    if (j < 0) 
                                        j = j + 26;
                                    tabCypher += alphabetArray[j];
                                }

                            }
                        }                 
                    
            }
        return tabCypher;
    }
}