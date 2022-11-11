// 
// Decompiled by Procyon v0.6.0
// 

package com.a.a.a.a;

import X.SEd;
import android.content.Context;
import X.CTM;
import android.view.ViewGroup$LayoutParams;
import X.SEV;
import X.Rgh;
import X.SE3;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import X.I7e;
import android.graphics.drawable.Drawable;

public final class a
{
    public Drawable LIZ;
    public Drawable LIZIZ;
    public I7e LIZJ;
    public I7e LIZLLL;
    public float LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    
    static {
        Covode.recordClassIndex(1907);
    }
    
    public a() {
        final I7e lji = I7e.LJI;
        n.LIZ((Object)lji, "");
        this.LIZJ = lji;
        final I7e lji2 = I7e.LJI;
        n.LIZ((Object)lji2, "");
        this.LIZLLL = lji2;
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
    }
    
    private final I7e LIZ(final String s) {
        switch (s.hashCode()) {
            case -1928367066: {
                if (s.equals("fitBottomStart")) {
                    final I7e ljiiiz = I7e.LJIIIZ;
                    n.LIZ((Object)ljiiiz, "");
                    return ljiiiz;
                }
                break;
            }
            case -1364013995: {
                if (s.equals("center")) {
                    final I7e ljff = I7e.LJFF;
                    n.LIZ((Object)ljff, "");
                    return ljff;
                }
                break;
            }
            case -1274298614: {
                if (s.equals("fitEnd")) {
                    final I7e lj = I7e.LJ;
                    n.LIZ((Object)lj, "");
                    return lj;
                }
                break;
            }
            case -522179887: {
                if (s.equals("fitStart")) {
                    final I7e lizj = I7e.LIZJ;
                    n.LIZ((Object)lizj, "");
                    return lizj;
                }
                break;
            }
            case -340708175: {
                if (s.equals("centerInside")) {
                    final I7e lji = I7e.LJI;
                    n.LIZ((Object)lji, "");
                    return lji;
                }
                break;
            }
            case 97441490: {
                if (s.equals("fitXY")) {
                    final I7e liziz = I7e.LIZIZ;
                    n.LIZ((Object)liziz, "");
                    return liziz;
                }
                break;
            }
            case 520762310: {
                if (s.equals("fitCenter")) {
                    final I7e lizlll = I7e.LIZLLL;
                    n.LIZ((Object)lizlll, "");
                    return lizlll;
                }
                break;
            }
            case 1161480325: {
                if (s.equals("centerCrop")) {
                    final I7e ljii = I7e.LJII;
                    n.LIZ((Object)ljii, "");
                    return ljii;
                }
                break;
            }
            case 1628133256: {
                if (s.equals("focusCrop")) {
                    final I7e ljiiiizz = I7e.LJIIIIZZ;
                    n.LIZ((Object)ljiiiizz, "");
                    return ljiiiizz;
                }
                break;
            }
        }
        throw new IllegalArgumentException("fresco unsupported scale attr ".concat(String.valueOf(s)));
    }
    
    private final Rgh LIZ(final SE3 se3) {
        final SEV sev = (SEV)((SEd)se3).getHierarchy();
        n.LIZ((Object)sev, "");
        Rgh liz;
        if ((liz = sev.LIZ) == null) {
            liz = new Rgh();
            final SEV sev2 = (SEV)((SEd)se3).getHierarchy();
            n.LIZ((Object)sev2, "");
            sev2.LIZ(liz);
        }
        return liz;
    }
    
    public final void LIZ(final SE3 se3, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        CTM.LIZ((Object)se3, (Object)viewGroup$LayoutParams);
        final Drawable liz = this.LIZ;
        if (liz != null) {
            ((SEV)((SEd)se3).getHierarchy()).LIZ(liz, this.LIZJ);
        }
        if (this.LIZIZ != null) {
            ((SEV)((SEd)se3).getHierarchy()).LIZIZ(this.LIZIZ, this.LIZLLL);
        }
        if (this.LJFF) {
            final boolean lji = this.LJI;
            float lj = 0.0f;
            float lj2;
            if (lji) {
                lj2 = this.LJ;
            }
            else {
                lj2 = 0.0f;
            }
            float lj3;
            if (this.LJII) {
                lj3 = this.LJ;
            }
            else {
                lj3 = 0.0f;
            }
            float lj4;
            if (this.LJIIIIZZ) {
                lj4 = this.LJ;
            }
            else {
                lj4 = 0.0f;
            }
            if (this.LJIIIZ) {
                lj = this.LJ;
            }
            this.LIZ(se3).LIZ(lj2, lj3, lj, lj4);
        }
    }
    
    public final boolean LIZ(String s, final com.a.b.a.a a, final SE3 se3, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        CTM.LIZ((Object)s, (Object)a, (Object)se3, (Object)viewGroup$LayoutParams);
        final Context context = se3.getContext();
        final String liz = com.a.b.b.a.LIZ(s);
        Label_0945: {
            Label_0788: {
                Label_0721: {
                    Label_0684: {
                        switch (liz.hashCode()) {
                            case -2024905967: {
                                if (liz.equals("roundingBorderPadding")) {
                                    final Rgh liz2 = this.LIZ(se3);
                                    n.LIZ((Object)context, "");
                                    liz2.LIZLLL(com.a.b.b.a.LIZ(context, a));
                                    return true;
                                }
                                break;
                            }
                            case -1571314776: {
                                if (liz.equals("placeholderImage")) {
                                    n.LIZ((Object)context, "");
                                    this.LIZ = com.a.b.b.a.LIZJ(context, a);
                                    return true;
                                }
                                break;
                            }
                            case -828257865: {
                                if (liz.equals("actualImageScaleType")) {
                                    final SEV sev = (SEV)((SEd)se3).getHierarchy();
                                    n.LIZ((Object)sev, "");
                                    final String liz3 = a.LIZ;
                                    n.LIZ((Object)liz3, "");
                                    sev.LIZ(this.LIZ(liz3));
                                    return true;
                                }
                                break;
                            }
                            case -574205305: {
                                if (liz.equals("roundWithOverlayColor")) {
                                    final Rgh liz4 = this.LIZ(se3);
                                    n.LIZ((Object)context, "");
                                    liz4.LIZ(com.a.b.b.a.LIZLLL(context, a));
                                    return true;
                                }
                                break;
                            }
                            case -548532620: {
                                if (liz.equals("roundTopEnd")) {
                                    break Label_0684;
                                }
                                break;
                            }
                            case -210833935: {
                                if (liz.equals("failureImage")) {
                                    n.LIZ((Object)context, "");
                                    this.LIZIZ = com.a.b.b.a.LIZJ(context, a);
                                    return true;
                                }
                                break;
                            }
                            case -208400190: {
                                if (liz.equals("roundBottomEnd")) {
                                    break Label_0788;
                                }
                                break;
                            }
                            case -197243856: {
                                if (liz.equals("fadeDuration")) {
                                    final SEV sev2 = (SEV)((SEd)se3).getHierarchy();
                                    n.LIZ((Object)sev2, "");
                                    final String liz5 = a.LIZ;
                                    n.LIZ((Object)liz5, "");
                                    sev2.LIZIZ(Integer.parseInt(liz5));
                                    return true;
                                }
                                break;
                            }
                            case 112371891: {
                                if (liz.equals("failureImageScaleType")) {
                                    s = a.LIZ;
                                    n.LIZ((Object)s, "");
                                    this.LIZLLL = this.LIZ(s);
                                    return true;
                                }
                                break;
                            }
                            case 175558030: {
                                if (liz.equals("roundTopLeft")) {
                                    break Label_0721;
                                }
                                break;
                            }
                            case 265397995: {
                                if (liz.equals("overlayImage")) {
                                    final SEV sev3 = (SEV)((SEd)se3).getHierarchy();
                                    n.LIZ((Object)context, "");
                                    sev3.LIZLLL(com.a.b.b.a.LIZJ(context, a));
                                    return true;
                                }
                                break;
                            }
                            case 387575632: {
                                if (liz.equals("roundAsCircle")) {
                                    this.LIZ(se3).LIZ(com.a.b.b.a.LIZ(a));
                                    return true;
                                }
                                break;
                            }
                            case 694764180: {
                                if (liz.equals("roundedCornerRadius")) {
                                    n.LIZ((Object)context, "");
                                    this.LJ = com.a.b.b.a.LIZ(context, a);
                                    this.LIZ(se3).LIZ(this.LJ);
                                    return true;
                                }
                                break;
                            }
                            case 709193948: {
                                if (liz.equals("placeholderImageScaleType")) {
                                    s = a.LIZ;
                                    n.LIZ((Object)s, "");
                                    this.LIZJ = this.LIZ(s);
                                    return true;
                                }
                                break;
                            }
                            case 1152992629: {
                                if (liz.equals("roundTopRight")) {
                                    break Label_0684;
                                }
                                break;
                            }
                            case 1154238395: {
                                if (liz.equals("roundTopStart")) {
                                    break Label_0721;
                                }
                                break;
                            }
                            case 1493910427: {
                                if (liz.equals("actualImageResource")) {
                                    n.LIZ((Object)context, "");
                                    se3.setActualImageResource(com.a.b.b.a.LIZIZ(context, a));
                                    return true;
                                }
                                break;
                            }
                            case 1602743363: {
                                if (liz.equals("roundBottomRight")) {
                                    break Label_0788;
                                }
                                break;
                            }
                            case 1603989129: {
                                if (liz.equals("roundBottomStart")) {
                                    break Label_0945;
                                }
                                break;
                            }
                            case 1625491118: {
                                if (liz.equals("viewAspectRatio")) {
                                    s = a.LIZ;
                                    n.LIZ((Object)s, "");
                                    ((SEd)se3).setAspectRatio(Float.parseFloat(s));
                                    return true;
                                }
                                break;
                            }
                            case 2086868579: {
                                if (liz.equals("roundingBorderColor")) {
                                    final Rgh liz6 = this.LIZ(se3);
                                    n.LIZ((Object)context, "");
                                    liz6.LIZIZ(com.a.b.b.a.LIZLLL(context, a));
                                    return true;
                                }
                                break;
                            }
                            case 2105152710: {
                                if (liz.equals("roundingBorderWidth")) {
                                    final Rgh liz7 = this.LIZ(se3);
                                    n.LIZ((Object)context, "");
                                    liz7.LIZJ(com.a.b.b.a.LIZ(context, a));
                                    return true;
                                }
                                break;
                            }
                            case 2129728768: {
                                if (liz.equals("roundBottomLeft")) {
                                    break Label_0945;
                                }
                                break;
                            }
                        }
                        final Context context2 = se3.getContext();
                        final String simpleName = this.getClass().getSimpleName();
                        n.LIZ((Object)simpleName, "");
                        return com.a.b.b.a.LIZ(context2, simpleName, s);
                    }
                    this.LJFF = true;
                    s = a.LIZ;
                    n.LIZ((Object)s, "");
                    this.LJII = Boolean.parseBoolean(s);
                    return true;
                }
                this.LJFF = true;
                s = a.LIZ;
                n.LIZ((Object)s, "");
                this.LJI = Boolean.parseBoolean(s);
                return true;
            }
            this.LJFF = true;
            s = a.LIZ;
            n.LIZ((Object)s, "");
            this.LJIIIZ = Boolean.parseBoolean(s);
            return true;
        }
        this.LJFF = true;
        s = a.LIZ;
        n.LIZ((Object)s, "");
        this.LJIIIIZZ = Boolean.parseBoolean(s);
        return true;
    }
}
