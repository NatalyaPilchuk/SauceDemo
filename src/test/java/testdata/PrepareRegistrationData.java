package testdata;

import models.RegistrationModel;

public class PrepareRegistrationData {
    public static RegistrationModel getValidRegistration1(){
        return RegistrationModel.builder().userName("standard_user").password("secret_sauce").build();
    }

    public static RegistrationModel getInvalidRegistration2(){
        return RegistrationModel.builder().userName("locked_out_user").password("secret_sauce").build();
    }

    public static RegistrationModel getRegistration3(){
        return RegistrationModel.builder().userName("problem_user").password("secret_sauce").build();
    }
    public static RegistrationModel getRegistration4(){
        return RegistrationModel.builder().userName("performance_glitch_user").password("secret_sauce").build();
    }
}
