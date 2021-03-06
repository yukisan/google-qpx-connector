/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.googleqpx.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.googleqpx.GoogleQPXConnector;
import org.mule.modules.googleqpx.automation.functional.TripsIT;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({ TripsIT.class })

public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite() {
		ConnectorTestContext.initialize(GoogleQPXConnector.class);
	}

	@AfterClass
	public static void shutdownSuite() {
		ConnectorTestContext.shutDown();
	}

}