// 
// Decompiled by Procyon v0.6.0
// 

package ub;

import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class c implements a$b
{
    public static final Parcelable$Creator<c> CREATOR;
    public final byte[] f;
    public final String g;
    public final String h;
    
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
        final byte[] byteArray = parcel.createByteArray();
        byteArray.getClass();
        this.f = byteArray;
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
    
    public c(final byte[] f, final String g, final String h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void Q(final r$a r$a) {
        final String g = this.g;
        if (g != null) {
            r$a.a = g;
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && c.class == o.getClass() && Arrays.equals(this.f, ((c)o).f));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }
    
    @Override
    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.g, this.h, this.f.length);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
