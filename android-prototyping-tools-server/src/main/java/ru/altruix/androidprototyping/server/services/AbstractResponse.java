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
public abstract class AbstractResponse {
	private boolean requestProcessedSuccessfully;

	public boolean isRequestProcessedSuccessfully() {
		return requestProcessedSuccessfully;
	}

	public void setRequestProcessedSuccessfully(final boolean aRequestProcessedSuccessfully) {
		this.requestProcessedSuccessfully = aRequestProcessedSuccessfully;
	}
}
