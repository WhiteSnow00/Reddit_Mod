// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import qd2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/snoovatar/entity/ClosetJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/snoovatar/entity/ClosetJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/data/snoovatar/entity/AccessoryJson;", "listOfAccessoryJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ClosetJsonJsonAdapter extends JsonAdapter<ClosetJson>
{
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<AccessoryJson>> listOfAccessoryJsonAdapter;
    private final JsonReader$b options;
    
    public ClosetJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "accessories", "max_slots", "occupied_slots" });
        final a$b d = a0.d((Class)List.class, new Type[] { AccessoryJson.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfAccessoryJsonAdapter = (JsonAdapter<List<AccessoryJson>>)y.c((Type)d, (Set)instance, "accessories");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "maxSlots");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        List<AccessoryJson> list = null;
        Integer n2;
        Integer n = n2 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            continue;
                        }
                        n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n2 != null) {
                            continue;
                        }
                        throw a.n("occupiedSlots", "occupied_slots", jsonReader);
                    }
                    else {
                        n = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n != null) {
                            continue;
                        }
                        throw a.n("maxSlots", "max_slots", jsonReader);
                    }
                }
                else {
                    list = (List)this.listOfAccessoryJsonAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("accessories", "accessories", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (list == null) {
            throw a.h("accessories", "accessories", jsonReader);
        }
        if (n == null) {
            throw a.h("maxSlots", "max_slots", jsonReader);
        }
        final int intValue = n;
        if (n2 != null) {
            return new ClosetJson(list, intValue, n2);
        }
        throw a.h("occupiedSlots", "occupied_slots", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final ClosetJson closetJson = (ClosetJson)o;
        f.f((Object)x, "writer");
        if (closetJson != null) {
            x.h();
            x.w("accessories");
            this.listOfAccessoryJsonAdapter.toJson(x, (Object)closetJson.a);
            x.w("max_slots");
            c.n(closetJson.b, this.intAdapter, x, "occupied_slots");
            ag0.a.t(closetJson.c, (JsonAdapter)this.intAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(ClosetJson)";
    }
}
