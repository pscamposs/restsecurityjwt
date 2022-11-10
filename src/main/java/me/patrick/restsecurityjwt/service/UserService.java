package me.patrick.restsecurityjwt.service;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.patrick.restsecurityjwt.model.UserModel;
import me.patrick.restsecurityjwt.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository repository;


    private final PasswordEncoder encoder;

    public void createUser(UserModel user){
        String pass = user.getPassword();
        //criptografando a senha antes de salvar no banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
}