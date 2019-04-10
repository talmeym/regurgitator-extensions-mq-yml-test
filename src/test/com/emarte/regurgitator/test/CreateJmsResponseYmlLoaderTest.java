/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.CreateJmsResponseYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.CreateJmsResponse;

public class CreateJmsResponseYmlLoaderTest extends YmlLoaderTest {

    public CreateJmsResponseYmlLoaderTest() {
        super(new CreateJmsResponseYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse.yml", CreateJmsResponse);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/CreateJmsResponse_fullLoad.yml");
    }
}
