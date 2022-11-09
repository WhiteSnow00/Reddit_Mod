// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools;

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

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/modtools/ActiveLanguageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/modtools/ActiveLanguage;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ActiveLanguageJsonAdapter extends JsonAdapter<ActiveLanguage>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public ActiveLanguageJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "isoCode", "displayName", "englishName", "rtl" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "isoCode");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "rtl");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Serializable s2 = null;
        Serializable s4;
        String s3 = (String)(s4 = s2);
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                continue;
                            }
                            s4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (s4 != null) {
                                continue;
                            }
                            throw a.n("rtl", "rtl", jsonReader);
                        }
                        else {
                            s3 = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s3 != null) {
                                continue;
                            }
                            throw a.n("englishName", "englishName", jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s2 != null) {
                            continue;
                        }
                        throw a.n("displayName", "displayName", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("isoCode", "isoCode", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("isoCode", "isoCode", jsonReader);
        }
        if (s2 == null) {
            throw a.h("displayName", "displayName", jsonReader);
        }
        if (s3 == null) {
            throw a.h("englishName", "englishName", jsonReader);
        }
        if (s4 != null) {
            return new ActiveLanguage(s, (String)s2, s3, (boolean)s4);
        }
        throw a.h("rtl", "rtl", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final ActiveLanguage activeLanguage = (ActiveLanguage)o;
        f.f((Object)x, "writer");
        if (activeLanguage != null) {
            x.h();
            x.w("isoCode");
            this.stringAdapter.toJson(x, (Object)activeLanguage.getIsoCode());
            x.w("displayName");
            this.stringAdapter.toJson(x, (Object)activeLanguage.getDisplayName());
            x.w("englishName");
            this.stringAdapter.toJson(x, (Object)activeLanguage.getEnglishName());
            x.w("rtl");
            this.booleanAdapter.toJson(x, (Object)activeLanguage.getRtl());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ActiveLanguage)";
    }
}
