// 
// Decompiled by Procyon v0.6.0
// 

package zd;

import android.os.IBinder;
import he.b;
import android.os.IInterface;

public interface a extends IInterface
{
    public abstract static class a extends b implements zd.a
    {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }
        
        public static zd.a m(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof zd.a) {
                return (zd.a)queryLocalInterface;
            }
            return new c(binder);
        }
    }
}
