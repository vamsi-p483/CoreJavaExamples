package com.Package1.testcase;

import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.Package1.logic.FaultInjectionSituation;
import com.Package1.logic.StringEmpty;
import com.Package1.logic.Writer;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ Writer.class, FaultInjectionSituation.class })
public class FaultInjectionSituationTest {
	static Logger logger = LoggerFactory.getLogger(StringEmpty.class);

	@Test
	public void testActionFail() throws Exception {
		FaultInjectionSituation fis = new FaultInjectionSituation();
		PowerMockito.whenNew(Writer.class).withNoArguments()
				.thenThrow(new IOException("thrown from mock"));
		logger.info(fis.action());
		PowerMockito.verifyNew(Writer.class);
	}

}
