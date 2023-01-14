package Security;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter    
public class AuthRequest {
    @Email
    @Length(min=5,max=50)
    private String email;
    @Length(min=5,max=50)
    private String password;
}
