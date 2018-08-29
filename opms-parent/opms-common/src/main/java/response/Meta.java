package response;

public class Meta
{
  private int code;
  private String message;



  public Meta(int code, String message) {
	  this.message = message;
	    this.code = code;
}



public int getCode() {
    return this.code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}