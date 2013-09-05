/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public class AbstractServiceForTesting 
	extends AbstractService<MockPersistence, MockRequest, MockResponse>{

	@Override
	protected void fillResponseWithData(final MockRequest aRequest,
			final MockResponse aResponse) {
	}
}
