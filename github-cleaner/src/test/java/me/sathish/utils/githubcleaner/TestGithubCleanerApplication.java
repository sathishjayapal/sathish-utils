package me.sathish.utils.githubcleaner;

import org.springframework.boot.SpringApplication;

public class TestGithubCleanerApplication {

    public static void main(String[] args) {
        SpringApplication.from(GithubCleanerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
