// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.f;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;

public abstract class 16q extends f
{
    public boolean LJIIL;
    
    static {
        Covode.recordClassIndex(1566);
    }
    
    public 16q() {
        this.LJIIL = true;
    }
    
    public abstract boolean LIZ(final ViewHolder p0);
    
    public abstract boolean LIZ(final ViewHolder p0, final int p1, final int p2, final int p3, final int p4);
    
    public final boolean LIZ(final ViewHolder viewHolder, final c c, final c c2) {
        final int liz = c.LIZ;
        final int liziz = c.LIZIZ;
        final View itemView = viewHolder.itemView;
        int n;
        if (c2 == null) {
            n = itemView.getLeft();
        }
        else {
            n = c2.LIZ;
        }
        int n2;
        if (c2 == null) {
            n2 = itemView.getTop();
        }
        else {
            n2 = c2.LIZIZ;
        }
        if (!viewHolder.isRemoved() && (liz != n || liziz != n2)) {
            itemView.layout(n, n2, itemView.getWidth() + n, itemView.getHeight() + n2);
            return this.LIZ(viewHolder, liz, liziz, n, n2);
        }
        return this.LIZ(viewHolder);
    }
    
    public abstract boolean LIZ(final ViewHolder p0, final ViewHolder p1, final int p2, final int p3, final int p4, final int p5);
    
    public final boolean LIZ(final ViewHolder viewHolder, final ViewHolder viewHolder2, final c c, final c c2) {
        final int liz = c.LIZ;
        final int liziz = c.LIZIZ;
        int n;
        int n2;
        if (viewHolder2.shouldIgnore()) {
            n = c.LIZ;
            n2 = c.LIZIZ;
        }
        else {
            n = c2.LIZ;
            n2 = c2.LIZIZ;
        }
        return this.LIZ(viewHolder, viewHolder2, liz, liziz, n, n2);
    }
    
    public abstract boolean LIZIZ(final ViewHolder p0);
    
    public final boolean LIZIZ(final ViewHolder viewHolder, final c c, final c c2) {
        if (c != null && (c.LIZ != c2.LIZ || c.LIZIZ != c2.LIZIZ)) {
            return this.LIZ(viewHolder, c.LIZ, c.LIZIZ, c2.LIZ, c2.LIZIZ);
        }
        return this.LIZIZ(viewHolder);
    }
    
    public final boolean LIZJ(final ViewHolder viewHolder, final c c, final c c2) {
        if (c.LIZ != c2.LIZ || c.LIZIZ != c2.LIZIZ) {
            return this.LIZ(viewHolder, c.LIZ, c.LIZIZ, c2.LIZ, c2.LIZIZ);
        }
        ((RecyclerView.f)this).LJI(viewHolder);
        return false;
    }
    
    @Override
    public final boolean LJII(final ViewHolder viewHolder) {
        return !this.LJIIL || viewHolder.isInvalid();
    }
    
    public final void LJIIIIZZ(final ViewHolder viewHolder) {
        this.LJIIIZ(viewHolder);
        ((RecyclerView.f)this).LJI(viewHolder);
    }
    
    public void LJIIIZ(final ViewHolder viewHolder) {
    }
}
