// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import ng2.e;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    public final int f;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<c>() {
            public final Object createFromParcel(final Parcel parcel) {
                e.f((Object)parcel, "parcel");
                return new c(parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new c[n];
            }
        };
    }
    
    public c(final int f) {
        this.f = f;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && this.f == ((c)o).f);
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.f);
    }
    
    @Override
    public final String toString() {
        return d.j(a.t("PagingPlaceholderKey(index="), this.f, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "parcel");
        parcel.writeInt(this.f);
    }
}
