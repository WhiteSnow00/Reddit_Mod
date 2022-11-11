// 
// Decompiled by Procyon v0.6.0
// 

package zd0;

import com.reddit.domain.model.MultiredditPath;
import android.os.Parcel;
import com.reddit.domain.model.Multireddit;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class e implements Parcelable
{
    public static final Parcelable$Creator<e> CREATOR;
    public final String f;
    public Multireddit g;
    
    static {
        CREATOR = (Parcelable$Creator)new e$a();
    }
    
    public e(final Multireddit g) {
        sg2.e.f((Object)g, "multireddit");
        this(g.getPath-6nFwv9Y());
        this.g = g;
    }
    
    public e(final String f) {
        this.f = f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        sg2.e.f((Object)parcel, "out");
        parcel.writeParcelable((Parcelable)MultiredditPath.box-impl(this.f), n);
    }
}
