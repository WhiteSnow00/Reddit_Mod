// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect;

import X.2P9;
import android.widget.SeekBar$OnSeekBarChangeListener;
import X.0vU;
import X.GlD;
import X.0II;
import X.CTM;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.HwV;
import androidx.fragment.app.Fragment;

public final class MultiGuestBeautyLevelAdjustFragment extends Fragment
{
    public static final MultiGuestBeautyLevelAdjustFragment.a LIZIZ;
    public AbsMultiGuestEffectViewModel LIZ;
    public HwV LIZJ;
    public HashMap LIZLLL;
    
    static {
        Covode.recordClassIndex(9673);
        LIZIZ = new MultiGuestBeautyLevelAdjustFragment.a((byte)0);
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131560674, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        Object o = view;
        if (!(view instanceof HwV)) {
            o = null;
        }
        final HwV lizj = (HwV)o;
        if ((this.LIZJ = lizj) != null) {
            GlD.LIZJ((View)lizj);
        }
        final HwV lizj2 = this.LIZJ;
        if (lizj2 != null) {
            lizj2.setSeekbarListener((SeekBar$OnSeekBarChangeListener)new 0vU());
        }
        final HwV lizj3 = this.LIZJ;
        if (lizj3 != null) {
            lizj3.setMaxProgress(5);
        }
        final AbsMultiGuestEffectViewModel liz = this.LIZ;
        if (liz != null) {
            final MultiGuestEffectSwitchFragment.b liziz = liz.LIZIZ;
            if (liziz != null) {
                final Integer value = liziz.LIZIZ();
                final int intValue = value.intValue();
                if (intValue >= 0 && 6 > intValue && value != null) {
                    final int intValue2 = value.intValue();
                    final HwV lizj4 = this.LIZJ;
                    if (lizj4 != null) {
                        lizj4.setCurrentProgress(intValue2);
                        if (2P9.LIZ != null) {
                            return;
                        }
                    }
                }
            }
        }
        final HwV lizj5 = this.LIZJ;
        if (lizj5 != null) {
            lizj5.setCurrentProgress(2);
        }
    }
}
