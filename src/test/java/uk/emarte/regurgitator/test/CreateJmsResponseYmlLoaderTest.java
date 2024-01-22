/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.mq.CreateJmsResponseYmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.*;

public class CreateJmsResponseYmlLoaderTest extends YmlLoaderTest {
    public CreateJmsResponseYmlLoaderTest() {
        super(new CreateJmsResponseYmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse.yml", CreateJmsResponse);
    }

    @Test
    public void testProcessor() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_processor.yml", CreateJmsResponse_processor);
    }

    @Test
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_multipleProcessors.yml", CreateJmsResponse_multipleProcessors);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/CreateJmsResponse_fullLoad.yml");
    }
}
