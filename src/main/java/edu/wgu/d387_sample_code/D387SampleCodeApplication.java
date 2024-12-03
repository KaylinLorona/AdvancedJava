package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Properties;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

@SpringBootApplication
public class D387SampleCodeApplication {
	static ExecutorService messageExecutor=newFixedThreadPool(2);

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		//Properties properties = new Properties();
		messageExecutor.execute(() -> {
			String welcomeMessageFR = loadWelcomeMessage("translation_welcome_en_FR.properties");
			System.out.println(welcomeMessageFR);
			/*try {
				InputStream stream = new ClassPathResource("translation_welcome_en_FR.properties").getInputStream();
				properties.load(stream);
				System.out.println(properties.getProperty("welcome"));
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		});

		messageExecutor.execute(() -> {
			String welcomeMessageFR = loadWelcomeMessage("translation_welcome_en_US.properties");
			System.out.println(welcomeMessageFR);
			/*try {
				InputStream stream = new ClassPathResource("translation_welcome_en_US.properties").getInputStream();
				properties.load(stream);
				System.out.println(properties.getProperty("welcome"));
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		});
	}
	private static String loadWelcomeMessage(String fileName) {
		Properties properties = new Properties();
		try (InputStream stream = new ClassPathResource(fileName).getInputStream()) {
			properties.load(stream);
			return properties.getProperty("welcome");
		} catch (Exception e) {
			e.printStackTrace();
			return null; // Return null or a default value if an error occurs
		}
	}
}
