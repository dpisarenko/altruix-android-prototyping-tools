/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public class GenericTypeBindigsFinder implements IGenericTypeBindigsFinder {

	@SuppressWarnings("rawtypes")
	@Override
	public Map<String, Type> getGenericTypes(final Class aClass) {
		/**
		 * The idea for implementing this method came from the guys at StackOverflow,
		 * especially rec.
		 * 
		 * http://stackoverflow.com/questions/18636150/how-to-get-the-class-object-of-a-java-generic
		 * 
		 * http://stackoverflow.com/users/2511197/rec
		 */
		final Map<String,Type> result = new HashMap<String,Type>();
		
		final Class clazz = getClass();
		
		clazz.getTypeParameters();
		
		final ParameterizedType gen = (ParameterizedType) clazz.getGenericSuperclass();
		final TypeVariable<?> typeVars[] = clazz.getTypeParameters();
		final Type [] types = gen.getActualTypeArguments();
	    for (int i = 0; i < typeVars.length; i++) {
	    	result.put(typeVars[i].getName(), types[i]);
	    }
		
		return result;
	}

}
