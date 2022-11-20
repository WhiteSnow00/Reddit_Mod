// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import java.util.AbstractCollection;
import java.util.List;
import android.os.RemoteException;
import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import a4.u1;
import bd.c0;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import android.os.Binder;

public final class a extends Binder
{
    public static final int b;
    public final ImmutableList<Bundle> a;
    
    static {
        int a;
        if (c0.a >= 30) {
            a = u1.a();
        }
        else {
            a = 65536;
        }
        b = a;
    }
    
    public a(final ArrayList list) {
        this.a = (ImmutableList<Bundle>)ImmutableList.copyOf((Collection)list);
    }
    
    public final boolean onTransact(int int1, final Parcel parcel, final Parcel parcel2, int n) throws RemoteException {
        if (int1 != 1) {
            return super.onTransact(int1, parcel, parcel2, n);
        }
        n = 0;
        if (parcel2 == null) {
            return false;
        }
        int size;
        for (size = ((AbstractCollection)this.a).size(), int1 = parcel.readInt(); int1 < size && parcel2.dataSize() < wa.a.b; ++int1) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle)((List<Bundle>)this.a).get(int1));
        }
        if (int1 < size) {
            n = 2;
        }
        parcel2.writeInt(n);
        return true;
    }
}
