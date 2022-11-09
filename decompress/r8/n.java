// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public final class n
{
    public boolean a;
    public final Handler b;
    
    public n() {
        this.b = new Handler(Looper.getMainLooper(), (Handler$Callback)new a());
    }
    
    public final void a(final l<?> l, final boolean b) {
        synchronized (this) {
            if (!this.a && !b) {
                this.a = true;
                l.recycle();
                this.a = false;
            }
            else {
                this.b.obtainMessage(1, (Object)l).sendToTarget();
            }
        }
    }
    
    public static final class a implements Handler$Callback
    {
        public final boolean handleMessage(final Message message) {
            if (message.what == 1) {
                ((l)message.obj).recycle();
                return true;
            }
            return false;
        }
    }
}
