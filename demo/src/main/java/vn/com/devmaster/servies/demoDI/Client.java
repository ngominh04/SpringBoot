package vn.com.devmaster.servies.demoDI;


public class Client {
    private ISqlDAO iSqlDAO;
    public Client() {}
    public Client(ISqlDAO iSqlDAO) {
        this.iSqlDAO = iSqlDAO;
    }

    public ISqlDAO getiSqlDAO() {
        return iSqlDAO;
    }

    public void setiSqlDAO(ISqlDAO iSqlDAO) {
        this.iSqlDAO = iSqlDAO;
    }
}
