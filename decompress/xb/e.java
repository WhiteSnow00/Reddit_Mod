// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class e extends b
{
    public static final Parcelable$Creator<e> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<e>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new e();
            }
            
            public final Object[] newArray(final int n) {
                return new e[n];
            }
        };
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
    }
}
