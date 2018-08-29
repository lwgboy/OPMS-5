package response;

public class Response
{
  private Meta meta;
  private Object data;

  public Response success()
  {
    this.meta = new Meta(0, (String)SystemStatusCode.codeMap.get(Integer.valueOf(0)));
    return this;
  }

  public Response success(Object data) {
    this.meta = new Meta(0, (String)SystemStatusCode.codeMap.get(Integer.valueOf(0)));
    this.data = data;
    return this;
  }

  public Response failure(int code) {
    this.meta = new Meta(code, (String)SystemStatusCode.codeMap.get(Integer.valueOf(code)));
    return this;
  }

  public Response failure(int code, String message) {
    this.meta = new Meta(code, message);
    return this;
  }

  public Meta getMeta() {
    return this.meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public Object getData() {
    return this.data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
