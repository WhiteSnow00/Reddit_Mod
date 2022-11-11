// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import a92.b;
import android.os.Parcel;
import com.google.android.gms.common.internal.MethodInvocation;
import java.util.List;
import android.os.Parcelable$Creator;
import qd.a;

public final class q extends a
{
    public static final Parcelable$Creator<q> CREATOR;
    public final int f;
    public List<MethodInvocation> g;
    
    static {
        CREATOR = (Parcelable$Creator)new u();
    }
    
    public q(final int f, final List<MethodInvocation> g) {
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, int y0) {
        y0 = b.y0(parcel, 20293);
        b.p0(parcel, 1, this.f);
        b.w0(parcel, 2, (List)this.g);
        b.D0(parcel, y0);
    }
}
