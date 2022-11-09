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

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014�\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004�\u0006\u0006\n\u0004\b\u0013\u0010\u0011�\u0006\u0018" }, d2 = { "Lcom/reddit/domain/chat/model/SendBirdDataV1_GifJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/SendBirdDataV1$Gif;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SendBirdDataV1_GifJsonAdapter extends JsonAdapter<SendBirdDataV1$Gif>
{
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public SendBirdDataV1_GifJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "title", "url", "height", "width" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "height");
    }
    
    public SendBirdDataV1$Gif fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Serializable s = null;
        Serializable s3;
        String s2 = (String)(s3 = s);
        Serializable s5;
        Serializable s4 = s5 = s3;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                s5 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                            }
                            else {
                                s4 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                            }
                        }
                        else {
                            s3 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        return new SendBirdDataV1$Gif((String)s, s2, (String)s3, (Integer)s4, (Integer)s5);
    }
    
    public void toJson(final x x, final SendBirdDataV1$Gif sendBirdDataV1$Gif) {
        f.f((Object)x, "writer");
        if (sendBirdDataV1$Gif != null) {
            x.h();
            x.w("id");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Gif.getId());
            x.w("title");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Gif.getTitle());
            x.w("url");
            this.nullableStringAdapter.toJson(x, (Object)sendBirdDataV1$Gif.getUrl());
            x.w("height");
            this.nullableIntAdapter.toJson(x, (Object)sendBirdDataV1$Gif.getHeight());
            x.w("width");
            this.nullableIntAdapter.toJson(x, (Object)sendBirdDataV1$Gif.getWidth());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SendBirdDataV1.Gif)";
    }
}