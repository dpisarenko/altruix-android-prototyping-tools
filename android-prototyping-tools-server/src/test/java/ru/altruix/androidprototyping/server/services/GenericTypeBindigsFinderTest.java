/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public class GenericTypeBindigsFinderTest {
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testGetGenericTypes()
	{
		final GenericTypeBindigsFinder objectUnderTest = new GenericTypeBindigsFinder();
		
		final AbstractServiceForTesting service = new AbstractServiceForTesting();
		
		final List<Class> genericTypes = objectUnderTest.getGenericTypes(
				service.getClass());
		
		assertThat(genericTypes).isNotNull();
		assertThat(genericTypes.size()).isEqualTo(3);
		checkBoundClass(genericTypes, 0, MockPersistence.class);
		checkBoundClass(genericTypes, 1, MockRequest.class);
		checkBoundClass(genericTypes, 2, MockResponse.class);
	}

	@SuppressWarnings("rawtypes")
	private void checkBoundClass(final List<Class> genericTypes, int aIndex, 
			final Class aExpectedClass) {
		assertThat(genericTypes.get(aIndex)).isNotNull();
		assertThat(genericTypes.get(aIndex)).isEqualTo(aExpectedClass);
	}
}
