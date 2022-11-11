// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast;

import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import X.2BI;
import X.HQ6;
import X.HQT;
import X.Fgy;
import X.G8t;
import X.G7H;
import X.HQP;
import X.5Hp;
import X.FfN;
import X.HPf;
import X.HQF;
import X.HQ5;
import X.2BA;
import X.2BB;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import X.G73;
import X.0CH;
import X.0Bp;
import X.CnW;
import X.0Bu;
import X.0Bv;
import X.FiE;
import android.view.Window;
import android.app.Activity;
import X.2TN;
import java.util.Iterator;
import java.util.List;
import X.0AB;
import X.1nL;
import X.E4k;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.content.Intent;
import X.CTM;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import X.GIK;
import X.Fk2;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.HAL;
import X.Gqe;
import com.bytedance.android.livesdk.ui.BaseFragment;

public abstract class BaseBroadcastFragment extends BaseFragment implements Gqe, HAL
{
    public DataChannel LIZ;
    public Room LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public HashMap LJ;
    
    static {
        Covode.recordClassIndex(5003);
    }
    
    public final DataChannel H_() {
        final DataChannel liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public final Room I_() {
        final Room liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        return liziz;
    }
    
    public final long J_() {
        final GIK liziz = Fk2.LIZ().LIZIZ();
        if (liziz != null) {
            return liziz.LIZJ();
        }
        return 0L;
    }
    
    public final long K_() {
        final Room liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        return liziz.getId();
    }
    
    public View LIZ(final int n) {
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJ.get(n)) == null) {
            final View view = this.getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJ.put(n, viewById);
        }
        return viewById;
    }
    
    public View LIZ(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        CTM.LIZ((Object)layoutInflater);
        return null;
    }
    
    public void LIZ(final int n, final int n2, final Intent intent) {
    }
    
    public void LIZ(final Bundle bundle) {
    }
    
    public void LIZ(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
    }
    
    public void LIZIZ(final Bundle bundle) {
    }
    
    public DataChannel LJ() {
        final DataChannel liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public void LJI() {
    }
    
    public void LJII() {
    }
    
    public void LJIIIIZZ() {
    }
    
    public void LJIIIZ() {
    }
    
    public Fragment LJIIJ() {
        return this;
    }
    
    public void LJIIJJI() {
    }
    
    public boolean LJIIL() {
        final 1nL activity = this.getActivity();
        if (activity != null) {
            final 0AB supportFragmentManager = activity.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                final List<Fragment> ljff = supportFragmentManager.LJFF();
                if (ljff != null) {
                    final Iterator<Object> iterator = ljff.iterator();
                    while (iterator.hasNext()) {
                        Object o;
                        if (!((o = iterator.next()) instanceof E4k)) {
                            o = null;
                        }
                        final E4k e4k = (E4k)o;
                        if (e4k != null && e4k.D_()) {
                            return true;
                        }
                    }
                }
            }
        }
        final 0AB childFragmentManager = this.getChildFragmentManager();
        n.LIZIZ((Object)childFragmentManager, "");
        final List<Fragment> ljff2 = childFragmentManager.LJFF();
        n.LIZIZ((Object)ljff2, "");
        final Iterator<Object> iterator2 = ljff2.iterator();
        while (iterator2.hasNext()) {
            Object o2;
            if (!((o2 = iterator2.next()) instanceof E4k)) {
                o2 = null;
            }
            final E4k e4k2 = (E4k)o2;
            if (e4k2 != null && e4k2.D_()) {
                return true;
            }
        }
        return false;
    }
    
    public void LJIILIIL() {
    }
    
    public void LJIILJJIL() {
    }
    
    public void LJIILL() {
        final HashMap lj = this.LJ;
        if (lj != null) {
            lj.clear();
        }
    }
    
    public void L_() {
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        2TN.LIZ((Activity)this.getActivity());
        super.onActivityCreated(bundle);
        if (this.LIZLLL) {
            return;
        }
        final 1nL activity = this.getActivity();
        if (activity != null) {
            final Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(51);
            }
        }
        final Room liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        if (!Room.isValid(liziz)) {
            final 1nL activity2 = this.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            this.LIZLLL = true;
            return;
        }
        this.LIZIZ(bundle);
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (this.LIZLLL) {
            return;
        }
        this.LIZ(n, n2, intent);
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        2TN.LIZ((Activity)this.getActivity());
        FiE.LJIIJ = true;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        final G8t lizlll = DataChannel.LIZLLL;
        final 0Bu liz = 0Bv.LIZ(this, null);
        if (CnW.LIZ) {
            0Bp.LIZ(liz, this);
        }
        n.LIZIZ((Object)liz, "");
        final DataChannel liz2 = lizlll.LIZ(liz, (0CH)this);
        liz2.LIZ((Class)G73.class, (Object)this.getChildFragmentManager());
        this.LIZ = liz2;
        final DataChannelGlobal lizj = DataChannelGlobal.LIZJ;
        final DataChannel liz3 = this.LIZ;
        if (liz3 == null) {
            n.LIZ("");
        }
        lizj.LIZ((Class)2BB.class, (Object)liz3);
        DataChannelGlobal.LIZJ.LIZ((Class)2BA.class, (Object)this.getContext());
        super.onCreate(bundle);
        if (!this.LIZJ) {
            final Room liziz = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (!Room.isValid(liziz) || liziz == null || liziz.getStreamUrl() == null) {
                this.LIZLLL = true;
                final 1nL activity = this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return;
            }
            this.LIZIZ = liziz;
        }
        else {
            final Room liziz2 = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQF.class);
            if (!Room.isValid(liziz2) || liziz2 == null || liziz2.getStreamUrl() == null) {
                this.LIZLLL = true;
                final 1nL activity2 = this.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                return;
            }
            this.LIZIZ = liziz2;
        }
        final HashMap hashMap = new HashMap();
        final Room liziz3 = this.LIZIZ;
        if (liziz3 == null) {
            n.LIZ("");
        }
        hashMap.put("anchor_id", String.valueOf(liziz3.getOwnerUserId()));
        final Room liziz4 = this.LIZIZ;
        if (liziz4 == null) {
            n.LIZ("");
        }
        hashMap.put("room_id", String.valueOf(liziz4.getId()));
        DataChannelGlobal.LIZJ.LIZ((Class)HPf.class, (Object)hashMap);
        final FfN ffN = new FfN();
        final Room liziz5 = this.LIZIZ;
        if (liziz5 == null) {
            n.LIZ("");
        }
        ffN.LIZIZ = liziz5;
        ffN.LIZ = "live_take_detail";
        final Room liziz6 = this.LIZIZ;
        if (liziz6 == null) {
            n.LIZ("");
        }
        ffN.LIZLLL = new 5Hp(liziz6.getCreateTime());
        final Fgy liz4 = ffN.LIZ();
        DataChannelGlobal.LIZJ.LIZ((Class)HQP.class, (Object)liz4);
        final DataChannel liz5 = this.LIZ;
        if (liz5 == null) {
            n.LIZ("");
        }
        liz5.LIZ((Class)G7H.class, (Object)liz4);
        this.LIZ(bundle);
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        if (this.LIZLLL) {
            return null;
        }
        return this.LIZ(layoutInflater, viewGroup);
    }
    
    @Override
    public final void onDestroy() {
        DataChannelGlobal.LIZJ.LIZJ((Class)HPf.class);
        DataChannelGlobal.LIZJ.LIZJ((Class)2BA.class);
        DataChannelGlobal.LIZJ.LIZJ((Class)HQT.class);
        DataChannelGlobal.LIZJ.LIZJ((Class)HQ6.class);
        DataChannelGlobal.LIZJ.LIZJ((Class)2BB.class);
        DataChannelGlobal.LIZJ.LIZJ((Class)2BI.class);
        DataChannelGlobal.LIZJ.LIZIZ((Object)this);
        final DataChannel liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        liz.LIZIZ((Object)this);
        super.onDestroy();
        if (this.LIZLLL) {
            return;
        }
        this.LJIILJJIL();
        LivePerformanceManager.LJJIFFI.LIZ().LIZIZ = false;
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (this.LIZLLL) {
            this.LJIILL();
            return;
        }
        this.LJIILIIL();
        this.LJIILL();
    }
    
    @Override
    public final void onPause() {
        super.onPause();
        if (this.LIZLLL) {
            return;
        }
        this.LJII();
    }
    
    @Override
    public final void onResume() {
        super.onResume();
        this.L_();
        if (this.LIZLLL) {
            return;
        }
        this.LJI();
    }
    
    public final void onStart() {
        super.onStart();
        if (this.LIZLLL) {
            return;
        }
        this.LJIIIIZZ();
    }
    
    public final void onStop() {
        super.onStop();
        if (this.LIZLLL) {
            return;
        }
        this.LJIIIZ();
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        if (this.LIZLLL) {
            return;
        }
        this.LIZ(view, bundle);
    }
}
