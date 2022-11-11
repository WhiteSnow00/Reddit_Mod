// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n�\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\t\u0010\b�\u0006\u000e" }, d2 = { "Lcom/reddit/vault/model/CopySectionResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/vault/model/CopySectionResponse;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class CopySectionResponseJsonAdapter extends JsonAdapter<CopySectionResponse>
{
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CopySectionResponseJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "image", "title", "body" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "image");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "title");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        String s3;
        String s2 = s3 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            continue;
                        }
                        s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    }
                    else {
                        s = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s != null) {
                            continue;
                        }
                        throw a.n("title", "title", jsonReader);
                    }
                }
                else {
                    s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (s != null) {
            return new CopySectionResponse(s2, s, s3);
        }
        throw a.h("title", "title", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final CopySectionResponse copySectionResponse = (CopySectionResponse)o;
        e.f((Object)x, "writer");
        if (copySectionResponse != null) {
            x.h();
            x.u("image");
            this.nullableStringAdapter.toJson(x, (Object)copySectionResponse.a);
            x.u("title");
            this.stringAdapter.toJson(x, (Object)copySectionResponse.b);
            x.u("body");
            this.nullableStringAdapter.toJson(x, (Object)copySectionResponse.c);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(CopySectionResponse)";
    }
}
