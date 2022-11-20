// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import mg2.l;
import ng2.e;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.q;
import z0.i;
import cg2.j;
import z0.d;
import mg2.p;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import androidx.lifecycle.o;
import z0.f;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003" }, d2 = { "Landroidx/compose/ui/platform/WrappedComposition;", "Lz0/f;", "Landroidx/lifecycle/o;", "ui_release" }, k = 1, mv = { 1, 7, 1 })
final class WrappedComposition implements f, o
{
    public final AndroidComposeView f;
    public final f g;
    public boolean h;
    public Lifecycle i;
    public p<? super d, ? super Integer, j> j;
    
    public WrappedComposition(final AndroidComposeView f, final i g) {
        this.f = f;
        this.g = (f)g;
        this.j = (p<? super d, ? super Integer, j>)ComposableSingletons$Wrapper_androidKt.a;
    }
    
    @Override
    public final void dispose() {
        if (!this.h) {
            this.h = true;
            this.f.getView().setTag(2131432307, (Object)null);
            final Lifecycle i = this.i;
            if (i != null) {
                i.c((androidx.lifecycle.p)this);
            }
        }
        this.g.dispose();
    }
    
    public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.dispose();
        }
        else if (lifecycle$Event == Lifecycle$Event.ON_CREATE && !this.h) {
            this.k(this.j);
        }
    }
    
    @Override
    public final boolean isDisposed() {
        return this.g.isDisposed();
    }
    
    @Override
    public final void k(final p<? super d, ? super Integer, j> p) {
        e.f((Object)p, "content");
        this.f.setOnViewTreeOwnersAvailable((l)new WrappedComposition$setContent$1(this, (p)p));
    }
    
    @Override
    public final boolean x() {
        return this.g.x();
    }
}
