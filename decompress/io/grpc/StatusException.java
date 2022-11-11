// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

public class StatusException extends Exception
{
    private static final long serialVersionUID = -660954903976144640L;
    private final boolean fillInStackTrace;
    private final Status status;
    private final a trailers;
    
    public StatusException(final Status status) {
        this(status, null);
    }
    
    public StatusException(final Status status, final a a) {
        this(status, a, true);
    }
    
    public StatusException(final Status status, final a trailers, final boolean fillInStackTrace) {
        super(Status.a(status), status.c);
        this.status = status;
        this.trailers = trailers;
        this.fillInStackTrace = fillInStackTrace;
        this.fillInStackTrace();
    }
    
    @Override
    public Throwable fillInStackTrace() {
        synchronized (this) {
            if (this.fillInStackTrace) {
                super.fillInStackTrace();
            }
            return this;
        }
    }
    
    public final Status getStatus() {
        return this.status;
    }
    
    public final a getTrailers() {
        return this.trailers;
    }
}
