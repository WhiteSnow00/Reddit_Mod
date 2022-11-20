// 
// Decompiled by Procyon v0.6.0
// 

package wb;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class d implements a$b
{
    public static final Parcelable$Creator<d> CREATOR;
    public final float f;
    public final int g;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<d>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new d(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new d[n];
            }
        };
    }
    
    public d(final float f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    public d(final Parcel parcel) {
        this.f = parcel.readFloat();
        this.g = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && d.class == o.getClass()) {
            final d d = (d)o;
            if (this.f != d.f || this.g != d.g) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.valueOf(this.f).hashCode() + 527) * 31 + this.g;
    }
    
    @Override
    public final String toString() {
        final float f = this.f;
        final int g = this.g;
        final StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(g);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.f);
        parcel.writeInt(this.g);
    }
}
