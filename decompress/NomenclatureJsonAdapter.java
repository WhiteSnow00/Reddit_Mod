// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

import com.squareup.moshi.x;
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

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lcom/reddit/domain/meta/model/NomenclatureJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/Nomenclature;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class NomenclatureJsonAdapter extends JsonAdapter<Nomenclature>
{
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public NomenclatureJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "membershipAlt", "membership", "memberAlt", "memberAltPlural", "member" });
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)EmptySet.INSTANCE, "membershipAlt");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        String s3;
        String s2 = s3 = s;
        String s5;
        String s4 = s5 = s3;
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
                                s5 = (String)this.stringAdapter.fromJson(jsonReader);
                                if (s5 != null) {
                                    continue;
                                }
                                throw a.n("member", "member", jsonReader);
                            }
                            else {
                                s4 = (String)this.stringAdapter.fromJson(jsonReader);
                                if (s4 != null) {
                                    continue;
                                }
                                throw a.n("memberAltPlural", "memberAltPlural", jsonReader);
                            }
                        }
                        else {
                            s3 = (String)this.stringAdapter.fromJson(jsonReader);
                            if (s3 != null) {
                                continue;
                            }
                            throw a.n("memberAlt", "memberAlt", jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s2 != null) {
                            continue;
                        }
                        throw a.n("membership", "membership", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("membershipAlt", "membershipAlt", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("membershipAlt", "membershipAlt", jsonReader);
        }
        if (s2 == null) {
            throw a.h("membership", "membership", jsonReader);
        }
        if (s3 == null) {
            throw a.h("memberAlt", "memberAlt", jsonReader);
        }
        if (s4 == null) {
            throw a.h("memberAltPlural", "memberAltPlural", jsonReader);
        }
        if (s5 != null) {
            return new Nomenclature(s, s2, s3, s4, s5);
        }
        throw a.h("member", "member", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final Nomenclature nomenclature = (Nomenclature)o;
        f.f((Object)x, "writer");
        if (nomenclature != null) {
            x.h();
            x.w("membershipAlt");
            this.stringAdapter.toJson(x, (Object)nomenclature.a);
            x.w("membership");
            this.stringAdapter.toJson(x, (Object)nomenclature.b);
            x.w("memberAlt");
            this.stringAdapter.toJson(x, (Object)nomenclature.c);
            x.w("memberAltPlural");
            this.stringAdapter.toJson(x, (Object)nomenclature.d);
            x.w("member");
            this.stringAdapter.toJson(x, (Object)nomenclature.e);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(Nomenclature)";
    }
}
