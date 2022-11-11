// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchMoveToEndWhenUserListChangeSetting;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.match.AudienceTeamMatchEnableBattleEggSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.live.liveinteract.multicohost.service.IMultiCoHostService;
import java.util.Iterator;
import java.util.List;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import org.json.JSONObject;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import kotlin.jvm.internal.n;
import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.covode.number.Covode;
import android.text.SpannableStringBuilder;

public final class 28m extends 1mi implements 1bX
{
    public final 1bZ LJIILJJIL;
    public SpannableStringBuilder LJIILL;
    public 1BF LJIILLIIL;
    public 1Rc LJIIZILJ;
    
    static {
        Covode.recordClassIndex(10181);
    }
    
    public 28m() {
        this.LJIILJJIL = new 1bZ();
    }
    
    @Override
    public final MultiMatchAudienceWidget LIZ() {
        return (MultiMatchAudienceWidget)super.LIZ;
    }
    
    public final void LIZ(Bitmap liz, final 0LL 0ll) {
        if (0ll != null && liz != null) {
            liz = 7sO.LIZ(liz);
            n.LIZIZ((Object)liz, "");
            0ll.LJI = 0x8.LIZ(liz, 0ll.LIZ, 0ll.LIZIZ);
        }
    }
    
    @Override
    public final void LIZ(final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)linkMicBattleMessage);
        final 1bZ ljiiljjil = this.LJIILJJIL;
        CTM.LIZ((Object)linkMicBattleMessage);
        0n9.LIZ.LJIJJLI.clear();
        0n9.LJIIIIZZ.LIZ("audience_open_msg", 0);
        0n9.LIZ.LIZ(linkMicBattleMessage.LIZJ);
        final 1mg ljiiljjil2 = 1mg.LJIILJJIL;
        CTM.LIZ((Object)linkMicBattleMessage);
        1mg.LJIILIIL = Gqs.LIZ();
        final JSONObject jsonObject = new JSONObject();
        ljiiljjil2.LIZ(linkMicBattleMessage, jsonObject);
        0d3.LIZ(jsonObject, "battle_id", linkMicBattleMessage.LIZ);
        1mg.LIZIZ(ljiiljjil2, "open_message", jsonObject, new JSONObject(), new JSONObject(), false, 16);
        final Room ljff = ljiiljjil.LJFF;
        long liz = 0L;
        while (true) {
            Label_0274: {
                if (ljff == null) {
                    break Label_0274;
                }
                final User owner = ljff.getOwner();
                if (owner == null) {
                    break Label_0274;
                }
                final long id = owner.getId();
                final List ljiijji = linkMicBattleMessage.LJIIJJI;
                Iterable iterable = null;
                Iterable liziz = null;
                long ljjiizi = liz;
                if (ljiijji != null) {
                    final Iterator iterator = ljiijji.iterator();
                    while (true) {
                        ljjiizi = liz;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final TeamUsersInfo teamUsersInfo = (TeamUsersInfo)iterator.next();
                        final List liziz2 = teamUsersInfo.LIZIZ;
                        n.LIZIZ((Object)liziz2, "");
                        for (final Object next : liziz2) {
                            final Long n = (Long)next;
                            if (n == null) {
                                continue;
                            }
                            if (n != id) {
                                continue;
                            }
                            if (next != null) {
                                liz = teamUsersInfo.LIZ;
                                break;
                            }
                            break;
                        }
                    }
                }
                0n9.LIZ.LIZ(linkMicBattleMessage.LIZJ);
                0n9.LIZ.LJJIIZI = ljjiizi;
                0n9.LIZ.LJIIIIZZ = linkMicBattleMessage.LJIIJJI;
                ljiiljjil.LIZJ();
                final 1ci lizj = ljiiljjil.LIZJ();
                if (lizj != null) {
                    lizj.LJIILIIL = linkMicBattleMessage.LJIIJJI;
                }
                ljiiljjil.LJII = false;
                final List ljiijji2 = linkMicBattleMessage.LJIIJJI;
                List list;
                if (ljiijji2 != null) {
                    final Iterator iterator3 = ljiijji2.iterator();
                    List liziz3 = null;
                    while (true) {
                        list = liziz3;
                        iterable = liziz;
                        if (!iterator3.hasNext()) {
                            break;
                        }
                        final TeamUsersInfo teamUsersInfo2 = (TeamUsersInfo)iterator3.next();
                        if (teamUsersInfo2.LIZ == 0n9.LIZ.LJJIIZI) {
                            liziz3 = teamUsersInfo2.LIZIZ;
                        }
                        else {
                            liziz = teamUsersInfo2.LIZIZ;
                        }
                    }
                }
                else {
                    list = null;
                }
                final IMultiCoHostService ljiiiizz = ljiiljjil.LJIIIIZZ;
                if (ljiiiizz != null) {
                    final VzU linkSession = ljiiiizz.getLinkSession();
                    if (linkSession != null) {
                        final VvS ljiiiz = linkSession.LJIIIZ();
                        if (ljiiiz != null) {
                            ljiiiz.LIZ(linkMicBattleMessage.LIZ);
                        }
                    }
                    final ArrayList list2 = new ArrayList();
                    final ArrayList list3 = new ArrayList();
                    final VzU linkSession2 = ljiiiizz.getLinkSession();
                    if (linkSession2 != null) {
                        final VvR ljiij = linkSession2.LJIIJ();
                        if (ljiij != null) {
                            final List lizlll = ljiij.LIZLLL();
                            if (lizlll != null) {
                                final Iterator iterator4 = lizlll.iterator();
                                int n2 = 0;
                                while (iterator4.hasNext()) {
                                    final Object next2 = iterator4.next();
                                    if (n2 < 0) {
                                        Ey9.LIZ();
                                    }
                                    final Vwg vwg = (Vwg)next2;
                                    if (list != null && Qsi.LIZ((Iterable)list, (Object)vwg.LIZIZ)) {
                                        list2.add(vwg);
                                    }
                                    else if (iterable != null && Qsi.LIZ(iterable, (Object)vwg.LIZIZ)) {
                                        list3.add(vwg);
                                    }
                                    else {
                                        final StringBuilder sb = new StringBuilder("user is not in team ");
                                        sb.append(vwg.LIZIZ);
                                        0ba.LIZ(6, "MultiMatchAudienceViewP", sb.toString());
                                    }
                                    ++n2;
                                }
                            }
                        }
                    }
                    if (list2.size() == 2 && list3.size() == 2) {
                        final ArrayList list4 = new ArrayList();
                        int n3 = 0;
                        do {
                            list4.add(list2.get(n3));
                            list4.add(list3.get(n3));
                        } while (++n3 <= 1);
                        final VzU linkSession3 = ljiiiizz.getLinkSession();
                        if (linkSession3 != null) {
                            final VvR ljiij2 = linkSession3.LJIIJ();
                            if (ljiij2 != null) {
                                final List lizlll2 = ljiij2.LIZLLL();
                                if (lizlll2 != null) {
                                    final Iterator iterator5 = lizlll2.iterator();
                                    int n4 = 0;
                                    while (iterator5.hasNext()) {
                                        final Object next3 = iterator5.next();
                                        if (n4 < 0) {
                                            Ey9.LIZ();
                                        }
                                        if (n.LIZ((Object)((Vwg)next3).LIZIZ, (Object)((Vwg)list4.get(n4)).LIZIZ) ^ true) {
                                            ljiiljjil.LJII = true;
                                        }
                                        ++n4;
                                    }
                                }
                            }
                        }
                    }
                    else {
                        0ba.LIZ(6, "MultiMatchAudienceViewP", "user list  error");
                    }
                }
                ljiiljjil.LIZIZ(linkMicBattleMessage);
                if (0n9.LIZ.LIZLLL()) {
                    0n9.LIZ.LIZ(0nD.MATCH_OPEN_MESSAGE);
                }
                0n9.LIZ.LJIJI = linkMicBattleMessage.LJ;
                return;
            }
            final long id = 0L;
            continue;
        }
    }
    
    @Override
    public final void LIZ(final BattleTask battleTask) {
        CTM.LIZ((Object)battleTask);
        if (AudienceTeamMatchEnableBattleEggSetting.INSTANCE.getValue()) {
            final 1Rc ljiizilj = this.LJIIZILJ;
            if (ljiizilj != null) {
                ljiizilj.LIZ(battleTask);
            }
            final BattleBonusStatus liziz = battleTask.LIZIZ;
            if (liziz != null) {
                final BattlePrompt ljff = liziz.LJFF;
                if (ljff != null && !TextUtils.isEmpty((CharSequence)ljff.LIZ)) {
                    this.LJIILL = 0nW.LIZ(ljff);
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final BattleTeamResult battleTeamResult, final QgG<2P9> qgG) {
        public final class 28k extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 28m LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(10191);
            }
            
            public 28k(final 28m liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        public final class 28j extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 28m LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(10190);
            }
            
            public 28j(final 28m liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        public final class 28i extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 28m LIZ;
            
            static {
                Covode.recordClassIndex(10189);
            }
            
            public 28i(final 28m liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 28h extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 28m LIZ;
            
            static {
                Covode.recordClassIndex(10188);
            }
            
            public 28h(final 28m liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 28g extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 28m LIZ;
            
            static {
                Covode.recordClassIndex(10187);
            }
            
            public 28g(final 28m liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 28f extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 28m LIZ;
            
            static {
                Covode.recordClassIndex(10186);
            }
            
            public 28f(final 28m liz) {
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
        //     4: aload_1        
        //     5: ifnull          225
        //     8: aload_1        
        //     9: getfield        com/bytedance/android/livesdkapi/depend/model/live/match/BattleTeamResult.LIZJ:I
        //    12: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnonnull       176
        //    20: aload_3        
        //    21: astore_1       
        //    22: aload_1        
        //    23: ifnonnull       128
        //    26: aload_0        
        //    27: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //    30: astore_1       
        //    31: aload_1        
        //    32: ifnull          40
        //    35: aload_1        
        //    36: iconst_0       
        //    37: invokevirtual   X/1si.setVisibility:(I)V
        //    40: aload_0        
        //    41: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //    44: invokevirtual   X/1si.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //    47: astore_1       
        //    48: aload_1        
        //    49: invokestatic    X/0cB.LIZJ:()I
        //    52: putfield        android/view/ViewGroup$LayoutParams.width:I
        //    55: aload_1        
        //    56: invokestatic    X/0cB.LIZJ:()I
        //    59: i2f            
        //    60: ldc_w           0.54933333
        //    63: fmul           
        //    64: f2i            
        //    65: putfield        android/view/ViewGroup$LayoutParams.height:I
        //    68: aload_0        
        //    69: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //    72: aload_1        
        //    73: invokevirtual   X/1si.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //    76: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveBattleDrawOncemoreSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveBattleDrawOncemoreSetting;
        //    79: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveBattleDrawOncemoreSetting.getValue:()Z
        //    82: ifne            230
        //    85: new             LX/28j;
        //    88: dup            
        //    89: aload_0        
        //    90: aload_2        
        //    91: invokespecial   X/28j.<init>:(LX/28m;LX/QgG;)V
        //    94: astore_1       
        //    95: aload_0        
        //    96: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //    99: ldc_w           "tiktok_live_interaction_resource"
        //   102: ldc_w           "live_battle_draw_animation_2.webp"
        //   105: invokestatic    X/0cb.LIZ:(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
        //   108: aload_0        
        //   109: getfield        X/1mi.LJIILIIL:LX/Fhs;
        //   112: new             LX/0wx;
        //   115: dup            
        //   116: aload_1        
        //   117: invokespecial   X/0wx.<init>:(LX/QgG;)V
        //   120: ldc2_w          2600
        //   123: invokevirtual   X/Fhs.postDelayed:(Ljava/lang/Runnable;J)Z
        //   126: pop            
        //   127: return         
        //   128: aload_1        
        //   129: invokevirtual   java/lang/Integer.intValue:()I
        //   132: iconst_1       
        //   133: if_icmpne       26
        //   136: aload_0        
        //   137: aload_0        
        //   138: invokevirtual   X/1cg.LJIILIIL:()LX/1si;
        //   141: new             LX/28h;
        //   144: dup            
        //   145: aload_0        
        //   146: invokespecial   X/28h.<init>:(LX/28m;)V
        //   149: invokevirtual   X/1cg.LIZIZ:(LX/1si;LX/QgG;)V
        //   152: aload_0        
        //   153: aload_0        
        //   154: invokevirtual   X/1cg.LJIILJJIL:()LX/1si;
        //   157: new             LX/28i;
        //   160: dup            
        //   161: aload_0        
        //   162: invokespecial   X/28i.<init>:(LX/28m;)V
        //   165: invokevirtual   X/1cg.LIZ:(LX/1si;LX/QgG;)V
        //   168: aload_2        
        //   169: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //   174: pop            
        //   175: return         
        //   176: aload_3        
        //   177: astore_1       
        //   178: aload_3        
        //   179: invokevirtual   java/lang/Integer.intValue:()I
        //   182: ifne            22
        //   185: aload_0        
        //   186: aload_0        
        //   187: invokevirtual   X/1cg.LJIILIIL:()LX/1si;
        //   190: new             LX/28f;
        //   193: dup            
        //   194: aload_0        
        //   195: invokespecial   X/28f.<init>:(LX/28m;)V
        //   198: invokevirtual   X/1cg.LIZ:(LX/1si;LX/QgG;)V
        //   201: aload_0        
        //   202: aload_0        
        //   203: invokevirtual   X/1cg.LJIILJJIL:()LX/1si;
        //   206: new             LX/28g;
        //   209: dup            
        //   210: aload_0        
        //   211: invokespecial   X/28g.<init>:(LX/28m;)V
        //   214: invokevirtual   X/1cg.LIZIZ:(LX/1si;LX/QgG;)V
        //   217: aload_2        
        //   218: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //   223: pop            
        //   224: return         
        //   225: aconst_null    
        //   226: astore_1       
        //   227: goto            22
        //   230: aload_0        
        //   231: invokevirtual   X/1cg.LJJI:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   234: astore_1       
        //   235: aload_1        
        //   236: ifnull          251
        //   239: aload_1        
        //   240: ldc_w           LX/2F1;.class
        //   243: lconst_0       
        //   244: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   247: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   250: pop            
        //   251: new             LX/0cd;
        //   254: dup            
        //   255: invokespecial   X/0cd.<init>:()V
        //   258: astore_1       
        //   259: aload_1        
        //   260: aload_0        
        //   261: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //   264: invokevirtual   X/0cd.LIZ:(LX/1si;)LX/0cd;
        //   267: pop            
        //   268: aload_1        
        //   269: ldc_w           "tiktok_live_interaction_resource"
        //   272: invokevirtual   X/0cd.LIZ:(Ljava/lang/String;)LX/0cd;
        //   275: pop            
        //   276: aload_1        
        //   277: ldc_w           "live_battle_draw_animation_2.webp"
        //   280: invokevirtual   X/0cd.LIZIZ:(Ljava/lang/String;)LX/0cd;
        //   283: pop            
        //   284: aload_1        
        //   285: iconst_1       
        //   286: putfield        X/0cd.LJ:Z
        //   289: aload_1        
        //   290: iconst_1       
        //   291: putfield        X/0cd.LJIIJ:Z
        //   294: aload_1        
        //   295: iconst_1       
        //   296: putfield        X/0cd.LJI:I
        //   299: aload_1        
        //   300: invokestatic    X/0cb.LIZ:(LX/0cd;)V
        //   303: new             LX/28k;
        //   306: dup            
        //   307: aload_0        
        //   308: aload_2        
        //   309: invokespecial   X/28k.<init>:(LX/28m;LX/QgG;)V
        //   312: astore_1       
        //   313: aload_0        
        //   314: getfield        X/1mi.LJIILIIL:LX/Fhs;
        //   317: new             LX/0wx;
        //   320: dup            
        //   321: aload_1        
        //   322: invokespecial   X/0wx.<init>:(LX/QgG;)V
        //   325: ldc2_w          2600
        //   328: invokevirtual   X/Fhs.postDelayed:(Ljava/lang/Runnable;J)Z
        //   331: pop            
        //   332: return         
        //    Signature:
        //  (Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleTeamResult;LX/QgG<LX/2P9;>;)V
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
    public final void LIZ(final List<Vwg> list, final List<Vwg> list2) {
        int size;
        if (list != null) {
            size = list.size();
        }
        else {
            size = 0;
        }
        int size2;
        if (list2 != null) {
            size2 = list2.size();
        }
        else {
            size2 = 0;
        }
        if (size < size2 && LiveMatchMoveToEndWhenUserListChangeSetting.INSTANCE.getValue()) {
            this.LJIILJJIL.LIZ("link_list_change", false);
        }
    }
    
    @Override
    public final boolean LIZ(final BattleInfoResponse battleInfoResponse, final int n) {
        CTM.LIZ((Object)battleInfoResponse);
        return this.LJIILJJIL.LIZ(battleInfoResponse, n);
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZIZ();
        this.LIZIZ(true);
        this.LJIL();
        final Animator liz = 0vx.LIZ;
        if (liz != null && liz.isRunning()) {
            final Animator liz2 = 0vx.LIZ;
            if (liz2 != null) {
                liz2.end();
            }
        }
        final 0nk liz3 = this.LJIIIZ().LIZ;
        n.LIZIZ((Object)liz3, "");
        liz3.setVisibility(8);
        this.LJIIJ().LIZ.LIZJ();
        final 1BF ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.setVisibility(8);
        }
        this.LJIIL().setVisibility(8);
        this.LJIILIIL().setVisibility(8);
        this.LJIILJJIL().setVisibility(8);
        this.LJIILL().setVisibility(8);
        this.LJIILLIIL().setVisibility(8);
        this.LJIIZILJ().setVisibility(8);
        final 0no liz4 = this.LJIIJJI().LIZ;
        n.LIZIZ((Object)liz4, "");
        liz4.setVisibility(8);
        this.LJIIJJI().LIZ.LIZIZ();
        this.LIZ(4, false);
    }
    
    @Override
    public final void LIZIZ(final String s) {
        this.LJIILJJIL.LIZIZ(s);
    }
    
    @Override
    public final void LIZJ() {
        if (0n9.LIZ.LIZJ().compareTo(0nC.START) <= 0) {
            final 1BF ljiilliil = this.LJIILLIIL;
            if (ljiilliil != null) {
                ljiilliil.LIZ((Animator$AnimatorListener)new 0wy(ljiilliil, this));
                final 2w5 2w5 = new 2w5();
                2w5.element = 0;
                0cb.LIZ(this.LJIILLIIL, "tiktok_live_lottie_resource", "ttlive_multi_match_start_anim.zip", "images", true, new 1ch(2w5), (SRS<? super 0Kp, 2P9>)new 28l(2w5, this));
            }
        }
        if (this.LJIIZILJ().getVisibility() != 0) {
            final 0wQ liziz = 0wQ.LIZIZ;
            final 1ci lizj = this.LJIILJJIL.LIZJ();
            List<TeamUsersInfo> ljiiliil;
            if (lizj != null) {
                ljiiliil = lizj.LJIILIIL;
            }
            else {
                ljiiliil = null;
            }
            liziz.LIZ(false, true, ljiiliil);
        }
        this.LJIIZILJ().setVisibility(0);
        this.LJIIZILJ().post((Runnable)new 0x0(this));
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.LJIIZILJ(), View.ALPHA, new float[] { 0.0f, 1.0f });
        n.LIZIZ((Object)ofFloat, "");
        ofFloat.setDuration(260L);
        ofFloat.setInterpolator((TimeInterpolator)07s.LIZ(0.65f, 0.0f, 0.35f, 1.0f));
        ofFloat.start();
    }
    
    @Override
    public final void LIZJ(final boolean b) {
        final 0wQ liziz = 0wQ.LIZIZ;
        final 1ci lizj = this.LJIILJJIL.LIZJ();
        List<TeamUsersInfo> ljiiliil;
        if (lizj != null) {
            ljiiliil = lizj.LJIILIIL;
        }
        else {
            ljiiliil = null;
        }
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        liziz.LIZ(false, true, ljiiliil, n);
    }
    
    @Override
    public final void LIZLLL() {
        super.LIZLLL();
        if (this.LJIIIZ().LIZ != null) {
            final 0nk liz = this.LJIIIZ().LIZ;
            n.LIZIZ((Object)liz, "");
            liz.setVisibility(0);
            this.LJIIIZ().LIZ.LIZ(true);
            this.LIZ(4, true);
            final 0vx liziz = 0vx.LIZIZ;
            final 0nk liz2 = this.LJIIIZ().LIZ;
            n.LIZIZ((Object)liz2, "");
            liziz.LIZ((View)liz2);
        }
        final 0mM 0mM = this.LJIIJ().LIZ;
        if (0mM != null) {
            0mM.setVisibility(0);
        }
        this.LJIILIIL().setVisibility(8);
        this.LJIILJJIL().setVisibility(8);
        this.LJIILL().setVisibility(8);
        this.LJIILLIIL().setVisibility(8);
        final 0no liz3 = this.LJIIJJI().LIZ;
        n.LIZIZ((Object)liz3, "");
        liz3.setVisibility(0);
        this.LJIIJJI().LIZ.LIZ();
        this.LJJ();
    }
    
    public final void LJ() {
        public final class 0ww implements Runnable
        {
            public final /* synthetic */ 28m LIZ;
            
            static {
                Covode.recordClassIndex(10182);
            }
            
            public 0ww(final 28m liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                1cg.LIZ((1cg<MatchBaseWidget>)this.LIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_1       
        //     2: invokevirtual   X/1cg.LIZIZ:(Z)V
        //     5: aload_0        
        //     6: invokevirtual   X/1cg.LJIIIZ:()LX/0yP;
        //     9: getfield        X/0yP.LIZ:Landroid/view/View;
        //    12: ifnull          43
        //    15: aload_0        
        //    16: invokevirtual   X/1cg.LJIIIZ:()LX/0yP;
        //    19: getfield        X/0yP.LIZ:Landroid/view/View;
        //    22: astore_1       
        //    23: aload_1        
        //    24: ldc             ""
        //    26: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: aload_1        
        //    30: checkcast       LX/0nk;
        //    33: iconst_0       
        //    34: invokevirtual   X/0nk.setVisibility:(I)V
        //    37: aload_0        
        //    38: iconst_4       
        //    39: iconst_1       
        //    40: invokevirtual   X/1cg.LIZ:(IZ)V
        //    43: aload_0        
        //    44: invokevirtual   X/1cg.LJIIJ:()LX/0yP;
        //    47: getfield        X/0yP.LIZ:Landroid/view/View;
        //    50: checkcast       LX/0mM;
        //    53: astore_1       
        //    54: aload_1        
        //    55: ifnull          63
        //    58: aload_1        
        //    59: iconst_0       
        //    60: invokevirtual   X/0mM.setVisibility:(I)V
        //    63: aload_0        
        //    64: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //    67: invokevirtual   android/view/View.getVisibility:()I
        //    70: ifeq            101
        //    73: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //    76: astore_2       
        //    77: aload_0        
        //    78: getfield        X/28m.LJIILJJIL:LX/1bZ;
        //    81: invokevirtual   X/0w8.LIZJ:()LX/1ci;
        //    84: astore_1       
        //    85: aload_1        
        //    86: ifnull          148
        //    89: aload_1        
        //    90: getfield        X/1ci.LJIILIIL:Ljava/util/List;
        //    93: astore_1       
        //    94: aload_2        
        //    95: iconst_0       
        //    96: iconst_1       
        //    97: aload_1        
        //    98: invokevirtual   X/0wQ.LIZ:(ZZLjava/util/List;)V
        //   101: aload_0        
        //   102: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //   105: iconst_0       
        //   106: invokevirtual   android/view/View.setVisibility:(I)V
        //   109: aload_0        
        //   110: invokevirtual   X/1cg.LJIIJJI:()LX/0yP;
        //   113: getfield        X/0yP.LIZ:Landroid/view/View;
        //   116: astore_1       
        //   117: aload_1        
        //   118: ldc             ""
        //   120: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   123: aload_1        
        //   124: checkcast       LX/0no;
        //   127: iconst_0       
        //   128: invokevirtual   X/0no.setVisibility:(I)V
        //   131: aload_0        
        //   132: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //   135: new             LX/0ww;
        //   138: dup            
        //   139: aload_0        
        //   140: invokespecial   X/0ww.<init>:(LX/28m;)V
        //   143: invokevirtual   android/view/View.post:(Ljava/lang/Runnable;)Z
        //   146: pop            
        //   147: return         
        //   148: aconst_null    
        //   149: astore_1       
        //   150: goto            94
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
    
    @Override
    public final void LJIJ() {
        super.LJIJ();
        this.LJIILJJIL.LIZ();
        final DataChannel ljji = this.LJJI();
        if (ljji != null) {
            ljji.LIZIZ((Object)this);
        }
    }
    
    @Override
    public final void LJIJI() {
        super.LJIJI();
        final MatchBaseWidget liz = super.LIZ;
        if (liz != null) {
            this.LJIILLIIL = (1BF)liz.findViewById(2131368358);
            if (AudienceTeamMatchEnableBattleEggSetting.INSTANCE.getValue()) {
                final 1Rc ljiizilj = (1Rc)liz.findViewById(2131367408);
                if ((this.LJIIZILJ = ljiizilj) != null) {
                    ljiizilj.LIZ(this.LJJI());
                }
            }
        }
    }
    
    @Override
    public final boolean LJIJJ() {
        return false;
    }
}
