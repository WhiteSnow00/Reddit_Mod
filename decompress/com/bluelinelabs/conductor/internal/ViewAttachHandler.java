// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor.internal;

import com.bluelinelabs.conductor.Controller;
import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnAttachStateChangeListener;

public final class ViewAttachHandler implements View$OnAttachStateChangeListener
{
    public boolean f;
    public boolean g;
    public boolean h;
    public ReportedState i;
    public c j;
    public com.bluelinelabs.conductor.internal.b k;
    
    public ViewAttachHandler(final c8.b j) {
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = ReportedState.VIEW_DETACHED;
        this.j = (c)j;
    }
    
    public static View a(final ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return (View)viewGroup;
        }
        View view2;
        final View view = view2 = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        if (view instanceof ViewGroup) {
            view2 = a((ViewGroup)view);
        }
        return view2;
    }
    
    public final void b() {
        if (this.f && this.g && !this.h) {
            final ReportedState i = this.i;
            final ReportedState attached = ReportedState.ATTACHED;
            if (i != attached) {
                this.i = attached;
                final Controller a = ((c8.b)this.j).a;
                a.n = true;
                a.o = false;
                a.SA(a.q);
            }
        }
    }
    
    public final void c(final boolean b) {
        final ReportedState i = this.i;
        final ReportedState activity_STOPPED = ReportedState.ACTIVITY_STOPPED;
        final boolean b2 = i == activity_STOPPED;
        if (b) {
            this.i = activity_STOPPED;
        }
        else {
            this.i = ReportedState.VIEW_DETACHED;
        }
        if (b2 && !b) {
            final Controller a = ((c8.b)this.j).a;
            if (!a.y) {
                a.WA(a.q, false, false);
            }
        }
        else {
            final Controller a2 = ((c8.b)this.j).a;
            a2.n = false;
            a2.o = true;
            if (!a2.y) {
                a2.WA(a2.q, false, b);
            }
        }
    }
    
    public final void onViewAttachedToWindow(final View view) {
        if (this.f) {
            return;
        }
        this.f = true;
        final ViewAttachHandler$a viewAttachHandler$a = new ViewAttachHandler$a(this);
        if (!(view instanceof ViewGroup)) {
            this.g = true;
            this.b();
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() == 0) {
                this.g = true;
                this.b();
            }
            else {
                this.k = new com.bluelinelabs.conductor.internal.b(this, viewAttachHandler$a);
                a(viewGroup).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.k);
            }
        }
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.f = false;
        if (this.g) {
            this.c(this.g = false);
        }
    }
    
    public enum ReportedState
    {
        ACTIVITY_STOPPED, 
        ATTACHED, 
        VIEW_DETACHED;
    }
    
    public interface b
    {
    }
    
    public interface c
    {
    }
}
