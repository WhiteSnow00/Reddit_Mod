// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.view.sheet;

import android.text.TextUtils;
import X.0CC;
import X.0CH;
import android.os.Bundle;
import android.view.View$OnLayoutChangeListener;
import X.0II;
import android.view.View$OnClickListener;
import X.0fP;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater$Factory;
import X.SgJ;
import X.NEN;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.LayoutInflater;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;
import android.view.View;
import X.0fO;
import X.6mZ;

public class LiveBaseSheetDialog extends LiveBottomSheetDialog implements 6mZ
{
    public 0fO LIZ;
    public View LJFF;
    public View LJI;
    public TextView LJII;
    public CharSequence LJIIIIZZ;
    public boolean LJIIIZ;
    public View LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    
    static {
        Covode.recordClassIndex(6054);
    }
    
    public LiveBaseSheetDialog(final Context context) {
        super(context);
        this.LJIIL = true;
    }
    
    public LiveBaseSheetDialog(final Context context, final int n) {
        super(context, n);
        this.LJIIL = true;
    }
    
    public LiveBaseSheetDialog(final Context context, final LiveBaseSheetDialog.a<?> a) {
        this(context, 2131886566);
        this.LJIIIIZZ = a.LIZJ;
        this.LJIIIZ = a.LIZLLL;
        this.LJIIJ = a.LJ;
        this.LJIIJJI = a.LJFF;
    }
    
    public static View LIZ(final LayoutInflater layoutInflater) {
        MethodCollector.i(384);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(2131560680, (ViewGroup)null);
                MethodCollector.o(384);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(2131560680, (ViewGroup)null);
        MethodCollector.o(384);
        return inflate2;
    }
    
    private View LIZ(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        MethodCollector.i(4457);
        final View liz = LIZ(LayoutInflater.from(this.getContext()));
        this.LJFF = liz.findViewById(2131371254);
        (this.LJI = liz.findViewById(2131371255)).setOnClickListener((View$OnClickListener)new 0fP(this));
        this.LJII = (TextView)liz.findViewById(2131371256);
        this.LIZ = (0fO)liz.findViewById(2131371253);
        this.LIZ(this.LJIIL);
        final ViewGroup viewGroup = (ViewGroup)liz.findViewById(2131371247);
        View liz2 = view;
        if (view == null) {
            liz2 = view;
            if (n != 0) {
                liz2 = 0II.LIZ(this.getLayoutInflater(), n, viewGroup, false);
            }
        }
        if (viewGroup$LayoutParams == null) {
            viewGroup.addView(liz2, -1, -1);
        }
        else {
            viewGroup.addView(liz2, viewGroup$LayoutParams);
        }
        this.LIZ.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
            static {
                Covode.recordClassIndex(6055);
            }
            
            public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                if (LiveBaseSheetDialog.this.LIZIZ().LJIIL == 3) {
                    LiveBaseSheetDialog.this.LIZ.setOffset(1.0f);
                }
                else {
                    LiveBaseSheetDialog.this.LIZ.setOffset(0.0f);
                }
                LiveBaseSheetDialog.this.LIZ.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
            }
        });
        this.LIZIZ().LIZ((LiveBottomSheetBehavior.a)new LiveBottomSheetBehavior.a() {
            static {
                Covode.recordClassIndex(6056);
            }
            
            @Override
            public final void LIZ(final View view, final float n) {
                LiveBaseSheetDialog.this.LIZ.setOffset(Math.max(n, 0.0f));
            }
            
            @Override
            public final void LIZ(final View view, final int n) {
            }
        });
        MethodCollector.o(4457);
        return liz;
    }
    
    private void LIZIZ(final boolean ljiiiz) {
        this.LJIIIZ = ljiiiz;
        final View lji = this.LJI;
        if (lji != null) {
            int visibility;
            if (ljiiiz) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            lji.setVisibility(visibility);
        }
    }
    
    private void LIZLLL() {
        this.setTitle(this.LJIIIIZZ);
        this.LIZIZ(this.LJIIIZ);
    }
    
    public final void LIZ(final boolean ljiil) {
        this.LJIIL = ljiil;
        final 0fO liz = this.LIZ;
        if (liz != null) {
            int visibility;
            if (ljiil) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            liz.setVisibility(visibility);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final View ljiij = this.LJIIJ;
        if (ljiij != null) {
            this.setContentView(ljiij);
            return;
        }
        final int ljiijji = this.LJIIJJI;
        if (ljiijji != 0) {
            this.setContentView(ljiijji);
        }
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    @Override
    public void setContentView(final int n) {
        super.setContentView(this.LIZ(null, n, new ViewGroup$LayoutParams(-1, -1)));
        this.LIZLLL();
    }
    
    @Override
    public void setContentView(final View view) {
        super.setContentView(this.LIZ(view, 0, new ViewGroup$LayoutParams(-1, -1)));
        this.LIZLLL();
    }
    
    @Override
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(this.LIZ(view, 0, viewGroup$LayoutParams));
        this.LIZLLL();
    }
    
    public void setTitle(final int n) {
        this.setTitle(this.getContext().getResources().getString(n));
    }
    
    public void setTitle(final CharSequence charSequence) {
        this.LJIIIIZZ = charSequence;
        final TextView ljii = this.LJII;
        if (ljii != null) {
            ljii.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                this.LJFF.setVisibility(8);
                return;
            }
            this.LJFF.setVisibility(0);
        }
    }
}
