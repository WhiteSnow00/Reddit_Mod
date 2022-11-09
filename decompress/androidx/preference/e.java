// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;

public final class e implements Runnable
{
    public final /* synthetic */ Preference f;
    public final /* synthetic */ String g;
    public final /* synthetic */ d h;
    
    public e(final d h, final String g) {
        this.h = h;
        this.f = null;
        this.g = g;
    }
    
    @Override
    public final void run() {
        final RecyclerView.Adapter adapter = this.h.g.getAdapter();
        if (adapter instanceof PreferenceGroup$b) {
            final Preference f = this.f;
            int n;
            if (f != null) {
                n = ((PreferenceGroup$b)adapter).b(f);
            }
            else {
                n = ((PreferenceGroup$b)adapter).h(this.g);
            }
            if (n != -1) {
                this.h.g.scrollToPosition(n);
            }
            else {
                adapter.registerAdapterDataObserver((RecyclerView.i)new d$g(adapter, this.h.g, this.f, this.g));
            }
            return;
        }
        if (adapter == null) {
            return;
        }
        throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
    }
}
