// 
// Decompiled by Procyon v0.6.0
// 

package xb;

import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class a extends b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final long f;
    public final long g;
    public final byte[] h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new a(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final long g, final byte[] h, final long f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public a(final Parcel parcel) {
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        final byte[] byteArray = parcel.createByteArray();
        final int a = c0.a;
        this.h = byteArray;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeByteArray(this.h);
    }
}
