// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;

public final class s implements Runnable
{
    public final /* synthetic */ r.f f;
    public final /* synthetic */ int g;
    public final /* synthetic */ r h;
    
    public s(final r h, final r.f f, final int g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final RecyclerView w = this.h.w;
        if (w != null && w.isAttachedToWindow()) {
            final r.f f = this.f;
            if (!f.k && f.e.getAbsoluteAdapterPosition() != -1) {
                final RecyclerView$l itemAnimator = this.h.w.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.l()) {
                    final r h = this.h;
                    final int size = h.u.size();
                    final int n = 0;
                    int n2 = 0;
                    int n3;
                    while (true) {
                        n3 = n;
                        if (n2 >= size) {
                            break;
                        }
                        if (!((r.f)h.u.get(n2)).l) {
                            n3 = 1;
                            break;
                        }
                        ++n2;
                    }
                    if (n3 == 0) {
                        this.h.r.onSwiped(this.f.e, this.g);
                        return;
                    }
                }
                ((View)this.h.w).post((Runnable)this);
            }
        }
    }
}
