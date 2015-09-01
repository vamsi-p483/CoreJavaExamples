package com.Package1.testcase;



import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import com.Package1.logic.Bike;
import com.Package1.logic.Rider;

public class PowerMockTestCase {
	private static final int TESTING_INITIAL_GEAR = 2;

	@Test
	public void testShiftGear() {
		Bike mock = PowerMockito.mock(Bike.class);

		Rider rider = new Rider(mock);
		Mockito.when(mock.getGear()).thenReturn(TESTING_INITIAL_GEAR);

		// invoke testing method
		int actualGear = rider.prepareForUphill();
		System.out.println(actualGear);
		System.out.println(TESTING_INITIAL_GEAR + 2);
		Assert.assertEquals(actualGear, TESTING_INITIAL_GEAR + 2);
		Mockito.verify(mock, Mockito.times(2)).shiftGear(true);
	}

}
