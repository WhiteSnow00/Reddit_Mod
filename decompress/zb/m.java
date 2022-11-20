// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class m implements Comparable<m>, Parcelable
{
    public static final Parcelable$Creator<m> CREATOR;
    public final int f;
    public final int g;
    public final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<m>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new m(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new m[n];
            }
        };
    }
    
    public m(final int f, final int g, final int h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public m(final Parcel parcel) {
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }
    
    @Override
    public final int compareTo(final Object o) {
        final m m = (m)o;
        int n;
        if ((n = this.f - m.f) == 0 && (n = this.g - m.g) == 0) {
            n = this.h - m.h;
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
        if (o != null && m.class == o.getClass()) {
            final m m = (m)o;
            if (this.f != m.f || this.g != m.g || this.h != m.h) {
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
