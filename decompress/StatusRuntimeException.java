// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

public class StatusRuntimeException extends RuntimeException
{
    private static final long serialVersionUID = 1950934672280720624L;
    private final boolean fillInStackTrace;
    private final Status status;
    private final a trailers;
    
    public StatusRuntimeException(final Status status) {
        this(status, null);
    }
    
    public StatusRuntimeException(final Status status, final a a) {
        this(status, a, true);
    }
    
    public StatusRuntimeException(final Status status, final a trailers, final boolean fillInStackTrace) {
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
