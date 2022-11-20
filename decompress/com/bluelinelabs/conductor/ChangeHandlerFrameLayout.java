// 
// Decompiled by Procyon v0.6.0
// 

package com.bluelinelabs.conductor;

import android.view.MotionEvent;
import android.view.ViewGroup;
import ng2.e;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", "Landroid/widget/FrameLayout;", "Lcom/bluelinelabs/conductor/c$d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "conductor_release" }, k = 1, mv = { 1, 6, 0 })
public class ChangeHandlerFrameLayout extends FrameLayout implements c$d
{
    public int f;
    
    public ChangeHandlerFrameLayout(final Context context) {
        super(context);
    }
    
    public ChangeHandlerFrameLayout(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        super(context, set);
    }
    
    public ChangeHandlerFrameLayout(final Context context, final AttributeSet set, final int n) {
        e.f((Object)context, "context");
        super(context, set, n);
    }
    
    public final void a(final Controller controller, final Controller controller2, final boolean b, final ViewGroup viewGroup, final c c) {
        e.f((Object)viewGroup, "container");
        e.f((Object)c, "handler");
        --this.f;
    }
    
    public final void b(final Controller controller, final Controller controller2, final boolean b, final ViewGroup viewGroup, final c c) {
        ++this.f;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        e.f((Object)motionEvent, "ev");
        return this.f > 0 || super.onInterceptTouchEvent(motionEvent);
    }
}
