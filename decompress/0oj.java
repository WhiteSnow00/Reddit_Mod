// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.ImageView;
import android.text.TextUtils;
import android.widget.ImageView$ScaleType;
import java.util.ArrayList;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import kotlin.jvm.internal.n;
import android.view.LayoutInflater$Factory;
import android.view.View$OnClickListener;
import com.bytedance.android.live.liveinteract.match.ui.view.MatchWinningStreaksIconView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import android.widget.LinearLayout;

public final class 0oj extends LinearLayout
{
    public SRS<? super String, 2P9> LIZ;
    public BattleComboInfo LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;
    public final 1si LJ;
    public final View LJFF;
    public final TextView LJI;
    
    static {
        Covode.recordClassIndex(8021);
    }
    
    public 0oj(final Context context, final AttributeSet set) {
        CTM.LIZ((Object)context);
        super(context, set);
        MethodCollector.i(9373);
        LIZ(LayoutInflater.from(context), (ViewGroup)this);
        this.LJ = (1si)this.findViewById(2131374434);
        this.LJFF = this.findViewById(2131374197);
        this.LIZJ = (TextView)this.findViewById(2131374431);
        this.LIZLLL = (TextView)this.findViewById(2131374433);
        this.LJI = (TextView)this.findViewById(2131374432);
        this.setOrientation(0);
        this.setBackgroundResource(2131234775);
        this.setOnClickListener((View$OnClickListener)new MatchWinningStreaksIconView.MatchWinningStreaksIconView$1(this));
        MethodCollector.o(9373);
    }
    
    public static View LIZ(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        MethodCollector.i(9376);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(2131562232, viewGroup);
                MethodCollector.o(9376);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(2131562232, viewGroup);
        MethodCollector.o(9376);
        return inflate2;
    }
    
    private final void LIZ(final BattleComboInfo battleComboInfo, final BattleComboInfo battleComboInfo2) {
        long n;
        if (battleComboInfo.LIZJ > battleComboInfo2.LIZJ) {
            n = battleComboInfo.LIZJ;
        }
        else {
            n = battleComboInfo2.LIZJ;
        }
        final TextView lji = this.LJI;
        kotlin.jvm.internal.n.LIZIZ((Object)lji, "");
        String text;
        if (n > 99L) {
            text = "99+";
        }
        else if (n > 9L) {
            text = "99";
        }
        else {
            text = "9";
        }
        lji.setText((CharSequence)text);
    }
    
    private final void setCountTv(final BattleComboInfo battleComboInfo) {
        if (battleComboInfo.LIZJ > 99L) {
            final TextView lizj = this.LIZJ;
            n.LIZIZ((Object)lizj, "");
            lizj.setText((CharSequence)"99+");
            return;
        }
        final TextView lizj2 = this.LIZJ;
        n.LIZIZ((Object)lizj2, "");
        lizj2.setText((CharSequence)String.valueOf(battleComboInfo.LIZJ));
    }
    
    public final void LIZ(final BattleComboInfo liziz, final boolean b) {
        public final class 1xq extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 0oj LIZ;
            
            static {
                Covode.recordClassIndex(8024);
            }
            
            public 1xq(final 0oj liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 1xp extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 0oj LIZ;
            
            static {
                Covode.recordClassIndex(8023);
            }
            
            public 1xp(final 0oj liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "MatchWinningStreaksIcon"
        //     3: ldc             "update count"
        //     5: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //     8: aload_1        
        //     9: ifnull          19
        //    12: aload_0        
        //    13: getfield        X/0oj.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //    16: ifnonnull       28
        //    19: iconst_3       
        //    20: ldc             "MatchWinningStreaksIcon"
        //    22: ldc             "info is empty"
        //    24: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    27: return         
        //    28: aload_1        
        //    29: getfield        com/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo.LIZJ:J
        //    32: lstore_3       
        //    33: aload_0        
        //    34: getfield        X/0oj.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //    37: astore          5
        //    39: aload           5
        //    41: ifnonnull       47
        //    44: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //    47: lload_3        
        //    48: aload           5
        //    50: getfield        com/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo.LIZJ:J
        //    53: lcmp           
        //    54: ifne            66
        //    57: iconst_3       
        //    58: ldc             "MatchWinningStreaksIcon"
        //    60: ldc             "same count info"
        //    62: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    65: return         
        //    66: aload_0        
        //    67: getfield        X/0oj.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //    70: astore          5
        //    72: aload           5
        //    74: ifnonnull       80
        //    77: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //    80: aload           5
        //    82: getfield        com/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo.LIZJ:J
        //    85: ldc2_w          99
        //    88: lcmp           
        //    89: ifgt            231
        //    92: iconst_1       
        //    93: istore          6
        //    95: aload_0        
        //    96: getfield        X/0oj.LIZLLL:Landroid/widget/TextView;
        //    99: astore          7
        //   101: aload           7
        //   103: ldc             ""
        //   105: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   108: aload_0        
        //   109: getfield        X/0oj.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   112: astore          5
        //   114: aload           5
        //   116: ifnull          225
        //   119: aload           5
        //   121: getfield        com/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo.LIZJ:J
        //   124: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   127: astore          5
        //   129: aload           5
        //   131: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   134: astore          5
        //   136: aload           5
        //   138: ifnull          218
        //   141: aload           7
        //   143: aload           5
        //   145: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   148: aload_0        
        //   149: getfield        X/0oj.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   152: astore          5
        //   154: aload           5
        //   156: ifnonnull       162
        //   159: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   162: aload_0        
        //   163: aload_1        
        //   164: aload           5
        //   166: invokespecial   X/0oj.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //   169: aload_0        
        //   170: aload_1        
        //   171: putfield        X/0oj.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   174: aload_0        
        //   175: aload_1        
        //   176: invokespecial   X/0oj.setCountTv:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //   179: iload           6
        //   181: ifne            237
        //   184: aload_0        
        //   185: getfield        X/0oj.LIZJ:Landroid/widget/TextView;
        //   188: astore_1       
        //   189: aload_1        
        //   190: ldc             ""
        //   192: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   195: aload_1        
        //   196: iconst_0       
        //   197: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   200: aload_0        
        //   201: getfield        X/0oj.LIZLLL:Landroid/widget/TextView;
        //   204: astore_1       
        //   205: aload_1        
        //   206: ldc             ""
        //   208: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   211: aload_1        
        //   212: bipush          8
        //   214: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   217: return         
        //   218: ldc             "0"
        //   220: astore          5
        //   222: goto            141
        //   225: aconst_null    
        //   226: astore          5
        //   228: goto            129
        //   231: iconst_0       
        //   232: istore          6
        //   234: goto            95
        //   237: iload_2        
        //   238: ifeq            287
        //   241: getstatic       X/0n5.LIZ:LX/0n5;
        //   244: astore          5
        //   246: aload_0        
        //   247: getfield        X/0oj.LIZLLL:Landroid/widget/TextView;
        //   250: astore_1       
        //   251: aload_1        
        //   252: ldc             ""
        //   254: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   257: aload_0        
        //   258: getfield        X/0oj.LIZJ:Landroid/widget/TextView;
        //   261: astore          7
        //   263: aload           7
        //   265: ldc             ""
        //   267: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   270: aload           5
        //   272: aload_1        
        //   273: aload           7
        //   275: new             LX/1xp;
        //   278: dup            
        //   279: aload_0        
        //   280: invokespecial   X/1xp.<init>:(LX/0oj;)V
        //   283: invokevirtual   X/0n5.LIZ:(Landroid/view/View;Landroid/view/View;LX/QgG;)V
        //   286: return         
        //   287: getstatic       X/0n5.LIZ:LX/0n5;
        //   290: astore_1       
        //   291: aload_0        
        //   292: getfield        X/0oj.LIZLLL:Landroid/widget/TextView;
        //   295: astore          7
        //   297: aload           7
        //   299: ldc             ""
        //   301: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   304: aload_0        
        //   305: getfield        X/0oj.LIZJ:Landroid/widget/TextView;
        //   308: astore          5
        //   310: aload           5
        //   312: ldc             ""
        //   314: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   317: aload_1        
        //   318: aload           7
        //   320: aload           5
        //   322: new             LX/1xq;
        //   325: dup            
        //   326: aload_0        
        //   327: invokespecial   X/1xq.<init>:(LX/0oj;)V
        //   330: invokevirtual   X/0n5.LIZIZ:(Landroid/view/View;Landroid/view/View;LX/QgG;)V
        //   333: return         
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
    
    public final boolean LIZ(final BattleComboInfo battleComboInfo) {
        boolean b = false;
        if (battleComboInfo != null) {
            0ba.LIZ(3, "MatchWinningStreaksIcon", "set data");
            this.LIZIZ = battleComboInfo;
            if (battleComboInfo.LJ == 4IZ.ACTIVITY.getType()) {
                final 1si lj = this.LJ;
                n.LIZIZ((Object)lj, "");
                lj.setVisibility(0);
                final 1si lj2 = this.LJ;
                final String lizlll = battleComboInfo.LIZLLL;
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    new ArrayList<String>().add(lizlll);
                    final G18 liz = 0cp.LIZ();
                    liz.LIZ(lizlll);
                    liz.LIZIZ(2131234915);
                    liz.LIZ(ImageView$ScaleType.CENTER_CROP);
                    liz.LIZ((View)lj2);
                }
                else if (lj2 != null && !TextUtils.isEmpty((CharSequence)lizlll)) {
                    if (0cm.LIZ(((ImageView)lj2).getContext())) {
                        final 0bz liz2 = 0bz.LIZ(((ImageView)lj2).getContext());
                        liz2.LIZ(lizlll);
                        liz2.LIZ(2131234915);
                        liz2.LIZ(ImageView$ScaleType.CENTER_CROP);
                        liz2.LIZ((View)lj2);
                    }
                }
                final View ljff = this.LJFF;
                n.LIZIZ((Object)ljff, "");
                ljff.setVisibility(8);
            }
            else {
                final 1si lj3 = this.LJ;
                n.LIZIZ((Object)lj3, "");
                lj3.setVisibility(8);
                final View ljff2 = this.LJFF;
                n.LIZIZ((Object)ljff2, "");
                ljff2.setVisibility(0);
            }
            this.setCountTv(battleComboInfo);
            this.LIZ(battleComboInfo, new BattleComboInfo((byte)0));
            this.setVisibility(0);
            b = true;
        }
        else {
            this.setVisibility(8);
        }
        return b;
    }
    
    public final BattleComboInfo getInfo() {
        return this.LIZIZ;
    }
    
    public final SRS<String, 2P9> getOnClicked() {
        return (SRS<String, 2P9>)this.LIZ;
    }
    
    public final void setOnClicked(final SRS<? super String, 2P9> liz) {
        this.LIZ = liz;
    }
    
    public final void setVisibility(final int visibility) {
        if (this.LIZIZ == null) {
            return;
        }
        super.setVisibility(visibility);
    }
}
