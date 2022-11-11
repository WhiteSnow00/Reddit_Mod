// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import android.os.Parcel;
import ad.d0;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import pb.a$b;

public final class c implements a$b
{
    public static final Parcelable$Creator<c> CREATOR;
    public final List<c.c$b> f;
    
    static {
        CREATOR = (Parcelable$Creator)new c$a();
    }
    
    public c(final ArrayList f) {
        this.f = f;
        final boolean empty = f.isEmpty();
        final int n = 0;
        int n2;
        if (empty) {
            n2 = n;
        }
        else {
            long n3 = f.get(0).g;
            int n4 = 1;
            while (true) {
                n2 = n;
                if (n4 >= f.size()) {
                    break;
                }
                if (((c.c$b)f.get(n4)).f < n3) {
                    n2 = 1;
                    break;
                }
                n3 = ((c.c$b)f.get(n4)).g;
                ++n4;
            }
        }
        d0.c((boolean)((n2 ^ 0x1) != 0x0));
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && c.class == o.getClass() && this.f.equals(((c)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.f);
        return b.d(value.length() + 21, "SlowMotion: segments=", value);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeList((List)this.f);
    }
}
