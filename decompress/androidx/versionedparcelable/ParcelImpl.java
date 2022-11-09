// 
// Decompiled by Procyon v0.6.0
// 

package androidx.versionedparcelable;

import X.17g;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import X.0GZ;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable
{
    public static final Parcelable$Creator<ParcelImpl> CREATOR;
    public final 0GZ LIZ;
    
    static {
        Covode.recordClassIndex(1754);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ParcelImpl>() {
            static {
                Covode.recordClassIndex(1755);
            }
        };
    }
    
    public ParcelImpl(final 0GZ liz) {
        this.LIZ = liz;
    }
    
    public ParcelImpl(final Parcel parcel) {
        this.LIZ = new 17g(parcel).LJIIIIZZ();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        new 17g(parcel).LIZIZ(this.LIZ);
    }
}
