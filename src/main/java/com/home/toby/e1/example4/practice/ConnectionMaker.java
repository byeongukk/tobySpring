package com.home.toby.e1.example4.practice;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	public Connection makeConnection() throws ClassNotFoundException,SQLException;
}
