/**
* Specifies methods to encipher and decipher text strings.
*/

public interface JCipher {

  /**
  * Enciphers text
  *
  * @param s the string to be enciphered
  *
  * @return the enciphered text
  */
  String encipher(String s);

  /**
  * Deciphers text
  *
  * @param s the text to be deciphered
  *
  * @return the clear copy of the text
  */
  String decipher(String s);

}
