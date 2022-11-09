// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.view.sheet;

import X.0CC;
import X.0CH;
import android.view.Window;
import android.os.Build$VERSION;
import android.view.View$OnLayoutChangeListener;
import X.1J5;
import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import androidx.core.g.t;
import android.os.Bundle;
import X.07e;
import X.07k;
import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import X.0II;
import X.1nH;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.ViewGroup$LayoutParams;
import X.0fX;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.FrameLayout;
import X.6mZ;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;

public class LiveBottomSheetDialog extends LifecycleAwareDialog implements 6mZ
{
    public LiveBottomSheetBehavior<FrameLayout> LIZ;
    public FrameLayout LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public FrameLayout LJFF;
    public float LJI;
    public LiveBottomSheetBehavior.a LJII;
    
    static {
        Covode.recordClassIndex(6065);
    }
    
    public LiveBottomSheetDialog(final Context context) {
        this(context, (byte)0);
    }
    
    public LiveBottomSheetDialog(final Context context, final byte b) {
        this(context, 0, (byte)0);
    }
    
    public LiveBottomSheetDialog(final Context context, final int n) {
        this(context, n, (byte)0);
    }
    
    public LiveBottomSheetDialog(final Context context, final int n, final byte b) {
        int resourceId = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(2130969931, typedValue, true)) {
                resourceId = typedValue.resourceId;
            }
            else {
                resourceId = 2131886562;
            }
        }
        super(context, resourceId, (a)null);
        this.LIZJ = true;
        this.LIZLLL = true;
        this.LJII = new LiveBottomSheetBehavior.a() {
            static {
                Covode.recordClassIndex(6070);
            }
            
            @Override
            public final void LIZ(final View view, final float n) {
                LiveBottomSheetDialog.this.LIZJ();
            }
            
            @Override
            public final void LIZ(final View view, final int n) {
                if (n == 5) {
                    if (LiveBottomSheetDialog.this.getWindow() != null) {
                        LiveBottomSheetDialog.this.getWindow().setWindowAnimations(2131886092);
                        LiveBottomSheetDialog.this.getWindow().getDecorView().post((Runnable)new 0fX(this));
                        return;
                    }
                    LiveBottomSheetDialog.this.cancel();
                }
            }
        };
        this.eD_();
    }
    
    private View LIZ(final int n, final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        MethodCollector.i(6837);
        this.LIZLLL();
        final 1nH 1nH = (1nH)this.LIZIZ.findViewById(2131363988);
        View liz = view;
        if (n != 0 && (liz = view) == null) {
            liz = 0II.LIZ(this.getLayoutInflater(), n, 1nH, false);
        }
        this.LJFF.removeAllViews();
        if (viewGroup$LayoutParams == null) {
            this.LJFF.addView(liz, -1, -1);
        }
        else {
            this.LJFF.addView(liz, viewGroup$LayoutParams);
        }
        1nH.findViewById(2131372580).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            static {
                Covode.recordClassIndex(6067);
            }
            
            public final void onClick(final View view) {
                if (LiveBottomSheetDialog.this.LIZJ && LiveBottomSheetDialog.this.isShowing()) {
                    final LiveBottomSheetDialog liz = LiveBottomSheetDialog.this;
                    if (!liz.LJ) {
                        final TypedArray obtainStyledAttributes = liz.getContext().obtainStyledAttributes(new int[] { 16843611 });
                        liz.LIZLLL = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        liz.LJ = true;
                    }
                    if (liz.LIZLLL) {
                        LiveBottomSheetDialog.this.cancel();
                    }
                }
            }
        });
        t.LIZ((View)this.LJFF, new 07k() {
            static {
                Covode.recordClassIndex(6068);
            }
            
            @Override
            public final void LIZ(final View view, final 07e 07e) {
                super.LIZ(view, 07e);
                if (LiveBottomSheetDialog.this.LIZJ) {
                    07e.LIZ(1048576);
                    07e.LJIIJ(true);
                    return;
                }
                07e.LJIIJ(false);
            }
            
            @Override
            public final boolean LIZ(final View view, final int n, final Bundle bundle) {
                if (n == 1048576 && LiveBottomSheetDialog.this.LIZJ) {
                    LiveBottomSheetDialog.this.cancel();
                    return true;
                }
                return super.LIZ(view, n, bundle);
            }
        });
        this.LJFF.setOnTouchListener((View$OnTouchListener)new View$OnTouchListener() {
            static {
                Covode.recordClassIndex(6069);
            }
            
            public final boolean onTouch(final View view, final MotionEvent motionEvent) {
                return true;
            }
        });
        final FrameLayout liziz = this.LIZIZ;
        MethodCollector.o(6837);
        return (View)liziz;
    }
    
    private FrameLayout LIZLLL() {
        MethodCollector.i(2876);
        if (this.LIZIZ == null) {
            (this.LIZIZ = (FrameLayout)View.inflate(this.getContext(), 2131560664, (ViewGroup)null)).findViewById(2131363988);
            t.LIZ((View)(this.LJFF = (FrameLayout)this.LIZIZ.findViewById(2131364296)), 1J5.LIZ);
            (this.LIZ = LiveBottomSheetBehavior.LIZ(this.LJFF)).LIZ(this.LJII);
            this.LIZ.LIZIZ(this.LIZJ);
            this.LIZIZ.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                static {
                    Covode.recordClassIndex(6066);
                }
                
                public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                    LiveBottomSheetDialog.this.LIZJ();
                    LiveBottomSheetDialog.this.LIZIZ.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                }
            });
        }
        final FrameLayout liziz = this.LIZIZ;
        MethodCollector.o(2876);
        return liziz;
    }
    
    public final LiveBottomSheetBehavior<FrameLayout> LIZIZ() {
        if (this.LIZ == null) {
            this.LIZLLL();
        }
        return this.LIZ;
    }
    
    public final void LIZJ() {
        if (this.getWindow() != null) {
            final int n = this.LIZ.LJIILJJIL - this.LIZ.LIZ();
            if (n > 0) {
                this.getWindow().setDimAmount((this.LIZ.LJIILJJIL - this.LJFF.getTop()) / (float)n * this.LJI);
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Window window = this.getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build$VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
            int windowAnimations;
            if (this.getContext().getResources().getConfiguration().orientation == 1) {
                windowAnimations = 2131886088;
            }
            else if (this.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                windowAnimations = 2131886090;
            }
            else {
                windowAnimations = 2131886089;
            }
            window.setWindowAnimations(windowAnimations);
        }
        final TypedValue typedValue = new TypedValue();
        this.getContext().getTheme().resolveAttribute(16842802, typedValue, true);
        this.LJI = typedValue.getFloat();
    }
    
    public void onStart() {
        super.onStart();
        final LiveBottomSheetBehavior<FrameLayout> liz = this.LIZ;
        if (liz != null && liz.LJIIL == 5) {
            this.LIZ.LIZIZ(4);
        }
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public void setCancelable(final boolean b) {
        super.setCancelable(b);
        if (this.LIZJ != b) {
            this.LIZJ = b;
            final LiveBottomSheetBehavior<FrameLayout> liz = this.LIZ;
            if (liz != null) {
                liz.LIZIZ(b);
            }
        }
    }
    
    public void setCanceledOnTouchOutside(final boolean b) {
        super.setCanceledOnTouchOutside(b);
        if (b && !this.LIZJ) {
            this.LIZJ = true;
        }
        this.LIZLLL = b;
        this.LJ = true;
    }
    
    public void setContentView(final int n) {
        super.setContentView(this.LIZ(n, null, null));
    }
    
    public void setContentView(final View view) {
        super.setContentView(this.LIZ(0, view, null));
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(this.LIZ(0, view, viewGroup$LayoutParams));
    }
}
