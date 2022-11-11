// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/GenericResponse;", "T", "", "json", "Lcom/reddit/domain/model/GenericResponse$Json;", "(Lcom/reddit/domain/model/GenericResponse$Json;)V", "firstError", "", "getFirstError", "()Ljava/lang/String;", "getJson", "()Lcom/reddit/domain/model/GenericResponse$Json;", "hasErrors", "", "Companion", "Json", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public class GenericResponse<T>
{
    public static final Companion Companion;
    public static final int ERROR_FIELD = 2;
    public static final int ERROR_MESSAGE = 1;
    public static final int ERROR_NAME = 0;
    private final Json<T> json;
    
    static {
        Companion = new Companion(null);
    }
    
    public GenericResponse(final Json<T> json) {
        f.f((Object)json, "json");
        this.json = json;
    }
    
    public final String getFirstError() {
        String s;
        if (this.hasErrors()) {
            s = ((List)CollectionsKt___CollectionsKt.p1((List)this.json.getErrors())).get(1);
        }
        else {
            s = "No Error";
        }
        return s;
    }
    
    public final Json<T> getJson() {
        return this.json;
    }
    
    public final boolean hasErrors() {
        return this.json.getErrors().isEmpty() ^ true;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/GenericResponse$Companion;", "", "()V", "ERROR_FIELD", "", "ERROR_MESSAGE", "ERROR_NAME", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/model/GenericResponse$Json;", "D", "", "data", "errors", "", "", "(Ljava/lang/Object;Ljava/util/List;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrors", "()Ljava/util/List;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Json<D>
    {
        private final D data;
        private final List<List<String>> errors;
        
        public Json(final D data, final List<? extends List<String>> errors) {
            f.f((Object)errors, "errors");
            this.data = data;
            this.errors = (List<List<String>>)errors;
        }
        
        public final D getData() {
            return this.data;
        }
        
        public final List<List<String>> getErrors() {
            return this.errors;
        }
    }
}
