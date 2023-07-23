public class CaesarCipher {
    public static String encryptDecrypt(String text, boolean encrypt, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                if (encrypt) {
                    ch = (char) ((ch + key - 'a') % 26 + 'a');
                } else {
                    ch = (char) ((ch - key - 'a' + 26) % 26 + 'a');
                }
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String message = "Hello, World!";
        int key = 3;
        boolean encrypt = true;

        String encryptedMessage = encryptDecrypt(message, encrypt, key);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = encryptDecrypt(encryptedMessage, !encrypt, key);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}