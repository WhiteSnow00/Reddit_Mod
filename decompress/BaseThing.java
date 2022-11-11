// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import com.squareup.moshi.n;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b&\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001c" }, d2 = { "Lcom/reddit/data/model/v1/BaseThing;", "Lcom/reddit/data/model/v1/Thing;", "Ljava/io/Serializable;", "id", "", "name", "createdUtcDouble", "", "(Ljava/lang/String;Ljava/lang/String;D)V", "value", "", "createdUtc", "getCreatedUtc", "()J", "setCreatedUtc", "(J)V", "getCreatedUtcDouble$annotations", "()V", "getCreatedUtcDouble", "()D", "setCreatedUtcDouble", "(D)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class BaseThing implements Thing, Serializable
{
    private double createdUtcDouble;
    private String id;
    private String name;
    
    public BaseThing() {
        this(null, null, 0.0, 7, null);
    }
    
    public BaseThing(final String id, final String name, final double createdUtcDouble) {
        f.f((Object)id, "id");
        f.f((Object)name, "name");
        this.id = id;
        this.name = name;
        this.createdUtcDouble = createdUtcDouble;
    }
    
    @Override
    public long getCreatedUtc() {
        return (long)this.createdUtcDouble;
    }
    
    public final double getCreatedUtcDouble() {
        return this.createdUtcDouble;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public void setCreatedUtc(final long n) {
        this.createdUtcDouble = (double)n;
    }
    
    public final void setCreatedUtcDouble(final double createdUtcDouble) {
        this.createdUtcDouble = createdUtcDouble;
    }
    
    public void setId(final String id) {
        f.f((Object)id, "<set-?>");
        this.id = id;
    }
    
    public void setName(final String name) {
        f.f((Object)name, "<set-?>");
        this.name = name;
    }
}
