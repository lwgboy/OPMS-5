package log;

public class LogUtil
{
  public static String logFormat(Exception e)
  {
    if (e == null) {
      return "";
    }
    StackTraceElement[] exTrace = e.getStackTrace();

    String errCode = "";
    if ((e instanceof BaseException)) {
      errCode = "[" + ((BaseException)e).getErrCode() + "]";
    }

    StringBuffer buf = new StringBuffer();
    buf.append(e.getClass().getName()).append(":").append(errCode).append(e.getMessage()).append("\r\n");

    if (exTrace != null) {
      for (int i = 0; i < exTrace.length; i++) {
        buf.append(exTrace[i].toString()).append("\r\n");
      }
    }

    return buf.toString();
  }
}