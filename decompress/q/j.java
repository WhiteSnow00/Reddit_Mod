// 
// Decompiled by Procyon v0.6.0
// 

package q;

import android.os.IInterface;
import a.b$a$a;
import a.b;
import a.b$a;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class j implements ServiceConnection
{
    public Context f;
    
    public abstract void a(final j$a p0);
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (this.f != null) {
            final int a = b$a.a;
            Object o;
            if (binder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && queryLocalInterface instanceof b) {
                    o = queryLocalInterface;
                }
                else {
                    o = new b$a$a(binder);
                }
            }
            this.a(new j$a((b)o, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
