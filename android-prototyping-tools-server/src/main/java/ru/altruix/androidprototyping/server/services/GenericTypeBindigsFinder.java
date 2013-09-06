/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public class GenericTypeBindigsFinder implements IGenericTypeBindigsFinder {

	@SuppressWarnings("rawtypes")
	@Override
	public List<Class> getGenericTypes(final Class aClass) {
		/**
		 * The idea for implementing this method came from the guys at StackOverflow,
		 * especially rec.
		 * 
		 * http://stackoverflow.com/questions/18636150/how-to-get-the-class-object-of-a-java-generic
		 * 
		 * http://stackoverflow.com/users/2511197/rec
		 */
		final List<Class> result = new LinkedList<Class>();
				
		final ParameterizedType gen = (ParameterizedType) aClass.getGenericSuperclass();
		
		final Type [] types = gen.getActualTypeArguments();
				
		for (int i = 0; i < types.length; i++) {
			if (types[i] instanceof Class)
			{
				final Class clazz = (Class)types[i];
				result.add(clazz);
			}
		}
		
		return result;
	}

}
