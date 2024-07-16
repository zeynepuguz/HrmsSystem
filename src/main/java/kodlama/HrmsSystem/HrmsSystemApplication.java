package kodlama.HrmsSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Configuration
@ComponentScan(basePackages = {"kodlama.HrmsSystem"})
public class HrmsSystemApplication {


	public static void main(String[] args) {
		SpringApplication.run(HrmsSystemApplication.class, args);

	}
	
	@Bean
	public Docket api(){
	return new Docket(DocumentationType.SWAGGER_2)
			   .select()
	           .apis(RequestHandlerSelectors.basePackage("kodlama.HrmsSystem"))
	           .build();
	        }

	

}
