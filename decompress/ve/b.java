// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import android.os.Parcelable;
import dg.d;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.content.Intent;
import android.os.Parcelable$Creator;
import pd.c;
import sd.a;

public final class b extends a implements c
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int f;
    public int g;
    public Intent h;
    
    static {
        CREATOR = (Parcelable$Creator)new ve.c();
    }
    
    public b() {
        this(2, 0, null);
    }
    
    public b(final int f, final int g, final Intent h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Status getStatus() {
        if (this.g == 0) {
            return Status.k;
        }
        return Status.o;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, this.f);
        d.T1(parcel, 2, this.g);
        d.Z1(parcel, 3, (Parcelable)this.h, n);
        d.w2(parcel, i2);
    }
}
