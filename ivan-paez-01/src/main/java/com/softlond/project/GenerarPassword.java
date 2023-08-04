package main.java.com.softlond.project;

import java.util.Random;

public class GenerarPassword {

  public static void password() {
    Random random = new Random();

    String password = "";

    for (int i = 0; i < 4; i++) {
      password += random.nextInt(10);
      password += (char) (random.nextInt(26) + 'a');
    }

    System.out.println(password);
  }
}
