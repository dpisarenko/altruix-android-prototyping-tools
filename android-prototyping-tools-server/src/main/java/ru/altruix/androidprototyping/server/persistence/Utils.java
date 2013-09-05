/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.persistence;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public class Utils {
	private Utils()
	{
	}
	
	public static String replacePlaceholders(final String aTemplate, final String[] aReplacements)
	{
		final String[] searchList = new String[aReplacements.length];
		
		for (int i=0; i < searchList.length; i++)
		{
			searchList[i] = "{" + Integer.toString(i) + "}"; 
		}
		
		return StringUtils.replaceEach(aTemplate, searchList, aReplacements);
	}
}
