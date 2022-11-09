// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import dg.d;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import pd.c;
import sd.a;

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
    
    @Override
    public final Status getStatus() {
        if (this.g != null) {
            return Status.k;
        }
        return Status.o;
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = d.i2(parcel, 20293);
        d.f2(parcel, 1, (List)this.f);
        d.b2(parcel, 2, this.g);
        d.w2(parcel, i2);
    }
}
