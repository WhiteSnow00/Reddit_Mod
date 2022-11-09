// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.data;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016" }, d2 = { "Lcom/reddit/discoveryunits/data/SurfaceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/discoveryunits/data/Surface;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lcom/reddit/discoveryunits/data/OrderType;", "orderTypeAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SurfaceJsonAdapter extends JsonAdapter<Surface>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Surface> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<OrderType> orderTypeAdapter;
    private final JsonAdapter<String> stringAdapter;
    
    public SurfaceJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "name", "enabled", "order", "distance", "start" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "name");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "enabled");
        this.orderTypeAdapter = (JsonAdapter<OrderType>)y.c((Type)OrderType.class, (Set)instance, "order");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "distance");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Integer value = 0;
        jsonReader.h();
        Integer n = value;
        int n2 = -1;
        Boolean b = null;
        String s = null;
        Object o = null;
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
                                n = (Integer)this.intAdapter.fromJson(jsonReader);
                                if (n == null) {
                                    throw a.n("start", "start", jsonReader);
                                }
                                n2 &= 0xFFFFFFEF;
                            }
                            else {
                                value = (Integer)this.intAdapter.fromJson(jsonReader);
                                if (value == null) {
                                    throw a.n("distance", "distance", jsonReader);
                                }
                                n2 &= 0xFFFFFFF7;
                            }
                        }
                        else {
                            o = this.orderTypeAdapter.fromJson(jsonReader);
                            if (o != null) {
                                continue;
                            }
                            throw a.n("order", "order", jsonReader);
                        }
                    }
                    else {
                        b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (b != null) {
                            continue;
                        }
                        throw a.n("enabled", "enabled", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("name", "name", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        Surface surface;
        if (n2 == -25) {
            if (s == null) {
                throw a.h("name", "name", jsonReader);
            }
            if (b == null) {
                throw a.h("enabled", "enabled", jsonReader);
            }
            final boolean booleanValue = b;
            if (o == null) {
                throw a.h("order", "order", jsonReader);
            }
            surface = new Surface(s, booleanValue, (OrderType)o, value, n);
        }
        else {
            Constructor<Surface> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Boolean> type = Boolean.TYPE;
                final Class<Integer> type2 = Integer.TYPE;
                constructorRef = Surface.class.getDeclaredConstructor(String.class, type, OrderType.class, type2, type2, type2, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "Surface::class.java.getD\u2026his.constructorRef = it }");
            }
            if (s == null) {
                throw a.h("name", "name", jsonReader);
            }
            if (b == null) {
                throw a.h("enabled", "enabled", jsonReader);
            }
            final boolean booleanValue2 = b;
            if (o == null) {
                throw a.h("order", "order", jsonReader);
            }
            final Surface instance = constructorRef.newInstance(s, booleanValue2, o, value, n, n2, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            surface = instance;
        }
        return surface;
    }
    
    public final void toJson(final x x, final Object o) {
        final Surface surface = (Surface)o;
        f.f((Object)x, "writer");
        if (surface != null) {
            x.h();
            x.w("name");
            this.stringAdapter.toJson(x, (Object)surface.a);
            x.w("enabled");
            a.v(surface.b, (JsonAdapter)this.booleanAdapter, x, "order");
            this.orderTypeAdapter.toJson(x, (Object)surface.c);
            x.w("distance");
            c.n(surface.d, this.intAdapter, x, "start");
            ag0.a.t(surface.e, (JsonAdapter)this.intAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(Surface)";
    }
}
