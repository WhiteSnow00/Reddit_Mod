// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import java.io.Serializable;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1_ImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Image;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SendBirdDataV1_ImageJsonAdapter extends JsonAdapter<SendBirdDataV1$Image>
{
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public SendBirdDataV1_ImageJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "title", "url", "height", "width", "phase" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "height");
    }
    
    public SendBirdDataV1$Image fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Serializable s2;
        Serializable s = s2 = null;
        Serializable s4;
        String s3 = (String)(s4 = s2);
        Serializable s5;
        Integer n = (Integer)(s5 = s4);
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    s5 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    n = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    s4 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        return new SendBirdDataV1$Image((String)s, (String)s2, s3, (Integer)s4, n, (String)s5);
    }
    
    public void toJson(final x x, final SendBirdDataV1$Image sendBirdDataV1$Image) {
        f.f((Object)x, "writer");
        if (sendBirdDataV1$Image != null) {
            x.h();
            x.w("id");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Image.getId());
            x.w("title");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Image.getTitle());
            x.w("url");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Image.getUrl());
            x.w("height");
            this.nullableIntAdapter.toJson(x, (Object)sendBirdDataV1$Image.getHeight());
            x.w("width");
            this.nullableIntAdapter.toJson(x, (Object)sendBirdDataV1$Image.getWidth());
            x.w("phase");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Image.getPhase());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SendBirdDataV1.Image)";
    }
}
