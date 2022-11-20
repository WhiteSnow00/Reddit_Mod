// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import android.os.BaseBundle;
import java.util.Locale;
import fu.b;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$OnHierarchyChangeListener;
import java.util.Collection;
import java.util.ArrayList;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import android.os.Bundle;
import c8.e;

public final class d extends Router
{
    public Controller i;
    public int j;
    public String k;
    public boolean l;
    public boolean m;
    
    public d() {
    }
    
    public d(final int j, final String k, final boolean m) {
        if (!m && k == null) {
            throw new IllegalStateException("ControllerHostedRouter can't be created without a tag if not bounded to its container");
        }
        this.j = j;
        this.k = k;
        this.m = m;
    }
    
    public final void I(final e e) {
        if (this.l) {
            e.a.BB(true);
        }
        super.I(e);
    }
    
    public final void M(final String s, final int n, final String[] array) {
        final Controller i = this.i;
        if (i != null) {
            final Router p3 = i.p;
            if (p3 != null) {
                p3.M(s, n, array);
            }
        }
    }
    
    public final void N(final Bundle bundle) {
        super.N(bundle);
        this.j = ((BaseBundle)bundle).getInt("ControllerHostedRouter.hostId");
        this.m = ((BaseBundle)bundle).getBoolean("ControllerHostedRouter.boundToContainer");
        this.k = ((BaseBundle)bundle).getString("ControllerHostedRouter.tag");
    }
    
    public final void O(final Bundle bundle) {
        super.O(bundle);
        ((BaseBundle)bundle).putInt("ControllerHostedRouter.hostId", this.j);
        ((BaseBundle)bundle).putBoolean("ControllerHostedRouter.boundToContainer", this.m);
        ((BaseBundle)bundle).putString("ControllerHostedRouter.tag", this.k);
    }
    
    public final void P(final List<e> list, final c c) {
        if (this.l) {
            final Iterator<e> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next().a.BB(true);
            }
        }
        super.P((List)list, c);
    }
    
    public final void R(final Controller controller) {
        controller.r = this.i;
        super.R(controller);
    }
    
    public final void S(final Intent intent) {
        final Controller i = this.i;
        if (i != null) {
            final Router p = i.p;
            if (p != null) {
                p.S(intent);
            }
        }
    }
    
    public final void T(final int n, final String s, final Intent intent) {
        final Controller i = this.i;
        if (i != null) {
            final Router p3 = i.p;
            if (p3 != null) {
                p3.T(n, s, intent);
            }
        }
    }
    
    public final void U(final String s, final IntentSender intentSender, final int n) throws IntentSender$SendIntentException {
        final Controller i = this.i;
        if (i != null) {
            final Router p3 = i.p;
            if (p3 != null) {
                p3.U(s, intentSender, n);
            }
        }
    }
    
    public final void W(final String s) {
        final Controller i = this.i;
        if (i != null) {
            final Router p = i.p;
            if (p != null) {
                p.W(s);
            }
        }
    }
    
    public final void X() {
        final ViewGroup h = super.h;
        if (h != null && h instanceof c$d) {
            this.K((c$d)h);
        }
        for (final Controller controller : new ArrayList(super.d)) {
            final View q = controller.q;
            if (q != null) {
                controller.MA(q, true, false);
            }
        }
        final Iterator iterator2 = super.a.iterator();
        while (iterator2.hasNext()) {
            final Controller a = iterator2.next().a;
            final View q2 = a.q;
            if (q2 != null) {
                a.MA(q2, true, false);
            }
        }
        super.f = false;
        final ViewGroup h2 = super.h;
        if (h2 != null) {
            h2.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)null);
        }
        super.h = null;
    }
    
    public final void Y(final boolean l) {
        this.l = l;
        final Iterator iterator = super.a.iterator();
        while (iterator.hasNext()) {
            ((e)iterator.next()).a.BB(l);
        }
    }
    
    public final void Z(final Controller controller, final ViewGroup h) {
        if (this.i != controller || super.h != h) {
            this.X();
            if (h instanceof c$d) {
                this.a((c$d)h);
            }
            this.i = controller;
            super.h = h;
            final Iterator iterator = super.a.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).a.r = controller;
            }
            ((View)super.h).post((Runnable)new c8.c(this));
        }
    }
    
    public final void c(final boolean b) {
        this.Y(false);
        super.c(b);
    }
    
    public final Activity d() {
        final Controller i = this.i;
        Activity na;
        if (i != null) {
            na = i.NA();
        }
        else {
            na = null;
        }
        return na;
    }
    
    public final Router i() {
        final Controller i = this.i;
        if (i != null) {
            final Router p = i.p;
            if (p != null) {
                return p.i();
            }
        }
        return this;
    }
    
    public final ArrayList j() {
        final ArrayList list = new ArrayList();
        list.addAll(this.i.TA());
        list.addAll(this.i.p.j());
        return list;
    }
    
    public final b k() {
        if (this.i() == this) {
            final Controller i = this.i;
            String format;
            if (i != null) {
                format = String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", i.getClass().getSimpleName(), this.i.k, this.i.i, this.i.r);
            }
            else {
                format = "null host controller";
            }
            throw new IllegalStateException(b.l("Unable to retrieve TransactionIndexer from ", format));
        }
        return this.i().k();
    }
    
    public final void o() {
        final Controller i = this.i;
        if (i != null) {
            final Router p = i.p;
            if (p != null) {
                p.o();
            }
        }
    }
    
    public final void p(final Activity activity, final boolean b) {
        super.p(activity, b);
        this.X();
    }
    
    public final void y(final e e, final e e2, final boolean b) {
        super.y(e, e2, b);
        if (e != null && !this.i.k && (e.b() == null || e.b().i())) {
            final Iterator iterator = super.a.iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).a.u = false;
            }
        }
    }
}
