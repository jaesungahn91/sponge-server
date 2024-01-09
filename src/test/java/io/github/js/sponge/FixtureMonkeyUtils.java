package io.github.js.sponge;

import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;

public class FixtureMonkeyUtils {

    private static final FixtureMonkey fixtureMonkey = FixtureMonkey.builder()
            .defaultNotNull(Boolean.TRUE)
            .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
            .build();

    public static FixtureMonkey getFixtureMonkey() {
        return fixtureMonkey;
    }
}
