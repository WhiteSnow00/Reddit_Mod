// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class j extends h
{
    public static final Parcelable$Creator<j> CREATOR;
    public final int g;
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    
    static {
        CREATOR = (Parcelable$Creator)new j$a();
    }
    
    public j(final int g, final int h, final int i, final int[] j, final int[] k) {
        super("MLLT");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public j(final Parcel parcel) {
        super("MLLT");
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        final int[] intArray = parcel.createIntArray();
        final int a = c0.a;
        this.j = intArray;
        this.k = parcel.createIntArray();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && j.class == o.getClass()) {
            final j j = (j)o;
            if (this.g != j.g || this.h != j.h || this.i != j.i || !Arrays.equals(this.j, j.j) || !Arrays.equals(this.k, j.k)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(this.k) + (Arrays.hashCode(this.j) + (((527 + this.g) * 31 + this.h) * 31 + this.i) * 31) * 31;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeIntArray(this.j);
        parcel.writeIntArray(this.k);
    }
}
