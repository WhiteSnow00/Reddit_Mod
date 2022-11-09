// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    public final ArrayList f;
    public final ArrayList g;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<c>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new c(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new c[n];
            }
        };
    }
    
    public c(final Parcel parcel) {
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList((Parcelable$Creator)b.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList((List)this.f);
        parcel.writeTypedList((List)this.g);
    }
}
