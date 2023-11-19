public class BasicAuthenticationHandler extends AuthenticationHandler {
  BasicAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {

    System.out.println("basic auth handler invoked ...");

    if(requestType == "basic"){
      System.out.println("****** =====> basic request processed !! ******");
    } else {
      System.out.println("basic auth handler is passing this request to next handler thru super");
      super.handleRequest(requestType);
    }

    System.out.println("exiting basic handler .. code most likely won't reach here?");

  }

}
