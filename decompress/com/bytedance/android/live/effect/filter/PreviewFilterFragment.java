// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.filter;

import X.0AO;
import androidx.fragment.app.Fragment;
import X.0II;
import X.CTM;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class PreviewFilterFragment extends BaseFragment
{
    public HashMap LIZ;
    
    static {
        Covode.recordClassIndex(6301);
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131562019, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        final LiveFilterFragment liveFilterFragment = new LiveFilterFragment();
        final 0AO liz = this.getChildFragmentManager().LIZ();
        liz.LIZ(2131365204, liveFilterFragment);
        liz.LJ();
    }
}
