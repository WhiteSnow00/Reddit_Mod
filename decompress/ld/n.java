// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.os.Messenger;

public final class n
{
    public final Messenger a;
    public final h b;
    
    public n(final IBinder binder) throws RemoteException {
        final String interfaceDescriptor = binder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(binder);
            this.b = null;
            return;
        }
        if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new h(binder);
            this.a = null;
            return;
        }
        final String value = String.valueOf(interfaceDescriptor);
        String concat;
        if (value.length() != 0) {
            concat = "Invalid interface descriptor: ".concat(value);
        }
        else {
            concat = new String("Invalid interface descriptor: ");
        }
        Log.w("MessengerIpcClient", concat);
        throw new RemoteException();
    }
}
