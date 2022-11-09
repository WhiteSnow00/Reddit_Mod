// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui;

import a2.b;
import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.collections.c;
import com.reddit.discoveryunits.data.OrderType;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.discoveryunits.data.DiscoveryUnitNetwork;
import com.squareup.moshi.o;
import com.squareup.moshi.z;
import com.squareup.moshi.m;
import java.util.Map;
import com.reddit.discoveryunits.data.OrderBy;
import java.util.List;
import com.reddit.discoveryunits.ui.carousel.CarouselItemLayout;
import com.reddit.discoveryunits.ui.carousel.SubheaderIcon;
import ah2.f;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\t" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnitTypeAdapter;", "", "Lcom/reddit/discoveryunits/ui/DiscoveryUnitTypeAdapter$DiscoveryUnitJson;", "discoveryUnitJson", "Lcom/reddit/discoveryunits/ui/DiscoveryUnit;", "discoveryUnitFromJson", "discoveryUnit", "jsonFromDiscoveryUnit", "DiscoveryUnitJson", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class DiscoveryUnitTypeAdapter
{
    public final int a;
    public final String b;
    
    public DiscoveryUnitTypeAdapter(final int a, final String b) {
        f.f((Object)b, "versionName");
        this.a = a;
        this.b = b;
    }
    
    @m
    public final DiscoveryUnit discoveryUnitFromJson(final DiscoveryUnitJson discoveryUnitJson) {
        f.f((Object)discoveryUnitJson, "discoveryUnitJson");
        final String a = discoveryUnitJson.a;
        final String b = discoveryUnitJson.b;
        final String c = discoveryUnitJson.c;
        final String d = discoveryUnitJson.d;
        final String e = discoveryUnitJson.e;
        final boolean f = discoveryUnitJson.f;
        final int g = discoveryUnitJson.g;
        final String h = discoveryUnitJson.h;
        final int i = discoveryUnitJson.i;
        final String j = discoveryUnitJson.j;
        final String k = discoveryUnitJson.k;
        final SubheaderIcon l = discoveryUnitJson.l;
        final CarouselItemLayout m = discoveryUnitJson.m;
        final List<String> n = discoveryUnitJson.n;
        final OrderBy o = discoveryUnitJson.o;
        final Map<String, String> p = discoveryUnitJson.p;
        final String q = discoveryUnitJson.q;
        final Integer r = discoveryUnitJson.r;
        int n2;
        if (r != null) {
            n2 = r;
        }
        else {
            n2 = this.a;
        }
        String s;
        if ((s = discoveryUnitJson.s) == null) {
            s = this.b;
        }
        return new DiscoveryUnit(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, n2, s, discoveryUnitJson.t, discoveryUnitJson.u, discoveryUnitJson.v);
    }
    
    @z
    public final DiscoveryUnitJson jsonFromDiscoveryUnit(final DiscoveryUnit discoveryUnit) {
        f.f((Object)discoveryUnit, "discoveryUnit");
        return new DiscoveryUnitJson(discoveryUnit.f, discoveryUnit.g, discoveryUnit.h, discoveryUnit.i, discoveryUnit.j, discoveryUnit.k, discoveryUnit.l, discoveryUnit.m, discoveryUnit.n, discoveryUnit.o, discoveryUnit.p, discoveryUnit.q, discoveryUnit.r, discoveryUnit.s, discoveryUnit.t, discoveryUnit.u, discoveryUnit.v, discoveryUnit.w, discoveryUnit.x, discoveryUnit.y, discoveryUnit.z, discoveryUnit.A);
    }
    
    @o(generateAdapter = true)
    @Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnitTypeAdapter$DiscoveryUnitJson;", "", "ui_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class DiscoveryUnitJson
    {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final int g;
        public final String h;
        public final int i;
        public final String j;
        public final String k;
        public final SubheaderIcon l;
        public final CarouselItemLayout m;
        public final List<String> n;
        public final OrderBy o;
        public final Map<String, String> p;
        public final String q;
        public final Integer r;
        public final String s;
        public final DiscoveryUnitNetwork.SurfaceParameters t;
        public final Integer u;
        public final Integer v;
        
        public DiscoveryUnitJson() {
            this(null, null, null, null, null, false, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        }
        
        public DiscoveryUnitJson(final String a, final String b, final String c, final String d, final String e, final boolean f, final int g, final String h, final int i, final String j, final String k, final SubheaderIcon l, final CarouselItemLayout m, final List<String> n, final OrderBy o, final Map<String, String> p22, final String q, final Integer r, final String s, final DiscoveryUnitNetwork.SurfaceParameters t, final Integer u, final Integer v) {
            f.f((Object)a, "unique_id");
            f.f((Object)b, "unit_name");
            f.f((Object)c, "unit_type");
            f.f((Object)d, "surface");
            f.f((Object)h, "min_app_version_name");
            f.f((Object)j, "title");
            f.f((Object)m, "layout");
            f.f((Object)n, "options");
            f.f((Object)o, "orderBy");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p22;
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
            this.u = u;
            this.v = v;
        }
        
        public DiscoveryUnitJson(String s, String s2, String s3, String s4, String s5, boolean b, int n, String s6, int n2, String s7, String s8, SubheaderIcon subheaderIcon, CarouselItemLayout small, List instance, OrderBy orderBy, Map n3, String s9, Integer n4, String s10, DiscoveryUnitNetwork.SurfaceParameters surfaceParameters, Integer n5, Integer n6, final int n7, final DefaultConstructorMarker defaultConstructorMarker) {
            final String s11 = "";
            if ((n7 & 0x1) != 0x0) {
                s = "";
            }
            if ((n7 & 0x2) != 0x0) {
                s2 = "";
            }
            if ((n7 & 0x4) != 0x0) {
                s3 = "";
            }
            if ((n7 & 0x8) != 0x0) {
                s4 = "";
            }
            if ((n7 & 0x10) != 0x0) {
                s5 = null;
            }
            if ((n7 & 0x20) != 0x0) {
                b = false;
            }
            if ((n7 & 0x40) != 0x0) {
                n = Integer.MAX_VALUE;
            }
            if ((n7 & 0x80) != 0x0) {
                s6 = "99.99.99";
            }
            if ((n7 & 0x100) != 0x0) {
                n2 = -1;
            }
            if ((n7 & 0x200) != 0x0) {
                s7 = "";
            }
            if ((n7 & 0x400) != 0x0) {
                s8 = s11;
            }
            if ((n7 & 0x800) != 0x0) {
                subheaderIcon = null;
            }
            if ((n7 & 0x1000) != 0x0) {
                small = CarouselItemLayout.SMALL;
            }
            if ((n7 & 0x2000) != 0x0) {
                instance = EmptyList.INSTANCE;
            }
            if ((n7 & 0x4000) != 0x0) {
                orderBy = new OrderBy(0, 0, n2, OrderType.INDEX, 3, null);
            }
            if ((n7 & 0x8000) != 0x0) {
                n3 = c.N1();
            }
            if ((n7 & 0x10000) != 0x0) {
                s9 = null;
            }
            if ((n7 & 0x20000) != 0x0) {
                n4 = null;
            }
            if ((n7 & 0x40000) != 0x0) {
                s10 = null;
            }
            if ((n7 & 0x80000) != 0x0) {
                surfaceParameters = null;
            }
            if ((n7 & 0x100000) != 0x0) {
                n5 = null;
            }
            if ((n7 & 0x200000) != 0x0) {
                n6 = null;
            }
            this(s, s2, s3, s4, s5, b, n, s6, n2, s7, s8, subheaderIcon, small, (List<String>)instance, orderBy, n3, s9, n4, s10, surfaceParameters, n5, n6);
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof DiscoveryUnitJson)) {
                return false;
            }
            final DiscoveryUnitJson discoveryUnitJson = (DiscoveryUnitJson)o;
            return ah2.f.a((Object)this.a, (Object)discoveryUnitJson.a) && ah2.f.a((Object)this.b, (Object)discoveryUnitJson.b) && ah2.f.a((Object)this.c, (Object)discoveryUnitJson.c) && ah2.f.a((Object)this.d, (Object)discoveryUnitJson.d) && ah2.f.a((Object)this.e, (Object)discoveryUnitJson.e) && this.f == discoveryUnitJson.f && this.g == discoveryUnitJson.g && ah2.f.a((Object)this.h, (Object)discoveryUnitJson.h) && this.i == discoveryUnitJson.i && ah2.f.a((Object)this.j, (Object)discoveryUnitJson.j) && ah2.f.a((Object)this.k, (Object)discoveryUnitJson.k) && this.l == discoveryUnitJson.l && this.m == discoveryUnitJson.m && ah2.f.a((Object)this.n, (Object)discoveryUnitJson.n) && ah2.f.a((Object)this.o, (Object)discoveryUnitJson.o) && ah2.f.a((Object)this.p, (Object)discoveryUnitJson.p) && ah2.f.a((Object)this.q, (Object)discoveryUnitJson.q) && ah2.f.a((Object)this.r, (Object)discoveryUnitJson.r) && ah2.f.a((Object)this.s, (Object)discoveryUnitJson.s) && ah2.f.a((Object)this.t, (Object)discoveryUnitJson.t) && ah2.f.a((Object)this.u, (Object)discoveryUnitJson.u) && ah2.f.a((Object)this.v, (Object)discoveryUnitJson.v);
        }
        
        @Override
        public final int hashCode() {
            final int f = ag0.a.f(this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
            final String e = this.e;
            int hashCode = 0;
            int hashCode2;
            if (e == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = e.hashCode();
            }
            int f2;
            if ((f2 = (this.f ? 1 : 0)) != 0) {
                f2 = 1;
            }
            final int f3 = ag0.a.f(this.j, s0.e(this.i, ag0.a.f(this.h, s0.e(this.g, ((f + hashCode2) * 31 + f2) * 31, 31), 31), 31), 31);
            final String k = this.k;
            int hashCode3;
            if (k == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = k.hashCode();
            }
            final SubheaderIcon l = this.l;
            int hashCode4;
            if (l == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = l.hashCode();
            }
            final int a = a2.b.a((List)this.n, (this.m.hashCode() + ((f3 + hashCode3) * 31 + hashCode4) * 31) * 31, 31);
            final int hashCode5 = this.o.hashCode();
            final Map<String, String> p = this.p;
            int hashCode6;
            if (p == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = p.hashCode();
            }
            final String q = this.q;
            int hashCode7;
            if (q == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = q.hashCode();
            }
            final Integer r = this.r;
            int hashCode8;
            if (r == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = r.hashCode();
            }
            final String s = this.s;
            int hashCode9;
            if (s == null) {
                hashCode9 = 0;
            }
            else {
                hashCode9 = s.hashCode();
            }
            final DiscoveryUnitNetwork.SurfaceParameters t = this.t;
            int hashCode10;
            if (t == null) {
                hashCode10 = 0;
            }
            else {
                hashCode10 = t.hashCode();
            }
            final Integer u = this.u;
            int hashCode11;
            if (u == null) {
                hashCode11 = 0;
            }
            else {
                hashCode11 = u.hashCode();
            }
            final Integer v = this.v;
            if (v != null) {
                hashCode = v.hashCode();
            }
            return (((((((hashCode5 + a) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("DiscoveryUnitJson(unique_id=");
            k.append(this.a);
            k.append(", unit_name=");
            k.append(this.b);
            k.append(", unit_type=");
            k.append(this.c);
            k.append(", surface=");
            k.append(this.d);
            k.append(", url=");
            k.append(this.e);
            k.append(", enabled_for_minimum_app_version=");
            k.append(this.f);
            k.append(", min_app_version=");
            k.append(this.g);
            k.append(", min_app_version_name=");
            k.append(this.h);
            k.append(", index=");
            k.append(this.i);
            k.append(", title=");
            k.append(this.j);
            k.append(", subtitle=");
            k.append(this.k);
            k.append(", subtitle_icon=");
            k.append(this.l);
            k.append(", layout=");
            k.append(this.m);
            k.append(", options=");
            k.append(this.n);
            k.append(", orderBy=");
            k.append(this.o);
            k.append(", parameters=");
            k.append(this.p);
            k.append(", custom_hide_key=");
            k.append(this.q);
            k.append(", versionCode=");
            k.append(this.r);
            k.append(", versionName=");
            k.append(this.s);
            k.append(", surface_parameters=");
            k.append(this.t);
            k.append(", carry_over_from=");
            k.append(this.u);
            k.append(", carry_over_count=");
            return s0.m(k, this.v, ')');
        }
    }
}
