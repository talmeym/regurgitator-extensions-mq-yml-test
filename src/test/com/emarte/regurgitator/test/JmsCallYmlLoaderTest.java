/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.JmsCallYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.JmsCall;

public class JmsCallYmlLoaderTest extends YmlLoaderTest {
    public JmsCallYmlLoaderTest() {
        super(new JmsCallYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JmsCall.yml", JmsCall);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JmsCall_fullLoad.yml");
    }
}