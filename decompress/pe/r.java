// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import a92.b;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import qd.a;

public final class r extends a implements Iterable<String>
{
    public static final Parcelable$Creator<r> CREATOR;
    public final Bundle f;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
    }
    
    public r(final Bundle f) {
        this.f = f;
    }
    
    @Override
    public final Iterator iterator() {
        return new q(this);
    }
    
    public final Bundle q() {
        return new Bundle(this.f);
    }
    
    @Override
    public final String toString() {
        return this.f.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int y0) {
        y0 = b.y0(parcel, 20293);
        b.n0(parcel, 2, this.q());
        b.D0(parcel, y0);
    }
    
    public final Double x() {
        return ((BaseBundle)this.f).getDouble("value");
    }
}
