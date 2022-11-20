// 
// Decompiled by Procyon v0.6.0
// 

package r72;

import android.os.Parcel;
import ng2.e;
import s72.c;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final c f;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a(final c f) {
        e.f((Object)f, "model");
        this.f = f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        this.f.writeToParcel(parcel, n);
    }
    
    public static final class a implements Parcelable$Creator<r72.a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new r72.a((c)c.CREATOR.createFromParcel(parcel));
        }
        
        public final Object[] newArray(final int n) {
            return new r72.a[n];
        }
    }
}
