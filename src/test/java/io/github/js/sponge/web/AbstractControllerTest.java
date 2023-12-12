package io.github.js.sponge.web;

import io.github.js.sponge.SpongeServerApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
@SpringBootTest(classes = SpongeServerApplication.class)
public abstract class AbstractControllerTest {

    protected MockMvc mockMvc;

    @BeforeEach
    protected void setUp(WebApplicationContext webAppContext) throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext)
                .addFilters(new CharacterEncodingFilter("UTF-8", true)).build();
    }

}
