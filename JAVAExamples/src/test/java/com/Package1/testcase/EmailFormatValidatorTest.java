package com.Package1.testcase;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.Package1.logic.EmailFormatValidator;
import com.Package1.logic.HashMapExample;

@RunWith(Parameterized.class)
public class EmailFormatValidatorTest {
	final static Logger logger = Logger.getLogger(HashMapExample.class);

	private String arg;
	private static EmailFormatValidator emailFormatValidator;
	private Boolean expectedValidation;

	public EmailFormatValidatorTest(String str, Boolean expectedValidation) {
		this.arg = str;
		this.expectedValidation = expectedValidation;
	}

	@BeforeClass
	public static void initialize() {
		emailFormatValidator = new EmailFormatValidator();
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
				{ "javacodegeeks@gmail.com.2j",false },    // it's not allowed to have a digit in the second level tld
				{ "java@java@oracle.com", false },         // you cannot have @ twice in the address
				{ "java!!!@example.com", false },          // you cannot the have special character '!' in the address
				{ "mysite@.com", false },                  // tld cannot start with a dot
				{ "javacodegees.com", false },             // must contain a @ character and a tld
				{ ".javacodegees.com@at.com", false },     // the address cannot start with a dot
				{ "javacodegees..javacom@at.com", false }, // you cannot have double dots in your address


				{ "javacodegeeks@gmail.com",true },                         
				{ "nikos+mylist@gmail.com", true },
				{ "abc.efg-900@gmail-list.com", true },
				{ "abc123@example.com.gr", true } };

		return Arrays.asList(data);
	}

	@Test
	public void test() {
		Boolean res = emailFormatValidator.validate(this.arg);
		String validv = (res) ? "valid" : "invalid";
		logger.info("Hex Color Code "+arg+ " is " + validv);
		assertEquals("Result", this.expectedValidation, res);

	}

}