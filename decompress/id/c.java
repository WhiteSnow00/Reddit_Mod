// 
// Decompiled by Procyon v0.6.0
// 

package id;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import qd.l;
import mg.d0;
import android.net.Uri;
import android.os.Parcelable$Creator;
import rd.a;

public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Uri j;
    public final String k;
    public final String l;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
    }
    
    public c(final String f, final String g, final String h, final String i, final Uri j, final String k, final String l) {
        d0.v(f);
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return qd.l.a((Object)this.f, (Object)c.f) && qd.l.a((Object)this.g, (Object)c.g) && qd.l.a((Object)this.h, (Object)c.h) && qd.l.a((Object)this.i, (Object)c.i) && qd.l.a((Object)this.j, (Object)c.j) && qd.l.a((Object)this.k, (Object)c.k) && qd.l.a((Object)this.l, (Object)c.l);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i, this.j, this.k, this.l });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 1, this.f);
        i10.a.w0(parcel, 2, this.g);
        i10.a.w0(parcel, 3, this.h);
        i10.a.w0(parcel, 4, this.i);
        i10.a.v0(parcel, 5, (Parcelable)this.j, n);
        i10.a.w0(parcel, 6, this.k);
        i10.a.w0(parcel, 7, this.l);
        i10.a.G0(parcel, b0);
    }
}
