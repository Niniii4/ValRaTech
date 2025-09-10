package perf;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;

import static com.intuit.karate.gatling.javaapi.KarateDsl.karateFeature;
import static com.intuit.karate.gatling.javaapi.KarateDsl.karateProtocol;
import static io.gatling.javaapi.core.CoreDsl.*;

public class PerformanceTests extends Simulation {
    ScenarioBuilder helloScenario = scenario("ValRaTech API Performance Test")
            .exec(
                    exec(karateFeature("classpath:features/api/PositiveTests.feature")),
                    exec(karateFeature("classpath:features/api/NegativeTests.feature"))
            );

    {
        setUp(
                helloScenario.injectOpen(
                        rampUsers(10).during(java.time.Duration.ofSeconds(20))
                )
        ).protocols(karateProtocol());
    }
}
