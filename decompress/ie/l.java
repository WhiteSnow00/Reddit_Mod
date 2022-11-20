// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collections;
import com.google.android.gms.location.LocationRequest;
import qd.c;
import java.util.List;
import android.os.Parcelable$Creator;
import rd.a;

public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    public static final List<c> m;
    public LocationRequest f;
    public List<c> g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    
    static {
        m = Collections.emptyList();
        CREATOR = (Parcelable$Creator)new m();
    }
    
    public l(final LocationRequest f, final List<c> g, final String h, final boolean i, final boolean j, final boolean k, final String l) {
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
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return qd.l.a((Object)this.f, (Object)l.f) && qd.l.a((Object)this.g, (Object)l.g) && qd.l.a((Object)this.h, (Object)l.h) && this.i == l.i && this.j == l.j && this.k == l.k && qd.l.a((Object)this.l, (Object)l.l);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        if (this.h != null) {
            sb.append(" tag=");
            sb.append(this.h);
        }
        if (this.l != null) {
            sb.append(" moduleId=");
            sb.append(this.l);
        }
        sb.append(" hideAppOps=");
        sb.append(this.i);
        sb.append(" clients=");
        sb.append(this.g);
        sb.append(" forceCoarseLocation=");
        sb.append(this.j);
        if (this.k) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 1, (Parcelable)this.f, n);
        i10.a.z0(parcel, 5, (List)this.g);
        i10.a.w0(parcel, 6, this.h);
        i10.a.p0(parcel, 7, this.i);
        i10.a.p0(parcel, 8, this.j);
        i10.a.p0(parcel, 9, this.k);
        i10.a.w0(parcel, 10, this.l);
        i10.a.G0(parcel, b0);
    }
}
