package io.github.js.sponge.web;

import io.github.js.sponge.SpongeServerApplication;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@SpringBootTest(classes = SpongeServerApplication.class)
public abstract class AbstractControllerTest {

    @ServiceConnection
    private static final PostgreSQLContainer<?> postgres;
    protected MockMvc mockMvc;

    static {
        postgres = new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
        postgres.start();
    }

    @BeforeEach
    protected void setUp(WebApplicationContext webAppContext) throws Exception {
        this.mockMvc = buildMockMvc(webAppContext);
    }

    private MockMvc buildMockMvc(WebApplicationContext webAppContext) {
        return MockMvcBuilders.webAppContextSetup(webAppContext)
                .addFilters(new CharacterEncodingFilter("UTF-8", true))
                .build();
    }

}
