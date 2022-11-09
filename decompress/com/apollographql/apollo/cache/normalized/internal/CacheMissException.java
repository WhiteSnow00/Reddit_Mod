// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.cache.normalized.internal;

import ah2.f;
import m7.j;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011" }, d2 = { "Lcom/apollographql/apollo/cache/normalized/internal/CacheMissException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "fieldName", "Ljava/lang/String;", "getFieldName", "()Ljava/lang/String;", "Lm7/j;", "record", "Lm7/j;", "getRecord", "()Lm7/j;", "getMessage", "message", "<init>", "(Lm7/j;Ljava/lang/String;)V", "apollo-normalized-cache" }, k = 1, mv = { 1, 5, 1 })
public final class CacheMissException extends IllegalStateException
{
    private final String fieldName;
    private final j record;
    
    public CacheMissException(final j record, final String fieldName) {
        f.g((Object)record, "record");
        f.g((Object)fieldName, "fieldName");
        this.record = record;
        this.fieldName = fieldName;
    }
    
    public final String getFieldName() {
        return this.fieldName;
    }
    
    @Override
    public String getMessage() {
        final StringBuilder k = a.k("Missing value: ");
        k.append(this.fieldName);
        k.append(" for ");
        k.append(this.record);
        return k.toString();
    }
    
    public final j getRecord() {
        return this.record;
    }
}
