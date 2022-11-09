// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multicohost.ui.fragment;

import X.44T;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import X.0qW;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import X.2d6;
import X.1TO;
import X.F8U;
import X.F8V;
import X.FAr;
import X.FGw;
import X.FBF;
import java.util.concurrent.TimeUnit;
import X.Gkn;
import X.0II;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Map;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.CTM;
import X.0cB;
import X.0l6;
import X.FlV;
import X.0xm;
import X.44V;
import kotlin.jvm.internal.n;
import X.GST;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.view.View;
import X.040;
import android.view.View$OnClickListener;
import com.bytedance.android.live.liveinteract.multicohost.business.contract.MultiCoHostSettingContract;

public final class MultiCoHostSettingsFragment extends AbsView implements View$OnClickListener
{
    public boolean LIZ;
    public 040 LJ;
    public 040 LJFF;
    public 040 LJI;
    public 040 LJII;
    public 040 LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public View LJIIL;
    public View LJIILIIL;
    public View LJIILJJIL;
    public Boolean LJIILL;
    public Boolean LJIILLIIL;
    public Boolean LJIIZILJ;
    public Boolean LJIJ;
    public Boolean LJIJI;
    public HashMap LJIJJ;
    
    static {
        Covode.recordClassIndex(8410);
    }
    
    public MultiCoHostSettingsFragment() {
        final 44V ljlil = GST.LJLIL;
        n.LIZIZ((Object)ljlil, "");
        this.LJIILL = (Boolean)((44T)ljlil).LIZ();
        final 44V ljliil = GST.LJLIIL;
        n.LIZIZ((Object)ljliil, "");
        this.LJIILLIIL = (Boolean)((44T)ljliil).LIZ();
        final 44V ljlji = GST.LJLJI;
        n.LIZIZ((Object)ljlji, "");
        this.LJIIZILJ = (Boolean)((44T)ljlji).LIZ();
        final 44V ljlillllzi = GST.LJLILLLLZI;
        n.LIZIZ((Object)ljlillllzi, "");
        this.LJIJ = (Boolean)((44T)ljlillllzi).LIZ();
        final 44V ljljjll = GST.LJLJJLL;
        n.LIZIZ((Object)ljljjll, "");
        this.LJIJI = (Boolean)((44T)ljljjll).LIZ();
    }
    
    @Override
    public final void LIZ() {
        final HashMap ljijj = this.LJIJJ;
        if (ljijj != null) {
            ljijj.clear();
        }
    }
    
    @Override
    public final void LIZ(final boolean b, final boolean b2, final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final View ljiiiz = this.LJIIIZ;
        if (ljiiiz == null) {
            n.LIZ("");
        }
        ljiiiz.setClickable(true);
        if (b2) {
            final 040 lj = this.LJ;
            if (lj == null) {
                n.LIZ("");
            }
            lj.setChecked(b ^ true);
            this.LJIILL = (b ^ true);
            0xm.LIZIZ.LIZIZ(b ^ true, "settings", "application");
            return;
        }
        FlV.LIZ(this.getContext(), t);
    }
    
    @Override
    public final void LIZIZ(final boolean b, final boolean b2, final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final View ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.setClickable(true);
        if (b2) {
            final 040 ljff = this.LJFF;
            if (ljff == null) {
                n.LIZ("");
            }
            ljff.setChecked(b ^ true);
            this.LJIILLIIL = (b ^ true);
            0xm.LIZIZ.LIZIZ(b ^ true, "settings", "invitation");
            return;
        }
        FlV.LIZ(this.getContext(), t);
    }
    
    @Override
    public final void LIZJ(final boolean b, final boolean b2, final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final View ljiijji = this.LJIIJJI;
        if (ljiijji == null) {
            n.LIZ("");
        }
        ljiijji.setClickable(true);
        if (b2) {
            final 040 lji = this.LJI;
            if (lji == null) {
                n.LIZ("");
            }
            lji.setChecked(b ^ true);
            this.LJIIZILJ = (b ^ true);
            0xm.LIZIZ.LIZ(b ^ true, "settings", "application");
            return;
        }
        FlV.LIZ(this.getContext(), t);
    }
    
    @Override
    public final void LIZLLL(final boolean b, final boolean b2, final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final View ljiil = this.LJIIL;
        if (ljiil == null) {
            n.LIZ("");
        }
        ljiil.setClickable(true);
        if (b2) {
            final 040 ljii = this.LJII;
            if (ljii == null) {
                n.LIZ("");
            }
            ljii.setChecked(b ^ true);
            this.LJIJ = (b ^ true);
            0xm.LIZIZ.LIZ(b ^ true, "settings", "invitation");
            return;
        }
        FlV.LIZ(this.getContext(), t);
    }
    
    public final 0l6.a LJ() {
        final 0l6.a a = new 0l6.a();
        final String string = this.getString(2131831800);
        n.LIZIZ((Object)string, "");
        a.LIZ(string);
        a.LIZIZ = (int)(0cB.LJ(0cB.LIZIZ()) * 0.7);
        a.LIZJ = true;
        return a;
    }
    
    @Override
    public final void LJ(final boolean b, final boolean b2, final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final View ljiiliil = this.LJIILIIL;
        if (ljiiliil == null) {
            n.LIZ("");
        }
        ljiiliil.setClickable(true);
        if (b2) {
            final 040 ljiiiizz = this.LJIIIIZZ;
            if (ljiiiizz == null) {
                n.LIZ("");
            }
            ljiiiizz.setChecked(b ^ true);
            this.LJIJI = (b ^ true);
            return;
        }
        FlV.LIZ(this.getContext(), t);
    }
    
    public final void onClick(View view) {
        CTM.LIZ((Object)view);
        final int id = view.getId();
        if (id == 2131372007) {
            view = this.LJIIIZ;
            if (view == null) {
                n.LIZ("");
            }
            view.setClickable(false);
            final MultiCoHostSettingContract.a a = (MultiCoHostSettingContract.a)super.LIZJ;
            if (a != null) {
                a.LIZ(this.LJIILL ^ true);
            }
            return;
        }
        if (id == 2131372011) {
            view = this.LJIIJ;
            if (view == null) {
                n.LIZ("");
            }
            view.setClickable(false);
            final MultiCoHostSettingContract.a a2 = (MultiCoHostSettingContract.a)super.LIZJ;
            if (a2 != null) {
                a2.LIZIZ(this.LJIILLIIL ^ true);
            }
            return;
        }
        if (id == 2131372009) {
            view = this.LJIIJJI;
            if (view == null) {
                n.LIZ("");
            }
            view.setClickable(false);
            final MultiCoHostSettingContract.a a3 = (MultiCoHostSettingContract.a)super.LIZJ;
            if (a3 != null) {
                a3.LIZJ(this.LJIIZILJ ^ true);
            }
            return;
        }
        if (id == 2131372013) {
            view = this.LJIIL;
            if (view == null) {
                n.LIZ("");
            }
            view.setClickable(false);
            final MultiCoHostSettingContract.a a4 = (MultiCoHostSettingContract.a)super.LIZJ;
            if (a4 != null) {
                a4.LIZLLL(this.LJIJ ^ true);
            }
            return;
        }
        if (id == 2131372016) {
            view = this.LJIILIIL;
            if (view == null) {
                n.LIZ("");
            }
            view.setClickable(false);
            final MultiCoHostSettingContract.a a5 = (MultiCoHostSettingContract.a)super.LIZJ;
            if (a5 != null) {
                a5.LJ(this.LJIJI ^ true);
            }
            final Boolean ljiji = this.LJIJI;
            n.LIZIZ((Object)ljiji, "");
            final int booleanValue = ((boolean)ljiji) ? 1 : 0;
            final HashMap hashMap = new HashMap();
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                final String idStr = room.getIdStr();
                idStr.toString();
                hashMap.put("room_id", idStr);
            }
            hashMap.put("is_open", String.valueOf(booleanValue));
            0xm.LIZ("livesdk_anchor_live_notification_open", hashMap);
        }
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        final View liz = 0II.LIZ(layoutInflater, 2131562011, viewGroup, false);
        final View viewById = liz.findViewById(2131372006);
        n.LIZIZ((Object)viewById, "");
        this.LJ = (040)viewById;
        final View viewById2 = liz.findViewById(2131372008);
        n.LIZIZ((Object)viewById2, "");
        this.LJI = (040)viewById2;
        final View viewById3 = liz.findViewById(2131372010);
        n.LIZIZ((Object)viewById3, "");
        this.LJFF = (040)viewById3;
        final View viewById4 = liz.findViewById(2131372012);
        n.LIZIZ((Object)viewById4, "");
        this.LJII = (040)viewById4;
        final View viewById5 = liz.findViewById(2131372015);
        n.LIZIZ((Object)viewById5, "");
        this.LJIIIIZZ = (040)viewById5;
        final View viewById6 = liz.findViewById(2131372007);
        n.LIZIZ((Object)viewById6, "");
        this.LJIIIZ = viewById6;
        final View viewById7 = liz.findViewById(2131372009);
        n.LIZIZ((Object)viewById7, "");
        this.LJIIJJI = viewById7;
        final View viewById8 = liz.findViewById(2131372011);
        n.LIZIZ((Object)viewById8, "");
        this.LJIIJ = viewById8;
        final View viewById9 = liz.findViewById(2131372013);
        n.LIZIZ((Object)viewById9, "");
        this.LJIIL = viewById9;
        final View viewById10 = liz.findViewById(2131372016);
        n.LIZIZ((Object)viewById10, "");
        this.LJIILIIL = viewById10;
        final View viewById11 = liz.findViewById(2131365286);
        n.LIZIZ((Object)viewById11, "");
        this.LJIILJJIL = viewById11;
        final 040 lj = this.LJ;
        if (lj == null) {
            n.LIZ("");
        }
        final Boolean ljiill = this.LJIILL;
        n.LIZIZ((Object)ljiill, "");
        lj.setChecked(ljiill);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        final Boolean ljiizilj = this.LJIIZILJ;
        n.LIZIZ((Object)ljiizilj, "");
        lji.setChecked(ljiizilj);
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        final Boolean ljiilliil = this.LJIILLIIL;
        n.LIZIZ((Object)ljiilliil, "");
        ljff.setChecked(ljiilliil);
        final 040 ljii = this.LJII;
        if (ljii == null) {
            n.LIZ("");
        }
        final Boolean ljij = this.LJIJ;
        n.LIZIZ((Object)ljij, "");
        ljii.setChecked(ljij);
        final 040 ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz == null) {
            n.LIZ("");
        }
        final Boolean ljiji = this.LJIJI;
        n.LIZIZ((Object)ljiji, "");
        ljiiiizz.setChecked(ljiji);
        final Boolean ljiilliil2 = this.LJIILLIIL;
        n.LIZIZ((Object)ljiilliil2, "");
        final boolean booleanValue = ljiilliil2;
        final Boolean ljij2 = this.LJIJ;
        n.LIZIZ((Object)ljij2, "");
        final boolean booleanValue2 = ljij2;
        final Boolean ljiill2 = this.LJIILL;
        n.LIZIZ((Object)ljiill2, "");
        final boolean booleanValue3 = ljiill2;
        final Boolean ljiizilj2 = this.LJIIZILJ;
        n.LIZIZ((Object)ljiizilj2, "");
        final boolean booleanValue4 = ljiizilj2;
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final Gkn liz2 = Gkn.LJFF.LIZ("anchor_connection_setting_show");
            liz2.LIZ("anchor_id", room.getOwnerUserId());
            liz2.LIZ("room_id", room.getIdStr());
            final String s = "open";
            String s2;
            if (booleanValue) {
                s2 = "open";
            }
            else {
                s2 = "close";
            }
            liz2.LIZ("mutual_invitation_receive_status", s2);
            String s3;
            if (booleanValue2) {
                s3 = "open";
            }
            else {
                s3 = "close";
            }
            liz2.LIZ("recommend_invitation_receive_status", s3);
            String s4;
            if (booleanValue3) {
                s4 = "open";
            }
            else {
                s4 = "close";
            }
            liz2.LIZ("mutual_application_receive_status", s4);
            String s5;
            if (booleanValue4) {
                s5 = s;
            }
            else {
                s5 = "close";
            }
            liz2.LIZ("recommend_application_receive_status", s5);
            liz2.LIZLLL();
        }
        final View ljiiiz = this.LJIIIZ;
        if (ljiiiz == null) {
            n.LIZ("");
        }
        ljiiiz.setOnClickListener((View$OnClickListener)this);
        final View ljiijji = this.LJIIJJI;
        if (ljiijji == null) {
            n.LIZ("");
        }
        ljiijji.setOnClickListener((View$OnClickListener)this);
        final View ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.setOnClickListener((View$OnClickListener)this);
        final View ljiil = this.LJIIL;
        if (ljiil == null) {
            n.LIZ("");
        }
        ljiil.setOnClickListener((View$OnClickListener)this);
        final View ljiiliil = this.LJIILIIL;
        if (ljiiliil == null) {
            n.LIZ("");
        }
        ljiiliil.setOnClickListener((View$OnClickListener)this);
        if (this.LIZ) {
            final View ljiiljjil = this.LJIILJJIL;
            if (ljiiljjil == null) {
                n.LIZ("");
            }
            FBF.LIZIZ(1700L, TimeUnit.MILLISECONDS).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZLLL((2d6)new 1TO(ljiiljjil));
            final ValueAnimator ofObject = ValueAnimator.ofObject((TypeEvaluator)new ArgbEvaluator(), new Object[] { 0cB.LIZIZ(2131100923), 0cB.LIZIZ(2131100904) });
            ofObject.setDuration(200L);
            ofObject.setRepeatCount(0);
            ofObject.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0qW(ljiiljjil));
            ofObject.start();
            this.LIZ = false;
        }
        return liz;
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final InteractDialogFragmentBaseContract.a lizj = super.LIZJ;
        if (lizj != null) {
            lizj.LJII();
        }
        super.LIZJ = null;
    }
}
