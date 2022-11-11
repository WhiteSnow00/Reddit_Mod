// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class h implements Parcelable
{
    public static final Parcelable$Creator<h> CREATOR;
    public Messenger f;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    public h(final IBinder binder) {
        this.f = new Messenger(binder);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            final Messenger f = this.f;
            f.getClass();
            final IBinder binder = f.getBinder();
            final Messenger f2 = ((h)o).f;
            f2.getClass();
            return binder.equals(f2.getBinder());
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        final Messenger f = this.f;
        f.getClass();
        return f.getBinder().hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final Messenger f = this.f;
        f.getClass();
        parcel.writeStrongBinder(f.getBinder());
    }
}
