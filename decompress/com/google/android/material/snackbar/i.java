// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import java.lang.ref.WeakReference;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public final class i
{
    public static i e;
    public final Object a;
    public final Handler b;
    public c c;
    public c d;
    
    public i() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), (Handler$Callback)new Handler$Callback() {
            public final boolean handleMessage(final Message message) {
                if (message.what != 0) {
                    return false;
                }
                final i f = i.this;
                final c c = (c)message.obj;
                synchronized (f.a) {
                    if (f.c == c || f.d == c) {
                        f.a(c, 2);
                    }
                    return true;
                }
            }
        });
    }
    
    public static i b() {
        if (i.e == null) {
            i.e = new i();
        }
        return i.e;
    }
    
    public final boolean a(final c c, final int n) {
        final b b = c.a.get();
        if (b != null) {
            this.b.removeCallbacksAndMessages((Object)c);
            b.a(n);
            return true;
        }
        return false;
    }
    
    public final boolean c(final BaseTransientBottomBar$c baseTransientBottomBar$c) {
        final c c = this.c;
        boolean b = true;
        if (c == null || (baseTransientBottomBar$c == null || c.a.get() != baseTransientBottomBar$c)) {
            b = false;
        }
        return b;
    }
    
    public final void d(final c c) {
        int b = c.b;
        if (b == -2) {
            return;
        }
        if (b <= 0) {
            if (b == -1) {
                b = 1500;
            }
            else {
                b = 2750;
            }
        }
        this.b.removeCallbacksAndMessages((Object)c);
        final Handler b2 = this.b;
        b2.sendMessageDelayed(Message.obtain(b2, 0, (Object)c), (long)b);
    }
    
    public interface b
    {
        void a(final int p0);
        
        void show();
    }
    
    public static final class c
    {
        public final WeakReference<b> a;
        public int b;
        public boolean c;
        
        public c(final int b, final BaseTransientBottomBar$c baseTransientBottomBar$c) {
            this.a = new WeakReference<b>((b)baseTransientBottomBar$c);
            this.b = b;
        }
    }
}
