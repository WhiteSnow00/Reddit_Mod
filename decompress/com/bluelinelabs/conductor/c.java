// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import android.os.BaseBundle;
import al0.f0;
import wd.a;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import android.view.ViewGroup;
import java.util.List;
import android.view.View$OnAttachStateChangeListener;
import com.bluelinelabs.conductor.internal.ViewAttachHandler;
import b8.b;
import android.view.LayoutInflater;
import java.util.Collection;
import java.util.ArrayList;
import d8.d;
import java.util.HashMap;

public abstract class c
{
    public static final HashMap h;
    public boolean f;
    public boolean g;
    
    static {
        h = new HashMap();
    }
    
    public c() {
        try {
            this.getClass().getConstructor((Class<?>[])new Class[0]);
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass());
            sb.append(" does not have a default constructor.");
            throw new RuntimeException(sb.toString());
        }
    }
    
    public static boolean a(final String s) {
        final HashMap h = c.h;
        final a a = h.get(s);
        if (a != null) {
            a.a.b();
            h.remove(s);
            return true;
        }
        return false;
    }
    
    public static void d(final b b) {
        final Controller a = b.a;
        final Controller b2 = b.b;
        final boolean c = b.c;
        final ViewGroup d = b.d;
        final c e = b.e;
        final List<d> f = b.f;
        if (d != null) {
            c c2;
            if (e == null) {
                c2 = new d8.d();
            }
            else if (e.g && !e.f()) {
                c2 = e.c();
            }
            else {
                c2 = e;
            }
            c2.g = true;
            if (b2 != null) {
                if (c) {
                    a(b2.s);
                }
                else {
                    final HashMap h = com.bluelinelabs.conductor.c.h;
                    final a a2 = h.get(b2.s);
                    if (a2 != null) {
                        if (a2.b) {
                            a2.a.g(c2);
                        }
                        else {
                            a2.a.b();
                        }
                        h.remove(b2.s);
                    }
                }
            }
            if (a != null) {
                com.bluelinelabs.conductor.c.h.put(a.s, new a(c2, c));
            }
            final Iterator<d> iterator = f.iterator();
            while (iterator.hasNext()) {
                ((d)iterator.next()).c(a, b2, c, d, c2);
            }
            ControllerChangeType controllerChangeType;
            if (c) {
                controllerChangeType = ControllerChangeType.PUSH_ENTER;
            }
            else {
                controllerChangeType = ControllerChangeType.POP_ENTER;
            }
            ControllerChangeType controllerChangeType2;
            if (c) {
                controllerChangeType2 = ControllerChangeType.PUSH_EXIT;
            }
            else {
                controllerChangeType2 = ControllerChangeType.POP_EXIT;
            }
            View q = null;
            View q5;
            if (a != null) {
                final View q2 = a.q;
                if (q2 != null && q2.getParent() != null && a.q.getParent() != d) {
                    a.AA(a.q, true, false);
                    final View q3 = a.q;
                    Context context;
                    if (q3 != null) {
                        context = q3.getContext();
                    }
                    else {
                        context = null;
                    }
                    a.kB(context);
                }
                if (a.q == null) {
                    final Iterator iterator2 = new ArrayList(a.E).iterator();
                    while (iterator2.hasNext()) {
                        ((Controller.e)iterator2.next()).s(a);
                    }
                    final Bundle g = a.g;
                    Bundle bundle;
                    if (g == null) {
                        bundle = null;
                    }
                    else {
                        bundle = g.getBundle("Controller.viewState.bundle");
                    }
                    final View wa = a.WA(LayoutInflater.from(((View)d).getContext()), d, bundle);
                    a.q = wa;
                    if (wa == d) {
                        throw new IllegalStateException("Controller's onCreateView method returned the parent ViewGroup. Perhaps you forgot to pass false for LayoutInflater.inflate's attachToRoot parameter?");
                    }
                    final Iterator iterator3 = new ArrayList(a.E).iterator();
                    while (iterator3.hasNext()) {
                        ((Controller.e)iterator3.next()).l(a, a.q);
                    }
                    final View q4 = a.q;
                    final Bundle g2 = a.g;
                    if (g2 != null) {
                        q4.restoreHierarchyState(g2.getSparseParcelableArray("Controller.viewState.hierarchy"));
                        final Bundle bundle2 = a.g.getBundle("Controller.viewState.bundle");
                        bundle2.setClassLoader(a.getClass().getClassLoader());
                        a.eB(q4, bundle2);
                        a.mB();
                        final Iterator iterator4 = new ArrayList(a.E).iterator();
                        while (iterator4.hasNext()) {
                            ((Controller.e)iterator4.next()).getClass();
                        }
                    }
                    if (!a.i) {
                        final ViewAttachHandler c3 = new ViewAttachHandler(new b8.b(a));
                        a.C = c3;
                        a.q.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)c3);
                    }
                }
                else {
                    a.mB();
                }
                q5 = a.q;
                a.yA(c2, controllerChangeType);
            }
            else {
                q5 = null;
            }
            if (b2 != null) {
                q = b2.q;
                b2.yA(c2, controllerChangeType2);
            }
            c2.h(d, q, q5, c, new com.bluelinelabs.conductor.b(b2, c2, controllerChangeType2, a, controllerChangeType, (List)f, c, d, q));
        }
    }
    
    public static c e(final Bundle bundle) {
        c instance = null;
        if (bundle != null) {
            final String string = ((BaseBundle)bundle).getString("ControllerChangeHandler.className");
            try {
                final Class v = wd.a.v(string, true);
                if (v != null) {
                    instance = (c)v.newInstance();
                }
                final c c = instance;
                c.j(bundle.getBundle("ControllerChangeHandler.savedState"));
                return c;
            }
            catch (final Exception ex) {
                throw new RuntimeException(f0.j(ex, al0.a.p("An exception occurred while creating a new instance of ", string, ". ")));
            }
        }
        return null;
    }
    
    public void b() {
    }
    
    public c c() {
        return e(this.m());
    }
    
    public boolean f() {
        return this instanceof f8.b;
    }
    
    public void g(final c c) {
    }
    
    public abstract void h(final ViewGroup p0, final View p1, final View p2, final boolean p3, final com.bluelinelabs.conductor.b p4);
    
    public boolean i() {
        return true;
    }
    
    public void j(final Bundle bundle) {
    }
    
    public void k(final Bundle bundle) {
    }
    
    public void l() {
        this.f = true;
    }
    
    final Bundle m() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("ControllerChangeHandler.className", this.getClass().getName());
        final Bundle bundle2 = new Bundle();
        this.k(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }
    
    public static final class a
    {
        public final c a;
        public final boolean b;
        
        public a(final c a, final boolean b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public final Controller a;
        public final Controller b;
        public final boolean c;
        public final ViewGroup d;
        public final c e;
        public final List<d> f;
        
        public b(final Controller a, final Controller b, final boolean c, final ViewGroup d, final c e, final ArrayList f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public interface c
    {
    }
    
    public interface d
    {
        void b(final Controller p0, final Controller p1, final boolean p2, final ViewGroup p3, final c p4);
        
        void c(final Controller p0, final Controller p1, final boolean p2, final ViewGroup p3, final c p4);
    }
}
