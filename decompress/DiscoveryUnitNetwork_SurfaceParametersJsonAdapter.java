// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.data;

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

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010" }, d2 = { "Lcom/reddit/discoveryunits/data/DiscoveryUnitNetwork_SurfaceParametersJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/discoveryunits/data/DiscoveryUnitNetwork$SurfaceParameters;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class DiscoveryUnitNetwork_SurfaceParametersJsonAdapter extends JsonAdapter<DiscoveryUnitNetwork.SurfaceParameters>
{
    private volatile Constructor<DiscoveryUnitNetwork.SurfaceParameters> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader$b options;
    
    public DiscoveryUnitNetwork_SurfaceParametersJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "show_if_subscribed" });
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)EmptySet.INSTANCE, "show_if_subscribed");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Boolean b = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    continue;
                }
                b = (Boolean)this.nullableBooleanAdapter.fromJson(jsonReader);
                n &= 0xFFFFFFFE;
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        Object o;
        if (n == -2) {
            o = new DiscoveryUnitNetwork.SurfaceParameters(b);
        }
        else {
            Constructor<DiscoveryUnitNetwork.SurfaceParameters> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = DiscoveryUnitNetwork.SurfaceParameters.class.getDeclaredConstructor(Boolean.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "DiscoveryUnitNetwork.Sur\u2026his.constructorRef = it }");
            }
            final DiscoveryUnitNetwork.SurfaceParameters instance = constructorRef.newInstance(b, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            o = instance;
        }
        return o;
    }
    
    public final void toJson(final x x, final Object o) {
        final DiscoveryUnitNetwork.SurfaceParameters surfaceParameters = (DiscoveryUnitNetwork.SurfaceParameters)o;
        f.f((Object)x, "writer");
        if (surfaceParameters != null) {
            x.h();
            x.w("show_if_subscribed");
            this.nullableBooleanAdapter.toJson(x, (Object)surfaceParameters.f);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(DiscoveryUnitNetwork.SurfaceParameters)";
    }
}
