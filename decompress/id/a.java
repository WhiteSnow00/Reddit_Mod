// 
// Decompiled by Procyon v0.6.0
// 

package id;

import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import qd.l;
import mg.d0;
import android.os.Parcelable$Creator;

public final class a extends rd.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final c f;
    public final b g;
    public final String h;
    public final boolean i;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    public a(final c f, final b g, final String h, final boolean i) {
        d0.y((Object)f);
        this.f = f;
        d0.y((Object)g);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return l.a((Object)this.f, (Object)a.f) && l.a((Object)this.g, (Object)a.g) && l.a((Object)this.h, (Object)a.h) && this.i == a.i;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 1, (Parcelable)this.f, n);
        i10.a.v0(parcel, 2, (Parcelable)this.g, n);
        i10.a.w0(parcel, 3, this.h);
        i10.a.p0(parcel, 4, this.i);
        i10.a.G0(parcel, b0);
    }
    
    public static final class b extends a
    {
        public static final Parcelable$Creator<b> CREATOR;
        public final boolean f;
        public final String g;
        public final String h;
        public final boolean i;
        public final String j;
        public final ArrayList k;
        
        static {
            CREATOR = (Parcelable$Creator)new f();
        }
        
        public b(final String g, final String h, final String j, final ArrayList list, final boolean f, final boolean i) {
            this.f = f;
            if (f && g == null) {
                throw new NullPointerException("serverClientId must be provided if Google ID tokens are requested");
            }
            this.g = g;
            this.h = h;
            this.i = i;
            ArrayList k;
            if (list != null && !list.isEmpty()) {
                k = new ArrayList(list);
                Collections.sort((List<Comparable>)k);
            }
            else {
                k = null;
            }
            this.k = k;
            this.j = j;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.f == b.f && l.a((Object)this.g, (Object)b.g) && l.a((Object)this.h, (Object)b.h) && this.i == b.i && l.a((Object)this.j, (Object)b.j) && l.a((Object)this.k, (Object)b.k);
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i, this.j, this.k });
        }
        
        public final void writeToParcel(final Parcel parcel, int b0) {
            b0 = i10.a.B0(parcel, 20293);
            i10.a.p0(parcel, 1, this.f);
            i10.a.w0(parcel, 2, this.g);
            i10.a.w0(parcel, 3, this.h);
            i10.a.p0(parcel, 4, this.i);
            i10.a.w0(parcel, 5, this.j);
            i10.a.x0(parcel, 6, (List)this.k);
            i10.a.G0(parcel, b0);
        }
    }
    
    public static final class c extends a
    {
        public static final Parcelable$Creator<c> CREATOR;
        public final boolean f;
        
        static {
            CREATOR = (Parcelable$Creator)new h();
        }
        
        public c(final boolean f) {
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return o instanceof c && this.f == ((c)o).f;
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(new Object[] { this.f });
        }
        
        public final void writeToParcel(final Parcel parcel, int b0) {
            b0 = i10.a.B0(parcel, 20293);
            i10.a.p0(parcel, 1, this.f);
            i10.a.G0(parcel, b0);
        }
    }
}
