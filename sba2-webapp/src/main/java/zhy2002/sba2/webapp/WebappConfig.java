package zhy2002.sba2.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


/**
 * This is the main Spring configuration class.
 */
@SpringBootApplication(scanBasePackages = "zhy2002.sba2")
public class WebappConfig extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(this.getClass());
    }

    public static void main(String[] args) {
        new SpringApplication(WebappConfig.class).run(args);
    }
}
