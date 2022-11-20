// 
// Decompiled by Procyon v0.6.0
// 

package yb;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import tb.b;

public final class a extends b
{
    public static final Parcelable$Creator<a> CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new a$a();
    }
    
    public a(final Parcel parcel) {
        super(parcel);
    }
    
    public a(final String s, final String s2) {
        super(s, s2);
    }
}
