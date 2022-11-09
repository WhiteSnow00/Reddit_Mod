// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import java.util.ArrayList;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import java.util.HashMap;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.live.base.model.user.User;
import java.util.Iterator;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import java.util.List;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeText;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 1ba extends 0w8<1bY>
{
    static {
        Covode.recordClassIndex(9956);
    }
    
    private final void LIZ(final long ljiiiz, final Map<Long, BattleComboInfo> ljii) {
        public final class 0wA implements Runnable
        {
            public final /* synthetic */ 1ba LIZ;
            
            static {
                Covode.recordClassIndex(9958);
            }
            
            public 0wA(final 1ba liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                if (0n9.LIZ.LIZ(0nC.FINISH)) {
                    return;
                }
                final BattleNoticeAnchorGiftGuide lj = new BattleNoticeAnchorGiftGuide();
                final BattleNoticeText liz = new BattleNoticeText();
                liz.LIZ = 0cB.LIZ(2131830564);
                lj.LIZ = liz;
                final LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = new LinkMicBattleNoticeMessage();
                final CommonMessageData baseMessage = new CommonMessageData();
                final Room ljff = this.LIZ.LJFF;
                long id;
                if (ljff != null) {
                    id = ljff.getId();
                }
                else {
                    id = 0L;
                }
                baseMessage.LIZJ = id;
                baseMessage.LJI = true;
                ((HDi)linkMicBattleNoticeMessage).baseMessage = baseMessage;
                linkMicBattleNoticeMessage.LIZ = 3;
                linkMicBattleNoticeMessage.LJ = lj;
                linkMicBattleNoticeMessage.LJI = true;
                final DataChannel liziz = this.LIZ.LIZIZ();
                if (liziz != null) {
                    final IMessageManager messageManager = (IMessageManager)liziz.LIZIZ((Class)GwN.class);
                    if (messageManager != null) {
                        messageManager.insertMessage((IMessage)linkMicBattleNoticeMessage);
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   X/I4V.LJ:()V
        //     6: aload_0        
        //     7: iconst_0       
        //     8: putfield        X/0w8.LIZIZ:Z
        //    11: aload_0        
        //    12: iconst_0       
        //    13: putfield        X/0w8.LIZLLL:Z
        //    16: getstatic       X/0n9.LIZ:LX/1Qk;
        //    19: aload_3        
        //    20: putfield        X/1Qk.LJII:Ljava/util/Map;
        //    23: getstatic       X/0n9.LIZ:LX/1Qk;
        //    26: getstatic       X/0nC.START:LX/0nC;
        //    29: iconst_1       
        //    30: invokevirtual   X/1Qk.LIZ:(LX/0nC;Z)Z
        //    33: pop            
        //    34: getstatic       X/0n9.LIZ:LX/1Qk;
        //    37: invokestatic    java/lang/System.currentTimeMillis:()J
        //    40: putfield        X/1Qk.LJIILLIIL:J
        //    43: getstatic       X/0n9.LIZ:LX/1Qk;
        //    46: lload_1        
        //    47: putfield        X/1Qk.LJIIIZ:J
        //    50: aload_0        
        //    51: lload_1        
        //    52: invokevirtual   X/0w8.LIZ:(J)V
        //    55: iconst_0       
        //    56: lload_1        
        //    57: invokestatic    X/1lI.LIZ:(ZJ)V
        //    60: aload_0        
        //    61: getfield        X/0w8.LJI:Landroid/os/Handler;
        //    64: aconst_null    
        //    65: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //    68: lload_1        
        //    69: lconst_1       
        //    70: lcmp           
        //    71: ifle            93
        //    74: aload_0        
        //    75: getfield        X/0w8.LJI:Landroid/os/Handler;
        //    78: new             LX/0wA;
        //    81: dup            
        //    82: aload_0        
        //    83: invokespecial   X/0wA.<init>:(LX/1ba;)V
        //    86: ldc2_w          1000
        //    89: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //    92: pop            
        //    93: return         
        //    Signature:
        //  (JLjava/util/Map<Ljava/lang/Long;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;>;)V
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
    
    public static /* synthetic */ void LIZ(final 1ba 1ba, final Map map) {
        1ba.LIZ(map, 0L, 0L);
    }
    
    private final void LIZ(final Map<Long, BattleUserArmies> map, long n, final long n2) {
        0n9.LIZ.LJIJJLI.clear();
        for (final Map.Entry<Long, V> entry : map.entrySet()) {
            0n9.LIZ.LJIJJLI.put(entry.getKey(), (long)((BattleUserArmies)entry.getValue()).LIZ);
        }
        final Room ljff = super.LJFF;
        final 0pc 0pc = null;
        while (true) {
            Label_0374: {
                if (ljff == null) {
                    break Label_0374;
                }
                final User owner = ljff.getOwner();
                if (owner == null) {
                    break Label_0374;
                }
                final Long value = owner.getId();
                final BattleUserArmies battleUserArmies = map.get(value);
                List liziz;
                if (battleUserArmies != null) {
                    liziz = battleUserArmies.LIZIZ;
                }
                else {
                    liziz = null;
                }
                this.LIZ(liziz);
                if (battleUserArmies != null) {
                    final 1Ql 1Ql = new 1Ql(battleUserArmies.LIZ, n, n2);
                    final DataChannel liziz2 = this.LIZIZ();
                    if (liziz2 != null) {
                        liziz2.LIZIZ((Class)2F4.class, (Object)1Ql);
                        liziz2.LIZIZ((Class)2F7.class, (Object)battleUserArmies.LIZIZ);
                    }
                }
                final Iterator<Object> iterator2 = 0jz.LIZLLL().getCoHostUserList().iterator();
                User owner2;
                0pc next;
                do {
                    next = 0pc;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    next = iterator2.next();
                    n = next.LJIILIIL;
                    final Room ljff2 = super.LJFF;
                    if (ljff2 == null) {
                        break;
                    }
                    owner2 = ljff2.getOwner();
                } while (owner2 != null && n == owner2.getId());
                final 0pc 0pc2 = next;
                if (0pc2 != null) {
                    n = 0pc2.LJIILIIL;
                }
                else {
                    n = 0L;
                }
                final BattleUserArmies battleUserArmies2 = map.get(n);
                if (battleUserArmies2 != null) {
                    final DataChannel liziz3 = this.LIZIZ();
                    if (liziz3 != null) {
                        liziz3.LIZIZ((Class)2FB.class, (Object)battleUserArmies2.LIZ);
                        liziz3.LIZIZ((Class)2F8.class, (Object)battleUserArmies2.LIZIZ);
                    }
                }
                return;
            }
            final Long value = null;
            continue;
        }
    }
    
    private final void LIZ(final Map<Long, BattleResult> map, final Map<Long, BattleComboInfo> ljii) {
        public final class 27J extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1ba LIZ;
            public final /* synthetic */ BattleResult LIZIZ;
            
            static {
                Covode.recordClassIndex(9957);
            }
            
            public 27J(final 1ba liz, final BattleResult liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aload_1        
        //     3: ifnull          340
        //     6: aload_0        
        //     7: getfield        X/0w8.LJFF:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    10: astore          4
        //    12: aload           4
        //    14: ifnull          80
        //    17: aload           4
        //    19: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //    22: astore          4
        //    24: aload           4
        //    26: ifnull          80
        //    29: aload           4
        //    31: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //    34: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    37: astore          4
        //    39: aload_1        
        //    40: aload           4
        //    42: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    47: checkcast       Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;
        //    50: astore          4
        //    52: getstatic       X/0n9.LIZ:LX/1Qk;
        //    55: aload_2        
        //    56: putfield        X/1Qk.LJII:Ljava/util/Map;
        //    59: aload_0        
        //    60: iconst_1       
        //    61: putfield        X/0w8.LIZLLL:Z
        //    64: aload_0        
        //    65: getfield        X/0w8.LIZIZ:Z
        //    68: ifeq            86
        //    71: iconst_4       
        //    72: ldc             "TwoMatchAudienceViewPre"
        //    74: ldc             "dealResult, Battle state is End"
        //    76: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    79: return         
        //    80: aconst_null    
        //    81: astore          4
        //    83: goto            39
        //    86: getstatic       X/0n9.LIZ:LX/1Qk;
        //    89: getstatic       X/0nC.PUNISH:LX/0nC;
        //    92: invokevirtual   X/1Qk.LIZ:(LX/0nC;)Z
        //    95: ifeq            138
        //    98: new             Ljava/lang/StringBuilder;
        //   101: dup            
        //   102: ldc             "dealResult, Battle state is "
        //   104: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   107: astore_1       
        //   108: aload_1        
        //   109: getstatic       X/0n9.LIZ:LX/1Qk;
        //   112: invokevirtual   X/1Qk.LIZJ:()LX/0nC;
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   118: pop            
        //   119: aload_1        
        //   120: ldc_w           ", return"
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: pop            
        //   127: iconst_4       
        //   128: ldc             "TwoMatchAudienceViewPre"
        //   130: aload_1        
        //   131: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   134: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   137: return         
        //   138: aload_0        
        //   139: getfield        X/0w8.LIZJ:Z
        //   142: ifeq            155
        //   145: iconst_4       
        //   146: ldc             "TwoMatchAudienceViewPre"
        //   148: ldc_w           "dealResult, current is showing result animation"
        //   151: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   154: return         
        //   155: aload_0        
        //   156: iconst_1       
        //   157: putfield        X/0w8.LIZJ:Z
        //   160: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   163: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //   168: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   173: astore          5
        //   175: aload_3        
        //   176: astore_2       
        //   177: aload           5
        //   179: invokeinterface java/util/Iterator.hasNext:()Z
        //   184: ifeq            238
        //   187: aload           5
        //   189: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   194: astore_2       
        //   195: aload_2        
        //   196: checkcast       LX/0pc;
        //   199: getfield        X/0pc.LJIILIIL:J
        //   202: lstore          6
        //   204: aload_0        
        //   205: getfield        X/0w8.LJFF:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   208: astore          8
        //   210: aload           8
        //   212: ifnull          238
        //   215: aload           8
        //   217: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   220: astore          8
        //   222: aload           8
        //   224: ifnull          238
        //   227: lload           6
        //   229: aload           8
        //   231: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   234: lcmp           
        //   235: ifeq            175
        //   238: aload_2        
        //   239: checkcast       LX/0pc;
        //   242: astore_2       
        //   243: aload_2        
        //   244: ifnull          334
        //   247: aload_2        
        //   248: getfield        X/0pc.LJIILIIL:J
        //   251: lstore          6
        //   253: aload_1        
        //   254: lload           6
        //   256: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   259: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   264: checkcast       Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;
        //   267: astore_1       
        //   268: getstatic       X/0n9.LIZ:LX/1Qk;
        //   271: aload           4
        //   273: putfield        X/1Qk.LJ:Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;
        //   276: aload           4
        //   278: putstatic       X/0n9.LIZJ:Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;
        //   281: aload_1        
        //   282: putstatic       X/0n9.LIZLLL:Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;
        //   285: aload           4
        //   287: ifnull          303
        //   290: aload           4
        //   292: getfield        com/bytedance/android/livesdk/model/message/battle/BattleResult.LIZIZ:I
        //   295: iconst_2       
        //   296: if_icmpne       303
        //   299: aload_0        
        //   300: invokevirtual   X/0w8.LJII:()V
        //   303: aload_0        
        //   304: getfield        X/0w8.LJ:LX/0w9;
        //   307: checkcast       LX/1bY;
        //   310: astore_1       
        //   311: aload_1        
        //   312: ifnull          333
        //   315: aload_1        
        //   316: aload           4
        //   318: new             LX/27J;
        //   321: dup            
        //   322: aload_0        
        //   323: aload           4
        //   325: invokespecial   X/27J.<init>:(LX/1ba;Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;)V
        //   328: invokeinterface X/1bY.LIZ:(Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;LX/QgG;)V
        //   333: return         
        //   334: lconst_0       
        //   335: lstore          6
        //   337: goto            253
        //   340: return         
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/Long;Lcom/bytedance/android/livesdk/model/message/battle/BattleResult;>;Ljava/util/Map<Ljava/lang/Long;Lcom/bytedance/android/livesdkapi/depend/model/live/match/BattleComboInfo;>;)V
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
    
    private final void LIZJ(final LinkMicBattleMessage linkMicBattleMessage) {
        final List lji = linkMicBattleMessage.LJI;
        if (lji != null) {
            final HashMap hashMap = new HashMap();
            for (final UserArmiesWrapper userArmiesWrapper : lji) {
                if (userArmiesWrapper.LIZ != null) {
                    if (userArmiesWrapper.LIZIZ == null) {
                        continue;
                    }
                    final Long liz = userArmiesWrapper.LIZ;
                    long longValue;
                    if (liz != null) {
                        longValue = liz;
                    }
                    else {
                        longValue = 0L;
                    }
                    BattleUserArmies liziz;
                    if ((liziz = userArmiesWrapper.LIZIZ) == null) {
                        liziz = new BattleUserArmies();
                    }
                    hashMap.put(longValue, liziz);
                }
            }
            LIZ(this, hashMap);
        }
    }
    
    @Override
    public final void LIZ(final LinkMicBattleArmiesMessage linkMicBattleArmiesMessage) {
        CTM.LIZ((Object)linkMicBattleArmiesMessage);
        if (!0w8.LIZ((0w8<0w9>)this, linkMicBattleArmiesMessage.LIZ)) {
            return;
        }
        if (linkMicBattleArmiesMessage.LJ == 0n6.OPT_OUT_UPDATE.getValue()) {
            final Map liziz = linkMicBattleArmiesMessage.LIZIZ;
            n.LIZIZ((Object)liziz, "");
            this.LIZ(liziz, linkMicBattleArmiesMessage.LJIIJ, linkMicBattleArmiesMessage.LJIIJJI);
            return;
        }
        if (!super.LIZLLL) {
            boolean b = true;
            final Map<Long, Long> ljijjli = 0n9.LIZ.LJIJJLI;
            final Map liziz2 = linkMicBattleArmiesMessage.LIZIZ;
            if (liziz2 != null) {
                for (final Map.Entry<Object, V> entry : liziz2.entrySet()) {
                    final Long n = ljijjli.get(entry.getKey());
                    long longValue;
                    if (n != null) {
                        longValue = n;
                    }
                    else {
                        longValue = 0L;
                    }
                    if (longValue > ((BattleUserArmies)entry.getValue()).LIZ) {
                        b = false;
                    }
                }
                if (!b) {
                    0ba.LIZ(6, "TwoMatchAudienceViewPre", "LinkMicBattleArmiesMessage can't update score, jump");
                    return;
                }
            }
            final Map liziz3 = linkMicBattleArmiesMessage.LIZIZ;
            n.LIZIZ((Object)liziz3, "");
            this.LIZ(liziz3, linkMicBattleArmiesMessage.LJIIJ, linkMicBattleArmiesMessage.LJIIJJI);
        }
    }
    
    @Override
    public final void LIZ(final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)linkMicBattleMessage);
        final BattleSetting lizj = linkMicBattleMessage.LIZJ;
        final boolean b = lizj != null && lizj.LJFF == 1;
        final int liziz = linkMicBattleMessage.LIZIZ;
        if (liziz != 5) {
            if (liziz == 6) {
                1lI.LJ(false, linkMicBattleMessage);
                if (!this.LIZ(linkMicBattleMessage.LIZ, b)) {
                    return;
                }
                this.LIZ("cut_short_msg", 0n9.LIZ.LJIIL = true);
            }
            return;
        }
        1lI.LIZ(linkMicBattleMessage);
        if (!this.LIZ(linkMicBattleMessage.LIZ, b)) {
            return;
        }
        0n9.LIZ.LJIIL = false;
        this.LIZJ(linkMicBattleMessage);
        this.LIZ(linkMicBattleMessage.LIZLLL, linkMicBattleMessage.LJFF);
    }
    
    @Override
    public final void LIZ(final LinkMicBattlePunishFinishMessage linkMicBattlePunishFinishMessage) {
        CTM.LIZ((Object)linkMicBattlePunishFinishMessage);
        1lI.LIZ(false, linkMicBattlePunishFinishMessage);
        if (!0w8.LIZ((0w8<0w9>)this, linkMicBattlePunishFinishMessage.LIZIZ)) {
            return;
        }
        0n9.LIZ.LJIILIIL = linkMicBattlePunishFinishMessage.LIZ();
        this.LIZ("punish_finish_msg", false);
    }
    
    @Override
    public final void LIZ(final LinkMicBattleVictoryLapMessage linkMicBattleVictoryLapMessage) {
        CTM.LIZ((Object)linkMicBattleVictoryLapMessage);
        final int lizlll = linkMicBattleVictoryLapMessage.LIZLLL;
        if (lizlll != 1) {
            if (lizlll != 2) {
                if (lizlll == 3) {
                    0n9.LIZ.LJJIJIIJI = false;
                    0n9.LIZ.LJJIL = linkMicBattleVictoryLapMessage.LIZJ;
                    final 1bY 1bY = (1bY)super.LJ;
                    if (1bY != null) {
                        1bY.LJ();
                    }
                    Eqp.LIZ(new Eqq("truth_or_dare_disable_feature", SystemClock.uptimeMillis(), (Pka)null));
                }
            }
            else {
                0n9.LIZ.LJJIJLIJ = linkMicBattleVictoryLapMessage.LIZIZ;
            }
            return;
        }
        0n9.LIZ.LJJIJIL = linkMicBattleVictoryLapMessage.LJ;
        0n9.LIZ.LJJIJIIJI = true;
        0n9.LIZ.LJJIJL = linkMicBattleVictoryLapMessage.LIZ;
        final 1bY 1bY2 = (1bY)super.LJ;
        if (1bY2 != null) {
            1bY2.LIZ(false);
        }
        Eqp.LIZ(new Eqq("truth_or_dare_enter_match_victory_lap", SystemClock.uptimeMillis(), (Pka)null));
    }
    
    @Override
    public final void LIZ(final BattleInfoResponse battleInfoResponse) {
        CTM.LIZ((Object)battleInfoResponse);
        this.LIZ(battleInfoResponse.LJ, battleInfoResponse.LJIIIZ);
    }
    
    @Override
    public final void LIZ(final String s) {
    }
    
    public final void LIZIZ(final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)linkMicBattleMessage);
        1lI.LIZLLL(false, linkMicBattleMessage);
        final 0wQ liziz = 0wQ.LIZIZ;
        final 1ci lizj = this.LIZJ();
        List<TeamUsersInfo> ljiiliil;
        if (lizj != null) {
            ljiiliil = lizj.LJIILIIL;
        }
        else {
            ljiiliil = null;
        }
        liziz.LIZ(false, ljiiliil, true);
        0n9.LIZ.LJIJJLI.clear();
        0n9.LJIIIIZZ.LIZ("audience_open_msg", 0);
        0n9.LIZ.LIZ(linkMicBattleMessage.LIZJ);
        final StringBuilder sb = new StringBuilder("checkBattleInfo, info = ");
        sb.append(((H31)linkMicBattleMessage).getMessageId());
        0ba.LIZ(4, "TwoMatchAudienceViewPre", sb.toString());
        0n9.LIZ.LIZ(linkMicBattleMessage.LIZJ);
        0n9.LIZ.LJIJI = linkMicBattleMessage.LJ;
        final List ljii = linkMicBattleMessage.LJII;
        if (ljii != null) {
            final ArrayList list = new ArrayList();
            for (final Object next : ljii) {
                final BattleUserInfoWrapper battleUserInfoWrapper = (BattleUserInfoWrapper)next;
                if (battleUserInfoWrapper.LIZ != null && battleUserInfoWrapper.LIZIZ != null) {
                    list.add(next);
                }
            }
            final List list2 = list;
            final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)list2, 10));
            for (final BattleUserInfoWrapper battleUserInfoWrapper2 : list2) {
                final Long liz = battleUserInfoWrapper2.LIZ;
                long longValue;
                if (liz != null) {
                    longValue = liz;
                }
                else {
                    longValue = 0L;
                }
                BattleUserInfo liziz2;
                if ((liziz2 = battleUserInfoWrapper2.LIZIZ) == null) {
                    liziz2 = new BattleUserInfo((BattleBaseUserInfo)null, (List)null, 3);
                }
                list3.add((Object)8sj.LIZ((Object)longValue, (Object)liziz2));
            }
            final Map liz2 = FJ3.LIZ((Iterable)list3);
            if (liz2 != null) {
                1NN.LLFF.LIZ().LIZ(liz2);
            }
        }
        final Map lizlll = linkMicBattleMessage.LIZLLL;
        final long lj = this.LJ();
        final BattleSetting lizj2 = linkMicBattleMessage.LIZJ;
        Label_0373: {
            if (lizj2 != null) {
                final Integer value = lizj2.LJ;
                if (value != null) {
                    if (value == 1) {
                        if (lj > 0L) {
                            final List ljii2 = linkMicBattleMessage.LJII;
                            if (ljii2 != null) {
                            Label_0487_Outer:
                                for (final BattleUserInfoWrapper battleUserInfoWrapper3 : ljii2) {
                                    final Long liz3 = battleUserInfoWrapper3.LIZ;
                                    final Room ljff = super.LJFF;
                                    while (true) {
                                        Label_0522: {
                                            if (ljff == null) {
                                                break Label_0522;
                                            }
                                            final User owner = ljff.getOwner();
                                            if (owner == null) {
                                                break Label_0522;
                                            }
                                            final Long value2 = owner.getId();
                                            if (n.LIZ((Object)liz3, (Object)value2)) {
                                                0n9.LIZ.LJIL = battleUserInfoWrapper3.LIZIZ;
                                                continue Label_0487_Outer;
                                            }
                                            0n9.LIZ.LJJ = battleUserInfoWrapper3.LIZIZ;
                                            continue Label_0487_Outer;
                                        }
                                        final Long value2 = null;
                                        continue;
                                    }
                                }
                            }
                            0n9.LIZ.LJIILJJIL = true;
                            this.LIZ(lj, linkMicBattleMessage.LJFF);
                            this.LIZJ(linkMicBattleMessage);
                        }
                        break Label_0373;
                    }
                    else if (value == 3) {
                        final long ljij = lj + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                        if (ljij > 0L) {
                            0n9.LIZ.LJIJ = ljij;
                            this.LIZJ(linkMicBattleMessage);
                            this.LIZ(lizlll, linkMicBattleMessage.LJFF);
                        }
                        break Label_0373;
                    }
                }
            }
            0n9.LJIIIIZZ.LIZ("check_info", 0);
        }
        if (0n9.LIZ.LIZLLL()) {
            0n9.LIZ.LIZ(0nD.MATCH_OPEN_MESSAGE);
        }
        0n9.LIZ.LJIJI = linkMicBattleMessage.LJ;
    }
    
    public final boolean LIZIZ(final BattleInfoResponse battleInfoResponse) {
        CTM.LIZ((Object)battleInfoResponse);
        0ba.LIZ(4, "TwoMatchAudienceViewPre", "checkBattleInfo, info = ".concat(String.valueOf(battleInfoResponse)));
        0n9.LIZ.LIZ(battleInfoResponse.LIZJ);
        0n9.LIZ.LJIJI = battleInfoResponse.LJIIIIZZ;
        final Map lj = battleInfoResponse.LJ;
        final long lj2 = this.LJ();
        1NN.LLFF.LIZ().LIZ(battleInfoResponse.LJFF);
        final BattleSetting lizj = battleInfoResponse.LIZJ;
        final List<? extends TeamUsersInfo> list = null;
        final Boolean b = null;
        Integer value;
        if (lizj != null) {
            value = lizj.LJ;
        }
        else {
            value = null;
        }
        long ljiiliil = 0L;
        boolean booleanValue = false;
        Label_0111: {
            if (value != null) {
                if (value == 1) {
                    final 0wQ liziz = 0wQ.LIZIZ;
                    final 1ci lizj2 = this.LIZJ();
                    List<TeamUsersInfo> ljiiliil2;
                    if (lizj2 != null) {
                        ljiiliil2 = lizj2.LJIILIIL;
                    }
                    else {
                        ljiiliil2 = null;
                    }
                    liziz.LIZ(false, ljiiliil2, true);
                    if (lj2 <= 0L) {
                        return false;
                    }
                    final Map ljff = battleInfoResponse.LJFF;
                    final 1Qk liz = 0n9.LIZ;
                    BattleUserInfo ljil = null;
                    Label_0238: {
                        if (ljff != null) {
                            final Room ljff2 = super.LJFF;
                            while (true) {
                                Label_0518: {
                                    if (ljff2 == null) {
                                        break Label_0518;
                                    }
                                    final User owner = ljff2.getOwner();
                                    if (owner == null) {
                                        break Label_0518;
                                    }
                                    final Long value2 = owner.getId();
                                    ljil = ljff.get(value2);
                                    break Label_0238;
                                }
                                final Long value2 = null;
                                continue;
                            }
                        }
                        ljil = null;
                    }
                    liz.LJIL = ljil;
                    final 1Qk liz2 = 0n9.LIZ;
                    BattleUserInfo ljj = null;
                    Label_0379: {
                        if (ljff != null) {
                            while (true) {
                                for (final 0pc next : 0jz.LIZLLL().getCoHostUserList()) {
                                    final long ljiiliil3 = next.LJIILIIL;
                                    final Room ljff3 = super.LJFF;
                                    0pc 0pc = next;
                                    if (ljff3 != null) {
                                        final User owner2 = ljff3.getOwner();
                                        0pc = next;
                                        if (owner2 != null) {
                                            if (ljiiliil3 == owner2.getId()) {
                                                continue;
                                            }
                                            0pc = next;
                                        }
                                    }
                                    final 0pc 0pc2 = 0pc;
                                    if (0pc2 != null) {
                                        ljiiliil = 0pc2.LJIILIIL;
                                    }
                                    ljj = ljff.get(ljiiliil);
                                    break Label_0379;
                                }
                                0pc 0pc = null;
                                continue;
                            }
                        }
                        ljj = null;
                    }
                    liz2.LJJ = ljj;
                    final Map ljii = battleInfoResponse.LJII;
                    Boolean b2 = b;
                    if (ljii != null) {
                        b2 = ljii.get(1L);
                    }
                    final 1Qk liz3 = 0n9.LIZ;
                    if (b2 != null) {
                        booleanValue = b2;
                    }
                    liz3.LJIILJJIL = booleanValue;
                    1jz.LIZ("match_health_bar");
                    final BattleTask ljiij = battleInfoResponse.LJIIJ;
                    if (ljiij != null) {
                        final 0w9 lj3 = super.LJ;
                        if (lj3 != null) {
                            lj3.LIZ(ljiij);
                        }
                    }
                    this.LIZ(lj2, battleInfoResponse.LJIIIZ);
                    final Map lizlll = battleInfoResponse.LIZLLL;
                    if (lizlll != null) {
                        this.LIZ(lizlll, 0L, 0L);
                    }
                    break Label_0111;
                }
                else if (value == 3) {
                    final 0wQ liziz2 = 0wQ.LIZIZ;
                    final 1ci lizj3 = this.LIZJ();
                    List<? extends TeamUsersInfo> ljiiliil4 = list;
                    if (lizj3 != null) {
                        ljiiliil4 = lizj3.LJIILIIL;
                    }
                    liziz2.LIZ(false, ljiiliil4, true);
                    final long ljij = lj2 + LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
                    if (ljij > 0L) {
                        0n9.LIZ.LJIJ = ljij;
                        final Map lizlll2 = battleInfoResponse.LIZLLL;
                        if (lizlll2 != null) {
                            this.LIZ(lizlll2, 0L, 0L);
                        }
                        this.LIZ(lj, battleInfoResponse.LJIIIZ);
                    }
                    break Label_0111;
                }
            }
            0n9.LJIIIIZZ.LIZ("check_info", 0);
        }
        if (0n9.LIZ.LIZLLL()) {
            0n9.LIZ.LIZ(0nD.MATCH_BATTLE_INFO);
        }
        return true;
    }
}
