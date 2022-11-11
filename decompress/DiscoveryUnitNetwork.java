// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.discoveryunits.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Iterator;
import android.os.Parcel;
import a2.b;
import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.collections.c;
import kotlin.collections.EmptyList;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Map;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/discoveryunits/data/DiscoveryUnitNetwork;", "Landroid/os/Parcelable;", "SurfaceParameters", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class DiscoveryUnitNetwork implements Parcelable
{
    public static final Parcelable$Creator<DiscoveryUnitNetwork> CREATOR;
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
    public final SubheaderIconNetwork q;
    public final CarouselItemLayoutNetwork r;
    public final List<String> s;
    public final OrderBy t;
    public final Map<String, String> u;
    public final String v;
    public final SurfaceParameters w;
    public final Integer x;
    public final Integer y;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public DiscoveryUnitNetwork() {
        this(null, null, null, null, null, false, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }
    
    public DiscoveryUnitNetwork(final String f, final String g, final String h, final String i, final String j, final boolean k, final int l, final String m, final int n, final String o, final String p20, final SubheaderIconNetwork q, final CarouselItemLayoutNetwork r, final List<String> s, final OrderBy t, final Map<String, String> u, final String v, final SurfaceParameters w, final Integer x, final Integer y) {
        ah2.f.f((Object)f, "unique_id");
        ah2.f.f((Object)g, "unit_name");
        ah2.f.f((Object)h, "unit_type");
        ah2.f.f((Object)i, "surface");
        ah2.f.f((Object)m, "min_app_version_name");
        ah2.f.f((Object)o, "title");
        ah2.f.f((Object)r, "layout");
        ah2.f.f((Object)s, "options");
        ah2.f.f((Object)t, "orderBy");
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
        this.p = p20;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public DiscoveryUnitNetwork(String s, String s2, String s3, String s4, String s5, boolean b, int n, String s6, int n2, String s7, String s8, SubheaderIconNetwork subheaderIconNetwork, CarouselItemLayoutNetwork small, List instance, OrderBy orderBy, Map n3, String s9, SurfaceParameters surfaceParameters, Integer n4, Integer n5, final int n6, final DefaultConstructorMarker defaultConstructorMarker) {
        final String s10 = "";
        if ((n6 & 0x1) != 0x0) {
            s = "";
        }
        if ((n6 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n6 & 0x4) != 0x0) {
            s3 = "";
        }
        if ((n6 & 0x8) != 0x0) {
            s4 = "";
        }
        if ((n6 & 0x10) != 0x0) {
            s5 = null;
        }
        if ((n6 & 0x20) != 0x0) {
            b = false;
        }
        if ((n6 & 0x40) != 0x0) {
            n = Integer.MAX_VALUE;
        }
        if ((n6 & 0x80) != 0x0) {
            s6 = "99.99.99";
        }
        if ((n6 & 0x100) != 0x0) {
            n2 = -1;
        }
        if ((n6 & 0x200) != 0x0) {
            s7 = "";
        }
        if ((n6 & 0x400) != 0x0) {
            s8 = s10;
        }
        if ((n6 & 0x800) != 0x0) {
            subheaderIconNetwork = null;
        }
        if ((n6 & 0x1000) != 0x0) {
            small = CarouselItemLayoutNetwork.SMALL;
        }
        if ((n6 & 0x2000) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n6 & 0x4000) != 0x0) {
            orderBy = new OrderBy(0, 0, n2, OrderType.INDEX, 3, null);
        }
        if ((n6 & 0x8000) != 0x0) {
            n3 = c.N1();
        }
        if ((n6 & 0x10000) != 0x0) {
            s9 = null;
        }
        if ((n6 & 0x20000) != 0x0) {
            surfaceParameters = null;
        }
        if ((n6 & 0x40000) != 0x0) {
            n4 = null;
        }
        if ((n6 & 0x80000) != 0x0) {
            n5 = null;
        }
        this(s, s2, s3, s4, s5, b, n, s6, n2, s7, s8, subheaderIconNetwork, small, (List<String>)instance, orderBy, n3, s9, surfaceParameters, n4, n5);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryUnitNetwork)) {
            return false;
        }
        final DiscoveryUnitNetwork discoveryUnitNetwork = (DiscoveryUnitNetwork)o;
        return ah2.f.a((Object)this.f, (Object)discoveryUnitNetwork.f) && ah2.f.a((Object)this.g, (Object)discoveryUnitNetwork.g) && ah2.f.a((Object)this.h, (Object)discoveryUnitNetwork.h) && ah2.f.a((Object)this.i, (Object)discoveryUnitNetwork.i) && ah2.f.a((Object)this.j, (Object)discoveryUnitNetwork.j) && this.k == discoveryUnitNetwork.k && this.l == discoveryUnitNetwork.l && ah2.f.a((Object)this.m, (Object)discoveryUnitNetwork.m) && this.n == discoveryUnitNetwork.n && ah2.f.a((Object)this.o, (Object)discoveryUnitNetwork.o) && ah2.f.a((Object)this.p, (Object)discoveryUnitNetwork.p) && this.q == discoveryUnitNetwork.q && this.r == discoveryUnitNetwork.r && ah2.f.a((Object)this.s, (Object)discoveryUnitNetwork.s) && ah2.f.a((Object)this.t, (Object)discoveryUnitNetwork.t) && ah2.f.a((Object)this.u, (Object)discoveryUnitNetwork.u) && ah2.f.a((Object)this.v, (Object)discoveryUnitNetwork.v) && ah2.f.a((Object)this.w, (Object)discoveryUnitNetwork.w) && ah2.f.a((Object)this.x, (Object)discoveryUnitNetwork.x) && ah2.f.a((Object)this.y, (Object)discoveryUnitNetwork.y);
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
        final SubheaderIconNetwork q = this.q;
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
        final SurfaceParameters w = this.w;
        int hashCode8;
        if (w == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = w.hashCode();
        }
        final Integer x = this.x;
        int hashCode9;
        if (x == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = x.hashCode();
        }
        final Integer y = this.y;
        if (y != null) {
            hashCode = y.hashCode();
        }
        return (((((hashCode5 + a) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DiscoveryUnitNetwork(unique_id=");
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
        k.append(", surface_parameters=");
        k.append(this.w);
        k.append(", carry_over_from=");
        k.append(this.x);
        k.append(", carry_over_count=");
        return s0.m(k, this.y, ')');
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
        final SubheaderIconNetwork q = this.q;
        if (q == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(q.name());
        }
        parcel.writeString(this.r.name());
        parcel.writeStringList((List)this.s);
        this.t.writeToParcel(parcel, n);
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
        final SurfaceParameters w = this.w;
        if (w == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            w.writeToParcel(parcel, n);
        }
        final Integer x = this.x;
        if (x == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, x);
        }
        final Integer y = this.y;
        if (y == null) {
            parcel.writeInt(0);
        }
        else {
            ag0.a.x(parcel, 1, y);
        }
    }
    
    @o(generateAdapter = true)
    @Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/discoveryunits/data/DiscoveryUnitNetwork$SurfaceParameters;", "Landroid/os/Parcelable;", "data_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class SurfaceParameters implements Parcelable
    {
        public static final Parcelable$Creator<SurfaceParameters> CREATOR;
        public final Boolean f;
        
        static {
            CREATOR = (Parcelable$Creator)new a();
        }
        
        public SurfaceParameters() {
            this(null, 1, null);
        }
        
        public SurfaceParameters(final Boolean f) {
            this.f = f;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof SurfaceParameters && ah2.f.a((Object)this.f, (Object)((SurfaceParameters)o).f));
        }
        
        @Override
        public final int hashCode() {
            final Boolean f = this.f;
            int hashCode;
            if (f == null) {
                hashCode = 0;
            }
            else {
                hashCode = f.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return d.m(a.k("SurfaceParameters(show_if_subscribed="), this.f, ')');
        }
        
        public final void writeToParcel(final Parcel parcel, int booleanValue) {
            ah2.f.f((Object)parcel, "out");
            final Boolean f = this.f;
            if (f == null) {
                booleanValue = 0;
            }
            else {
                parcel.writeInt(1);
                booleanValue = (((boolean)f) ? 1 : 0);
            }
            parcel.writeInt(booleanValue);
        }
        
        public static final class a implements Parcelable$Creator<SurfaceParameters>
        {
            public final Object createFromParcel(final Parcel parcel) {
                ah2.f.f((Object)parcel, "parcel");
                Boolean value;
                if (parcel.readInt() == 0) {
                    value = null;
                }
                else {
                    value = (parcel.readInt() != 0);
                }
                return new SurfaceParameters(value);
            }
            
            public final Object[] newArray(final int n) {
                return new SurfaceParameters[n];
            }
        }
    }
    
    public static final class a implements Parcelable$Creator<DiscoveryUnitNetwork>
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
            SubheaderIconNetwork value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = SubheaderIconNetwork.valueOf(parcel.readString());
            }
            final CarouselItemLayoutNetwork value2 = CarouselItemLayoutNetwork.valueOf(parcel.readString());
            final ArrayList stringArrayList = parcel.createStringArrayList();
            final OrderBy orderBy = (OrderBy)OrderBy.CREATOR.createFromParcel(parcel);
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
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = SurfaceParameters.CREATOR.createFromParcel(parcel);
            }
            final SurfaceParameters surfaceParameters = (SurfaceParameters)fromParcel;
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
            return new DiscoveryUnitNetwork(string, string2, string3, string4, string5, b, int1, string6, int2, string7, string8, value, value2, stringArrayList, orderBy, (Map<String, String>)linkedHashMap, string9, surfaceParameters, value3, value4);
        }
        
        public final Object[] newArray(final int n) {
            return new DiscoveryUnitNetwork[n];
        }
    }
}
