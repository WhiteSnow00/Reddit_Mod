// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.dialog;

import X.KN6;
import X.0CC;
import X.0CH;
import X.0s2;
import X.0s1;
import android.view.View$OnClickListener;
import X.0s0;
import X.0cB;
import kotlin.jvm.internal.n;
import X.1ib;
import android.os.Bundle;
import android.app.Dialog;
import X.Fhq;
import com.bytedance.covode.number.Covode;
import android.widget.ImageView;
import X.2P9;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import X.SRS;
import X.1so;
import X.6mZ;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;

public abstract class MultiGuestV3BottomConfirmDialog extends LiveBaseSheetDialog implements 6mZ
{
    public static int LJIIZILJ;
    public static int LJIJ;
    public static int LJIJI;
    public static int LJIJJ;
    public static int LJIJJLI;
    public int LJFF;
    public 1so LJI;
    public SRS<? super LiveBottomSheetDialog, 2P9> LJII;
    public 1so LJIIIIZZ;
    public ImageView LJIIIZ;
    public SRS<? super LiveBottomSheetDialog, 2P9> LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public int LJIILJJIL;
    public String LJIILL;
    public int LJIILLIIL;
    
    static {
        Covode.recordClassIndex(8766);
        MultiGuestV3BottomConfirmDialog.LJIIZILJ = 2131372731;
        MultiGuestV3BottomConfirmDialog.LJIJ = 2131372729;
        MultiGuestV3BottomConfirmDialog.LJIJI = 2131372730;
        MultiGuestV3BottomConfirmDialog.LJIJJ = 2131372733;
        MultiGuestV3BottomConfirmDialog.LJIJJLI = 2131372732;
    }
    
    public void dismiss() {
        super.dismiss();
        Fhq.LIZIZ((Dialog)this);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131562243);
        final 1ib 1ib = this.findViewById(MultiGuestV3BottomConfirmDialog.LJIJJ);
        if (1ib != null) {
            if (this.LJIIJJI != 0) {
                n.LIZIZ((Object)1ib, "");
                1ib.setText((CharSequence)0cB.LIZ(this.LJIIJJI));
            }
            if (this.LJIIL.length() > 0) {
                n.LIZIZ((Object)1ib, "");
                1ib.setText((CharSequence)this.LJIIL);
            }
        }
        final 1ib 1ib2 = this.findViewById(MultiGuestV3BottomConfirmDialog.LJIJJLI);
        if (1ib2 != null) {
            if (this.LJFF != 0) {
                n.LIZIZ((Object)1ib2, "");
                1ib2.setText((CharSequence)0cB.LIZ(this.LJFF));
            }
            if (this.LJIILIIL.length() > 0) {
                n.LIZIZ((Object)1ib2, "");
                1ib2.setText((CharSequence)this.LJIILIIL);
            }
        }
        1so lji = this.findViewById(MultiGuestV3BottomConfirmDialog.LJIIZILJ);
        final ImageView imageView = null;
        if (lji != null) {
            if (this.LJIILJJIL != 0) {
                n.LIZIZ((Object)lji, "");
                lji.setText(0cB.LIZ(this.LJIILJJIL));
            }
            if (this.LJIILL.length() > 0) {
                n.LIZIZ((Object)lji, "");
                lji.setText(this.LJIILL);
            }
            lji.setOnClickListener((View$OnClickListener)new 0s0(this));
        }
        else {
            lji = null;
        }
        this.LJI = lji;
        1so ljiiiizz = this.findViewById(MultiGuestV3BottomConfirmDialog.LJIJ);
        if (ljiiiizz != null) {
            if (this.LJIILLIIL != 0) {
                n.LIZIZ((Object)ljiiiizz, "");
                ljiiiizz.setText(0cB.LIZ(this.LJIILLIIL));
            }
            ljiiiizz.setOnClickListener((View$OnClickListener)new 0s1(this));
        }
        else {
            ljiiiizz = null;
        }
        this.LJIIIIZZ = ljiiiizz;
        final ImageView imageView2 = this.findViewById(MultiGuestV3BottomConfirmDialog.LJIJI);
        ImageView ljiiiz = imageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener((View$OnClickListener)new 0s2(this));
            ljiiiz = imageView2;
        }
        this.LJIIIZ = ljiiiz;
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    @Override
    public void setTitle(final int ljiijji) {
        this.LJIIJJI = ljiijji;
    }
    
    public void show() {
        super.show();
        KN6.LIZ.LIZ((Dialog)this);
        Fhq.LIZ((Dialog)this);
    }
}
