package se.lexicon.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.Util.ScannerInputService;
import se.lexicon.Util.UserInputService;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "se.lexicon.*")
public class InputServiceConfig {

    @Bean("ScannerInputService")

    public Scanner scanner() {
        return new Scanner(System.in);
    }

}
