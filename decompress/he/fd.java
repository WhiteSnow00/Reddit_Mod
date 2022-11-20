// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import rd.a;

public final class fd extends a
{
    public static final Parcelable$Creator<fd> CREATOR;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    
    static {
        CREATOR = (Parcelable$Creator)new gd();
    }
    
    public fd() {
    }
    
    public fd(final String f, final String g, final String h, final String i, final String j, final String k, final String l) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final void writeToParcel(final Parcel parcel, int b0) {
        b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 2, this.f);
        i10.a.w0(parcel, 3, this.g);
        i10.a.w0(parcel, 4, this.h);
        i10.a.w0(parcel, 5, this.i);
        i10.a.w0(parcel, 6, this.j);
        i10.a.w0(parcel, 7, this.k);
        i10.a.w0(parcel, 8, this.l);
        i10.a.G0(parcel, b0);
    }
}
