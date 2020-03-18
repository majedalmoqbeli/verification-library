package com.majedalmoqbeli.verification;

public class Verification {

    /**
     * this function to check if the user name is valid
     *
     * @param target : the input user name
     * @return : true or false
     */
    public static boolean isValidUsername(String target) {
        return target.matches("[A-Za-z0-9]+");
    }


    /**
     * this function to check if the email is valid
     *
     * @param target : the input email
     * @return : true or false
     */
    public static boolean isValidEmail(String target) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

}
