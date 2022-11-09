// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/data/model/Envelope;", "T", "", "data", "kind", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getKind", "()Ljava/lang/String;", "remote-common_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Envelope<T>
{
    private final T data;
    private final String kind;
    
    public Envelope(final T data, final String kind) {
        this.data = data;
        this.kind = kind;
    }
    
    public final T getData() {
        return this.data;
    }
    
    public final String getKind() {
        return this.kind;
    }
}
