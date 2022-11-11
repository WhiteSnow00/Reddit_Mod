// 
// Decompiled by Procyon v0.6.0
// 

package x82;

import android.os.Parcelable;
import android.os.Parcel;
import al0.g7;
import sg2.e;
import android.os.Parcelable$Creator;

public final class b0 extends r0
{
    public static final Parcelable$Creator<b0> CREATOR;
    public final a f;
    public final p0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    
    static {
        CREATOR = (Parcelable$Creator)new b0$a();
    }
    
    public b0(final a f, final p0 g, final boolean h, final boolean i, final boolean j, final boolean k, final boolean l) {
        e.f((Object)f, "address");
        e.f((Object)g, "completionAction");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final p0 c() {
        return this.g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b0)) {
            return false;
        }
        final b0 b0 = (b0)o;
        return e.a((Object)this.f, (Object)b0.f) && e.a((Object)this.g, (Object)b0.g) && this.h == b0.h && this.i == b0.i && this.j == b0.j && this.k == b0.k && this.l == b0.l;
    }
    
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        final int hashCode2 = this.g.hashCode();
        final int h = this.h ? 1 : 0;
        int n = 1;
        int n2 = h;
        if (h != 0) {
            n2 = 1;
        }
        int i;
        if ((i = (this.i ? 1 : 0)) != 0) {
            i = 1;
        }
        int j;
        if ((j = (this.j ? 1 : 0)) != 0) {
            j = 1;
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        final int l = this.l ? 1 : 0;
        if (l == 0) {
            n = l;
        }
        return (((((hashCode2 + hashCode * 31) * 31 + n2) * 31 + i) * 31 + j) * 31 + k) * 31 + n;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("ProtectVaultState(address=");
        r.append(this.f);
        r.append(", completionAction=");
        r.append(this.g);
        r.append(", forRegistration=");
        r.append(this.h);
        r.append(", showRedditBackup=");
        r.append(this.i);
        r.append(", showManualBackup=");
        r.append(this.j);
        r.append(", allowBack=");
        r.append(this.k);
        r.append(", showSkipButton=");
        return g7.m(r, this.l, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        this.f.writeToParcel(parcel, n);
        parcel.writeParcelable((Parcelable)this.g, n);
        parcel.writeInt((int)(this.h ? 1 : 0));
        parcel.writeInt((int)(this.i ? 1 : 0));
        parcel.writeInt((int)(this.j ? 1 : 0));
        parcel.writeInt((int)(this.k ? 1 : 0));
        parcel.writeInt((int)(this.l ? 1 : 0));
    }
}
