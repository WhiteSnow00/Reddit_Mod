// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import pg2.j;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.reddit.discoveryunits.data.OrderBy;
import com.squareup.moshi.JsonReader$b;
import com.reddit.discoveryunits.data.DiscoveryUnitNetwork;
import com.reddit.discoveryunits.ui.carousel.SubheaderIcon;
import java.util.Map;
import java.util.List;
import java.lang.reflect.Constructor;
import com.reddit.discoveryunits.ui.carousel.CarouselItemLayout;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR(\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\bR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnitTypeAdapter_DiscoveryUnitJsonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/discoveryunits/ui/DiscoveryUnitTypeAdapter$DiscoveryUnitJson;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "booleanAdapter", "", "intAdapter", "Lcom/reddit/discoveryunits/ui/carousel/SubheaderIcon;", "nullableSubheaderIconAdapter", "Lcom/reddit/discoveryunits/ui/carousel/CarouselItemLayout;", "carouselItemLayoutAdapter", "", "listOfStringAdapter", "Lcom/reddit/discoveryunits/data/OrderBy;", "orderByAdapter", "", "nullableMapOfStringStringAdapter", "nullableIntAdapter", "Lcom/reddit/discoveryunits/data/DiscoveryUnitNetwork$SurfaceParameters;", "nullableSurfaceParametersAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class DiscoveryUnitTypeAdapter_DiscoveryUnitJsonJsonAdapter extends JsonAdapter<DiscoveryUnitTypeAdapter.DiscoveryUnitJson>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CarouselItemLayout> carouselItemLayoutAdapter;
    private volatile Constructor<DiscoveryUnitTypeAdapter.DiscoveryUnitJson> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<SubheaderIcon> nullableSubheaderIconAdapter;
    private final JsonAdapter<DiscoveryUnitNetwork.SurfaceParameters> nullableSurfaceParametersAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<OrderBy> orderByAdapter;
    private final JsonAdapter<String> stringAdapter;
    
    public DiscoveryUnitTypeAdapter_DiscoveryUnitJsonJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "unique_id", "unit_name", "unit_type", "surface", "url", "enabled_for_minimum_app_version", "min_app_version", "min_app_version_name", "index", "title", "subtitle", "subtitle_icon", "layout", "options", "orderBy", "parameters", "custom_hide_key", "versionCode", "versionName", "surface_parameters", "carry_over_from", "carry_over_count" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "unique_id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "url");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "enabled_for_minimum_app_version");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "min_app_version");
        this.nullableSubheaderIconAdapter = (JsonAdapter<SubheaderIcon>)y.c((Type)SubheaderIcon.class, (Set)instance, "subtitle_icon");
        this.carouselItemLayoutAdapter = (JsonAdapter<CarouselItemLayout>)y.c((Type)CarouselItemLayout.class, (Set)instance, "layout");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "options");
        this.orderByAdapter = (JsonAdapter<OrderBy>)y.c((Type)OrderBy.class, (Set)instance, "orderBy");
        this.nullableMapOfStringStringAdapter = (JsonAdapter<Map<String, String>>)y.c((Type)a0.d((Class)Map.class, new Type[] { String.class, String.class }), (Set)instance, "parameters");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "versionCode");
        this.nullableSurfaceParametersAdapter = (JsonAdapter<DiscoveryUnitNetwork.SurfaceParameters>)y.c((Type)DiscoveryUnitNetwork.SurfaceParameters.class, (Set)instance, "surface_parameters");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        Integer value = 0;
        jsonReader.h();
        int n = -1;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        Object o11 = null;
        Object o12 = null;
        Object o13 = null;
        Object o14 = null;
        Object o15 = null;
        Object o16 = null;
        Object o17 = null;
        Object o18 = null;
        Object o19 = null;
        Integer n2 = value;
        while (jsonReader.hasNext()) {
            int n3 = 0;
            Label_0622: {
                int n4 = 0;
                switch (jsonReader.F(this.options)) {
                    default: {
                        n3 = n;
                        break Label_0622;
                    }
                    case 21: {
                        o19 = this.nullableIntAdapter.fromJson(jsonReader);
                        n4 = -2097153;
                        break;
                    }
                    case 20: {
                        o18 = this.nullableIntAdapter.fromJson(jsonReader);
                        n4 = -1048577;
                        break;
                    }
                    case 19: {
                        o17 = this.nullableSurfaceParametersAdapter.fromJson(jsonReader);
                        n4 = -524289;
                        break;
                    }
                    case 18: {
                        o16 = this.nullableStringAdapter.fromJson(jsonReader);
                        n4 = -262145;
                        break;
                    }
                    case 17: {
                        o15 = this.nullableIntAdapter.fromJson(jsonReader);
                        n4 = -131073;
                        break;
                    }
                    case 16: {
                        o14 = this.nullableStringAdapter.fromJson(jsonReader);
                        n4 = -65537;
                        break;
                    }
                    case 15: {
                        o13 = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                        n4 = -32769;
                        break;
                    }
                    case 14: {
                        o = this.orderByAdapter.fromJson(jsonReader);
                        if (o != null) {
                            n3 = (n & 0xFFFFBFFF);
                            break Label_0622;
                        }
                        throw a.n("orderBy", "orderBy", jsonReader);
                    }
                    case 13: {
                        o2 = this.listOfStringAdapter.fromJson(jsonReader);
                        if (o2 != null) {
                            n3 = (n & 0xFFFFDFFF);
                            break Label_0622;
                        }
                        throw a.n("options_", "options", jsonReader);
                    }
                    case 12: {
                        o3 = this.carouselItemLayoutAdapter.fromJson(jsonReader);
                        if (o3 != null) {
                            n3 = (n & 0xFFFFEFFF);
                            break Label_0622;
                        }
                        throw a.n("layout", "layout", jsonReader);
                    }
                    case 11: {
                        o12 = this.nullableSubheaderIconAdapter.fromJson(jsonReader);
                        n3 = (n & 0xFFFFF7FF);
                        break Label_0622;
                    }
                    case 10: {
                        o11 = this.nullableStringAdapter.fromJson(jsonReader);
                        n3 = (n & 0xFFFFFBFF);
                        break Label_0622;
                    }
                    case 9: {
                        o4 = this.stringAdapter.fromJson(jsonReader);
                        if (o4 != null) {
                            n &= 0xFFFFFDFF;
                            continue;
                        }
                        throw a.n("title", "title", jsonReader);
                    }
                    case 8: {
                        n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (n2 != null) {
                            n3 = (n & 0xFFFFFEFF);
                            break Label_0622;
                        }
                        throw a.n("index", "index", jsonReader);
                    }
                    case 7: {
                        o9 = this.stringAdapter.fromJson(jsonReader);
                        if (o9 != null) {
                            n3 = (n & 0xFFFFFF7F);
                            break Label_0622;
                        }
                        throw a.n("min_app_version_name", "min_app_version_name", jsonReader);
                    }
                    case 6: {
                        value = (Integer)this.intAdapter.fromJson(jsonReader);
                        if (value != null) {
                            n3 = (n & 0xFFFFFFBF);
                            break Label_0622;
                        }
                        throw a.n("min_app_version", "min_app_version", jsonReader);
                    }
                    case 5: {
                        false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                        if (false != null) {
                            n3 = (n & 0xFFFFFFDF);
                            break Label_0622;
                        }
                        throw a.n("enabled_for_minimum_app_version", "enabled_for_minimum_app_version", jsonReader);
                    }
                    case 4: {
                        o10 = this.nullableStringAdapter.fromJson(jsonReader);
                        n3 = (n & 0xFFFFFFEF);
                        break Label_0622;
                    }
                    case 3: {
                        o8 = this.stringAdapter.fromJson(jsonReader);
                        if (o8 != null) {
                            n3 = (n & 0xFFFFFFF7);
                            break Label_0622;
                        }
                        throw a.n("surface", "surface", jsonReader);
                    }
                    case 2: {
                        o7 = this.stringAdapter.fromJson(jsonReader);
                        if (o7 != null) {
                            n3 = (n & 0xFFFFFFFB);
                            break Label_0622;
                        }
                        throw a.n("unit_type", "unit_type", jsonReader);
                    }
                    case 1: {
                        o6 = this.stringAdapter.fromJson(jsonReader);
                        if (o6 != null) {
                            n3 = (n & 0xFFFFFFFD);
                            break Label_0622;
                        }
                        throw a.n("unit_name", "unit_name", jsonReader);
                    }
                    case 0: {
                        o5 = this.stringAdapter.fromJson(jsonReader);
                        if (o5 != null) {
                            n3 = (n & 0xFFFFFFFE);
                            break Label_0622;
                        }
                        throw a.n("unique_id", "unique_id", jsonReader);
                    }
                    case -1: {
                        jsonReader.J();
                        jsonReader.z1();
                        n3 = n;
                        break Label_0622;
                    }
                }
                n3 = (n & n4);
            }
            n = n3;
        }
        jsonReader.r();
        Object o20;
        if (n == -4194304) {
            f.d(o5, "null cannot be cast to non-null type kotlin.String");
            f.d(o6, "null cannot be cast to non-null type kotlin.String");
            f.d(o7, "null cannot be cast to non-null type kotlin.String");
            f.d(o8, "null cannot be cast to non-null type kotlin.String");
            final boolean booleanValue = false;
            final int intValue = value;
            f.d(o9, "null cannot be cast to non-null type kotlin.String");
            final int intValue2 = n2;
            f.d(o4, "null cannot be cast to non-null type kotlin.String");
            f.d(o3, "null cannot be cast to non-null type com.reddit.discoveryunits.ui.carousel.CarouselItemLayout");
            f.d(o2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            f.d(o, "null cannot be cast to non-null type com.reddit.discoveryunits.data.OrderBy");
            o20 = new DiscoveryUnitTypeAdapter.DiscoveryUnitJson((String)o5, (String)o6, (String)o7, (String)o8, (String)o10, booleanValue, intValue, (String)o9, intValue2, (String)o4, (String)o11, (SubheaderIcon)o12, (CarouselItemLayout)o3, (List<String>)o2, (OrderBy)o, (Map<String, String>)o13, (String)o14, (Integer)o15, (String)o16, (DiscoveryUnitNetwork.SurfaceParameters)o17, (Integer)o18, (Integer)o19);
        }
        else {
            Constructor<DiscoveryUnitTypeAdapter.DiscoveryUnitJson> constructorRef = this.constructorRef;
            if (constructorRef == null) {
                final Class<Boolean> type = Boolean.TYPE;
                final Class<Integer> type2 = Integer.TYPE;
                constructorRef = DiscoveryUnitTypeAdapter.DiscoveryUnitJson.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, type, type2, String.class, type2, String.class, String.class, SubheaderIcon.class, CarouselItemLayout.class, List.class, OrderBy.class, Map.class, String.class, Integer.class, String.class, DiscoveryUnitNetwork.SurfaceParameters.class, Integer.class, Integer.class, type2, a.c);
                this.constructorRef = constructorRef;
                final j a = j.a;
                f.e((Object)constructorRef, "DiscoveryUnitTypeAdapter\u2026his.constructorRef = it }");
            }
            final DiscoveryUnitTypeAdapter.DiscoveryUnitJson instance = constructorRef.newInstance(o5, o6, o7, o8, o10, false, value, o9, n2, o4, o11, o12, o3, o2, o, o13, o14, o15, o16, o17, o18, o19, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            o20 = instance;
        }
        return o20;
    }
    
    public final void toJson(final x x, final Object o) {
        final DiscoveryUnitTypeAdapter.DiscoveryUnitJson discoveryUnitJson = (DiscoveryUnitTypeAdapter.DiscoveryUnitJson)o;
        f.f((Object)x, "writer");
        if (discoveryUnitJson != null) {
            x.h();
            x.w("unique_id");
            this.stringAdapter.toJson(x, (Object)discoveryUnitJson.a);
            x.w("unit_name");
            this.stringAdapter.toJson(x, (Object)discoveryUnitJson.b);
            x.w("unit_type");
            this.stringAdapter.toJson(x, (Object)discoveryUnitJson.c);
            x.w("surface");
            this.stringAdapter.toJson(x, (Object)discoveryUnitJson.d);
            x.w("url");
            this.nullableStringAdapter.toJson(x, (Object)discoveryUnitJson.e);
            x.w("enabled_for_minimum_app_version");
            a.v(discoveryUnitJson.f, (JsonAdapter)this.booleanAdapter, x, "min_app_version");
            c.n(discoveryUnitJson.g, this.intAdapter, x, "min_app_version_name");
            this.stringAdapter.toJson(x, (Object)discoveryUnitJson.h);
            x.w("index");
            c.n(discoveryUnitJson.i, this.intAdapter, x, "title");
            this.stringAdapter.toJson(x, (Object)discoveryUnitJson.j);
            x.w("subtitle");
            this.nullableStringAdapter.toJson(x, (Object)discoveryUnitJson.k);
            x.w("subtitle_icon");
            this.nullableSubheaderIconAdapter.toJson(x, (Object)discoveryUnitJson.l);
            x.w("layout");
            this.carouselItemLayoutAdapter.toJson(x, (Object)discoveryUnitJson.m);
            x.w("options");
            this.listOfStringAdapter.toJson(x, (Object)discoveryUnitJson.n);
            x.w("orderBy");
            this.orderByAdapter.toJson(x, (Object)discoveryUnitJson.o);
            x.w("parameters");
            this.nullableMapOfStringStringAdapter.toJson(x, (Object)discoveryUnitJson.p);
            x.w("custom_hide_key");
            this.nullableStringAdapter.toJson(x, (Object)discoveryUnitJson.q);
            x.w("versionCode");
            this.nullableIntAdapter.toJson(x, (Object)discoveryUnitJson.r);
            x.w("versionName");
            this.nullableStringAdapter.toJson(x, (Object)discoveryUnitJson.s);
            x.w("surface_parameters");
            this.nullableSurfaceParametersAdapter.toJson(x, (Object)discoveryUnitJson.t);
            x.w("carry_over_from");
            this.nullableIntAdapter.toJson(x, (Object)discoveryUnitJson.u);
            x.w("carry_over_count");
            this.nullableIntAdapter.toJson(x, (Object)discoveryUnitJson.v);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(DiscoveryUnitTypeAdapter.DiscoveryUnitJson)";
    }
}
