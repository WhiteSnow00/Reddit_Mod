// 
// Decompiled by Procyon v0.6.0
// 

package od;

import java.util.concurrent.locks.Lock;
import android.os.Message;
import android.os.Looper;
import de.f;

public final class o0 extends f
{
    public final /* synthetic */ p0 a;
    
    public o0(final p0 a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        final int what = message.what;
        if (what != 1) {
            if (what != 2) {
                d.w(31, "Unknown message id: ", what, "GACStateManager");
                return;
            }
            throw (RuntimeException)message.obj;
        }
        else {
            final n0 n0 = (n0)message.obj;
            message = (Message)this.a;
            n0.getClass();
            ((p0)message).a.lock();
            try {
                if (((p0)message).k != n0.a) {
                    message = (Message)((p0)message).a;
                }
                else {
                    n0.a();
                    message = (Message)((p0)message).a;
                }
                ((Lock)message).unlock();
            }
            finally {
                ((p0)message).a.unlock();
            }
        }
    }
}
