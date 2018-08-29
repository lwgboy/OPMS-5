package log;

public abstract class BaseException extends RuntimeException
{
  private static final long serialVersionUID = -6974597103940757367L;

  public BaseException()
  {
  }

  public BaseException(String msg)
  {
    super(msg);
  }

  public BaseException(Throwable cause) {
    super(cause);
  }

  public BaseException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public abstract String getErrCode();
}