// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Parcel;
import lw0.b;
import android.os.Parcelable$Creator;
import qd.a;

public final class t extends a
{
    public static final Parcelable$Creator<t> CREATOR;
    public final String f;
    public final r g;
    public final String h;
    public final long i;
    
    static {
        CREATOR = (Parcelable$Creator)new u();
    }
    
    public t(final String f, final r g, final String h, final long i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public t(final t t, final long i) {
        b.R((Object)t);
        this.f = t.f;
        this.g = t.g;
        this.h = t.h;
        this.i = i;
    }
    
    @Override
    public final String toString() {
        final String h = this.h;
        final String f = this.f;
        final String value = String.valueOf(this.g);
        final StringBuilder r = d.r("origin=", h, ",name=", f, ",params=");
        r.append(value);
        return r.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        u.a(this, parcel, n);
    }
}
