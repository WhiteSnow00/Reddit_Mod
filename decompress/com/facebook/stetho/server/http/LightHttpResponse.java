// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server.http;

public class LightHttpResponse extends LightHttpMessage
{
    public LightHttpBody body;
    public int code;
    public String reasonPhrase;
    
    public void prepare() {
        final LightHttpBody body = this.body;
        if (body != null) {
            this.addHeader("Content-Type", body.contentType());
            this.addHeader("Content-Length", String.valueOf(this.body.contentLength()));
        }
    }
    
    public void reset() {
        super.reset();
        this.code = -1;
        this.reasonPhrase = null;
        this.body = null;
    }
}
