// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.RemoteException;
import yd.a;
import android.os.IInterface;
import ge.c;
import nd.r;
import android.os.Parcel;
import ge.b;

public abstract class m1 extends b implements n1
{
    public static final int a = 0;
    
    public m1() {
        super("com.google.android.gms.common.internal.ICertData");
    }
    
    public final boolean k(int b, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (b != 1) {
            if (b != 2) {
                return false;
            }
            b = ((r)this).b;
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        else {
            final a u = ((r)this).u();
            parcel2.writeNoException();
            c.b(parcel2, (IInterface)u);
        }
        return true;
    }
}
