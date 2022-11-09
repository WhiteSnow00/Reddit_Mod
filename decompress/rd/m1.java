// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.RemoteException;
import zd.a;
import android.os.IInterface;
import he.c;
import od.r;
import android.os.Parcel;
import he.b;

public abstract class m1 extends b implements n1
{
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
