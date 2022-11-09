// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import android.view.LayoutInflater;
import android.content.Context;

public abstract class 12u implements 02r
{
    public Context LIZ;
    public Context LIZIZ;
    public 12x LIZJ;
    public LayoutInflater LIZLLL;
    public a LJ;
    public 02t LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(337);
    }
    
    public 12u(final Context liz) {
        this.LIZ = liz;
        this.LIZLLL = LayoutInflater.from(liz);
        this.LJII = 2131558442;
        this.LJIIIIZZ = 2131558441;
    }
    
    public 02t LIZ(final ViewGroup viewGroup) {
        if (this.LJFF == null) {
            (this.LJFF = (02t)0II.LIZ(this.LIZLLL, this.LJII, viewGroup, false)).LIZ(this.LIZJ);
            this.LIZ(true);
        }
        return this.LJFF;
    }
    
    public View LIZ(final 130 130, final View view, final ViewGroup viewGroup) {
        02t.a a;
        if (view instanceof 02t.a) {
            a = (02t.a)view;
        }
        else {
            a = (02t.a)0II.LIZ(this.LIZLLL, this.LJIIIIZZ, viewGroup, false);
        }
        this.LIZ(130, a);
        return (View)a;
    }
    
    @Override
    public final void LIZ(final a lj) {
        this.LJ = lj;
    }
    
    @Override
    public void LIZ(final 12x 12x, final boolean b) {
        final a lj = this.LJ;
        if (lj != null) {
            lj.LIZ(12x, b);
        }
    }
    
    public abstract void LIZ(final 130 p0, final 02t.a p1);
    
    @Override
    public void LIZ(final Context liziz, final 12x lizj) {
        LayoutInflater.from(this.LIZIZ = liziz);
        this.LIZJ = lizj;
    }
    
    @Override
    public void LIZ(final boolean b) {
        final ViewGroup viewGroup = (ViewGroup)this.LJFF;
        if (viewGroup == null) {
            return;
        }
        final 12x lizj = this.LIZJ;
        int i = 0;
        if (lizj != null) {
            lizj.LJIIIZ();
            final ArrayList<130> ljiiiizz = this.LIZJ.LJIIIIZZ();
            final int size = ljiiiizz.size();
            int j = 0;
            i = 0;
            while (j < size) {
                final 130 130 = ljiiiizz.get(j);
                int n = i;
                if (this.LIZ(130)) {
                    final View child = viewGroup.getChildAt(i);
                    130 itemData;
                    if (child instanceof 02t.a) {
                        itemData = ((02t.a)child).getItemData();
                    }
                    else {
                        itemData = null;
                    }
                    final View liz = this.LIZ(130, child, viewGroup);
                    if (130 != itemData) {
                        liz.setPressed(false);
                        liz.jumpDrawablesToCurrentState();
                    }
                    if (liz != child) {
                        final ViewGroup viewGroup2 = (ViewGroup)liz.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(liz);
                        }
                        ((ViewGroup)this.LJFF).addView(liz, i);
                    }
                    n = i + 1;
                }
                ++j;
                i = n;
            }
        }
        while (i < viewGroup.getChildCount()) {
            if (!this.LIZ(viewGroup, i)) {
                ++i;
            }
        }
    }
    
    @Override
    public boolean LIZ() {
        return false;
    }
    
    public boolean LIZ(final 130 130) {
        return true;
    }
    
    @Override
    public boolean LIZ(final 1fZ 1fZ) {
        final a lj = this.LJ;
        return lj != null && lj.LIZ(1fZ);
    }
    
    public boolean LIZ(final ViewGroup viewGroup, final int n) {
        viewGroup.removeViewAt(n);
        return true;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LJI;
    }
    
    @Override
    public final boolean LIZIZ(final 130 130) {
        return false;
    }
    
    @Override
    public final boolean LIZJ(final 130 130) {
        return false;
    }
}
