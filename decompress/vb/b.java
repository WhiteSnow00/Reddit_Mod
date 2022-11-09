// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import ag0.a;
import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class b extends h
{
    public static final Parcelable$Creator<b> CREATOR;
    public final byte[] g;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new b(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = c0.a;
        super(string);
        this.g = parcel.createByteArray();
    }
    
    public b(final String s, final byte[] g) {
        super(s);
        this.g = g;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && b.class == o.getClass()) {
            final b b2 = (b)o;
            if (!super.f.equals(b2.f) || !Arrays.equals(this.g, b2.g)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(this.g) + a.f(super.f, 527, 31);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.f);
        parcel.writeByteArray(this.g);
    }
}
