// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import ng2.e;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int f;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public final Object createFromParcel(final Parcel parcel) {
                e.f((Object)parcel, "parcel");
                return new a(parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final int f) {
        this.f = f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a && this.f == ((a)o).f);
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.f);
    }
    
    @Override
    public final String toString() {
        return d.j(a.t("DefaultLazyKey(index="), this.f, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "parcel");
        parcel.writeInt(this.f);
    }
}
