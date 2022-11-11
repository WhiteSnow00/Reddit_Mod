// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.business.dialog;

import X.2F2;
import androidx.fragment.app.Fragment;
import X.HAM;
import X.1bk;
import X.1bj;
import X.1bi;
import X.0Bf;
import X.0CH;
import X.1bh;
import X.0jR;
import com.bytedance.android.live.liveinteract.multicohost.service.IMultiCoHostService;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import X.0wQ;
import X.0cb;
import X.0II;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.live.base.model.ImageModel;
import X.0pe;
import X.IAA;
import android.widget.ImageView;
import X.0cm;
import java.util.Map;
import X.0pc;
import java.util.List;
import X.0cB;
import X.0W3;
import X.27R;
import X.15z;
import X.1ci;
import X.27P;
import kotlin.jvm.internal.n;
import X.1mg;
import X.CTM;
import X.2P9;
import android.view.View;
import X.SRS;
import X.F5g;
import X.0nC;
import X.0n9;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0l6;
import X.5DO;
import X.1si;
import X.1It;
import X.1ib;
import X.1so;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract;

public final class MultiMatchBeInvitedFragment extends AbsView
{
    public b LIZ;
    public 1so LJ;
    public 1ib LJFF;
    public 1It LJI;
    public 1si LJII;
    public 1ib LJIIIIZZ;
    public 1It LJIIIZ;
    public 1si LJIIJ;
    public 1ib LJIIJJI;
    public 1si LJIIL;
    public 1si LJIILIIL;
    public 1It LJIILJJIL;
    public 1si LJIILL;
    public 1ib LJIILLIIL;
    public 1It LJIIZILJ;
    public 1si LJIJ;
    public 1ib LJIJI;
    public 1so LJIJJ;
    public 1so LJIJJLI;
    public final 5DO LJIL;
    public 0l6.a LJJ;
    public HashMap LJJI;
    
    static {
        Covode.recordClassIndex(9969);
    }
    
    public MultiMatchBeInvitedFragment() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/liveinteract/multimatch/business/dialog/contract/MultiMatchBeInvitedContract$AbsView.<init>:()V
        //     4: aload_0        
        //     5: new             LX/27M;
        //     8: dup            
        //     9: aload_0        
        //    10: invokespecial   X/27M.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //    13: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    16: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIL:LX/5DO;
        //    19: new             LX/0l3;
        //    22: dup            
        //    23: invokespecial   X/0l3.<init>:()V
        //    26: astore_1       
        //    27: aload_1        
        //    28: aload_0        
        //    29: invokespecial   com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJI:()Z
        //    32: putfield        X/0l3.LJI:Z
        //    35: aload_1        
        //    36: sipush          238
        //    39: putfield        X/0l3.LIZIZ:I
        //    42: ldc             2131830994
        //    44: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //    47: astore_2       
        //    48: aload_2        
        //    49: ldc             ""
        //    51: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    54: aload_1        
        //    55: aload_2        
        //    56: invokevirtual   X/0l3.LIZ:(Ljava/lang/String;)LX/0l3;
        //    59: pop            
        //    60: aload_1        
        //    61: new             LX/27N;
        //    64: dup            
        //    65: aload_0        
        //    66: invokespecial   X/27N.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //    69: putfield        X/0l3.LJII:LX/QgG;
        //    72: aload_1        
        //    73: new             LX/27O;
        //    76: dup            
        //    77: aload_0        
        //    78: invokespecial   X/27O.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //    81: putfield        X/0l3.LJIIIIZZ:LX/QgG;
        //    84: aload_0        
        //    85: aload_1        
        //    86: putfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJJ:LX/0l3;
        //    89: return         
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
    
    private final int LJFF() {
        return ((Number)this.LJIL.getValue()).intValue();
    }
    
    private final boolean LJI() {
        return 0n9.LIZ.LIZJ() == 0nC.ACCEPTED || 0n9.LIZIZ.LIZJ() == 0nC.ACCEPTED;
    }
    
    public final void LIZ() {
        public final class 27S extends F5g implements SRS<View, 2P9>
        {
            public final /* synthetic */ MultiMatchBeInvitedFragment LIZ;
            
            static {
                Covode.recordClassIndex(9975);
            }
            
            public 27S(final MultiMatchBeInvitedFragment liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 27Q extends F5g implements SRS<View, 2P9>
        {
            public final /* synthetic */ MultiMatchBeInvitedFragment LIZ;
            
            static {
                Covode.recordClassIndex(9973);
            }
            
            public 27Q(final MultiMatchBeInvitedFragment liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/liveinteract/cohost/business/contract/InteractDialogFragmentBaseContract$AbsView.LIZJ:LX/0kz;
        //     4: checkcast       LX/1cG;
        //     7: astore_1       
        //     8: aconst_null    
        //     9: astore_2       
        //    10: aload_1        
        //    11: ifnull          198
        //    14: aload_1        
        //    15: invokevirtual   X/1cG.LIZ:()LX/1ci;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ifnull          198
        //    23: aload_1        
        //    24: getfield        X/1ci.LJI:LX/0pc;
        //    27: astore_3       
        //    28: aload_0        
        //    29: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJFF:LX/1ib;
        //    32: astore          4
        //    34: aload           4
        //    36: ifnull          105
        //    39: aload_3        
        //    40: ifnull          183
        //    43: aload_3        
        //    44: getfield        X/0pc.LIZ:LX/0pe;
        //    47: astore_1       
        //    48: aload_1        
        //    49: ifnull          183
        //    52: aload_1        
        //    53: getfield        X/0pe.LIZ:Ljava/lang/String;
        //    56: astore_1       
        //    57: aload_3        
        //    58: getfield        X/0pc.LIZ:LX/0pe;
        //    61: astore_3       
        //    62: aload_1        
        //    63: astore          5
        //    65: aload_2        
        //    66: astore          6
        //    68: aload_3        
        //    69: ifnull          81
        //    72: aload_3        
        //    73: getfield        X/0pe.LIZIZ:Ljava/lang/String;
        //    76: astore          6
        //    78: aload_1        
        //    79: astore          5
        //    81: aload           4
        //    83: ldc             2131830993
        //    85: iconst_1       
        //    86: anewarray       Ljava/lang/Object;
        //    89: dup            
        //    90: iconst_0       
        //    91: aload           5
        //    93: aload           6
        //    95: invokestatic    X/0W3.LIZ:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    98: aastore        
        //    99: invokestatic    X/0cB.LIZ:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   102: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   105: aload_0        
        //   106: invokespecial   com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJI:()Z
        //   109: ifeq            203
        //   112: aload_0        
        //   113: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIJJLI:LX/1so;
        //   116: astore_1       
        //   117: aload_1        
        //   118: ifnull          126
        //   121: aload_1        
        //   122: iconst_0       
        //   123: invokevirtual   X/1so.setVisibility:(I)V
        //   126: aload_0        
        //   127: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJ:LX/1so;
        //   130: astore_1       
        //   131: aload_1        
        //   132: ifnull          141
        //   135: aload_1        
        //   136: bipush          8
        //   138: invokevirtual   X/1so.setVisibility:(I)V
        //   141: aload_0        
        //   142: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIJJ:LX/1so;
        //   145: astore_1       
        //   146: aload_1        
        //   147: ifnull          156
        //   150: aload_1        
        //   151: bipush          8
        //   153: invokevirtual   X/1so.setVisibility:(I)V
        //   156: aload_0        
        //   157: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIJJLI:LX/1so;
        //   160: astore_1       
        //   161: aload_1        
        //   162: ifnull          174
        //   165: aload_1        
        //   166: ldc             2131830995
        //   168: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   171: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   174: aload_0        
        //   175: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJJ:LX/0l3;
        //   178: iconst_1       
        //   179: putfield        X/0l3.LJI:Z
        //   182: return         
        //   183: aconst_null    
        //   184: astore          5
        //   186: aconst_null    
        //   187: astore_1       
        //   188: aload_2        
        //   189: astore          6
        //   191: aload_3        
        //   192: ifnull          81
        //   195: goto            57
        //   198: aconst_null    
        //   199: astore_3       
        //   200: goto            28
        //   203: aload_0        
        //   204: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIJJLI:LX/1so;
        //   207: astore_1       
        //   208: aload_1        
        //   209: ifnull          218
        //   212: aload_1        
        //   213: bipush          8
        //   215: invokevirtual   X/1so.setVisibility:(I)V
        //   218: aload_0        
        //   219: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJ:LX/1so;
        //   222: astore_1       
        //   223: aload_1        
        //   224: ifnull          232
        //   227: aload_1        
        //   228: iconst_0       
        //   229: invokevirtual   X/1so.setVisibility:(I)V
        //   232: aload_0        
        //   233: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIJJ:LX/1so;
        //   236: astore_1       
        //   237: aload_1        
        //   238: ifnull          246
        //   241: aload_1        
        //   242: iconst_0       
        //   243: invokevirtual   X/1so.setVisibility:(I)V
        //   246: aload_0        
        //   247: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJ:LX/1so;
        //   250: astore_1       
        //   251: aload_1        
        //   252: ifnull          277
        //   255: aload_1        
        //   256: ldc             2131829223
        //   258: iconst_1       
        //   259: anewarray       Ljava/lang/Object;
        //   262: dup            
        //   263: iconst_0       
        //   264: ldc2_w          20
        //   267: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   270: aastore        
        //   271: invokestatic    X/0cB.LIZ:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   274: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   277: aload_0        
        //   278: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJ:LX/1so;
        //   281: astore_1       
        //   282: aload_1        
        //   283: ifnull          298
        //   286: aload_1        
        //   287: new             LX/27Q;
        //   290: dup            
        //   291: aload_0        
        //   292: invokespecial   X/27Q.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   295: invokestatic    X/GTi.LIZ:(Landroid/view/View;LX/SRS;)V
        //   298: aload_0        
        //   299: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIJJ:LX/1so;
        //   302: astore_1       
        //   303: aload_1        
        //   304: ifnull          316
        //   307: aload_1        
        //   308: ldc             2131829213
        //   310: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   313: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   316: aload_0        
        //   317: getfield        com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LJIJJ:LX/1so;
        //   320: astore_1       
        //   321: aload_1        
        //   322: ifnull          337
        //   325: aload_1        
        //   326: new             LX/27S;
        //   329: dup            
        //   330: aload_0        
        //   331: invokespecial   X/27S.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   334: invokestatic    X/GTi.LIZ:(Landroid/view/View;LX/SRS;)V
        //   337: return         
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
    
    public final void LIZ(final List<0pc> list, final Map<Long, Boolean> map) {
        if (list != null && list.size() == 2) {
            final 0pc 0pc = list.get(0);
            final Object o = null;
            if (0pc != null) {
                final 1It ljiiljjil = this.LJIILJJIL;
                final 0pe liz = 0pc.LIZ;
                ImageModel lizj;
                if (liz != null) {
                    lizj = liz.LIZJ;
                }
                else {
                    lizj = null;
                }
                final 1It ljiiljjil2 = this.LJIILJJIL;
                int width;
                if (ljiiljjil2 != null) {
                    width = ljiiljjil2.getWidth();
                }
                else {
                    width = 0;
                }
                final 1It ljiiljjil3 = this.LJIILJJIL;
                int height;
                if (ljiiljjil3 != null) {
                    height = ljiiljjil3.getHeight();
                }
                else {
                    height = 0;
                }
                0cm.LIZ(ljiiljjil, lizj, width, height, this.LJFF(), null);
                final 1ib ljiilliil = this.LJIILLIIL;
                if (ljiilliil != null) {
                    final 0pe liz2 = 0pc.LIZ;
                    String liz3;
                    if (liz2 != null) {
                        liz3 = liz2.LIZ;
                    }
                    else {
                        liz3 = null;
                    }
                    final 0pe liz4 = 0pc.LIZ;
                    String liziz;
                    if (liz4 != null) {
                        liziz = liz4.LIZIZ;
                    }
                    else {
                        liziz = null;
                    }
                    ljiilliil.setText((CharSequence)0W3.LIZ(liz3, liziz));
                }
                Object value;
                if (map != null) {
                    value = map.get(0pc.LJIILIIL);
                }
                else {
                    value = null;
                }
                if (n.LIZ(value, (Object)true)) {
                    final 1si ljiill = this.LJIILL;
                    if (ljiill != null) {
                        ljiill.setVisibility(0);
                    }
                }
                else {
                    final 1si ljiill2 = this.LJIILL;
                    if (ljiill2 != null) {
                        ljiill2.setVisibility(8);
                    }
                }
            }
            final 0pc 0pc2 = list.get(1);
            if (0pc2 != null) {
                final 1It ljiizilj = this.LJIIZILJ;
                final 0pe liz5 = 0pc2.LIZ;
                ImageModel lizj2;
                if (liz5 != null) {
                    lizj2 = liz5.LIZJ;
                }
                else {
                    lizj2 = null;
                }
                final 1It ljiizilj2 = this.LJIIZILJ;
                int width2;
                if (ljiizilj2 != null) {
                    width2 = ljiizilj2.getWidth();
                }
                else {
                    width2 = 0;
                }
                final 1It ljiizilj3 = this.LJIIZILJ;
                int height2;
                if (ljiizilj3 != null) {
                    height2 = ljiizilj3.getHeight();
                }
                else {
                    height2 = 0;
                }
                0cm.LIZ(ljiizilj, lizj2, width2, height2, this.LJFF(), null);
                final 1ib ljiji = this.LJIJI;
                if (ljiji != null) {
                    final 0pe liz6 = 0pc2.LIZ;
                    String liz7;
                    if (liz6 != null) {
                        liz7 = liz6.LIZ;
                    }
                    else {
                        liz7 = null;
                    }
                    final 0pe liz8 = 0pc2.LIZ;
                    String liziz2;
                    if (liz8 != null) {
                        liziz2 = liz8.LIZIZ;
                    }
                    else {
                        liziz2 = null;
                    }
                    ljiji.setText((CharSequence)0W3.LIZ(liz7, liziz2));
                }
                Object value2 = o;
                if (map != null) {
                    value2 = map.get(0pc2.LJIILIIL);
                }
                if (n.LIZ(value2, (Object)true)) {
                    final 1si ljij = this.LJIJ;
                    if (ljij != null) {
                        ljij.setVisibility(0);
                    }
                    return;
                }
                final 1si ljij2 = this.LJIJ;
                if (ljij2 != null) {
                    ljij2.setVisibility(8);
                }
            }
        }
    }
    
    public final void LIZIZ(final List<0pc> list, final Map<Long, Boolean> map) {
        if (list != null && list.size() == 2) {
            final 0pc 0pc = list.get(0);
            final Object o = null;
            if (0pc != null) {
                final 1It lji = this.LJI;
                final 0pe liz = 0pc.LIZ;
                ImageModel lizj;
                if (liz != null) {
                    lizj = liz.LIZJ;
                }
                else {
                    lizj = null;
                }
                final 1It lji2 = this.LJI;
                int width;
                if (lji2 != null) {
                    width = lji2.getWidth();
                }
                else {
                    width = 0;
                }
                final 1It lji3 = this.LJI;
                int height;
                if (lji3 != null) {
                    height = lji3.getHeight();
                }
                else {
                    height = 0;
                }
                0cm.LIZ(lji, lizj, width, height, this.LJFF(), null);
                final 1ib ljiiiizz = this.LJIIIIZZ;
                if (ljiiiizz != null) {
                    final 0pe liz2 = 0pc.LIZ;
                    String liz3;
                    if (liz2 != null) {
                        liz3 = liz2.LIZ;
                    }
                    else {
                        liz3 = null;
                    }
                    final 0pe liz4 = 0pc.LIZ;
                    String liziz;
                    if (liz4 != null) {
                        liziz = liz4.LIZIZ;
                    }
                    else {
                        liziz = null;
                    }
                    ljiiiizz.setText((CharSequence)0W3.LIZ(liz3, liziz));
                }
                Object value;
                if (map != null) {
                    value = map.get(0pc.LJIILIIL);
                }
                else {
                    value = null;
                }
                if (n.LIZ(value, (Object)true)) {
                    final 1si ljii = this.LJII;
                    if (ljii != null) {
                        ljii.setVisibility(0);
                    }
                }
                else {
                    final 1si ljii2 = this.LJII;
                    if (ljii2 != null) {
                        ljii2.setVisibility(8);
                    }
                }
            }
            final 0pc 0pc2 = list.get(1);
            if (0pc2 != null) {
                final 1It ljiiiz = this.LJIIIZ;
                final 0pe liz5 = 0pc2.LIZ;
                ImageModel lizj2;
                if (liz5 != null) {
                    lizj2 = liz5.LIZJ;
                }
                else {
                    lizj2 = null;
                }
                final 1It ljiiiz2 = this.LJIIIZ;
                int width2;
                if (ljiiiz2 != null) {
                    width2 = ljiiiz2.getWidth();
                }
                else {
                    width2 = 0;
                }
                final 1It ljiiiz3 = this.LJIIIZ;
                int height2;
                if (ljiiiz3 != null) {
                    height2 = ljiiiz3.getHeight();
                }
                else {
                    height2 = 0;
                }
                0cm.LIZ(ljiiiz, lizj2, width2, height2, this.LJFF(), null);
                final 1ib ljiijji = this.LJIIJJI;
                if (ljiijji != null) {
                    final 0pe liz6 = 0pc2.LIZ;
                    String liz7;
                    if (liz6 != null) {
                        liz7 = liz6.LIZ;
                    }
                    else {
                        liz7 = null;
                    }
                    final 0pe liz8 = 0pc2.LIZ;
                    String liziz2;
                    if (liz8 != null) {
                        liziz2 = liz8.LIZIZ;
                    }
                    else {
                        liziz2 = null;
                    }
                    ljiijji.setText((CharSequence)0W3.LIZ(liz7, liziz2));
                }
                Object value2 = o;
                if (map != null) {
                    value2 = map.get(0pc2.LJIILIIL);
                }
                if (n.LIZ(value2, (Object)true)) {
                    final 1si ljiij = this.LJIIJ;
                    if (ljiij != null) {
                        ljiij.setVisibility(0);
                    }
                    return;
                }
                final 1si ljiij2 = this.LJIIJ;
                if (ljiij2 != null) {
                    ljiij2.setVisibility(8);
                }
            }
        }
    }
    
    public final boolean LIZIZ() {
        long n = 0L;
        Label_0074: {
            if (((MultiMatchBeInvitedContract.AbsView)this).LIZJ() == 1) {
                if (0n9.LIZIZ.LIZJ() != 0nC.NORMAL) {
                    n = 0n9.LIZIZ.LJ();
                    break Label_0074;
                }
            }
            else if (0n9.LIZ.LIZJ() != 0nC.NORMAL) {
                n = 0n9.LIZ.LJ();
                break Label_0074;
            }
            this.LJJ.LJI = true;
            final d liziz = super.LIZIZ;
            if (liziz != null) {
                liziz.dismiss();
            }
            return true;
        }
        if (n == 0L) {
            this.LJJ.LJI = true;
            final d liziz2 = super.LIZIZ;
            if (liziz2 != null) {
                liziz2.dismiss();
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int LIZJ() {
        final b liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz.LIZJ;
    }
    
    @Override
    public final void LIZLLL() {
        final HashMap ljji = this.LJJI;
        if (ljji != null) {
            ljji.clear();
        }
    }
    
    @Override
    public final 0l6.a LJ() {
        return this.LJJ;
    }
    
    @Override
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        CTM.LIZ((Object)layoutInflater);
        final View liz = 0II.LIZ(layoutInflater, 2131561875, viewGroup, false);
        this.LJFF = (1ib)liz.findViewById(2131366575);
        this.LJI = (1It)liz.findViewById(2131371038);
        this.LJII = (1si)liz.findViewById(2131371036);
        this.LJIIIIZZ = (1ib)liz.findViewById(2131371045);
        this.LJIIIZ = (1It)liz.findViewById(2131372140);
        this.LJIIJ = (1si)liz.findViewById(2131372139);
        this.LJIIJJI = (1ib)liz.findViewById(2131372144);
        this.LJIILJJIL = (1It)liz.findViewById(2131370525);
        this.LJIILL = (1si)liz.findViewById(2131370526);
        this.LJIILLIIL = (1ib)liz.findViewById(2131370530);
        this.LJIIZILJ = (1It)liz.findViewById(2131370531);
        this.LJIJ = (1si)liz.findViewById(2131370532);
        this.LJIJI = (1ib)liz.findViewById(2131370536);
        this.LJ = (1so)liz.findViewById(2131364194);
        this.LJIJJ = (1so)liz.findViewById(2131361850);
        this.LJIJJLI = (1so)liz.findViewById(2131374357);
        this.LJIIL = (1si)liz.findViewById(2131366978);
        this.LJIILIIL = (1si)liz.findViewById(2131366977);
        0cb.LIZ((View)this.LJIIL, "tiktok_live_watch_resource", "ttlive_match_multi_be_invited_group_red_bg.png");
        0cb.LIZ((View)this.LJIILIIL, "tiktok_live_watch_resource", "ttlive_match_multi_be_invited_group_blue_bg.png");
        return liz;
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        final InteractDialogFragmentBaseContract.a lizj = super.LIZJ;
        if (lizj != null) {
            lizj.LJII();
        }
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 27U extends F5g implements SRS<0nC, 2P9>
        {
            public final /* synthetic */ MultiMatchBeInvitedFragment LIZ;
            
            static {
                Covode.recordClassIndex(9982);
            }
            
            public 27U(final MultiMatchBeInvitedFragment liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 27T extends F5g implements SRS<Long, 2P9>
        {
            public final /* synthetic */ MultiMatchBeInvitedFragment LIZ;
            
            static {
                Covode.recordClassIndex(9981);
            }
            
            public 27T(final MultiMatchBeInvitedFragment liz) {
                this.LIZ = liz;
                super(1);
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
        //     6: aload_2        
        //     7: invokespecial   com/bytedance/android/livesdk/ui/BaseFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    10: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //    13: astore_3       
        //    14: aload_0        
        //    15: getfield        com/bytedance/android/live/liveinteract/cohost/business/contract/InteractDialogFragmentBaseContract$AbsView.LIZJ:LX/0kz;
        //    18: checkcast       LX/1cG;
        //    21: astore_1       
        //    22: aconst_null    
        //    23: astore          4
        //    25: aload_1        
        //    26: ifnull          353
        //    29: aload_1        
        //    30: invokevirtual   X/1cG.LIZ:()LX/1ci;
        //    33: astore_1       
        //    34: aload_1        
        //    35: ifnull          353
        //    38: aload_1        
        //    39: getfield        X/1ci.LJII:J
        //    42: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    45: astore_1       
        //    46: aload_0        
        //    47: getfield        com/bytedance/android/live/liveinteract/cohost/business/contract/InteractDialogFragmentBaseContract$AbsView.LIZJ:LX/0kz;
        //    50: checkcast       LX/1cG;
        //    53: astore_2       
        //    54: aload_2        
        //    55: ifnull          348
        //    58: aload_2        
        //    59: invokevirtual   X/1cG.LIZ:()LX/1ci;
        //    62: astore_2       
        //    63: aload_2        
        //    64: ifnull          348
        //    67: aload_2        
        //    68: getfield        X/1ci.LJIIIIZZ:Ljava/util/List;
        //    71: astore_2       
        //    72: aload_0        
        //    73: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/business/dialog/contract/MultiMatchBeInvitedContract$AbsView.LIZJ:()I
        //    76: iconst_1       
        //    77: if_icmpne       340
        //    80: getstatic       X/0n9.LIZIZ:LX/1Qk;
        //    83: astore          5
        //    85: aload           5
        //    87: invokevirtual   X/1Qk.LJ:()J
        //    90: lstore          6
        //    92: aload_0        
        //    93: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/business/dialog/contract/MultiMatchBeInvitedContract$AbsView.LIZJ:()I
        //    96: iconst_1       
        //    97: if_icmpne       334
        //   100: iconst_1       
        //   101: istore          8
        //   103: aload_3        
        //   104: aload_1        
        //   105: iconst_1       
        //   106: aload_2        
        //   107: lload           6
        //   109: iload           8
        //   111: invokevirtual   X/0wQ.LIZ:(Ljava/lang/Long;ZLjava/util/List;JZ)V
        //   114: aload_0        
        //   115: getfield        com/bytedance/android/live/liveinteract/cohost/business/contract/InteractDialogFragmentBaseContract$AbsView.LIZJ:LX/0kz;
        //   118: checkcast       LX/1cG;
        //   121: astore_1       
        //   122: aload_1        
        //   123: ifnull          286
        //   126: aload_1        
        //   127: invokevirtual   X/1cG.LIZ:()LX/1ci;
        //   130: astore_2       
        //   131: aload_2        
        //   132: ifnull          286
        //   135: aload_2        
        //   136: getfield        X/1ci.LIZIZ:LX/15z;
        //   139: astore          5
        //   141: ldc_w           Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;.class
        //   144: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   147: checkcast       Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   150: astore_3       
        //   151: aload           4
        //   153: astore_1       
        //   154: aload_3        
        //   155: ifnull          165
        //   158: aload_3        
        //   159: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostLinkedUserList:()Ljava/util/List;
        //   164: astore_1       
        //   165: aload           5
        //   167: aload_1        
        //   168: invokevirtual   androidx/lifecycle/LiveData.setValue:(Ljava/lang/Object;)V
        //   171: aload_2        
        //   172: getfield        X/1ci.LIZLLL:LX/15z;
        //   175: aload_0        
        //   176: new             LX/1bh;
        //   179: dup            
        //   180: aload_2        
        //   181: aload_0        
        //   182: invokespecial   X/1bh.<init>:(LX/1ci;Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   185: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   188: aload_0        
        //   189: aload_2        
        //   190: getfield        X/1ci.LIZLLL:LX/15z;
        //   193: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   196: checkcast       Ljava/util/List;
        //   199: aload_2        
        //   200: getfield        X/1ci.LJFF:LX/15z;
        //   203: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   206: checkcast       Ljava/util/Map;
        //   209: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LIZIZ:(Ljava/util/List;Ljava/util/Map;)V
        //   212: aload_2        
        //   213: getfield        X/1ci.LJ:LX/15z;
        //   216: aload_0        
        //   217: new             LX/1bi;
        //   220: dup            
        //   221: aload_2        
        //   222: aload_0        
        //   223: invokespecial   X/1bi.<init>:(LX/1ci;Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   226: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   229: aload_0        
        //   230: aload_2        
        //   231: getfield        X/1ci.LJ:LX/15z;
        //   234: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   237: checkcast       Ljava/util/List;
        //   240: aload_2        
        //   241: getfield        X/1ci.LJFF:LX/15z;
        //   244: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //   247: checkcast       Ljava/util/Map;
        //   250: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LIZ:(Ljava/util/List;Ljava/util/Map;)V
        //   253: aload_2        
        //   254: getfield        X/1ci.LJFF:LX/15z;
        //   257: aload_0        
        //   258: new             LX/1bj;
        //   261: dup            
        //   262: aload_2        
        //   263: aload_0        
        //   264: invokespecial   X/1bj.<init>:(LX/1ci;Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   267: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   270: aload_2        
        //   271: getfield        X/1ci.LIZIZ:LX/15z;
        //   274: aload_0        
        //   275: new             LX/1bk;
        //   278: dup            
        //   279: aload_0        
        //   280: invokespecial   X/1bk.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   283: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   286: aload_0        
        //   287: invokestatic    X/HAM.LIZ:(Landroidx/fragment/app/Fragment;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   290: astore_1       
        //   291: aload_1        
        //   292: ifnull          329
        //   295: aload_1        
        //   296: aload_0        
        //   297: ldc_w           LX/2F2;.class
        //   300: new             LX/27T;
        //   303: dup            
        //   304: aload_0        
        //   305: invokespecial   X/27T.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   308: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   311: pop            
        //   312: aload_1        
        //   313: aload_0        
        //   314: ldc_w           LX/2FD;.class
        //   317: new             LX/27U;
        //   320: dup            
        //   321: aload_0        
        //   322: invokespecial   X/27U.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment;)V
        //   325: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   328: pop            
        //   329: aload_0        
        //   330: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/business/dialog/MultiMatchBeInvitedFragment.LIZ:()V
        //   333: return         
        //   334: iconst_0       
        //   335: istore          8
        //   337: goto            103
        //   340: getstatic       X/0n9.LIZ:LX/1Qk;
        //   343: astore          5
        //   345: goto            85
        //   348: aconst_null    
        //   349: astore_2       
        //   350: goto            72
        //   353: aconst_null    
        //   354: astore_1       
        //   355: goto            46
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
}
