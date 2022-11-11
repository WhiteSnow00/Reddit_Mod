// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Animatable;
import android.text.SpannableStringBuilder;
import android.text.SpannableString;
import android.text.TextPaint;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.ArrayList;
import com.bytedance.android.live.base.model.user.User;
import java.util.Objects;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class 1e0 extends 0zO<2HI<? extends H31>>
{
    public final 2HD LJIIJ;
    public final View LJIIJJI;
    public Drawable LJIIL;
    public Drawable LJIILIIL;
    public ImageSpan LJIILJJIL;
    public ImageSpan LJIILL;
    public boolean LJIILLIIL;
    public final TextView LJIIZILJ;
    public final 1si LJIJ;
    public final 5DO LJIJI;
    
    static {
        Covode.recordClassIndex(10546);
    }
    
    public 1e0(final View view, final 10r 10r, final boolean ljiilliil) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokespecial   X/0zO.<init>:(Landroid/view/View;LX/10r;)V
        //    10: aload_0        
        //    11: iload_3        
        //    12: putfield        X/1e0.LJIILLIIL:Z
        //    15: aload_1        
        //    16: ldc             2131368526
        //    18: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    21: astore          4
        //    23: aload           4
        //    25: ldc             ""
        //    27: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    30: aload           4
        //    32: checkcast       Landroid/widget/TextView;
        //    35: astore          4
        //    37: aload_0        
        //    38: aload           4
        //    40: putfield        X/1e0.LJIIZILJ:Landroid/widget/TextView;
        //    43: aload_1        
        //    44: ldc             2131368198
        //    46: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    49: astore          5
        //    51: aload           5
        //    53: ldc             ""
        //    55: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    58: aload           5
        //    60: checkcast       LX/1si;
        //    63: astore          6
        //    65: aload_0        
        //    66: aload           6
        //    68: putfield        X/1e0.LJIJ:LX/1si;
        //    71: aload_1        
        //    72: ldc             2131363920
        //    74: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    77: astore          5
        //    79: aload           5
        //    81: ldc             ""
        //    83: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    86: aload           5
        //    88: checkcast       LX/2HD;
        //    91: astore          5
        //    93: aload_0        
        //    94: aload           5
        //    96: putfield        X/1e0.LJIIJ:LX/2HD;
        //    99: aload_1        
        //   100: ldc             2131367275
        //   102: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   105: astore          7
        //   107: aload           7
        //   109: ldc             ""
        //   111: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   114: aload_0        
        //   115: aload           7
        //   117: putfield        X/1e0.LJIIJJI:Landroid/view/View;
        //   120: aload           6
        //   122: invokevirtual   X/SEd.getHierarchy:()LX/SB0;
        //   125: checkcast       LX/SEV;
        //   128: iconst_0       
        //   129: invokevirtual   X/SEV.LIZIZ:(I)V
        //   132: aload           6
        //   134: new             LX/0zS;
        //   137: dup            
        //   138: aload_0        
        //   139: invokespecial   X/0zS.<init>:(LX/1e0;)V
        //   142: invokevirtual   X/1si.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   145: aload           4
        //   147: new             LX/0zP;
        //   150: dup            
        //   151: aload_0        
        //   152: aload_2        
        //   153: invokespecial   X/0zP.<init>:(LX/1e0;LX/10r;)V
        //   156: invokevirtual   android/widget/TextView.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
        //   159: aload           4
        //   161: new             LX/0zQ;
        //   164: dup            
        //   165: aload_0        
        //   166: invokespecial   X/0zQ.<init>:(LX/1e0;)V
        //   169: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   172: aload           5
        //   174: invokestatic    X/BgA.LIZIZ:()LX/BgA;
        //   177: invokevirtual   X/2HD.setMovementMethod:(Landroid/text/method/MovementMethod;)V
        //   180: aload           5
        //   182: aload           5
        //   184: invokevirtual   X/2HD.getResources:()Landroid/content/res/Resources;
        //   187: ldc             2131100533
        //   189: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   192: invokevirtual   X/2HD.setHighlightColor:(I)V
        //   195: aload           5
        //   197: aload_0        
        //   198: getfield        X/0zO.LJI:LX/SRS;
        //   201: invokevirtual   X/2HD.setStateChangedListener:(LX/SRS;)V
        //   204: aload           5
        //   206: new             LX/0zR;
        //   209: dup            
        //   210: aload_0        
        //   211: aload_2        
        //   212: invokespecial   X/0zR.<init>:(LX/1e0;LX/10r;)V
        //   215: invokevirtual   X/2HD.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
        //   218: aload_1        
        //   219: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   222: ldc             2131233876
        //   224: invokestatic    X/01s.LIZIZ:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //   227: astore_2       
        //   228: aconst_null    
        //   229: astore          4
        //   231: ldc             10.0
        //   233: fstore          8
        //   235: aload_2        
        //   236: ifnull          465
        //   239: aload_2        
        //   240: iconst_0       
        //   241: iconst_0       
        //   242: ldc             14.0
        //   244: invokestatic    X/0cB.LIZ:(F)I
        //   247: ldc             10.0
        //   249: invokestatic    X/0cB.LIZ:(F)I
        //   252: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   255: aload_2        
        //   256: aload           5
        //   258: invokevirtual   android/graphics/drawable/Drawable.setCallback:(Landroid/graphics/drawable/Drawable$Callback;)V
        //   261: aload_0        
        //   262: aload_2        
        //   263: putfield        X/1e0.LJIIL:Landroid/graphics/drawable/Drawable;
        //   266: aload           5
        //   268: aload_2        
        //   269: invokevirtual   X/GkM.setVerifiedDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   272: aload_0        
        //   273: new             LX/7wj;
        //   276: dup            
        //   277: aload_0        
        //   278: getfield        X/1e0.LJIIL:Landroid/graphics/drawable/Drawable;
        //   281: invokespecial   X/7wj.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   284: putfield        X/1e0.LJIILJJIL:Landroid/text/style/ImageSpan;
        //   287: aload_1        
        //   288: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   291: ldc             2130970117
        //   293: invokestatic    X/0eI.LIZIZ:(Landroid/content/Context;I)LX/1Iu;
        //   296: astore_2       
        //   297: aload_0        
        //   298: aload_2        
        //   299: putfield        X/1e0.LJIILIIL:Landroid/graphics/drawable/Drawable;
        //   302: aload_2        
        //   303: ifnull          319
        //   306: aload_2        
        //   307: aload_1        
        //   308: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   311: ldc             2130971349
        //   313: invokestatic    X/0eI.LIZ:(Landroid/content/Context;I)I
        //   316: invokevirtual   android/graphics/drawable/Drawable.setTint:(I)V
        //   319: aload_0        
        //   320: getfield        X/1e0.LJIILIIL:Landroid/graphics/drawable/Drawable;
        //   323: astore_2       
        //   324: aload_2        
        //   325: ifnull          374
        //   328: aload_0        
        //   329: getfield        X/1e0.LJIILLIIL:Z
        //   332: ifeq            458
        //   335: ldc             24.0
        //   337: fstore          9
        //   339: fload           9
        //   341: invokestatic    X/0cB.LIZ:(F)I
        //   344: istore          10
        //   346: fload           8
        //   348: fstore          9
        //   350: aload_0        
        //   351: getfield        X/1e0.LJIILLIIL:Z
        //   354: ifeq            361
        //   357: ldc             24.0
        //   359: fstore          9
        //   361: aload_2        
        //   362: iconst_0       
        //   363: iconst_0       
        //   364: iload           10
        //   366: fload           9
        //   368: invokestatic    X/0cB.LIZ:(F)I
        //   371: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   374: aload_0        
        //   375: getfield        X/1e0.LJIILIIL:Landroid/graphics/drawable/Drawable;
        //   378: astore          5
        //   380: aload           4
        //   382: astore_2       
        //   383: aload           5
        //   385: ifnull          407
        //   388: new             LX/7wk;
        //   391: dup            
        //   392: aload           5
        //   394: invokespecial   X/7wk.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   397: astore_2       
        //   398: aload_2        
        //   399: ldc             2131166239
        //   401: invokestatic    X/0cB.LIZLLL:(I)I
        //   404: putfield        X/7wk.LIZLLL:I
        //   407: aload_0        
        //   408: aload_2        
        //   409: putfield        X/1e0.LJIILL:Landroid/text/style/ImageSpan;
        //   412: aload_0        
        //   413: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   416: new             LX/1dw;
        //   419: dup            
        //   420: aload_0        
        //   421: invokespecial   X/1dw.<init>:(LX/1e0;)V
        //   424: invokevirtual   X/1e9.LIZ:(LX/0zb;)V
        //   427: aload_0        
        //   428: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   431: new             LX/1dx;
        //   434: dup            
        //   435: aload_0        
        //   436: invokespecial   X/1dx.<init>:(LX/1e0;)V
        //   439: invokevirtual   X/1e9.LIZ:(LX/0zb;)V
        //   442: aload_0        
        //   443: new             LX/29w;
        //   446: dup            
        //   447: aload_1        
        //   448: invokespecial   X/29w.<init>:(Landroid/view/View;)V
        //   451: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   454: putfield        X/1e0.LJIJI:LX/5DO;
        //   457: return         
        //   458: ldc             10.0
        //   460: fstore          9
        //   462: goto            339
        //   465: aconst_null    
        //   466: astore_2       
        //   467: goto            261
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
    
    @Override
    public final void LIZ(final 1e7<2HI<? extends H31>> 1e7) {
        public final class 1dz implements a
        {
            public final /* synthetic */ 1e0 LIZ;
            public final /* synthetic */ 1e7 LIZIZ;
            
            static {
                Covode.recordClassIndex(10555);
            }
            
            public 1dz(final 1e0 liz, final 1e7 liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ() {
                if (this.LIZIZ.LIZ.LJ && this.LIZIZ.LIZ.LJII > 0L) {
                    ((0zr<106>)this.LIZ.LJ()).LJII().LJIIIIZZ = -1;
                    this.LIZ.LJIIJJI.requestLayout();
                    this.LIZ.LJ().LJII().LIZJ();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   X/0zO.LIZ:(LX/1e7;)V
        //     9: aload_0        
        //    10: invokevirtual   X/0zO.LJI:()LX/1e9;
        //    13: invokevirtual   X/1e9.LJI:()V
        //    16: aload_1        
        //    17: getfield        X/1e7.LJI:I
        //    20: iconst_1       
        //    21: if_icmpne       144
        //    24: aload_0        
        //    25: invokevirtual   X/1e0.LJIIIZ:()LX/102;
        //    28: astore_2       
        //    29: new             Ljava/util/ArrayList;
        //    32: dup            
        //    33: invokespecial   java/util/ArrayList.<init>:()V
        //    36: astore_3       
        //    37: aload_1        
        //    38: getfield        X/1e7.LIZ:LX/10h;
        //    41: getfield        X/10h.LIZJ:Z
        //    44: ifne            116
        //    47: aload_1        
        //    48: iconst_1       
        //    49: putfield        X/1e7.LJII:Z
        //    52: aload_0        
        //    53: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //    56: invokevirtual   X/1e9.LJFF:()V
        //    59: aload_3        
        //    60: aload_0        
        //    61: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //    64: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    69: pop            
        //    70: aload_1        
        //    71: getfield        X/1e7.LIZ:LX/10h;
        //    74: getfield        X/10h.LJ:Z
        //    77: ifeq            110
        //    80: aload_1        
        //    81: getfield        X/1e7.LIZ:LX/10h;
        //    84: invokevirtual   X/10h.LIZ:()J
        //    87: lconst_0       
        //    88: lcmp           
        //    89: ifle            110
        //    92: aload_3        
        //    93: aload_0        
        //    94: invokevirtual   X/0zO.LJ:()LX/1e9;
        //    97: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   102: pop            
        //   103: aload_0        
        //   104: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   107: invokevirtual   X/1e9.LJFF:()V
        //   110: aload_2        
        //   111: aload_3        
        //   112: invokevirtual   X/102.setBadges:(Ljava/util/List;)V
        //   115: return         
        //   116: aload_3        
        //   117: aload_0        
        //   118: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   121: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   126: pop            
        //   127: aload_0        
        //   128: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   131: invokevirtual   X/1e9.LJFF:()V
        //   134: aload_0        
        //   135: invokevirtual   X/0zO.LJI:()LX/1e9;
        //   138: invokevirtual   X/1e9.LJ:()V
        //   141: goto            110
        //   144: aload_0        
        //   145: invokevirtual   X/1e0.LJIIIZ:()LX/102;
        //   148: astore_3       
        //   149: new             Ljava/util/ArrayList;
        //   152: dup            
        //   153: invokespecial   java/util/ArrayList.<init>:()V
        //   156: astore_2       
        //   157: aload_1        
        //   158: getfield        X/1e7.LIZ:LX/10h;
        //   161: getfield        X/10h.LIZJ:Z
        //   164: ifne            336
        //   167: aload_1        
        //   168: getfield        X/1e7.LJII:Z
        //   171: ifne            308
        //   174: aload_1        
        //   175: iconst_1       
        //   176: putfield        X/1e7.LJII:Z
        //   179: aload_1        
        //   180: getfield        X/1e7.LIZ:LX/10h;
        //   183: getfield        X/10h.LJ:Z
        //   186: ifeq            280
        //   189: aload_0        
        //   190: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   193: invokevirtual   X/0zr.LJII:()LX/106;
        //   196: checkcast       LX/1mq;
        //   199: iconst_0       
        //   200: putfield        X/1mq.LIZ:I
        //   203: aload_0        
        //   204: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   207: invokevirtual   X/0zr.LJII:()LX/106;
        //   210: iconst_0       
        //   211: putfield        X/106.LJIIIIZZ:I
        //   214: aload_2        
        //   215: aload_0        
        //   216: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   219: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   224: pop            
        //   225: aload_0        
        //   226: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   229: new             LX/1dz;
        //   232: dup            
        //   233: aload_0        
        //   234: aload_1        
        //   235: invokespecial   X/1dz.<init>:(LX/1e0;LX/1e7;)V
        //   238: invokevirtual   X/1mr.LIZIZ:(LX/0zb;)V
        //   241: aload_1        
        //   242: getfield        X/1e7.LIZ:LX/10h;
        //   245: getfield        X/10h.LJ:Z
        //   248: ifeq            274
        //   251: aload_1        
        //   252: getfield        X/1e7.LIZ:LX/10h;
        //   255: invokevirtual   X/10h.LIZ:()J
        //   258: lconst_0       
        //   259: lcmp           
        //   260: ifle            274
        //   263: aload_2        
        //   264: aload_0        
        //   265: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   268: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   273: pop            
        //   274: aload_3        
        //   275: aload_2        
        //   276: invokevirtual   X/102.setBadges:(Ljava/util/List;)V
        //   279: return         
        //   280: aload_0        
        //   281: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   284: invokevirtual   X/1e9.LJFF:()V
        //   287: aload_0        
        //   288: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   291: invokevirtual   X/1e9.LJFF:()V
        //   294: aload_2        
        //   295: aload_0        
        //   296: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   299: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   304: pop            
        //   305: goto            241
        //   308: aload_0        
        //   309: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   312: invokevirtual   X/1e9.LJFF:()V
        //   315: aload_0        
        //   316: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   319: invokevirtual   X/1e9.LJFF:()V
        //   322: aload_2        
        //   323: aload_0        
        //   324: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   327: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   332: pop            
        //   333: goto            241
        //   336: aload_2        
        //   337: aload_0        
        //   338: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   341: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   346: pop            
        //   347: aload_0        
        //   348: invokevirtual   X/0zO.LJI:()LX/1e9;
        //   351: invokevirtual   X/1e9.LJ:()V
        //   354: goto            274
        //    Signature:
        //  (LX/1e7<LX/2HI<+LX/H31;>;>;)V
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
    
    @Override
    public final void LIZ(final 1e7<2HI<? extends H31>> 1e7, final Object suffix) {
        public final class 1dy extends GG3
        {
            public final /* synthetic */ 2HI LIZ;
            public final /* synthetic */ 1e0 LIZIZ;
            
            static {
                Covode.recordClassIndex(10552);
            }
            
            public 1dy(final 2HI liz, final 1e0 liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onClick(final View view) {
                CTM.LIZ((Object)view);
                ((1n9)this.LIZ).LIZIZ(false);
                final 10r ljiiiz = this.LIZIZ.LJIIIZ;
                if (ljiiiz != null) {
                    ljiiiz.LIZ(this.LIZ);
                }
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_undo_translate_comment");
                final 10r ljiiiz2 = this.LIZIZ.LJIIIZ;
                final Boolean b = null;
                DataChannel ljiizilj;
                if (ljiiiz2 != null) {
                    ljiizilj = ljiiiz2.LJIIZILJ;
                }
                else {
                    ljiizilj = null;
                }
                liz.LIZ(ljiizilj);
                final 10r ljiiiz3 = this.LIZIZ.LJIIIZ;
                Boolean value = b;
                if (ljiiiz3 != null) {
                    value = ljiiiz3.LJIILJJIL;
                }
                String s;
                if (GTi.LIZ(value)) {
                    s = "anchor";
                }
                else {
                    s = "user";
                }
                liz.LIZ("user_type", s);
                liz.LIZ("click_icon", "revert_icon");
                liz.LIZ("to_user_id", this.LIZ.LJJIL());
                liz.LIZLLL();
            }
            
            public final void updateDrawState(final TextPaint textPaint) {
                CTM.LIZ((Object)textPaint);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: new             LX/3tH;
        //     8: dup            
        //     9: invokespecial   X/3tH.<init>:()V
        //    12: astore_3       
        //    13: aload_3        
        //    14: iconst_1       
        //    15: putfield        X/3tH.element:Z
        //    18: aload_0        
        //    19: getfield        X/0zO.LJIIIIZZ:Landroid/view/View;
        //    22: invokestatic    X/GTi.LIZLLL:(Landroid/view/View;)Z
        //    25: istore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: aconst_null    
        //    31: astore          6
        //    33: aconst_null    
        //    34: astore          7
        //    36: aconst_null    
        //    37: astore          8
        //    39: iload           4
        //    41: ifeq            104
        //    44: aload_0        
        //    45: getfield        X/0zO.LIZLLL:LX/H31;
        //    48: astore          9
        //    50: aload           9
        //    52: ifnull          124
        //    55: aload           9
        //    57: invokevirtual   X/H31.getMessageId:()J
        //    60: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    63: astore          9
        //    65: aload_1        
        //    66: getfield        X/1e7.LIZ:LX/10h;
        //    69: getfield        X/10h.LJFF:LX/H31;
        //    72: astore          10
        //    74: aload           10
        //    76: ifnull          118
        //    79: aload           10
        //    81: invokevirtual   X/H31.getMessageId:()J
        //    84: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    87: astore          10
        //    89: aload           9
        //    91: aload           10
        //    93: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    96: ifeq            104
        //    99: aload_3        
        //   100: iconst_0       
        //   101: putfield        X/3tH.element:Z
        //   104: aload_0        
        //   105: aload_1        
        //   106: aload_2        
        //   107: invokespecial   X/0zO.LIZ:(LX/1e7;Ljava/lang/Object;)V
        //   110: aload_2        
        //   111: instanceof      LX/0zV;
        //   114: ifeq            130
        //   117: return         
        //   118: aconst_null    
        //   119: astore          10
        //   121: goto            89
        //   124: aconst_null    
        //   125: astore          9
        //   127: goto            65
        //   130: aload_2        
        //   131: instanceof      LX/0zX;
        //   134: ifeq            143
        //   137: aload_0        
        //   138: aload_1        
        //   139: invokevirtual   X/0zO.LIZ:(LX/1e7;)V
        //   142: return         
        //   143: aload_2        
        //   144: instanceof      LX/0zW;
        //   147: ifeq            156
        //   150: aload_0        
        //   151: aload_1        
        //   152: invokevirtual   X/0zO.LIZ:(LX/1e7;)V
        //   155: return         
        //   156: aload_0        
        //   157: aload_1        
        //   158: invokevirtual   X/0zO.LIZ:(LX/1e7;)V
        //   161: aload_0        
        //   162: getfield        X/0zO.LIZIZ:LX/2Gk;
        //   165: checkcast       LX/2HI;
        //   168: astore          10
        //   170: aload           10
        //   172: ifnull          457
        //   175: aload_0        
        //   176: getfield        X/0zO.LJIIIZ:LX/10r;
        //   179: astore_2       
        //   180: aload_2        
        //   181: ifnull          192
        //   184: aload_2        
        //   185: aload_0        
        //   186: getfield        X/1e0.LJIIZILJ:Landroid/widget/TextView;
        //   189: invokevirtual   X/10r.LIZ:(Landroid/widget/TextView;)V
        //   192: aload_0        
        //   193: getfield        X/0zO.LJIIIZ:LX/10r;
        //   196: astore_2       
        //   197: aload_2        
        //   198: ifnull          209
        //   201: aload_2        
        //   202: aload_0        
        //   203: getfield        X/1e0.LJIIJ:LX/2HD;
        //   206: invokevirtual   X/10r.LIZ:(Landroid/widget/TextView;)V
        //   209: aload_0        
        //   210: getfield        X/1e0.LJIIZILJ:Landroid/widget/TextView;
        //   213: aload           10
        //   215: invokevirtual   X/2HI.LJJJJI:()Ljava/lang/CharSequence;
        //   218: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   221: aload_0        
        //   222: getfield        X/0zO.LIZIZ:LX/2Gk;
        //   225: astore_2       
        //   226: aload_2        
        //   227: ifnull          851
        //   230: aload_2        
        //   231: invokevirtual   X/2AW.s_:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   234: astore_2       
        //   235: aload_2        
        //   236: ifnull          851
        //   239: aload_0        
        //   240: getfield        X/1e0.LJIJ:LX/1si;
        //   243: aload_2        
        //   244: invokestatic    X/HFv.LIZ:(LX/1si;Lcom/bytedance/android/live/base/model/ImageModel;)V
        //   247: aload           10
        //   249: instanceof      LX/1n9;
        //   252: istore          4
        //   254: ldc             ""
        //   256: astore          9
        //   258: iload           4
        //   260: ifeq            742
        //   263: aload           10
        //   265: checkcast       LX/1n9;
        //   268: astore          7
        //   270: aload           7
        //   272: invokeinterface X/1n9.LJIJ:()Z
        //   277: ifeq            461
        //   280: aload_0        
        //   281: getfield        X/1e0.LJIIJ:LX/2HD;
        //   284: astore          7
        //   286: aload           10
        //   288: invokevirtual   X/2AW.LJIJI:()Ljava/lang/CharSequence;
        //   291: astore          9
        //   293: aload           9
        //   295: astore_2       
        //   296: aload           9
        //   298: ifnonnull       304
        //   301: ldc             ""
        //   303: astore_2       
        //   304: aload           7
        //   306: aload_2        
        //   307: invokevirtual   X/2HD.setOriginText:(Ljava/lang/CharSequence;)V
        //   310: aload_0        
        //   311: getfield        X/1e0.LJIIJ:LX/2HD;
        //   314: astore_2       
        //   315: new             Landroid/text/SpannableString;
        //   318: dup            
        //   319: ldc_w           " "
        //   322: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   325: astore          9
        //   327: aload           9
        //   329: aload_0        
        //   330: getfield        X/1e0.LJIILJJIL:Landroid/text/style/ImageSpan;
        //   333: iconst_0       
        //   334: iconst_1       
        //   335: bipush          33
        //   337: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   340: aload_2        
        //   341: aload           9
        //   343: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   346: aload_0        
        //   347: getfield        X/1e0.LJIIJ:LX/2HD;
        //   350: aload_1        
        //   351: getfield        X/1e7.LJFF:Z
        //   354: iconst_1       
        //   355: ixor           
        //   356: invokevirtual   X/2HD.setAutoExpand:(Z)V
        //   359: aload_0        
        //   360: getfield        X/1e0.LJIIJ:LX/2HD;
        //   363: new             Landroid/text/SpannableStringBuilder;
        //   366: dup            
        //   367: aload_0        
        //   368: getfield        X/1e0.LJIIJ:LX/2HD;
        //   371: invokevirtual   X/2HD.getOriginText:()Ljava/lang/CharSequence;
        //   374: invokespecial   android/text/SpannableStringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //   377: aload_0        
        //   378: getfield        X/1e0.LJIIJ:LX/2HD;
        //   381: invokevirtual   X/2HD.getSuffix:()Ljava/lang/CharSequence;
        //   384: invokevirtual   android/text/SpannableStringBuilder.append:(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //   387: invokevirtual   X/2HD.setText:(Ljava/lang/CharSequence;)V
        //   390: aload_0        
        //   391: getfield        X/1e0.LJIIL:Landroid/graphics/drawable/Drawable;
        //   394: astore_2       
        //   395: aload_2        
        //   396: instanceof      Landroid/graphics/drawable/Animatable;
        //   399: ifne            458
        //   402: aload           8
        //   404: astore_2       
        //   405: aload_2        
        //   406: checkcast       Landroid/graphics/drawable/Animatable;
        //   409: astore_2       
        //   410: iload           5
        //   412: istore          4
        //   414: aload_2        
        //   415: ifnull          428
        //   418: aload_2        
        //   419: invokeinterface android/graphics/drawable/Animatable.start:()V
        //   424: iload           5
        //   426: istore          4
        //   428: aload_1        
        //   429: getfield        X/1e7.LJI:I
        //   432: iconst_1       
        //   433: if_icmpne       451
        //   436: aload_3        
        //   437: getfield        X/3tH.element:Z
        //   440: ifeq            451
        //   443: aload_0        
        //   444: getfield        X/1e0.LJIIJ:LX/2HD;
        //   447: iconst_1       
        //   448: invokevirtual   X/2HD.setAutoExpand:(Z)V
        //   451: aload_0        
        //   452: iload           4
        //   454: invokevirtual   X/0zO.LIZ:(Z)V
        //   457: return         
        //   458: goto            405
        //   461: aload_0        
        //   462: getfield        X/1e0.LJIIL:Landroid/graphics/drawable/Drawable;
        //   465: astore_2       
        //   466: aload_2        
        //   467: instanceof      Landroid/graphics/drawable/Animatable;
        //   470: ifne            667
        //   473: aload           6
        //   475: astore_2       
        //   476: aload_2        
        //   477: checkcast       Landroid/graphics/drawable/Animatable;
        //   480: astore_2       
        //   481: aload_2        
        //   482: ifnull          491
        //   485: aload_2        
        //   486: invokeinterface android/graphics/drawable/Animatable.stop:()V
        //   491: aload           7
        //   493: invokeinterface X/1n9.LJJIJ:()Z
        //   498: ifeq            670
        //   501: new             LX/1dy;
        //   504: dup            
        //   505: aload           10
        //   507: aload_0        
        //   508: invokespecial   X/1dy.<init>:(LX/2HI;LX/1e0;)V
        //   511: astore          10
        //   513: aload           7
        //   515: invokeinterface X/1n9.LJJIJIIJI:()Ljava/lang/CharSequence;
        //   520: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   523: ifeq            646
        //   526: aload           9
        //   528: astore_2       
        //   529: aload_1        
        //   530: getfield        X/1e7.LJFF:Z
        //   533: istore          4
        //   535: aload_0        
        //   536: getfield        X/1e0.LJIIJ:LX/2HD;
        //   539: aload_2        
        //   540: invokevirtual   X/2HD.setOriginText:(Ljava/lang/CharSequence;)V
        //   543: aload_1        
        //   544: getfield        X/1e7.LJFF:Z
        //   547: ifne            558
        //   550: aload_0        
        //   551: getfield        X/1e0.LJIIJ:LX/2HD;
        //   554: iconst_1       
        //   555: invokevirtual   X/2HD.setAutoExpand:(Z)V
        //   558: aload_0        
        //   559: getfield        X/1e0.LJIIJ:LX/2HD;
        //   562: astore          9
        //   564: new             Landroid/text/SpannableString;
        //   567: dup            
        //   568: ldc_w           " "
        //   571: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   574: astore_2       
        //   575: aload_2        
        //   576: aload_0        
        //   577: getfield        X/1e0.LJIILL:Landroid/text/style/ImageSpan;
        //   580: iconst_0       
        //   581: iconst_1       
        //   582: bipush          33
        //   584: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   587: aload_2        
        //   588: aload           10
        //   590: iconst_0       
        //   591: iconst_1       
        //   592: bipush          33
        //   594: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   597: aload           9
        //   599: aload_2        
        //   600: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   603: aload_0        
        //   604: getfield        X/1e0.LJIIJ:LX/2HD;
        //   607: astore_2       
        //   608: new             Ljava/lang/StringBuilder;
        //   611: dup            
        //   612: aload_0        
        //   613: getfield        X/1e0.LJIIJ:LX/2HD;
        //   616: invokevirtual   X/2HD.getOriginText:()Ljava/lang/CharSequence;
        //   619: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //   622: astore          9
        //   624: aload           9
        //   626: aload_0        
        //   627: getfield        X/1e0.LJIIJ:LX/2HD;
        //   630: invokevirtual   X/2HD.getSuffix:()Ljava/lang/CharSequence;
        //   633: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //   636: pop            
        //   637: aload_2        
        //   638: aload           9
        //   640: invokevirtual   X/2HD.setText:(Ljava/lang/CharSequence;)V
        //   643: goto            428
        //   646: aload           7
        //   648: invokeinterface X/1n9.LJJIJIIJI:()Ljava/lang/CharSequence;
        //   653: astore_2       
        //   654: aload_2        
        //   655: ifnonnull       664
        //   658: aload           9
        //   660: astore_2       
        //   661: goto            529
        //   664: goto            529
        //   667: goto            476
        //   670: aload_0        
        //   671: getfield        X/1e0.LJIIJ:LX/2HD;
        //   674: ldc             ""
        //   676: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   679: aload_0        
        //   680: getfield        X/1e0.LJIIJ:LX/2HD;
        //   683: astore          8
        //   685: aload           10
        //   687: invokevirtual   X/2AW.LJIJI:()Ljava/lang/CharSequence;
        //   690: astore          9
        //   692: aload           9
        //   694: astore_2       
        //   695: aload           9
        //   697: ifnonnull       703
        //   700: ldc             ""
        //   702: astore_2       
        //   703: aload           8
        //   705: aload_2        
        //   706: invokevirtual   X/2HD.setOriginText:(Ljava/lang/CharSequence;)V
        //   709: aload_0        
        //   710: getfield        X/1e0.LJIIJ:LX/2HD;
        //   713: astore_2       
        //   714: aload_2        
        //   715: aload_2        
        //   716: invokevirtual   X/2HD.getOriginText:()Ljava/lang/CharSequence;
        //   719: invokevirtual   X/2HD.setText:(Ljava/lang/CharSequence;)V
        //   722: aload_0        
        //   723: getfield        X/1e0.LJIIJ:LX/2HD;
        //   726: aload_1        
        //   727: getfield        X/1e7.LJFF:Z
        //   730: iconst_1       
        //   731: ixor           
        //   732: invokevirtual   X/2HD.setAutoExpand:(Z)V
        //   735: iload           5
        //   737: istore          4
        //   739: goto            428
        //   742: aload_0        
        //   743: getfield        X/1e0.LJIIJ:LX/2HD;
        //   746: ldc             ""
        //   748: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   751: aload_0        
        //   752: getfield        X/1e0.LJIIJ:LX/2HD;
        //   755: astore          8
        //   757: aload           10
        //   759: invokevirtual   X/2AW.LJIJI:()Ljava/lang/CharSequence;
        //   762: astore          9
        //   764: aload           9
        //   766: astore_2       
        //   767: aload           9
        //   769: ifnonnull       775
        //   772: ldc             ""
        //   774: astore_2       
        //   775: aload           8
        //   777: aload_2        
        //   778: invokevirtual   X/2HD.setOriginText:(Ljava/lang/CharSequence;)V
        //   781: aload_0        
        //   782: getfield        X/1e0.LJIIJ:LX/2HD;
        //   785: astore_2       
        //   786: aload_2        
        //   787: aload_2        
        //   788: invokevirtual   X/2HD.getOriginText:()Ljava/lang/CharSequence;
        //   791: invokevirtual   X/2HD.setText:(Ljava/lang/CharSequence;)V
        //   794: aload_0        
        //   795: getfield        X/1e0.LJIIJ:LX/2HD;
        //   798: aload_1        
        //   799: getfield        X/1e7.LJFF:Z
        //   802: iconst_1       
        //   803: ixor           
        //   804: invokevirtual   X/2HD.setAutoExpand:(Z)V
        //   807: aload_0        
        //   808: getfield        X/1e0.LJIIL:Landroid/graphics/drawable/Drawable;
        //   811: astore_2       
        //   812: aload_2        
        //   813: instanceof      Landroid/graphics/drawable/Animatable;
        //   816: ifne            848
        //   819: aload           7
        //   821: astore_2       
        //   822: aload_2        
        //   823: checkcast       Landroid/graphics/drawable/Animatable;
        //   826: astore_2       
        //   827: iload           5
        //   829: istore          4
        //   831: aload_2        
        //   832: ifnull          428
        //   835: aload_2        
        //   836: invokeinterface android/graphics/drawable/Animatable.stop:()V
        //   841: iload           5
        //   843: istore          4
        //   845: goto            428
        //   848: goto            822
        //   851: aload_0        
        //   852: getfield        X/1e0.LJIJ:LX/1si;
        //   855: aload           10
        //   857: invokevirtual   X/2AW.y_:()I
        //   860: invokestatic    X/GTi.LIZ:(Landroid/widget/ImageView;I)V
        //   863: goto            247
        //    Signature:
        //  (LX/1e7<LX/2HI<+LX/H31;>;>;Ljava/lang/Object;)V
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
    
    @Override
    public final 2HD LIZJ() {
        return this.LJIIJ;
    }
    
    @Override
    public final View LIZLLL() {
        return this.LJIIJJI;
    }
    
    public final 102 LJIIIZ() {
        return (102)this.LJIJI.getValue();
    }
}
