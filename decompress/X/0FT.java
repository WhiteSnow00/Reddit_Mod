// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public final class 0FT implements Runnable
{
    public final /* synthetic */ 17E LIZ;
    
    static {
        Covode.recordClassIndex(1641);
    }
    
    public 0FT(final 17E liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        if (this.LIZ.LIZIZ != null) {
            final 17E liz = this.LIZ;
            Label_0502: {
                if (liz.LIZIZ != null) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    long n;
                    if (liz.LJIJ == Long.MIN_VALUE) {
                        n = 0L;
                    }
                    else {
                        n = currentTimeMillis - liz.LJIJ;
                    }
                    final RecyclerView.i layoutManager = liz.LJIIL.getLayoutManager();
                    if (liz.LJIIZILJ == null) {
                        liz.LJIIZILJ = new Rect();
                    }
                    layoutManager.LIZIZ(liz.LIZIZ.itemView, liz.LJIIZILJ);
                    while (true) {
                        Label_0485: {
                            if (!layoutManager.LJFF()) {
                                break Label_0485;
                            }
                            final int n2 = (int)(liz.LJI + liz.LJ);
                            int n3 = n2 - liz.LJIIZILJ.left - liz.LJIIL.getPaddingLeft();
                            if (liz.LJ >= 0.0f || n3 >= 0) {
                                if (liz.LJ <= 0.0f) {
                                    break Label_0485;
                                }
                                n3 = n2 + liz.LIZIZ.itemView.getWidth() + liz.LJIIZILJ.right - (liz.LJIIL.getWidth() - liz.LJIIL.getPaddingRight());
                                if (n3 <= 0) {
                                    break Label_0485;
                                }
                            }
                            while (true) {
                                Label_0423: {
                                    if (!layoutManager.LJI()) {
                                        break Label_0423;
                                    }
                                    final int n4 = (int)(liz.LJII + liz.LJFF);
                                    int n5 = n4 - liz.LJIIZILJ.top - liz.LJIIL.getPaddingTop();
                                    if (liz.LJFF >= 0.0f || n5 >= 0) {
                                        if (liz.LJFF <= 0.0f) {
                                            break Label_0423;
                                        }
                                        n5 = n4 + liz.LIZIZ.itemView.getHeight() + liz.LJIIZILJ.bottom - (liz.LJIIL.getHeight() - liz.LJIIL.getPaddingBottom());
                                        if (n5 <= 0) {
                                            break Label_0423;
                                        }
                                    }
                                    int liz2;
                                    if ((liz2 = n3) != 0) {
                                        liz2 = liz.LJIIIZ.LIZ(liz.LJIIL, liz.LIZIZ.itemView.getWidth(), n3, liz.LJIIL.getWidth(), n);
                                    }
                                    int liz3;
                                    if ((liz3 = n5) != 0) {
                                        liz3 = liz.LJIIIZ.LIZ(liz.LJIIL, liz.LIZIZ.itemView.getHeight(), n5, liz.LJIIL.getHeight(), n);
                                    }
                                    if (liz2 != 0 || liz3 != 0) {
                                        if (liz.LJIJ == Long.MIN_VALUE) {
                                            liz.LJIJ = currentTimeMillis;
                                        }
                                        liz.LJIIL.scrollBy(liz2, liz3);
                                        if (this.LIZ.LIZIZ != null) {
                                            final 17E liz4 = this.LIZ;
                                            liz4.LIZ(liz4.LIZIZ);
                                        }
                                        this.LIZ.LJIIL.removeCallbacks(this.LIZ.LJIILIIL);
                                        ((View)this.LIZ.LJIIL).postOnAnimation((Runnable)this);
                                        return;
                                    }
                                    break Label_0502;
                                }
                                int n5 = 0;
                                continue;
                            }
                        }
                        int n3 = 0;
                        continue;
                    }
                }
            }
            liz.LJIJ = Long.MIN_VALUE;
        }
    }
}
