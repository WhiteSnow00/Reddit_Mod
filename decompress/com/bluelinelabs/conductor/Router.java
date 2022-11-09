// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import com.bluelinelabs.conductor.internal.ViewAttachHandler;
import android.content.Context;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.app.Activity;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.Intent;
import android.os.Parcelable;
import android.os.BaseBundle;
import ak0.m;
import java.lang.reflect.Constructor;
import android.os.Bundle;
import java.util.ArrayDeque;
import ah2.f;
import sb1.b;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import java.util.Collections;
import android.view.View;
import java.util.Iterator;
import c8.e;
import android.view.ViewGroup;
import java.util.ArrayList;
import c8.a;

public abstract class Router
{
    public final a a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public PopRootControllerMode e;
    public boolean f;
    public boolean g;
    public ViewGroup h;
    
    public Router() {
        this.a = new a();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = PopRootControllerMode.POP_ROOT_CONTROLLER_BUT_NOT_VIEW;
        this.f = false;
        this.g = false;
    }
    
    public static void b(final Router router, final ArrayList list) {
        router.getClass();
        final ArrayList list2 = new ArrayList(router.a.a());
        final Iterator<e> j0 = router.a.j0();
        while (j0.hasNext()) {
            list2.add(j0.next().a);
        }
        for (final Controller controller : list2) {
            final View q = controller.q;
            if (q != null) {
                list.add(q);
            }
            final Iterator iterator2 = controller.dB().iterator();
            while (iterator2.hasNext()) {
                b((Router)iterator2.next(), list);
            }
        }
    }
    
    public static ArrayList l(final Iterator iterator, final boolean b) {
        final ArrayList list = new ArrayList();
        int n = 1;
        while (iterator.hasNext()) {
            final e e = iterator.next();
            if (n != 0) {
                list.add(e);
            }
            final boolean b2 = (n = ((e.b() != null && !e.b().i()) ? 1 : 0)) != 0;
            if (b && (n = (b2 ? 1 : 0)) == 0) {
                break;
            }
        }
        Collections.reverse(list);
        return list;
    }
    
    public final void A() {
        for (int i = 0; i < this.c.size(); ++i) {
            com.bluelinelabs.conductor.c.d((c.b)this.c.get(i));
        }
        this.c.clear();
    }
    
    public final boolean B(final Controller controller) {
        com.bluelinelabs.conductor.internal.a.a();
        final e c = this.a.c();
        boolean b = true;
        if (c != null && c.a == controller) {
            this.V(this.a.d());
            this.y(this.a.c(), c, false);
        }
        else {
            final Iterator<e> iterator = this.a.iterator();
            final e e = null;
            c b2;
            if (c != null) {
                b2 = c.b();
            }
            else {
                b2 = null;
            }
            final boolean b3 = b2 != null && !b2.i();
            e e2 = null;
            e e3;
            while (true) {
                e3 = e;
                if (!iterator.hasNext()) {
                    break;
                }
                final e e4 = iterator.next();
                final Controller a = e4.a;
                if (a == controller) {
                    this.V(e4);
                    iterator.remove();
                    e2 = e4;
                }
                else {
                    if (e2 == null) {
                        continue;
                    }
                    e3 = e;
                    if (!b3) {
                        break;
                    }
                    e3 = e;
                    if (!a.k) {
                        e3 = e4;
                        break;
                    }
                    break;
                }
            }
            if (e2 != null) {
                this.y(e3, e2, false);
            }
        }
        if (this.e == PopRootControllerMode.POP_ROOT_CONTROLLER_AND_VIEW) {
            if (c == null) {
                b = false;
            }
            return b;
        }
        return this.a.f.isEmpty() ^ true;
    }
    
    public final boolean C() {
        com.bluelinelabs.conductor.internal.a.a();
        final e c = this.a.c();
        if (c != null) {
            return this.B(c.a);
        }
        throw new IllegalStateException("Trying to pop the current controller when there are none on the backstack.");
    }
    
    public final void D() {
        com.bluelinelabs.conductor.internal.a.a();
        com.bluelinelabs.conductor.internal.a.a();
        if (this.a.a() > 1) {
            this.F((e)CollectionsKt___CollectionsKt.B1((Collection)this.a.f), null);
        }
    }
    
    public final boolean E(final String s) {
        com.bluelinelabs.conductor.internal.a.a();
        com.bluelinelabs.conductor.internal.a.a();
        for (final e e : this.a) {
            if (s.equals(e.b)) {
                this.F(e, null);
                return true;
            }
        }
        return false;
    }
    
    public final void F(final e e, final b b) {
        if (this.a.a() > 0) {
            final e c = this.a.c();
            final ArrayList list = new ArrayList();
            final Iterator<e> j0 = this.a.j0();
            while (j0.hasNext()) {
                final e e2 = j0.next();
                list.add(e2);
                if (e2 == e) {
                    break;
                }
            }
            Object o;
            if ((o = b) == null && (o = c.a.A) == null) {
                o = c.d;
            }
            this.P(list, (c)o);
        }
    }
    
    public final void G() {
        this.c.clear();
        for (final e e : this.a) {
            final boolean a = com.bluelinelabs.conductor.c.a(e.a.s);
            final boolean b = true;
            if (a) {
                e.a.u = true;
            }
            final Controller a2 = e.a;
            boolean u = b;
            if (!a2.u) {
                u = (a2.k && b);
            }
            a2.u = u;
            final Iterator iterator2 = a2.D.iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).G();
            }
        }
    }
    
    public final void H(final e e) {
        com.bluelinelabs.conductor.internal.a.a();
        final e c = this.a.c();
        this.I(e);
        this.y(e, c, true);
    }
    
    public void I(final e e) {
        final a a = this.a;
        final Controller a2 = e.a;
        a.getClass();
        ah2.f.f((Object)a2, "controller");
        final ArrayDeque f = a.f;
        boolean b = false;
        Label_0085: {
            if (!(f instanceof Collection) || !f.isEmpty()) {
                final Iterator iterator = f.iterator();
                while (iterator.hasNext()) {
                    if (ah2.f.a((Object)((e)iterator.next()).a, (Object)a2)) {
                        b = true;
                        break Label_0085;
                    }
                }
            }
            b = false;
        }
        if (!b) {
            final a a3 = this.a;
            a3.getClass();
            a3.f.push(e);
            return;
        }
        throw new IllegalStateException("Trying to push a controller that already exists on the backstack.");
    }
    
    public final void J() {
        com.bluelinelabs.conductor.internal.a.a();
        final Iterator<e> j0 = this.a.j0();
        while (j0.hasNext()) {
            final e e = j0.next();
            final Controller a = e.a;
            if (a.u) {
                this.z(e, null, true, (c)new e8.d(false));
            }
            else {
                this.R(a);
            }
        }
    }
    
    public final void K(final c.d d) {
        this.b.remove(d);
    }
    
    public final void L(final e e) {
        com.bluelinelabs.conductor.internal.a.a();
        final e c = this.a.c();
        if (!this.a.f.isEmpty()) {
            this.V(this.a.d());
        }
        final c b = e.b();
        if (c != null) {
            final c b2 = c.b();
            boolean b3 = false;
            final boolean b4 = b2 == null || c.b().i();
            if (b == null || b.i()) {
                b3 = true;
            }
            if (!b4 && b3) {
                final Iterator iterator = l(this.a.iterator(), true).iterator();
                while (iterator.hasNext()) {
                    this.z(null, (e)iterator.next(), true, b);
                }
            }
        }
        this.I(e);
        if (b != null) {
            b.l();
        }
        e.c(b);
        this.y(e, c, true);
    }
    
    public abstract void M(final String p0, final int p1, final String[] p2);
    
    public void N(final Bundle bundle) {
        final Bundle bundle2 = (Bundle)bundle.getParcelable("Router.backstack");
        final a a = this.a;
        a.getClass();
        ah2.f.f((Object)bundle2, "savedInstanceState");
        final ArrayList parcelableArrayList = bundle2.getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            Collections.reverse(parcelableArrayList);
            ArrayDeque f;
            Bundle bundle4;
            Object o;
            Class y0;
            Constructor[] constructors;
            Constructor ab;
            Bundle bundle5;
            Controller i;
            Bundle bundle6;
            Iterator iterator2;
            d d;
            Bundle bundle7;
            c e;
            c e2;
            int n;
            int length;
            Constructor constructor = null;
            Controller controller;
            Label_0175_Outer:Label_0178_Outer:
            for (Bundle bundle3 : parcelableArrayList) {
                f = a.f;
                ah2.f.c((Object)bundle3);
                bundle4 = bundle3.getBundle("RouterTransaction.controller.bundle");
                ah2.f.c((Object)bundle4);
                o = ((BaseBundle)bundle4).getString("Controller.className");
                y0 = yd.a.Y0((String)o, false);
                constructors = y0.getConstructors();
                ab = Controller.aB(constructors);
                bundle5 = bundle4.getBundle("Controller.args");
                if (bundle5 != null) {
                    bundle5.setClassLoader(y0.getClassLoader());
                }
            Block_9_Outer:
                while (true) {
                    if (ab != null) {
                        try {
                            i = ab.newInstance(bundle5);
                            while (true) {
                            Label_0218:
                                while (true) {
                                    i.getClass();
                                    bundle6 = bundle4.getBundle("Controller.viewState");
                                    if ((i.g = bundle6) != null) {
                                        bundle6.setClassLoader(i.getClass().getClassLoader());
                                    }
                                    i.s = ((BaseBundle)bundle4).getString("Controller.instanceId");
                                    i.t = ((BaseBundle)bundle4).getString("Controller.target.instanceId");
                                    i.F.addAll(bundle4.getStringArrayList("Controller.requestedPermissions"));
                                    i.z = com.bluelinelabs.conductor.c.e(bundle4.getBundle("Controller.overriddenPushHandler"));
                                    i.A = com.bluelinelabs.conductor.c.e(bundle4.getBundle("Controller.overriddenPopHandler"));
                                    i.u = ((BaseBundle)bundle4).getBoolean("Controller.needsAttach");
                                    i.B = Controller.RetainViewMode.values()[((BaseBundle)bundle4).getInt("Controller.retainViewMode", 0)];
                                    iterator2 = bundle4.getParcelableArrayList("Controller.childRouters").iterator();
                                    while (iterator2.hasNext()) {
                                        o = iterator2.next();
                                        d = new d();
                                        if (d.i == null) {
                                            d.i = i;
                                        }
                                        d.N((Bundle)o);
                                        i.D.add(d);
                                    }
                                    bundle7 = bundle4.getBundle("Controller.savedState");
                                    if ((i.h = bundle7) != null) {
                                        bundle7.setClassLoader(i.getClass().getClassLoader());
                                    }
                                    i.DB();
                                    e = com.bluelinelabs.conductor.c.e(bundle3.getBundle("RouterTransaction.pushControllerChangeHandler"));
                                    e2 = com.bluelinelabs.conductor.c.e(bundle3.getBundle("RouterTransaction.popControllerChangeHandler"));
                                    o = ((BaseBundle)bundle3).getString("RouterTransaction.tag");
                                    f.push(new e(i, (String)o, e, e2, ((BaseBundle)bundle3).getBoolean("RouterTransaction.attachedToRouter"), ((BaseBundle)bundle3).getInt("RouterTransaction.transactionIndex")));
                                    continue Label_0175_Outer;
                                    Label_0210: {
                                        ++n;
                                    }
                                    while (true) {
                                        Label_0186: {
                                            break Label_0186;
                                            length = constructors.length;
                                            n = 0;
                                            break Label_0186;
                                            break Label_0218;
                                        }
                                        iftrue(Label_0216:)(n >= length);
                                        constructor = constructors[n];
                                        iftrue(Label_0210:)(constructor.getParameterTypes().length != 0);
                                        continue Block_9_Outer;
                                    }
                                    Label_0216:
                                    constructor = null;
                                    break Label_0218;
                                    controller.f.putAll(bundle5);
                                    i = controller;
                                    continue Label_0178_Outer;
                                }
                                controller = (i = (Controller)constructor.newInstance(new Object[0]));
                                iftrue(Label_0175:)(bundle5 == null);
                                continue;
                            }
                        }
                        catch (final Exception ex) {
                            throw new RuntimeException(m.k(ex, b.l("An exception occurred while creating a new instance of ", (String)o, ". ")), ex);
                        }
                        break;
                    }
                    continue;
                }
            }
        }
        this.e = PopRootControllerMode.values()[((BaseBundle)bundle).getInt("Router.popRootControllerMode")];
        final Iterator<e> j0 = this.a.j0();
        while (j0.hasNext()) {
            this.R(j0.next().a);
        }
    }
    
    public void O(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        final a a = this.a;
        a.getClass();
        final ArrayList list = new ArrayList<BaseBundle>(a.f.size());
        for (final e e : a.f) {
            e.getClass();
            final Bundle bundle3 = new Bundle();
            final Controller a2 = e.a;
            if (!a2.x) {
                final View q = a2.q;
                if (q != null) {
                    a2.JB(q);
                }
            }
            final Bundle bundle4 = new Bundle();
            ((BaseBundle)bundle4).putString("Controller.className", a2.getClass().getName());
            bundle4.putBundle("Controller.viewState", a2.g);
            bundle4.putBundle("Controller.args", a2.f);
            ((BaseBundle)bundle4).putString("Controller.instanceId", a2.s);
            ((BaseBundle)bundle4).putString("Controller.target.instanceId", a2.t);
            bundle4.putStringArrayList("Controller.requestedPermissions", (ArrayList)a2.F);
            ((BaseBundle)bundle4).putBoolean("Controller.needsAttach", a2.u || a2.k);
            ((BaseBundle)bundle4).putInt("Controller.retainViewMode", a2.B.ordinal());
            final c z = a2.z;
            if (z != null) {
                bundle4.putBundle("Controller.overriddenPushHandler", z.m());
            }
            final c a3 = a2.A;
            if (a3 != null) {
                bundle4.putBundle("Controller.overriddenPopHandler", a3.m());
            }
            final ArrayList list2 = new ArrayList<Bundle>(a2.D.size());
            for (final d d : a2.D) {
                final Bundle bundle5 = new Bundle();
                d.O(bundle5);
                list2.add(bundle5);
            }
            bundle4.putParcelableArrayList("Controller.childRouters", list2);
            final Bundle bundle6 = new Bundle(a2.getClass().getClassLoader());
            a2.BB(bundle6);
            final Iterator iterator3 = new ArrayList(a2.E).iterator();
            while (iterator3.hasNext()) {
                ((Controller.e)iterator3.next()).g(a2, bundle6);
            }
            bundle4.putBundle("Controller.savedState", bundle6);
            bundle3.putBundle("RouterTransaction.controller.bundle", bundle4);
            final c c = e.c;
            if (c != null) {
                bundle3.putBundle("RouterTransaction.pushControllerChangeHandler", c.m());
            }
            final c d2 = e.d;
            if (d2 != null) {
                bundle3.putBundle("RouterTransaction.popControllerChangeHandler", d2.m());
            }
            ((BaseBundle)bundle3).putString("RouterTransaction.tag", e.b);
            ((BaseBundle)bundle3).putInt("RouterTransaction.transactionIndex", e.f);
            ((BaseBundle)bundle3).putBoolean("RouterTransaction.attachedToRouter", e.e);
            list.add((BaseBundle)bundle3);
        }
        bundle2.putParcelableArrayList("Backstack.entries", list);
        bundle.putParcelable("Router.backstack", (Parcelable)bundle2);
        ((BaseBundle)bundle).putInt("Router.popRootControllerMode", this.e.ordinal());
    }
    
    public void P(final List<e> list, final c c) {
        com.bluelinelabs.conductor.internal.a.a();
        final ArrayList e = this.e();
        final ArrayList l = l(this.a.iterator(), false);
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = l(this.a.iterator(), false).iterator();
        while (iterator.hasNext()) {
            final View q = ((e)iterator.next()).a.q;
            if (q != null) {
                list2.add(q);
            }
        }
        for (final Router router : this.j()) {
            if (router.h == this.h) {
                b(router, list2);
            }
        }
        int childCount = this.h.getChildCount();
        while (true) {
            final int n = childCount - 1;
            if (n < 0) {
                break;
            }
            final View child = this.h.getChildAt(n);
            childCount = n;
            if (list2.contains(child)) {
                continue;
            }
            this.h.removeView(child);
            childCount = n;
        }
        final ArrayList<Comparable> list3 = new ArrayList<Comparable>(list.size());
        for (final e e2 : list) {
            final g8.f k = this.k();
            e2.getClass();
            ah2.f.f((Object)k, "indexer");
            if (e2.f == -1) {
                final int n2 = k.a + 1;
                k.a = n2;
                e2.f = n2;
            }
            list3.add(e2.f);
        }
        Collections.sort(list3);
        for (int i = 0; i < list.size(); ++i) {
            ((e)list.get(i)).f = list3.get(i);
        }
        int j = 0;
    Label_0375:
        while (j < list.size()) {
            final Controller a = list.get(j).a;
            int n4;
            final int n3 = n4 = j + 1;
            while (true) {
                j = n3;
                if (n4 >= list.size()) {
                    continue Label_0375;
                }
                if (((e)list.get(n4)).a == a) {
                    break;
                }
                ++n4;
            }
            throw new IllegalStateException("Trying to push the same controller to the backstack more than once.");
        }
        final a a2 = this.a;
        a2.getClass();
        a2.f.clear();
        final Iterator iterator4 = list.iterator();
        while (iterator4.hasNext()) {
            a2.f.push(iterator4.next());
        }
        final ArrayList<e> list4 = new ArrayList<e>();
        Label_0541:
        for (final e e3 : e) {
            final Iterator iterator6 = list.iterator();
            while (true) {
                while (iterator6.hasNext()) {
                    if (e3.a == ((e)iterator6.next()).a) {
                        final boolean b = true;
                        if (!b) {
                            e3.a.i = true;
                            list4.add(e3);
                            continue Label_0541;
                        }
                        continue Label_0541;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
        final Iterator<e> j2 = this.a.j0();
        while (j2.hasNext()) {
            final e e4 = j2.next();
            e4.e = true;
            this.R(e4.a);
        }
        if (list.size() > 0) {
            final ArrayList<Object> list5 = new ArrayList<Object>(list);
            Collections.reverse(list5);
            final ArrayList m = l(list5.iterator(), false);
            final boolean b2 = m.size() <= 0 || !e.contains(m.get(0));
            int n6 = 0;
            Label_0827: {
                Label_0812: {
                    if (m.size() == l.size()) {
                        for (int n5 = 0; n5 < l.size(); ++n5) {
                            if (((e)l.get(n5)).a != ((e)m.get(n5)).a) {
                                break Label_0812;
                            }
                        }
                        n6 = 1;
                        break Label_0827;
                    }
                }
                n6 = 0;
            }
            if ((n6 ^ 0x1) != 0x0) {
                e e5;
                if (l.size() > 0) {
                    e5 = l.get(0);
                }
                else {
                    e5 = null;
                }
                final e e6 = m.get(0);
                if (e5 == null || e5.a != e6.a) {
                    if (e5 != null) {
                        c.a(e5.a.s);
                    }
                    this.z(e6, e5, b2, c);
                }
                for (int n7 = l.size() - 1; n7 > 0; --n7) {
                    final e e7 = l.get(n7);
                    if (!m.contains(e7)) {
                        Object c2;
                        if (c != null) {
                            c2 = c.c();
                        }
                        else {
                            c2 = new e8.d();
                        }
                        ((c)c2).l();
                        c.a(e7.a.s);
                        if (e7.a.q != null) {
                            this.z(null, e7, b2, (c)c2);
                        }
                    }
                }
                for (int n8 = 1; n8 < m.size(); ++n8) {
                    final e e8 = m.get(n8);
                    if (!l.contains(e8)) {
                        this.z(e8, m.get(n8 - 1), true, e8.b());
                    }
                }
            }
        }
        else {
            for (int n9 = l.size() - 1; n9 >= 0; --n9) {
                final e e9 = l.get(n9);
                Object c3;
                if (c != null) {
                    c3 = c.c();
                }
                else {
                    c3 = new e8.d();
                }
                c.a(e9.a.s);
                this.z(null, e9, false, (c)c3);
            }
        }
        for (final e e10 : list4) {
            final Iterator iterator8 = this.c.iterator();
            boolean b3 = false;
            while (iterator8.hasNext()) {
                if (((c.b)iterator8.next()).b == e10.a) {
                    b3 = true;
                }
            }
            if (!b3) {
                e10.a.VA(false);
            }
        }
    }
    
    public final void Q(final e e) {
        com.bluelinelabs.conductor.internal.a.a();
        this.P(Collections.singletonList(e), e.b());
    }
    
    public void R(final Controller controller) {
        if (controller.p != this) {
            controller.p = this;
            controller.DB();
            final Iterator<g8.d> iterator = controller.G.iterator();
            while (iterator.hasNext()) {
                iterator.next().execute();
            }
            controller.G.clear();
        }
        else {
            controller.DB();
        }
        controller.oB();
    }
    
    public abstract void S(final Intent p0);
    
    public abstract void T(final int p0, final String p1, final Intent p2);
    
    public abstract void U(final String p0, final IntentSender p1, final int p2) throws IntentSender$SendIntentException;
    
    public final void V(final e e) {
        final Controller a = e.a;
        if (!a.j) {
            this.d.add(a);
            e.a.RA((Controller.e)new Router$b(this));
        }
    }
    
    public abstract void W(final String p0);
    
    public final void a(final c.d d) {
        if (!this.b.contains(d)) {
            this.b.add(d);
        }
    }
    
    public void c(final boolean b) {
        this.e = PopRootControllerMode.POP_ROOT_CONTROLLER_AND_VIEW;
        final a a = this.a;
        a.getClass();
        final ArrayList list = new ArrayList();
        while (!a.f.isEmpty()) {
            list.add(a.d());
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.V((e)iterator.next());
        }
        if (b && list.size() > 0) {
            final e e = list.get(0);
            e.a.RA((Controller.e)new Router$a(this, list));
            c c;
            if ((c = e.a.A) == null) {
                c = e.d;
            }
            this.z(null, e, false, c);
        }
    }
    
    public abstract Activity d();
    
    public final ArrayList e() {
        final ArrayList list = new ArrayList(this.a.a());
        final Iterator<e> j0 = this.a.j0();
        while (j0.hasNext()) {
            list.add(j0.next());
        }
        return list;
    }
    
    public final int f() {
        return this.a.a();
    }
    
    public final Controller g(final String s) {
        final Iterator<e> iterator = this.a.iterator();
        Controller controller;
        do {
            final boolean hasNext = iterator.hasNext();
            controller = null;
            final Controller controller2 = null;
            if (!hasNext) {
                break;
            }
            controller = iterator.next().a;
            if (controller.s.equals(s)) {
                continue;
            }
            final Iterator iterator2 = controller.D.iterator();
            do {
                controller = controller2;
                if (!iterator2.hasNext()) {
                    break;
                }
                controller = ((Router)iterator2.next()).g(s);
            } while (controller == null);
        } while (controller == null);
        return controller;
    }
    
    public final Controller h(final String s) {
        for (final e e : this.a) {
            if (s.equals(e.b)) {
                return e.a;
            }
        }
        return null;
    }
    
    public abstract Router i();
    
    public abstract ArrayList j();
    
    public abstract g8.f k();
    
    public final boolean m() {
        com.bluelinelabs.conductor.internal.a.a();
        if (!this.a.f.isEmpty()) {
            if (this.a.c().a.gB()) {
                return true;
            }
            if ((this.a.a() > 1 || this.e != PopRootControllerMode.NEVER) && this.C()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean n() {
        return this.f() > 0;
    }
    
    public abstract void o();
    
    public void p(final Activity activity, final boolean b) {
        this.f = false;
        final ViewGroup h = this.h;
        if (h != null) {
            h.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)null);
        }
        this.b.clear();
        for (final e e : this.a) {
            final Controller a = e.a;
            a.getClass();
            if (activity.isChangingConfigurations()) {
                a.WA(a.q, true, false);
            }
            else {
                a.VA(true);
            }
            a.qB((Context)activity);
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).p(activity, b);
            }
        }
        int size = this.d.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final Controller controller = this.d.get(n);
            controller.getClass();
            if (activity.isChangingConfigurations()) {
                controller.WA(controller.q, true, false);
            }
            else {
                controller.VA(true);
            }
            controller.qB((Context)activity);
            final Iterator iterator3 = controller.dB().iterator();
            while (true) {
                size = n;
                if (!iterator3.hasNext()) {
                    break;
                }
                ((Router)iterator3.next()).p(activity, b);
            }
        }
        this.h = null;
    }
    
    public final void q(final Activity activity) {
        for (final e e : this.a) {
            e.a.hB(activity);
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).q(activity);
            }
        }
    }
    
    public final void r(final Activity activity) {
        for (final e e : this.a) {
            final Controller a = e.a;
            final boolean k = a.k;
            Label_0092: {
                if (!k) {
                    final View q = a.q;
                    if (q != null && a.n) {
                        a.SA(q);
                        break Label_0092;
                    }
                }
                if (k) {
                    a.u = false;
                    a.x = false;
                }
            }
            a.jB(activity);
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).r(activity);
            }
        }
    }
    
    public final void s() {
        this.g = false;
        for (final e e : this.a) {
            final ViewAttachHandler c = e.a.C;
            if (c != null) {
                c.h = false;
                c.b();
            }
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).s();
            }
        }
    }
    
    public final void t(final Activity activity) {
        for (final e e : this.a) {
            final Controller a = e.a;
            final boolean k = a.k;
            final ViewAttachHandler c = a.C;
            if (c != null) {
                c.c(c.h = true);
            }
            if (k && activity.isChangingConfigurations()) {
                a.u = true;
            }
            a.kB(activity);
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).t(activity);
            }
        }
        this.g = true;
    }
    
    public void u() {
        final Iterator<e> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a.oB();
        }
    }
    
    public final void v(final Menu menu, final MenuInflater menuInflater) {
        for (final e e : this.a) {
            final Controller a = e.a;
            if (a.k && a.l && !a.m) {
                a.rB(menu, menuInflater);
            }
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).v(menu, menuInflater);
            }
        }
    }
    
    public final boolean w(final MenuItem menuItem) {
        final Iterator<e> iterator = this.a.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final boolean b = false;
            if (!hasNext) {
                return false;
            }
            final e e = iterator.next();
            final Controller a = e.a;
            int n = b ? 1 : 0;
            if (a.k) {
                n = (b ? 1 : 0);
                if (a.l) {
                    n = (b ? 1 : 0);
                    if (!a.m) {
                        n = (b ? 1 : 0);
                        if (a.wB(menuItem)) {
                            n = 1;
                        }
                    }
                }
            }
            if (n != 0) {
                return true;
            }
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                if (((Router)iterator2.next()).w(menuItem)) {
                    return true;
                }
            }
        }
    }
    
    public final void x(final Menu menu) {
        for (final e e : this.a) {
            final Controller a = e.a;
            if (a.k && a.l && !a.m) {
                a.xB(menu);
            }
            final Iterator iterator2 = e.a.dB().iterator();
            while (iterator2.hasNext()) {
                ((Router)iterator2.next()).x(menu);
            }
        }
    }
    
    public void y(final e e, final e e2, final boolean b) {
        if (b && e != null) {
            e.e = true;
        }
        c c;
        if (b) {
            c = e.b();
        }
        else if (e2 != null) {
            if ((c = e2.a.A) == null) {
                c = e2.d;
            }
        }
        else {
            c = null;
        }
        this.z(e, e2, b, c);
    }
    
    public final void z(final e e, final e e2, final boolean b, c c) {
        Controller a = null;
        Controller a2;
        if (e != null) {
            a2 = e.a;
        }
        else {
            a2 = null;
        }
        if (e2 != null) {
            a = e2.a;
        }
        boolean b2 = false;
        Label_0140: {
            Label_0137: {
                if (e == null) {
                    if (this.a.a() == 0 && this.e == PopRootControllerMode.POP_ROOT_CONTROLLER_BUT_NOT_VIEW) {
                        c = new g8.b();
                    }
                    else if (b || a == null || a.k) {
                        break Label_0137;
                    }
                    b2 = true;
                    break Label_0140;
                }
                final g8.f k = this.k();
                ah2.f.f((Object)k, "indexer");
                if (e.f == -1) {
                    final int n = k.a + 1;
                    k.a = n;
                    e.f = n;
                }
                this.R(a2);
            }
            b2 = false;
        }
        if (b && a2 != null && a2.j) {
            final StringBuilder i = a.k("Trying to push a controller that has already been destroyed. (");
            i.append(a2.getClass().getSimpleName());
            i.append(")");
            throw new IllegalStateException(i.toString());
        }
        final c.b b3 = new c.b(a2, a, b, this.h, c, new ArrayList(this.b));
        if (this.c.size() > 0) {
            if (a2 != null) {
                a2.u = true;
            }
            this.c.add(b3);
        }
        else if (a != null && (c == null || c.i()) && !this.f) {
            if (a2 != null) {
                a2.u = true;
            }
            this.c.add(b3);
            final ViewGroup h = this.h;
            if (h != null) {
                ((View)h).post((Runnable)new c8.d(this));
            }
        }
        else {
            c.d(b3);
        }
        if (b2 && a != null) {
            final View q = a.q;
            if (q != null) {
                a.WA(q, true, false);
            }
            else {
                a.VA(false);
            }
        }
    }
    
    public enum PopRootControllerMode
    {
        NEVER, 
        POP_ROOT_CONTROLLER_AND_VIEW, 
        POP_ROOT_CONTROLLER_BUT_NOT_VIEW;
    }
}
