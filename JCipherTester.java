/**
* Tests classes that implement the JCipher interface
*
*/
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public final class JCipherTester {
  
  private JCipherTester(){}

/**
* Tests the specified class with a specific string
*
* @param className the JCipher implementation to be checked
* @param text the specific text to be verified
*
* @return whether the implementation correctly enciphers/deciphers the text
*/
public static boolean test(String className, String text) throws
  ClassNotFoundException, NoSuchMethodException, IllegalAccessException, 
  InvocationTargetException {
  Class<?> c = Class.forName(className);
  Method encipher = c.getMethod("encipher");
  Method decipher = c.getMethod("decipher");
  String enciphered = (String) encipher.invoke(text);
  String deciphered = (String) decipher.invoke(enciphered);
  return deciphered.equals(text);
}

/**
* Tests the specified class against a variety of preset strings
*
* @param className the JCipher implementation to be checked
*
* @return whether the implementation passes the built-in checks
*/
public static boolean test(String className) {
  return false;
}
}
