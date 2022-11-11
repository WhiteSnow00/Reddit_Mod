// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.adapter;

import com.squareup.moshi.a0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.y;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter$e;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "Lcom/reddit/data/adapter/WrappedTypeJsonAdapterFactory;", "T", "Lcom/squareup/moshi/JsonAdapter$e;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/y;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "", "fieldName", "Ljava/lang/String;", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class WrappedTypeJsonAdapterFactory<T> implements JsonAdapter$e
{
    private final Class<?> clazz;
    private final String fieldName;
    
    public WrappedTypeJsonAdapterFactory(final String fieldName, final Class<?> clazz) {
        e.f((Object)fieldName, "fieldName");
        e.f((Object)clazz, "clazz");
        this.fieldName = fieldName;
        this.clazz = clazz;
    }
    
    public JsonAdapter<?> create(final Type type, final Set<? extends Annotation> set, final y y) {
        e.f((Object)type, "type");
        e.f((Object)set, "annotations");
        e.f((Object)y, "moshi");
        if (!e.a((Object)this.clazz, (Object)a0.c(type))) {
            return null;
        }
        return new WrappedTypeJsonAdapterWithNameData<Object>(y, (JsonAdapter$e)this, type, this.fieldName);
    }
    
    public final Class<?> getClazz() {
        return this.clazz;
    }
}
