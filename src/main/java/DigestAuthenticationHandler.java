public class DigestAuthenticationHandler extends AuthenticationHandler {

  DigestAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    System.out.println("digest auth handler invoked ...");

    if(requestType == "digest auth"){
      System.out.println("****** =====> digest auth request processed ******");
    } else {
      System.out.println("digest auth request handler is passing this request to next handler thru super");
      super.handleRequest(requestType);
    }

    System.out.println("exiting digest auth req handler .. code most likely won't reach here?");
  }

}
