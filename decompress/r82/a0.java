// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import java.io.Serializable;
import android.os.Parcel;
import ng2.e;
import java.math.BigInteger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a0 implements Parcelable
{
    public static final Parcelable$Creator<a0> CREATOR;
    public final BigInteger f;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a0(final BigInteger f) {
        e.f((Object)f, "value");
        this.f = f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeSerializable((Serializable)this.f);
    }
    
    public static final class a implements Parcelable$Creator<a0>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new a0((BigInteger)parcel.readSerializable());
        }
        
        public final Object[] newArray(final int n) {
            return new a0[n];
        }
    }
}
