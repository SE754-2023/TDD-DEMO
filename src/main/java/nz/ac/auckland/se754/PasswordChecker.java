package nz.ac.auckland.se754;

public class PasswordChecker {

  public Boolean isValid(String s, User user) {
    return s.length() >= 8;
  }


}
