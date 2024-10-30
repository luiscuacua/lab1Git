package service;

public class AdminUser {
    public static void main(String[] args) {

        System.out.println("Hello, AdminUser!");
        UserService userService = new UserService();
        userService.guardarUsuario();
    }
}