package org.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOHelloWorld {
	private static DAOHelloWorld INSTANCE;
	private final static String LOGIN = "root";
	private final static String PASSWORD = "";
	private final static String URL = "jdbc:mysql://localhost/wsjava?autoReconnect=true&useSSL=false";
	private Connection connection;
	private Statement statement;
	
	private DAOHelloWorld(){
		this.connection = null;
		this.statement = null;
	}
	
	public static DAOHelloWorld getInstance(){
		if(INSTANCE == null){
			INSTANCE = new DAOHelloWorld();
		}
		return DAOHelloWorld.INSTANCE;
		
	}
	
	public static String getQueryFirstHelloWorld(){
		return "Hello World";
		
	}
	
	private void close(){
		
	}
	
	private ResultSet executeQuery(String Query){
		return null;
		
	}
	
	private boolean open(){
		return true;
		
	}
}

