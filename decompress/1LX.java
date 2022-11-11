// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;

public final class 1lx extends 1XS
{
    public LinkPlayerInfo LIZJ;
    public boolean LIZLLL;
    public Vuc LJ;
    public 1si LJFF;
    public boolean LJI;
    public final String LJII;
    public 1si LJIIJJI;
    public 1si LJIIL;
    public FrameLayout LJIILIIL;
    public ViewGroup LJIILJJIL;
    
    static {
        Covode.recordClassIndex(9040);
    }
    
    public 1lx(final String ljii) {
        CTM.LIZ((Object)ljii);
        this.LJII = ljii;
    }
    
    private final void LIZ(final View view, final float n) {
        if (view == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0cB.LIZ(n);
        layoutParams.width = 0cB.LIZ(n);
        view.setLayoutParams(layoutParams);
    }
    
    @Override
    public final int LIZ() {
        return 2131562248;
    }
    
    public final void LIZ(final Vuc lj) {
        CTM.LIZ((Object)lj);
        this.LJ = lj;
    }
    
    @Override
    public final void LIZ(final ViewGroup viewGroup) {
        super.LIZ(viewGroup);
        final View view = null;
        1si ljiijji;
        if (viewGroup != null) {
            ljiijji = (1si)viewGroup.findViewById(2131367010);
        }
        else {
            ljiijji = null;
        }
        this.LJIIJJI = ljiijji;
        1si ljiil;
        if (viewGroup != null) {
            ljiil = (1si)viewGroup.findViewById(2131367008);
        }
        else {
            ljiil = null;
        }
        this.LJIIL = ljiil;
        1si ljff;
        if (viewGroup != null) {
            ljff = (1si)viewGroup.findViewById(2131368962);
        }
        else {
            ljff = null;
        }
        this.LJFF = ljff;
        FrameLayout ljiiliil;
        if (viewGroup != null) {
            ljiiliil = (FrameLayout)viewGroup.findViewById(2131362512);
        }
        else {
            ljiiliil = null;
        }
        this.LJIILIIL = ljiiliil;
        if (ljiiliil != null) {
            GlD.LIZ((View)ljiiliil);
        }
        ViewGroup liz;
        if (viewGroup != null) {
            liz = (ViewGroup)viewGroup.findViewById(2131367799);
        }
        else {
            liz = null;
        }
        super.LIZ = liz;
        View viewById;
        if (viewGroup != null) {
            viewById = viewGroup.findViewById(2131366795);
        }
        else {
            viewById = null;
        }
        super.LIZIZ = viewById;
        final ViewGroup liz2 = super.LIZ;
        if (liz2 != null) {
            GlD.LIZ((View)liz2);
        }
        final View liziz = super.LIZIZ;
        if (liziz != null) {
            GlD.LIZ(liziz);
        }
        ViewGroup ljiiljjil = (ViewGroup)view;
        if (viewGroup != null) {
            ljiiljjil = (ViewGroup)viewGroup.findViewById(2131365358);
        }
        if ((this.LJIILJJIL = ljiiljjil) != null) {
            GlD.LIZ((View)ljiiljjil);
        }
    }
    
    public final void LIZ(final boolean lji, int n, final Vuc vuc) {
        Label_0288: {
            if (lji) {
                final LinkPlayerInfo lizj = this.LIZJ;
                if (lizj != null) {
                    final User lizj2 = lizj.LIZJ;
                    if (lizj2 != null) {
                        final ImageModel avatarThumb = lizj2.getAvatarThumb();
                        if (avatarThumb != null) {
                            if (super.LJIIIZ == null || super.LJIIIIZZ == null) {
                                break Label_0288;
                            }
                            final ViewGroup ljiiiizz = super.LJIIIIZZ;
                            if (ljiiiizz != null) {
                                GlD.LIZJ((View)ljiiiizz);
                            }
                            final FrameLayout ljiiliil = this.LJIILIIL;
                            if (ljiiliil != null) {
                                GlD.LIZJ((View)ljiiliil);
                            }
                            final ViewGroup liz = super.LIZ;
                            if (liz != null) {
                                GlD.LIZ((View)liz);
                            }
                            final View liziz = super.LIZIZ;
                            if (liziz != null) {
                                GlD.LIZ(liziz);
                            }
                            final 1si ljiil = this.LJIIL;
                            int width = 0;
                            if (ljiil != null && vuc != null) {
                                final ViewGroup ljiiiz = super.LJIIIZ;
                                if (ljiiiz != null) {
                                    n = ljiiiz.getMeasuredWidth();
                                }
                                else {
                                    n = 0;
                                }
                                if (n > 0cB.LIZ(104.0f)) {
                                    this.LIZ((View)ljiil, 60.0f);
                                    this.LIZ((View)this.LJFF, 96.0f);
                                }
                                else {
                                    this.LIZ((View)ljiil, 40.0f);
                                    this.LIZ((View)this.LJFF, 64.0f);
                                }
                            }
                            final 1si ljiil2 = this.LJIIL;
                            if (ljiil2 != null) {
                                if (LiveImageLoaderModuleSetting.useImageModule()) {
                                    final G18 liz2 = 0cp.LIZ();
                                    0cq.LIZ(liz2, avatarThumb);
                                    liz2.LIZIZ(2131234398);
                                    liz2.LIZ(((ImageView)ljiil2).getWidth(), ((ImageView)ljiil2).getHeight());
                                    liz2.LIZ(Boolean.valueOf(true));
                                    liz2.LIZ((View)ljiil2);
                                }
                                else {
                                    HFv.LIZ((ImageView)ljiil2, avatarThumb, ((ImageView)ljiil2).getWidth(), ((ImageView)ljiil2).getHeight(), 2131234398);
                                }
                            }
                            final 1si ljiijji = this.LJIIJJI;
                            if (ljiijji == null) {
                                break Label_0288;
                            }
                            if (this.LIZLLL && vuc == Vuc.FLOAT) {
                                GlD.LIZ((View)ljiijji);
                                break Label_0288;
                            }
                            GlD.LIZJ((View)ljiijji);
                            final ViewGroup ljiiiz2 = super.LJIIIZ;
                            if (ljiiiz2 != null) {
                                n = ljiiiz2.getHeight();
                            }
                            else {
                                n = 0;
                            }
                            final ViewGroup ljiiiz3 = super.LJIIIZ;
                            if (ljiiiz3 != null) {
                                width = ljiiiz3.getWidth();
                            }
                            CTM.LIZ((Object)ljiijji);
                            float n2;
                            if (n == 0 || width == 0) {
                                n2 = 0.74698794f;
                            }
                            else {
                                n2 = width / (float)n;
                            }
                            final HZ0 ljiij = new HZ0(5, n2);
                            if (avatarThumb.getUrls() == null || avatarThumb.getUrls().size() == 0) {
                                final S8f liz3 = S8f.LIZ(Ql3.LIZ(2131234398));
                                liz3.LJIIJ = (Qys)ljiij;
                                final S8e liz4 = liz3.LIZ();
                                final SAp liziz2 = SBH.LIZIZ();
                                ((SDU)liziz2).LIZIZ((Object)liz4);
                                ((SDU)liziz2).LIZ(((SEd)ljiijji).getController());
                                ((SEd)ljiijji).setController((SDe)((SDU)liziz2).LIZJ());
                                break Label_0288;
                            }
                            if (LiveImageLoaderModuleSetting.useImageModule()) {
                                final G18 liz5 = 0cp.LIZ();
                                0cq.LIZ(liz5, avatarThumb);
                                liz5.LIZ(n2);
                                liz5.LIZ((View)ljiijji);
                                break Label_0288;
                            }
                            0ch.LIZ(ljiijji, avatarThumb, (Qys)ljiij);
                            break Label_0288;
                        }
                    }
                }
                if (!this.LIZLLL && (vuc == Vuc.FLOAT_FIX || vuc == Vuc.GRID_FIX)) {
                    0ba.LIZ(3, "qiuyihao_test", "show empty view\u3002\u3002\u3002\u3002");
                    if (n != 3) {
                        this.LIZIZ();
                    }
                    else {
                        this.LIZJ();
                    }
                }
            }
            else {
                final FrameLayout ljiiliil2 = this.LJIILIIL;
                if (ljiiliil2 != null) {
                    GlD.LIZ((View)ljiiliil2);
                }
                final ViewGroup ljiiljjil = this.LJIILJJIL;
                if (ljiiljjil != null) {
                    GlD.LIZ((View)ljiiljjil);
                }
            }
        }
        this.LJI = lji;
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZIZ();
        final ViewGroup ljiiiizz = super.LJIIIIZZ;
        if (ljiiiizz != null) {
            GlD.LIZJ((View)ljiiiizz);
        }
        final ViewGroup ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            GlD.LIZJ((View)ljiiljjil);
        }
    }
    
    @Override
    public final void LIZJ() {
        super.LIZJ();
        final ViewGroup ljiiiizz = super.LJIIIIZZ;
        if (ljiiiizz != null) {
            GlD.LIZJ((View)ljiiiizz);
        }
        final ViewGroup ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            GlD.LIZJ((View)ljiiljjil);
        }
    }
    
    @Override
    public final String LIZLLL() {
        return this.LJII;
    }
    
    public final 0r4 LJ() {
        final 1si ljff = this.LJFF;
        if (ljff != null) {
            return new 0r4(ljff);
        }
        return null;
    }
}
