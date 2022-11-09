// 
// Decompiled by Procyon v0.6.0
// 

package rb;

import ak0.n;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class a implements a$b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                final String string = parcel.readString();
                string.getClass();
                return new a(parcel.readInt(), string);
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final int f, final String g) {
        this.f = f;
        this.g = g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final int f = this.f;
        final String g = this.g;
        final StringBuilder sb = new StringBuilder(n.f(g, 33));
        sb.append("Ait(controlCode=");
        sb.append(f);
        sb.append(",url=");
        sb.append(g);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.g);
        parcel.writeInt(this.f);
    }
}
