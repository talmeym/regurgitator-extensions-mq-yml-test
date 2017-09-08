package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.CreateJmsResponseYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class CreateJmsResponseYmlLoaderTest extends YmlLoaderTest {

	public CreateJmsResponseYmlLoaderTest() {
		super(new CreateJmsResponseYmlLoader());
	}

	@Test
	public void testThis() throws Exception {
		assertExpectation("classpath:/CreateJmsResponse.yml", "com.emarte.regurgitator.extensions.mq.CreateJmsResponse:[com.emarte.regurgitator.core.CreateResponse:['create-jsm-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],null],'message-id','type','destination','correlation','4','expiration','priority','true','reply-to','123456789']");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		loadFile("classpath:/CreateJmsResponse_fullLoad.yml");
	}
}
