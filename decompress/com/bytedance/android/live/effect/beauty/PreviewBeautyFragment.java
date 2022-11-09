// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.beauty;

import X.0AO;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.n;
import X.SRo;
import X.0II;
import X.CTM;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1Kk;
import X.0gA;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class PreviewBeautyFragment extends BaseFragment
{
    public 0gA LIZ;
    public 1Kk LIZIZ;
    public HashMap LIZJ;
    
    static {
        Covode.recordClassIndex(6261);
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131562018, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        if ((view = this.LIZJ.get(2131371451)) == null) {
            view = this.getView();
            if (view == null) {
                view = null;
            }
            else {
                view = view.findViewById(2131371451);
                this.LIZJ.put(2131371451, view);
            }
        }
        final SRo liz = (SRo)view;
        n.LIZIZ((Object)liz, "");
        final 0gA liz2 = this.LIZ;
        final 1Kk liziz = this.LIZIZ;
        CTM.LIZ((Object)liz);
        final LiveBeautyFragment liveBeautyFragment = new LiveBeautyFragment();
        liveBeautyFragment.LIZ = liz;
        liveBeautyFragment.LIZJ = liz2;
        liveBeautyFragment.LIZLLL = liziz;
        final 0AO liz3 = this.getChildFragmentManager().LIZ();
        liz3.LIZ(2131362726, liveBeautyFragment);
        liz3.LJ();
    }
}
