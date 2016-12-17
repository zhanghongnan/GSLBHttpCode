package jetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 张宏南 on 2016-10-25.
 * Project GSLBHttpCode
 * Package jetty
 */
@SpringBootApplication
public class StartJettyApplication {
/*    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }*/
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartJettyApplication.class, args);
    }
}
//http://localhost:8080/api/status888
//http://172.17.141.101:8080/api/status888
//http://gslb.meizu.com/api/status888
