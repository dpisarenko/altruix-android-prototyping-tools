/**
 * Copyright (C) Dmitri Pisarenko
 * http://altruix.wordpress.com/
 */
package ru.altruix.androidprototyping.server.persistence;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Dmitri Pisarenko
 *
 */
public interface IPersistenceState {

	void setStatement(final Statement aStatement);

	Statement getStatement();

	void setConnection(final Connection aConnection);

	Connection getConnection();

}
