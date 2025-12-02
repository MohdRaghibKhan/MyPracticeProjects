package design_patterns.Behavioral;

interface Connection{
	
	void createConnection();
}

interface Statement{
	void createStatment();
}

class MysqlConnection implements Connection{

	
	@Override
	public void createConnection() {
		System.out.println("Creating Statement for Mysql...");
	}
	
}

class MysqlStatement implements Statement{

	@Override
	public void createStatment() {
		System.out.println("Creating Connection with Mysql..");
	}

	
}
class MongoDBConnection implements Connection{

	@Override
	public void createConnection() {
		System.out.println("Creating Statement for MongoDBConnection...");
	}
	
}

class MongoDBStatement implements Statement{

	@Override
	public void createStatment() {
		System.out.println("Creating Connection with MongoDBConnection...");
	}
}

interface DBFactory{
	
	Connection getConnection();
	Statement getStatement();
}

class MySqlFactory implements DBFactory{

	@Override
	public Connection getConnection() {
		return new MysqlConnection();
	}

	@Override
	public Statement getStatement() {
		return new MysqlStatement();
	}
	
}

class MongoDBFactory implements DBFactory{

	@Override
	public Connection getConnection() {
		return new MongoDBConnection();
	}

	@Override
	public Statement getStatement() {
		return new MongoDBStatement();
	}
	
}


public class AbstractDesignPattern_DBFactory {
	
	public static void main(String[] args) {
		DBFactory mysqlFactory=new MySqlFactory();
		Connection connection = mysqlFactory.getConnection();
		connection.createConnection();
		Statement statement = mysqlFactory.getStatement();
		statement.createStatment();
		
		DBFactory mongoFactory=new MongoDBFactory();
		Connection connection2 = mongoFactory.getConnection();
		connection2.createConnection();
		Statement statement2 = mongoFactory.getStatement();
		statement2.createStatment();
		
	}
}
