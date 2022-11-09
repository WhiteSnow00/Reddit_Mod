// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.ecommerce.ocr.view;

import X.144;
import X.06x;
import android.os.Build$VERSION;
import android.app.Dialog;
import X.KN6;
import X.0Qu;
import X.Q0z;
import android.net.Uri;
import android.content.Intent;
import X.0VS;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import android.util.DisplayMetrics;
import android.os.Handler;
import android.os.HandlerThread;
import X.0Ua;
import X.0V6;
import X.0V3;
import X.0VF;
import X.0UU;
import X.1Eq;
import android.content.Context;
import X.0VM;
import android.app.Activity;
import X.7KR;
import android.os.Bundle;
import X.1EK;
import X.1EA;
import com.bytedance.covode.number.Covode;
import X.1Er;
import android.widget.FrameLayout;
import X.0V9;
import X.1En;
import X.0Tw;
import X.2Ap;

public class OcrActivity extends 2Ap implements 0Tw
{
    public static int LJFF;
    public 1En LIZ;
    public 0V9 LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public FrameLayout LJ;
    public boolean LJI;
    public 1Er LJII;
    public boolean LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(4773);
        OcrActivity.LJFF = 250;
    }
    
    public final void LIZ(final int n) {
        this.LIZ.LIZ(n);
    }
    
    @Override
    public final void LIZ(final int n, final int n2, final String s, final 1EA 1ea) {
        try {
            1EK.LIZ.LJIIJ().LIZ(n, n2, s, 1ea);
        }
        finally {
            this.LJIIIIZZ = true;
            this.finish();
        }
    }
    
    public void finish() {
        super.finish();
        if (!this.LJIIIIZZ) {
            1EK.LIZ.LJIIJ().LIZ(0, 105, "user cancel", null);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        7KR.LIZ((Activity)this, bundle);
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        this.LJII = new 1Er(this);
        this.setContentView(2131558510);
        final 1Er ljii = this.LJII;
        if (ljii.LIZ()) {
            ljii.LIZIZ = new 0VM((Context)ljii.LIZ);
            ljii.LIZIZ.LIZIZ = (0VM.a)new 1Eq(ljii);
            0UU.LIZ((Context)ljii.LIZ).LIZLLL.LIZ((Object)ljii);
        }
        this.LJ = this.findViewById(2131366193);
        final 1En liz = this.findViewById(2131366186);
        this.LIZ = liz;
        liz.LJIIZILJ = this;
        this.LIZ.LJIILLIIL = new 0VF.a() {
            static {
                Covode.recordClassIndex(4774);
            }
            
            @Override
            public final void LIZ() {
            }
            
            @Override
            public final void LIZ(final Exception ex) {
            }
            
            @Override
            public final void LIZIZ() {
                final OcrActivity liz = OcrActivity.this;
                final FrameLayout lj = liz.LJ;
                0V3 ljiill = null;
                Label_0016: {
                    if (lj != null) {
                        final DisplayMetrics displayMetrics = liz.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            final int widthPixels = displayMetrics.widthPixels;
                            final int heightPixels = displayMetrics.heightPixels;
                            final float n = (float)((View)lj).getLeft();
                            final float n2 = (float)widthPixels;
                            final float n3 = n / n2;
                            final float n4 = (float)((View)lj).getTop();
                            final float n5 = (float)heightPixels;
                            ljiill = new 0V3(n3, n4 / n5, ((View)lj).getWidth() / n2, ((View)lj).getHeight() / n5, widthPixels, heightPixels);
                            break Label_0016;
                        }
                    }
                    ljiill = null;
                }
                OcrActivity.this.LIZ.LJIILL = ljiill;
                final 1En liz2 = OcrActivity.this.LIZ;
                if (liz2.LJIILJJIL != null) {
                    liz2.LJIILJJIL.LIZ();
                    liz2.LJIILJJIL = null;
                }
                if (liz2.LIZJ) {
                    liz2.LJIILJJIL = new 0V6(liz2.getCameraInstance(), liz2.LJIIZILJ);
                    liz2.LJIILJJIL.LJ = liz2.LJIILL;
                    final 0V6 ljiiljjil = liz2.LJIILJJIL;
                    0Ua.LIZ();
                    if (ljiiljjil.LIZ) {
                        ljiiljjil.LIZ();
                    }
                    (ljiiljjil.LIZJ = new HandlerThread("ScanThread")).start();
                    ljiiljjil.LIZLLL = new Handler(ljiiljjil.LIZJ.getLooper(), ljiiljjil.LJII);
                    ljiiljjil.LIZ = true;
                    ljiiljjil.LIZIZ();
                }
            }
            
            @Override
            public final void LIZJ() {
            }
            
            @Override
            public final void LIZLLL() {
            }
        };
        this.LIZIZ = this.findViewById(2131368897);
        this.findViewById(2131366194);
        this.LIZIZ.setFlashLightClickListener((View$OnClickListener)new View$OnClickListener() {
            static {
                Covode.recordClassIndex(4775);
            }
            
            public final void onClick(final View view) {
                final OcrActivity liz = OcrActivity.this;
                liz.LIZLLL ^= true;
                OcrActivity.this.LIZIZ.setTorch(OcrActivity.this.LIZLLL);
                OcrActivity.this.LIZ.setTorch(OcrActivity.this.LIZLLL);
            }
        });
        this.findViewById(2131366195);
        this.LIZ.setKeepScreenOn(true);
        this.findViewById(2131366192).setText((CharSequence)1EK.LIZ.LJII().LIZ("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrremind"));
        this.findViewById(2131366187);
        final 1Er ljii2 = this.LJII;
        final 1En liz2 = this.LIZ;
        if (ljii2.LIZ() && liz2 != null) {
            ((View)liz2).setOnTouchListener((View$OnTouchListener)ljii2.new a());
        }
    }
    
    @Override
    public void onDestroy() {
        7KR.LJ((Activity)this);
        super.onDestroy();
    }
    
    @Override
    public void onPause() {
        7KR.LIZJ((Activity)this);
        super.onPause();
        this.LIZ.LIZLLL();
    }
    
    @Override
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (n == OcrActivity.LJFF) {
            if (array2.length > 0 && array2[0] == 0) {
                this.LIZ.LIZJ();
                return;
            }
            if (!this.isFinishing()) {
                final String liz = 1EK.LIZ.LJII().LIZ("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_usernotice");
                final String liz2 = 1EK.LIZ.LJII().LIZ("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_userok");
                final String liz3 = 1EK.LIZ.LJII().LIZ("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_usercancel");
                final 0VS.a liz4 = new 0VS.a() {
                    static {
                        Covode.recordClassIndex(4776);
                    }
                    
                    @Override
                    public final void LIZ() {
                        OcrActivity.this.finish();
                    }
                    
                    @Override
                    public final void LIZIZ() {
                        final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", OcrActivity.this.getPackageName(), (String)null));
                        final OcrActivity liz = OcrActivity.this;
                        Q0z.LIZ(intent, (Object)liz);
                        0Qu.LIZ(intent, liz);
                        liz.startActivity(intent);
                        OcrActivity.this.LIZJ = true;
                    }
                };
                final 0VS 0vs = new 0VS((Context)this);
                0vs.LIZIZ = liz;
                0vs.LIZJ = liz3;
                0vs.LIZLLL = liz2;
                0vs.LIZ = (0VS.a)liz4;
                0vs.show();
                KN6.LIZ.LIZ((Dialog)0vs);
            }
        }
    }
    
    @Override
    public void onResume() {
        7KR.LIZIZ((Activity)this);
        super.onResume();
        if (Build$VERSION.SDK_INT < 23) {
            this.LIZ.LIZJ();
            return;
        }
        if (06x.LIZ((Context)this, "android.permission.CAMERA") == 0) {
            this.LIZ.LIZJ();
            return;
        }
        if (!this.LJI) {
            144.LIZ(this, new String[] { "android.permission.CAMERA" }, OcrActivity.LJFF);
            this.LJI = true;
            return;
        }
        if (this.LIZJ) {
            this.LIZ(0, 104, "User denied camera permission", null);
        }
    }
    
    @Override
    public void onStart() {
        7KR.LIZ((Activity)this);
        super.onStart();
    }
    
    @Override
    public void onStop() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/7KR.LIZLLL:(Landroid/app/Activity;)V
        //     4: aload_0        
        //     5: invokespecial   X/2Ap.onStop:()V
        //     8: invokestatic    com/bytedance/sysoptimizer/EnterTransitionCrashOptimizer.getContext:()Landroid/content/Context;
        //    11: ifnull          28
        //    14: aload_0        
        //    15: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //    18: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //    21: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    24: invokevirtual   android/view/ViewTreeObserver.dispatchOnPreDraw:()Z
        //    27: pop            
        //    28: aload_0        
        //    29: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //    32: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //    35: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    38: invokevirtual   android/view/ViewTreeObserver.dispatchOnPreDraw:()Z
        //    41: pop            
        //    42: return         
        //    43: astore_1       
        //    44: goto            28
        //    47: astore_1       
        //    48: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     28     43     47     Any
        //  28     42     47     51     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
