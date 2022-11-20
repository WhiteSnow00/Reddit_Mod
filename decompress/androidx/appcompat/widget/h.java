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
        //     7: astore          4
        //     9: getstatic       mg/d0.J:[I
        //    12: astore          5
        //    14: aload           4
        //    16: aload_1        
        //    17: aload           5
        //    19: iload_2        
        //    20: invokestatic    androidx/appcompat/widget/y0.m:(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroidx/appcompat/widget/y0;
        //    23: astore          4
        //    25: aload_0        
        //    26: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //    29: astore          6
        //    31: aload           6
        //    33: aload           6
        //    35: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //    38: aload           5
        //    40: aload_1        
        //    41: aload           4
        //    43: getfield        androidx/appcompat/widget/y0.b:Landroid/content/res/TypedArray;
        //    46: iload_2        
        //    47: invokestatic    a4/l0.k:(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
        //    50: iconst_1       
        //    51: istore_2       
        //    52: aload           4
        //    54: iconst_1       
        //    55: invokevirtual   androidx/appcompat/widget/y0.l:(I)Z
        //    58: ifeq            93
        //    61: aload           4
        //    63: iconst_1       
        //    64: iconst_0       
        //    65: invokevirtual   androidx/appcompat/widget/y0.i:(II)I
        //    68: istore_3       
        //    69: iload_3        
        //    70: ifeq            93
        //    73: aload_0        
        //    74: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //    77: astore_1       
        //    78: aload_1        
        //    79: aload_1        
        //    80: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //    83: iload_3        
        //    84: invokestatic    vl/a.U1:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //    87: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    90: goto            95
        //    93: iconst_0       
        //    94: istore_2       
        //    95: iload_2        
        //    96: ifne            137
        //    99: aload           4
        //   101: iconst_0       
        //   102: invokevirtual   androidx/appcompat/widget/y0.l:(I)Z
        //   105: ifeq            137
        //   108: aload           4
        //   110: iconst_0       
        //   111: iconst_0       
        //   112: invokevirtual   androidx/appcompat/widget/y0.i:(II)I
        //   115: istore_2       
        //   116: iload_2        
        //   117: ifeq            137
        //   120: aload_0        
        //   121: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //   124: astore_1       
        //   125: aload_1        
        //   126: aload_1        
        //   127: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   130: iload_2        
        //   131: invokestatic    vl/a.U1:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //   134: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   137: aload           4
        //   139: iconst_2       
        //   140: invokevirtual   androidx/appcompat/widget/y0.l:(I)Z
        //   143: ifeq            159
        //   146: aload_0        
        //   147: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //   150: aload           4
        //   152: iconst_2       
        //   153: invokevirtual   androidx/appcompat/widget/y0.b:(I)Landroid/content/res/ColorStateList;
        //   156: invokestatic    e4/b.c:(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
        //   159: aload           4
        //   161: iconst_3       
        //   162: invokevirtual   androidx/appcompat/widget/y0.l:(I)Z
        //   165: ifeq            186
        //   168: aload_0        
        //   169: getfield        androidx/appcompat/widget/h.a:Landroid/widget/CompoundButton;
        //   172: aload           4
        //   174: iconst_3       
        //   175: iconst_m1      
        //   176: invokevirtual   androidx/appcompat/widget/y0.h:(II)I
        //   179: aconst_null    
        //   180: invokestatic    androidx/appcompat/widget/d0.c:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
        //   183: invokestatic    e4/b.d:(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
        //   186: aload           4
        //   188: invokevirtual   androidx/appcompat/widget/y0.n:()V
        //   191: return         
        //   192: astore_1       
        //   193: aload           4
        //   195: invokevirtual   androidx/appcompat/widget/y0.n:()V
        //   198: aload_1        
        //   199: athrow         
        //   200: astore_1       
        //   201: goto            93
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  52     69     192    200    Any
        //  73     90     200    204    Landroid/content/res/Resources$NotFoundException;
        //  73     90     192    200    Any
        //  99     116    192    200    Any
        //  120    137    192    200    Any
        //  137    159    192    200    Any
        //  159    186    192    200    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0093:
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
