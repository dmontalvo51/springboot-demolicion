package com.dmontalvo.demospringboot;

import com.dmontalvo.demospringboot.model.Blog;
import com.dmontalvo.demospringboot.repository.BlogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemospringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
    }

    @Bean
    public CommandLineRunner setup(BlogRepository blogRepo) {
        return args -> {
            blogRepo.save(new Blog("1. Clases Software", "Blog sobre las clases de Software"));
            blogRepo.save(new Blog("2. Clases Geografica", "Blog sobre las clases de Geografica"));
            blogRepo.save(new Blog("3. Clases GMC", "Blog sobre las clases de GMC"));
            blogRepo.save(new Blog("4. Clases Colegio", "Blog sobre las clases para colegios"));
        };
    }
}
