package Latihan.Formatting;

import com.sun.net.httpserver.Request;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FitNesseExpediter implements ResponseSender {
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Request request;
    private Respose response;
    private FitNesseContext context;
    protected long requestParsingTimeLimit;
    private long requestProgress;
    private long requestParsingDeadline;
    private boolean hasError;
}

/*
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Request request;
    private Respose response;
    private FitNesseContext context;
    protected long requestParsingTimeLimit;
    protected long responseParsingDeadLine;
    private boolean hasError;

     */

