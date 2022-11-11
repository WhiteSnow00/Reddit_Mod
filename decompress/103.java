// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.graphics.Canvas;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

public final class 103 extends View
{
    public 104 LIZ;
    public boolean LIZIZ;
    public List<0zr<? extends 106>> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final ArrayList<105> LJFF;
    public 105 LJI;
    public int LJII;
    public final Paint LJIIIIZZ;
    public int LJIIIZ;
    public final 5DO LJIIJ;
    public final Map<105, Float> LJIIJJI;
    public boolean LJIIL;
    
    static {
        Covode.recordClassIndex(10658);
    }
    
    public 103(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 103(final Context context, final AttributeSet set, final char c) {
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
        //    11: sipush          9268
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: ldc             8.0
        //    20: invokestatic    X/0cB.LIZ:(F)I
        //    23: putfield        X/103.LIZLLL:I
        //    26: aload_0        
        //    27: ldc             4.0
        //    29: invokestatic    X/0cB.LIZ:(F)I
        //    32: putfield        X/103.LJ:I
        //    35: aload_0        
        //    36: new             Ljava/util/ArrayList;
        //    39: dup            
        //    40: invokespecial   java/util/ArrayList.<init>:()V
        //    43: putfield        X/103.LJFF:Ljava/util/ArrayList;
        //    46: aload_0        
        //    47: new             Landroid/graphics/Paint;
        //    50: dup            
        //    51: iconst_1       
        //    52: invokespecial   android/graphics/Paint.<init>:(I)V
        //    55: putfield        X/103.LJIIIIZZ:Landroid/graphics/Paint;
        //    58: aload_0        
        //    59: ldc             2147483647
        //    61: putfield        X/103.LJIIIZ:I
        //    64: aload_0        
        //    65: getstatic       X/2AO.LIZ:LX/2AO;
        //    68: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    71: putfield        X/103.LJIIJ:LX/5DO;
        //    74: aload_0        
        //    75: new             Ljava/util/LinkedHashMap;
        //    78: dup            
        //    79: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    82: putfield        X/103.LJIIJJI:Ljava/util/Map;
        //    85: sipush          9268
        //    88: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    91: return         
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
    
    private void LIZ() {
        final 105 lji = this.LJI;
        if (lji != null) {
            lji.LIZ = this.LJII;
        }
        if (this.LJI != null && this.LJFF.size() < this.LJIIIZ) {
            final ArrayList<105> ljff = this.LJFF;
            final 105 lji2 = this.LJI;
            if (lji2 == null) {
                n.LIZIZ();
            }
            ljff.add(lji2);
        }
        this.LJII = 0;
        final Context context = this.getContext();
        n.LIZIZ((Object)context, "");
        this.LJI = new 105(context);
    }
    
    public final void LIZ(final boolean b, final List<BadgeStruct> list, final User user, final SRS<? super BadgeStruct, 2P9> srs) {
        public final class 2AQ extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 103 LIZ;
            
            static {
                Covode.recordClassIndex(10661);
            }
            
            public 2AQ(final 103 liz) {
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
        //    10: invokevirtual   X/103.getMBadgeManager:()LX/0zy;
        //    13: iload_1        
        //    14: aload_0        
        //    15: invokevirtual   X/103.getContext:()Landroid/content/Context;
        //    18: aload_2        
        //    19: new             LX/2AQ;
        //    22: dup            
        //    23: aload_0        
        //    24: invokespecial   X/2AQ.<init>:(LX/103;)V
        //    27: aload           4
        //    29: iconst_0       
        //    30: aload_3        
        //    31: invokevirtual   X/0zy.LIZ:(ZLandroid/content/Context;Ljava/util/List;LX/QgG;LX/SRS;ILcom/bytedance/android/live/base/model/user/User;)V
        //    34: return         
        //    Signature:
        //  (ZLjava/util/List<Lcom/bytedance/android/live/base/model/user/BadgeStruct;>;Lcom/bytedance/android/live/base/model/user/User;LX/SRS<-Lcom/bytedance/android/live/base/model/user/BadgeStruct;LX/2P9;>;)V
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
    
    public final boolean getDarkMode() {
        return this.LIZIZ;
    }
    
    public final 0zy getMBadgeManager() {
        return (0zy)this.LJIIJ.getValue();
    }
    
    public final void onDetachedFromWindow() {
        this.getMBadgeManager().LIZIZ();
        super.onDetachedFromWindow();
    }
    
    public final void onDraw(final Canvas canvas) {
        MethodCollector.i(9263);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.o(9263);
            return;
        }
        final Iterator<Object> iterator = this.LJFF.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final 105 next = iterator.next();
            if (n < 0) {
                Ey9.LIZ();
            }
            final 105 105 = next;
            final float n2 = n * (float)(this.LIZLLL + 105.LIZIZ);
            this.LJIIJJI.put(105, n2);
            int n3;
            if (this.getLayoutDirection() == 1) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            final int paddingLeft = this.getPaddingLeft();
            final int measuredWidth = this.getMeasuredWidth();
            final int paddingLeft2 = this.getPaddingLeft();
            final int paddingRight = this.getPaddingRight();
            final int lj = this.LJ;
            final Paint ljiiiizz = this.LJIIIIZZ;
            CTM.LIZ((Object)canvas, (Object)ljiiiizz);
            List<0zr<? extends 106>> list = 105.LIZJ;
            if (n3 != 0) {
                list = Qsi.LJIIIIZZ((Iterable)list);
            }
            int n4 = paddingLeft + (measuredWidth - paddingLeft2 - paddingRight - 105.LIZ) / 2;
            final Iterator<0zr> iterator2 = list.iterator();
            int n5 = 0;
            while (iterator2.hasNext()) {
                final 0zr next2 = iterator2.next();
                if (n5 < 0) {
                    Ey9.LIZ();
                }
                final 0zr 0zr = next2;
                canvas.save();
                int n6;
                if (n5 != 0) {
                    n6 = lj;
                }
                else {
                    n6 = 0;
                }
                final int n7 = n4 + n6;
                final float n8 = (float)n7;
                canvas.translate(n8, n2);
                105.LIZLLL.put(0zr, n8);
                0zr.LJII().LIZIZ(canvas, ljiiiizz);
                final int liziz = 0zr.LJII().LIZIZ(ljiiiizz);
                n4 = n7 + liziz;
                105.LJ.put(0zr, liziz);
                canvas.restore();
                ++n5;
            }
            final int ljiiiz = this.LJIIIZ;
            ++n;
        }
        MethodCollector.o(9263);
    }
    
    public final void onMeasure(final int n, final int n2) {
        MethodCollector.i(9259);
        super.onMeasure(n, n2);
        final int size = View$MeasureSpec.getSize(n);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        this.LJFF.clear();
        final Context context = this.getContext();
        n.LIZIZ((Object)context, "");
        this.LJI = new 105(context);
        int n3 = 0;
        this.LJII = 0;
        final List<0zr<? extends 106>> lizj = this.LIZJ;
        if (lizj != null) {
            for (final 0zr 0zr : lizj) {
                final int n4 = 0zr.LJII().LIZIZ(this.LJIIIIZZ) + this.LJ;
                if (this.LJII + n4 > size - paddingLeft - paddingRight) {
                    this.LIZ();
                }
                final int n5 = this.LJII + n4;
                this.LJII = n5;
                final 105 lji = this.LJI;
                if (lji != null) {
                    lji.LIZ = n5;
                }
                final 105 lji2 = this.LJI;
                if (lji2 != null) {
                    CTM.LIZ((Object)0zr);
                    lji2.LIZJ.add(0zr);
                }
            }
        }
        final 105 lji3 = this.LJI;
        if (lji3 != null && !this.LJFF.contains(lji3)) {
            this.LIZ();
        }
        final Iterator<Object> iterator2 = this.LJFF.iterator();
        int n6 = 0;
        while (iterator2.hasNext()) {
            final 105 next = iterator2.next();
            if (n6 < 0) {
                Ey9.LIZ();
            }
            n3 += next.LIZIZ;
            ++n6;
        }
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), View.resolveSize(n3 + (this.LIZLLL * (this.LJFF.size() - 1) + this.getPaddingTop() + this.getPaddingBottom()), n2));
        MethodCollector.o(9259);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        public final class 2AP extends F5g implements SRS<0zr<? extends 106>, 2P9>
        {
            public final /* synthetic */ 103 LIZ;
            
            static {
                Covode.recordClassIndex(10660);
            }
            
            public 2AP(final 103 liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_1        
        //     3: ifnull          18
        //     6: aload_1        
        //     7: invokevirtual   android/view/MotionEvent.getAction:()I
        //    10: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    13: astore_3       
        //    14: aload_3        
        //    15: ifnonnull       23
        //    18: aload_0        
        //    19: getfield        X/103.LJIIL:Z
        //    22: ireturn        
        //    23: aload_3        
        //    24: invokevirtual   java/lang/Integer.intValue:()I
        //    27: ifne            43
        //    30: aload_1        
        //    31: invokevirtual   android/view/MotionEvent.getX:()F
        //    34: pop            
        //    35: aload_0        
        //    36: iconst_1       
        //    37: putfield        X/103.LJIIL:Z
        //    40: goto            18
        //    43: aload_3        
        //    44: ifnonnull       50
        //    47: goto            18
        //    50: aload_3        
        //    51: invokevirtual   java/lang/Integer.intValue:()I
        //    54: iconst_2       
        //    55: if_icmpeq       66
        //    58: aload_3        
        //    59: invokevirtual   java/lang/Integer.intValue:()I
        //    62: iconst_3       
        //    63: if_icmpne       74
        //    66: aload_0        
        //    67: iconst_0       
        //    68: putfield        X/103.LJIIL:Z
        //    71: goto            18
        //    74: aload_3        
        //    75: invokevirtual   java/lang/Integer.intValue:()I
        //    78: iconst_1       
        //    79: if_icmpne       18
        //    82: aload_0        
        //    83: iconst_1       
        //    84: putfield        X/103.LJIIL:Z
        //    87: aload_1        
        //    88: invokevirtual   android/view/MotionEvent.getY:()F
        //    91: fstore          4
        //    93: aload_0        
        //    94: getfield        X/103.LJIIJJI:Ljava/util/Map;
        //    97: astore_3       
        //    98: aload_3        
        //    99: ifnull          18
        //   102: aload_3        
        //   103: invokeinterface java/util/Map.isEmpty:()Z
        //   108: ifeq            114
        //   111: goto            18
        //   114: aload_0        
        //   115: getfield        X/103.LJIIJJI:Ljava/util/Map;
        //   118: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   123: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   128: astore          5
        //   130: aconst_null    
        //   131: astore_3       
        //   132: aload           5
        //   134: invokeinterface java/util/Iterator.hasNext:()Z
        //   139: ifeq            191
        //   142: aload           5
        //   144: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   149: checkcast       Ljava/util/Map$Entry;
        //   152: astore          6
        //   154: aload           6
        //   156: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   161: checkcast       LX/105;
        //   164: astore          7
        //   166: fload           4
        //   168: aload           6
        //   170: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   175: checkcast       Ljava/lang/Number;
        //   178: invokevirtual   java/lang/Number.floatValue:()F
        //   181: fcmpl          
        //   182: ifle            132
        //   185: aload           7
        //   187: astore_3       
        //   188: goto            132
        //   191: aload_3        
        //   192: ifnull          18
        //   195: aload_0        
        //   196: getfield        X/103.LJIIL:Z
        //   199: ifeq            18
        //   202: aload_1        
        //   203: invokevirtual   android/view/MotionEvent.getX:()F
        //   206: fstore          8
        //   208: new             LX/2AP;
        //   211: dup            
        //   212: aload_0        
        //   213: invokespecial   X/2AP.<init>:(LX/103;)V
        //   216: astore          7
        //   218: aload           7
        //   220: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //   223: aload_3        
        //   224: getfield        X/105.LIZLLL:Ljava/util/Map;
        //   227: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   232: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   237: astore          5
        //   239: aload_2        
        //   240: astore_1       
        //   241: aload           5
        //   243: invokeinterface java/util/Iterator.hasNext:()Z
        //   248: ifeq            328
        //   251: aload           5
        //   253: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   258: astore_1       
        //   259: aload_1        
        //   260: checkcast       Ljava/util/Map$Entry;
        //   263: astore          6
        //   265: fload           8
        //   267: aload           6
        //   269: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   274: checkcast       Ljava/lang/Number;
        //   277: invokevirtual   java/lang/Number.floatValue:()F
        //   280: fcmpl          
        //   281: iflt            239
        //   284: aload           6
        //   286: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   291: checkcast       Ljava/lang/Number;
        //   294: invokevirtual   java/lang/Number.floatValue:()F
        //   297: fstore          4
        //   299: aload           6
        //   301: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   306: astore          6
        //   308: aload           6
        //   310: ifnonnull       360
        //   313: iconst_0       
        //   314: istore          9
        //   316: fload           8
        //   318: fload           4
        //   320: iload           9
        //   322: i2f            
        //   323: fadd           
        //   324: fcmpg          
        //   325: ifgt            239
        //   328: aload_1        
        //   329: checkcast       Ljava/util/Map$Entry;
        //   332: astore_1       
        //   333: aload_1        
        //   334: ifnull          18
        //   337: aload_1        
        //   338: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   343: astore_1       
        //   344: aload_1        
        //   345: ifnull          18
        //   348: aload           7
        //   350: aload_1        
        //   351: invokeinterface X/SRS.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   356: pop            
        //   357: goto            18
        //   360: aload_3        
        //   361: getfield        X/105.LJ:Ljava/util/Map;
        //   364: aload           6
        //   366: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   371: checkcast       Ljava/lang/Integer;
        //   374: astore          6
        //   376: aload           6
        //   378: ifnull          313
        //   381: aload           6
        //   383: invokevirtual   java/lang/Integer.intValue:()I
        //   386: istore          9
        //   388: goto            316
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:426)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:426)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
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
    
    public final void setBadges(final List<0zr<? extends 106>> lizj) {
        this.LIZJ = lizj;
        this.requestLayout();
        this.invalidate();
    }
    
    public final void setDarkMode(final boolean liziz) {
        this.LIZIZ = liziz;
    }
    
    public final void setMaxLine(final int ljiiiz) {
        if (ljiiiz >= 0) {
            this.LJIIIZ = ljiiiz;
        }
    }
    
    public final void setOnBadgeClickListener(final 104 liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final void setSingleLine(final boolean b) {
        if (b) {
            this.setMaxLine(1);
        }
    }
}
