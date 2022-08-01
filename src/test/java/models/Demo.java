package models;

import org.testng.annotations.Test;

public class Demo {
    @Test
    public void checkItems() {
        SignInModel signInModel1 = new SignInModel.Builder().username("standard_user").password("secret_sauce").build();
        SignInModel signInModel2 = new SignInModel.Builder().username("locked_out_user").password("secret_sauce").build();
        SignInModel signInModel3 = new SignInModel.Builder().username("problem_user").password("secret_sauce").build();
        SignInModel signInModel4 = new SignInModel.Builder().username("performance_glitch_user").password("secret_sauce").build();
    }
}
