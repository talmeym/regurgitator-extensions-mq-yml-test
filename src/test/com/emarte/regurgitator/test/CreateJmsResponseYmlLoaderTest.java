/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.CreateJmsResponseYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.*;

public class CreateJmsResponseYmlLoaderTest extends YmlLoaderTest {
    public CreateJmsResponseYmlLoaderTest() {
        super(new CreateJmsResponseYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse.yml", CreateJmsResponse);
    }

    @Test
    public void testProcessor() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_processor.yml", CreateJmsResponse_processor);
    }

    @Test
    public void testMutipleProcessor() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_multipleProcessors.yml", CreateJmsResponse_multipleProcessors);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/CreateJmsResponse_fullLoad.yml");
    }
}
