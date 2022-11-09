// 
// Decompiled by Procyon v0.6.0
// 

package wb;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class b implements a$b
{
    public static final Parcelable$Creator<b> CREATOR;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    
    static {
        CREATOR = (Parcelable$Creator)new b$a();
    }
    
    public b(final long f, final long g, final long h, final long i, final long j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public b(final Parcel parcel) {
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.j = parcel.readLong();
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
        if (o != null && b.class == o.getClass()) {
            final b b2 = (b)o;
            if (this.f != b2.f || this.g != b2.g || this.h != b2.h || this.i != b2.i || this.j != b2.j) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final long g = this.g;
        final int n2 = (int)(g ^ g >>> 32);
        final long h = this.h;
        final int n3 = (int)(h ^ h >>> 32);
        final long i = this.i;
        final int n4 = (int)(i ^ i >>> 32);
        final long j = this.j;
        return (int)(j ^ j >>> 32) + (n4 + (n3 + (n2 + (n + 527) * 31) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final long f = this.f;
        final long g = this.g;
        final long h = this.h;
        final long i = this.i;
        final long j = this.j;
        final StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(f);
        sb.append(", photoSize=");
        sb.append(g);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(h);
        sb.append(", videoStartPosition=");
        sb.append(i);
        sb.append(", videoSize=");
        sb.append(j);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
    }
}
