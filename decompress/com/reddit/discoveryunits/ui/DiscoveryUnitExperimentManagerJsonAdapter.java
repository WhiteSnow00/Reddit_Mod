// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.l;
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
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnitExperimentManagerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/discoveryunits/ui/DiscoveryUnitExperimentManager;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/discoveryunits/ui/DiscoveryUnit;", "mutableListOfDiscoveryUnitAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class DiscoveryUnitExperimentManagerJsonAdapter extends JsonAdapter<DiscoveryUnitExperimentManager>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DiscoveryUnitExperimentManager> constructorRef;
    private final JsonAdapter<List<DiscoveryUnit>> mutableListOfDiscoveryUnitAdapter;
    private final JsonReader$b options;
    
    public DiscoveryUnitExperimentManagerJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "configDiscoveryUnits", "debugMode" });
        final a$b d = a0.d((Class)List.class, new Type[] { DiscoveryUnit.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.mutableListOfDiscoveryUnitAdapter = (JsonAdapter<List<DiscoveryUnit>>)y.c((Type)d, (Set)instance, "configDiscoveryUnits");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "debugMode");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        int n = -1;
        Object o = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        continue;
                    }
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false == null) {
                        throw a.n("debugMode", "debugMode", jsonReader);
                    }
                    n &= 0xFFFFFFFB;
                }
                else {
                    o = this.mutableListOfDiscoveryUnitAdapter.fromJson(jsonReader);
                    if (o == null) {
                        throw a.n("configDiscoveryUnits", "configDiscoveryUnits", jsonReader);
                    }
                    n &= 0xFFFFFFFE;
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        DiscoveryUnitExperimentManager discoveryUnitExperimentManager;
        if (n == -6) {
            f.d(o, "null cannot be cast to non-null type kotlin.collections.MutableList<com.reddit.discoveryunits.ui.DiscoveryUnit>");
            l.b((List)o);
            discoveryUnitExperimentManager = new DiscoveryUnitExperimentManager((List)o, null, false, 2, null);
        }
        else {
            Constructor<DiscoveryUnitExperimentManager> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = DiscoveryUnitExperimentManager.class.getDeclaredConstructor(List.class, List.class, Boolean.TYPE, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "DiscoveryUnitExperimentM\u2026his.constructorRef = it }");
            }
            final DiscoveryUnitExperimentManager instance = constructorRef.newInstance(o, null, false, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            discoveryUnitExperimentManager = instance;
        }
        return discoveryUnitExperimentManager;
    }
    
    public final void toJson(final x x, final Object o) {
        final DiscoveryUnitExperimentManager discoveryUnitExperimentManager = (DiscoveryUnitExperimentManager)o;
        f.f((Object)x, "writer");
        if (discoveryUnitExperimentManager != null) {
            x.h();
            x.w("configDiscoveryUnits");
            this.mutableListOfDiscoveryUnitAdapter.toJson(x, (Object)discoveryUnitExperimentManager.a);
            x.w("debugMode");
            c.u(discoveryUnitExperimentManager.b, this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(DiscoveryUnitExperimentManager)";
    }
}
