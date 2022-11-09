// 
// Decompiled by Procyon v0.6.0
// 

package de;

import android.os.Parcelable;
import dg.d;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import android.os.Parcelable$Creator;
import sd.a;

public final class w extends a
{
    public static final Parcelable$Creator<w> CREATOR;
    public final Credential f;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    public w(final Credential f) {
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i2 = d.i2(parcel, 20293);
        d.Z1(parcel, 1, (Parcelable)this.f, n);
        d.w2(parcel, i2);
    }
}
