package ufjf.api_ponto_apoio.p_apoio;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static HashMap<String,PDA> listaPDAs;

    public static void main(String[] args) {
        listaPDAs = new HashMap<>();
        PDA teste = new PDA("valor teste","rua nula");
        PDA teste2 = new PDA("valor teste 2","rua nula");
        listaPDAs.put(teste.getId(), teste);
        listaPDAs.put(teste2.getId(), teste2);
        SpringApplication.run(Application.class, args);
    }
}