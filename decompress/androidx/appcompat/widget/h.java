// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import r3.a;
import e4.c;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.CompoundButton;

public final class h
{
    public final CompoundButton a;
    public ColorStateList b;
    public PorterDuff$Mode c;
    public boolean d;
    public boolean e;
    public boolean f;
    
    public h(final CompoundButton a) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = a;
    }
    
    public final void a() {
        final Drawable a = e4.c.a(this.a);
        if (a != null && (this.d || this.e)) {
            final Drawable mutate = a.mutate();
            if (this.d) {
                r3.a.b.h(mutate, this.b);
            }
            if (this.e) {
                r3.a.b.i(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(((View)this.a).getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }
    
    public final void b(final AttributeSet p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //     4: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //     7: astore_3       
        //     8: getstatic       gn/a.c0:[I
        //    11: astore          4
        //    13: aload_3        
        //    14: aload_1        
        //    15: aload           4
        //    17: iload_2        
        //    18: invokestatic    androidx/appcompat/widget/z0.m:(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroidx/appcompat/widget/z0;
        //    21: astore_3       
        //    22: aload_0        
        //    23: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //    26: astore          5
        //    28: aload           5
        //    30: aload           5
        //    32: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //    35: aload           4
        //    37: aload_1        
        //    38: aload_3        
        //    39: getfield        androidx/appcompat/widget/z0.b:Landroid/content/res/TypedArray;
        //    42: iload_2        
        //    43: invokestatic    a4/p0.k:(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
        //    46: iconst_1       
        //    47: istore_2       
        //    48: aload_3        
        //    49: iconst_1       
        //    50: invokevirtual   androidx/appcompat/widget/z0.l:(I)Z
        //    53: ifeq            90
        //    56: aload_3        
        //    57: iconst_1       
        //    58: iconst_0       
        //    59: invokevirtual   androidx/appcompat/widget/z0.i:(II)I
        //    62: istore          6
        //    64: iload           6
        //    66: ifeq            90
        //    69: aload_0        
        //    70: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //    73: astore_1       
        //    74: aload_1        
        //    75: aload_1        
        //    76: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //    79: iload           6
        //    81: invokestatic    eg/n0.L:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //    84: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    87: goto            92
        //    90: iconst_0       
        //    91: istore_2       
        //    92: iload_2        
        //    93: ifne            132
        //    96: aload_3        
        //    97: iconst_0       
        //    98: invokevirtual   androidx/appcompat/widget/z0.l:(I)Z
        //   101: ifeq            132
        //   104: aload_3        
        //   105: iconst_0       
        //   106: iconst_0       
        //   107: invokevirtual   androidx/appcompat/widget/z0.i:(II)I
        //   110: istore_2       
        //   111: iload_2        
        //   112: ifeq            132
        //   115: aload_0        
        //   116: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //   119: astore_1       
        //   120: aload_1        
        //   121: aload_1        
        //   122: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   125: iload_2        
        //   126: invokestatic    eg/n0.L:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //   129: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   132: aload_3        
        //   133: iconst_2       
        //   134: invokevirtual   androidx/appcompat/widget/z0.l:(I)Z
        //   137: ifeq            152
        //   140: aload_0        
        //   141: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //   144: aload_3        
        //   145: iconst_2       
        //   146: invokevirtual   androidx/appcompat/widget/z0.b:(I)Landroid/content/res/ColorStateList;
        //   149: invokestatic    e4/b.c:(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
        //   152: aload_3        
        //   153: iconst_3       
        //   154: invokevirtual   androidx/appcompat/widget/z0.l:(I)Z
        //   157: ifeq            177
        //   160: aload_0        
        //   161: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //   164: aload_3        
        //   165: iconst_3       
        //   166: iconst_m1      
        //   167: invokevirtual   androidx/appcompat/widget/z0.h:(II)I
        //   170: aconst_null    
        //   171: invokestatic    androidx/appcompat/widget/d0.c:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
        //   174: invokestatic    e4/b.d:(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
        //   177: aload_3        
        //   178: invokevirtual   androidx/appcompat/widget/z0.n:()V
        //   181: return         
        //   182: astore_1       
        //   183: aload_3        
        //   184: invokevirtual   androidx/appcompat/widget/z0.n:()V
        //   187: aload_1        
        //   188: athrow         
        //   189: astore_1       
        //   190: goto            90
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  48     64     182    189    Any
        //  69     87     189    193    Landroid/content/res/Resources$NotFoundException;
        //  69     87     182    189    Any
        //  96     111    182    189    Any
        //  115    132    182    189    Any
        //  132    152    182    189    Any
        //  152    177    182    189    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
