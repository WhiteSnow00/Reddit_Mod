// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import android.os.Parcel;
import bd.t;
import android.os.Parcelable$Creator;

public final class g extends b
{
    public static final Parcelable$Creator<g> CREATOR;
    public final long f;
    public final long g;
    
    static {
        CREATOR = (Parcelable$Creator)new g$a();
    }
    
    public g(final long f, final long g) {
        this.f = f;
        this.g = g;
    }
    
    public static long a(long n, final t t) {
        final long n2 = t.r();
        if ((0x80L & n2) != 0x0L) {
            n = (0x1FFFFFFFFL & ((n2 & 0x1L) << 32 | t.s()) + n);
        }
        else {
            n = -9223372036854775807L;
        }
        return n;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
    }
}
