// 
// Decompiled by Procyon v0.6.0
// 

package qb;

import android.os.Parcel;
import a81.e;
import android.os.Parcelable$Creator;
import pb.a$b;

public final class a implements a$b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new a$a();
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
        final StringBuilder sb = new StringBuilder(e.h(g, 33));
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
