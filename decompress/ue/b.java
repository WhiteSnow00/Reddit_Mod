// 
// Decompiled by Procyon v0.6.0
// 

package ue;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.content.Intent;
import android.os.Parcelable$Creator;
import od.c;
import rd.a;

public final class b extends a implements c
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int f;
    public int g;
    public Intent h;
    
    static {
        CREATOR = (Parcelable$Creator)new ue.c();
    }
    
    public b() {
        this(2, 0, null);
    }
    
    public b(final int f, final int g, final Intent h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final Status getStatus() {
        if (this.g == 0) {
            return Status.k;
        }
        return Status.o;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.s0(parcel, 1, this.f);
        i10.a.s0(parcel, 2, this.g);
        i10.a.v0(parcel, 3, (Parcelable)this.h, n);
        i10.a.G0(parcel, b0);
    }
}
