// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import android.os.BaseBundle;
import android.util.Log;
import android.os.Message;
import androidx.fragment.app.d0;
import android.app.Application;
import androidx.fragment.app.r;
import a4.s;
import android.os.Build$VERSION;
import android.app.FragmentManager;
import java.util.Iterator;
import java.util.List;
import android.content.ContextWrapper;
import android.app.Activity;
import dn.a;
import com.bumptech.glide.d;
import x8.o;
import android.os.Looper;
import com.bumptech.glide.g;
import android.content.Context;
import com.bumptech.glide.c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import j0.b;
import android.os.Handler;
import java.util.HashMap;
import com.bumptech.glide.j;
import android.os.Handler$Callback;

public final class m implements Handler$Callback
{
    public static final m$a o;
    public volatile j f;
    public final HashMap g;
    public final HashMap h;
    public final Handler i;
    public final b j;
    public final j0.b<View, Fragment> k;
    public final j0.b<View, android.app.Fragment> l;
    public final Bundle m;
    public final h n;
    
    static {
        o = new b() {
            @Override
            public final j build(final c c, final i i, final n n, final Context context) {
                return new j(c, i, n, context);
            }
        };
    }
    
    public m(b o, final g g) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.k = new j0.b<View, Fragment>();
        this.l = new j0.b<View, android.app.Fragment>();
        this.m = new Bundle();
        if (o == null) {
            o = (b)d9.m.o;
        }
        this.j = o;
        this.i = new Handler(Looper.getMainLooper(), (Handler$Callback)this);
        Object n;
        if (x8.o.h && x8.o.g) {
            if (g.a.containsKey(d.d.class)) {
                n = new d9.g();
            }
            else {
                n = new a(3);
            }
        }
        else {
            n = new v0.i(3);
        }
        this.n = (h)n;
    }
    
    public static Activity a(final Context context) {
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }
    
    public static void c(final List list, final j0.b b) {
        if (list == null) {
            return;
        }
        for (final Fragment fragment : list) {
            if (fragment != null) {
                if (fragment.getView() == null) {
                    continue;
                }
                b.put((Object)fragment.getView(), (Object)fragment);
                c(fragment.getChildFragmentManager().J(), b);
            }
        }
    }
    
    @Deprecated
    public final void b(FragmentManager fragmentManager, final j0.b<View, android.app.Fragment> b) {
        if (Build$VERSION.SDK_INT >= 26) {
            final Object o = s.c(fragmentManager).iterator();
            while (((Iterator)o).hasNext()) {
                fragmentManager = (FragmentManager)((Iterator)o).next();
                if (((android.app.Fragment)fragmentManager).getView() != null) {
                    b.put((Object)((android.app.Fragment)fragmentManager).getView(), (Object)fragmentManager);
                    this.b(((android.app.Fragment)fragmentManager).getChildFragmentManager(), b);
                }
            }
            return;
        }
        int n = 0;
        while (true) {
            ((BaseBundle)this.m).putInt("key", n);
            Object o = null;
            while (true) {
                try {
                    o = fragmentManager.getFragment(this.m, "key");
                    if (o == null) {
                        return;
                    }
                    if (((android.app.Fragment)o).getView() != null) {
                        b.put((Object)((android.app.Fragment)o).getView(), o);
                        this.b(((android.app.Fragment)o).getChildFragmentManager(), b);
                    }
                    ++n;
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Deprecated
    public final j d(final Context context, final FragmentManager fragmentManager, final android.app.Fragment fragment, final boolean b) {
        final l i = this.i(fragmentManager, fragment);
        j j;
        if ((j = i.i) == null) {
            j = this.j.build(c.b(context), i.f, i.g, context);
            if (b) {
                j.onStart();
            }
            i.i = j;
        }
        return j;
    }
    
    public final j e(final Activity activity) {
        if (k9.j.h()) {
            return this.f(((Context)activity).getApplicationContext());
        }
        if (activity instanceof r) {
            return this.h((r)activity);
        }
        if (!activity.isDestroyed()) {
            this.n.c();
            final FragmentManager fragmentManager = activity.getFragmentManager();
            final Activity a = a((Context)activity);
            return this.d((Context)activity, fragmentManager, null, a == null || !a.isFinishing());
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }
    
    public final j f(final Context context) {
        if (context != null) {
            final char[] a = k9.j.a;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof r) {
                    return this.h((r)context);
                }
                if (context instanceof Activity) {
                    return this.e((Activity)context);
                }
                if (context instanceof ContextWrapper) {
                    final ContextWrapper contextWrapper = (ContextWrapper)context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return this.f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f == null) {
                synchronized (this) {
                    if (this.f == null) {
                        this.f = this.j.build(c.b(context.getApplicationContext()), (i)new x1.c(1), new f(0), context.getApplicationContext());
                    }
                }
            }
            return this.f;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }
    
    public final j g(final Fragment fragment) {
        if (fragment.getContext() == null) {
            throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
        }
        if (k9.j.h()) {
            return this.f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            final h n = this.n;
            fragment.getActivity();
            n.c();
        }
        return this.k(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }
    
    public final j h(final r r) {
        if (k9.j.h()) {
            return this.f(((Context)r).getApplicationContext());
        }
        if (!((Activity)r).isDestroyed()) {
            this.n.c();
            final d0 supportFragmentManager = r.getSupportFragmentManager();
            final Activity a = a((Context)r);
            return this.k((Context)r, supportFragmentManager, null, a == null || !a.isFinishing());
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        Object o = null;
        boolean b = true;
        Object o2 = null;
        Label_0073: {
            Object o3;
            Object o4;
            if (what != 1) {
                if (what != 2) {
                    b = false;
                    o2 = null;
                    break Label_0073;
                }
                o3 = message.obj;
                o4 = this.h.remove(o3);
            }
            else {
                o3 = message.obj;
                o4 = this.g.remove(o3);
            }
            final Object o5 = o4;
            o2 = o3;
            o = o5;
        }
        if (b && o == null && Log.isLoggable("RMRetriever", 5)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove expected request manager fragment, manager: ");
            sb.append(o2);
            Log.w("RMRetriever", sb.toString());
        }
        return b;
    }
    
    public final l i(final FragmentManager fragmentManager, final android.app.Fragment k) {
        l l;
        if ((l = (l)fragmentManager.findFragmentByTag("com.bumptech.glide.manager")) == null && (l = this.g.get(fragmentManager)) == null) {
            l = new l();
            l.k = k;
            if (k != null && k.getActivity() != null) {
                l.b(k.getActivity());
            }
            this.g.put(fragmentManager, l);
            fragmentManager.beginTransaction().add((android.app.Fragment)l, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.i.obtainMessage(1, (Object)fragmentManager).sendToTarget();
        }
        return l;
    }
    
    public final p j(final d0 d0, final Fragment k) {
        p p2;
        if ((p2 = (p)d0.E("com.bumptech.glide.manager")) == null && (p2 = this.h.get(d0)) == null) {
            final p p3 = new p();
            if ((p3.k = k) != null) {
                if (k.getContext() != null) {
                    Fragment parentFragment;
                    for (parentFragment = k; parentFragment.getParentFragment() != null; parentFragment = parentFragment.getParentFragment()) {}
                    final d0 fragmentManager = parentFragment.getFragmentManager();
                    if (fragmentManager != null) {
                        p3.q0(k.getContext(), fragmentManager);
                    }
                }
            }
            this.h.put(d0, p3);
            final androidx.fragment.app.a a = new androidx.fragment.app.a(d0);
            a.e(0, (Fragment)p3, "com.bumptech.glide.manager", 1);
            a.k();
            this.i.obtainMessage(2, (Object)d0).sendToTarget();
            p2 = p3;
        }
        return p2;
    }
    
    public final j k(final Context context, final d0 d0, final Fragment fragment, final boolean b) {
        final p j = this.j(d0, fragment);
        j i;
        if ((i = j.j) == null) {
            i = this.j.build(c.b(context), j.f, j.g, context);
            if (b) {
                i.onStart();
            }
            j.j = i;
        }
        return i;
    }
    
    public interface b
    {
        j build(final c p0, final i p1, final n p2, final Context p3);
    }
}
