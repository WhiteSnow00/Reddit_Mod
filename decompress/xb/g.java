// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import bd.s;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class g extends b
{
    public static final Parcelable$Creator<g> CREATOR;
    public final long f;
    public final long g;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<g>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new g(parcel.readLong(), parcel.readLong());
            }
            
            public final Object[] newArray(final int n) {
                return new g[n];
            }
        };
    }
    
    public g(final long f, final long g) {
        this.f = f;
        this.g = g;
    }
    
    public static long a(long n, final s s) {
        final long n2 = s.r();
        if ((0x80L & n2) != 0x0L) {
            n = (0x1FFFFFFFFL & ((n2 & 0x1L) << 32 | s.s()) + n);
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
