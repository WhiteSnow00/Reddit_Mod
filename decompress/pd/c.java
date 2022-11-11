// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import a92.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qd.a;

public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    public final int f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new t();
    }
    
    public c(final int f, final String g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return c.f == this.f && m.a((Object)c.g, (Object)this.g);
    }
    
    @Override
    public final int hashCode() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        final int f = this.f;
        final String g = this.g;
        final StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 12);
        sb.append(f);
        sb.append(":");
        sb.append(g);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int y0) {
        y0 = b.y0(parcel, 20293);
        b.p0(parcel, 1, this.f);
        b.t0(parcel, 2, this.g);
        b.D0(parcel, y0);
    }
}
