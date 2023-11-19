public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    System.out.println("client cert auth handler invoked ...");

    if(requestType == "client cert"){
      System.out.println("****** =====> client cert request processed ******");
    } else {
      System.out.println("client cert auth request handler is passing this request to next handler thru super");
      super.handleRequest(requestType);
    }

    System.out.println("exiting client cert auth req handler .. code most likely won't reach here?");
  }

}
