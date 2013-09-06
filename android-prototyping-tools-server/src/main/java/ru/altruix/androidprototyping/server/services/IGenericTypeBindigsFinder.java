/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import java.util.List;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public interface IGenericTypeBindigsFinder {
	@SuppressWarnings("rawtypes")
	List<Class> getGenericTypes(final Class aClass);
}
