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

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/VariantsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Variants;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/domain/model/Variant;", "nullableVariantAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class VariantsJsonAdapter extends JsonAdapter<Variants>
{
    private volatile Constructor<Variants> constructorRef;
    private final JsonAdapter<Variant> nullableVariantAdapter;
    private final JsonReader$b options;
    
    public VariantsJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "obfuscated", "gif", "mp4" });
        this.nullableVariantAdapter = (JsonAdapter<Variant>)y.c((Type)Variant.class, (Set)EmptySet.INSTANCE, "obfuscated");
    }
    
    public Variants fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Variant variant = null;
        Object o2;
        Object o = o2 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            continue;
                        }
                        o2 = this.nullableVariantAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFFB;
                    }
                    else {
                        o = this.nullableVariantAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFFD;
                    }
                }
                else {
                    variant = (Variant)this.nullableVariantAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (n == -8) {
            return new Variants(variant, (Variant)o, (Variant)o2);
        }
        Constructor<Variants> constructorRef;
        if ((constructorRef = this.constructorRef) == null) {
            constructorRef = Variants.class.getDeclaredConstructor(Variant.class, Variant.class, Variant.class, Integer.TYPE, a.c);
            e.e((Object)(this.constructorRef = constructorRef), "Variants::class.java.get\u2026his.constructorRef = it }");
        }
        final Variants instance = constructorRef.newInstance(variant, o, o2, n, null);
        e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
        return instance;
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final Variants variants) {
        e.f((Object)x, "writer");
        if (variants != null) {
            x.h();
            x.v("obfuscated");
            this.nullableVariantAdapter.toJson(x, (Object)variants.getObfuscated());
            x.v("gif");
            this.nullableVariantAdapter.toJson(x, (Object)variants.getGif());
            x.v("mp4");
            this.nullableVariantAdapter.toJson(x, (Object)variants.getMp4());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (Variants)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Variants)";
    }
}
