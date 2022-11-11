// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import com.reddit.video.creation.widgets.uploaduservideos.view.UploadUserVideosBottomSheetDialogFragment;
import com.reddit.video.creation.widgets.uploaduservideos.view.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.viewpager2.widget.ViewPager2;

public final class d
{
    public final TabLayout a;
    public final ViewPager2 b;
    public final b c;
    public RecyclerView$Adapter<?> d;
    public boolean e;
    
    public d(final TabLayout a, final ViewPager2 b, final com.reddit.video.creation.widgets.uploaduservideos.view.b c) {
        this.a = a;
        this.b = b;
        this.c = (b)c;
    }
    
    public final void a() {
        this.a.l();
        final RecyclerView$Adapter<?> d = this.d;
        if (d != null) {
            final int itemCount = d.getItemCount();
            for (int i = 0; i < itemCount; ++i) {
                final TabLayout.g j = this.a.j();
                UploadUserVideosBottomSheetDialogFragment.t0((UploadUserVideosBottomSheetDialogFragment)((com.reddit.video.creation.widgets.uploaduservideos.view.b)this.c).f, j, i);
                final TabLayout a = this.a;
                a.c(j, a.f.size(), false);
            }
            if (itemCount > 0) {
                final int min = Math.min(this.b.getCurrentItem(), this.a.getTabCount() - 1);
                if (min != this.a.getSelectedTabPosition()) {
                    final TabLayout a2 = this.a;
                    a2.m(a2.i(min), true);
                }
            }
        }
    }
    
    public interface b
    {
    }
}
