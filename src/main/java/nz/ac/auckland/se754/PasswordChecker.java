package nz.ac.auckland.se754;

public class PasswordChecker {

  public Boolean isValid(String s) {
    return s.length() >= 8;
  }
}
