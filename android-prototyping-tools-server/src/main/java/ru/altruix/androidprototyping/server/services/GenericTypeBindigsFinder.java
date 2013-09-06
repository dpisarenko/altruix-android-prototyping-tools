/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		final Map<String,Type> result = new HashMap<String,Type>();
				
		final ParameterizedType gen = (ParameterizedType) aClass.getGenericSuperclass();
		
		System.out.println("gen: " + gen.getClass().getName());
		
		final TypeVariable<?> typeVars[] = aClass.getTypeParameters();
		final Type [] types = gen.getActualTypeArguments();
		
		System.out.println("typeVars 2: " + gen.getClass().getTypeParameters().length);
		
		System.out.println("types: " + types.length);
		
		for (int i = 0; i < types.length; i++) {
			if (types[i] instanceof Class)
			{
				Class clazz = (Class)types[i];
				
				System.out.println("Name: " + clazz.getCanonicalName());
			}
			
			
		}
		
		
	    for (int i = 0; i < typeVars.length; i++) {
	    	System.out.println("Name: " + typeVars[i].getName());
	    	
	    	result.put(typeVars[i].getName(), types[i]);
	    }
		
		return result;
	}

}
