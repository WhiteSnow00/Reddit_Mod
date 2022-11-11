// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.ui.fragment;

import X.44T;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import X.0mK;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import X.2d6;
import X.1Pc;
import X.F8U;
import X.F8V;
import X.FAr;
import X.FGw;
import X.FBF;
import java.util.concurrent.TimeUnit;
import X.2GS;
import X.0II;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Map;
import X.0xy;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.CTM;
import X.0cB;
import X.0l6;
import X.FlV;
import X.44V;
import X.GST;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.view.View;
import X.040;
import android.view.View$OnClickListener;
import com.bytedance.android.live.liveinteract.cohost.business.contract.CoHostSettingContract;

public final class CoHostSettingsFragment extends AbsView implements View$OnClickListener
{
    public 040 LIZ;
    public View LJ;
    public 040 LJFF;
    public 040 LJI;
    public View LJII;
    public HashMap LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(7540);
    }
    
    @Override
    public final void LIZ() {
        if (!super.mStatusViewValid) {
            return;
        }
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        ljff.setClickable(true);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(true);
        final 44V ljli = GST.LJLI;
        n.LIZIZ((Object)ljli, "");
        final 040 ljff2 = this.LJFF;
        if (ljff2 == null) {
            n.LIZ("");
        }
        ((44T)ljli).LIZ((Object)ljff2.isChecked());
        final 44V ljliiil = GST.LJLIIIL;
        n.LIZIZ((Object)ljliiil, "");
        ((44T)ljliiil).LIZ((Object)false);
    }
    
    @Override
    public final void LIZ(final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        ljff.setClickable(true);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(true);
        FlV.LIZ(this.getContext(), t);
    }
    
    @Override
    public final void LIZIZ() {
        if (!super.mStatusViewValid) {
            return;
        }
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        ljff.setClickable(true);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(true);
        final 44V ljliiil = GST.LJLIIIL;
        n.LIZIZ((Object)ljliiil, "");
        final 040 lji2 = this.LJI;
        if (lji2 == null) {
            n.LIZ("");
        }
        ((44T)ljliiil).LIZ((Object)lji2.isChecked());
    }
    
    @Override
    public final void LIZIZ(final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        ljff.setClickable(true);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(true);
        FlV.LIZ(this.getContext(), t);
    }
    
    @Override
    public final void LIZJ() {
        if (!super.mStatusViewValid) {
            return;
        }
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        ljff.setClickable(true);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(true);
        final 040 liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        liz.setClickable(true);
        final 44V ljl = GST.LJL;
        n.LIZIZ((Object)ljl, "");
        final 040 liz2 = this.LIZ;
        if (liz2 == null) {
            n.LIZ("");
        }
        ((44T)ljl).LIZ((Object)liz2.isChecked());
    }
    
    @Override
    public final void LIZJ(final Throwable t) {
        if (!super.mStatusViewValid) {
            return;
        }
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        ljff.setClickable(true);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(true);
        final 040 liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        liz.setClickable(true);
        FlV.LIZ(this.getContext(), t);
    }
    
    @Override
    public final void LIZLLL() {
        final HashMap ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.clear();
        }
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
    
    public final void onClick(View ljii) {
        CTM.LIZ((Object)ljii);
        if (!(ljii instanceof 040)) {
            return;
        }
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        int visibility = 0;
        ljff.setClickable(false);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(false);
        final int id = ljii.getId();
        if (id == 2131372017) {
            final 040 ljff2 = this.LJFF;
            if (ljff2 == null) {
                n.LIZ("");
            }
            final boolean checked = ljff2.isChecked();
            final 040 lji2 = this.LJI;
            if (lji2 == null) {
                n.LIZ("");
            }
            lji2.setChecked(false);
            ljii = this.LJII;
            if (ljii == null) {
                n.LIZ("");
            }
            if (!checked) {
                visibility = 8;
            }
            ljii.setVisibility(visibility);
            final CoHostSettingContract.a a = (CoHostSettingContract.a)super.LIZJ;
            if (a != null) {
                a.LIZ(checked);
            }
            final 040 ljff3 = this.LJFF;
            if (ljff3 == null) {
                n.LIZ("");
            }
            final int checked2 = ljff3.isChecked() ? 1 : 0;
            final HashMap hashMap = new HashMap();
            hashMap.put("is_open", String.valueOf(checked2));
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null) {
                hashMap.put("room_id", room.getIdStr());
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            0xy.LIZ("anchor_connection_open", hashMap);
            return;
        }
        if (id == 2131372014) {
            final 040 lji3 = this.LJI;
            if (lji3 == null) {
                n.LIZ("");
            }
            final boolean checked3 = lji3.isChecked();
            final CoHostSettingContract.a a2 = (CoHostSettingContract.a)super.LIZJ;
            if (a2 != null) {
                a2.LIZIZ(checked3);
            }
            0xy.LIZ(checked3, "settings");
            return;
        }
        if (id == 2131372015) {
            final 040 liz = this.LIZ;
            if (liz == null) {
                n.LIZ("");
            }
            final int checked4 = liz.isChecked() ? 1 : 0;
            final CoHostSettingContract.a a3 = (CoHostSettingContract.a)super.LIZJ;
            if (a3 != null) {
                a3.LIZJ((boolean)(checked4 != 0));
            }
            final HashMap hashMap2 = new HashMap();
            final Room room2 = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room2 != null) {
                hashMap2.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap2.put("room_id", String.valueOf(room2.getIdStr()));
            }
            hashMap2.put("is_open", String.valueOf(checked4));
            0xy.LIZ("livesdk_anchor_live_notification_open", hashMap2);
        }
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        final View liz = 0II.LIZ(layoutInflater, 2131561992, viewGroup, false);
        final View viewById = liz.findViewById(2131372015);
        n.LIZIZ((Object)viewById, "");
        this.LIZ = (040)viewById;
        final View viewById2 = liz.findViewById(2131365286);
        n.LIZIZ((Object)viewById2, "");
        this.LJ = viewById2;
        final View viewById3 = liz.findViewById(2131372017);
        n.LIZIZ((Object)viewById3, "");
        this.LJFF = (040)viewById3;
        final View viewById4 = liz.findViewById(2131372014);
        n.LIZIZ((Object)viewById4, "");
        this.LJI = (040)viewById4;
        final View viewById5 = liz.findViewById(2131365285);
        n.LIZIZ((Object)viewById5, "");
        this.LJII = viewById5;
        final 44V ljl = GST.LJL;
        n.LIZIZ((Object)ljl, "");
        final Boolean b = (Boolean)((44T)ljl).LIZ();
        final 44V ljli = GST.LJLI;
        n.LIZIZ((Object)ljli, "");
        final Boolean b2 = (Boolean)((44T)ljli).LIZ();
        final 44V ljliiil = GST.LJLIIIL;
        n.LIZIZ((Object)ljliiil, "");
        final Boolean b3 = (Boolean)((44T)ljliiil).LIZ();
        final 040 liz2 = this.LIZ;
        if (liz2 == null) {
            n.LIZ("");
        }
        liz2.setClickable(false);
        final 040 ljff = this.LJFF;
        if (ljff == null) {
            n.LIZ("");
        }
        ljff.setClickable(false);
        final 040 lji = this.LJI;
        if (lji == null) {
            n.LIZ("");
        }
        lji.setClickable(false);
        n.LIZIZ((Object)b, "");
        if (b) {
            final 040 liz3 = this.LIZ;
            if (liz3 == null) {
                n.LIZ("");
            }
            liz3.setChecked(true);
        }
        n.LIZIZ((Object)b2, "");
        while (true) {
            Label_0546: {
                if (!b2) {
                    break Label_0546;
                }
                n.LIZIZ((Object)b3, "");
                if (!b3) {
                    break Label_0546;
                }
                final 040 ljff2 = this.LJFF;
                if (ljff2 == null) {
                    n.LIZ("");
                }
                ljff2.setChecked(true);
                final 040 lji2 = this.LJI;
                if (lji2 == null) {
                    n.LIZ("");
                }
                lji2.setChecked(true);
                final 040 liz4 = this.LIZ;
                if (liz4 == null) {
                    n.LIZ("");
                }
                liz4.setOnClickListener((View$OnClickListener)this);
                final 040 ljff3 = this.LJFF;
                if (ljff3 == null) {
                    n.LIZ("");
                }
                ljff3.setOnClickListener((View$OnClickListener)this);
                final 040 lji3 = this.LJI;
                if (lji3 == null) {
                    n.LIZ("");
                }
                lji3.setOnClickListener((View$OnClickListener)this);
                if (n.LIZ(DataChannelGlobal.LIZJ.LIZIZ((Class)2GS.class), (Object)true)) {
                    final View lj = this.LJ;
                    if (lj == null) {
                        n.LIZ("");
                    }
                    FBF.LIZIZ(1700L, TimeUnit.MILLISECONDS).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZLLL((2d6)new 1Pc(lj));
                    final ValueAnimator ofObject = ValueAnimator.ofObject((TypeEvaluator)new ArgbEvaluator(), new Object[] { 0cB.LIZIZ(2131100923), 0cB.LIZIZ(2131100904) });
                    ofObject.setDuration(200L);
                    ofObject.setRepeatCount(0);
                    ofObject.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0mK(lj));
                    ofObject.start();
                    DataChannelGlobal.LIZJ.LIZ((Class)2GS.class, (Object)false);
                }
                return liz;
            }
            if (b2) {
                final 040 ljff4 = this.LJFF;
                if (ljff4 == null) {
                    n.LIZ("");
                }
                ljff4.setChecked(true);
                final 040 lji4 = this.LJI;
                if (lji4 == null) {
                    n.LIZ("");
                }
                lji4.setChecked(false);
                continue;
            }
            final 040 ljff5 = this.LJFF;
            if (ljff5 == null) {
                n.LIZ("");
            }
            ljff5.setChecked(false);
            final 040 lji5 = this.LJI;
            if (lji5 == null) {
                n.LIZ("");
            }
            lji5.setChecked(false);
            final View ljii = this.LJII;
            if (ljii == null) {
                n.LIZ("");
            }
            ljii.setVisibility(8);
            continue;
        }
    }
}
