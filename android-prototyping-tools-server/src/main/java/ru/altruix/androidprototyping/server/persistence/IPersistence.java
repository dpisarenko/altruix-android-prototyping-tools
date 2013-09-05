/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.persistence;


/**
 *
 * @author Dmitri Pisarenko
 *
 */
public interface IPersistence {
	public <T> T runAction(final IPersistenceAction<T> aAction) throws InterruptedException;
}
