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
		assertThat(genericTypes.get(0)).isNotNull();
		assertThat(genericTypes.get(0)).isEqualTo(MockPersistence.class);
	}
}
