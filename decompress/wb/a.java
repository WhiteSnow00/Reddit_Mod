// 
// Decompiled by Procyon v0.6.0
// 

package wb;

import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class a implements a$b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String f;
    public final byte[] g;
    public final int h;
    public final int i;
    
    static {
        CREATOR = (Parcelable$Creator)new a$a();
    }
    
    public a(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = c0.a;
        this.f = string;
        this.g = parcel.createByteArray();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
    }
    
    public a(final String f, final byte[] g, final int h, final int i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
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
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            if (!this.f.equals(a.f) || !Arrays.equals(this.g, a.g) || this.h != a.h || this.i != a.i) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((Arrays.hashCode(this.g) + ag0.a.f(this.f, 527, 31)) * 31 + this.h) * 31 + this.i;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.f);
        String concat;
        if (value.length() != 0) {
            concat = "mdta: key=".concat(value);
        }
        else {
            concat = new String("mdta: key=");
        }
        return concat;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
