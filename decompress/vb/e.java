// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import pb.a$b;

public final class e implements a$b
{
    public static final Parcelable$Creator<e> CREATOR;
    public final float f;
    public final int g;
    
    static {
        CREATOR = (Parcelable$Creator)new e$a();
    }
    
    public e(final float f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    public e(final Parcel parcel) {
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
        if (o != null && e.class == o.getClass()) {
            final e e = (e)o;
            if (this.f != e.f || this.g != e.g) {
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
