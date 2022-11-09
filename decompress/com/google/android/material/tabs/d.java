// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import java.lang.ref.WeakReference;
import androidx.viewpager2.widget.ViewPager2$e;
import com.reddit.video.creation.widgets.uploaduservideos.view.UploadUserVideosBottomSheetDialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class d
{
    public final TabLayout a;
    public final ViewPager2 b;
    public final b c;
    public RecyclerView.Adapter<?> d;
    public boolean e;
    
    public d(final TabLayout a, final ViewPager2 b, final d c) {
        this.a = a;
        this.b = b;
        this.c = (b)c;
    }
    
    public final void a() {
        this.a.l();
        final RecyclerView.Adapter<?> d = this.d;
        if (d != null) {
            final int itemCount = d.getItemCount();
            for (int i = 0; i < itemCount; ++i) {
                final TabLayout.g j = this.a.j();
                UploadUserVideosBottomSheetDialogFragment.s0((UploadUserVideosBottomSheetDialogFragment)((d)this.c).g, j, i);
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
    
    public final class a extends i
    {
        @Override
        public final void a() {
            com.google.android.material.tabs.d.this.a();
        }
        
        @Override
        public final void b(final int n, final int n2) {
            com.google.android.material.tabs.d.this.a();
        }
        
        @Override
        public final void c(final int n, final int n2, final Object o) {
            com.google.android.material.tabs.d.this.a();
        }
        
        @Override
        public final void d(final int n, final int n2) {
            com.google.android.material.tabs.d.this.a();
        }
        
        @Override
        public final void e(final int n, final int n2) {
            com.google.android.material.tabs.d.this.a();
        }
        
        @Override
        public final void f(final int n, final int n2) {
            com.google.android.material.tabs.d.this.a();
        }
    }
    
    public interface b
    {
    }
    
    public static final class c extends ViewPager2$e
    {
        public final WeakReference<TabLayout> a;
        public int b;
        public int c;
        
        public c(final TabLayout tabLayout) {
            this.a = new WeakReference<TabLayout>(tabLayout);
            this.c = 0;
            this.b = 0;
        }
        
        public final void a(final int c) {
            this.b = this.c;
            this.c = c;
        }
        
        public final void b(final int n, final float n2, int c) {
            final TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                c = this.c;
                boolean b = false;
                final boolean b2 = c != 2 || this.b == 1;
                if (c != 2 || this.b != 0) {
                    b = true;
                }
                tabLayout.o(n, n2, b2, b);
            }
        }
        
        public final void c(final int n) {
            final TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != n && n < tabLayout.getTabCount()) {
                final int c = this.c;
                tabLayout.m(tabLayout.i(n), c == 0 || (c == 2 && this.b == 0));
            }
        }
    }
    
    public static final class d implements TabLayout.d
    {
        public final ViewPager2 f;
        public final boolean g;
        
        public d(final ViewPager2 f, final boolean g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final void a(final g g) {
            this.f.c(g.d, this.g);
        }
        
        @Override
        public final void g(final g g) {
        }
        
        @Override
        public final void h(final g g) {
        }
    }
}
