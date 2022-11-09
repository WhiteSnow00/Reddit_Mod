// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import android.view.MenuItem;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.Menu;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.app.Activity;
import c8.e;
import nb1.l;
import android.content.Intent;
import android.view.ViewParent;
import android.util.SparseArray;
import com.reddit.screen.BaseScreen;
import java.util.Arrays;
import android.view.ViewGroup;
import android.view.View$OnAttachStateChangeListener;
import android.content.Context;
import java.util.Iterator;
import java.util.Collection;
import java.lang.reflect.Constructor;
import java.util.UUID;
import android.os.Bundle;
import android.view.View;
import java.lang.ref.WeakReference;
import g8.d;
import java.util.ArrayList;
import com.bluelinelabs.conductor.internal.ViewAttachHandler;

public abstract class Controller
{
    public c A;
    public RetainViewMode B;
    public ViewAttachHandler C;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList<String> F;
    public final ArrayList<d> G;
    public WeakReference<View> H;
    public boolean I;
    public boolean J;
    public final Bundle f;
    public Bundle g;
    public Bundle h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Router p;
    public View q;
    public Controller r;
    public String s;
    public String t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public c z;
    
    public Controller() {
        this(null);
    }
    
    public Controller(Bundle f) {
        this.B = RetainViewMode.RELEASE_DETACH;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList<String>();
        this.G = new ArrayList<d>();
        if (f == null) {
            f = new Bundle(this.getClass().getClassLoader());
        }
        this.f = f;
        this.s = UUID.randomUUID().toString();
        final Constructor<?>[] constructors = this.getClass().getConstructors();
        Label_0186: {
            if (aB(constructors) == null) {
                final int length = constructors.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final Constructor<?> constructor = constructors[i];
                        if (constructor.getParameterTypes().length == 0) {
                            if (constructor != null) {
                                break Label_0186;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append(this.getClass());
                            sb.append(" does not have a constructor that takes a Bundle argument or a default constructor. Controllers must have one of these in order to restore their states.");
                            throw new RuntimeException(sb.toString());
                        }
                        else {
                            ++i;
                        }
                    }
                    final Constructor<?> constructor = null;
                    continue;
                }
            }
        }
        new g8.c(this);
    }
    
    public static Constructor aB(final Constructor[] array) {
        for (final Constructor constructor : array) {
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0] == Bundle.class) {
                return constructor;
            }
        }
        return null;
    }
    
    public void AB(final View view, final Bundle bundle) {
    }
    
    public void BB(final Bundle bundle) {
    }
    
    public void CB(final View view, final Bundle bundle) {
    }
    
    public final void DB() {
        final Bundle h = this.h;
        if (h != null && this.p != null) {
            this.zB(h);
            final Iterator iterator = new ArrayList(this.E).iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).f(this, this.h);
            }
            this.h = null;
        }
    }
    
    public final void EB(final Router router) {
        if (router instanceof com.bluelinelabs.conductor.d && this.D.remove(router)) {
            router.c(true);
        }
    }
    
    public final void FB(final e e) {
        this.E.remove(e);
    }
    
    public final void GB(Context xa) {
        final View q = this.q;
        Object o = xa;
        if (q != null) {
            Object context;
            if ((context = xa) == null) {
                context = q.getContext();
            }
            if (!this.i && !this.x) {
                this.JB(this.q);
            }
            final Iterator iterator = new ArrayList(this.E).iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).u(this, this.q);
            }
            this.uB(this.q);
            final ViewAttachHandler c = this.C;
            if (c != null) {
                final View q2 = this.q;
                q2.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)c);
                if (c.k != null && q2 instanceof ViewGroup) {
                    ViewAttachHandler.a((ViewGroup)q2).removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)c.k);
                    c.k = null;
                }
            }
            this.C = null;
            this.n = false;
            if (this.i) {
                this.H = new WeakReference<View>(this.q);
            }
            this.q = null;
            final Iterator iterator2 = new ArrayList(this.E).iterator();
            while (iterator2.hasNext()) {
                ((e)iterator2.next()).n(this);
            }
            final Iterator iterator3 = this.D.iterator();
            while (true) {
                o = context;
                if (!iterator3.hasNext()) {
                    break;
                }
                ((com.bluelinelabs.conductor.d)iterator3.next()).X();
            }
        }
        if (this.i) {
            if ((xa = o) == null) {
                xa = this.XA();
            }
            if (this.J) {
                this.qB((Context)xa);
            }
            if (!this.j) {
                final Iterator iterator4 = new ArrayList(this.E).iterator();
                while (iterator4.hasNext()) {
                    ((e)iterator4.next()).t(this);
                }
                this.j = true;
                this.tB();
                this.r = null;
                final Iterator iterator5 = new ArrayList(this.E).iterator();
                while (iterator5.hasNext()) {
                    ((e)iterator5.next()).m(this);
                }
            }
        }
    }
    
    public final void HB(final String[] array, final int n) {
        this.F.addAll(Arrays.asList(array));
        final Controller$c controller$c = new Controller$c((BaseScreen)this, array, n);
        if (this.p != null) {
            controller$c.execute();
        }
        else {
            this.G.add((d)controller$c);
        }
    }
    
    public final void IB() {
        for (final com.bluelinelabs.conductor.d d : this.D) {
            if (d.i == null || ((Router)d).h == null) {
                final View viewById = this.q.findViewById(d.j);
                if (!(viewById instanceof ViewGroup)) {
                    continue;
                }
                d.Z(this, (ViewGroup)viewById);
                ((Router)d).J();
            }
        }
    }
    
    public final void JB(final View view) {
        this.x = true;
        this.g = new Bundle(this.getClass().getClassLoader());
        final SparseArray sparseArray = new SparseArray();
        view.saveHierarchyState(sparseArray);
        this.g.putSparseParcelableArray("Controller.viewState.hierarchy", sparseArray);
        final Bundle bundle = new Bundle(this.getClass().getClassLoader());
        this.CB(view, bundle);
        this.g.putBundle("Controller.viewState.bundle", bundle);
        final Iterator iterator = new ArrayList(this.E).iterator();
        while (iterator.hasNext()) {
            ((e)iterator.next()).h(this, this.g);
        }
    }
    
    public final void KB(final boolean y) {
        if (this.y != y) {
            this.y = y;
            final Iterator iterator = this.D.iterator();
            while (iterator.hasNext()) {
                ((com.bluelinelabs.conductor.d)iterator.next()).Y(y);
            }
            if (!y) {
                final View q = this.q;
                if (q != null && this.o) {
                    this.WA(q, false, false);
                    if (this.q == null) {
                        final ViewParent parent = q.getParent();
                        final ViewGroup h = this.p.h;
                        if (parent == h) {
                            h.removeView(q);
                        }
                    }
                }
            }
        }
    }
    
    public final void LB(final boolean b) {
        final boolean b2 = this.k && !this.m && !this.l;
        this.l = true;
        if (b2) {
            this.p.o();
        }
    }
    
    public final void MB(final boolean m) {
        final boolean b = this.k && this.l && this.m != m;
        this.m = m;
        if (b) {
            this.p.o();
        }
    }
    
    public final void NB(final Controller controller) {
        if (this.t == null) {
            String s;
            if (controller != null) {
                s = controller.s;
            }
            else {
                s = null;
            }
            this.t = s;
            return;
        }
        throw new RuntimeException("Target controller already set. A controller's target may only be set once.");
    }
    
    public final void OB(final Intent intent) {
        final Controller$a controller$a = new Controller$a((l)this, intent);
        if (this.p != null) {
            controller$a.execute();
        }
        else {
            this.G.add((d)controller$a);
        }
    }
    
    public final void RA(final e e) {
        if (!this.E.contains(e)) {
            this.E.add(e);
        }
    }
    
    public final void SA(final View view) {
        if (!(this.v = (this.p == null || view.getParent() != this.p.h))) {
            if (!this.i) {
                final Controller r = this.r;
                if (r != null && !r.k) {
                    this.w = true;
                    return;
                }
                this.w = false;
                this.x = false;
                final Iterator iterator = new ArrayList(this.E).iterator();
                while (iterator.hasNext()) {
                    ((e)iterator.next()).p(this, view);
                }
                this.k = true;
                this.u = this.p.g;
                this.lB(view);
                if (this.l && !this.m) {
                    this.p.o();
                }
                final Iterator iterator2 = new ArrayList(this.E).iterator();
                while (iterator2.hasNext()) {
                    ((e)iterator2.next()).i(this, view);
                }
                for (final com.bluelinelabs.conductor.d d : this.D) {
                    final Iterator<c8.e> iterator4 = ((Router)d).a.iterator();
                    while (iterator4.hasNext()) {
                        final Controller a = iterator4.next().a;
                        if (a.w) {
                            a.SA(a.q);
                        }
                    }
                    if (d.i != null && ((Router)d).h != null) {
                        ((Router)d).J();
                    }
                }
            }
        }
    }
    
    public final void TA(final c c, final ControllerChangeType controllerChangeType) {
        if (!controllerChangeType.isEnter) {
            this.I = false;
            final Iterator iterator = this.D.iterator();
            while (iterator.hasNext()) {
                ((com.bluelinelabs.conductor.d)iterator.next()).Y(false);
            }
        }
        this.mB(c, controllerChangeType);
        final Iterator iterator2 = new ArrayList(this.E).iterator();
        while (iterator2.hasNext()) {
            ((e)iterator2.next()).d(this, c, controllerChangeType);
        }
        if (this.i && !this.n && !this.k) {
            final WeakReference<View> h = this.H;
            if (h != null) {
                final View view = h.get();
                if (this.p.h != null && view != null) {
                    final ViewParent parent = view.getParent();
                    final ViewGroup h2 = this.p.h;
                    if (parent == h2) {
                        h2.removeView(view);
                    }
                }
                this.H = null;
            }
        }
        c.getClass();
    }
    
    public final void UA(final c c, final ControllerChangeType controllerChangeType) {
        if (!controllerChangeType.isEnter) {
            this.I = true;
            final Iterator iterator = this.D.iterator();
            while (iterator.hasNext()) {
                ((com.bluelinelabs.conductor.d)iterator.next()).Y(true);
            }
        }
        this.nB(c, controllerChangeType);
        final Iterator iterator2 = new ArrayList(this.E).iterator();
        while (iterator2.hasNext()) {
            ((e)iterator2.next()).e(this, c, controllerChangeType);
        }
    }
    
    public final void VA(final boolean b) {
        this.i = true;
        final Router p = this.p;
        if (p != null) {
            p.W(this.s);
        }
        final Iterator iterator = this.D.iterator();
        while (iterator.hasNext()) {
            ((com.bluelinelabs.conductor.d)iterator.next()).c(false);
        }
        if (!this.k) {
            this.GB(null);
        }
        else if (b) {
            this.WA(this.q, true, false);
        }
    }
    
    public final void WA(final View view, final boolean b, final boolean b2) {
        if (!this.v) {
            final Iterator iterator = this.D.iterator();
            while (iterator.hasNext()) {
                ((Router)iterator.next()).G();
            }
        }
        final boolean b3 = !b2 && (b || this.B == RetainViewMode.RELEASE_DETACH || this.i);
        if (this.k) {
            if (!this.w) {
                final Iterator iterator2 = new ArrayList(this.E).iterator();
                while (iterator2.hasNext()) {
                    ((e)iterator2.next()).v(this, view);
                }
                this.k = false;
                this.vB(view);
                if (this.l && !this.m) {
                    this.p.o();
                }
                final Iterator iterator3 = new ArrayList(this.E).iterator();
                while (iterator3.hasNext()) {
                    ((e)iterator3.next()).o(this, view);
                }
            }
            else {
                this.k = false;
            }
        }
        this.w = false;
        if (b3) {
            Context context;
            if (view != null) {
                context = view.getContext();
            }
            else {
                context = null;
            }
            this.GB(context);
        }
    }
    
    public final Activity XA() {
        final Router p = this.p;
        Activity d;
        if (p != null) {
            d = p.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    public final Context YA() {
        final Activity xa = this.XA();
        Context applicationContext;
        if (xa != null) {
            applicationContext = ((Context)xa).getApplicationContext();
        }
        else {
            applicationContext = null;
        }
        return applicationContext;
    }
    
    public final Bundle ZA() {
        return this.f;
    }
    
    public final com.bluelinelabs.conductor.d bB(final ViewGroup viewGroup) {
        return this.cB(viewGroup, null, true);
    }
    
    public final com.bluelinelabs.conductor.d cB(final ViewGroup viewGroup, final String s, final boolean b) {
        final int id = ((View)viewGroup).getId();
        if (id != -1) {
            final Router router = null;
            final Iterator iterator = this.D.iterator();
            boolean b2;
            boolean b3;
            Object o;
            do {
                final boolean hasNext = iterator.hasNext();
                b3 = false;
                o = router;
                if (!hasNext) {
                    break;
                }
                o = iterator.next();
                Label_0137: {
                    if (!((com.bluelinelabs.conductor.d)o).m && ((Router)o).h == null) {
                        final String k = ((com.bluelinelabs.conductor.d)o).k;
                        if (k == null) {
                            throw new IllegalStateException("Host ID can't be variable with a null tag");
                        }
                        if (k.equals(s)) {
                            ((com.bluelinelabs.conductor.d)o).j = id;
                            break Label_0137;
                        }
                    }
                    if (((com.bluelinelabs.conductor.d)o).j != id || !TextUtils.equals((CharSequence)s, (CharSequence)((com.bluelinelabs.conductor.d)o).k)) {
                        b2 = false;
                        continue;
                    }
                }
                b2 = true;
            } while (!b2);
            com.bluelinelabs.conductor.d d2;
            if (o == null) {
                final com.bluelinelabs.conductor.d d = new com.bluelinelabs.conductor.d(((View)viewGroup).getId(), s, b);
                d.Z(this, viewGroup);
                this.D.add(d);
                d2 = d;
                if (this.I) {
                    d.Y(true);
                    d2 = d;
                }
            }
            else {
                int n = b3 ? 1 : 0;
                if (((com.bluelinelabs.conductor.d)o).i != null) {
                    n = (b3 ? 1 : 0);
                    if (((Router)o).h != null) {
                        n = 1;
                    }
                }
                d2 = (com.bluelinelabs.conductor.d)o;
                if (n == 0) {
                    ((com.bluelinelabs.conductor.d)o).Z(this, viewGroup);
                    ((Router)o).J();
                    d2 = (com.bluelinelabs.conductor.d)o;
                }
            }
            return d2;
        }
        throw new IllegalStateException("You must set an id on your container.");
    }
    
    public final ArrayList dB() {
        final ArrayList list = new ArrayList(this.D.size());
        list.addAll(this.D);
        return list;
    }
    
    public final Resources eB() {
        final Activity xa = this.XA();
        Resources resources;
        if (xa != null) {
            resources = ((Context)xa).getResources();
        }
        else {
            resources = null;
        }
        return resources;
    }
    
    public final Controller fB() {
        if (this.t != null) {
            return this.p.i().g(this.t);
        }
        return null;
    }
    
    public boolean gB() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = this.D.iterator();
        while (iterator.hasNext()) {
            list.addAll(((Router)iterator.next()).e());
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Comparator<c8.e>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                return ((c8.e)o2).f - ((c8.e)o).f;
            }
        });
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Controller a = ((c8.e)iterator2.next()).a;
            if (a.k && a.p.m()) {
                return true;
            }
        }
        return false;
    }
    
    public void hB(final Activity activity) {
    }
    
    public void iB(final int n, final int n2, final Intent intent) {
    }
    
    public final boolean isAttached() {
        return this.k;
    }
    
    public final boolean isDestroyed() {
        return this.j;
    }
    
    public void jB(final Activity activity) {
    }
    
    public void kB(final Activity activity) {
    }
    
    public void lB(final View view) {
    }
    
    public void mB(final c c, final ControllerChangeType controllerChangeType) {
    }
    
    public void nB(final c c, final ControllerChangeType controllerChangeType) {
    }
    
    public final void oB() {
        final Activity d = this.p.d();
        if (d != null && !this.J) {
            final Iterator iterator = new ArrayList(this.E).iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).q(this);
            }
            this.J = true;
            this.pB(d);
            final Iterator iterator2 = new ArrayList(this.E).iterator();
            while (iterator2.hasNext()) {
                ((e)iterator2.next()).j(d, this);
            }
        }
        final Iterator iterator3 = this.D.iterator();
        while (iterator3.hasNext()) {
            ((Router)iterator3.next()).u();
        }
    }
    
    public void pB(final Activity activity) {
    }
    
    public final void qB(final Context context) {
        for (final Router router : this.D) {
            final Iterator<c8.e> iterator2 = router.a.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().a.qB(context);
            }
            final Iterator iterator3 = router.d.iterator();
            while (iterator3.hasNext()) {
                ((Controller)iterator3.next()).qB(context);
            }
        }
        if (this.J) {
            final Iterator iterator4 = new ArrayList(this.E).iterator();
            while (iterator4.hasNext()) {
                ((e)iterator4.next()).r(context, this);
            }
            this.J = false;
            final Iterator iterator5 = new ArrayList(this.E).iterator();
            while (iterator5.hasNext()) {
                ((e)iterator5.next()).k(this);
            }
        }
    }
    
    public void rB(final Menu menu, final MenuInflater menuInflater) {
    }
    
    public abstract View sB(final LayoutInflater p0, final ViewGroup p1, final Bundle p2);
    
    public final void startActivityForResult(final Intent intent, final int n) {
        final Controller$b controller$b = new Controller$b(this, intent, n);
        if (this.p != null) {
            controller$b.execute();
        }
        else {
            this.G.add((d)controller$b);
        }
    }
    
    public final void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) throws IntentSender$SendIntentException {
        this.p.U(this.s, intentSender, n);
    }
    
    public void tB() {
    }
    
    public void uB(final View view) {
    }
    
    public void vB(final View view) {
    }
    
    public boolean wB(final MenuItem menuItem) {
        return false;
    }
    
    public void xB(final Menu menu) {
    }
    
    public void yB(final int n, final String[] array, final int[] array2) {
    }
    
    public void zB(final Bundle bundle) {
    }
    
    public enum RetainViewMode
    {
        RELEASE_DETACH, 
        RETAIN_DETACH;
    }
    
    public abstract static class e
    {
        public void d(final Controller controller, final c c, final ControllerChangeType controllerChangeType) {
        }
        
        public void e(final Controller controller, final c c, final ControllerChangeType controllerChangeType) {
        }
        
        public void f(final Controller controller, final Bundle bundle) {
        }
        
        public void g(final Controller controller, final Bundle bundle) {
        }
        
        public void h(final Controller controller, final Bundle bundle) {
        }
        
        public void i(final Controller controller, final View view) {
        }
        
        public void j(final Activity activity, final Controller controller) {
        }
        
        public void k(final Controller controller) {
        }
        
        public void l(final Controller controller, final View view) {
        }
        
        public void m(final Controller controller) {
        }
        
        public void n(final Controller controller) {
        }
        
        public void o(final Controller controller, final View view) {
        }
        
        public void p(final Controller controller, final View view) {
        }
        
        public void q(final Controller controller) {
        }
        
        public void r(final Context context, final Controller controller) {
        }
        
        public void s(final Controller controller) {
        }
        
        public void t(final Controller controller) {
        }
        
        public void u(final Controller controller, final View view) {
        }
        
        public void v(final Controller controller, final View view) {
        }
    }
}
