package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@Builder
@EqualsAndHashCode
public class RegistrationModel {

    private String userName;
    private String password;
}
