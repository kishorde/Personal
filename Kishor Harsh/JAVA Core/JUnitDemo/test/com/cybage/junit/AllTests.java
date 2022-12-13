package com.cybage.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DemoTest.class, MathOperationsTest.class })
public class AllTests {

}
