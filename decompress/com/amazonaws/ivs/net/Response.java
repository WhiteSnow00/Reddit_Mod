// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

class Response
{
    private StreamConsumer consumer;
    private ExecutorService executorService;
    private final Map<String, String> headers;
    private final int status;
    
    public Response(final int status) {
        this.headers = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        this.status = status;
    }
    
    public static /* synthetic */ StreamConsumer access$000(final Response response) {
        return response.consumer;
    }
    
    public String getHeader(final String s) {
        return this.headers.get(s);
    }
    
    public int getStatus() {
        return this.status;
    }
    
    public void readContent(final ReadCallback readCallback) {
        final ExecutorService executorService = this.executorService;
        if (executorService != null) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    Response.access$000(Response.this).consume(readCallback);
                }
            });
        }
        else {
            this.consumer.consume(readCallback);
        }
    }
    
    public void setConsumer(final ExecutorService executorService, final StreamConsumer consumer) {
        this.executorService = executorService;
        this.consumer = consumer;
    }
    
    public void setHeader(final String s, final String s2) {
        if (s != null) {
            this.headers.put(s, s2);
        }
    }
}
