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
public class PersistenceState implements IPersistenceState {
	private Connection connection;
	private Statement statement;
	
	@Override
	public Connection getConnection() {
		return connection;
	}
	@Override
	public void setConnection(final Connection aConnection) {
		this.connection = aConnection;
	}
	@Override
	public Statement getStatement() {
		return statement;
	}
	@Override
	public void setStatement(final Statement aStatement) {
		this.statement = aStatement;
	}
}
