// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.n.z;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannableString;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.view.View;

public final class 1e5 extends 0zO<2Gk<? extends H31>> implements a
{
    public final 2HD LJIIJ;
    public final View LJIIJJI;
    public CharSequence LJIIL;
    public final 1si LJIILIIL;
    
    static {
        Covode.recordClassIndex(10556);
    }
    
    public 1e5(final View viewById, final 10r 10r) {
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
        //    10: aload_1        
        //    11: ldc             2131372162
        //    13: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    16: astore_3       
        //    17: aload_3        
        //    18: ldc             ""
        //    20: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: aload_3        
        //    24: checkcast       LX/2HD;
        //    27: astore_3       
        //    28: aload_0        
        //    29: aload_3        
        //    30: putfield        X/1e5.LJIIJ:LX/2HD;
        //    33: aload_1        
        //    34: ldc             2131366182
        //    36: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ldc             ""
        //    43: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    46: aload_1        
        //    47: checkcast       LX/1si;
        //    50: astore_1       
        //    51: aload_0        
        //    52: aload_1        
        //    53: putfield        X/1e5.LJIILIIL:LX/1si;
        //    56: aload_0        
        //    57: aload_3        
        //    58: putfield        X/1e5.LJIIJJI:Landroid/view/View;
        //    61: aload_1        
        //    62: new             LX/0zT;
        //    65: dup            
        //    66: aload_0        
        //    67: invokespecial   X/0zT.<init>:(LX/1e5;)V
        //    70: invokevirtual   X/1si.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    73: aload_3        
        //    74: invokestatic    X/GkI.LIZ:()LX/GkI;
        //    77: invokevirtual   X/2HD.setMovementMethod:(Landroid/text/method/MovementMethod;)V
        //    80: aload_3        
        //    81: aload_0        
        //    82: getfield        X/0zO.LJI:LX/SRS;
        //    85: invokevirtual   X/2HD.setStateChangedListener:(LX/SRS;)V
        //    88: aload_3        
        //    89: new             LX/0zU;
        //    92: dup            
        //    93: aload_0        
        //    94: aload_2        
        //    95: invokespecial   X/0zU.<init>:(LX/1e5;LX/10r;)V
        //    98: invokevirtual   X/2HD.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
        //   101: aload_0        
        //   102: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   105: new             LX/1e1;
        //   108: dup            
        //   109: aload_0        
        //   110: invokespecial   X/1e1.<init>:(LX/1e5;)V
        //   113: invokevirtual   X/1e9.LIZ:(LX/0zb;)V
        //   116: aload_0        
        //   117: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   120: new             LX/1e2;
        //   123: dup            
        //   124: aload_0        
        //   125: invokespecial   X/1e2.<init>:(LX/1e5;)V
        //   128: invokevirtual   X/1e9.LIZ:(LX/0zb;)V
        //   131: return         
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
    public final void LIZ(final 1e7<2Gk<? extends H31>> 1e7) {
        public final class 1e4 implements 1mq.a
        {
            public final /* synthetic */ 1e5 LIZ;
            public final /* synthetic */ 1e7 LIZIZ;
            
            static {
                Covode.recordClassIndex(10562);
            }
            
            public 1e4(final 1e5 liz, final 1e7 liziz) {
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
        //    21: if_icmpne       255
        //    24: aload_1        
        //    25: getfield        X/1e7.LIZ:LX/10h;
        //    28: getfield        X/10h.LIZJ:Z
        //    31: ifne            195
        //    34: aload_1        
        //    35: iconst_1       
        //    36: putfield        X/1e7.LJII:Z
        //    39: aload_0        
        //    40: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //    43: invokevirtual   X/1e9.LJFF:()V
        //    46: aload_0        
        //    47: getfield        X/1e5.LJIIJ:LX/2HD;
        //    50: astore_2       
        //    51: new             Landroid/text/SpannableString;
        //    54: dup            
        //    55: ldc             " \ufffc"
        //    57: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //    60: astore_3       
        //    61: aload_3        
        //    62: new             LX/108;
        //    65: dup            
        //    66: aload_0        
        //    67: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //    70: invokevirtual   X/0zr.LJII:()LX/106;
        //    73: checkcast       LX/1eO;
        //    76: invokespecial   X/108.<init>:(LX/1eO;)V
        //    79: iconst_1       
        //    80: iconst_2       
        //    81: bipush          33
        //    83: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //    86: aload_2        
        //    87: aload_3        
        //    88: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //    91: aload_1        
        //    92: getfield        X/1e7.LIZ:LX/10h;
        //    95: getfield        X/10h.LJ:Z
        //    98: ifeq            646
        //   101: aload_1        
        //   102: getfield        X/1e7.LIZ:LX/10h;
        //   105: invokevirtual   X/10h.LIZ:()J
        //   108: lconst_0       
        //   109: lcmp           
        //   110: ifle            646
        //   113: aload_0        
        //   114: getfield        X/1e5.LJIIJ:LX/2HD;
        //   117: astore_2       
        //   118: new             Landroid/text/SpannableStringBuilder;
        //   121: dup            
        //   122: aload_0        
        //   123: getfield        X/1e5.LJIIJ:LX/2HD;
        //   126: invokevirtual   X/2HD.getSuffix:()Ljava/lang/CharSequence;
        //   129: invokespecial   android/text/SpannableStringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //   132: astore_1       
        //   133: aload_1        
        //   134: bipush          32
        //   136: invokevirtual   android/text/SpannableStringBuilder.append:(C)Landroid/text/SpannableStringBuilder;
        //   139: pop            
        //   140: aload_1        
        //   141: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   144: istore          4
        //   146: aload_1        
        //   147: ldc             65532
        //   149: invokevirtual   android/text/SpannableStringBuilder.append:(C)Landroid/text/SpannableStringBuilder;
        //   152: pop            
        //   153: aload_1        
        //   154: new             LX/108;
        //   157: dup            
        //   158: aload_0        
        //   159: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   162: invokevirtual   X/0zr.LJII:()LX/106;
        //   165: checkcast       LX/1eO;
        //   168: invokespecial   X/108.<init>:(LX/1eO;)V
        //   171: iload           4
        //   173: aload_1        
        //   174: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   177: bipush          33
        //   179: invokevirtual   android/text/SpannableStringBuilder.setSpan:(Ljava/lang/Object;III)V
        //   182: aload_2        
        //   183: aload_1        
        //   184: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   187: aload_0        
        //   188: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   191: invokevirtual   X/1e9.LJFF:()V
        //   194: return         
        //   195: aload_0        
        //   196: getfield        X/1e5.LJIIJ:LX/2HD;
        //   199: astore_1       
        //   200: new             Landroid/text/SpannableString;
        //   203: dup            
        //   204: ldc             " \ufffc"
        //   206: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   209: astore_2       
        //   210: aload_2        
        //   211: new             LX/108;
        //   214: dup            
        //   215: aload_0        
        //   216: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   219: invokevirtual   X/0zr.LJII:()LX/106;
        //   222: checkcast       LX/1eO;
        //   225: invokespecial   X/108.<init>:(LX/1eO;)V
        //   228: iconst_1       
        //   229: iconst_2       
        //   230: bipush          33
        //   232: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   235: aload_1        
        //   236: aload_2        
        //   237: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   240: aload_0        
        //   241: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   244: invokevirtual   X/1e9.LJFF:()V
        //   247: aload_0        
        //   248: invokevirtual   X/0zO.LJI:()LX/1e9;
        //   251: invokevirtual   X/1e9.LJ:()V
        //   254: return         
        //   255: aload_1        
        //   256: getfield        X/1e7.LIZ:LX/10h;
        //   259: getfield        X/10h.LIZJ:Z
        //   262: ifne            594
        //   265: aload_1        
        //   266: getfield        X/1e7.LJII:Z
        //   269: ifne            532
        //   272: aload_1        
        //   273: iconst_1       
        //   274: putfield        X/1e7.LJII:Z
        //   277: aload_1        
        //   278: getfield        X/1e7.LIZ:LX/10h;
        //   281: getfield        X/10h.LJ:Z
        //   284: ifeq            470
        //   287: aload_0        
        //   288: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   291: invokevirtual   X/0zr.LJII:()LX/106;
        //   294: checkcast       LX/1mq;
        //   297: iconst_0       
        //   298: putfield        X/1mq.LIZ:I
        //   301: aload_0        
        //   302: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   305: invokevirtual   X/0zr.LJII:()LX/106;
        //   308: iconst_0       
        //   309: putfield        X/106.LJIIIIZZ:I
        //   312: aload_0        
        //   313: getfield        X/1e5.LJIIJ:LX/2HD;
        //   316: astore_2       
        //   317: new             Landroid/text/SpannableString;
        //   320: dup            
        //   321: ldc             " \ufffc"
        //   323: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   326: astore_3       
        //   327: aload_3        
        //   328: new             LX/108;
        //   331: dup            
        //   332: aload_0        
        //   333: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   336: invokevirtual   X/0zr.LJII:()LX/106;
        //   339: checkcast       LX/1eO;
        //   342: invokespecial   X/108.<init>:(LX/1eO;)V
        //   345: iconst_1       
        //   346: iconst_2       
        //   347: bipush          33
        //   349: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   352: aload_2        
        //   353: aload_3        
        //   354: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   357: aload_0        
        //   358: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   361: new             LX/1e4;
        //   364: dup            
        //   365: aload_0        
        //   366: aload_1        
        //   367: invokespecial   X/1e4.<init>:(LX/1e5;LX/1e7;)V
        //   370: invokevirtual   X/1mr.LIZIZ:(LX/0zb;)V
        //   373: aload_1        
        //   374: getfield        X/1e7.LIZ:LX/10h;
        //   377: getfield        X/10h.LJ:Z
        //   380: ifeq            646
        //   383: aload_1        
        //   384: getfield        X/1e7.LIZ:LX/10h;
        //   387: invokevirtual   X/10h.LIZ:()J
        //   390: lconst_0       
        //   391: lcmp           
        //   392: ifle            646
        //   395: aload_0        
        //   396: getfield        X/1e5.LJIIJ:LX/2HD;
        //   399: astore_1       
        //   400: new             Landroid/text/SpannableStringBuilder;
        //   403: dup            
        //   404: aload_0        
        //   405: getfield        X/1e5.LJIIJ:LX/2HD;
        //   408: invokevirtual   X/2HD.getSuffix:()Ljava/lang/CharSequence;
        //   411: invokespecial   android/text/SpannableStringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //   414: astore_2       
        //   415: aload_2        
        //   416: bipush          32
        //   418: invokevirtual   android/text/SpannableStringBuilder.append:(C)Landroid/text/SpannableStringBuilder;
        //   421: pop            
        //   422: aload_2        
        //   423: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   426: istore          4
        //   428: aload_2        
        //   429: ldc             65532
        //   431: invokevirtual   android/text/SpannableStringBuilder.append:(C)Landroid/text/SpannableStringBuilder;
        //   434: pop            
        //   435: aload_2        
        //   436: new             LX/108;
        //   439: dup            
        //   440: aload_0        
        //   441: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   444: invokevirtual   X/0zr.LJII:()LX/106;
        //   447: checkcast       LX/1eO;
        //   450: invokespecial   X/108.<init>:(LX/1eO;)V
        //   453: iload           4
        //   455: aload_2        
        //   456: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   459: bipush          33
        //   461: invokevirtual   android/text/SpannableStringBuilder.setSpan:(Ljava/lang/Object;III)V
        //   464: aload_1        
        //   465: aload_2        
        //   466: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   469: return         
        //   470: aload_0        
        //   471: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   474: invokevirtual   X/1e9.LJFF:()V
        //   477: aload_0        
        //   478: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   481: invokevirtual   X/1e9.LJFF:()V
        //   484: aload_0        
        //   485: getfield        X/1e5.LJIIJ:LX/2HD;
        //   488: astore_3       
        //   489: new             Landroid/text/SpannableString;
        //   492: dup            
        //   493: ldc             " \ufffc"
        //   495: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   498: astore_2       
        //   499: aload_2        
        //   500: new             LX/108;
        //   503: dup            
        //   504: aload_0        
        //   505: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   508: invokevirtual   X/0zr.LJII:()LX/106;
        //   511: checkcast       LX/1eO;
        //   514: invokespecial   X/108.<init>:(LX/1eO;)V
        //   517: iconst_1       
        //   518: iconst_2       
        //   519: bipush          33
        //   521: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   524: aload_3        
        //   525: aload_2        
        //   526: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   529: goto            373
        //   532: aload_0        
        //   533: invokevirtual   X/0zO.LJ:()LX/1e9;
        //   536: invokevirtual   X/1e9.LJFF:()V
        //   539: aload_0        
        //   540: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   543: invokevirtual   X/1e9.LJFF:()V
        //   546: aload_0        
        //   547: getfield        X/1e5.LJIIJ:LX/2HD;
        //   550: astore_3       
        //   551: new             Landroid/text/SpannableString;
        //   554: dup            
        //   555: ldc             " \ufffc"
        //   557: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   560: astore_2       
        //   561: aload_2        
        //   562: new             LX/108;
        //   565: dup            
        //   566: aload_0        
        //   567: invokevirtual   X/0zO.LJFF:()LX/1e9;
        //   570: invokevirtual   X/0zr.LJII:()LX/106;
        //   573: checkcast       LX/1eO;
        //   576: invokespecial   X/108.<init>:(LX/1eO;)V
        //   579: iconst_1       
        //   580: iconst_2       
        //   581: bipush          33
        //   583: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   586: aload_3        
        //   587: aload_2        
        //   588: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   591: goto            373
        //   594: aload_0        
        //   595: getfield        X/1e5.LJIIJ:LX/2HD;
        //   598: astore_2       
        //   599: new             Landroid/text/SpannableString;
        //   602: dup            
        //   603: ldc             " \ufffc"
        //   605: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   608: astore_1       
        //   609: aload_1        
        //   610: new             LX/108;
        //   613: dup            
        //   614: aload_0        
        //   615: invokevirtual   X/0zO.LJII:()LX/1mr;
        //   618: invokevirtual   X/0zr.LJII:()LX/106;
        //   621: checkcast       LX/1eO;
        //   624: invokespecial   X/108.<init>:(LX/1eO;)V
        //   627: iconst_1       
        //   628: iconst_2       
        //   629: bipush          33
        //   631: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   634: aload_2        
        //   635: aload_1        
        //   636: invokevirtual   X/2HD.setSuffix:(Ljava/lang/CharSequence;)V
        //   639: aload_0        
        //   640: invokevirtual   X/0zO.LJI:()LX/1e9;
        //   643: invokevirtual   X/1e9.LJ:()V
        //   646: return         
        //    Signature:
        //  (LX/1e7<LX/2Gk<+LX/H31;>;>;)V
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:426)
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
    public final void LIZ(final 1e7<2Gk<? extends H31>> 1e7, final Object o) {
        public final class 1e3 implements b
        {
            public final /* synthetic */ 1e5 LIZ;
            
            static {
                Covode.recordClassIndex(10561);
            }
            
            public 1e3(final 1e5 liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final Spannable spannable) {
                final SpannableStringBuilder text = new SpannableStringBuilder(((AppCompatTextView)this.LIZ.LJIIJ).getText());
                text.append((CharSequence)" ");
                text.append((CharSequence)spannable);
                this.LIZ.LJIIJ.setText((CharSequence)text);
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LIZ.LJIIL);
                spannableStringBuilder.append((CharSequence)" ");
                this.LIZ.LJIIL = (CharSequence)spannableStringBuilder.append((CharSequence)spannable);
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
        //    13: iconst_1       
        //    14: istore          4
        //    16: aload_3        
        //    17: iconst_1       
        //    18: putfield        X/3tH.element:Z
        //    21: aload_0        
        //    22: getfield        X/0zO.LJIIIIZZ:Landroid/view/View;
        //    25: invokestatic    X/GTi.LIZLLL:(Landroid/view/View;)Z
        //    28: istore          5
        //    30: aconst_null    
        //    31: astore          6
        //    33: iload           5
        //    35: ifeq            98
        //    38: aload_0        
        //    39: getfield        X/0zO.LIZLLL:LX/H31;
        //    42: astore          7
        //    44: aload           7
        //    46: ifnull          118
        //    49: aload           7
        //    51: invokevirtual   X/H31.getMessageId:()J
        //    54: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    57: astore          7
        //    59: aload_1        
        //    60: getfield        X/1e7.LIZ:LX/10h;
        //    63: getfield        X/10h.LJFF:LX/H31;
        //    66: astore          8
        //    68: aload           8
        //    70: ifnull          112
        //    73: aload           8
        //    75: invokevirtual   X/H31.getMessageId:()J
        //    78: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    81: astore          8
        //    83: aload           7
        //    85: aload           8
        //    87: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    90: ifeq            98
        //    93: aload_3        
        //    94: iconst_0       
        //    95: putfield        X/3tH.element:Z
        //    98: aload_0        
        //    99: aload_1        
        //   100: aload_2        
        //   101: invokespecial   X/0zO.LIZ:(LX/1e7;Ljava/lang/Object;)V
        //   104: aload_2        
        //   105: instanceof      LX/0zV;
        //   108: ifeq            124
        //   111: return         
        //   112: aconst_null    
        //   113: astore          8
        //   115: goto            83
        //   118: aconst_null    
        //   119: astore          7
        //   121: goto            59
        //   124: aload_2        
        //   125: instanceof      LX/0zX;
        //   128: ifeq            137
        //   131: aload_0        
        //   132: aload_1        
        //   133: invokevirtual   X/0zO.LIZ:(LX/1e7;)V
        //   136: return         
        //   137: aload_2        
        //   138: instanceof      LX/0zW;
        //   141: ifeq            150
        //   144: aload_0        
        //   145: aload_1        
        //   146: invokevirtual   X/0zO.LIZ:(LX/1e7;)V
        //   149: return         
        //   150: aload_0        
        //   151: aload_1        
        //   152: invokevirtual   X/0zO.LIZ:(LX/1e7;)V
        //   155: aload_0        
        //   156: getfield        X/0zO.LJIIIZ:LX/10r;
        //   159: astore_2       
        //   160: aload_2        
        //   161: ifnull          172
        //   164: aload_2        
        //   165: aload_0        
        //   166: getfield        X/1e5.LJIIJ:LX/2HD;
        //   169: invokevirtual   X/10r.LIZ:(Landroid/widget/TextView;)V
        //   172: aload_0        
        //   173: getfield        X/0zO.LIZIZ:LX/2Gk;
        //   176: astore_2       
        //   177: aload_2        
        //   178: ifnull          424
        //   181: aload_0        
        //   182: getfield        X/1e5.LJIIJ:LX/2HD;
        //   185: ldc_w           2131372766
        //   188: aload_2        
        //   189: invokevirtual   X/2HD.setTag:(ILjava/lang/Object;)V
        //   192: aload_2        
        //   193: invokevirtual   X/2AW.s_:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   196: astore          7
        //   198: aload           7
        //   200: ifnull          224
        //   203: aload_0        
        //   204: getfield        X/1e5.LJIILIIL:LX/1si;
        //   207: aload           7
        //   209: invokestatic    X/HFv.LIZ:(LX/1si;Lcom/bytedance/android/live/base/model/ImageModel;)V
        //   212: aload_2        
        //   213: invokevirtual   X/2AW.LJIJI:()Ljava/lang/CharSequence;
        //   216: astore          7
        //   218: aload           7
        //   220: ifnonnull       238
        //   223: return         
        //   224: aload_0        
        //   225: getfield        X/1e5.LJIILIIL:LX/1si;
        //   228: aload_2        
        //   229: invokevirtual   X/2AW.y_:()I
        //   232: invokestatic    X/GTi.LIZ:(Landroid/widget/ImageView;I)V
        //   235: goto            212
        //   238: aload_0        
        //   239: aload           7
        //   241: putfield        X/1e5.LJIIL:Ljava/lang/CharSequence;
        //   244: aload_0        
        //   245: getfield        X/1e5.LJIIJ:LX/2HD;
        //   248: aload           7
        //   250: invokevirtual   X/2HD.setText:(Ljava/lang/CharSequence;)V
        //   253: aload_2        
        //   254: instanceof      LX/11K;
        //   257: ifeq            270
        //   260: aload_2        
        //   261: checkcast       LX/11K;
        //   264: aload_0        
        //   265: invokeinterface X/11K.LIZ:(LX/10Z;)V
        //   270: aload_2        
        //   271: instanceof      LX/2HN;
        //   274: ifeq            333
        //   277: aload_2        
        //   278: checkcast       LX/2HN;
        //   281: astore          8
        //   283: aload           8
        //   285: invokevirtual   X/2HN.LJ:()Z
        //   288: ifeq            333
        //   291: aload_0        
        //   292: getfield        X/1e5.LJIIJ:LX/2HD;
        //   295: astore          7
        //   297: aload_0        
        //   298: getfield        X/0zO.LJIIIZ:LX/10r;
        //   301: astore          9
        //   303: aload           6
        //   305: astore_2       
        //   306: aload           9
        //   308: ifnull          317
        //   311: aload           9
        //   313: getfield        X/10r.LJIILL:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   316: astore_2       
        //   317: aload           8
        //   319: aload           7
        //   321: aload_2        
        //   322: new             LX/1e3;
        //   325: dup            
        //   326: aload_0        
        //   327: invokespecial   X/1e3.<init>:(LX/1e5;)V
        //   330: invokevirtual   X/2HN.LIZ:(Landroid/widget/TextView;Lcom/bytedance/android/livesdkapi/depend/model/live/Room;LX/10a;)V
        //   333: aload_0        
        //   334: getfield        X/1e5.LJIIJ:LX/2HD;
        //   337: astore          8
        //   339: aload_0        
        //   340: getfield        X/1e5.LJIIL:Ljava/lang/CharSequence;
        //   343: astore          7
        //   345: aload           7
        //   347: astore_2       
        //   348: aload           7
        //   350: ifnonnull       356
        //   353: ldc             ""
        //   355: astore_2       
        //   356: aload           8
        //   358: aload_2        
        //   359: invokevirtual   X/2HD.setOriginText:(Ljava/lang/CharSequence;)V
        //   362: aload_0        
        //   363: getfield        X/1e5.LJIIJ:LX/2HD;
        //   366: new             Landroid/text/SpannableStringBuilder;
        //   369: dup            
        //   370: aload_0        
        //   371: getfield        X/1e5.LJIIJ:LX/2HD;
        //   374: invokevirtual   X/2HD.getOriginText:()Ljava/lang/CharSequence;
        //   377: invokespecial   android/text/SpannableStringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //   380: aload_0        
        //   381: getfield        X/1e5.LJIIJ:LX/2HD;
        //   384: invokevirtual   X/2HD.getSuffix:()Ljava/lang/CharSequence;
        //   387: invokevirtual   android/text/SpannableStringBuilder.append:(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //   390: invokevirtual   X/2HD.setText:(Ljava/lang/CharSequence;)V
        //   393: aload_1        
        //   394: getfield        X/1e7.LJI:I
        //   397: iconst_1       
        //   398: if_icmpne       425
        //   401: aload_3        
        //   402: getfield        X/3tH.element:Z
        //   405: ifeq            419
        //   408: aload_0        
        //   409: getfield        X/1e5.LJIIJ:LX/2HD;
        //   412: astore_1       
        //   413: aload_1        
        //   414: iload           4
        //   416: invokevirtual   X/2HD.setAutoExpand:(Z)V
        //   419: aload_0        
        //   420: iconst_0       
        //   421: invokevirtual   X/0zO.LIZ:(Z)V
        //   424: return         
        //   425: aload_0        
        //   426: getfield        X/1e5.LJIIJ:LX/2HD;
        //   429: astore_2       
        //   430: aload_1        
        //   431: getfield        X/1e7.LJFF:Z
        //   434: ifne            442
        //   437: aload_2        
        //   438: astore_1       
        //   439: goto            413
        //   442: iconst_0       
        //   443: istore          4
        //   445: aload_2        
        //   446: astore_1       
        //   447: goto            413
        //    Signature:
        //  (LX/1e7<LX/2Gk<+LX/H31;>;>;Ljava/lang/Object;)V
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
    public final void LIZ(final Bitmap bitmap, final 2Gk<? extends H31> 2Gk) {
        if (bitmap != null && 2Gk != null) {
            final int liz = z.LIZ((CharSequence)String.valueOf(this.LJIIL), " . ");
            if (liz != -1) {
                Object ljiil;
                if (!((ljiil = this.LJIIL) instanceof Spannable)) {
                    ljiil = null;
                }
                final Spannable spannable = (Spannable)ljiil;
                if (spannable != null) {
                    HYW.LIZ(spannable, bitmap, liz + 1, liz + 2, (HYY)2Gk);
                }
            }
            final 2HD ljiij = this.LJIIJ;
            CharSequence ljiil2;
            if ((ljiil2 = this.LJIIL) == null) {
                ljiil2 = "";
            }
            ljiij.setOriginText(ljiil2);
            this.LJIIJ.setText(this.LJIIL);
        }
    }
    
    @Override
    public final 2HD LIZJ() {
        return this.LJIIJ;
    }
    
    @Override
    public final View LIZLLL() {
        return this.LJIIJJI;
    }
}
