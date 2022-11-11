// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/discoveryunits/data/Surface;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class Surface
{
    public final String a;
    public final boolean b;
    public final OrderType c;
    public final int d;
    public final int e;
    
    public Surface(final String a, final boolean b, final OrderType c, final int d, final int e) {
        f.f((Object)a, "name");
        f.f((Object)c, "order");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
