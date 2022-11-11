// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Parcelable;
import a92.b;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import qd.a;

public final class j0 extends a
{
    public static final Parcelable$Creator<j0> CREATOR;
    public final int f;
    public final Account g;
    public final int h;
    public final GoogleSignInAccount i;
    
    static {
        CREATOR = (Parcelable$Creator)new k0();
    }
    
    public j0(final int f, final Account g, final int h, final GoogleSignInAccount i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int y0 = b.y0(parcel, 20293);
        b.p0(parcel, 1, this.f);
        b.s0(parcel, 2, (Parcelable)this.g, n);
        b.p0(parcel, 3, this.h);
        b.s0(parcel, 4, (Parcelable)this.i, n);
        b.D0(parcel, y0);
    }
}
