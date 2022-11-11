// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.effect.api.EffectRelatedApi;
import java.util.Collection;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.android.live.effect.model.FilterModel;

public final class 1it implements 1JT
{
    public static 0gg<FilterModel> LIZJ;
    public List<FilterModel> LIZ;
    public 1Kl LIZIZ;
    
    static {
        Covode.recordClassIndex(6346);
        1it.LIZJ = 1KJ.b.LIZ;
    }
    
    public 1it() {
        this.LIZ = 1it.LIZJ.LIZ();
        this.LIZIZ = new 1Kl();
    }
    
    private void LIZ(final int n, final int n2) {
        if (n < this.LIZ.size() && n2 < this.LIZ.size()) {
            1KJ.b.LIZ.LIZIZ(n2);
            FGP.LIZ().LIZ((Object)new 0hO());
            String filterPath;
            if (this.LJ() == 0 || this.LIZ.isEmpty()) {
                filterPath = "";
            }
            else {
                filterPath = this.LIZ.get(this.LJ()).getFilterPath();
            }
            if (n2 == 0) {
                0ba.LIZ(3, "LiveFilterHelper", "FilterEffect unset");
                this.LIZIZ.LIZ();
                return;
            }
            0ba.LIZ(3, "LiveFilterHelper", "FilterEffect update file:".concat(String.valueOf(filterPath)));
            this.LIZ(this.LIZ.get(this.LJ()));
        }
    }
    
    private void LIZ(final FilterModel filterModel) {
        if (filterModel != null) {
            if (TextUtils.isEmpty((CharSequence)filterModel.getFilterPath())) {
                this.LIZIZ.LIZ();
                return;
            }
            this.LIZIZ.LIZ(filterModel.getFilterPath(), 1it.LIZJ.LIZLLL(filterModel));
        }
    }
    
    @Override
    public final void LIZ() {
        1it.LIZJ.LIZIZ((0gg.b)this);
        final 1Kl liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ = null;
        }
    }
    
    @Override
    public final void LIZ(final int n) {
        final int lj = this.LJ();
        if (n >= 0 && n < this.LIZ.size()) {
            if (!1it.LIZJ.LIZIZ(this.LIZ.get(n))) {
                if (!1it.LIZJ.LIZJ(this.LIZ.get(n))) {
                    1it.LIZJ.LIZ(this.LIZ.get(n));
                }
                return;
            }
            this.LIZ(lj, n);
        }
    }
    
    @Override
    public final void LIZ(final long n) {
        final int intValue = (int)((44T)GST.LJIIZILJ).LIZ();
        if (intValue >= 1it.LIZJ.LIZ().size()) {
            return;
        }
        String name;
        if (!5s7.LIZ((Collection)1it.LIZJ.LIZ()) && intValue < 1it.LIZJ.LIZ().size() && 1it.LIZJ.LIZ().get(intValue) != null) {
            name = 1it.LIZJ.LIZ().get(intValue).getName();
        }
        else {
            name = "";
        }
        0yr.LIZ().LIZ(EffectRelatedApi.class).uploadBeautyParams(n, name, (int)((float)((44T)GST.LJIJJLI).LIZ() * 100.0f), (int)((float)((44T)GST.LJIL).LIZ() * 100.0f), (int)((float)((44T)GST.LJJ).LIZ() * 100.0f), (int)((float)((44T)GST.LJJI).LIZ() * 100.0f), false).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ(1KE.LIZ, 1KF.LIZ);
    }
    
    @Override
    public final void LIZ(final 0ga 0ga) {
        1it.LIZJ.LIZ((0gg.b)this);
        0ga.LIZ(this.LIZIZ);
        final int lj = this.LJ();
        FilterModel filterModel;
        if (lj <= 0 || lj >= this.LIZ.size()) {
            filterModel = null;
        }
        else {
            filterModel = this.LIZ.get(lj);
        }
        this.LIZ(filterModel);
    }
    
    @Override
    public final void LIZ(final LiveEffect liveEffect, final float n) {
        final 1Kl liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(liveEffect.getFilterPath(), n);
        }
    }
    
    @Override
    public final void LIZ(final boolean b) {
        if (b) {
            final List<FilterModel> liz = 1it.LIZJ.LIZ();
            this.LIZ = liz;
            if (!5s7.LIZ((Collection)liz) && (int)((44T)GST.LJIIZILJ).LIZ() > 0 && (int)((44T)GST.LJIIZILJ).LIZ() < this.LIZ.size() && this.LIZIZ != null) {
                0fx.LIZ.LIZ().LIZJ();
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        if (this.LIZ.isEmpty()) {
            return "";
        }
        return this.LIZ.get(this.LJ()).getName();
    }
    
    @Override
    public final void LIZJ() {
        if (this.LIZ.isEmpty()) {
            return;
        }
        final int lj = this.LJ();
        int n;
        if ((n = lj - 1) < 0) {
            n = this.LIZ.size() - 1;
        }
        final LiveEffect liveEffect = this.LIZ.get(n);
        if (!1it.LIZJ.LIZIZ((FilterModel)liveEffect)) {
            if (!1it.LIZJ.LIZJ((FilterModel)liveEffect)) {
                1it.LIZJ.LIZ((FilterModel)liveEffect);
            }
            return;
        }
        if (((44T)GST.LLLJIL).LIZ()) {
            ((44T)GST.LLLJIL).LIZ((Object)true);
        }
        this.LIZ(lj, n);
    }
    
    @Override
    public final void LIZLLL() {
        if (this.LIZ.isEmpty()) {
            return;
        }
        final int lj = this.LJ();
        int n;
        if ((n = lj + 1) >= this.LIZ.size()) {
            n = 0;
        }
        final LiveEffect liveEffect = this.LIZ.get(n);
        if (!1it.LIZJ.LIZIZ((FilterModel)liveEffect)) {
            if (!1it.LIZJ.LIZJ((FilterModel)liveEffect)) {
                1it.LIZJ.LIZ((FilterModel)liveEffect);
            }
            return;
        }
        if (((44T)GST.LLLJIL).LIZ()) {
            ((44T)GST.LLLJIL).LIZ((Object)true);
        }
        this.LIZ(lj, n);
    }
    
    @Override
    public final int LJ() {
        final int intValue = (int)((44T)GST.LJIIZILJ).LIZ();
        if (intValue >= this.LIZ.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }
    
    public static final class a
    {
        public static final 1it LIZ;
        
        static {
            Covode.recordClassIndex(6347);
            LIZ = new 1it((byte)0);
        }
    }
}
