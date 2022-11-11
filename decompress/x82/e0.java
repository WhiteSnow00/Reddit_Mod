// 
// Decompiled by Procyon v0.6.0
// 

package x82;

import android.os.Parcelable;
import android.os.Parcel;
import sg2.e;
import android.os.Parcelable$Creator;

public final class e0 extends r0
{
    public static final Parcelable$Creator<e0> CREATOR;
    public final p0 f;
    
    static {
        CREATOR = (Parcelable$Creator)new e0$a();
    }
    
    public e0(final p0 f) {
        e.f((Object)f, "completionAction");
        this.f = f;
    }
    
    public final p0 c() {
        return this.f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e0 && e.a((Object)this.f, (Object)((e0)o).f));
    }
    
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final String toString() {
        final StringBuilder r = a.r("SecureVaultState(completionAction=");
        r.append(this.f);
        r.append(')');
        return r.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeParcelable((Parcelable)this.f, n);
    }
}
