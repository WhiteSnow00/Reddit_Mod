// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import java.util.Collections;
import com.google.android.exoplayer2.upstream.b;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicLong;

public final class h
{
    public static final AtomicLong d;
    public final Uri a;
    public final Map<String, List<String>> b;
    public final long c;
    
    static {
        d = new AtomicLong();
    }
    
    public h(final long n, final b b, final long n2) {
        this(b.a, Collections.emptyMap(), 0L);
    }
    
    public h(final Uri a, final Map b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
