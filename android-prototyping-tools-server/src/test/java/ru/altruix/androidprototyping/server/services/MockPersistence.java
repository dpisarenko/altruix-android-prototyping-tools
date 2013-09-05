/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import ru.altruix.androidprototyping.server.persistence.IPersistence;
import ru.altruix.androidprototyping.server.persistence.IPersistenceAction;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public class MockPersistence implements IPersistence {

	@Override
	public <T> T runAction(IPersistenceAction<T> aAction)
			throws InterruptedException {
		return null;
	}

}
