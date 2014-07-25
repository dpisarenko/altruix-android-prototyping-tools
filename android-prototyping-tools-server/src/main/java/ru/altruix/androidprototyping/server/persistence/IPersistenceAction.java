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
public interface IPersistenceAction<T> {
	T run(final IPersistenceState aPersistenceState);
}
