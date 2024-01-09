/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.extensions.mq.JmsCallYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.JmsCall;

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