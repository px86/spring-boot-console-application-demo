package io.github.px86.spring_boot_console_application_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class ICommandLineRunnerA implements CommandLineRunner {
  private final Logger log = LoggerFactory.getLogger(ICommandLineRunnerA.class);

  @Override
  public void run(String... args) {
    log.info("START OF COMMAND LINE ARGUMENTS");
    for (String arg : args) {
      log.info(arg);
    }
    log.info("END OF COMMAND LINE ARGUMENTS");
  }
}
