// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.util.Log;
import android.app.PendingIntent;
import android.os.IInterface;
import te.j;
import android.os.Message;
import android.os.Looper;
import he.e;

public final class u0 extends e
{
    public final /* synthetic */ b a;
    
    public u0(final b a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message ex) {
        final int value = this.a.G.get();
        final int arg1 = ((Message)ex).arg1;
        boolean b = false;
        final int n = 0;
        PendingIntent pendingIntent = null;
        if (value != arg1) {
            final int what = ((Message)ex).what;
            int n2 = 0;
            Label_0058: {
                if (what != 2 && what != 1) {
                    n2 = n;
                    if (what != 7) {
                        break Label_0058;
                    }
                }
                n2 = 1;
            }
            if (n2 != 0) {
                ex = (RuntimeException)((Message)ex).obj;
                ((v0)ex).b();
                synchronized (ex) {
                    ((v0)ex).a = null;
                    monitorexit(ex);
                    synchronized (((v0)ex).c.v) {
                        ((v0)ex).c.v.remove(ex);
                    }
                }
            }
            return;
        }
        final int what2 = ((Message)ex).what;
        Label_0191: {
            Label_0181: {
                if (what2 != 1 && what2 != 7) {
                    if (what2 == 4) {
                        final b a = this.a;
                        a.getClass();
                        if (!(a instanceof j)) {
                            break Label_0181;
                        }
                    }
                    if (((Message)ex).what != 5) {
                        break Label_0191;
                    }
                }
            }
            if (!this.a.f()) {
                ex = (RuntimeException)((Message)ex).obj;
                ((v0)ex).b();
                synchronized (ex) {
                    ((v0)ex).a = null;
                    monitorexit(ex);
                    synchronized (((v0)ex).c.v) {
                        ((v0)ex).c.v.remove(ex);
                        return;
                    }
                }
            }
        }
        final int what3 = ((Message)ex).what;
        if (what3 == 4) {
            this.a.D = new od.b(((Message)ex).arg2);
            if (rd.b.J((b<IInterface>)this.a)) {
                final b a2 = this.a;
                if (!a2.E) {
                    a2.K(3, null);
                    return;
                }
            }
            od.b d = this.a.D;
            if (d == null) {
                d = new od.b(8);
            }
            this.a.t.a(d);
            this.a.G(d);
            return;
        }
        if (what3 == 5) {
            od.b d2 = this.a.D;
            if (d2 == null) {
                d2 = new od.b(8);
            }
            this.a.t.a(d2);
            this.a.G(d2);
            return;
        }
        if (what3 == 3) {
            final Object obj = ((Message)ex).obj;
            if (obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent)obj;
            }
            final od.b b2 = new od.b(((Message)ex).arg2, pendingIntent);
            this.a.t.a(b2);
            this.a.G(b2);
            return;
        }
        if (what3 == 6) {
            this.a.K(5, null);
            final b.a y = this.a.y;
            if (y != null) {
                y.k(((Message)ex).arg2);
            }
            final b a3 = this.a;
            a3.f = ((Message)ex).arg2;
            a3.g = System.currentTimeMillis();
            rd.b.I((b<IInterface>)this.a, 5, 1, (IInterface)null);
            return;
        }
        if (what3 == 2) {
            if (!this.a.b()) {
                final Object o = ((Message)ex).obj;
                ((v0)o).b();
                synchronized (o) {
                    ((v0)o).a = null;
                    monitorexit(o);
                    synchronized (((v0)o).c.v) {
                        ((v0)o).c.v.remove(o);
                        return;
                    }
                }
            }
        }
        final int what4 = ((Message)ex).what;
        if (what4 == 2 || what4 == 1 || what4 == 7) {
            b = true;
        }
        if (b) {
            ex = (RuntimeException)((Message)ex).obj;
            synchronized (ex) {
                final TListener a4 = ((v0)ex).a;
                if (((v0)ex).b) {
                    final String string = ex.toString();
                    final StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
                monitorexit(ex);
                if (a4 != null) {
                    try {
                        ((v0)ex).a();
                    }
                    catch (final RuntimeException ex) {
                        throw ex;
                    }
                }
                synchronized (ex) {
                    ((v0)ex).b = true;
                    monitorexit(ex);
                    synchronized (ex) {
                        ((v0)ex).a = null;
                        monitorexit(ex);
                        synchronized (((v0)ex).c.v) {
                            ((v0)ex).c.v.remove(ex);
                            return;
                        }
                    }
                }
            }
        }
        final StringBuilder sb2 = new StringBuilder(45);
        sb2.append("Don't know how to handle message: ");
        sb2.append(what4);
        Log.wtf("GmsClient", sb2.toString(), (Throwable)new Exception());
    }
}
