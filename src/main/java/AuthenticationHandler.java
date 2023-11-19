public abstract class AuthenticationHandler {

  AuthenticationHandler next;

  AuthenticationHandler(AuthenticationHandler next){
    this.next = next;
  }

  public void handleRequest(String requestType) {

    if(next != null){
      next.handleRequest(requestType);
    }
  }

}
