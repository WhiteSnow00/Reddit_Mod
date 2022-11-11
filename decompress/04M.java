// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.LayerDrawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuffColorFilter;
import com.bytedance.covode.number.Covode;
import android.graphics.PorterDuff$Mode;

public final class 04M
{
    public static final PorterDuff$Mode LIZ;
    public static 04M LIZIZ;
    public 03r LIZJ;
    
    static {
        Covode.recordClassIndex(525);
        LIZ = PorterDuff$Mode.SRC_IN;
    }
    
    public static PorterDuffColorFilter LIZ(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (04M.class) {
            return 03r.LIZ(n, porterDuff$Mode);
        }
    }
    
    public static void LIZ() {
        public final class 13b implements e
        {
            public final int[] LIZ;
            public final int[] LIZIZ;
            public final int[] LIZJ;
            public final int[] LIZLLL;
            public final int[] LJ;
            public final int[] LJFF;
            
            static {
                Covode.recordClassIndex(526);
            }
            
            public 13b() {
                this.LIZ = new int[] { 2131230820, 2131230818, 2131230737 };
                this.LIZIZ = new int[] { 2131230761, 2131230802, 2131230768, 2131230763, 2131230764, 2131230767, 2131230766 };
                this.LIZJ = new int[] { 2131230817, 2131230819, 2131230754, 2131230810, 2131230811, 2131230813, 2131230815, 2131230812, 2131230814, 2131230816 };
                this.LIZLLL = new int[] { 2131230792, 2131230752, 2131230791 };
                this.LJ = new int[] { 2131230808, 2131230821 };
                this.LJFF = new int[] { 2131230740, 2131230746, 2131230741, 2131230747 };
            }
            
            private void LIZ(final Drawable drawable, final int n, final PorterDuff$Mode porterDuff$Mode) {
                Drawable mutate = drawable;
                if (04a.LIZJ(drawable)) {
                    mutate = drawable.mutate();
                }
                PorterDuff$Mode liz;
                if ((liz = porterDuff$Mode) == null) {
                    liz = 04M.LIZ;
                }
                mutate.setColorFilter((ColorFilter)04M.LIZ(n, liz));
            }
            
            private boolean LIZ(final int[] array, final int n) {
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (array[i] == n) {
                        return true;
                    }
                }
                return false;
            }
            
            private ColorStateList LIZIZ(final Context context, final int n) {
                final int liz = 041.LIZ(context, 2130969305);
                return new ColorStateList(new int[][] { 041.LIZ, 041.LIZJ, 041.LIZIZ, 041.LJ }, new int[] { 041.LIZJ(context, 2130969303), 08O.LIZ(liz, n), 08O.LIZ(liz, n), n });
            }
            
            @Override
            public final ColorStateList LIZ(final Context context, final int n) {
                if (n == 2131230757) {
                    return 01s.LIZ(context, 2131099784);
                }
                if (n == 2131230807) {
                    return 01s.LIZ(context, 2131099787);
                }
                if (n == 2131230806) {
                    final int[][] array = new int[3][];
                    final int[] array2 = new int[3];
                    final ColorStateList liziz = 041.LIZIZ(context, 2130969312);
                    if (liziz != null && liziz.isStateful()) {
                        array[0] = 041.LIZ;
                        array2[0] = liziz.getColorForState(array[0], 0);
                        array[1] = 041.LIZLLL;
                        array2[1] = 041.LIZ(context, 2130969304);
                        array[2] = 041.LJ;
                        array2[2] = liziz.getDefaultColor();
                    }
                    else {
                        array[0] = 041.LIZ;
                        array2[0] = 041.LIZJ(context, 2130969312);
                        array[1] = 041.LIZLLL;
                        array2[1] = 041.LIZ(context, 2130969304);
                        array[2] = 041.LJ;
                        array2[2] = 041.LIZ(context, 2130969312);
                    }
                    return new ColorStateList(array, array2);
                }
                if (n == 2131230745) {
                    return this.LIZIZ(context, 041.LIZ(context, 2130969303));
                }
                if (n == 2131230739) {
                    return this.LIZIZ(context, 0);
                }
                if (n == 2131230744) {
                    return this.LIZIZ(context, 041.LIZ(context, 2130969301));
                }
                if (n == 2131230804 || n == 2131230805) {
                    return 01s.LIZ(context, 2131099786);
                }
                if (this.LIZ(this.LIZIZ, n)) {
                    return 041.LIZIZ(context, 2130969306);
                }
                if (this.LIZ(this.LJ, n)) {
                    return 01s.LIZ(context, 2131099783);
                }
                if (this.LIZ(this.LJFF, n)) {
                    return 01s.LIZ(context, 2131099782);
                }
                if (n == 2131230801) {
                    return 01s.LIZ(context, 2131099785);
                }
                return null;
            }
            
            @Override
            public final PorterDuff$Mode LIZ(final int n) {
                PorterDuff$Mode multiply;
                if (n == 2131230806) {
                    multiply = PorterDuff$Mode.MULTIPLY;
                }
                else {
                    multiply = null;
                }
                return multiply;
            }
            
            @Override
            public final Drawable LIZ(final 03r 03r, final Context context, final int n) {
                if (n == 2131230753) {
                    return (Drawable)new LayerDrawable(new Drawable[] { 03r.LIZ(context, 2131230752), 03r.LIZ(context, 2131230754) });
                }
                return null;
            }
            
            @Override
            public final boolean LIZ(final Context context, final int n, final Drawable drawable) {
                if (n == 2131230803) {
                    final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                    this.LIZ(layerDrawable.findDrawableByLayerId(16908288), 041.LIZ(context, 2130969306), 04M.LIZ);
                    this.LIZ(layerDrawable.findDrawableByLayerId(16908303), 041.LIZ(context, 2130969306), 04M.LIZ);
                    this.LIZ(layerDrawable.findDrawableByLayerId(16908301), 041.LIZ(context, 2130969304), 04M.LIZ);
                    return true;
                }
                if (n == 2131230794 || n == 2131230793 || n == 2131230795) {
                    final LayerDrawable layerDrawable2 = (LayerDrawable)drawable;
                    this.LIZ(layerDrawable2.findDrawableByLayerId(16908288), 041.LIZJ(context, 2130969306), 04M.LIZ);
                    this.LIZ(layerDrawable2.findDrawableByLayerId(16908303), 041.LIZ(context, 2130969304), 04M.LIZ);
                    this.LIZ(layerDrawable2.findDrawableByLayerId(16908301), 041.LIZ(context, 2130969304), 04M.LIZ);
                    return true;
                }
                return false;
            }
            
            @Override
            public final boolean LIZIZ(final Context context, int n, final Drawable drawable) {
                PorterDuff$Mode porterDuff$Mode = 04M.LIZ;
                final boolean liz = this.LIZ(this.LIZ, n);
                final int n2 = 16842801;
                int round = 0;
                Label_0031: {
                    if (liz) {
                        n = 2130969306;
                    }
                    else if (this.LIZ(this.LIZJ, n)) {
                        n = 2130969304;
                    }
                    else if (this.LIZ(this.LIZLLL, n)) {
                        porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                        n = n2;
                    }
                    else {
                        if (n == 2131230780) {
                            n = 16842800;
                            round = Math.round(40.8f);
                            break Label_0031;
                        }
                        if (n != 2131230756) {
                            return false;
                        }
                        n = n2;
                    }
                    round = -1;
                }
                Drawable mutate = drawable;
                if (04a.LIZJ(drawable)) {
                    mutate = drawable.mutate();
                }
                mutate.setColorFilter((ColorFilter)04M.LIZ(041.LIZ(context, n), porterDuff$Mode));
                if (round != -1) {
                    mutate.setAlpha(round);
                }
                return true;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       X/04M.LIZIZ:LX/04M;
        //     6: ifnonnull       48
        //     9: new             LX/04M;
        //    12: astore_0       
        //    13: aload_0        
        //    14: invokespecial   X/04M.<init>:()V
        //    17: aload_0        
        //    18: putstatic       X/04M.LIZIZ:LX/04M;
        //    21: aload_0        
        //    22: invokestatic    X/03r.LIZ:()LX/03r;
        //    25: putfield        X/04M.LIZJ:LX/03r;
        //    28: getstatic       X/04M.LIZIZ:LX/04M;
        //    31: getfield        X/04M.LIZJ:LX/03r;
        //    34: astore_0       
        //    35: new             LX/13b;
        //    38: astore_1       
        //    39: aload_1        
        //    40: invokespecial   X/13b.<init>:()V
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokevirtual   X/03r.LIZ:(LX/03q;)V
        //    48: ldc             LX/04M;.class
        //    50: monitorexit    
        //    51: return         
        //    52: astore_0       
        //    53: ldc             LX/04M;.class
        //    55: monitorexit    
        //    56: aload_0        
        //    57: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  3      48     52     58     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformSynchronized(AstMethodBodyBuilder.java:523)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:360)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    public static 04M LIZIZ() {
        synchronized (04M.class) {
            if (04M.LIZIZ == null) {
                LIZ();
            }
            return 04M.LIZIZ;
        }
    }
    
    public final Drawable LIZ(final Context context, final int n) {
        synchronized (this) {
            return this.LIZJ.LIZ(context, n);
        }
    }
    
    public final void LIZ(final Context context) {
        synchronized (this) {
            this.LIZJ.LIZ(context);
        }
    }
    
    public final Drawable LIZIZ(final Context context, final int n) {
        synchronized (this) {
            return this.LIZJ.LIZ(context, n, true);
        }
    }
    
    public final ColorStateList LIZJ(final Context context, final int n) {
        synchronized (this) {
            return this.LIZJ.LIZIZ(context, n);
        }
    }
}
