// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MotionEvent;
import java.util.Iterator;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.graphics.Paint;
import java.util.List;
import android.view.View;

public final class 102 extends View
{
    public List<? extends 0zr<? extends 106>> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final Paint LJ;
    public 104 LJFF;
    public final Map<0zr<? extends 106>, Float> LJI;
    public final 5DO LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    
    static {
        Covode.recordClassIndex(10655);
    }
    
    public 102(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 102(final Context context, final AttributeSet set, final char c) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: iconst_0       
        //     8: invokespecial   android/view/View.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: sipush          8527
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: aload_1        
        //    19: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    22: ldc             2131166231
        //    24: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    27: putfield        X/102.LIZIZ:I
        //    30: aload_0        
        //    31: aload_1        
        //    32: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    35: ldc             2131166230
        //    37: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    40: putfield        X/102.LIZJ:I
        //    43: aload_0        
        //    44: iconst_m1      
        //    45: putfield        X/102.LIZLLL:I
        //    48: aload_1        
        //    49: aload_2        
        //    50: iconst_3       
        //    51: newarray        I
        //    53: dup            
        //    54: iconst_0       
        //    55: ldc             2130969093
        //    57: iastore        
        //    58: dup            
        //    59: iconst_1       
        //    60: ldc             2130969094
        //    62: iastore        
        //    63: dup            
        //    64: iconst_2       
        //    65: ldc             2130971642
        //    67: iastore        
        //    68: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //    71: astore_1       
        //    72: aload_1        
        //    73: ldc             ""
        //    75: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    78: aload_1        
        //    79: iconst_2       
        //    80: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //    83: ifeq            97
        //    86: aload_0        
        //    87: aload_1        
        //    88: iconst_2       
        //    89: bipush          8
        //    91: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //    94: putfield        X/102.LIZLLL:I
        //    97: aload_1        
        //    98: iconst_0       
        //    99: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   102: ifeq            115
        //   105: aload_0        
        //   106: aload_1        
        //   107: iconst_0       
        //   108: iconst_0       
        //   109: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //   112: putfield        X/102.LIZJ:I
        //   115: aload_0        
        //   116: aload_1        
        //   117: iconst_1       
        //   118: aload_0        
        //   119: getfield        X/102.LIZIZ:I
        //   122: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //   125: putfield        X/102.LIZIZ:I
        //   128: aload_1        
        //   129: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   132: aload_0        
        //   133: new             Landroid/graphics/Paint;
        //   136: dup            
        //   137: iconst_1       
        //   138: invokespecial   android/graphics/Paint.<init>:(I)V
        //   141: putfield        X/102.LJ:Landroid/graphics/Paint;
        //   144: aload_0        
        //   145: new             Ljava/util/LinkedHashMap;
        //   148: dup            
        //   149: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   152: putfield        X/102.LJI:Ljava/util/Map;
        //   155: aload_0        
        //   156: getstatic       X/2AM.LIZ:LX/2AM;
        //   159: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   162: putfield        X/102.LJII:LX/5DO;
        //   165: sipush          8527
        //   168: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   171: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final void LIZ(final boolean b, final List<BadgeStruct> list, final User user, final int n, final SRS<? super BadgeStruct, 2P9> srs) {
        public final class 2AN extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 102 LIZ;
            
            static {
                Covode.recordClassIndex(10657);
            }
            
            public 2AN(final 102 liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_2        
        //     5: ifnonnull       9
        //     8: return         
        //     9: aload_0        
        //    10: invokevirtual   X/102.getMBadgeManager:()LX/0zy;
        //    13: iload_1        
        //    14: aload_0        
        //    15: invokevirtual   X/102.getContext:()Landroid/content/Context;
        //    18: aload_2        
        //    19: new             LX/2AN;
        //    22: dup            
        //    23: aload_0        
        //    24: invokespecial   X/2AN.<init>:(LX/102;)V
        //    27: aload           5
        //    29: iload           4
        //    31: aload_3        
        //    32: invokevirtual   X/0zy.LIZ:(ZLandroid/content/Context;Ljava/util/List;LX/QgG;LX/SRS;ILcom/bytedance/android/live/base/model/user/User;)V
        //    35: return         
        //    Signature:
        //  (ZLjava/util/List<Lcom/bytedance/android/live/base/model/user/BadgeStruct;>;Lcom/bytedance/android/live/base/model/user/User;ILX/SRS<-Lcom/bytedance/android/live/base/model/user/BadgeStruct;LX/2P9;>;)V
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
    
    public final boolean getClickAble() {
        return this.LJIIJ;
    }
    
    public final float getDownX() {
        return this.LJIIIZ;
    }
    
    public final 0zy getMBadgeManager() {
        return (0zy)this.LJII.getValue();
    }
    
    public final int getTypographyName() {
        return this.LIZLLL;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    public final void onDetachedFromWindow() {
        this.getMBadgeManager().LIZIZ();
        super.onDetachedFromWindow();
    }
    
    public final void onDraw(final Canvas canvas) {
        MethodCollector.i(8521);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.o(8521);
            return;
        }
        final List<? extends 0zr<? extends 106>> liz = this.LIZ;
        if (liz != null) {
            final List ljiil = Qsi.LJIIL((Iterable)liz);
            if (ljiil != null) {
                final boolean empty = ljiil.isEmpty();
                int n = 1;
                if (empty ^ true) {
                    if (this.LJIIIIZZ == 0) {
                        MethodCollector.o(8521);
                        return;
                    }
                    final int layoutDirection = this.getLayoutDirection();
                    int i = 0;
                    if (layoutDirection != 1) {
                        n = 0;
                    }
                    final int ljiiiizz = this.LJIIIIZZ;
                    int n2 = 0;
                    while (i < ljiiiizz) {
                        final 0zr 0zr = ljiil.get(i);
                        final int liziz = 0zr.LJII().LIZIZ(this.LJ);
                        int n3 = n2;
                        if (i > 0) {
                            n3 = n2 + this.LIZIZ;
                        }
                        canvas.save();
                        float n4;
                        if (n != 0) {
                            n4 = this.getWidth() - (float)n3 - liziz;
                        }
                        else {
                            n4 = (float)n3;
                        }
                        canvas.translate(n4, 0.0f);
                        if (this.LJI.get(0zr) == null) {
                            this.LJI.put(0zr, n4);
                        }
                        0zr.LJII().LIZIZ(canvas, this.LJ);
                        canvas.restore();
                        n2 = n3 + liziz;
                        ++i;
                    }
                    MethodCollector.o(8521);
                    return;
                }
            }
        }
        MethodCollector.o(8521);
    }
    
    public final void onMeasure(int lizj, int min) {
        MethodCollector.i(8518);
        super.onMeasure(lizj, min);
        final int size = View$MeasureSpec.getSize(lizj);
        final int mode = View$MeasureSpec.getMode(lizj);
        final int size2 = View$MeasureSpec.getSize(min);
        final int mode2 = View$MeasureSpec.getMode(min);
        final List<? extends 0zr<? extends 106>> liz = this.LIZ;
        final int n = 0;
        final int n2 = 0;
        Label_0279: {
            if (liz != null && (liz.isEmpty() ^ true)) {
                final Iterator iterator = liz.iterator();
                min = 0;
                lizj = 0;
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    if (min < 0) {
                        Ey9.LIZ();
                    }
                    final int n3 = lizj += ((0zr<106>)next).LJII().LIZIZ(this.LJ);
                    if (min > 0) {
                        lizj = n3 + this.LIZIZ;
                    }
                    ++min;
                }
                if (mode == 1073741824) {
                    min = size;
                }
                else if (mode == Integer.MIN_VALUE) {
                    min = Math.min(lizj, size);
                }
                else {
                    min = lizj;
                }
                if (mode2 == 1073741824) {
                    lizj = size2;
                }
                else {
                    lizj = this.LIZJ;
                }
                this.LJIIIIZZ = liz.size();
                final Iterator iterator2 = liz.iterator();
                int ljiiiizz = 0;
                int n4 = 0;
                while (iterator2.hasNext()) {
                    final Object next2 = iterator2.next();
                    if (ljiiiizz < 0) {
                        Ey9.LIZ();
                    }
                    final int n5 = n4 += ((0zr<106>)next2).LJII().LIZIZ(this.LJ);
                    if (ljiiiizz > 0) {
                        n4 = n5 + this.LIZIZ;
                    }
                    if (n4 > min) {
                        this.LJIIIIZZ = ljiiiizz;
                        break;
                    }
                    ++ljiiiizz;
                }
                final int ljiiiizz2 = this.LJIIIIZZ;
                if (ljiiiizz2 != 0) {
                    min = 0;
                    for (int i = n; i < ljiiiizz2; ++i) {
                        final int n6 = min += ((0zr<106>)liz.get(i)).LJII().LIZIZ(this.LJ);
                        if (i > 0) {
                            min = n6 + this.LIZIZ;
                        }
                    }
                    break Label_0279;
                }
            }
            lizj = 0;
            min = n2;
        }
        this.setMeasuredDimension(min, lizj);
        MethodCollector.o(8518);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final 0zr<? extends 106> 0zr = null;
        if (motionEvent != null) {
            final Integer value = motionEvent.getAction();
            if (value != null) {
                if (value == 0) {
                    this.LJIIIZ = motionEvent.getX();
                    this.LJIIJ = true;
                }
                else if (value != null) {
                    if (value == 2 || value == 3) {
                        this.LJIIJ = false;
                    }
                    else if (value == 1) {
                        this.LJIIJ = true;
                        final float x = motionEvent.getX();
                        final Map<0zr<? extends 106>, Float> lji = this.LJI;
                        if (lji != null) {
                            if (!lji.isEmpty()) {
                                final Iterator<Map.Entry<0zr<? extends 106>, Float>> iterator = this.LJI.entrySet().iterator();
                                0zr<? extends 106> 0zr2 = 0zr;
                                while (iterator.hasNext()) {
                                    final Map.Entry<0zr, V> entry = (Map.Entry<0zr, V>)iterator.next();
                                    final 0zr 0zr3 = entry.getKey();
                                    if (x > ((Number)entry.getValue()).floatValue()) {
                                        0zr2 = 0zr3;
                                    }
                                }
                                if (0zr2 != null && this.LJIIJ) {
                                    final 104 ljff = this.LJFF;
                                    if (ljff != null) {
                                        ljff.LIZ(0zr2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return this.LJIIJ;
    }
    
    public final boolean performClick() {
        return super.performClick();
    }
    
    public final void setBadges(final List<0zr<? extends 106>> liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        if ((liz.isEmpty() ^ true) && liz != null) {
            final Iterator<Object> iterator = liz.iterator();
            while (iterator.hasNext()) {
                final 106 ljii = iterator.next().LJII();
                final int lizlll = this.LIZLLL;
                if (lizlll != -1) {
                    ljii.LJIIJ = lizlll;
                }
                final int lizj = this.LIZJ;
                if (lizj != 0) {
                    ljii.LJIIIZ = lizj;
                }
            }
        }
        this.LJIIIIZZ = 0;
        this.requestLayout();
    }
    
    public final void setClickAble(final boolean ljiij) {
        this.LJIIJ = ljiij;
    }
    
    public final void setDownX(final float ljiiiz) {
        this.LJIIIZ = ljiiiz;
    }
    
    public final void setOnBadgeClickListener(final 104 ljff) {
        CTM.LIZ((Object)ljff);
        this.LJFF = ljff;
    }
    
    public final void setTypographyName(final int lizlll) {
        this.LIZLLL = lizlll;
    }
}
