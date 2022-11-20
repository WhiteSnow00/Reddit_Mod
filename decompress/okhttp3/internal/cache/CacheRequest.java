// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.cache;

import java.io.IOException;
import fk2.e0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006" }, d2 = { "Lokhttp3/internal/cache/CacheRequest;", "", "Lfk2/e0;", "body", "Lcg2/j;", "abort", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public interface CacheRequest
{
    void abort();
    
    e0 body() throws IOException;
}
