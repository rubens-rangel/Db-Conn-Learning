package db;

public class DbException extends RuntimeException{
public static final long serialVersionUID = 1L;

public  DbException(String msg){
    super(msg);
}
}
