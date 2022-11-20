// 
// Decompiled by Procyon v0.6.0
// 

package pb;

import java.util.ArrayDeque;
import android.media.MediaCodec$CryptoInfo;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

public final class d extends Handler
{
    public final e a;
    
    public d(final e a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message message) {
        final e a = this.a;
        a.getClass();
        final int what = message.what;
        final Message message2 = null;
        Label_0295: {
            if (what != 0) {
                if (what != 1) {
                    if (what != 2) {
                        final AtomicReference<RuntimeException> d = a.d;
                        while (!d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)))) {
                            if (d.get() != null) {
                                message = message2;
                                break Label_0295;
                            }
                        }
                        message = message2;
                    }
                    else {
                        a.e.e();
                        message = message2;
                    }
                }
                else {
                    message = (Message)message.obj;
                    final int a2 = ((e.a)message).a;
                    final int b = ((e.a)message).b;
                    final MediaCodec$CryptoInfo d2 = ((e.a)message).d;
                    final long e = ((e.a)message).e;
                    final int f = ((e.a)message).f;
                    try {
                        synchronized (pb.e.h) {
                            a.a.queueSecureInputBuffer(a2, b, d2, e, f);
                        }
                    }
                    catch (final RuntimeException ex) {
                        final AtomicReference<RuntimeException> d3 = a.d;
                        while (!d3.compareAndSet(null, ex)) {
                            if (d3.get() != null) {}
                        }
                    }
                }
            }
            else {
                message = (Message)message.obj;
                final int a3 = ((e.a)message).a;
                final int b2 = ((e.a)message).b;
                final int c = ((e.a)message).c;
                final long e2 = ((e.a)message).e;
                final int f2 = ((e.a)message).f;
                try {
                    a.a.queueInputBuffer(a3, b2, c, e2, f2);
                }
                catch (final RuntimeException ex2) {
                    final AtomicReference<RuntimeException> d4 = a.d;
                    while (!d4.compareAndSet(null, ex2)) {
                        if (d4.get() != null) {}
                    }
                }
            }
        }
        if (message != null) {
            final ArrayDeque<e.a> g = e.g;
            synchronized (g) {
                g.add((e.a)message);
            }
        }
    }
}
