// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.nio.ByteBuffer;

class Request
{
    private Cancellable cancellable;
    private boolean cancelled;
    private ByteBuffer content;
    private Future<?> future;
    private final Map<String, String> headers;
    private Method method;
    private WriteCallback streamCallback;
    private int timeoutSeconds;
    private final String url;
    
    public Request(final String url, final Method method) {
        this.headers = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        this.timeoutSeconds = 10;
        this.url = url;
        this.method = method;
    }
    
    public Request(final String url, final String s) {
        this.headers = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        this.timeoutSeconds = 10;
        this.url = url;
        try {
            this.method = Method.valueOf(s.toUpperCase());
        }
        catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
            this.method = Method.GET;
        }
    }
    
    public void cancel() {
        synchronized (this.lock()) {
            this.cancelled = true;
            final Future<?> future = this.future;
            if (future != null) {
                future.cancel(true);
            }
            final Cancellable cancellable = this.cancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
        }
    }
    
    public ByteBuffer getContent() {
        return this.content;
    }
    
    public WriteCallback getContentCallback() {
        return this.streamCallback;
    }
    
    public Map<String, String> getHeaders() {
        return this.headers;
    }
    
    public Method getMethod() {
        return this.method;
    }
    
    public int getTimeout() {
        return this.timeoutSeconds;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public boolean isCancelled() {
        synchronized (this.lock()) {
            return this.cancelled;
        }
    }
    
    public Object lock() {
        return this;
    }
    
    public void setCancellable(final Cancellable cancellable) {
        synchronized (this.lock()) {
            this.cancellable = cancellable;
        }
    }
    
    public void setContent(final ByteBuffer byteBuffer) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.put(byteBuffer);
        allocateDirect.rewind();
        this.content = allocateDirect;
    }
    
    public void setContentCallback(final WriteCallback streamCallback) {
        this.streamCallback = streamCallback;
    }
    
    public void setFuture(final Future<?> future) {
        synchronized (this.lock()) {
            this.future = future;
        }
    }
    
    public void setHeader(final String s, final String s2) {
        this.getHeaders().put(s, s2);
    }
    
    public void setTimeout(final int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }
    
    public interface Cancellable
    {
        void cancel();
    }
}
