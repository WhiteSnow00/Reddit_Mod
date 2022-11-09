// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001¨\u0006\u0007" }, d2 = { "Lcom/reddit/data/snoovatar/entity/CSRFJson;", "", "", "token", "copy", "<init>", "(Ljava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class CSRFJson
{
    public final String a;
    
    public CSRFJson(@n(name = "csrf_token") final String a) {
        f.f((Object)a, "token");
        this.a = a;
    }
    
    public final CSRFJson copy(@n(name = "csrf_token") final String s) {
        f.f((Object)s, "token");
        return new CSRFJson(s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof CSRFJson && f.a((Object)this.a, (Object)((CSRFJson)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return b.k(a.k("CSRFJson(token="), this.a, ')');
    }
}
