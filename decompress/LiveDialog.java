// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.app;

import android.content.DialogInterface;
import X.0eE;
import X.0CC;
import X.0CH;
import android.view.Window;
import X.08l;
import X.0eD;
import android.text.method.LinkMovementMethod;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import X.0ep;
import android.widget.LinearLayout$LayoutParams;
import X.0eG;
import X.1so;
import X.0e9;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.text.TextUtils;
import java.util.Iterator;
import android.view.View$OnClickListener;
import X.0eF;
import X.1sm;
import X.0e4;
import java.util.List;
import java.util.Collections;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.LinearLayout;
import X.0eB;
import X.0e7;
import X.0e6;
import android.content.res.ColorStateList;
import X.0eL;
import X.0e0;
import X.1ib;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ImageView;
import X.1It;
import android.view.View;
import X.6mZ;

public class LiveDialog extends LifecycleAwareDialog implements 6mZ
{
    public View LIZ;
    public View LIZIZ;
    public 1It LIZJ;
    public ImageView LIZLLL;
    public ImageView LJ;
    public TextView LJFF;
    public View LJI;
    public FrameLayout LJII;
    public 1ib LJIIIIZZ;
    public ImageView LJIIIZ;
    public FrameLayout LJIIJ;
    public 0e0 LJIIJJI;
    public FrameLayout LJIIL;
    public boolean LJIILIIL;
    public CharSequence LJIILJJIL;
    public CharSequence LJIILL;
    public View LJIILLIIL;
    public 0eL LJIIZILJ;
    public boolean LJIJ;
    public ColorStateList LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public boolean LJJIFFI;
    public float LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public ColorStateList LJJIIJZLJL;
    public 0e6 LJJIIZ;
    public 0e7 LJJIIZI;
    public 0eB LJJIJ;
    public LinearLayout LJJIJIIJI;
    
    static {
        Covode.recordClassIndex(5909);
    }
    
    public LiveDialog(final Context context, final LiveDialog.a a) {
        super(context, (a)a);
        this.LJIIZILJ = a.LJFF;
        this.LJIJ = a.LJII;
        this.LJIJI = a.LJI;
        this.LJIJJ = a.LJIIIIZZ;
        this.LJIJJLI = a.LJIIIZ;
        this.LJIL = a.LJIIJ;
        this.LJJ = a.LJIIJJI;
        this.LJJI = a.LJIIL;
        this.LJJII = a.LJIILJJIL;
        this.LJJIFFI = a.LJIILIIL;
        this.LJJIII = a.LJIILL;
        this.LJIILJJIL = a.LIZJ;
        this.LJIILL = a.LJ;
        this.LJIILLIIL = a.LIZLLL;
        this.LJJIIJ = a.LJIILLIIL;
        this.LJJIIJZLJL = a.LJIIZILJ;
        this.LJIIJJI = a.LJJI;
        this.setOnShowListener(a.LJIJJ);
        this.setOnCancelListener(a.LJIL);
        this.setOnDismissListener(a.LJIJJLI);
        this.setOnKeyListener(a.LJJ);
        this.setCancelable(a.LJIJI);
        this.setCanceledOnTouchOutside(a.LJIJ);
        this.LJJIIZ = a.LJJIFFI;
        this.LJJIJ = a.LJJII;
    }
    
    private void LIZ(final 0e6 ljjiiz) {
        MethodCollector.i(3151);
        if (this.LJJIIZ == null && ljjiiz == null) {
            MethodCollector.o(3151);
            return;
        }
        this.LJJIJ = null;
        this.LJJIIZ = ljjiiz;
        final FrameLayout ljiil = this.LJIIL;
        if (ljiil != null) {
            ljiil.removeAllViews();
            if (this.LJJIIZ != null) {
                if (this.LJJIIZI == null) {
                    this.LJJIIZI = new 0e7(this.getContext());
                }
                final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)this.LJJIIZ.LIZ);
                this.LJJIIZI.removeAllViews();
                if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                    for (final 0e4 0e4 : unmodifiableList) {
                        final 1sm lj = new 1sm(this.getContext());
                        lj.LIZ.LIZ(0e4.LIZIZ);
                        lj.setText(0e4.LIZ);
                        if (0e4.LIZJ != null) {
                            lj.setOnClickListener((View$OnClickListener)new 0eF(this, 0e4));
                        }
                        lj.setEnabled(0e4.LIZLLL);
                        0e4.LJ = lj;
                        if (0e4.LJFF != null && 0e4.LJ != null) {
                            0e4.LJ.setTextColor(0e4.LJFF);
                        }
                        this.LJJIIZI.addView((View)lj);
                    }
                }
                this.LJJIIZI.requestLayout();
                this.LJJIIZI.setOrientation(this.LJJIIZ.LIZIZ);
                this.LJIIL.addView((View)this.LJJIIZI, -1, -2);
                MethodCollector.o(3151);
                return;
            }
            final 0e7 ljjiizi = this.LJJIIZI;
            if (ljjiizi != null) {
                ljjiizi.removeAllViews();
            }
        }
        MethodCollector.o(3151);
    }
    
    private void LIZ(final 0eL 0eL) {
        final 0eL ljiizilj = this.LJIIZILJ;
        if (0eL == ljiizilj) {
            return;
        }
        if (ljiizilj != null && ljiizilj.LIZ() != null) {
            this.LJIIZILJ.LIZ().LIZIZ();
        }
        this.LJIIZILJ = null;
    }
    
    private void LIZ(final ColorStateList iconTintList) {
        final 1It lizj = this.LIZJ;
        if (lizj != null) {
            lizj.setIconTintList(iconTintList);
        }
    }
    
    private void LIZ(final CharSequence ljiill, final View ljiilliil) {
        MethodCollector.i(3018);
        if (this.LJI != null && this.LJIIIIZZ != null) {
            final FrameLayout ljii = this.LJII;
            if (ljii != null) {
                final View ljiilliil2 = this.LJIILLIIL;
                if (ljiilliil2 != null) {
                    ljii.removeView(ljiilliil2);
                }
                this.LJIILL = ljiill;
                this.LJIILLIIL = ljiilliil;
                if (!TextUtils.isEmpty(ljiill)) {
                    this.LJIIIIZZ.setText(this.LJIILL);
                    if (TextUtils.isEmpty(this.LJIILJJIL)) {
                        this.LJIIIIZZ.LIZ(2131886907);
                    }
                    else {
                        this.LJIIIIZZ.LIZ(2131886910);
                    }
                    this.LJIIIIZZ.setVisibility(0);
                    this.LJI.setVisibility(0);
                    MethodCollector.o(3018);
                    return;
                }
                final View ljiilliil3 = this.LJIILLIIL;
                if (ljiilliil3 != null) {
                    this.LJII.addView(ljiilliil3, -1, -2);
                    this.LJIIIIZZ.setText((CharSequence)"");
                    this.LJIIIIZZ.setVisibility(8);
                    this.LJI.setVisibility(0);
                    MethodCollector.o(3018);
                    return;
                }
                this.LJIIIIZZ.setText((CharSequence)"");
                this.LJIIIIZZ.setVisibility(8);
                this.LJI.setVisibility(8);
                MethodCollector.o(3018);
                return;
            }
        }
        MethodCollector.o(3018);
    }
    
    private void LIZIZ() {
        final ImageView lj = this.LJ;
        if (lj == null) {
            return;
        }
        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)lj.getLayoutParams();
        if (this.LJJIFFI) {
            layoutParams.height = this.LJJI;
            layoutParams.dimensionRatio = null;
        }
        else if (this.LJJIII) {
            layoutParams.height = 0;
            final StringBuilder sb = new StringBuilder("w, ");
            sb.append(this.LJJII);
            layoutParams.dimensionRatio = sb.toString();
        }
        else {
            layoutParams.height = -2;
            layoutParams.dimensionRatio = null;
        }
        this.LJ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private void LIZIZ(final int n) {
        this.LJIJJ = n;
        final 1It lizj = this.LIZJ;
        if (lizj != null) {
            final ViewGroup$LayoutParams layoutParams = lizj.getLayoutParams();
            layoutParams.width = n;
            this.LIZJ.setLayoutParams(layoutParams);
        }
    }
    
    private void LIZIZ(final Drawable imageDrawable) {
        final 1It lizj = this.LIZJ;
        if (lizj != null && this.LIZIZ != null) {
            if (imageDrawable == null) {
                lizj.setImageDrawable(null);
                this.LIZJ.setVisibility(8);
                this.LIZIZ.setVisibility(8);
                return;
            }
            lizj.setImageDrawable(imageDrawable);
            this.LIZJ.setVisibility(0);
            this.LIZIZ.setVisibility(0);
        }
    }
    
    private void LIZJ() {
        MethodCollector.i(581);
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)this.LJJIJ.LIZ);
        final int size = unmodifiableList.size();
        for (int i = 0; i < size; ++i) {
            final 0e9 0e9 = unmodifiableList.get(i);
            final 1so 1so = new 1so(this.getContext());
            1so.LIZ(0e9.LIZIZ);
            if (0e9.LIZJ != null) {
                1so.setOnClickListener((View$OnClickListener)new 0eG(this, 0e9));
            }
            1so.setText(0e9.LIZ);
            1so.setEnabled(0e9.LIZLLL);
            final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
            if (i > 0) {
                layoutParams.topMargin = this.getContext().getResources().getDimensionPixelSize(2131165775);
            }
            1so.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            this.LJJIJIIJI.addView((View)1so);
        }
        if (size > 1) {
            final LinearLayout ljjijiiji = this.LJJIJIIJI;
            ljjijiiji.setPadding(ljjijiiji.getPaddingLeft(), this.LJJIJIIJI.getPaddingTop(), this.LJJIJIIJI.getPaddingRight(), this.getContext().getResources().getDimensionPixelSize(2131165809));
            MethodCollector.o(581);
            return;
        }
        final LinearLayout ljjijiiji2 = this.LJJIJIIJI;
        ljjijiiji2.setPadding(ljjijiiji2.getPaddingLeft(), this.LJJIJIIJI.getPaddingTop(), this.LJJIJIIJI.getPaddingRight(), this.getContext().getResources().getDimensionPixelSize(2131165785));
        MethodCollector.o(581);
    }
    
    private void LIZJ(final int n) {
        this.LJIJJLI = n;
        final 1It lizj = this.LIZJ;
        if (lizj != null) {
            final ViewGroup$LayoutParams layoutParams = lizj.getLayoutParams();
            layoutParams.height = n;
            this.LIZJ.setLayoutParams(layoutParams);
        }
    }
    
    private void LIZJ(final Drawable imageDrawable) {
        final ImageView lizlll = this.LIZLLL;
        if (lizlll != null && this.LIZIZ != null) {
            if (imageDrawable == null) {
                lizlll.setImageDrawable((Drawable)null);
                this.LIZLLL.setVisibility(8);
                this.LIZIZ.setVisibility(8);
                return;
            }
            lizlll.setImageDrawable(imageDrawable);
            this.LIZLLL.setVisibility(0);
            this.LIZIZ.setVisibility(0);
        }
    }
    
    private void LIZLLL(final Drawable imageDrawable) {
        final ImageView lj = this.LJ;
        if (lj != null && this.LIZIZ != null) {
            if (imageDrawable == null) {
                lj.setImageDrawable((Drawable)null);
                this.LJ.setVisibility(8);
                this.LIZIZ.setVisibility(8);
                return;
            }
            lj.setImageDrawable(imageDrawable);
            this.LJ.setVisibility(0);
            this.LIZIZ.setVisibility(0);
        }
    }
    
    public final void LIZ(final int n) {
        this.LIZ(0ep.a.LIZ.LIZ(this.getContext(), n));
        this.LIZ(0ep.a.LIZ.LIZ(n, false));
    }
    
    public final void LIZ(0e0 ljiijji) {
        MethodCollector.i(4115);
        this.LJIIJJI = ljiijji;
        final FrameLayout ljiij = this.LJIIJ;
        if (ljiij != null) {
            ljiij.removeAllViews();
            ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                final View liz = ljiijji.LIZ(this.getContext(), (ViewGroup)this.LJIIJ);
                if (liz != null) {
                    Object layoutParams = liz.getLayoutParams();
                    if (layoutParams != null) {
                        if (!(layoutParams instanceof FrameLayout$LayoutParams)) {
                            layoutParams = new FrameLayout$LayoutParams((ViewGroup$LayoutParams)layoutParams);
                        }
                    }
                    else {
                        layoutParams = new FrameLayout$LayoutParams(-1, -2);
                    }
                    this.LJIIJ.addView(liz, (ViewGroup$LayoutParams)layoutParams);
                    this.LJIIJ.setVisibility(0);
                    MethodCollector.o(4115);
                    return;
                }
                this.LJIIJ.setVisibility(8);
                MethodCollector.o(4115);
                return;
            }
            else {
                this.LJIIJ.setVisibility(8);
            }
        }
        MethodCollector.o(4115);
    }
    
    public final void LIZ(final Drawable drawable) {
        if (drawable == null) {
            return;
        }
        this.LIZJ(null);
        this.LIZLLL(null);
        this.LIZ((0eL)null);
        this.LJIIZILJ = new 0eL(drawable, 1);
        final 1It lizj = this.LIZJ;
        if (lizj != null) {
            lizj.setIconAutoMirrored(this.LJIJ);
            this.LIZJ.setIconTintList(this.LJIJI);
        }
        this.LIZIZ(drawable);
    }
    
    public final void LIZ(final Drawable drawable, final float ljjii) {
        if (this.LJIIZILJ == null && drawable == null) {
            return;
        }
        this.LIZIZ(null);
        this.LIZJ(null);
        this.LIZ((0eL)null);
        final 0eL ljiizilj = new 0eL(drawable, 3);
        this.LJIIZILJ = ljiizilj;
        this.LIZLLL(ljiizilj.LIZIZ);
        this.LJJII = ljjii;
        this.LJJIII = true;
        this.LJJIFFI = false;
        this.LIZIZ();
    }
    
    public final void LIZ(final Drawable drawable, final int ljji) {
        if (this.LJIIZILJ == null && drawable == null) {
            return;
        }
        this.LIZIZ(null);
        this.LIZJ(null);
        this.LIZ((0eL)null);
        final 0eL ljiizilj = new 0eL(drawable, 3);
        this.LJIIZILJ = ljiizilj;
        this.LIZLLL(ljiizilj.LIZIZ);
        this.LJJI = ljji;
        this.LJJIFFI = true;
        this.LJJIII = false;
        this.LIZIZ();
    }
    
    public final void LIZ(final Drawable drawable, final int ljil, final int ljj) {
        if (this.LJIIZILJ == null && drawable == null) {
            return;
        }
        this.LIZIZ(null);
        this.LIZLLL(null);
        this.LIZ((0eL)null);
        final 0eL ljiizilj = new 0eL(drawable, 2);
        this.LJIIZILJ = ljiizilj;
        this.LIZJ(ljiizilj.LIZIZ);
        this.LJIL = ljil;
        this.LJJ = ljj;
        final ImageView lizlll = this.LIZLLL;
        if (lizlll != null) {
            final ViewGroup$LayoutParams layoutParams = lizlll.getLayoutParams();
            layoutParams.width = this.LJIL;
            layoutParams.height = this.LJJ;
            this.LIZLLL.setLayoutParams(layoutParams);
        }
    }
    
    public final void LIZ(final boolean b) {
        this.LJIJ = b;
        final 1It lizj = this.LIZJ;
        if (lizj != null) {
            lizj.setIconAutoMirrored(b);
        }
    }
    
    public void onCreate(final Bundle bundle) {
        MethodCollector.i(3548);
        super.onCreate(bundle);
        final Window window = this.getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build$VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
                window.addFlags(134217728);
            }
            window.getDecorView().setSystemUiVisibility(512);
            window.setLayout(-1, -1);
        }
        this.setContentView(View.inflate(this.getContext(), 2131560682, (ViewGroup)null), new ViewGroup$LayoutParams(-1, -1));
        this.LIZ = this.findViewById(2131367716);
        this.setCanceledOnTouchOutside(this.LJIILIIL);
        this.LIZIZ = this.findViewById(2131367710);
        this.LIZJ = this.findViewById(2131367708);
        this.LIZLLL = this.findViewById(2131367709);
        this.LJ = this.findViewById(2131367707);
        final 0eL ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            if (ljiizilj.LIZIZ != null) {
                if (this.LJIIZILJ.LIZJ == 1) {
                    this.LIZ(this.LJIIZILJ.LIZIZ);
                    this.LIZ(this.LJIJ);
                    this.LIZ(this.LJIJI);
                    this.LIZIZ(this.LJIJJ);
                    this.LIZJ(this.LJIJJLI);
                }
                else if (this.LJIIZILJ.LIZJ == 2) {
                    this.LIZ(this.LJIIZILJ.LIZIZ, this.LJIL, this.LJJ);
                }
                else if (this.LJIIZILJ.LIZJ == 3) {
                    if (this.LJJIFFI) {
                        this.LIZ(this.LJIIZILJ.LIZIZ, this.LJJI);
                    }
                    else if (this.LJJIII) {
                        this.LIZ(this.LJIIZILJ.LIZIZ, this.LJJII);
                    }
                }
            }
            else if (this.LJIIZILJ.LIZ() != null) {
                if (this.LJIIZILJ.LIZJ == 1) {
                    this.LIZIZ(this.LJIJJ);
                    this.LIZJ(this.LJIJJLI);
                    this.LIZ(this.LJIJ);
                    this.LIZ(this.LJIJI);
                    final 0eL ljiizilj2 = this.LJIIZILJ;
                    this.LIZ(ljiizilj2);
                    ljiizilj2.LIZJ = 1;
                    this.LJIIZILJ = ljiizilj2;
                    ljiizilj2.LIZ = (0eL.a)new 0eL.a() {
                        static {
                            Covode.recordClassIndex(5910);
                        }
                        
                        @Override
                        public final void LIZ(final Drawable drawable) {
                            LiveDialog.this.LIZ(drawable);
                        }
                    };
                    if (this.LJIIZILJ.LIZ() != null) {
                        this.LJIIZILJ.LIZ().LIZ();
                    }
                }
                else if (this.LJIIZILJ.LIZJ == 2) {
                    final 0eL ljiizilj3 = this.LJIIZILJ;
                    final int ljil = this.LJIL;
                    final int ljj = this.LJJ;
                    this.LIZ(ljiizilj3);
                    ljiizilj3.LIZJ = 2;
                    this.LJIIZILJ = ljiizilj3;
                    ljiizilj3.LIZ = (0eL.a)new 0eL.a() {
                        static {
                            Covode.recordClassIndex(5911);
                        }
                        
                        @Override
                        public final void LIZ(final Drawable drawable) {
                            LiveDialog.this.LIZ(drawable, ljil, ljj);
                        }
                    };
                    if (this.LJIIZILJ.LIZ() != null) {
                        this.LJIIZILJ.LIZ().LIZ();
                    }
                }
                else if (this.LJIIZILJ.LIZJ == 3) {
                    if (this.LJJIFFI) {
                        final 0eL ljiizilj4 = this.LJIIZILJ;
                        final int ljji = this.LJJI;
                        this.LIZ(ljiizilj4);
                        ljiizilj4.LIZJ = 3;
                        this.LJIIZILJ = ljiizilj4;
                        ljiizilj4.LIZ = (0eL.a)new 0eL.a() {
                            static {
                                Covode.recordClassIndex(5912);
                            }
                            
                            @Override
                            public final void LIZ(final Drawable drawable) {
                                LiveDialog.this.LIZ(drawable, ljji);
                            }
                        };
                        if (this.LJIIZILJ.LIZ() != null) {
                            this.LJIIZILJ.LIZ().LIZ();
                        }
                    }
                    else if (this.LJJIII) {
                        final 0eL ljiizilj5 = this.LJIIZILJ;
                        final float ljjii = this.LJJII;
                        this.LIZ(ljiizilj5);
                        ljiizilj5.LIZJ = 3;
                        this.LJIIZILJ = ljiizilj5;
                        ljiizilj5.LIZ = (0eL.a)new 0eL.a() {
                            static {
                                Covode.recordClassIndex(5913);
                            }
                            
                            @Override
                            public final void LIZ(final Drawable drawable) {
                                LiveDialog.this.LIZ(drawable, ljjii);
                            }
                        };
                        if (this.LJIIZILJ.LIZ() != null) {
                            this.LJIIZILJ.LIZ().LIZ();
                        }
                    }
                }
            }
        }
        this.LJFF = this.findViewById(2131367715);
        this.setTitle(this.LJIILJJIL);
        this.LJI = this.findViewById(2131367713);
        this.LJII = this.findViewById(2131367712);
        (this.LJIIIIZZ = this.findViewById(2131367714)).setMovementMethod(LinkMovementMethod.getInstance());
        this.LIZ(this.LJIILL, this.LJIILLIIL);
        (this.LJIIIZ = this.findViewById(2131367705)).setOnClickListener((View$OnClickListener)new 0eD(this));
        final boolean ljjiij = this.LJJIIJ;
        this.LJJIIJ = ljjiij;
        final ImageView ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            if (ljjiij) {
                ljiiiz.setVisibility(0);
            }
            else {
                ljiiiz.setVisibility(8);
            }
        }
        final ColorStateList ljjiijzljl = this.LJJIIJZLJL;
        this.LJJIIJZLJL = ljjiijzljl;
        final ImageView ljiiiz2 = this.LJIIIZ;
        if (ljiiiz2 != null) {
            08l.LIZ(ljiiiz2, ljjiijzljl);
        }
        this.LJIIJ = this.findViewById(2131367703);
        this.LIZ(this.LJIIJJI);
        this.LJIIL = this.findViewById(2131367704);
        this.LIZ(this.LJJIIZ);
        final 0eB ljjij = this.LJJIJ;
        if (ljjij != null) {
            this.LJJIIZ = null;
            this.LJJIJ = ljjij;
            final FrameLayout ljiil = this.LJIIL;
            if (ljiil != null) {
                ljiil.removeAllViews();
                if (this.LJJIJ != null) {
                    final LinearLayout ljjijiiji = this.LJJIJIIJI;
                    if (ljjijiiji == null) {
                        final LinearLayout ljjijiiji2 = new LinearLayout(this.getContext());
                        ljjijiiji2.setOrientation(1);
                        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
                        layoutParams.topMargin = this.getContext().getResources().getDimensionPixelSize(2131165774);
                        final int dimensionPixelSize = this.getContext().getResources().getDimensionPixelSize(2131165806);
                        layoutParams.rightMargin = dimensionPixelSize;
                        layoutParams.leftMargin = dimensionPixelSize;
                        ljjijiiji2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                        this.LJJIJIIJI = ljjijiiji2;
                    }
                    else {
                        ljjijiiji.removeAllViews();
                    }
                    this.LIZJ();
                    this.LJIIL.addView((View)this.LJJIJIIJI);
                    MethodCollector.o(3548);
                    return;
                }
                this.LJJIJIIJI.removeAllViews();
            }
        }
        MethodCollector.o(3548);
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final 0eL ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null && ljiizilj.LIZ() != null) {
            this.LJIIZILJ.LIZ().LIZIZ();
        }
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public void setCanceledOnTouchOutside(final boolean b) {
        super.setCanceledOnTouchOutside(b);
        this.LJIILIIL = b;
        final View liz = this.LIZ;
        if (liz != null) {
            if (b) {
                liz.setOnClickListener((View$OnClickListener)new 0eE(this));
                return;
            }
            liz.setOnClickListener((View$OnClickListener)null);
        }
    }
    
    public void setTitle(final int n) {
        this.setTitle(this.getContext().getResources().getString(n));
    }
    
    public void setTitle(final CharSequence ljiiljjil) {
        this.LJIILJJIL = ljiiljjil;
        if (this.LJFF != null) {
            if (TextUtils.isEmpty(ljiiljjil)) {
                this.LJFF.setText((CharSequence)"");
                this.LJFF.setVisibility(8);
            }
            else {
                this.LJFF.setText(this.LJIILJJIL);
                this.LJFF.setVisibility(0);
            }
        }
        this.LIZ(this.LJIILL, this.LJIILLIIL);
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(5915);
        }
        
        void LIZ(final DialogInterface p0);
    }
}
