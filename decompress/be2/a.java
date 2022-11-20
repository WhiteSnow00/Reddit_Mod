// 
// Decompiled by Procyon v0.6.0
// 

package be2;

import android.view.View;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.RecyclerView$o;
import com.wdullaer.materialdatetimepicker.date.b;
import com.wdullaer.materialdatetimepicker.date.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.y;

public final class a extends y
{
    public e0 f;
    public d0 g;
    public int h;
    public boolean i;
    public a.a$b j;
    public a$a k;
    
    public a(final int h, final gb2.a j) {
        this.k = new RecyclerView$t(this) {
            public final a f;
            
            public final void onScrollStateChanged(final RecyclerView recyclerView, int n) {
                super.onScrollStateChanged(recyclerView, n);
                if (n == 2) {
                    this.f.getClass();
                }
                if (n == 0) {
                    final a f = this.f;
                    if (f.j != null) {
                        f.getClass();
                        final RecyclerView$o layoutManager = recyclerView.getLayoutManager();
                        Label_0108: {
                            if (layoutManager instanceof LinearLayoutManager) {
                                n = f.h;
                                if (n == 8388611 || n == 48) {
                                    n = ((LinearLayoutManager)layoutManager).findFirstCompletelyVisibleItemPosition();
                                    break Label_0108;
                                }
                                if (n == 8388613 || n == 80) {
                                    n = ((LinearLayoutManager)layoutManager).findLastCompletelyVisibleItemPosition();
                                    break Label_0108;
                                }
                            }
                            n = -1;
                        }
                        if (n != -1) {
                            final c.a u = ((c)((gb2.a)this.f.j).f).u;
                            if (u != null) {
                                ((b)u).a(n);
                            }
                        }
                        this.f.getClass();
                    }
                }
            }
        };
        if (h != 8388611 && h != 8388613 && h != 80 && h != 48) {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP constants");
        }
        this.h = h;
        this.j = (a.a$b)j;
    }
    
    private f0 i(final RecyclerView$o recyclerView$o) {
        if (this.g == null) {
            this.g = new d0(recyclerView$o);
        }
        return (f0)this.g;
    }
    
    private f0 j(final RecyclerView$o recyclerView$o) {
        if (this.f == null) {
            this.f = new e0(recyclerView$o);
        }
        return (f0)this.f;
    }
    
    public final void a(final RecyclerView recyclerView) throws IllegalStateException {
        if (recyclerView != null) {
            final int h = this.h;
            if (h == 8388611 || h == 8388613) {
                final int layoutDirection = ((View)recyclerView).getContext().getResources().getConfiguration().getLayoutDirection();
                boolean i = true;
                if (layoutDirection != 1) {
                    i = false;
                }
                this.i = i;
            }
            if (this.j != null) {
                recyclerView.addOnScrollListener((RecyclerView$t)this.k);
            }
        }
        super.a(recyclerView);
    }
    
    public final int[] b(final RecyclerView$o recyclerView$o, final View view) {
        final int[] array = new int[2];
        if (recyclerView$o.canScrollHorizontally()) {
            if (this.h == 8388611) {
                array[0] = this.l(view, this.i(recyclerView$o), false);
            }
            else {
                array[0] = this.k(view, this.i(recyclerView$o), false);
            }
        }
        else {
            array[0] = 0;
        }
        if (recyclerView$o.canScrollVertically()) {
            if (this.h == 48) {
                array[1] = this.l(view, this.j(recyclerView$o), false);
            }
            else {
                array[1] = this.k(view, this.j(recyclerView$o), false);
            }
        }
        else {
            array[1] = 0;
        }
        return array;
    }
    
    public final View d(final RecyclerView$o recyclerView$o) {
        if (recyclerView$o instanceof LinearLayoutManager) {
            final int h = this.h;
            if (h == 48) {
                return this.n(recyclerView$o, this.j(recyclerView$o));
            }
            if (h == 80) {
                return this.m(recyclerView$o, this.j(recyclerView$o));
            }
            if (h == 8388611) {
                return this.n(recyclerView$o, this.i(recyclerView$o));
            }
            if (h == 8388613) {
                return this.m(recyclerView$o, this.i(recyclerView$o));
            }
        }
        return null;
    }
    
    public final int k(final View view, final f0 f0, final boolean b) {
        if (this.i && !b) {
            return this.l(view, f0, true);
        }
        return f0.b(view) - f0.g();
    }
    
    public final int l(final View view, final f0 f0, final boolean b) {
        if (this.i && !b) {
            return this.k(view, f0, true);
        }
        return f0.e(view) - f0.k();
    }
    
    public final View m(final RecyclerView$o recyclerView$o, final f0 f0) {
        if (!(recyclerView$o instanceof LinearLayoutManager)) {
            return null;
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)recyclerView$o;
        final int lastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (lastVisibleItemPosition == -1) {
            return null;
        }
        final View viewByPosition = recyclerView$o.findViewByPosition(lastVisibleItemPosition);
        float n;
        int n2;
        if (this.i) {
            n = (float)f0.b(viewByPosition);
            n2 = f0.c(viewByPosition);
        }
        else {
            n = (float)(f0.l() - f0.e(viewByPosition));
            n2 = f0.c(viewByPosition);
        }
        final float n3 = n / n2;
        final boolean b = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
        if (n3 > 0.5f && !b) {
            return viewByPosition;
        }
        if (b) {
            return null;
        }
        return recyclerView$o.findViewByPosition(lastVisibleItemPosition - 1);
    }
    
    public final View n(final RecyclerView$o recyclerView$o, final f0 f0) {
        if (!(recyclerView$o instanceof LinearLayoutManager)) {
            return null;
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)recyclerView$o;
        final int firstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (firstVisibleItemPosition == -1) {
            return null;
        }
        final View viewByPosition = recyclerView$o.findViewByPosition(firstVisibleItemPosition);
        float n;
        int n2;
        if (this.i) {
            n = (float)(f0.l() - f0.e(viewByPosition));
            n2 = f0.c(viewByPosition);
        }
        else {
            n = (float)f0.b(viewByPosition);
            n2 = f0.c(viewByPosition);
        }
        final float n3 = n / n2;
        final boolean b = linearLayoutManager.findLastCompletelyVisibleItemPosition() == recyclerView$o.getItemCount() - 1;
        if (n3 > 0.5f && !b) {
            return viewByPosition;
        }
        if (b) {
            return null;
        }
        return recyclerView$o.findViewByPosition(firstVisibleItemPosition + 1);
    }
}
