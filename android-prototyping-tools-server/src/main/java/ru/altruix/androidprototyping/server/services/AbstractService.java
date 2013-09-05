/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.altruix.androidprototyping.server.persistence.IPersistence;


/**
 *
 * @author Dmitri Pisarenko
 *
 */
public abstract class AbstractService<PersistenceClass extends IPersistence,
	RequestClass, ResponseClass> {
	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractService.class);

	private PersistenceClass persistence;

	public PersistenceClass getPersistence() {
		return persistence;
	}

	public void setPersistence(final PersistenceClass aPersistence) {
		this.persistence = aPersistence;
	}
	
	public String processRequest(final String aRequestAsText)
	{
		try {
			final ObjectMapper mapper = new ObjectMapper();
			
			final RequestClass request = mapper.readValue(aRequestAsText, 
					RequestClass);

			
			final ResponseClass response = null;
						
			return mapper.writeValueAsString(response);
		} catch (final JsonParseException exception) {
			LOGGER.error("getUserId", exception);
		} catch (final JsonMappingException exception) {
			LOGGER.error("getUserId", exception);
		} catch (final IOException exception) {
			LOGGER.error("getUserId", exception);
		} 
		catch (final InterruptedException exception) {
			LOGGER.error("getUserId", exception);		
		}

		return "";
		
		
		final String response = "";
		return response;
	}
}

