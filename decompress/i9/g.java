// 
// Decompiled by Procyon v0.6.0
// 

package i9;

import j9.d;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import com.bumptech.glide.j;
import android.os.Handler;

public final class g<Z> extends c<Z>
{
    public static final Handler j;
    public final j i;
    
    static {
        j = new Handler(Looper.getMainLooper(), (Handler$Callback)new Handler$Callback() {
            public final boolean handleMessage(final Message message) {
                if (message.what == 1) {
                    final g g = (g)message.obj;
                    g.i.clear((i9.j)g);
                    return true;
                }
                return false;
            }
        });
    }
    
    public g(final j i, final int n, final int n2) {
        super(n, n2);
        this.i = i;
    }
    
    public final void c(final Drawable drawable) {
    }
    
    public final void d(final Z b, final d<? super Z> d) {
        g.j.obtainMessage(1, (Object)this).sendToTarget();
    }
}
