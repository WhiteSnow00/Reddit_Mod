// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.AttributeSet;
import android.graphics.drawable.Drawable$Callback;
import androidx.core.g.t;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class 1ik extends 1JC<View>
{
    public Drawable LIZ;
    public final View LIZIZ;
    public Drawable LIZJ;
    public a LJ;
    
    static {
        Covode.recordClassIndex(6136);
    }
    
    public 1ik(final View liziz) {
        super(liziz);
        this.LIZIZ = liziz;
    }
    
    private boolean LJ() {
        if (this.LIZ != null && Build$VERSION.SDK_INT == 21) {
            final ColorStateList backgroundTintList = this.LIZIZ.getBackgroundTintList();
            final PorterDuff$Mode backgroundTintMode = this.LIZIZ.getBackgroundTintMode();
            if (backgroundTintList != null) {
                this.LIZ.setTintList(backgroundTintList);
                final Drawable liz = this.LIZ;
                PorterDuff$Mode src_IN;
                if ((src_IN = backgroundTintMode) == null) {
                    src_IN = PorterDuff$Mode.SRC_IN;
                }
                liz.setTintMode(src_IN);
            }
            else {
                08U.LIZ(this.LIZ);
            }
            return true;
        }
        return false;
    }
    
    public final void LIZ(final int n) {
        this.LIZLLL(n);
    }
    
    public final void LIZ(final ColorStateList liz) {
        if (this.LJ == null) {
            this.LJ = new a((byte)0);
        }
        this.LJ.LIZ = liz;
        this.LJ.LIZLLL = true;
        this.LIZIZ();
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        if (typedArray.hasValue(0)) {
            final int resourceId = typedArray.getResourceId(0, 0);
            ColorStateList list;
            if (resourceId == 0 || (list = 01s.LIZ(this.LIZIZ.getContext(), resourceId)) == null) {
                list = typedArray.getColorStateList(0);
            }
            t.LIZ(this.LIZIZ, list);
        }
        else {
            t.LIZ(this.LIZIZ, (ColorStateList)null);
        }
        if (typedArray.hasValue(1)) {
            t.LIZ(this.LIZIZ, 0fo.LIZ(typedArray.getInt(1, -1), PorterDuff$Mode.SRC_IN));
            return;
        }
        t.LIZ(this.LIZIZ, PorterDuff$Mode.SRC_IN);
    }
    
    public final void LIZ(final PorterDuff$Mode liziz) {
        if (this.LJ == null) {
            this.LJ = new a((byte)0);
        }
        this.LJ.LIZIZ = liziz;
        this.LJ.LIZJ = true;
        this.LIZIZ();
    }
    
    public final void LIZ(final Drawable lizj) {
        if (this.LIZJ == lizj) {
            return;
        }
        this.LIZJ = lizj;
        final Drawable liz = this.LIZ;
        Label_0037: {
            if (liz != null) {
                if (liz == lizj) {
                    break Label_0037;
                }
                liz.setCallback((Drawable$Callback)null);
            }
            if (lizj == null) {
                this.LIZ = null;
                return;
            }
        }
        final Drawable liziz = 08U.LIZIZ(lizj);
        if ((this.LIZ = liziz) != lizj) {
            liziz.setCallback((Drawable$Callback)this.LIZIZ);
        }
        this.LIZIZ();
    }
    
    @Override
    public final void LIZ(final AttributeSet set, final int n, final int n2) {
        this.LIZ(this.LIZIZ.getBackground());
        super.LIZ(set, n, n2);
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 2130969090, 2130969091 };
    }
    
    public final void LIZIZ() {
        if (this.LJ()) {
            return;
        }
        if (this.LJ != null) {
            final Drawable liz = this.LIZ;
            if (liz != null) {
                liz.mutate();
                if (this.LJ.LIZLLL) {
                    this.LIZ.setTintList(this.LJ.LIZ);
                }
                if (this.LJ.LIZJ) {
                    final Drawable liz2 = this.LIZ;
                    PorterDuff$Mode tintMode;
                    if (this.LJ.LIZIZ != null) {
                        tintMode = this.LJ.LIZIZ;
                    }
                    else {
                        tintMode = PorterDuff$Mode.SRC_IN;
                    }
                    liz2.setTintMode(tintMode);
                }
            }
        }
    }
    
    public final boolean LIZIZ(final Drawable drawable) {
        return this.LIZ == drawable;
    }
    
    public final ColorStateList LIZJ() {
        final a lj = this.LJ;
        if (lj == null) {
            return null;
        }
        return lj.LIZ;
    }
    
    public final PorterDuff$Mode LIZLLL() {
        final a lj = this.LJ;
        if (lj == null) {
            return null;
        }
        return lj.LIZIZ;
    }
    
    public static final class a
    {
        public ColorStateList LIZ;
        public PorterDuff$Mode LIZIZ;
        public boolean LIZJ;
        public boolean LIZLLL;
        
        static {
            Covode.recordClassIndex(6137);
        }
    }
}
