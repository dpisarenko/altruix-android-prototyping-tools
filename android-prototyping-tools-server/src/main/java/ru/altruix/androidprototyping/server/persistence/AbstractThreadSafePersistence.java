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
public abstract class AbstractThreadSafePersistence<PersistenceState extends IPersistenceState>
		implements IPersistence {
	private boolean busy = false;

	public <T> T runAction(final IPersistenceAction<T> aAction)
			throws InterruptedException {
		T returnValue = null;

		waitUntilIdle();
		synchronized (this) {
			busy = true;

			returnValue = aAction.run(getPersistenceState());

			busy = false;

			notifyAll();
		}

		return returnValue;
	}

	private void waitUntilIdle() throws InterruptedException {
		while (busy) {
			wait();
		}
	}

	protected abstract PersistenceState getPersistenceState();
}
