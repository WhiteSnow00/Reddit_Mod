// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.z;
import jk2.g0;
import java.io.InputStream;
import jk2.u;
import java.io.ByteArrayInputStream;
import com.squareup.moshi.x;
import com.squareup.moshi.m;
import sg2.e;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonAdapter;
import kotlin.a;
import hg2.f;
import com.squareup.moshi.y;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R?\u0010\u0018\u001a&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00010\u0001 \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/RichTextResponseAdapter;", "", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/reddit/domain/model/RichTextResponse;", "fromJson", "Lcom/squareup/moshi/x;", "writer", "richTextResponse", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/y;", "moshi", "Lcom/squareup/moshi/y;", "getMoshi", "()Lcom/squareup/moshi/y;", "setMoshi", "(Lcom/squareup/moshi/y;)V", "Lcom/squareup/moshi/JsonAdapter;", "kotlin.jvm.PlatformType", "richTextAdapter$delegate", "Lhg2/f;", "getRichTextAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "richTextAdapter", "<init>", "()V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RichTextResponseAdapter
{
    public static final RichTextResponseAdapter INSTANCE;
    public static y moshi;
    private static final f richTextAdapter$delegate;
    
    static {
        INSTANCE = new RichTextResponseAdapter();
        richTextAdapter$delegate = a.b((rg2.a)RichTextResponseAdapter$richTextAdapter$2.INSTANCE);
    }
    
    private RichTextResponseAdapter() {
    }
    
    private final JsonAdapter<Object> getRichTextAdapter() {
        return (JsonAdapter<Object>)RichTextResponseAdapter.richTextAdapter$delegate.getValue();
    }
    
    @m
    public final RichTextResponse fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        final String json = this.getRichTextAdapter().toJson(this.getRichTextAdapter().fromJson(jsonReader));
        e.e((Object)json, "toJson");
        return new RichTextResponse(json);
    }
    
    public final y getMoshi() {
        final y moshi = RichTextResponseAdapter.moshi;
        if (moshi != null) {
            return moshi;
        }
        e.n("moshi");
        throw null;
    }
    
    public final void setMoshi(final y moshi) {
        e.f((Object)moshi, "<set-?>");
        RichTextResponseAdapter.moshi = moshi;
    }
    
    @z
    public final void toJson(final x x, final RichTextResponse richTextResponse) {
        e.f((Object)x, "writer");
        final int n = 1;
        int n2 = 0;
        Label_0054: {
            if (richTextResponse != null) {
                final String richTextString = richTextResponse.getRichTextString();
                if (richTextString != null && richTextString.length() != 0) {
                    n2 = n;
                    break Label_0054;
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            final byte[] bytes = richTextResponse.getRichTextString().getBytes(cj2.a.b);
            e.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
            x.J((jk2.f)u.b((g0)u.g((InputStream)new ByteArrayInputStream(bytes))));
        }
        else {
            x.v();
        }
    }
}
