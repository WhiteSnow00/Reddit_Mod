// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ak0.m;
import ah2.f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u00c6\u0003J/\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/streaming/RemovalReasons;", "", "data", "", "", "Lcom/reddit/domain/model/streaming/RemovalReason;", "order", "", "(Ljava/util/Map;Ljava/util/List;)V", "getData", "()Ljava/util/Map;", "getOrder", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RemovalReasons
{
    private final Map<String, RemovalReason> data;
    private final List<String> order;
    
    public RemovalReasons(final Map<String, RemovalReason> data, final List<String> order) {
        f.f((Object)data, "data");
        f.f((Object)order, "order");
        this.data = data;
        this.order = order;
    }
    
    public final Map<String, RemovalReason> component1() {
        return this.data;
    }
    
    public final List<String> component2() {
        return this.order;
    }
    
    public final RemovalReasons copy(final Map<String, RemovalReason> map, final List<String> list) {
        f.f((Object)map, "data");
        f.f((Object)list, "order");
        return new RemovalReasons(map, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemovalReasons)) {
            return false;
        }
        final RemovalReasons removalReasons = (RemovalReasons)o;
        return f.a((Object)this.data, (Object)removalReasons.data) && f.a((Object)this.order, (Object)removalReasons.order);
    }
    
    public final Map<String, RemovalReason> getData() {
        return this.data;
    }
    
    public final List<String> getOrder() {
        return this.order;
    }
    
    @Override
    public int hashCode() {
        return this.order.hashCode() + this.data.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RemovalReasons(data=");
        k.append(this.data);
        k.append(", order=");
        return m.n(k, (List)this.order, ')');
    }
}
