// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.os;

import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import X.01U;
import android.os.Handler;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ResultReceiver implements Parcelable
{
    public static final Parcelable$Creator<ResultReceiver> CREATOR;
    public final boolean LIZ;
    public final Handler LIZIZ;
    public 01U LIZJ;
    
    static {
        Covode.recordClassIndex(175);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ResultReceiver>() {
            static {
                Covode.recordClassIndex(176);
            }
        };
    }
    
    public ResultReceiver(final Parcel parcel) {
        final IBinder strongBinder = parcel.readStrongBinder();
        01U lizj;
        if (strongBinder == null) {
            lizj = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && queryLocalInterface instanceof 01U) {
                lizj = (01U)queryLocalInterface;
            }
            else {
                lizj = new 01U.a.a(strongBinder);
            }
        }
        this.LIZJ = lizj;
    }
    
    public void LIZ(final int n, final Bundle bundle) {
    }
    
    public final void LIZIZ(final int n, final Bundle bundle) {
        if (this.LIZ) {
            final Handler liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.post((Runnable)new ResultReceiver.b(this, n, bundle));
                return;
            }
            this.LIZ(n, bundle);
        }
        else {
            final 01U lizj = this.LIZJ;
            if (lizj == null) {
                return;
            }
            try {
                lizj.LIZ(n, bundle);
            }
            catch (final RemoteException ex) {}
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        synchronized (this) {
            if (this.LIZJ == null) {
                this.LIZJ = (01U)new ResultReceiver.a(this);
            }
            parcel.writeStrongBinder(this.LIZJ.asBinder());
        }
    }
}
