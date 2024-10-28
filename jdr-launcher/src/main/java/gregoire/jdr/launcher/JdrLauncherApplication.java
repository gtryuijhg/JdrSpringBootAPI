package gregoire.jdr.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	scanBasePackages = {
		"gregoire.jdr.web"
	})
public class JdrLauncherApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdrLauncherApplication.class, args);
	}

}
