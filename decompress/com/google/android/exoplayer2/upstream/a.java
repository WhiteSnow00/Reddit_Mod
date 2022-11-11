// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import yc.s;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import yc.f;

public interface a extends f
{
    long a(final b p0) throws IOException;
    
    void close() throws IOException;
    
    default Map<String, List<String>> d() {
        return Collections.emptyMap();
    }
    
    Uri getUri();
    
    void i(final s p0);
    
    public interface a
    {
        com.google.android.exoplayer2.upstream.a a();
    }
}
