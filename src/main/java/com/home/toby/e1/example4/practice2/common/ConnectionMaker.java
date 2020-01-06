package com.home.toby.e1.example4.practice2.common;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	public Connection makeConnection() throws ClassNotFoundException,SQLException;
	
}
