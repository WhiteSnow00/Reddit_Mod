// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import android.os.Parcel;
import com.reddit.screen.BaseScreen;
import com.reddit.events.deeplink.DeepLinkAnalytics;
import android.os.Parcelable$Creator;
import ae1.b;

public final class e extends b<a>
{
    public static final Parcelable$Creator<e> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new e$a();
    }
    
    public e() {
        super((DeepLinkAnalytics)null);
    }
    
    public final BaseScreen c() {
        return (BaseScreen)new a();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        sg2.e.f((Object)parcel, "out");
        parcel.writeInt(1);
    }
}
