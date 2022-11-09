// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.collections.CollectionsKt___CollectionsKt;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/model/ErrorResponse;", "", "errors", "", "", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "firstError", "getFirstError", "()Ljava/lang/String;", "hasErrors", "", "isTextFirstError", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ErrorResponse
{
    public static final Companion Companion;
    private static final int ERROR_MESSAGE_INDEX = 1;
    private static final int ERROR_MESSAGE_TYPE_INDEX = 2;
    private static final String ERROR_MESSAGE_TYPE_TEXT = "text";
    private final List<List<String>> errors;
    
    static {
        Companion = new Companion(null);
    }
    
    public ErrorResponse(@n(name = "errors") final List<? extends List<String>> errors) {
        f.f((Object)errors, "errors");
        this.errors = (List<List<String>>)errors;
    }
    
    public final List<List<String>> getErrors() {
        return this.errors;
    }
    
    public final String getFirstError() {
        final List list = (List)CollectionsKt___CollectionsKt.s1((List)this.errors);
        String s = null;
        if (list != null) {
            s = s;
            if (list.size() > 1) {
                s = list.get(1);
            }
        }
        return s;
    }
    
    public final boolean hasErrors() {
        return this.errors.isEmpty() ^ true;
    }
    
    public final boolean isTextFirstError() {
        final List list = (List)CollectionsKt___CollectionsKt.s1((List)this.errors);
        String s;
        if (list != null) {
            s = list.get(2);
        }
        else {
            s = null;
        }
        return f.a((Object)"text", (Object)s);
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lcom/reddit/domain/model/ErrorResponse$Companion;", "", "()V", "ERROR_MESSAGE_INDEX", "", "ERROR_MESSAGE_TYPE_INDEX", "ERROR_MESSAGE_TYPE_TEXT", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
