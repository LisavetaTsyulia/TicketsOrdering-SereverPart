package serverPart;

import java.net.Socket;

/**
 * Created by lisa on 9.4.17.
 */
public class RequestHandler extends Thread{
    private Socket socket;
    private RequestFromCl request;
    private ResponseToCl response;

    public RequestHandler(Socket socket, RequestFromCl request) {
        this.socket = socket;
        this.request = request;
        response = new ResponseToCl();
    }
}
