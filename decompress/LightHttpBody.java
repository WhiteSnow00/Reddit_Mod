// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server.http;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public abstract class LightHttpBody
{
    public static LightHttpBody create(final String s, final String s2) {
        try {
            return create(s.getBytes("UTF-8"), s2);
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static LightHttpBody create(final byte[] array, final String s) {
        return (LightHttpBody)new LightHttpBody$1(s, array);
    }
    
    public abstract int contentLength();
    
    public abstract String contentType();
    
    public abstract void writeTo(final OutputStream p0) throws IOException;
}
