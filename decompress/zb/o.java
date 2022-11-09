// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class o implements Comparable<o>, Parcelable
{
    public static final Parcelable$Creator<o> CREATOR;
    public final int f;
    public final int g;
    public final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<o>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new o(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new o[n];
            }
        };
    }
    
    public o(final int f, final int g, final int h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public o(final Parcel parcel) {
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }
    
    @Override
    public final int compareTo(final Object o) {
        final o o2 = (o)o;
        int n;
        if ((n = this.f - o2.f) == 0 && (n = this.g - o2.g) == 0) {
            n = this.h - o2.h;
        }
        return n;
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
        if (o != null && o.class == o.getClass()) {
            final o o2 = (o)o;
            if (this.f != o2.f || this.g != o2.g || this.h != o2.h) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.f * 31 + this.g) * 31 + this.h;
    }
    
    @Override
    public final String toString() {
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final StringBuilder sb = new StringBuilder(35);
        sb.append(f);
        sb.append(".");
        sb.append(g);
        sb.append(".");
        sb.append(h);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
