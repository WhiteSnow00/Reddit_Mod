// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import java.io.Serializable;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/meta/model/MetaImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/MetaImage;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaImageJsonAdapter extends JsonAdapter<MetaImage>
{
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public MetaImageJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "path", "type", "x", "y" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "path");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "x");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Serializable s2 = null;
        Serializable s4;
        Serializable s3 = s4 = s2;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                continue;
                            }
                            s4 = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (s4 != null) {
                                continue;
                            }
                            throw a.n("y", "y", jsonReader);
                        }
                        else {
                            s3 = (Integer)this.intAdapter.fromJson(jsonReader);
                            if (s3 != null) {
                                continue;
                            }
                            throw a.n("x", "x", jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s2 != null) {
                            continue;
                        }
                        throw a.n("type", "type", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("path", "path", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("path", "path", jsonReader);
        }
        if (s2 == null) {
            throw a.h("type", "type", jsonReader);
        }
        if (s3 == null) {
            throw a.h("x", "x", jsonReader);
        }
        final int intValue = (int)s3;
        if (s4 != null) {
            return new MetaImage(s, (String)s2, intValue, (int)s4);
        }
        throw a.h("y", "y", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final MetaImage metaImage = (MetaImage)o;
        f.f((Object)x, "writer");
        if (metaImage != null) {
            x.h();
            x.w("path");
            this.stringAdapter.toJson(x, (Object)metaImage.f);
            x.w("type");
            this.stringAdapter.toJson(x, (Object)metaImage.g);
            x.w("x");
            c.n(metaImage.h, this.intAdapter, x, "y");
            ag0.a.t(metaImage.i, (JsonAdapter)this.intAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(MetaImage)";
    }
}
