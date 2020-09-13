package guru.sfg.brewery.msccbreweryconfigrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsccBreweryConfigRepoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MsccBreweryConfigRepoApplication.class, args);

    }

}
