/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import java.lang.reflect.Type;
import java.util.Map;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public interface IGenericTypeBindigsFinder {
	@SuppressWarnings("rawtypes")
	Map<String,Type> getGenericTypes(final Class aClass);
}
