// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.smallitem;

import X.SRT;
import X.F2r;
import X.BFk;
import X.F0v;
import X.Cye;
import X.2CT;
import X.0CH;
import X.0CI;
import android.view.View$OnClickListener;
import X.0hw;
import X.1It;
import X.1ib;
import X.1KG;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.n;
import androidx.recyclerview.widget.RecyclerView;
import X.1Ls;
import X.0Bu;
import X.1M0;
import X.0i3;
import X.0Wn;
import X.0II;
import X.CTM;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1JQ;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import X.SRS;
import X.2P9;
import X.QgG;
import X.1jM;
import com.bytedance.android.livesdk.ui.BaseFragment;

public final class LiveSmallSubItemBeautyFragment extends BaseFragment
{
    public final 1jM LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public QgG<2P9> LJ;
    public SRS<? super LiveEffect, 2P9> LJFF;
    public LiveSmallItemBeautyViewModel LJI;
    public String LJII;
    public 1JQ LJIIIIZZ;
    public HashMap LJIIIZ;
    
    static {
        Covode.recordClassIndex(6592);
    }
    
    public LiveSmallSubItemBeautyFragment() {
        this.LIZ = new 1jM();
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJII = "";
    }
    
    public final View LIZ(final int n) {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIIIZ.get(n)) == null) {
            final View view = this.getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJIIIZ.put(n, viewById);
        }
        return viewById;
    }
    
    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getArguments();
        final String s = "";
        String string;
        if (bundle == null || (string = bundle.getString("live_effect_panel_info")) == null) {
            string = "";
        }
        this.LIZIZ = string;
        bundle = this.getArguments();
        String string2;
        if (bundle == null || (string2 = bundle.getString("live_effect_panel_name")) == null) {
            string2 = "";
        }
        this.LIZLLL = string2;
        final Bundle arguments = this.getArguments();
        String string3 = s;
        if (arguments != null) {
            string3 = arguments.getString("live_effect_panel_name_enum");
            if (string3 == null) {
                string3 = s;
            }
        }
        this.LJII = string3;
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        return 0II.LIZ(layoutInflater, 2131561954, viewGroup, false);
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        if (this.getActivity() != null) {
            this.LJI = 0Wn.LIZ.LIZ(new 1M0(new 0i3())).LIZ(LiveSmallItemBeautyViewModel.class);
        }
        final 1jM liz = this.LIZ;
        final 1Ls lizj = new 1Ls();
        CTM.LIZ((Object)lizj);
        liz.LIZJ = (1jM.b)lizj;
        final RecyclerView recyclerView = (RecyclerView)this.LIZ(2131371450);
        n.LIZIZ((Object)recyclerView, "");
        this.getContext();
        recyclerView.setLayoutManager((RecyclerView.i)new LinearLayoutManager(0, false));
        final RecyclerView recyclerView2 = (RecyclerView)this.LIZ(2131371450);
        n.LIZIZ((Object)recyclerView2, "");
        recyclerView2.setAdapter((RecyclerView.a)this.LIZ);
        ((RecyclerView)this.LIZ(2131371450)).LIZ((RecyclerView.h)new 1KG());
        final RecyclerView recyclerView3 = (RecyclerView)this.LIZ(2131371450);
        n.LIZIZ((Object)recyclerView3, "");
        recyclerView3.setItemAnimator((RecyclerView.f)null);
        final 1ib 1ib = (1ib)this.LIZ(2131369120);
        n.LIZIZ((Object)1ib, "");
        1ib.setText((CharSequence)this.LIZJ);
        ((1It)this.LIZ(2131362642)).setOnClickListener((View$OnClickListener)new 0hw(this));
        F0v.LIZ((BFk)0CI.LIZ(this), (F2r)null, (SRT)new 2CT(this, null), 3);
    }
}
