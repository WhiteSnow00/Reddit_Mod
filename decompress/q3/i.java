// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import eg.n0;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Future;
import p3.d$c;
import w3.o;
import java.util.ArrayList;
import w3.h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import w3.k$a;
import w3.c;
import android.os.Handler;
import android.os.Looper;
import p3.d$e;
import p3.f;
import android.content.res.Resources;
import p3.d;
import android.content.Context;
import java.lang.reflect.Method;
import android.util.Log;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import j0.g;

public final class i
{
    public static final p a;
    public static final g<String, Typeface> b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            a = new n();
        }
        else if (sdk_INT >= 28) {
            a = new m();
        }
        else if (sdk_INT >= 26) {
            a = new l();
        }
        else {
            final Method c = k.c;
            if (c == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (c != null) {
                a = new k();
            }
            else {
                a = new j();
            }
        }
        b = new g(16);
    }
    
    public static Typeface a(final Context context, d.b c, final Resources resources, final int n, final String s, final int n2, final int n3, f.e e, final boolean b) {
        Typeface typeface3 = null;
        Label_0694: {
            if (c instanceof d$e) {
                final d$e d$e = (d$e)c;
                final String d = d$e.d;
                final Typeface typeface = null;
                boolean b2 = false;
                Typeface create = null;
                Label_0072: {
                    if (d != null) {
                        if (!d.isEmpty()) {
                            create = Typeface.create(d, 0);
                            final Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                            if (create != null && !create.equals((Object)create2)) {
                                break Label_0072;
                            }
                        }
                    }
                    create = null;
                }
                if (create != null) {
                    if (e != null) {
                        e.b(create);
                    }
                    return create;
                }
                Label_0113: {
                    if (b) {
                        if (d$e.c != 0) {
                            break Label_0113;
                        }
                    }
                    else if (e != null) {
                        break Label_0113;
                    }
                    b2 = true;
                }
                int b3;
                if (b) {
                    b3 = d$e.b;
                }
                else {
                    b3 = -1;
                }
                final Handler handler = new Handler(Looper.getMainLooper());
                final a a = new a(e);
                final w3.f a2 = d$e.a;
                e = (f.e)new c(a, handler);
                if (b2) {
                    final g a3 = w3.k.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append((String)a2.u);
                    sb.append("-");
                    sb.append(n3);
                    final String string = sb.toString();
                    final Typeface typeface2 = (Typeface)w3.k.a.get((Object)string);
                    if (typeface2 != null) {
                        ((c)e).a(new k$a(typeface2));
                        typeface3 = typeface2;
                        break Label_0694;
                    }
                    if (b3 == -1) {
                        final k$a a4 = w3.k.a(string, context, a2, n3);
                        ((c)e).a(a4);
                        typeface3 = a4.a;
                        break Label_0694;
                    }
                    final w3.g g = new w3.g(string, context, a2, n3);
                    try {
                        final Future<k$a> submit = w3.k.b.submit((Callable<k$a>)g);
                        final long n4 = b3;
                        try {
                            final k$a k$a = submit.get(n4, TimeUnit.MILLISECONDS);
                            ((c)e).a(k$a);
                            typeface3 = k$a.a;
                            break Label_0694;
                        }
                        catch (final TimeoutException ex) {
                            throw new InterruptedException("timeout");
                        }
                        catch (final InterruptedException ex2) {
                            throw ex2;
                        }
                        catch (final ExecutionException ex4) {
                            try {
                                throw new RuntimeException(ex4);
                            }
                            catch (final InterruptedException ex5) {
                                ((c)e).a(new k$a(-3));
                                typeface3 = typeface;
                            }
                        }
                        try {
                            final InterruptedException ex2;
                            throw ex2;
                        }
                        catch (final InterruptedException ex6) {}
                    }
                    catch (final InterruptedException ex7) {}
                }
                final g a5 = w3.k.a;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append((String)a2.u);
                sb2.append("-");
                sb2.append(n3);
                final String string2 = sb2.toString();
                final Typeface typeface4 = (Typeface)w3.k.a.get((Object)string2);
                if (typeface4 != null) {
                    ((c)e).a(new k$a(typeface4));
                    typeface3 = typeface4;
                    break Label_0694;
                }
                final h h = new h((c)e);
                c = (d.b)w3.k.c;
                synchronized (c) {
                    final j0.i d2 = w3.k.d;
                    final ArrayList list = (ArrayList)d2.getOrDefault((Object)string2, (Object)null);
                    if (list != null) {
                        list.add(h);
                        monitorexit(c);
                        break Label_0694;
                    }
                    final ArrayList<h> list2 = new ArrayList<h>();
                    list2.add(h);
                    d2.put((Object)string2, (Object)list2);
                    monitorexit(c);
                    c = (d.b)new w3.i(string2, context, a2, n3);
                    final ThreadPoolExecutor b4 = w3.k.b;
                    final w3.j j = new w3.j(string2);
                    Handler handler2;
                    if (Looper.myLooper() == null) {
                        handler2 = new Handler(Looper.getMainLooper());
                    }
                    else {
                        handler2 = new Handler();
                    }
                    b4.execute((Runnable)new o(handler2, (w3.i)c, j));
                    break Label_0694;
                }
            }
            final Typeface typeface5 = typeface3 = i.a.a(context, (d$c)c, resources, n3);
            if (e != null) {
                if (typeface5 != null) {
                    e.b(typeface5);
                    typeface3 = typeface5;
                }
                else {
                    e.a(-3);
                    typeface3 = typeface5;
                }
            }
        }
        if (typeface3 != null) {
            i.b.put((Object)b(resources, n, s, n2, n3), (Object)typeface3);
        }
        return typeface3;
    }
    
    public static String b(final Resources resources, final int n, final String s, final int n2, final int n3) {
        final StringBuilder sb = new StringBuilder(resources.getResourcePackageName(n));
        sb.append('-');
        sb.append(s);
        sb.append('-');
        sb.append(n2);
        sb.append('-');
        sb.append(n);
        sb.append('-');
        sb.append(n3);
        return sb.toString();
    }
    
    public static final class a extends n0
    {
        public f.e C;
        
        public a(final f.e c) {
            this.C = c;
        }
    }
}
