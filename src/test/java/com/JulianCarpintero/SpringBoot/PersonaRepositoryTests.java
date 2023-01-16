package com.JulianCarpintero.SpringBoot;

import com.JulianCarpintero.SpringBoot.Model.Persona;
import com.JulianCarpintero.SpringBoot.Repository.PersonaRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class PersonaRepositoryTests {
    @Autowired
    PersonaRepository repo;
    
    @Test
    public void testCreatePersona(){
        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String rawPassword = "jic050704";
        String encodePassword=passwordEncoder.encode(rawPassword);
        Persona newPersona= new Persona("juliancarpintero04@gmail.com", encodePassword);
        Persona savedPersona = repo.save(newPersona);
        assertThat(savedPersona).isNotNull();
        assertThat(savedPersona.getId()).isGreaterThan(0);
    }
}
