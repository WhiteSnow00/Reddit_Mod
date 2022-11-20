// 
// Decompiled by Procyon v0.6.0
// 

package j92;

import android.os.Parcel;
import ng2.e;
import com.reddit.vault.model.vault.Web3Keyfile;
import e92.a;
import android.os.Parcelable$Creator;

public final class l extends g
{
    public static final Parcelable$Creator<l> CREATOR;
    public final a f;
    public final Web3Keyfile g;
    
    static {
        CREATOR = (Parcelable$Creator)new l$a();
    }
    
    public l(final a f, final Web3Keyfile g) {
        e.f((Object)f, "state");
        e.f((Object)g, "keyfile");
        this.f = f;
        this.g = g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        this.f.writeToParcel(parcel, n);
        this.g.writeToParcel(parcel, n);
    }
}
