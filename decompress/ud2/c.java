// 
// Decompiled by Procyon v0.6.0
// 

package ud2;

import java.util.concurrent.TimeoutException;
import android.os.SystemClock;
import bu0.e;
import android.os.Handler;

public abstract class c
{
    public a a;
    public final td2.c b;
    public final Handler c;
    public final e d;
    
    public c(final td2.e b, final Handler c, final e d) {
        this.b = (td2.c)b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final a a = this.a;
        if (a != null) {
            this.c.removeCallbacks((Runnable)a);
            this.a = null;
            this.b.d("BluetoothScoJob", "Canceled bluetooth sco job");
        }
    }
    
    public final void b() {
        final a a = this.a;
        if (a != null) {
            this.c.removeCallbacks((Runnable)a);
        }
        final a a2 = new a();
        this.a = a2;
        this.c.post((Runnable)a2);
        this.b.d("BluetoothScoJob", "Scheduled bluetooth sco job");
    }
    
    public abstract void c();
    
    public abstract void d();
    
    public final class a implements Runnable
    {
        public final long f;
        public long g;
        public final c h;
        
        public a(final c h) {
            this.h = h;
            h.d.getClass();
            this.f = SystemClock.elapsedRealtime();
        }
        
        @Override
        public final void run() {
            if (this.g < 5000L) {
                this.h.c();
                this.h.d.getClass();
                this.g = SystemClock.elapsedRealtime() - this.f;
                this.h.c.postDelayed((Runnable)this, 500L);
            }
            else {
                this.h.b.b(new TimeoutException());
                this.h.d();
                this.h.a();
            }
        }
    }
}
