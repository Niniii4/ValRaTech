package perf;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;

import static com.intuit.karate.gatling.javaapi.KarateDsl.karateFeature;
import static com.intuit.karate.gatling.javaapi.KarateDsl.karateProtocol;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.core.OpenInjectionStep.atOnceUsers;

public class LoadTests extends Simulation {
    ScenarioBuilder helloScenario = scenario("ValRaTech API Load Test")
            .exec(karateFeature("classpath:features/PositiveTests.feature"));

    {
        setUp(
                helloScenario.injectOpen(
                        atOnceUsers(50)
                )
        ).protocols(karateProtocol());
    }
}
