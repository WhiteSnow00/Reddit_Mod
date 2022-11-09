// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import android.os.IInterface;

public interface 013 extends IInterface
{
    default static {
        Covode.recordClassIndex(96);
    }
    
    void LIZ(final 011 p0, final Bundle p1);
    
    void LIZ(final 011 p0, final String p1, final Bundle p2);
    
    public abstract static class a extends Binder implements 013
    {
        static {
            Covode.recordClassIndex(97);
        }
        
        public a() {
            this.attachInterface((IInterface)this, "android.support.customtabs.IPostMessageService");
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            final Bundle bundle = null;
            Bundle bundle2 = null;
            if (n == 2) {
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                final 011 liz = 011.a.LIZ(parcel.readStrongBinder());
                Bundle bundle3 = bundle;
                if (parcel.readInt() != 0) {
                    bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.LIZ(liz, bundle3);
                parcel2.writeNoException();
                return true;
            }
            if (n == 3) {
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                final 011 liz2 = 011.a.LIZ(parcel.readStrongBinder());
                final String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.LIZ(liz2, string, bundle2);
                parcel2.writeNoException();
                return true;
            }
            if (n != 1598968902) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            parcel2.writeString("android.support.customtabs.IPostMessageService");
            return true;
        }
    }
}
