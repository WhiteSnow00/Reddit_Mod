// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.smallitem;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.SRS;
import X.1tl;
import X.2C9;
import androidx.fragment.app.Fragment;
import X.HAM;
import X.SRT;
import X.F2r;
import X.BFk;
import X.F0v;
import X.Cye;
import X.2CQ;
import X.0CH;
import X.0CI;
import X.H2V;
import X.Gr8;
import X.I4V;
import X.5DO;
import X.H2n;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.n;
import androidx.recyclerview.widget.RecyclerView;
import X.1Lp;
import X.0Bu;
import X.1M0;
import X.0i3;
import X.0Wn;
import X.0II;
import X.CTM;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.view.View;
import java.util.LinkedHashSet;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1JQ;
import java.util.Set;
import X.1jK;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class LiveSmallItemBeautyFragment extends BaseFragment
{
    public static final LiveSmallItemBeautyFragment.a LJI;
    public String LIZ;
    public final 1jK LIZIZ;
    public Set<String> LIZJ;
    public LiveSmallItemBeautyViewModel LIZLLL;
    public 1JQ LJ;
    public String LJFF;
    public HashMap LJII;
    
    static {
        Covode.recordClassIndex(6582);
        LJI = new LiveSmallItemBeautyFragment.a((byte)0);
    }
    
    public LiveSmallItemBeautyFragment() {
        this.LIZIZ = new 1jK();
        this.LIZJ = new LinkedHashSet<String>();
    }
    
    private View LIZIZ() {
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJII.get(2131371450)) == null) {
            final View view = this.getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(2131371450);
            this.LJII.put(2131371450, viewById);
        }
        return viewById;
    }
    
    public final void LIZ() {
        this.LIZIZ.LIZ();
    }
    
    public final void LIZ(final LiveEffect liveEffect) {
        if (liveEffect == null) {
            return;
        }
        this.LIZIZ.LIZ(liveEffect);
    }
    
    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getArguments();
        String string;
        if (bundle == null || (string = bundle.getString("live_effect_panel_name")) == null) {
            string = "";
        }
        this.LIZ = string;
        bundle = this.getArguments();
        String string2;
        if (bundle != null) {
            string2 = bundle.getString("live_effect_panel_name_enum");
        }
        else {
            string2 = null;
        }
        this.LJFF = string2;
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131561953, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        this.LIZIZ.LJFF = this.LJ;
        this.LIZIZ.LJI = this.LJFF;
        if (this.getActivity() != null) {
            this.LIZLLL = 0Wn.LIZ.LIZ(new 1M0(new 0i3())).LIZ(LiveSmallItemBeautyViewModel.class);
        }
        final 1jK liziz = this.LIZIZ;
        final 1Lp lizlll = new 1Lp();
        CTM.LIZ((Object)lizlll);
        liziz.LIZLLL = (1jK.b)lizlll;
        final RecyclerView recyclerView = (RecyclerView)this.LIZIZ();
        n.LIZIZ((Object)recyclerView, "");
        this.getContext();
        recyclerView.setLayoutManager((RecyclerView.i)new LinearLayoutManager(0, false));
        final RecyclerView recyclerView2 = (RecyclerView)this.LIZIZ();
        n.LIZIZ((Object)recyclerView2, "");
        recyclerView2.setAdapter((RecyclerView.a)this.LIZIZ);
        final RecyclerView recyclerView3 = (RecyclerView)this.LIZIZ();
        n.LIZIZ((Object)recyclerView3, "");
        recyclerView3.setItemAnimator((RecyclerView.f)null);
        final H2n h2n = (H2n)this.LIZIZ();
        n.LIZIZ((Object)h2n, "");
        CTM.LIZ((Object)h2n);
        final 5DO 5do = I4V.LIZIZ.get("panel_beauty_slide");
        Object o;
        if (5do != null) {
            o = 5do.getValue();
        }
        else {
            o = null;
        }
        ((RecyclerView)h2n).LIZ((RecyclerView.n)new Gr8((H2V)o));
        F0v.LIZ((BFk)0CI.LIZ(this), (F2r)null, (SRT)new 2CQ(this, null), 3);
        final DataChannel liz = HAM.LIZ((Fragment)this);
        if (liz != null) {
            liz.LIZ((0CH)this, (Class)2C9.class, (SRS)new 1tl(this));
        }
    }
}
