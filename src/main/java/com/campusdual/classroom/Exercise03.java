package com.campusdual.classroom;

public class Exercise03 {

    // Devolver el mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.

    public static String greetings(String name) {
        return "Hola. Bienvenido " + name;
    }

    // Devolver el mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro

    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
    }

    // Comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()

    public static void checkUser(String user, String pass) {
        if (user.equals("Sebas") && pass.equals("sebas01")) {
            System.out.println(greetings(user));
        } else {
            System.out.println(error("Sebas"));

        }
    }
    public static void main (String[]args){
        checkUser("Sebas", "sebas01");
        checkUser("Juan", "Juan123");
    }

}