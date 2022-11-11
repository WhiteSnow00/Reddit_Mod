// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.ref.WeakReference;
import com.bytedance.android.live.liveinteract.multicohost.service.IMultiCoHostService;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTips;
import com.bytedance.android.livesdk.model.message.battle.TruthOrDareTip;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuide;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.content.Context;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareOptOutNotice;
import kotlin.n.y;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import java.util.ArrayList;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import java.util.Iterator;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchMoveToEndWhenUserListChangeSetting;
import java.util.List;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import android.view.ViewStub;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.text.SpannableStringBuilder;
import android.view.View;

public final class 293 extends 1mi implements 1bY
{
    public 1si LJIILJJIL;
    public View LJIILL;
    public SpannableStringBuilder LJIILLIIL;
    public 1Rc LJIIZILJ;
    public 0oi LJIJ;
    public 0oi LJIJI;
    public final 1ba LJIJJ;
    public Runnable LJIJJLI;
    
    static {
        Covode.recordClassIndex(10198);
    }
    
    public 293() {
        this.LJIJJ = new 1ba();
    }
    
    private final void LJJIIJZLJL() {
        final 0oD ljiijji = super.LJIIJJI;
        if (ljiijji != null && ljiijji.getVisibility() == 0) {
            final 0oD ljiijji2 = super.LJIIJJI;
            if (ljiijji2 != null) {
                ljiijji2.LIZ();
            }
            final 0mM 0mM = this.LJIIJ().LIZ;
            if (0mM != null) {
                0mM.LJ();
            }
            this.LJIILJJIL().setTranslationY(0.0f);
            this.LJIILIIL().setTranslationY(0.0f);
            final 0oi ljij = this.LJIJ;
            if (ljij == null) {
                n.LIZ("");
            }
            ljij.setTranslationY(0.0f);
            final 0oi ljiji = this.LJIJI;
            if (ljiji == null) {
                n.LIZ("");
            }
            ljiji.setTranslationY(0.0f);
            GTi.LIZ((View)super.LJIIJJI);
        }
    }
    
    private final void LJJIIZ() {
        MethodCollector.i(9480);
        if (super.LJIIJJI == null) {
            final MatchBaseWidget liz = super.LIZ;
            0oD ljiijji;
            final 0oD 0oD = ljiijji = null;
            if (liz != null) {
                final ViewStub viewStub = (ViewStub)liz.findViewById(2131367493);
                ljiijji = 0oD;
                if (viewStub != null) {
                    final View inflate = viewStub.inflate();
                    ljiijji = 0oD;
                    if (inflate != null) {
                        ljiijji = (0oD)inflate.findViewById(2131367491);
                    }
                }
            }
            super.LJIIJJI = ljiijji;
        }
        MethodCollector.o(9480);
    }
    
    private final void LJJIIZI() {
        final 1si ljiiljjil = this.LJIILJJIL();
        ljiiljjil.setTranslationY(ljiiljjil.getTranslationY() - 0cB.LIZ(26.0f));
        final 1si ljiiliil = this.LJIILIIL();
        ljiiliil.setTranslationY(ljiiliil.getTranslationY() - 0cB.LIZ(26.0f));
        final 0oi ljij = this.LJIJ;
        if (ljij == null) {
            n.LIZ("");
        }
        ljij.setTranslationY(ljij.getTranslationY() - 0cB.LIZ(26.0f));
        final 0oi ljiji = this.LJIJI;
        if (ljiji == null) {
            n.LIZ("");
        }
        ljiji.setTranslationY(ljiji.getTranslationY() - 0cB.LIZ(26.0f));
    }
    
    @Override
    public final MultiMatchAudienceWidget LIZ() {
        return (MultiMatchAudienceWidget)super.LIZ;
    }
    
    @Override
    public final void LIZ(final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)linkMicBattleMessage);
        this.LJIJJ.LIZIZ(linkMicBattleMessage);
    }
    
    @Override
    public final void LIZ(final BattleResult battleResult, final QgG<2P9> qgG) {
        public final class 28t extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 293 LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(10209);
            }
            
            public 28t(final 293 liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        public final class 28s extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 293 LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(10208);
            }
            
            public 28s(final 293 liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        public final class 28r extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 293 LIZ;
            
            static {
                Covode.recordClassIndex(10207);
            }
            
            public 28r(final 293 liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 28q extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 293 LIZ;
            
            static {
                Covode.recordClassIndex(10206);
            }
            
            public 28q(final 293 liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 28p extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 293 LIZ;
            
            static {
                Covode.recordClassIndex(10205);
            }
            
            public 28p(final 293 liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 28o extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 293 LIZ;
            
            static {
                Covode.recordClassIndex(10204);
            }
            
            public 28o(final 293 liz) {
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
        //     4: aconst_null    
        //     5: astore_3       
        //     6: iconst_2       
        //     7: istore          4
        //     9: aload_1        
        //    10: ifnull          21
        //    13: aload_1        
        //    14: getfield        com/bytedance/android/livesdk/model/message/battle/BattleResult.LIZIZ:I
        //    17: iconst_2       
        //    18: if_icmpeq       107
        //    21: getstatic       X/0n9.LIZ:LX/1Qk;
        //    24: getfield        X/1Qk.LJJIJIIJI:Z
        //    27: ifeq            100
        //    30: aload_0        
        //    31: getfield        X/1cg.LJIIJJI:LX/0oD;
        //    34: astore          5
        //    36: aload           5
        //    38: ifnull          72
        //    41: aload_0        
        //    42: invokevirtual   X/1cg.LJIIJ:()LX/0yP;
        //    45: getfield        X/0yP.LIZ:Landroid/view/View;
        //    48: checkcast       LX/0mM;
        //    51: astore          6
        //    53: aload           6
        //    55: ifnull          1081
        //    58: aload           6
        //    60: invokevirtual   X/0mM.LIZLLL:()Landroid/animation/AnimatorSet;
        //    63: astore          6
        //    65: aload           5
        //    67: aload           6
        //    69: invokevirtual   X/0oD.LIZ:(Landroid/animation/AnimatorSet;)V
        //    72: aload_0        
        //    73: getfield        X/1cg.LJIIJJI:LX/0oD;
        //    76: astore          6
        //    78: aload           6
        //    80: ifnull          100
        //    83: aload_1        
        //    84: ifnull          93
        //    87: aload_1        
        //    88: getfield        com/bytedance/android/livesdk/model/message/battle/BattleResult.LIZIZ:I
        //    91: istore          4
        //    93: aload           6
        //    95: iload           4
        //    97: invokevirtual   X/0oD.LIZ:(I)V
        //   100: aload_3        
        //   101: astore          6
        //   103: aload_1        
        //   104: ifnull          116
        //   107: aload_1        
        //   108: getfield        com/bytedance/android/livesdk/model/message/battle/BattleResult.LIZIZ:I
        //   111: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   114: astore          6
        //   116: aload           6
        //   118: ifnonnull       230
        //   121: aload_0        
        //   122: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //   125: iconst_0       
        //   126: invokevirtual   X/1si.setVisibility:(I)V
        //   129: aload_0        
        //   130: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //   133: invokevirtual   X/1si.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   136: astore_1       
        //   137: aload_1        
        //   138: invokestatic    X/0cB.LIZJ:()I
        //   141: putfield        android/view/ViewGroup$LayoutParams.width:I
        //   144: aload_1        
        //   145: invokestatic    X/0cB.LIZJ:()I
        //   148: i2f            
        //   149: ldc_w           0.54933333
        //   152: fmul           
        //   153: f2i            
        //   154: putfield        android/view/ViewGroup$LayoutParams.height:I
        //   157: aload_0        
        //   158: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //   161: aload_1        
        //   162: invokevirtual   X/1si.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   165: getstatic       X/0n9.LIZ:LX/1Qk;
        //   168: getfield        X/1Qk.LJJIJIIJI:Z
        //   171: ifeq            178
        //   174: aload_0        
        //   175: invokespecial   X/293.LJJIIJZLJL:()V
        //   178: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveBattleDrawOncemoreSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveBattleDrawOncemoreSetting;
        //   181: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveBattleDrawOncemoreSetting.getValue:()Z
        //   184: ifne            1087
        //   187: new             LX/28s;
        //   190: dup            
        //   191: aload_0        
        //   192: aload_2        
        //   193: invokespecial   X/28s.<init>:(LX/293;LX/QgG;)V
        //   196: astore_1       
        //   197: aload_0        
        //   198: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //   201: ldc_w           "tiktok_live_interaction_resource"
        //   204: ldc_w           "live_battle_draw_animation_2.webp"
        //   207: invokestatic    X/0cb.LIZ:(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
        //   210: aload_0        
        //   211: getfield        X/1mi.LJIILIIL:LX/Fhs;
        //   214: new             LX/0x4;
        //   217: dup            
        //   218: aload_1        
        //   219: invokespecial   X/0x4.<init>:(LX/QgG;)V
        //   222: ldc2_w          2600
        //   225: invokevirtual   X/Fhs.postDelayed:(Ljava/lang/Runnable;J)Z
        //   228: pop            
        //   229: return         
        //   230: aload           6
        //   232: invokevirtual   java/lang/Integer.intValue:()I
        //   235: ifne            646
        //   238: aload_0        
        //   239: aload_0        
        //   240: invokevirtual   X/1cg.LJIILIIL:()LX/1si;
        //   243: new             LX/28o;
        //   246: dup            
        //   247: aload_0        
        //   248: invokespecial   X/28o.<init>:(LX/293;)V
        //   251: invokevirtual   X/1cg.LIZ:(LX/1si;LX/QgG;)V
        //   254: aload_0        
        //   255: aload_0        
        //   256: invokevirtual   X/1cg.LJIILJJIL:()LX/1si;
        //   259: new             LX/28p;
        //   262: dup            
        //   263: aload_0        
        //   264: invokespecial   X/28p.<init>:(LX/293;)V
        //   267: invokevirtual   X/1cg.LIZIZ:(LX/1si;LX/QgG;)V
        //   270: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   273: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //   278: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   283: astore          5
        //   285: aload           5
        //   287: invokeinterface java/util/Iterator.hasNext:()Z
        //   292: ifeq            1190
        //   295: aload           5
        //   297: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   302: checkcast       LX/0pc;
        //   305: astore_3       
        //   306: aload_0        
        //   307: getfield        X/1cg.LIZ:Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;
        //   310: astore_1       
        //   311: aload_1        
        //   312: ifnull          285
        //   315: aload_1        
        //   316: aload_3        
        //   317: getfield        X/0pc.LJIILIIL:J
        //   320: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:(J)LX/1Sk;
        //   323: astore          7
        //   325: aload           7
        //   327: ifnull          285
        //   330: getstatic       X/0n9.LIZ:LX/1Qk;
        //   333: getfield        X/1Qk.LJII:Ljava/util/Map;
        //   336: astore_1       
        //   337: aload_1        
        //   338: ifnull          285
        //   341: aload_1        
        //   342: aload_3        
        //   343: getfield        X/0pc.LJIILIIL:J
        //   346: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   349: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   354: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   357: astore_1       
        //   358: aload_1        
        //   359: ifnull          285
        //   362: aload           7
        //   364: invokevirtual   X/1Sk.getWinStreakInfo:()Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   367: astore          6
        //   369: aload_0        
        //   370: invokevirtual   X/1cg.LJJIFFI:()Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   373: astore          8
        //   375: aload           8
        //   377: ifnull          471
        //   380: aload           8
        //   382: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   385: astore          8
        //   387: aload           8
        //   389: ifnull          471
        //   392: aload           8
        //   394: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   397: aload_3        
        //   398: getfield        X/0pc.LJIILIIL:J
        //   401: lcmp           
        //   402: ifne            471
        //   405: aload_0        
        //   406: getfield        X/293.LJIJ:LX/0oi;
        //   409: astore          8
        //   411: aload           8
        //   413: ifnonnull       421
        //   416: ldc             ""
        //   418: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   421: aload           6
        //   423: ifnonnull       465
        //   426: aload_1        
        //   427: astore_3       
        //   428: aload           8
        //   430: aload_3        
        //   431: aload_1        
        //   432: invokevirtual   X/0oi.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //   435: aload           6
        //   437: ifnonnull       455
        //   440: aload           7
        //   442: aload_1        
        //   443: new             LX/28z;
        //   446: dup            
        //   447: aload_1        
        //   448: aload_0        
        //   449: invokespecial   X/28z.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/293;)V
        //   452: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/SRS;)V
        //   455: aload           7
        //   457: aload_1        
        //   458: iconst_1       
        //   459: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Z)V
        //   462: goto            285
        //   465: aload           6
        //   467: astore_3       
        //   468: goto            428
        //   471: getstatic       X/0n9.LIZ:LX/1Qk;
        //   474: getfield        X/1Qk.LJJIJIIJI:Z
        //   477: ifeq            580
        //   480: aload_1        
        //   481: getfield        com/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo.LIZIZ:J
        //   484: lconst_0       
        //   485: lcmp           
        //   486: ifne            510
        //   489: aload_0        
        //   490: getfield        X/293.LJIJI:LX/0oi;
        //   493: astore_1       
        //   494: aload_1        
        //   495: ifnonnull       503
        //   498: ldc             ""
        //   500: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   503: aload_1        
        //   504: invokestatic    X/GTi.LIZ:(Landroid/view/View;)V
        //   507: goto            285
        //   510: aload_0        
        //   511: invokespecial   X/293.LJJIIZI:()V
        //   514: aload_0        
        //   515: getfield        X/293.LJIJI:LX/0oi;
        //   518: astore          8
        //   520: aload           8
        //   522: ifnonnull       530
        //   525: ldc             ""
        //   527: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   530: aload           6
        //   532: ifnonnull       574
        //   535: aload_1        
        //   536: astore_3       
        //   537: aload           8
        //   539: aload_3        
        //   540: aload_1        
        //   541: invokevirtual   X/0oi.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //   544: aload           6
        //   546: ifnonnull       564
        //   549: aload           7
        //   551: aload_1        
        //   552: new             LX/290;
        //   555: dup            
        //   556: aload_1        
        //   557: aload_0        
        //   558: invokespecial   X/290.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/293;)V
        //   561: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/SRS;)V
        //   564: aload           7
        //   566: aload_1        
        //   567: iconst_0       
        //   568: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Z)V
        //   571: goto            285
        //   574: aload           6
        //   576: astore_3       
        //   577: goto            537
        //   580: aload_0        
        //   581: getfield        X/293.LJIJI:LX/0oi;
        //   584: astore          8
        //   586: aload           8
        //   588: ifnonnull       596
        //   591: ldc             ""
        //   593: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   596: aload           6
        //   598: ifnonnull       640
        //   601: aload_1        
        //   602: astore_3       
        //   603: aload           8
        //   605: aload_3        
        //   606: aload_1        
        //   607: invokevirtual   X/0oi.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //   610: aload           6
        //   612: ifnonnull       630
        //   615: aload           7
        //   617: aload_1        
        //   618: new             LX/291;
        //   621: dup            
        //   622: aload_1        
        //   623: aload_0        
        //   624: invokespecial   X/291.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/293;)V
        //   627: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/SRS;)V
        //   630: aload           7
        //   632: aload_1        
        //   633: iconst_0       
        //   634: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Z)V
        //   637: goto            285
        //   640: aload           6
        //   642: astore_3       
        //   643: goto            603
        //   646: aload           6
        //   648: invokevirtual   java/lang/Integer.intValue:()I
        //   651: iconst_1       
        //   652: if_icmpne       121
        //   655: aload_0        
        //   656: aload_0        
        //   657: invokevirtual   X/1cg.LJIILIIL:()LX/1si;
        //   660: new             LX/28q;
        //   663: dup            
        //   664: aload_0        
        //   665: invokespecial   X/28q.<init>:(LX/293;)V
        //   668: invokevirtual   X/1cg.LIZIZ:(LX/1si;LX/QgG;)V
        //   671: aload_0        
        //   672: aload_0        
        //   673: invokevirtual   X/1cg.LJIILJJIL:()LX/1si;
        //   676: new             LX/28r;
        //   679: dup            
        //   680: aload_0        
        //   681: invokespecial   X/28r.<init>:(LX/293;)V
        //   684: invokevirtual   X/1cg.LIZ:(LX/1si;LX/QgG;)V
        //   687: iconst_3       
        //   688: ldc_w           "TwoMatchAudienceWidgetV"
        //   691: ldc_w           "showLossStreaks"
        //   694: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   697: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   700: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //   705: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   710: astore          5
        //   712: aload           5
        //   714: invokeinterface java/util/Iterator.hasNext:()Z
        //   719: ifeq            1198
        //   722: aload           5
        //   724: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   729: checkcast       LX/0pc;
        //   732: astore_3       
        //   733: aload_0        
        //   734: getfield        X/1cg.LIZ:Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;
        //   737: astore_1       
        //   738: aload_1        
        //   739: ifnull          712
        //   742: aload_1        
        //   743: aload_3        
        //   744: getfield        X/0pc.LJIILIIL:J
        //   747: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:(J)LX/1Sk;
        //   750: astore          7
        //   752: aload           7
        //   754: ifnull          712
        //   757: getstatic       X/0n9.LIZ:LX/1Qk;
        //   760: getfield        X/1Qk.LJII:Ljava/util/Map;
        //   763: astore_1       
        //   764: aload_1        
        //   765: ifnull          712
        //   768: aload_1        
        //   769: aload_3        
        //   770: getfield        X/0pc.LJIILIIL:J
        //   773: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   776: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   781: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   784: astore          6
        //   786: aload           6
        //   788: ifnull          712
        //   791: aload           7
        //   793: invokevirtual   X/1Sk.getWinStreakInfo:()Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   796: astore_1       
        //   797: aload_0        
        //   798: invokevirtual   X/1cg.LJJIFFI:()Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   801: astore          8
        //   803: aload           8
        //   805: ifnull          1013
        //   808: aload           8
        //   810: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   813: astore          8
        //   815: aload           8
        //   817: ifnull          1013
        //   820: aload           8
        //   822: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   825: aload_3        
        //   826: getfield        X/0pc.LJIILIIL:J
        //   829: lcmp           
        //   830: ifne            1013
        //   833: getstatic       X/0n9.LIZ:LX/1Qk;
        //   836: getfield        X/1Qk.LJJIJIIJI:Z
        //   839: ifeq            945
        //   842: aload           6
        //   844: getfield        com/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo.LIZIZ:J
        //   847: lconst_0       
        //   848: lcmp           
        //   849: ifne            873
        //   852: aload_0        
        //   853: getfield        X/293.LJIJI:LX/0oi;
        //   856: astore_1       
        //   857: aload_1        
        //   858: ifnonnull       866
        //   861: ldc             ""
        //   863: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   866: aload_1        
        //   867: invokestatic    X/GTi.LIZ:(Landroid/view/View;)V
        //   870: goto            712
        //   873: aload_0        
        //   874: invokespecial   X/293.LJJIIZI:()V
        //   877: aload_0        
        //   878: getfield        X/293.LJIJ:LX/0oi;
        //   881: astore          8
        //   883: aload           8
        //   885: ifnonnull       893
        //   888: ldc             ""
        //   890: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   893: aload_1        
        //   894: ifnonnull       940
        //   897: aload           6
        //   899: astore_3       
        //   900: aload           8
        //   902: aload_3        
        //   903: aload           6
        //   905: invokevirtual   X/0oi.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //   908: aload_1        
        //   909: ifnonnull       929
        //   912: aload           7
        //   914: aload           6
        //   916: new             LX/28w;
        //   919: dup            
        //   920: aload           6
        //   922: aload_0        
        //   923: invokespecial   X/28w.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/293;)V
        //   926: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/SRS;)V
        //   929: aload           7
        //   931: aload           6
        //   933: iconst_0       
        //   934: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Z)V
        //   937: goto            712
        //   940: aload_1        
        //   941: astore_3       
        //   942: goto            900
        //   945: aload_0        
        //   946: getfield        X/293.LJIJ:LX/0oi;
        //   949: astore          8
        //   951: aload           8
        //   953: ifnonnull       961
        //   956: ldc             ""
        //   958: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   961: aload_1        
        //   962: ifnonnull       1008
        //   965: aload           6
        //   967: astore_3       
        //   968: aload           8
        //   970: aload_3        
        //   971: aload           6
        //   973: invokevirtual   X/0oi.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //   976: aload_1        
        //   977: ifnonnull       997
        //   980: aload           7
        //   982: aload           6
        //   984: new             LX/28x;
        //   987: dup            
        //   988: aload           6
        //   990: aload_0        
        //   991: invokespecial   X/28x.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/293;)V
        //   994: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/SRS;)V
        //   997: aload           7
        //   999: aload           6
        //  1001: iconst_0       
        //  1002: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Z)V
        //  1005: goto            712
        //  1008: aload_1        
        //  1009: astore_3       
        //  1010: goto            968
        //  1013: aload_0        
        //  1014: getfield        X/293.LJIJI:LX/0oi;
        //  1017: astore          8
        //  1019: aload           8
        //  1021: ifnonnull       1029
        //  1024: ldc             ""
        //  1026: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //  1029: aload_1        
        //  1030: ifnonnull       1076
        //  1033: aload           6
        //  1035: astore_3       
        //  1036: aload           8
        //  1038: aload_3        
        //  1039: aload           6
        //  1041: invokevirtual   X/0oi.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;)V
        //  1044: aload_1        
        //  1045: ifnonnull       1065
        //  1048: aload           7
        //  1050: aload           6
        //  1052: new             LX/28y;
        //  1055: dup            
        //  1056: aload           6
        //  1058: aload_0        
        //  1059: invokespecial   X/28y.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/293;)V
        //  1062: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/SRS;)V
        //  1065: aload           7
        //  1067: aload           6
        //  1069: iconst_1       
        //  1070: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;Z)V
        //  1073: goto            712
        //  1076: aload_1        
        //  1077: astore_3       
        //  1078: goto            1036
        //  1081: aconst_null    
        //  1082: astore          6
        //  1084: goto            65
        //  1087: aload_0        
        //  1088: invokevirtual   X/1cg.LJJI:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //  1091: astore_1       
        //  1092: aload_1        
        //  1093: ifnull          1108
        //  1096: aload_1        
        //  1097: ldc_w           LX/2F1;.class
        //  1100: lconst_0       
        //  1101: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1104: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //  1107: pop            
        //  1108: new             LX/0cd;
        //  1111: dup            
        //  1112: invokespecial   X/0cd.<init>:()V
        //  1115: astore_1       
        //  1116: aload_1        
        //  1117: aload_0        
        //  1118: invokevirtual   X/1cg.LJIIL:()LX/1si;
        //  1121: invokevirtual   X/0cd.LIZ:(LX/1si;)LX/0cd;
        //  1124: pop            
        //  1125: aload_1        
        //  1126: ldc_w           "tiktok_live_interaction_resource"
        //  1129: invokevirtual   X/0cd.LIZ:(Ljava/lang/String;)LX/0cd;
        //  1132: pop            
        //  1133: aload_1        
        //  1134: ldc_w           "live_battle_draw_animation_2.webp"
        //  1137: invokevirtual   X/0cd.LIZIZ:(Ljava/lang/String;)LX/0cd;
        //  1140: pop            
        //  1141: aload_1        
        //  1142: iconst_1       
        //  1143: putfield        X/0cd.LJ:Z
        //  1146: aload_1        
        //  1147: iconst_1       
        //  1148: putfield        X/0cd.LJIIJ:Z
        //  1151: aload_1        
        //  1152: iconst_1       
        //  1153: putfield        X/0cd.LJI:I
        //  1156: aload_1        
        //  1157: invokestatic    X/0cb.LIZ:(LX/0cd;)V
        //  1160: new             LX/28t;
        //  1163: dup            
        //  1164: aload_0        
        //  1165: aload_2        
        //  1166: invokespecial   X/28t.<init>:(LX/293;LX/QgG;)V
        //  1169: astore_1       
        //  1170: aload_0        
        //  1171: getfield        X/1mi.LJIILIIL:LX/Fhs;
        //  1174: new             LX/0x4;
        //  1177: dup            
        //  1178: aload_1        
        //  1179: invokespecial   X/0x4.<init>:(LX/QgG;)V
        //  1182: ldc2_w          2600
        //  1185: invokevirtual   X/Fhs.postDelayed:(Ljava/lang/Runnable;J)Z
        //  1188: pop            
        //  1189: return         
        //  1190: aload_2        
        //  1191: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //  1196: pop            
        //  1197: return         
        //  1198: aload_2        
        //  1199: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //  1204: pop            
        //  1205: return         
        //    Signature:
        //  (Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;LX/QgG<LX/2P9;>;)V
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
    public final void LIZ(final BattleTask battleTask) {
        CTM.LIZ((Object)battleTask);
        final 1Rc ljiizilj = this.LJIIZILJ;
        if (ljiizilj == null) {
            n.LIZ("");
        }
        ljiizilj.LIZ(battleTask);
        final BattleBonusStatus liziz = battleTask.LIZIZ;
        if (liziz != null) {
            final BattlePrompt ljff = liziz.LJFF;
            if (ljff != null && !TextUtils.isEmpty((CharSequence)ljff.LIZ)) {
                this.LJIILLIIL = 0nW.LIZ(ljff);
            }
        }
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
            this.LJIJJ.LIZ("link_list_change", false);
        }
    }
    
    @Override
    public final void LIZ(final boolean b) {
        public final class 0x5 implements Runnable
        {
            public final /* synthetic */ 293 LIZ;
            
            static {
                Covode.recordClassIndex(10203);
            }
            
            public 0x5(final 293 liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                if (0n9.LIZ.LIZLLL()) {
                    this.LIZ.LJI();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   X/1Qk.LIZJ:()LX/0nC;
        //     6: getstatic       X/0nC.PUNISH:LX/0nC;
        //     9: if_acmpne       264
        //    12: getstatic       X/0n9.LIZ:LX/1Qk;
        //    15: getfield        X/1Qk.LJJIJIIJIL:Z
        //    18: ifne            264
        //    21: getstatic       X/0n9.LIZ:LX/1Qk;
        //    24: getfield        X/1Qk.LJJIJIIJI:Z
        //    27: ifeq            264
        //    30: aload_0        
        //    31: invokespecial   X/293.LJJIIZ:()V
        //    34: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //    37: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //    42: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    47: astore_2       
        //    48: aconst_null    
        //    49: astore_3       
        //    50: aconst_null    
        //    51: astore          4
        //    53: aload_2        
        //    54: invokeinterface java/util/Iterator.hasNext:()Z
        //    59: ifeq            151
        //    62: aload_2        
        //    63: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    68: checkcast       LX/0pc;
        //    71: astore          5
        //    73: aload_0        
        //    74: getfield        X/1cg.LIZ:Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;
        //    77: astore          6
        //    79: aload           6
        //    81: ifnull          53
        //    84: aload           6
        //    86: aload           5
        //    88: getfield        X/0pc.LJIILIIL:J
        //    91: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:(J)LX/1Sk;
        //    94: astore          6
        //    96: aload           6
        //    98: ifnull          53
        //   101: aload_0        
        //   102: invokevirtual   X/1cg.LJJIFFI:()Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   105: astore          7
        //   107: aload           7
        //   109: ifnull          138
        //   112: aload           7
        //   114: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   117: astore          7
        //   119: aload           7
        //   121: ifnull          138
        //   124: aload           7
        //   126: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   129: aload           5
        //   131: getfield        X/0pc.LJIILIIL:J
        //   134: lcmp           
        //   135: ifeq            53
        //   138: aload           6
        //   140: ldc_w           2131365287
        //   143: invokevirtual   X/1Sk.findViewById:(I)Landroid/view/View;
        //   146: astore          4
        //   148: goto            53
        //   151: aload_0        
        //   152: invokevirtual   X/1cg.LJJI:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   155: astore_2       
        //   156: aload_0        
        //   157: getfield        X/1cg.LIZ:Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;
        //   160: astore          5
        //   162: aload           5
        //   164: ifnull          173
        //   167: aload           5
        //   169: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.getContext:()Landroid/content/Context;
        //   172: astore_3       
        //   173: new             LX/0nN;
        //   176: dup            
        //   177: aload_2        
        //   178: aload_3        
        //   179: aload           4
        //   181: invokespecial   X/0nN.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;Landroid/content/Context;Landroid/view/View;)V
        //   184: astore          4
        //   186: aload_0        
        //   187: getfield        X/1cg.LJIIJJI:LX/0oD;
        //   190: astore_3       
        //   191: aload_3        
        //   192: ifnull          201
        //   195: aload_3        
        //   196: aload           4
        //   198: invokevirtual   X/0oD.setVictoryLapActivityListener:(LX/0nN;)V
        //   201: aload_0        
        //   202: getfield        X/1cg.LJIIJJI:LX/0oD;
        //   205: invokestatic    X/GTi.LIZIZ:(Landroid/view/View;)V
        //   208: aload_0        
        //   209: getfield        X/1cg.LJIIJJI:LX/0oD;
        //   212: astore          4
        //   214: aload           4
        //   216: ifnull          224
        //   219: aload           4
        //   221: invokevirtual   X/0oD.LIZJ:()V
        //   224: aload_0        
        //   225: invokevirtual   X/1cg.LJIIJ:()LX/0yP;
        //   228: getfield        X/0yP.LIZ:Landroid/view/View;
        //   231: checkcast       LX/0mM;
        //   234: astore          4
        //   236: aload           4
        //   238: ifnull          246
        //   241: aload           4
        //   243: invokevirtual   X/0mM.LJFF:()V
        //   246: iconst_4       
        //   247: ldc_w           "TwoMatchAudienceWidgetV"
        //   250: ldc_w           " audience enter in punish status "
        //   253: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   256: getstatic       X/0n9.LIZ:LX/1Qk;
        //   259: iconst_1       
        //   260: putfield        X/1Qk.LJJIJIIJIL:Z
        //   263: return         
        //   264: getstatic       X/0n9.LIZ:LX/1Qk;
        //   267: getfield        X/1Qk.LJJIJIIJI:Z
        //   270: ifeq            387
        //   273: getstatic       X/0n9.LIZ:LX/1Qk;
        //   276: getfield        X/1Qk.LJJIJIIJIL:Z
        //   279: ifne            387
        //   282: getstatic       X/0n9.LIZ:LX/1Qk;
        //   285: invokevirtual   X/1Qk.LIZLLL:()Z
        //   288: ifeq            387
        //   291: aload_0        
        //   292: invokespecial   X/293.LJJIIZ:()V
        //   295: iload_1        
        //   296: ifeq            321
        //   299: getstatic       X/0n9.LIZ:LX/1Qk;
        //   302: iconst_1       
        //   303: putfield        X/1Qk.LJJIJIIJIL:Z
        //   306: iconst_4       
        //   307: ldc_w           "TwoMatchAudienceWidgetV"
        //   310: ldc_w           " trigger animator normal play "
        //   313: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   316: aload_0        
        //   317: invokevirtual   X/293.LJI:()V
        //   320: return         
        //   321: getstatic       X/0n9.LIZ:LX/1Qk;
        //   324: iconst_1       
        //   325: putfield        X/1Qk.LJJIJIIJIL:Z
        //   328: iconst_4       
        //   329: ldc_w           "TwoMatchAudienceWidgetV"
        //   332: ldc_w           " trigger animator delay play "
        //   335: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   338: aload_0        
        //   339: getfield        X/293.LJIJJLI:Ljava/lang/Runnable;
        //   342: astore          4
        //   344: aload           4
        //   346: ifnull          358
        //   349: aload_0        
        //   350: getfield        X/1mi.LJIILIIL:LX/Fhs;
        //   353: aload           4
        //   355: invokevirtual   X/Fhs.removeCallbacks:(Ljava/lang/Runnable;)V
        //   358: new             LX/0x5;
        //   361: dup            
        //   362: aload_0        
        //   363: invokespecial   X/0x5.<init>:(LX/293;)V
        //   366: astore          4
        //   368: aload_0        
        //   369: aload           4
        //   371: putfield        X/293.LJIJJLI:Ljava/lang/Runnable;
        //   374: aload_0        
        //   375: getfield        X/1mi.LJIILIIL:LX/Fhs;
        //   378: aload           4
        //   380: ldc2_w          2000
        //   383: invokevirtual   X/Fhs.postDelayed:(Ljava/lang/Runnable;J)Z
        //   386: pop            
        //   387: return         
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
    
    @Override
    public final boolean LIZ(final BattleInfoResponse battleInfoResponse, final int n) {
        CTM.LIZ((Object)battleInfoResponse);
        final String liziz = 0b8.a.LIZJ.LIZIZ((Object)battleInfoResponse);
        n.LIZIZ((Object)liziz, "");
        1lI.LIZ("audience_start", liziz);
        return this.LJIJJ.LIZIZ(battleInfoResponse);
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZIZ();
        this.LIZIZ(true);
        if (0n9.LIZ.LJJIJIIJI) {
            final Runnable ljijjli = this.LJIJJLI;
            if (ljijjli != null) {
                super.LJIILIIL.removeCallbacks(ljijjli);
            }
            this.LJJIIJZLJL();
        }
        this.LJIL();
        final 0nk liz = this.LJIIIZ().LIZ;
        n.LIZIZ((Object)liz, "");
        liz.setVisibility(8);
        this.LJIIJ().LIZ.LIZJ();
        final 1si ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            n.LIZ("");
        }
        ljiiljjil.setVisibility(8);
        this.LJIIL().setVisibility(8);
        this.LJIILIIL().setVisibility(8);
        this.LJIILJJIL().setVisibility(8);
        this.LJIILL().setVisibility(8);
        this.LJIILLIIL().setVisibility(8);
        this.LJIIZILJ().setVisibility(8);
        final 0no liz2 = this.LJIIJJI().LIZ;
        n.LIZIZ((Object)liz2, "");
        liz2.setVisibility(8);
        this.LJIIJJI().LIZ.LIZIZ();
        for (final 0pc 0pc : 0jz.LIZLLL().getCoHostUserList()) {
            final MatchBaseWidget liz3 = super.LIZ;
            if (liz3 != null) {
                final 1Sk liz4 = liz3.LIZ(0pc.LJIILIIL);
                if (liz4 == null) {
                    continue;
                }
                liz4.LJ();
            }
        }
        this.LIZ(2, false);
        final DataChannel ljji = this.LJJI();
        if (ljji != null) {
            ljji.LIZJ((Class)2EJ.class, (Object)new 0kK(0kL.MATCH, 0kM.END, 4));
        }
        this.LJIJJLI();
        this.LJJIII();
    }
    
    @Override
    public final void LIZIZ(final String s) {
    }
    
    @Override
    public final void LIZJ() {
    }
    
    @Override
    public final void LIZJ(final boolean b) {
        final 0wQ liziz = 0wQ.LIZIZ;
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        liziz.LIZ(false, false, null, n);
    }
    
    @Override
    public final void LIZLLL() {
        public final class 0x3 implements Runnable
        {
            public final /* synthetic */ 293 LIZ;
            
            static {
                Covode.recordClassIndex(10201);
            }
            
            public 0x3(final 293 liz) {
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
        //     1: invokespecial   X/1cg.LIZLLL:()V
        //     4: aload_0        
        //     5: invokevirtual   X/1cg.LJIIIZ:()LX/0yP;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          332
        //    13: aload_1        
        //    14: getfield        X/0yP.LIZ:Landroid/view/View;
        //    17: astore_1       
        //    18: aload_1        
        //    19: ifnull          64
        //    22: aload_0        
        //    23: invokevirtual   X/1cg.LJIIIZ:()LX/0yP;
        //    26: getfield        X/0yP.LIZ:Landroid/view/View;
        //    29: astore_1       
        //    30: aload_1        
        //    31: ldc             ""
        //    33: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    36: aload_1        
        //    37: checkcast       LX/0nk;
        //    40: iconst_0       
        //    41: invokevirtual   X/0nk.setVisibility:(I)V
        //    44: aload_0        
        //    45: invokevirtual   X/1cg.LJIIIZ:()LX/0yP;
        //    48: getfield        X/0yP.LIZ:Landroid/view/View;
        //    51: checkcast       LX/0nk;
        //    54: iconst_1       
        //    55: invokevirtual   X/0nk.LIZ:(Z)V
        //    58: aload_0        
        //    59: iconst_2       
        //    60: iconst_1       
        //    61: invokevirtual   X/1cg.LIZ:(IZ)V
        //    64: aload_0        
        //    65: invokespecial   X/293.LJJIIJZLJL:()V
        //    68: aload_0        
        //    69: invokevirtual   X/1cg.LJIJJLI:()V
        //    72: aload_0        
        //    73: invokevirtual   X/1cg.LJJIII:()V
        //    76: getstatic       X/0n9.LIZ:LX/1Qk;
        //    79: invokevirtual   X/1Qk.LIZ:()Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleUserInfo;
        //    82: astore_1       
        //    83: getstatic       X/0n9.LIZ:LX/1Qk;
        //    86: invokevirtual   X/1Qk.LIZIZ:()Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleUserInfo;
        //    89: astore_2       
        //    90: aload_0        
        //    91: getfield        X/1cg.LIZ:Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;
        //    94: astore_3       
        //    95: aload_3        
        //    96: ifnull          138
        //    99: aload_3        
        //   100: ldc_w           2131367406
        //   103: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //   106: checkcast       LX/0op;
        //   109: astore_3       
        //   110: aload_3        
        //   111: aload_1        
        //   112: aload_2        
        //   113: invokevirtual   X/0op.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleUserInfo;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleUserInfo;)V
        //   116: aload_3        
        //   117: new             LX/28u;
        //   120: dup            
        //   121: aload_3        
        //   122: aload_0        
        //   123: invokespecial   X/28u.<init>:(LX/0op;LX/293;)V
        //   126: new             LX/28v;
        //   129: dup            
        //   130: aload_3        
        //   131: aload_0        
        //   132: invokespecial   X/28v.<init>:(LX/0op;LX/293;)V
        //   135: invokevirtual   X/0op.LIZ:(LX/QgG;LX/QgG;)V
        //   138: iconst_3       
        //   139: ldc_w           "TwoMatchAudienceWidgetV"
        //   142: ldc_w           "pk combo showWinningStreakTips"
        //   145: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   148: aload_0        
        //   149: getfield        X/1cg.LIZ:Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;
        //   152: astore_3       
        //   153: aload_3        
        //   154: ifnull          404
        //   157: new             Ljava/util/ArrayList;
        //   160: dup            
        //   161: invokespecial   java/util/ArrayList.<init>:()V
        //   164: astore_2       
        //   165: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   168: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //   173: astore_1       
        //   174: aload_1        
        //   175: ifnull          337
        //   178: aload_1        
        //   179: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   184: astore          4
        //   186: aload           4
        //   188: invokeinterface java/util/Iterator.hasNext:()Z
        //   193: ifeq            337
        //   196: aload           4
        //   198: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   203: checkcast       LX/0pc;
        //   206: astore_1       
        //   207: aload_3        
        //   208: aload_1        
        //   209: getfield        X/0pc.LJIILIIL:J
        //   212: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:(J)LX/1Sk;
        //   215: astore          5
        //   217: aload           5
        //   219: ifnull          285
        //   222: getstatic       X/0n9.LIZ:LX/1Qk;
        //   225: getfield        X/1Qk.LJII:Ljava/util/Map;
        //   228: astore          6
        //   230: aload           6
        //   232: ifnull          280
        //   235: aload           6
        //   237: aload_1        
        //   238: getfield        X/0pc.LJIILIIL:J
        //   241: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   244: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   249: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;
        //   252: astore_1       
        //   253: aload           5
        //   255: aload_1        
        //   256: new             LX/292;
        //   259: dup            
        //   260: aload_1        
        //   261: aload_0        
        //   262: invokespecial   X/292.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/293;)V
        //   265: invokevirtual   X/1Sk.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;LX/SRS;)V
        //   268: aload_2        
        //   269: aload           5
        //   271: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   276: pop            
        //   277: goto            186
        //   280: aconst_null    
        //   281: astore_1       
        //   282: goto            253
        //   285: new             Ljava/lang/StringBuilder;
        //   288: dup            
        //   289: ldc_w           "showWinningStreakTips uid="
        //   292: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   295: astore          5
        //   297: aload           5
        //   299: aload_1        
        //   300: getfield        X/0pc.LJIILIIL:J
        //   303: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   306: pop            
        //   307: aload           5
        //   309: ldc_w           " window dimiss"
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: pop            
        //   316: bipush          6
        //   318: ldc_w           "TwoMatchAudienceWidgetV"
        //   321: aload           5
        //   323: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   326: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   329: goto            186
        //   332: aconst_null    
        //   333: astore_1       
        //   334: goto            18
        //   337: getstatic       X/0n9.LIZ:LX/1Qk;
        //   340: getfield        X/1Qk.LJII:Ljava/util/Map;
        //   343: astore          4
        //   345: aload           4
        //   347: ifnull          387
        //   350: aload_0        
        //   351: invokevirtual   X/1cg.LJJIFFI:()Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   354: astore_1       
        //   355: aload_1        
        //   356: ifnull          994
        //   359: aload_1        
        //   360: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   363: astore_1       
        //   364: aload_1        
        //   365: ifnull          994
        //   368: aload_1        
        //   369: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   372: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   375: astore_1       
        //   376: aload           4
        //   378: aload_1        
        //   379: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   384: ifnonnull       620
        //   387: aload_0        
        //   388: getfield        X/293.LJIILLIIL:Landroid/text/SpannableStringBuilder;
        //   391: ifnonnull       620
        //   394: iconst_3       
        //   395: ldc_w           "TwoMatchAudienceWidgetV"
        //   398: ldc_w           "curAnchorCombo pk combo empty or battleTaskEnterRoomPrompt null"
        //   401: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   404: aload_0        
        //   405: invokevirtual   X/1cg.LJIIJ:()LX/0yP;
        //   408: astore_1       
        //   409: aload_1        
        //   410: ifnull          430
        //   413: aload_1        
        //   414: getfield        X/0yP.LIZ:Landroid/view/View;
        //   417: checkcast       LX/0mM;
        //   420: astore_1       
        //   421: aload_1        
        //   422: ifnull          430
        //   425: aload_1        
        //   426: iconst_0       
        //   427: invokevirtual   X/0mM.setVisibility:(I)V
        //   430: aload_0        
        //   431: invokevirtual   X/1cg.LJIILIIL:()LX/1si;
        //   434: astore_1       
        //   435: aload_1        
        //   436: ifnull          445
        //   439: aload_1        
        //   440: bipush          8
        //   442: invokevirtual   X/1si.setVisibility:(I)V
        //   445: aload_0        
        //   446: invokevirtual   X/1cg.LJIILJJIL:()LX/1si;
        //   449: astore_1       
        //   450: aload_1        
        //   451: ifnull          460
        //   454: aload_1        
        //   455: bipush          8
        //   457: invokevirtual   X/1si.setVisibility:(I)V
        //   460: aload_0        
        //   461: invokevirtual   X/1cg.LJIILL:()LX/1si;
        //   464: astore_1       
        //   465: aload_1        
        //   466: ifnull          475
        //   469: aload_1        
        //   470: bipush          8
        //   472: invokevirtual   X/1si.setVisibility:(I)V
        //   475: aload_0        
        //   476: invokevirtual   X/1cg.LJIILLIIL:()LX/1si;
        //   479: astore_1       
        //   480: aload_1        
        //   481: ifnull          490
        //   484: aload_1        
        //   485: bipush          8
        //   487: invokevirtual   X/1si.setVisibility:(I)V
        //   490: aload_0        
        //   491: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //   494: invokevirtual   android/view/View.getVisibility:()I
        //   497: ifeq            509
        //   500: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //   503: iconst_0       
        //   504: iconst_0       
        //   505: aconst_null    
        //   506: invokevirtual   X/0wQ.LIZ:(ZZLjava/util/List;)V
        //   509: aload_0        
        //   510: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //   513: iconst_0       
        //   514: invokevirtual   android/view/View.setVisibility:(I)V
        //   517: aload_0        
        //   518: invokevirtual   X/1cg.LJIIJJI:()LX/0yP;
        //   521: astore_1       
        //   522: aload_1        
        //   523: ifnull          543
        //   526: aload_1        
        //   527: getfield        X/0yP.LIZ:Landroid/view/View;
        //   530: checkcast       LX/0no;
        //   533: astore_1       
        //   534: aload_1        
        //   535: ifnull          543
        //   538: aload_1        
        //   539: iconst_0       
        //   540: invokevirtual   X/0no.setVisibility:(I)V
        //   543: aload_0        
        //   544: invokevirtual   X/1cg.LJIIJJI:()LX/0yP;
        //   547: astore_1       
        //   548: aload_1        
        //   549: ifnull          568
        //   552: aload_1        
        //   553: getfield        X/0yP.LIZ:Landroid/view/View;
        //   556: checkcast       LX/0no;
        //   559: astore_1       
        //   560: aload_1        
        //   561: ifnull          568
        //   564: aload_1        
        //   565: invokevirtual   X/0no.LIZ:()V
        //   568: aload_0        
        //   569: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //   572: new             LX/0x3;
        //   575: dup            
        //   576: aload_0        
        //   577: invokespecial   X/0x3.<init>:(LX/293;)V
        //   580: invokevirtual   android/view/View.post:(Ljava/lang/Runnable;)Z
        //   583: pop            
        //   584: aload_0        
        //   585: invokevirtual   X/1cg.LJJ:()V
        //   588: aload_0        
        //   589: invokevirtual   X/1cg.LJJI:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   592: astore_1       
        //   593: aload_1        
        //   594: ifnull          619
        //   597: aload_1        
        //   598: ldc_w           LX/2EJ;.class
        //   601: new             LX/0kK;
        //   604: dup            
        //   605: getstatic       X/0kL.MATCH:LX/0kL;
        //   608: getstatic       X/0kM.START:LX/0kM;
        //   611: iconst_4       
        //   612: invokespecial   X/0kK.<init>:(LX/0kL;LX/0kM;I)V
        //   615: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   618: pop            
        //   619: return         
        //   620: aload_3        
        //   621: ldc_w           2131367746
        //   624: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //   627: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //   630: astore_1       
        //   631: new             LX/05c;
        //   634: dup            
        //   635: invokespecial   X/05c.<init>:()V
        //   638: astore          5
        //   640: aload_3        
        //   641: ldc_w           2131368169
        //   644: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //   647: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //   650: astore          4
        //   652: aload           5
        //   654: aload           4
        //   656: invokevirtual   X/05c.LIZ:(Landroidx/constraintlayout/widget/ConstraintLayout;)V
        //   659: aload           5
        //   661: ldc_w           2131367746
        //   664: iconst_4       
        //   665: invokevirtual   X/05c.LIZIZ:(II)V
        //   668: aload           5
        //   670: ldc_w           2131367746
        //   673: iconst_4       
        //   674: ldc_w           2131363940
        //   677: iconst_4       
        //   678: ldc_w           11.0
        //   681: invokestatic    X/0cB.LIZ:(F)I
        //   684: invokevirtual   X/05c.LIZ:(IIIII)V
        //   687: aload           5
        //   689: aload           4
        //   691: invokevirtual   X/05c.LIZIZ:(Landroidx/constraintlayout/widget/ConstraintLayout;)V
        //   694: aload_3        
        //   695: ldc_w           2131367747
        //   698: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //   701: checkcast       LX/1ib;
        //   704: astore          4
        //   706: aload_0        
        //   707: getfield        X/293.LJIILLIIL:Landroid/text/SpannableStringBuilder;
        //   710: astore          5
        //   712: aload           5
        //   714: ifnull          978
        //   717: aload           5
        //   719: invokevirtual   android/text/SpannableStringBuilder.toString:()Ljava/lang/String;
        //   722: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   725: ifne            978
        //   728: aload           4
        //   730: ldc             ""
        //   732: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   735: aload           4
        //   737: aload_0        
        //   738: getfield        X/293.LJIILLIIL:Landroid/text/SpannableStringBuilder;
        //   741: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   744: aload_1        
        //   745: ldc             ""
        //   747: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   750: aload_1        
        //   751: iconst_0       
        //   752: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setVisibility:(I)V
        //   755: aload_3        
        //   756: ldc_w           2131367745
        //   759: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //   762: checkcast       LX/1si;
        //   765: astore_3       
        //   766: aload_3        
        //   767: ldc             ""
        //   769: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   772: aload_3        
        //   773: invokevirtual   X/SEd.getHierarchy:()LX/SB0;
        //   776: checkcast       LX/SEV;
        //   779: astore          4
        //   781: aload           4
        //   783: ldc             ""
        //   785: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   788: aload           4
        //   790: getstatic       X/I7e.LIZIZ:LX/I7e;
        //   793: invokevirtual   X/SEV.LIZ:(LX/I7e;)V
        //   796: aload_0        
        //   797: getfield        X/293.LJIILLIIL:Landroid/text/SpannableStringBuilder;
        //   800: astore          4
        //   802: aload           4
        //   804: ifnull          965
        //   807: aload           4
        //   809: invokevirtual   android/text/SpannableStringBuilder.toString:()Ljava/lang/String;
        //   812: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   815: ifne            965
        //   818: aload_3        
        //   819: ldc_w           2131233908
        //   822: invokestatic    X/0ch.LIZ:(LX/1si;I)V
        //   825: new             Landroid/animation/AnimatorSet;
        //   828: dup            
        //   829: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   832: astore          6
        //   834: aload_1        
        //   835: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   838: iconst_2       
        //   839: newarray        F
        //   841: dup            
        //   842: iconst_0       
        //   843: fconst_0       
        //   844: fastore        
        //   845: dup            
        //   846: iconst_1       
        //   847: fconst_1       
        //   848: fastore        
        //   849: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   852: astore          5
        //   854: aload           5
        //   856: ldc2_w          320
        //   859: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //   862: pop            
        //   863: aload_1        
        //   864: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   867: iconst_2       
        //   868: newarray        F
        //   870: dup            
        //   871: iconst_0       
        //   872: fconst_1       
        //   873: fastore        
        //   874: dup            
        //   875: iconst_1       
        //   876: fconst_1       
        //   877: fastore        
        //   878: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   881: astore_3       
        //   882: aload_3        
        //   883: ldc2_w          1480
        //   886: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //   889: pop            
        //   890: aload_1        
        //   891: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   894: iconst_2       
        //   895: newarray        F
        //   897: dup            
        //   898: iconst_0       
        //   899: fconst_1       
        //   900: fastore        
        //   901: dup            
        //   902: iconst_1       
        //   903: fconst_0       
        //   904: fastore        
        //   905: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   908: astore          4
        //   910: aload           4
        //   912: ldc2_w          320
        //   915: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //   918: pop            
        //   919: aload           6
        //   921: iconst_3       
        //   922: anewarray       Landroid/animation/Animator;
        //   925: dup            
        //   926: iconst_0       
        //   927: aload           5
        //   929: aastore        
        //   930: dup            
        //   931: iconst_1       
        //   932: aload_3        
        //   933: aastore        
        //   934: dup            
        //   935: iconst_2       
        //   936: aload           4
        //   938: aastore        
        //   939: invokevirtual   android/animation/AnimatorSet.playSequentially:([Landroid/animation/Animator;)V
        //   942: aload           6
        //   944: new             LX/0x6;
        //   947: dup            
        //   948: aload_1        
        //   949: aload_2        
        //   950: aload_0        
        //   951: invokespecial   X/0x6.<init>:(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/util/List;LX/293;)V
        //   954: invokevirtual   android/animation/AnimatorSet.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   957: aload           6
        //   959: invokevirtual   android/animation/AnimatorSet.start:()V
        //   962: goto            404
        //   965: aload_3        
        //   966: ldc_w           "tiktok_live_interaction_resource"
        //   969: ldc_w           "ttlive_match_winning_streak_tip_bg.png"
        //   972: invokestatic    X/0cb.LIZ:(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
        //   975: goto            825
        //   978: aload           4
        //   980: ldc             ""
        //   982: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   985: aload_0        
        //   986: aload           4
        //   988: invokevirtual   X/1cg.LIZ:(LX/1ib;)V
        //   991: goto            744
        //   994: aconst_null    
        //   995: astore_1       
        //   996: goto            376
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
    public final void LJ() {
        this.LJJIIJZLJL();
        final DataChannel ljji = this.LJJI();
        if (ljji != null) {
            ljji.LIZJ((Class)2EG.class, (Object)new 0kA(0));
        }
        final BattleTruthOrDareOptOutNotice ljjil = 0n9.LIZ.LJJIL;
        final String s = "";
        String liz;
        if (ljjil == null || (liz = ljjil.LIZ) == null) {
            liz = "";
        }
        String liz2 = VR3.LIZ().LIZ(liz);
        if (liz2 == null) {
            liz2 = s;
        }
        if (y.LIZ((CharSequence)liz2) ^ true) {
            Hf4.LIZ(0cB.LJ(), liz2, 0L);
        }
    }
    
    public final void LJFF() {
        public final class 0x2 implements Runnable
        {
            public final /* synthetic */ 293 LIZ;
            
            static {
                Covode.recordClassIndex(10200);
            }
            
            public 0x2(final 293 liz) {
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
        //    38: iconst_2       
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
        //    70: ifeq            82
        //    73: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //    76: iconst_0       
        //    77: iconst_0       
        //    78: aconst_null    
        //    79: invokevirtual   X/0wQ.LIZ:(ZZLjava/util/List;)V
        //    82: aload_0        
        //    83: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //    86: iconst_0       
        //    87: invokevirtual   android/view/View.setVisibility:(I)V
        //    90: aload_0        
        //    91: invokevirtual   X/1cg.LJIIJJI:()LX/0yP;
        //    94: getfield        X/0yP.LIZ:Landroid/view/View;
        //    97: astore_1       
        //    98: aload_1        
        //    99: ldc             ""
        //   101: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   104: aload_1        
        //   105: checkcast       LX/0no;
        //   108: iconst_0       
        //   109: invokevirtual   X/0no.setVisibility:(I)V
        //   112: aload_0        
        //   113: invokevirtual   X/1cg.LJJI:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   116: astore_1       
        //   117: aload_1        
        //   118: ifnull          143
        //   121: aload_1        
        //   122: ldc_w           LX/2EJ;.class
        //   125: new             LX/0kK;
        //   128: dup            
        //   129: getstatic       X/0kL.MATCH:LX/0kL;
        //   132: getstatic       X/0kM.PUNISH:LX/0kM;
        //   135: iconst_4       
        //   136: invokespecial   X/0kK.<init>:(LX/0kL;LX/0kM;I)V
        //   139: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   142: pop            
        //   143: aload_0        
        //   144: invokevirtual   X/1cg.LJIIZILJ:()Landroid/view/View;
        //   147: new             LX/0x2;
        //   150: dup            
        //   151: aload_0        
        //   152: invokespecial   X/0x2.<init>:(LX/293;)V
        //   155: invokevirtual   android/view/View.post:(Ljava/lang/Runnable;)Z
        //   158: pop            
        //   159: return         
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
    
    public final void LJI() {
        GTi.LIZIZ((View)super.LJIIJJI);
        final Iterator<Object> iterator = 0jz.LIZLLL().getCoHostUserList().iterator();
        Context context = null;
        View viewById = null;
        while (iterator.hasNext()) {
            final 0pc 0pc = iterator.next();
            final MatchBaseWidget liz = super.LIZ;
            if (liz != null) {
                final 1Sk liz2 = liz.LIZ(0pc.LJIILIIL);
                if (liz2 == null) {
                    continue;
                }
                final Room ljjiffi = this.LJJIFFI();
                if (ljjiffi != null) {
                    final User owner = ljjiffi.getOwner();
                    if (owner != null && owner.getId() == 0pc.LJIILIIL) {
                        continue;
                    }
                }
                viewById = liz2.findViewById(2131365287);
            }
        }
        final DataChannel ljji = this.LJJI();
        final MatchBaseWidget liz3 = super.LIZ;
        if (liz3 != null) {
            context = liz3.getContext();
        }
        final 0nN victoryLapActivityListener = new 0nN(ljji, context, viewById);
        final 0oD ljiijji = super.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.setVictoryLapActivityListener(victoryLapActivityListener);
        }
        if (0n9.LIZ.LJJIJ) {
            final 0oD ljiijji2 = super.LJIIJJI;
            if (ljiijji2 != null) {
                ljiijji2.LIZIZ();
            }
            0n9.LIZ.LJJIJ = false;
            return;
        }
        final BattleTruthOrDareTriggerGuide ljjijl = 0n9.LIZ.LJJIJL;
        String liziz;
        if (ljjijl == null || (liziz = ljjijl.LIZIZ) == null) {
            liziz = "";
        }
        final BattleTruthOrDareTriggerGuide ljjijl2 = 0n9.LIZ.LJJIJL;
        int lizj;
        if (ljjijl2 != null) {
            lizj = ljjijl2.LIZJ;
        }
        else {
            lizj = 5;
        }
        final 0oD ljiijji3 = super.LJIIJJI;
        if (ljiijji3 != null) {
            ljiijji3.LIZ(liziz, lizj);
        }
    }
    
    public final void LJII() {
        final 0oD ljiijji = super.LJIIJJI;
        if (ljiijji != null) {
            final BattleTruthOrDareTips ljjijlij = 0n9.LIZ.LJJIJLIJ;
            List liziz;
            if (ljjijlij != null) {
                liziz = ljjijlij.LIZIZ;
            }
            else {
                liziz = null;
            }
            ljiijji.setTruthOrDareTips(liziz);
        }
    }
    
    @Override
    public final void LJIJ() {
        super.LJIJ();
        this.LJIJJ.LIZ();
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
            final View viewById = liz.findViewById(2131369310);
            n.LIZIZ((Object)viewById, "");
            this.LJIILL = viewById;
            final View viewById2 = liz.findViewById(2131366814);
            n.LIZIZ((Object)viewById2, "");
            this.LJIILJJIL = (1si)viewById2;
            final View viewById3 = liz.findViewById(2131367408);
            n.LIZIZ((Object)viewById3, "");
            final 1Rc ljiizilj = (1Rc)viewById3;
            if ((this.LJIIZILJ = ljiizilj) == null) {
                n.LIZ("");
            }
            ljiizilj.LIZ(this.LJJI());
            final View viewById4 = liz.findViewById(2131374429);
            n.LIZIZ((Object)viewById4, "");
            this.LJIJ = (0oi)viewById4;
            final View viewById5 = liz.findViewById(2131374430);
            n.LIZIZ((Object)viewById5, "");
            this.LJIJI = (0oi)viewById5;
        }
        final IMultiCoHostService multiCoHostService = 0jR.LIZ(IMultiCoHostService.class);
        if (multiCoHostService != null) {
            final List<0pc> coHostUserList = multiCoHostService.getCoHostUserList();
            if (coHostUserList != null && coHostUserList.size() >= 2) {
                final long ljiiliil = coHostUserList.get(1).LJIILIIL;
                final MatchBaseWidget liz2 = super.LIZ;
                while (true) {
                    Label_0257: {
                        if (liz2 == null) {
                            break Label_0257;
                        }
                        final 1Sk liz3 = liz2.LIZ(ljiiliil);
                        if (liz3 == null) {
                            break Label_0257;
                        }
                        final View viewById6 = liz3.findViewById(2131363494);
                        final DataChannel ljji = this.LJJI();
                        if (ljji != null) {
                            ljji.LIZJ((Class)2EJ.class, (Object)new 0kK(0kL.CONTAINER, 0kM.NORMAL, new WeakReference<View>(viewById6)));
                            return;
                        }
                        return;
                    }
                    final View viewById6 = null;
                    continue;
                }
            }
        }
    }
    
    @Override
    public final boolean LJIJJ() {
        return true;
    }
}
