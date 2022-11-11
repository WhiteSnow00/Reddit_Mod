// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.app.Dialog;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import android.view.View$OnClickListener;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import android.view.ViewPropertyAnimator;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.view.View;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.n;
import java.util.List;
import com.bytedance.covode.number.Covode;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.design.app.LiveDialog;
import android.widget.TextView;

public final class 0re
{
    public TextView LIZ;
    public int LIZIZ;
    public LiveDialog LIZJ;
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LIZLLL;
    public final DataChannel LJ;
    public final FrameLayout LJFF;
    
    static {
        Covode.recordClassIndex(8694);
    }
    
    public 0re(final DataChannel lj, final FrameLayout ljff) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        X/0re.LJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        X/0re.LJFF:Landroid/widget/FrameLayout;
        //    14: aload_0        
        //    15: ldc             4.0
        //    17: invokestatic    X/0cB.LIZ:(F)I
        //    20: putfield        X/0re.LIZIZ:I
        //    23: getstatic       X/1jw.LIZ:LX/1jw;
        //    26: aload_0        
        //    27: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;)V
        //    30: aload_1        
        //    31: ifnull          50
        //    34: aload_1        
        //    35: aload_0        
        //    36: ldc             LX/2D4;.class
        //    38: new             LX/2HA;
        //    41: dup            
        //    42: aload_0        
        //    43: invokespecial   X/2HA.<init>:(LX/0re;)V
        //    46: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    49: pop            
        //    50: return         
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
    
    private final boolean LIZ(final List<? extends Vvh> list) {
        return list.size() >= 2 && list.size() - 1 < 0sD.LIZJ.LIZ().LJFF();
    }
    
    private final boolean LIZJ() {
        if (!0tO.LJFF() && 0jz.LIZJ().getLinkMicState() != 5) {
            final 1NO liz = 1NO.LIZ();
            n.LIZIZ((Object)liz, "");
            final Integer n = (Integer)liz.LJIIIZ;
            if ((n == null || n != 2) && (!this.LJFF() && !GTi.LIZJ(this.LJ) && this.LJ() && this.LIZ(0jz.LIZJ().layoutManager().LIZJ().getAllLayoutWindows()))) {
                return true;
            }
        }
        return false;
    }
    
    private final int LIZLLL() {
        final 1Uo lizlll = this.LIZLLL;
        if (lizlll == null) {
            n.LIZ("");
        }
        if (!lizlll.LJIIIZ) {
            return 2131828867;
        }
        final 1Uo lizlll2 = this.LIZLLL;
        if (lizlll2 == null) {
            n.LIZ("");
        }
        if (lizlll2.LJIIIZ) {
            final 1Uo lizlll3 = this.LIZLLL;
            if (lizlll3 == null) {
                n.LIZ("");
            }
            lizlll3.LJIIIZ = false;
            return 2131831184;
        }
        return 2131831254;
    }
    
    private final boolean LJ() {
        return 0sD.LIZJ.LIZ().LJIIIIZZ() == 0k8.FLOATING;
    }
    
    private final boolean LJFF() {
        final List allLayoutWindows = 0jz.LIZJ().layoutManager().LIZJ().getAllLayoutWindows();
        final LLU selfLinkInfo = 0jz.LIZJ().selfLinkInfo();
        String lizj;
        if (selfLinkInfo != null) {
            lizj = selfLinkInfo.LIZJ;
        }
        else {
            lizj = null;
        }
        if (!(allLayoutWindows instanceof Collection) || !allLayoutWindows.isEmpty()) {
            final Iterator iterator = allLayoutWindows.iterator();
            while (iterator.hasNext()) {
                if (n.LIZ((Object)((Vvh)iterator.next()).LIZIZ(), (Object)lizj)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void LIZ() {
        final TextView liz = this.LIZ;
        if (liz != null) {
            0sM.LIZ((View)liz);
        }
    }
    
    public final void LIZ(final String s) {
        0xy.LIZIZ = "black_button";
        0xt.LIZ(0sD.LIZJ.LIZ().LJIIIIZZ(), s);
    }
    
    public final void LIZ(final boolean b) {
        if (b) {
            final TextView liz = this.LIZ;
            if ((liz == null || liz.getVisibility() != 0) && this.LIZJ()) {
                final TextView liz2 = this.LIZ;
                if (liz2 != null) {
                    GTi.LIZ((View)liz2, true);
                }
                final TextView liz3 = this.LIZ;
                if (liz3 != null) {
                    liz3.setAlpha(0.0f);
                }
                final TextView liz4 = this.LIZ;
                if (liz4 != null) {
                    final ViewPropertyAnimator animate = liz4.animate();
                    if (animate != null) {
                        final ViewPropertyAnimator alpha = animate.alpha(1.0f);
                        if (alpha != null) {
                            final ViewPropertyAnimator setDuration = alpha.setDuration(800L);
                            if (setDuration != null) {
                                setDuration.start();
                            }
                        }
                    }
                }
                final DataChannel lj = this.LJ;
                while (true) {
                    Label_0153: {
                        if (lj == null) {
                            break Label_0153;
                        }
                        final Room room = (Room)lj.LIZIZ((Class)G69.class);
                        if (room == null) {
                            break Label_0153;
                        }
                        final User owner = room.getOwner();
                        if (owner == null) {
                            break Label_0153;
                        }
                        final FollowInfo followInfo = owner.getFollowInfo();
                        if (followInfo == null) {
                            break Label_0153;
                        }
                        final long followStatus = followInfo.getFollowStatus();
                        0xy.LIZ("black_button", followStatus);
                        return;
                    }
                    final long followStatus = 0L;
                    continue;
                }
            }
        }
        else {
            final TextView liz5 = this.LIZ;
            if (liz5 != null) {
                GTi.LIZ((View)liz5, false);
            }
            this.LIZ();
        }
    }
    
    public final void LIZIZ() {
        final TextView liz = this.LIZ;
        if (liz != null) {
            float textSize;
            if (liz.getLineCount() >= 3) {
                textSize = 10.0f;
            }
            else {
                textSize = 12.0f;
            }
            liz.setTextSize(textSize);
        }
    }
    
    public final void LIZIZ(final boolean b) {
        public final class 0rc implements Runnable
        {
            public final /* synthetic */ int LIZ;
            public final /* synthetic */ 0re LIZIZ;
            public final /* synthetic */ List LIZJ;
            
            static {
                Covode.recordClassIndex(8698);
            }
            
            public 0rc(final int liz, final 0re liziz, final List lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            @Override
            public final void run() {
                final TextView liz = this.LIZIZ.LIZ;
                final int n = 0;
                int height = 0;
                int liziz;
                if (liz != null && liz.getVisibility() == 0) {
                    final TextView liz2 = this.LIZIZ.LIZ;
                    if (liz2 != null) {
                        height = liz2.getHeight();
                    }
                    liziz = height + this.LIZIZ.LIZIZ;
                }
                else {
                    liziz = n;
                    if (this.LIZJ.size() - 1 > 0) {
                        liziz = this.LIZIZ.LIZIZ;
                    }
                }
                final DataChannel lj = this.LIZIZ.LJ;
                if (lj != null) {
                    lj.LIZIZ((Class)2EZ.class, (Object)new 0kI(this.LIZJ.size() - 1, this.LIZ + liziz));
                }
            }
        }
        public final class 0rd implements View$OnClickListener
        {
            public final /* synthetic */ 0re LIZ;
            
            static {
                Covode.recordClassIndex(8699);
            }
            
            public 0rd(final 0re liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final 0re liz = this.LIZ;
                0xy.LIZIZ = "black_button";
                final DataChannel lj = liz.LJ;
                while (true) {
                    Label_0360: {
                        if (lj == null) {
                            break Label_0360;
                        }
                        final Room room = (Room)lj.LIZIZ((Class)G69.class);
                        if (room == null) {
                            break Label_0360;
                        }
                        final User owner = room.getOwner();
                        if (owner == null) {
                            break Label_0360;
                        }
                        final FollowInfo followInfo = owner.getFollowInfo();
                        if (followInfo == null) {
                            break Label_0360;
                        }
                        final long followStatus = followInfo.getFollowStatus();
                        0xt.LIZ("black_button", followStatus);
                        final TextView liz2 = liz.LIZ;
                        CharSequence text;
                        if (liz2 != null) {
                            text = liz2.getText();
                        }
                        else {
                            text = null;
                        }
                        if (!n.LIZ((Object)text, (Object)0cB.LIZ(2131828867))) {
                            final 1NO liz3 = 1NO.LIZ();
                            n.LIZIZ((Object)liz3, "");
                            final Integer n = (Integer)liz3.LJIIIZ;
                            if (n == null || n != 1) {
                                final 1NO liz4 = 1NO.LIZ();
                                kotlin.jvm.internal.n.LIZIZ((Object)liz4, "");
                                final Integer n2 = (Integer)liz4.LJIIIZ;
                                if ((n2 == null || n2 != 2) && 0jz.LIZJ().getLinkMicState() != 5) {
                                    if (!LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC)) {
                                        LiveAppBundleUtils.ensurePluginAvailable$default(Gqy.LINK_MIC, (H8A)null, false, 6, (Object)null);
                                        Hf4.LIZ(0cB.LJ(), 2131831427);
                                        return;
                                    }
                                    final DataChannel lj2 = liz.LJ;
                                    if (lj2 != null) {
                                        lj2.LIZJ((Class)2Fq.class, (Object)new 1ZS(-1, 0, 0, 0, 26));
                                    }
                                }
                                return;
                            }
                        }
                        final LiveDialog lizj = liz.LIZJ;
                        if (lizj != null) {
                            0sM.LIZ(lizj);
                        }
                        final FrameLayout ljff = liz.LJFF;
                        if (ljff != null) {
                            final LiveDialog.a a = new LiveDialog.a(ljff.getContext());
                            a.LIZIZ(2131832296);
                            a.LIZJ(2131832297);
                            a.LIZ(2131832295, (LiveDialog.b)new 1V8(liz));
                            a.LIZIZ(2131831458, (LiveDialog.b)1V9.LIZ);
                            liz.LIZJ = a.LIZIZ();
                            final LiveDialog lizj2 = liz.LIZJ;
                            if (lizj2 != null) {
                                lizj2.show();
                                KN6.LIZ.LIZ((Dialog)lizj2);
                            }
                            liz.LIZ("show");
                            final 1Uo lizlll = liz.LIZLLL;
                            if (lizlll == null) {
                                n.LIZ("");
                            }
                            lizlll.LJJIFFI = -1;
                        }
                        return;
                    }
                    final long followStatus = 0L;
                    continue;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //     9: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.layoutManager:()LX/VvS;
        //    14: invokeinterface X/VvS.LIZJ:()LX/Vva;
        //    19: invokeinterface X/Vva.getAllLayoutWindows:()Ljava/util/List;
        //    24: astore_2       
        //    25: aload_0        
        //    26: getfield        X/0re.LJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    29: astore_3       
        //    30: iload_1        
        //    31: ifeq            598
        //    34: aload_3        
        //    35: ifnull          46
        //    38: aload_3        
        //    39: invokestatic    X/GTi.LIZJ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Z
        //    42: iconst_1       
        //    43: if_icmpeq       598
        //    46: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //    49: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.getLinkMicState:()I
        //    54: iconst_5       
        //    55: if_icmpeq       598
        //    58: aload_0        
        //    59: invokespecial   X/0re.LJFF:()Z
        //    62: ifne            598
        //    65: invokestatic    X/1NO.LIZ:()LX/1NO;
        //    68: astore_3       
        //    69: aload_3        
        //    70: ldc             ""
        //    72: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    75: aload_3        
        //    76: getfield        X/G1k.LJIIIZ:Ljava/lang/Object;
        //    79: checkcast       Ljava/lang/Integer;
        //    82: astore_3       
        //    83: aload_3        
        //    84: ifnonnull       554
        //    87: aload_0        
        //    88: invokespecial   X/0re.LJ:()Z
        //    91: ifeq            598
        //    94: aload_0        
        //    95: aload_2        
        //    96: invokespecial   X/0re.LIZ:(Ljava/util/List;)Z
        //    99: ifeq            598
        //   102: aload_0        
        //   103: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   106: astore_3       
        //   107: aconst_null    
        //   108: astore          4
        //   110: aload_3        
        //   111: ifnonnull       153
        //   114: aload_0        
        //   115: getfield        X/0re.LJFF:Landroid/widget/FrameLayout;
        //   118: astore_3       
        //   119: aload_3        
        //   120: ifnull          549
        //   123: aload_3        
        //   124: invokevirtual   android/widget/FrameLayout.getContext:()Landroid/content/Context;
        //   127: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   130: ldc_w           2131562372
        //   133: aload_3        
        //   134: iconst_0       
        //   135: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   138: astore_3       
        //   139: aload_3        
        //   140: ifnull          579
        //   143: aload_3        
        //   144: checkcast       Landroid/widget/TextView;
        //   147: astore_3       
        //   148: aload_0        
        //   149: aload_3        
        //   150: putfield        X/0re.LIZ:Landroid/widget/TextView;
        //   153: aload_0        
        //   154: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   157: astore_3       
        //   158: aload_3        
        //   159: ifnull          182
        //   162: aload_3        
        //   163: invokevirtual   android/widget/TextView.getParent:()Landroid/view/ViewParent;
        //   166: ifnull          182
        //   169: aload_0        
        //   170: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   173: astore_3       
        //   174: aload_3        
        //   175: ifnull          182
        //   178: aload_3        
        //   179: invokestatic    X/0sM.LIZ:(Landroid/view/View;)V
        //   182: aload_0        
        //   183: getfield        X/0re.LJFF:Landroid/widget/FrameLayout;
        //   186: astore          5
        //   188: aload           5
        //   190: ifnull          572
        //   193: aload_2        
        //   194: aload_2        
        //   195: invokeinterface java/util/List.size:()I
        //   200: iconst_1       
        //   201: isub           
        //   202: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   207: checkcast       LX/Vvh;
        //   210: invokeinterface X/Vvh.LJI:()Landroid/graphics/Rect;
        //   215: astore          6
        //   217: aload           5
        //   219: invokevirtual   android/widget/FrameLayout.getHeight:()I
        //   222: aload           6
        //   224: getfield        android/graphics/Rect.top:I
        //   227: isub           
        //   228: ldc             4.0
        //   230: invokestatic    X/0cB.LIZ:(F)I
        //   233: iadd           
        //   234: istore          7
        //   236: aload_0        
        //   237: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   240: astore_3       
        //   241: aload_3        
        //   242: ifnull          544
        //   245: aload_3        
        //   246: invokevirtual   android/widget/TextView.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   249: astore_3       
        //   250: aload_3        
        //   251: instanceof      Landroid/widget/FrameLayout$LayoutParams;
        //   254: ifne            541
        //   257: aload           4
        //   259: astore_3       
        //   260: aload_3        
        //   261: checkcast       Landroid/widget/FrameLayout$LayoutParams;
        //   264: astore_3       
        //   265: aload_3        
        //   266: ifnull          311
        //   269: aload_3        
        //   270: bipush          -2
        //   272: putfield        android/widget/FrameLayout$LayoutParams.height:I
        //   275: aload_3        
        //   276: iload           7
        //   278: putfield        android/widget/FrameLayout$LayoutParams.bottomMargin:I
        //   281: aload_3        
        //   282: aload           6
        //   284: getfield        android/graphics/Rect.right:I
        //   287: aload           6
        //   289: getfield        android/graphics/Rect.left:I
        //   292: isub           
        //   293: putfield        android/widget/FrameLayout$LayoutParams.width:I
        //   296: aload_3        
        //   297: aload           5
        //   299: invokevirtual   android/widget/FrameLayout.getRight:()I
        //   302: aload           6
        //   304: getfield        android/graphics/Rect.right:I
        //   307: isub           
        //   308: putfield        android/widget/FrameLayout$LayoutParams.rightMargin:I
        //   311: aload_0        
        //   312: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   315: astore          4
        //   317: aload           4
        //   319: ifnull          328
        //   322: aload           4
        //   324: aload_3        
        //   325: invokevirtual   android/widget/TextView.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   328: aload_0        
        //   329: invokevirtual   X/0re.LIZIZ:()V
        //   332: aload           5
        //   334: aload_0        
        //   335: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   338: invokevirtual   android/widget/FrameLayout.addView:(Landroid/view/View;)V
        //   341: aload_0        
        //   342: invokespecial   X/0re.LIZJ:()Z
        //   345: ifeq            533
        //   348: aload_0        
        //   349: iconst_1       
        //   350: invokevirtual   X/0re.LIZ:(Z)V
        //   353: aload_0        
        //   354: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   357: astore_3       
        //   358: aload_3        
        //   359: ifnull          455
        //   362: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //   365: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.getLinkMicState:()I
        //   370: ifne            385
        //   373: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //   376: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.getLinkMicState:()I
        //   381: iconst_1       
        //   382: if_icmpeq       526
        //   385: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //   388: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.getLinkMicState:()I
        //   393: iconst_2       
        //   394: if_icmpne       404
        //   397: aload_0        
        //   398: invokespecial   X/0re.LJFF:()Z
        //   401: ifeq            517
        //   404: invokestatic    X/1NO.LIZ:()LX/1NO;
        //   407: astore          4
        //   409: aload           4
        //   411: ldc             ""
        //   413: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   416: aload           4
        //   418: getfield        X/G1k.LJIIIZ:Ljava/lang/Object;
        //   421: checkcast       Ljava/lang/Integer;
        //   424: astore          4
        //   426: aload           4
        //   428: ifnonnull       508
        //   431: aload_0        
        //   432: invokespecial   X/0re.LJFF:()Z
        //   435: ifeq            526
        //   438: aload_0        
        //   439: iconst_0       
        //   440: invokevirtual   X/0re.LIZ:(Z)V
        //   443: aload_0        
        //   444: invokespecial   X/0re.LIZLLL:()I
        //   447: istore          8
        //   449: aload_3        
        //   450: iload           8
        //   452: invokevirtual   android/widget/TextView.setText:(I)V
        //   455: aload_0        
        //   456: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   459: astore_3       
        //   460: aload_3        
        //   461: ifnull          480
        //   464: aload_3        
        //   465: new             LX/0rc;
        //   468: dup            
        //   469: iload           7
        //   471: aload_0        
        //   472: aload_2        
        //   473: invokespecial   X/0rc.<init>:(ILX/0re;Ljava/util/List;)V
        //   476: invokevirtual   android/widget/TextView.post:(Ljava/lang/Runnable;)Z
        //   479: pop            
        //   480: aload_0        
        //   481: getfield        X/0re.LIZ:Landroid/widget/TextView;
        //   484: astore_3       
        //   485: aload_3        
        //   486: ifnull          565
        //   489: aload_3        
        //   490: new             LX/0rd;
        //   493: dup            
        //   494: aload_0        
        //   495: invokespecial   X/0rd.<init>:(LX/0re;)V
        //   498: invokevirtual   android/widget/TextView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   501: sipush          8541
        //   504: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   507: return         
        //   508: aload           4
        //   510: invokevirtual   java/lang/Integer.intValue:()I
        //   513: iconst_1       
        //   514: if_icmpne       431
        //   517: aload_0        
        //   518: invokespecial   X/0re.LIZLLL:()I
        //   521: istore          8
        //   523: goto            449
        //   526: ldc             2131831184
        //   528: istore          8
        //   530: goto            449
        //   533: aload_0        
        //   534: iconst_0       
        //   535: invokevirtual   X/0re.LIZ:(Z)V
        //   538: goto            480
        //   541: goto            260
        //   544: aconst_null    
        //   545: astore_3       
        //   546: goto            250
        //   549: aconst_null    
        //   550: astore_3       
        //   551: goto            148
        //   554: aload_3        
        //   555: invokevirtual   java/lang/Integer.intValue:()I
        //   558: iconst_2       
        //   559: if_icmpeq       598
        //   562: goto            87
        //   565: sipush          8541
        //   568: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   571: return         
        //   572: sipush          8541
        //   575: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   578: return         
        //   579: new             Ljava/lang/NullPointerException;
        //   582: dup            
        //   583: ldc_w           "null cannot be cast to non-null type android.widget.TextView"
        //   586: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   589: astore_3       
        //   590: sipush          8541
        //   593: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   596: aload_3        
        //   597: athrow         
        //   598: aload_0        
        //   599: iconst_0       
        //   600: invokevirtual   X/0re.LIZ:(Z)V
        //   603: sipush          8541
        //   606: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   609: return         
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
