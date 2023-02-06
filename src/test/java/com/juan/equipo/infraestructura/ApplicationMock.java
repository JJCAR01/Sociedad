package com.juan.equipo.infraestructura;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.juan"})
@EnableJpaRepositories(basePackages = "com.juan")
public class ApplicationMock {
}
