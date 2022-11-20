// 
// Decompiled by Procyon v0.6.0
// 

package c;

import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    public a f;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new b(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        final IBinder strongBinder = parcel.readStrongBinder();
        final int a = a$a.a;
        Object f;
        if (strongBinder == null) {
            f = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && queryLocalInterface instanceof a) {
                f = queryLocalInterface;
            }
            else {
                f = new a$a$a(strongBinder);
            }
        }
        this.f = (a)f;
    }
    
    public void a(final int n, final Bundle bundle) {
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        synchronized (this) {
            if (this.f == null) {
                this.f = (a)new b.b$b(this);
            }
            parcel.writeStrongBinder(((IInterface)this.f).asBinder());
        }
    }
}
