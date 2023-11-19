public class Client {

  public static void main(String[] args) {

    AuthenticationHandler authenticationHandler = new BasicAuthenticationHandler( new ClientCertificateAuthenticationHandler( new DigestAuthenticationHandler( null )));

    //Happy path
    System.out.println("*** Happy Path ***");
    authenticationHandler.handleRequest("digest auth");
    System.out.println("*** End of happy path");

    //Try passing a requestType no handler can handle and observe output to learn better
    System.out.println();
    System.out.println("*** When none of the chained handlers can process the request ***");
    authenticationHandler.handleRequest("digest");
    System.out.println("*** End of unhappy path ***");

  }

}
