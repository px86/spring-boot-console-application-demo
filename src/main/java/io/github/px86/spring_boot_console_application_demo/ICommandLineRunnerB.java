package io.github.px86.spring_boot_console_application_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ICommandLineRunnerB {
  private final Logger log = LoggerFactory.getLogger(ICommandLineRunnerB.class);

  @Bean
  @Order(Ordered.HIGHEST_PRECEDENCE)
  public CommandLineRunner getCommandLineRunner() {
    return (args) -> {
      log.info("START OF COMMAND LINE ARGUMENTS");
      for (String arg : args) {
        log.info(arg);
      }
      log.info("END OF COMMAND LINE ARGUMENTS");
    };
  }
}
