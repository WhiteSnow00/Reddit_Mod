// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.okhttp3;

import java.io.IOException;
import al0.b;

public enum Protocol
{
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"), 
    HTTP_1_0("http/1.0"), 
    HTTP_1_1("http/1.1"), 
    HTTP_2("h2"), 
    QUIC("quic"), 
    SPDY_3("spdy/3.1");
    
    private final String protocol;
    
    private Protocol(final String protocol) {
        this.protocol = protocol;
    }
    
    public static Protocol get(final String s) throws IOException {
        final Protocol http_1_0 = Protocol.HTTP_1_0;
        if (s.equals(http_1_0.protocol)) {
            return http_1_0;
        }
        final Protocol http_1_2 = Protocol.HTTP_1_1;
        if (s.equals(http_1_2.protocol)) {
            return http_1_2;
        }
        final Protocol h2_PRIOR_KNOWLEDGE = Protocol.H2_PRIOR_KNOWLEDGE;
        if (s.equals(h2_PRIOR_KNOWLEDGE.protocol)) {
            return h2_PRIOR_KNOWLEDGE;
        }
        final Protocol http_2 = Protocol.HTTP_2;
        if (s.equals(http_2.protocol)) {
            return http_2;
        }
        final Protocol spdy_3 = Protocol.SPDY_3;
        if (s.equals(spdy_3.protocol)) {
            return spdy_3;
        }
        final Protocol quic = Protocol.QUIC;
        if (s.equals(quic.protocol)) {
            return quic;
        }
        throw new IOException(b.h("Unexpected protocol: ", s));
    }
    
    @Override
    public String toString() {
        return this.protocol;
    }
}
