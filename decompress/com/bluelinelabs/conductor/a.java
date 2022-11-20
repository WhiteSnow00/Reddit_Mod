// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import android.view.View;
import android.os.BaseBundle;
import android.app.Fragment;
import java.util.ArrayList;
import android.app.Activity;
import c8.c;
import android.view.ViewGroup;
import android.util.SparseArray;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.Intent;
import android.os.Bundle;
import g8.a$a;
import fu.b;

public final class a extends Router
{
    public g8.a i;
    public final b j;
    
    public a() {
        this.j = new b();
    }
    
    public final void M(final String s, final int n, final String[] array) {
        final g8.a i = this.i;
        if (i.i) {
            i.k.put(n, (Object)s);
            ((Fragment)i).requestPermissions(array, n);
        }
        else {
            i.m.add(new a$a(s, n, array));
        }
    }
    
    public final void N(final Bundle bundle) {
        super.N(bundle);
        final b j = this.j;
        j.getClass();
        j.f = ((BaseBundle)bundle).getInt("TransactionIndexer.currentIndex");
    }
    
    public final void O(final Bundle bundle) {
        super.O(bundle);
        final b j = this.j;
        j.getClass();
        ((BaseBundle)bundle).putInt("TransactionIndexer.currentIndex", j.f);
    }
    
    public final void S(final Intent intent) {
        ((Fragment)this.i).startActivity(intent);
    }
    
    public final void T(final int n, final String s, final Intent intent) {
        final g8.a i = this.i;
        i.l.put(n, (Object)s);
        ((Fragment)i).startActivityForResult(intent, n);
    }
    
    public final void U(final String s, final IntentSender intentSender, final int n) throws IntentSender$SendIntentException {
        final g8.a i = this.i;
        i.l.put(n, (Object)s);
        ((Fragment)i).startIntentSenderForResult(intentSender, n, (Intent)null, 0, 0, 0, (Bundle)null);
    }
    
    public final void W(final String s) {
        final g8.a i = this.i;
        int size = i.l.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final SparseArray l = i.l;
            size = n;
            if (!s.equals(l.get(l.keyAt(n)))) {
                continue;
            }
            i.l.removeAt(n);
            size = n;
        }
    }
    
    public final void X(final g8.a i, final ViewGroup h) {
        if (this.i != i || super.h != h) {
            final ViewGroup h2 = super.h;
            if (h2 != null && h2 instanceof c$d) {
                this.K((c$d)h2);
            }
            if (h instanceof c$d) {
                this.a((c$d)h);
            }
            this.i = i;
            ((View)(super.h = h)).post((Runnable)new c(this));
        }
    }
    
    public final Activity d() {
        final g8.a i = this.i;
        Activity f;
        if (i != null) {
            f = i.f;
        }
        else {
            f = null;
        }
        return f;
    }
    
    public final Router i() {
        return this;
    }
    
    public final ArrayList j() {
        return this.i.c();
    }
    
    public final b k() {
        return this.j;
    }
    
    public final void o() {
        final g8.a i = this.i;
        if (i != null && ((Fragment)i).getFragmentManager() != null) {
            ((Fragment)this.i).getFragmentManager().invalidateOptionsMenu();
        }
    }
    
    public final void p(final Activity activity, final boolean b) {
        super.p(activity, b);
        if (!b) {
            this.i = null;
        }
    }
    
    public final void u() {
        super.u();
    }
}
