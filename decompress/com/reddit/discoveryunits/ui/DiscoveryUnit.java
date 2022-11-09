// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import java.util.Iterator;
import android.os.Parcel;
import a2.b;
import androidx.appcompat.widget.s0;
import ge0.a0$a;
import kotlin.collections.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.discoveryunits.data.OrderType;
import kotlin.collections.EmptyList;
import com.reddit.discoveryunits.domain.AppVersionNameConverter;
import ah2.f;
import com.reddit.discoveryunits.data.DiscoveryUnitNetwork;
import java.util.Map;
import com.reddit.discoveryunits.data.OrderBy;
import java.util.List;
import com.reddit.discoveryunits.ui.carousel.CarouselItemLayout;
import com.reddit.discoveryunits.ui.carousel.SubheaderIcon;
import android.os.Parcelable$Creator;
import yi0.a;
import android.os.Parcelable;

public final class DiscoveryUnit implements Parcelable, yi0.a
{
    public static final Parcelable$Creator<DiscoveryUnit> CREATOR;
    public final Integer A;
    public boolean B;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final int l;
    public final String m;
    public final int n;
    public final String o;
    public final String p;
    public final SubheaderIcon q;
    public final CarouselItemLayout r;
    public final List<String> s;
    public final OrderBy t;
    public final Map<String, String> u;
    public final String v;
    public final int w;
    public final String x;
    public final DiscoveryUnitNetwork.SurfaceParameters y;
    public final Integer z;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public DiscoveryUnit(final String f, final String g, final String h, final String i, final String j, final boolean k, int l, final String m, final int n, final String o, final String p22, final SubheaderIcon q, final CarouselItemLayout r, final List<String> s, final OrderBy t, final Map<String, String> u, final String v, final int w, final String x, final DiscoveryUnitNetwork.SurfaceParameters y, final Integer z, final Integer a) {
        ah2.f.f((Object)f, "unique_id");
        ah2.f.f((Object)g, "unit_name");
        ah2.f.f((Object)h, "unit_type");
        ah2.f.f((Object)i, "surface");
        ah2.f.f((Object)m, "min_app_version_name");
        ah2.f.f((Object)o, "title");
        ah2.f.f((Object)r, "layout");
        ah2.f.f((Object)s, "options");
        ah2.f.f((Object)t, "orderBy");
        ah2.f.f((Object)x, "versionName");
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
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        final boolean b = true;
        boolean b2 = false;
        Label_0246: {
            if (k) {
                if (AppVersionNameConverter.a(m) <= AppVersionNameConverter.a(x)) {
                    l = 1;
                }
                else {
                    l = 0;
                }
                if (l != 0) {
                    b2 = b;
                    break Label_0246;
                }
            }
            b2 = false;
        }
        this.B = b2;
    }
    
    public DiscoveryUnit(String s, String s2, String s3, String s4, List instance, final int n, final String s5, final int n2) {
        String s6 = "";
        if ((n2 & 0x1) != 0x0) {
            s = "";
        }
        if ((n2 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n2 & 0x4) != 0x0) {
            s3 = "";
        }
        String s7;
        if ((n2 & 0x8) != 0x0) {
            s7 = "";
        }
        else {
            s7 = null;
        }
        int n3 = 0;
        int n4;
        if ((n2 & 0x40) != 0x0) {
            n4 = Integer.MAX_VALUE;
        }
        else {
            n4 = 0;
        }
        String s8;
        if ((n2 & 0x80) != 0x0) {
            s8 = "99.99.99";
        }
        else {
            s8 = null;
        }
        if ((n2 & 0x100) != 0x0) {
            n3 = -1;
        }
        if ((n2 & 0x200) != 0x0) {
            s4 = "";
        }
        if ((n2 & 0x400) == 0x0) {
            s6 = null;
        }
        CarouselItemLayout small;
        if ((n2 & 0x1000) != 0x0) {
            small = CarouselItemLayout.SMALL;
        }
        else {
            small = null;
        }
        if ((n2 & 0x2000) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        OrderBy orderBy;
        if ((n2 & 0x4000) != 0x0) {
            orderBy = new OrderBy(0, 0, n3, OrderType.INDEX, 3, null);
        }
        else {
            orderBy = null;
        }
        Map n5;
        if ((n2 & 0x8000) != 0x0) {
            n5 = c.N1();
        }
        else {
            n5 = null;
        }
        this(s, s2, s3, s7, null, false, n4, s8, n3, s4, s6, null, small, (List<String>)instance, orderBy, n5, null, n, s5, null, null, null);
    }
    
    public static DiscoveryUnit a(final DiscoveryUnit discoveryUnit, CarouselItemLayout r, List s, OrderBy t, String v, final int n) {
        String f;
        if ((n & 0x1) != 0x0) {
            f = discoveryUnit.f;
        }
        else {
            f = null;
        }
        String g;
        if ((n & 0x2) != 0x0) {
            g = discoveryUnit.g;
        }
        else {
            g = null;
        }
        String h;
        if ((n & 0x4) != 0x0) {
            h = discoveryUnit.h;
        }
        else {
            h = null;
        }
        String i;
        if ((n & 0x8) != 0x0) {
            i = discoveryUnit.i;
        }
        else {
            i = null;
        }
        String j;
        if ((n & 0x10) != 0x0) {
            j = discoveryUnit.j;
        }
        else {
            j = null;
        }
        final boolean b = (n & 0x20) != 0x0 && discoveryUnit.k;
        int l;
        if ((n & 0x40) != 0x0) {
            l = discoveryUnit.l;
        }
        else {
            l = 0;
        }
        String m;
        if ((n & 0x80) != 0x0) {
            m = discoveryUnit.m;
        }
        else {
            m = null;
        }
        int n2;
        if ((n & 0x100) != 0x0) {
            n2 = discoveryUnit.n;
        }
        else {
            n2 = 0;
        }
        String o;
        if ((n & 0x200) != 0x0) {
            o = discoveryUnit.o;
        }
        else {
            o = null;
        }
        String p6;
        if ((n & 0x400) != 0x0) {
            p6 = discoveryUnit.p;
        }
        else {
            p6 = null;
        }
        SubheaderIcon q;
        if ((n & 0x800) != 0x0) {
            q = discoveryUnit.q;
        }
        else {
            q = null;
        }
        if ((n & 0x1000) != 0x0) {
            r = discoveryUnit.r;
        }
        if ((n & 0x2000) != 0x0) {
            s = discoveryUnit.s;
        }
        if ((n & 0x4000) != 0x0) {
            t = discoveryUnit.t;
        }
        Map<String, String> u;
        if ((n & 0x8000) != 0x0) {
            u = discoveryUnit.u;
        }
        else {
            u = null;
        }
        if ((0x10000 & n) != 0x0) {
            v = discoveryUnit.v;
        }
        int w;
        if ((0x20000 & n) != 0x0) {
            w = discoveryUnit.w;
        }
        else {
            w = 0;
        }
        String x;
        if ((0x40000 & n) != 0x0) {
            x = discoveryUnit.x;
        }
        else {
            x = null;
        }
        DiscoveryUnitNetwork.SurfaceParameters y;
        if ((n & 0x80000) != 0x0) {
            y = discoveryUnit.y;
        }
        else {
            y = null;
        }
        Integer z;
        if ((0x100000 & n) != 0x0) {
            z = discoveryUnit.z;
        }
        else {
            z = null;
        }
        Integer a;
        if ((n & 0x200000) != 0x0) {
            a = discoveryUnit.A;
        }
        else {
            a = null;
        }
        ah2.f.f((Object)f, "unique_id");
        ah2.f.f((Object)g, "unit_name");
        ah2.f.f((Object)h, "unit_type");
        ah2.f.f((Object)i, "surface");
        ah2.f.f((Object)m, "min_app_version_name");
        ah2.f.f((Object)o, "title");
        ah2.f.f((Object)r, "layout");
        ah2.f.f((Object)s, "options");
        ah2.f.f((Object)t, "orderBy");
        ah2.f.f((Object)x, "versionName");
        return new DiscoveryUnit(f, g, h, i, j, b, l, m, n2, o, p6, q, r, s, t, u, v, w, x, y, z, a);
    }
    
    public static a0$a b(final DiscoveryUnit discoveryUnit) {
        return new a0$a(discoveryUnit.i, discoveryUnit.f, "");
    }
    
    public final String c() {
        return this.h;
    }
    
    public final String d() {
        return this.f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final String e() {
        return this.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryUnit)) {
            return false;
        }
        final DiscoveryUnit discoveryUnit = (DiscoveryUnit)o;
        return ah2.f.a((Object)this.f, (Object)discoveryUnit.f) && ah2.f.a((Object)this.g, (Object)discoveryUnit.g) && ah2.f.a((Object)this.h, (Object)discoveryUnit.h) && ah2.f.a((Object)this.i, (Object)discoveryUnit.i) && ah2.f.a((Object)this.j, (Object)discoveryUnit.j) && this.k == discoveryUnit.k && this.l == discoveryUnit.l && ah2.f.a((Object)this.m, (Object)discoveryUnit.m) && this.n == discoveryUnit.n && ah2.f.a((Object)this.o, (Object)discoveryUnit.o) && ah2.f.a((Object)this.p, (Object)discoveryUnit.p) && this.q == discoveryUnit.q && this.r == discoveryUnit.r && ah2.f.a((Object)this.s, (Object)discoveryUnit.s) && ah2.f.a((Object)this.t, (Object)discoveryUnit.t) && ah2.f.a((Object)this.u, (Object)discoveryUnit.u) && ah2.f.a((Object)this.v, (Object)discoveryUnit.v) && this.w == discoveryUnit.w && ah2.f.a((Object)this.x, (Object)discoveryUnit.x) && ah2.f.a((Object)this.y, (Object)discoveryUnit.y) && ah2.f.a((Object)this.z, (Object)discoveryUnit.z) && ah2.f.a((Object)this.A, (Object)discoveryUnit.A);
    }
    
    public final ModelType f() {
        final String h = this.h;
        switch (h) {
            case "trending_searches": {
                return ModelType.TRENDING_SEARCHES;
            }
            case "listing": {
                return ModelType.LINK;
            }
            case "favorite_subreddits": {
                return ModelType.SUBREDDIT;
            }
            case "top_subreddits": {
                return ModelType.SUBREDDIT;
            }
            case "recently_visited_subreddits": {
                return ModelType.SUBREDDIT;
            }
            case "subreddit_listing": {
                return ModelType.SUBREDDIT;
            }
            default:
                break;
        }
        return ModelType.UNKNOWN;
    }
    
    public final String getTitle() {
        return this.o;
    }
    
    public final boolean h() {
        return ah2.f.a((Object)this.f, (Object)"xd_21");
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.i, ag0.a.f(this.h, ag0.a.f(this.g, this.f.hashCode() * 31, 31), 31), 31);
        final String j = this.j;
        int hashCode = 0;
        int hashCode2;
        if (j == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = j.hashCode();
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        final int f2 = ag0.a.f(this.o, s0.e(this.n, ag0.a.f(this.m, s0.e(this.l, ((f + hashCode2) * 31 + k) * 31, 31), 31), 31), 31);
        final String p = this.p;
        int hashCode3;
        if (p == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = p.hashCode();
        }
        final SubheaderIcon q = this.q;
        int hashCode4;
        if (q == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = q.hashCode();
        }
        final int a = b.a((List)this.s, (this.r.hashCode() + ((f2 + hashCode3) * 31 + hashCode4) * 31) * 31, 31);
        final int hashCode5 = this.t.hashCode();
        final Map<String, String> u = this.u;
        int hashCode6;
        if (u == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = u.hashCode();
        }
        final String v = this.v;
        int hashCode7;
        if (v == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = v.hashCode();
        }
        final int f3 = ag0.a.f(this.x, s0.e(this.w, (((hashCode5 + a) * 31 + hashCode6) * 31 + hashCode7) * 31, 31), 31);
        final DiscoveryUnitNetwork.SurfaceParameters y = this.y;
        int hashCode8;
        if (y == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = y.hashCode();
        }
        final Integer z = this.z;
        int hashCode9;
        if (z == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = z.hashCode();
        }
        final Integer a2 = this.A;
        if (a2 != null) {
            hashCode = a2.hashCode();
        }
        return ((f3 + hashCode8) * 31 + hashCode9) * 31 + hashCode;
    }
    
    public final boolean j() {
        return ah2.f.a((Object)this.h, (Object)"top_subreddits");
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DiscoveryUnit(unique_id=");
        k.append(this.f);
        k.append(", unit_name=");
        k.append(this.g);
        k.append(", unit_type=");
        k.append(this.h);
        k.append(", surface=");
        k.append(this.i);
        k.append(", url=");
        k.append(this.j);
        k.append(", enabled_for_minimum_app_version=");
        k.append(this.k);
        k.append(", min_app_version=");
        k.append(this.l);
        k.append(", min_app_version_name=");
        k.append(this.m);
        k.append(", index=");
        k.append(this.n);
        k.append(", title=");
        k.append(this.o);
        k.append(", subtitle=");
        k.append(this.p);
        k.append(", subtitle_icon=");
        k.append(this.q);
        k.append(", layout=");
        k.append(this.r);
        k.append(", options=");
        k.append(this.s);
        k.append(", orderBy=");
        k.append(this.t);
        k.append(", parameters=");
        k.append(this.u);
        k.append(", custom_hide_key=");
        k.append(this.v);
        k.append(", versionCode=");
        k.append(this.w);
        k.append(", versionName=");
        k.append(this.x);
        k.append(", surface_parameters=");
        k.append(this.y);
        k.append(", carry_over_from=");
        k.append(this.z);
        k.append(", carry_over_count=");
        return s0.m(k, this.A, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ah2.f.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt((int)(this.k ? 1 : 0));
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        final SubheaderIcon q = this.q;
        if (q == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(q.name());
        }
        parcel.writeString(this.r.name());
        parcel.writeStringList((List)this.s);
        parcel.writeParcelable((Parcelable)this.t, n);
        final Map<String, String> u = this.u;
        if (u == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(u.size());
            for (final Map.Entry<String, V> entry : u.entrySet()) {
                parcel.writeString((String)entry.getKey());
                parcel.writeString((String)entry.getValue());
            }
        }
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeParcelable((Parcelable)this.y, n);
        final Integer z = this.z;
        if (z == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, z);
        }
        final Integer a = this.A;
        if (a == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, a);
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/discoveryunits/ui/DiscoveryUnit$ModelType;", "", "(Ljava/lang/String;I)V", "LINK", "SUBREDDIT", "TRENDING_SEARCHES", "CATEGORIES", "UNKNOWN", "ui_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum ModelType
    {
        CATEGORIES, 
        LINK, 
        SUBREDDIT, 
        TRENDING_SEARCHES, 
        UNKNOWN;
    }
    
    public static final class a implements Parcelable$Creator<DiscoveryUnit>
    {
        public final Object createFromParcel(final Parcel parcel) {
            ah2.f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            final boolean b = parcel.readInt() != 0;
            final int int1 = parcel.readInt();
            final String string6 = parcel.readString();
            final int int2 = parcel.readInt();
            final String string7 = parcel.readString();
            final String string8 = parcel.readString();
            SubheaderIcon value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = SubheaderIcon.valueOf(parcel.readString());
            }
            final CarouselItemLayout value2 = CarouselItemLayout.valueOf(parcel.readString());
            final ArrayList stringArrayList = parcel.createStringArrayList();
            final OrderBy orderBy = (OrderBy)parcel.readParcelable(DiscoveryUnit.class.getClassLoader());
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            }
            else {
                final int int3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap<String, String>(int3);
                for (int i = 0; i != int3; ++i) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            final String string9 = parcel.readString();
            final int int4 = parcel.readInt();
            final String string10 = parcel.readString();
            final DiscoveryUnitNetwork.SurfaceParameters surfaceParameters = (DiscoveryUnitNetwork.SurfaceParameters)parcel.readParcelable(DiscoveryUnit.class.getClassLoader());
            Integer value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readInt();
            }
            Integer value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = parcel.readInt();
            }
            return new DiscoveryUnit(string, string2, string3, string4, string5, b, int1, string6, int2, string7, string8, value, value2, stringArrayList, orderBy, (Map<String, String>)linkedHashMap, string9, int4, string10, surfaceParameters, value3, value4);
        }
        
        public final Object[] newArray(final int n) {
            return new DiscoveryUnit[n];
        }
    }
}
