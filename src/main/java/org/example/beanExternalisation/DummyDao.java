package org.example.beanExternalisation;

public class DummyDao {
    private String dbServer;

    DummyDao(String dbServer){
        this.dbServer = dbServer;
    }

    @Override
    public String toString() {
        return "DummyDao{" +
                "dbServer='" + dbServer + '\'' +
                '}';
    }
}
