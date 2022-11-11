// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.view.sheet.action;

import X.0CC;
import X.0CH;
import X.085;
import androidx.core.g.t;
import X.1Iz;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Iterator;
import X.0fU;
import android.view.View$OnClickListener;
import X.0fV;
import X.1Ih;
import X.0fS;
import X.1J4;
import X.0eI;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater$Factory;
import X.SgJ;
import X.NEN;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.LayoutInflater;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import java.util.ArrayList;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import android.widget.TextView;
import android.view.View;
import android.widget.LinearLayout;
import X.6mZ;
import com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog;

public class LiveActionSheetDialog extends LiveFixedHeightSheetDialog implements 6mZ
{
    public LinearLayout LJFF;
    public View LJI;
    public TextView LJII;
    public final List<LiveActionSheetDialog.a> LJIIIIZZ;
    public CharSequence LJIIIZ;
    public LiveActionSheetDialog.b LJIIJ;
    
    static {
        Covode.recordClassIndex(6076);
    }
    
    public LiveActionSheetDialog(final Context context, final int n) {
        super(context, n);
        this.LJIIIIZZ = new ArrayList<LiveActionSheetDialog.a>();
    }
    
    public LiveActionSheetDialog(final Context context, final LiveActionSheetDialog.c c) {
        super(context, (a<?>)c);
        this.LJIIIIZZ = new ArrayList<LiveActionSheetDialog.a>();
        this.LIZ(c);
    }
    
    private int LIZ(final int n) {
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 += this.LJIIIIZZ.get(i).LIZ() * 2;
            ++i;
        }
        return n2 + 0;
    }
    
    public static View LIZ(final LayoutInflater layoutInflater) {
        MethodCollector.i(4558);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(2131560679, (ViewGroup)null);
                MethodCollector.o(4558);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(2131560679, (ViewGroup)null);
        MethodCollector.o(4558);
        return inflate2;
    }
    
    private void LIZ(final int n, int n2, final LiveActionSheetDialog.a a) {
        final List liz = a.LIZ;
        final int n3 = 0;
        int n4 = n2;
        n2 = n3;
        while (true) {
            final int size = liz.size();
            boolean b = true;
            if (n2 >= size) {
                break;
            }
            if (n2 >= a.LIZ() - 1) {
                b = false;
            }
            this.LIZ(b, n4, liz.get(n2));
            n4 += 2;
            ++n2;
        }
        if (n < this.LJIIIIZZ.size() - 1) {
            this.LIZ(this.LIZ(n + 1) - 1, (LiveActionSheetDialog.d)a);
        }
    }
    
    private void LIZ(final int n, final LiveActionSheetDialog.d d) {
        MethodCollector.i(943);
        if (d.LIZIZ == null) {
            final View liziz = new View(this.getContext());
            liziz.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, liziz.getContext().getResources().getDimensionPixelSize(2131165823)));
            liziz.setBackgroundColor(0eI.LIZ(liziz, 2130971337));
            this.LJFF.addView(liziz, n);
            d.LIZIZ = liziz;
        }
        MethodCollector.o(943);
    }
    
    private void LIZ(final int n, final LiveActionSheetDialog.b b) {
        MethodCollector.i(2782);
        if (((LiveActionSheetDialog.d)b).LIZIZ == null) {
            final View liziz = new View(this.getContext());
            final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, liziz.getContext().getResources().getDimensionPixelSize(2131165792));
            if (b.LIZ instanceof 1J4 && ((1J4)b.LIZ).LJ != null) {
                final int dimensionPixelSize = liziz.getContext().getResources().getDimensionPixelSize(2131165807);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
            }
            liziz.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            liziz.setBackgroundColor(0eI.LIZ(liziz, 2130971360));
            this.LJFF.addView(liziz, n);
            ((LiveActionSheetDialog.d)b).LIZIZ = liziz;
        }
        MethodCollector.o(2782);
    }
    
    private void LIZ(final 0fS 0fS, final 1Ih 1Ih) {
        if (0fS instanceof 1J4) {
            1Ih.setIcon(((1J4)0fS).LJ);
        }
        1Ih.setText(0fS.LIZ);
        1Ih.setOnClickListener((View$OnClickListener)new 0fV(this, 0fS));
        1Ih.setEnabled(0fS.LIZLLL);
        1Ih.LIZ(0fS.LIZIZ);
    }
    
    private void LIZ(final LiveActionSheetDialog.c c) {
        this.LJIIIZ = c.LJII;
        if (c.LJI != null && !c.LJI.isEmpty()) {
            for (final 0fU 0fU : c.LJI) {
                final int size = this.LJIIIIZZ.size();
                if (size >= 0) {
                    if (size > this.LJIIIIZZ.size()) {
                        continue;
                    }
                    if (0fU == null || 0fU.LIZ == null) {
                        continue;
                    }
                    if (0fU.LIZ.isEmpty()) {
                        continue;
                    }
                    boolean b = false;
                    final LiveActionSheetDialog.a a = new LiveActionSheetDialog.a((byte)0);
                    final Iterator<0fS> iterator2 = 0fU.LIZ.iterator();
                    while (iterator2.hasNext()) {
                        a.LIZ.add(new LiveActionSheetDialog.b((0fS)iterator2.next()));
                    }
                    if (size == this.LJIIIIZZ.size()) {
                        b = true;
                    }
                    this.LJIIIIZZ.add(size, a);
                    if (this.LJFF != null) {
                        if (b && size > 0) {
                            this.LIZ(this.LIZ(size) - 1, (LiveActionSheetDialog.d)this.LJIIIIZZ.get(size - 1));
                        }
                        this.LIZ(size, this.LIZ(size), a);
                    }
                    this.LIZLLL();
                }
            }
        }
        if (c.LJIIIIZZ != null) {
            this.LJIIJ = new LiveActionSheetDialog.b((0fS)c.LJIIIIZZ);
        }
    }
    
    private void LIZ(final boolean b, final int n, final LiveActionSheetDialog.b b2) {
        MethodCollector.i(5422);
        final 0fS liz = b2.LIZ;
        final 1Ih 1Ih = new 1Ih(this.getContext());
        1Ih.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
        this.LIZ(liz, 1Ih);
        this.LJFF.addView((View)1Ih, n);
        if (b) {
            this.LIZ(n + 1, b2);
        }
        MethodCollector.o(5422);
    }
    
    private void LIZLLL() {
        final View lji = this.LJI;
        if (lji != null) {
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)lji.getLayoutParams();
            while (true) {
                Label_0133: {
                    if (this.LJIIIIZZ.size() <= 0 || this.LJIIIIZZ.get(0).LIZ() <= 0) {
                        break Label_0133;
                    }
                    final 0fS liz = this.LJIIIIZZ.get(0).LIZ.get(0).LIZ;
                    if (!TextUtils.isEmpty(this.LJIIIZ) || !(liz instanceof 1J4) || ((1J4)liz).LJ == null) {
                        break Label_0133;
                    }
                    layoutParams.topMargin = this.LJI.getContext().getResources().getDimensionPixelSize(2131165809);
                    this.LJI.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    return;
                }
                layoutParams.topMargin = 0;
                continue;
            }
        }
    }
    
    private void LJ() {
        if (this.LJII != null) {
            if (!TextUtils.isEmpty(this.LJIIIZ)) {
                this.LJII.setText(this.LJIIIZ);
                this.LJII.setVisibility(0);
            }
            else {
                this.LJII.setVisibility(8);
            }
        }
        this.LIZLLL();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(LIZ(this.getLayoutInflater()), new ViewGroup$LayoutParams(-1, -2));
        this.LJII = this.findViewById(2131361940);
        t.LIZ((View)(this.LJFF = this.findViewById(2131361938)), new 1Iz(this.getContext().getResources().getDimensionPixelSize(2131165808), this.getContext().getResources().getDimensionPixelSize(2131165802)));
        ((View)this.LJFF).requestApplyInsets();
        final View viewById = this.findViewById(2131361939);
        this.LJI = viewById;
        if (this.LJII != null && this.LJFF != null && viewById != null) {
            this.LJ();
            for (int i = 0; i < this.LJIIIIZZ.size(); ++i) {
                this.LIZ(i, this.LIZ(i), this.LJIIIIZZ.get(i));
            }
            final LinearLayout ljff = this.LJFF;
            if (ljff != null && this.LJIIJ != null) {
                this.LIZ(ljff.getChildCount(), (LiveActionSheetDialog.d)this.LJIIJ);
                this.LIZ(false, this.LJFF.getChildCount(), this.LJIIJ);
            }
        }
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public void setTitle(final int n) {
        this.setTitle(this.getContext().getResources().getString(n));
    }
    
    public void setTitle(final CharSequence ljiiiz) {
        this.LJIIIZ = ljiiiz;
        this.LJ();
    }
}
