// 
// Decompiled by Procyon v0.6.0
// 

package ue;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import od.c;
import rd.a;

public final class h extends a implements c
{
    public static final Parcelable$Creator<h> CREATOR;
    public final List<String> f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
    }
    
    public h(final ArrayList f, final String g) {
        this.f = f;
        this.g = g;
    }
    
    public final Status getStatus() {
        if (this.g != null) {
            return Status.k;
        }
        return Status.o;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.x0(parcel, 1, (List)this.f);
        i10.a.w0(parcel, 2, this.g);
        i10.a.G0(parcel, b0);
    }
}
