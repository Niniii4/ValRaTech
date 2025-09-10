package example;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

import static com.intuit.karate.junit5.Karate.run;

class TestRunner {

    @Test
    Karate testAll() {
        return run("classpath:features")
                .tags("@UITests");
    }

}