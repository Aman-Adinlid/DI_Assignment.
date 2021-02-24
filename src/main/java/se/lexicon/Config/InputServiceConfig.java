package se.lexicon.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.Util.ScannerInputService;
import se.lexicon.Util.UserInputService;

@Configuration
public class InputServiceConfig {

    @Bean("ScannerInputService")

    public UserInputService userInputService() {
        return new ScannerInputService();
    }

}
