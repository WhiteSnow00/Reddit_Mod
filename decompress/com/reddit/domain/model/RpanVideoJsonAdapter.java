// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/RpanVideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/RpanVideo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RpanVideoJsonAdapter extends JsonAdapter<RpanVideo>
{
    private volatile Constructor<RpanVideo> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public RpanVideoJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "hls_url", "scrubber_media_url" });
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)EmptySet.INSTANCE, "hlsUrl");
    }
    
    public RpanVideo fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                }
                else {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (n == -4) {
            return new RpanVideo(s, (String)o);
        }
        Constructor<RpanVideo> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = RpanVideo.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, a.c);
            e.e((Object)(this.constructorRef = constructorRef), "RpanVideo::class.java.ge\u2026his.constructorRef = it }");
        }
        final RpanVideo instance = constructorRef.newInstance(s, o, n, null);
        e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final RpanVideo rpanVideo) {
        e.f((Object)x, "writer");
        if (rpanVideo != null) {
            x.h();
            x.v("hls_url");
            this.nullableStringAdapter.toJson(x, (Object)rpanVideo.getHlsUrl());
            x.v("scrubber_media_url");
            this.nullableStringAdapter.toJson(x, (Object)rpanVideo.getScrubberMediaUrl());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (RpanVideo)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RpanVideo)";
    }
}
