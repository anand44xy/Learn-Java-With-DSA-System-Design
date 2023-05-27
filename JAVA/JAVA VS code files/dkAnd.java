public class dkAnd {
    public static void main(String[] args) {
        // String str = "Hey! This is dinesh@123.&^%$";
        String str = "A  H !";
        String resultString = "";
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int consonantCount = 0;
        int vowelsCount = 0;
        int specialCharcatersCount = 0;
        int spaceCount = 0;

        for(int i = 0; i<str.length(); i++) {
            char currentChar = str.charAt(i);
            
            if(currentChar >= 65 && currentChar<=90 || currentChar >=97 && currentChar<=122) {

                boolean isVowel = false;

                for (char currentVowel : vowels) {
                    if(currentVowel == currentChar) {
                        isVowel = true;
                        resultString = resultString+currentChar;
                        vowelsCount++;
                        break;
                    }
                }

                if(isVowel == false) {
                    consonantCount++;
                }


            } else {
                if(currentChar != 32){
                    resultString = resultString+currentChar;
                    specialCharcatersCount++;
                } else {
                    spaceCount++;
                }
                
            }

        }
        System.out.println("String without vowel is: ");
        System.out.println();
        System.out.println(resultString);

        System.out.println("Vowels count is: "+ vowelsCount);
        System.out.println("consonants count is: "+ consonantCount);
        System.out.println("special count is: "+ specialCharcatersCount);
        System.out.println("space count: "+ spaceCount);

    }
}
