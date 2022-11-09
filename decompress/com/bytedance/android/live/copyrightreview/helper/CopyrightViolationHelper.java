// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.copyrightreview.helper;

import X.0CC;
import X.0Bg;
import android.os.Message;
import X.GWb;
import android.text.Spannable;
import java.util.Map;
import X.Gkn;
import java.util.HashMap;
import X.H31;
import X.HDj;
import X.0bH;
import X.0bG;
import X.0bJ;
import android.content.DialogInterface$OnClickListener;
import X.0bI;
import X.Ht9;
import android.text.TextUtils;
import X.HYW;
import X.FH6;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import android.content.Context;
import X.Hf4;
import X.0cB;
import X.2d6;
import X.1HD;
import X.1HC;
import X.F8U;
import X.F8V;
import X.FAr;
import X.FGw;
import X.0yr;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import X.Fk2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.view.View;
import X.0RT;
import X.KN6;
import android.os.Handler$Callback;
import X.0bF;
import X.0CG;
import X.0bE;
import X.0CH;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import X.2fc;
import android.app.Dialog;
import X.6mZ;

public class CopyrightViolationHelper implements 6mZ
{
    public Dialog LIZ;
    public 2fc LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final Handler LJ;
    public Dialog LJFF;
    public Runnable LJI;
    public final Runnable LJII;
    
    static {
        Covode.recordClassIndex(5622);
    }
    
    public CopyrightViolationHelper(final 0CH 0ch, final Runnable lji) {
        this.LJII = new 0bE(this);
        0ch.getLifecycle().LIZ((0CG)this);
        this.LJI = lji;
        this.LJ = new Handler((Handler$Callback)new 0bF(this));
    }
    
    public static void LIZ(final Dialog dialog) {
        LIZIZ(dialog);
        KN6.LIZ.LIZ(dialog);
    }
    
    public static void LIZIZ(final Dialog dialog) {
        dialog.show();
        final View decorView = dialog.getWindow().getDecorView();
        if (decorView != null) {
            final Boolean b = (Boolean)decorView.getTag(2131374348);
            if (b != null && b) {
                0RT.LIZ(dialog);
                decorView.setTag(2131374349, (Object)decorView.hashCode());
            }
        }
    }
    
    private String LIZJ(final Room room) {
        if (this.LIZLLL(room)) {
            return "anchor";
        }
        return "user";
    }
    
    private boolean LIZLLL(final Room room) {
        return room.getOwnerUserId() == Fk2.LIZ().LIZIZ().LIZJ();
    }
    
    public final 2fc LIZ(final Room room, final int n, final int n2) {
        return 0yr.LIZ().LIZ(ReviewApi.class).confirmCopyright(room.getId(), n, n2).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1HC(this), (2d6)new 1HD(this));
    }
    
    public final void LIZ(final int n) {
        if (!this.LJ.hasMessages(n)) {
            this.LJ.sendEmptyMessageDelayed(n, 2000L);
        }
        Hf4.LIZ(0cB.LJ(), 2131830504);
    }
    
    public final void LIZ(final Context context, final RemindMessage remindMessage, final Room room, final FH6 fh6) {
        int n;
        if (remindMessage.LIZIZ == 7) {
            n = 1;
        }
        else {
            final int n2 = 0;
            final Dialog ljff = this.LJFF;
            n = n2;
            if (ljff != null) {
                if (ljff.isShowing()) {
                    return;
                }
                n = n2;
            }
        }
        if (!this.LIZJ && !this.LJ.hasMessages(1)) {
            if (n != 0) {
                final Dialog liz = this.LIZ;
                if (liz != null && liz.isShowing()) {
                    return;
                }
            }
            if (!this.LIZLLL) {
                if (!this.LJ.hasMessages(2)) {
                    Object o;
                    if (TextUtils.isEmpty((CharSequence)(o = HYW.LIZ(remindMessage.LJIIIZ, "")))) {
                        o = remindMessage.LIZ;
                    }
                    if (TextUtils.isEmpty((CharSequence)o)) {
                        return;
                    }
                    Spannable spannable;
                    if (TextUtils.isEmpty((CharSequence)(spannable = HYW.LIZ(remindMessage.LJIIIIZZ, "")))) {
                        spannable = HYW.LIZ(remindMessage.LIZLLL, "");
                    }
                    CharSequence liz2 = (CharSequence)spannable;
                    if (TextUtils.isEmpty((CharSequence)spannable)) {
                        liz2 = 0cB.LIZ(2131835800);
                    }
                    if (n != 0) {
                        final int liziz = this.LIZIZ(room);
                        final Ht9 ht9 = new Ht9(context);
                        ht9.LJIIIZ = false;
                        ht9.LIZ(2131836182, (DialogInterface$OnClickListener)new 0bI(this, fh6, room, liziz), false);
                        ht9.LIZIZ(2131829618, (DialogInterface$OnClickListener)new 0bJ(this, room, fh6, liziz), false);
                        ht9.LIZ = liz2;
                        ht9.LIZJ = (CharSequence)o;
                        this.LIZ = (Dialog)ht9.LIZ();
                        final Dialog ljff2 = this.LJFF;
                        if (ljff2 != null && ljff2.isShowing()) {
                            this.LJ.postDelayed(this.LJII, 2000L);
                        }
                        else {
                            this.LJ.post(this.LJII);
                        }
                    }
                    else {
                        final Ht9 ht10 = new Ht9(context);
                        ht10.LJIIIZ = false;
                        ht10.LIZ(2131836182, (DialogInterface$OnClickListener)new 0bG(this, fh6, room), false);
                        ht10.LIZIZ(2131835672, (DialogInterface$OnClickListener)new 0bH(this, room), false);
                        ht10.LIZ = liz2;
                        ht10.LIZJ = (CharSequence)o;
                        LIZ(this.LJFF = (Dialog)ht10.LIZ());
                    }
                    final HDj liz3 = HDj.LIZ;
                    this.LIZLLL(room);
                    liz3.LIZ((H31)remindMessage);
                    final HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(room.author().getId()));
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    if (n != 0) {
                        hashMap.put("object_oriented", this.LIZJ(room));
                        final Gkn liz4 = Gkn.LJFF.LIZ("livesdk_copyright_notification_popup_show");
                        liz4.LIZ((Map)hashMap);
                        liz4.LIZLLL();
                        return;
                    }
                    final Gkn liz5 = Gkn.LJFF.LIZ("livesdk_copyright_warning_popup_show");
                    liz5.LIZ((Map)hashMap);
                    liz5.LIZLLL();
                }
            }
        }
    }
    
    public final void LIZ(final Room room) {
        if (this.LIZLLL(room)) {
            GWb.LIZ.LIZ((Handler)null, 0);
            return;
        }
        final Runnable lji = this.LJI;
        if (lji != null) {
            lji.run();
        }
    }
    
    public final void LIZ(final Room room, final String s, final boolean b) {
        final HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(room.author().getId()));
        hashMap.put("room_id", String.valueOf(room.getId()));
        if (b) {
            hashMap.put("button_click_type", s);
            hashMap.put("object_oriented", this.LIZJ(room));
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_copyright_notification_popup_click");
            liz.LIZ((Map)hashMap);
            liz.LIZLLL();
            return;
        }
        hashMap.put("button_type", s);
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_copyright_warning_popup_click");
        liz2.LIZ((Map)hashMap);
        liz2.LIZLLL();
    }
    
    public final int LIZIZ(final Room room) {
        if (this.LIZLLL(room)) {
            return 1;
        }
        return 2;
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    public void onDestroy() {
        final Dialog ljff = this.LJFF;
        if (ljff != null && ljff.isShowing()) {
            this.LJFF.dismiss();
        }
        final Dialog liz = this.LIZ;
        if (liz != null && liz.isShowing()) {
            this.LIZ.dismiss();
        }
        this.LJ.removeMessages(1);
        this.LJ.removeMessages(2);
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_DESTROY) {
            this.onDestroy();
        }
    }
}
