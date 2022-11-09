// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.StateSet;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

public class 12n extends 02N
{
    public a LIZIZ;
    public boolean LIZJ;
    
    static {
        Covode.recordClassIndex(314);
    }
    
    public 12n() {
        this(null, null);
    }
    
    public 12n(final byte b) {
    }
    
    public 12n(final a a, final Resources resources) {
        this.LIZ((b)new a(a, this, resources));
        this.onStateChange(this.getState());
    }
    
    public a LIZ() {
        return new a(this.LIZIZ, this, null);
    }
    
    @Override
    public void LIZ(final b b) {
        super.LIZ(b);
        if (b instanceof a) {
            this.LIZIZ = (a)b;
        }
    }
    
    @Override
    public void applyTheme(final Resources$Theme resources$Theme) {
        super.applyTheme(resources$Theme);
        this.onStateChange(this.getState());
    }
    
    @Override
    public boolean isStateful() {
        return true;
    }
    
    @Override
    public Drawable mutate() {
        if (!this.LIZJ) {
            super.mutate();
            if (this == this) {
                ((b)this.LIZIZ).LIZ();
                this.LIZJ = true;
            }
        }
        return this;
    }
    
    @Override
    public boolean onStateChange(final int[] array) {
        final boolean onStateChange = super.onStateChange(array);
        int n;
        if ((n = this.LIZIZ.LIZIZ(array)) < 0) {
            n = this.LIZIZ.LIZIZ(StateSet.WILD_CARD);
        }
        return this.LIZ(n) || onStateChange;
    }
    
    public static class a extends b
    {
        public int[][] LJJIJLIJ;
        
        static {
            Covode.recordClassIndex(315);
        }
        
        public a(final a a, final 12n 12n, final Resources resources) {
            super((b)a, 12n, resources);
            if (a != null) {
                this.LJJIJLIJ = a.LJJIJLIJ;
                return;
            }
            this.LJJIJLIJ = new int[super.LJIIIIZZ.length][];
        }
        
        @Override
        public void LIZ() {
            final int[][] ljjijlij = this.LJJIJLIJ;
            final int[][] ljjijlij2 = new int[ljjijlij.length][];
            for (int i = ljjijlij.length - 1; i >= 0; --i) {
                final int[][] ljjijlij3 = this.LJJIJLIJ;
                int[] clone;
                if (ljjijlij3[i] != null) {
                    clone = ljjijlij3[i].clone();
                }
                else {
                    clone = null;
                }
                ljjijlij2[i] = clone;
            }
            this.LJJIJLIJ = ljjijlij2;
        }
        
        public final int LIZIZ(final int[] array) {
            final int[][] ljjijlij = this.LJJIJLIJ;
            for (int ljiiiz = super.LJIIIZ, i = 0; i < ljiiiz; ++i) {
                if (StateSet.stateSetMatches(ljjijlij[i], array)) {
                    return i;
                }
            }
            return -1;
        }
        
        @Override
        public final void LIZIZ(final int n, final int n2) {
            super.LIZIZ(n, n2);
            final int[][] ljjijlij = new int[n2][];
            System.arraycopy(this.LJJIJLIJ, 0, ljjijlij, 0, n);
            this.LJJIJLIJ = ljjijlij;
        }
        
        public Drawable newDrawable() {
            return new 12n(this, null);
        }
        
        public Drawable newDrawable(final Resources resources) {
            return new 12n(this, resources);
        }
    }
}
