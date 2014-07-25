package ru.altruix.androidprototyping.server.persistence;

import java.sql.Connection;
import java.sql.Statement;

public interface IRelationalPersistenceState extends IPersistenceState {
	void setStatement(final Statement aStatement);

	Statement getStatement();

	void setConnection(final Connection aConnection);

	Connection getConnection();

}
