package ua.kyrylo.bieliaiev;

import com.google.gson.Gson;

public class Main {

  public static void main(String[] args) {
    Gson gson = new Gson();
    User user = new User("Kyrylo", "Bieliaiev");
    String json = gson.toJson(user);
    System.out.println(json);
  }

  private record User(String name, String surname) {}
}