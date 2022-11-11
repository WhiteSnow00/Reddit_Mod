// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B9\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014" }, d2 = { "Lcom/reddit/data/model/ChildrenEnvelope;", "T", "", "children", "", "Lcom/reddit/data/model/Envelope;", "after", "", "before", "adDistance", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAdDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAfter", "()Ljava/lang/String;", "getBefore", "getChildren", "()Ljava/util/List;", "remote_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChildrenEnvelope<T>
{
    private final Integer adDistance;
    private final String after;
    private final String before;
    private final List<Envelope<T>> children;
    
    public ChildrenEnvelope(final List<? extends Envelope<? extends T>> children, final String after, final String before, @n(name = "dist") final Integer adDistance) {
        f.f((Object)children, "children");
        this.children = (List<Envelope<T>>)children;
        this.after = after;
        this.before = before;
        this.adDistance = adDistance;
    }
    
    public final Integer getAdDistance() {
        return this.adDistance;
    }
    
    public final String getAfter() {
        return this.after;
    }
    
    public final String getBefore() {
        return this.before;
    }
    
    public final List<Envelope<T>> getChildren() {
        return this.children;
    }
}
