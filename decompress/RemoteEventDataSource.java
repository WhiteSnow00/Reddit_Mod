// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.datasource.remote;

import ru2.o;
import okhttp3.ResponseBody;
import nu2.w;
import ff2.c0;
import ru2.a;
import okhttp3.RequestBody;
import ru2.i;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J<\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J<\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\r" }, d2 = { "Lcom/reddit/data/events/datasource/remote/RemoteEventDataSource;", "", "", "userAgent", "date", "signature", "Lokhttp3/RequestBody;", "body", "Lff2/c0;", "Lnu2/w;", "Lokhttp3/ResponseBody;", "postTestEventBatch", "postEventBatch", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteEventDataSource
{
    @o("https://e.reddit.com/v2c")
    c0<w<ResponseBody>> postEventBatch(@i("User-Agent") final String p0, @i("Date") final String p1, @i("X-Signature") final String p2, @a final RequestBody p3);
    
    @o("v2c")
    c0<w<ResponseBody>> postTestEventBatch(@i("User-Agent") final String p0, @i("Date") final String p1, @i("X-Signature") final String p2, @a final RequestBody p3);
}
