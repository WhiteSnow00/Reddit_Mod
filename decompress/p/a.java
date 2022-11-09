// 
// Decompiled by Procyon v0.6.0
// 

package p;

import android.util.Log;
import z3.g;
import java.util.concurrent.ArrayBlockingQueue;
import android.view.View;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Message;
import android.os.Handler$Callback;
import android.content.Context;
import android.os.Handler;

public final class a
{
    public b a;
    public Handler b;
    public d c;
    public a$a d;
    
    public a(final Context context) {
        this.d = new Handler$Callback() {
            public final boolean handleMessage(final Message message) {
                final c c = (c)message.obj;
                if (c.d == null) {
                    c.d = p.a.this.a.inflate(c.c, c.b, false);
                }
                c.e.b(c.c, c.d, c.b);
                final d c2 = p.a.this.c;
                c2.getClass();
                c.e = null;
                c.a = null;
                c.b = null;
                c.c = 0;
                c.d = null;
                c2.g.b(c);
                return true;
            }
        };
        this.a = new b(context);
        this.b = new Handler((Handler$Callback)this.d);
        this.c = p.a.d.h;
    }
    
    public final void a(final int c, final ViewGroup b, final e e) {
        c c2;
        if ((c2 = (c)this.c.g.a()) == null) {
            c2 = new c();
        }
        c2.a = this;
        c2.c = c;
        c2.b = b;
        c2.e = e;
        final d c3 = this.c;
        c3.getClass();
        try {
            c3.f.put(c2);
        }
        catch (final InterruptedException ex) {
            throw new RuntimeException("Failed to enqueue async inflate request", ex);
        }
    }
    
    public static final class b extends LayoutInflater
    {
        public static final String[] a;
        
        static {
            a = new String[] { "android.widget.", "android.webkit.", "android.app." };
        }
        
        public b(final Context context) {
            super(context);
        }
        
        public final LayoutInflater cloneInContext(final Context context) {
            return new b(context);
        }
        
        public final View onCreateView(final String s, final AttributeSet set) throws ClassNotFoundException {
            final String[] a = b.a;
            int n = 0;
        Label_0037_Outer:
            while (true) {
                Label_0043: {
                    if (n >= 3) {
                        break Label_0043;
                    }
                    final String s2 = a[n];
                    while (true) {
                        try {
                            final View view = this.createView(s, s2, set);
                            if (view != null) {
                                return view;
                            }
                            ++n;
                            continue Label_0037_Outer;
                            return super.onCreateView(s, set);
                        }
                        catch (final ClassNotFoundException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public static final class c
    {
        public a a;
        public ViewGroup b;
        public int c;
        public View d;
        public e e;
    }
    
    public static final class d extends Thread
    {
        public static final d h;
        public ArrayBlockingQueue<c> f;
        public g<c> g;
        
        static {
            (h = new d()).start();
        }
        
        public d() {
            this.f = new ArrayBlockingQueue<c>(10);
            this.g = new g<c>(10);
        }
        
        @Override
        public final void run() {
            while (true) {
                try {
                    while (true) {
                        final c c = this.f.take();
                        try {
                            c.d = c.a.a.inflate(c.c, c.b, false);
                        }
                        catch (final RuntimeException ex) {
                            Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", (Throwable)ex);
                        }
                        Message.obtain(c.a.b, 0, (Object)c).sendToTarget();
                    }
                }
                catch (final InterruptedException ex2) {
                    Log.w("AsyncLayoutInflater", (Throwable)ex2);
                    continue;
                }
                break;
            }
        }
    }
    
    public interface e
    {
        void b(final int p0, final View p1, final ViewGroup p2);
    }
}
