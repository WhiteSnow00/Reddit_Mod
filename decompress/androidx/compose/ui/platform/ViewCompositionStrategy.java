// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import cg.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import dg.l0;
import java.util.Iterator;
import android.view.ViewParent;
import androidx.core.view.b;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import ng2.e;
import cg2.j;
import mg2.a;

public interface ViewCompositionStrategy
{
    public static final int a = 0;
    
    a<j> a(final AbstractComposeView p0);
    
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy
    {
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool b;
        
        static {
            b = new DisposeOnDetachedFromWindowOrReleasedFromPool();
        }
        
        @Override
        public final a<j> a(final AbstractComposeView abstractComposeView) {
            e.f((Object)abstractComposeView, "view");
            final View$OnAttachStateChangeListener view$OnAttachStateChangeListener = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener(abstractComposeView) {
                public final AbstractComposeView f;
                
                public final void onViewAttachedToWindow(final View view) {
                    e.f((Object)view, "v");
                }
                
                public final void onViewDetachedFromWindow(View view) {
                    e.f((Object)view, "v");
                    final AbstractComposeView f = this.f;
                    e.f((Object)f, "<this>");
                    final Iterator iterator = androidx.core.view.b.d(f).iterator();
                    boolean b;
                    while (true) {
                        final boolean hasNext = iterator.hasNext();
                        b = false;
                        boolean booleanValue = false;
                        if (!hasNext) {
                            break;
                        }
                        final ViewParent viewParent = (ViewParent)iterator.next();
                        if (!(viewParent instanceof View)) {
                            continue;
                        }
                        view = (View)viewParent;
                        e.f((Object)view, "<this>");
                        final Object tag = view.getTag(2131429712);
                        Boolean b2;
                        if (tag instanceof Boolean) {
                            b2 = (Boolean)tag;
                        }
                        else {
                            b2 = null;
                        }
                        if (b2 != null) {
                            booleanValue = b2;
                        }
                        if (booleanValue) {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        this.f.d();
                    }
                }
            };
            ((View)abstractComposeView).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)view$OnAttachStateChangeListener);
            final g4.a a = (g4.a)new g4.a(abstractComposeView) {
                public final AbstractComposeView a;
                
                public final void a() {
                    this.a.d();
                }
            };
            l0.q0((View)abstractComposeView).a.add(a);
            return (a<j>)new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, view$OnAttachStateChangeListener, (g4.a)a);
        }
    }
    
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy
    {
        public static final DisposeOnViewTreeLifecycleDestroyed b;
        
        static {
            b = new DisposeOnViewTreeLifecycleDestroyed();
        }
        
        @Override
        public final a<j> a(final AbstractComposeView abstractComposeView) {
            e.f((Object)abstractComposeView, "view");
            if (!((View)abstractComposeView).isAttachedToWindow()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final View$OnAttachStateChangeListener view$OnAttachStateChangeListener = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener(abstractComposeView, ref$ObjectRef) {
                    public final AbstractComposeView f;
                    public final Ref$ObjectRef<a<j>> g;
                    
                    public final void onViewAttachedToWindow(final View view) {
                        e.f((Object)view, "v");
                        final q e2 = d.e2((View)this.f);
                        final AbstractComposeView f = this.f;
                        if (e2 != null) {
                            final Ref$ObjectRef<a<j>> g = this.g;
                            final Lifecycle lifecycle = e2.getLifecycle();
                            e.e((Object)lifecycle, "lco.lifecycle");
                            g.element = j1.a(f, lifecycle);
                            ((View)this.f).removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                            return;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("View tree for ");
                        sb.append(f);
                        sb.append(" has no ViewTreeLifecycleOwner");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    
                    public final void onViewDetachedFromWindow(final View view) {
                        e.f((Object)view, "v");
                    }
                };
                ((View)abstractComposeView).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)view$OnAttachStateChangeListener);
                ref$ObjectRef.element = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, view$OnAttachStateChangeListener);
                return (a<j>)new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(ref$ObjectRef);
            }
            final q e2 = d.e2((View)abstractComposeView);
            if (e2 != null) {
                final Lifecycle lifecycle = e2.getLifecycle();
                e.e((Object)lifecycle, "lco.lifecycle");
                return (a<j>)j1.a(abstractComposeView, lifecycle);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("View tree for ");
            sb.append(abstractComposeView);
            sb.append(" has no ViewTreeLifecycleOwner");
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
