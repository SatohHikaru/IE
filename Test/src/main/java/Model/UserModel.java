package Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserModel {

    private String userName;
    private String password;

    private String firstName;
    private String middleName;
    private String lastName;

    private String suffix;

    private String Month;
    private String Day;
    private String Year;

}