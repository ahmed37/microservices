package com.example;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.example.dao.CompanyRepository;
import com.example.entities.Company;

@EnableEurekaClient
@SpringBootApplication
public class CompanyBourseServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CompanyBourseServiceApplication.class, args);

		CompanyRepository companyRepository = ctx.getBean(CompanyRepository.class);
		Stream.of("Company1", "Company2", "Company3", "Company4", "Company5", "Company6", "Company7", "Company8",
				"Company9", "Company10", "Company11", "Company12", "Company13", "Company14", "Company15", "Company16",
				"Company17", "Company18", "Company19", "Company20", "Company21", "Company22", "Company23", "Company24",
				"Company25", "Company26", "Company27", "Company28", "Company29", "Company30", "Company31", "Company32",
				"Company33", "Company34", "Company35", "Company36", "Company37", "Company38", "Company39", "Company40",
				"Company41", "Company42", "Company43", "Company44", "Company45", "Company46", "Company47", "Company48",
				"Company49", "Company50", "Company51", "Company52", "Company53", "Company54", "Company55", "Company56",
				"Company57", "Company58", "Company59", "Company60", "Company61", "Company62", "Company63", "Company64",
				"Company65", "Company66", "Company67", "Company68", "Company69", "Company70", "Company71", "Company72",
				"Company73", "Company74", "Company75", "Company76", "Company77", "Company78", "Company79")
				.forEach(c -> companyRepository.save(new Company(c)));
		companyRepository.findAll().forEach(s -> System.out.println(s.getName()));
	}
}

@Configuration
class MyConfig extends RepositoryRestMvcConfiguration {

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Company.class);
	}
}
