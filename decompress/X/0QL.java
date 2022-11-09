// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.AnchorMuteGuestDoubletouchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.AnchorMuteGuestGuestSetting;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.AnchorMuteGuestAnchorSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.livesetting.linkmic.AnchorMuteGuestCheckVersionSetting;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.view.ViewParent;
import java.util.Objects;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorOneVnSetting;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.RequestError;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.app.Dialog;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.jvm.internal.n;
import java.util.LinkedHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 0ql
{
    public static final 0ql LIZ;
    public static Map<Long, Long> LIZIZ;
    public static long LIZJ;
    
    static {
        Covode.recordClassIndex(8466);
        LIZ = new 0ql();
        0ql.LIZIZ = new LinkedHashMap<Long, Long>();
    }
    
    public static void LIZ(final LiveDialog liveDialog) {
        liveDialog.show();
        KN6.LIZ.LIZ((Dialog)liveDialog);
    }
    
    public static boolean LJFF() {
        try {
            return 2Nf.LIZ.LIZIZ();
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final int LIZ(final LinkPlayerInfo linkPlayerInfo) {
        if (linkPlayerInfo != null) {
            final User lizj = linkPlayerInfo.LIZJ;
            if (lizj != null) {
                final FollowInfo followInfo = lizj.getFollowInfo();
                if (followInfo != null) {
                    return (int)followInfo.getFollowStatus();
                }
            }
        }
        return 0;
    }
    
    public final int LIZ(final LinkPlayerInfo linkPlayerInfo, final 1Uo 1Uo) {
        CTM.LIZ((Object)1Uo);
        String ljiiiz = null;
        if (linkPlayerInfo != null) {
            ljiiiz = linkPlayerInfo.LJIIIZ;
        }
        final Boolean lj = 1Uo.LJ(ljiiiz);
        int intValue;
        final int n = intValue = 1;
        if (lj != null) {
            final boolean booleanValue = lj;
            final Integer value = 2;
            value.intValue();
            intValue = n;
            if (booleanValue) {
                intValue = n;
                if (value != null) {
                    intValue = value;
                }
            }
        }
        return intValue;
    }
    
    public final int LIZ(final LinkListUser linkListUser, final 1Uo 1Uo) {
        CTM.LIZ((Object)1Uo);
        String lj = null;
        if (linkListUser != null) {
            lj = linkListUser.LJ;
        }
        final Boolean lj2 = 1Uo.LJ(lj);
        int intValue;
        final int n = intValue = 1;
        if (lj2 != null) {
            final boolean booleanValue = lj2;
            final Integer value = 2;
            value.intValue();
            intValue = n;
            if (booleanValue) {
                intValue = n;
                if (value != null) {
                    intValue = value;
                }
            }
        }
        return intValue;
    }
    
    public final long LIZ() {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0L;
    }
    
    public final 1ib LIZ(final String text, final Context context) {
        CTM.LIZ((Object)text, (Object)context);
        final 1ib 1ib = new 1ib(context);
        1ib.setText((CharSequence)text);
        1ib.setTypeface(7wd.LIZ().LIZ(7wf.LJI));
        1ib.setGravity(17);
        1ib.setTextSize(15.0f);
        1ib.setTextColor(0cB.LIZIZ(2131100837));
        return 1ib;
    }
    
    public final void LIZ(final 1Uo 1Uo) {
        CTM.LIZ((Object)1Uo);
        if (1NO.LIZ().LJI == 2) {
            final GCe liz = GCe.LIZ();
            n.LIZIZ((Object)liz, "");
            final String liziz = liz.LIZIZ();
            if (liziz != null) {
                1Uo.LIZ(liziz, true);
            }
            return;
        }
        if (1NO.LIZ().LJI == 1) {
            final GCe liz2 = GCe.LIZ();
            n.LIZIZ((Object)liz2, "");
            final String liziz2 = liz2.LIZIZ();
            if (liziz2 != null) {
                1Uo.LIZ(liziz2, false);
            }
        }
    }
    
    public final void LIZ(final 2fc 2fc, final FH6 fh6) {
        CTM.LIZ((Object)2fc, (Object)fh6);
        fh6.LIZ(2fc);
    }
    
    public final void LIZ(final Context context, final LinkPlayerInfo linkPlayerInfo, final int n, final boolean b, final FH6 fh6) {
        public final class 1Tx<T> implements 2d6
        {
            public final /* synthetic */ LinkPlayerInfo LIZ;
            public final /* synthetic */ Context LIZIZ;
            
            static {
                Covode.recordClassIndex(8475);
            }
            
            public 1Tx(final LinkPlayerInfo liz, final Context liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 1Tw<T> implements 2d6
        {
            public final /* synthetic */ int LIZ;
            public final /* synthetic */ LinkPlayerInfo LIZIZ;
            public final /* synthetic */ Context LIZJ;
            
            static {
                Covode.recordClassIndex(8474);
            }
            
            public 1Tw(final int liz, final LinkPlayerInfo liziz, final Context lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "realAnchorMuteGuestOp-> userid:"
        //     6: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //     9: astore          6
        //    11: aconst_null    
        //    12: astore          7
        //    14: aload_2        
        //    15: ifnull          368
        //    18: aload_2        
        //    19: getfield        com/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo.LIZJ:Lcom/bytedance/android/live/base/model/user/User;
        //    22: astore          8
        //    24: aload           8
        //    26: ifnull          368
        //    29: aload           8
        //    31: invokevirtual   com/bytedance/android/live/base/model/user/User.getIdStr:()Ljava/lang/String;
        //    34: astore          8
        //    36: aload           6
        //    38: aload           8
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload           6
        //    46: ldc_w           " , interactId:"
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_2        
        //    54: ifnull          362
        //    57: aload_2        
        //    58: getfield        com/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo.LJIIIZ:Ljava/lang/String;
        //    61: astore          8
        //    63: aload           6
        //    65: aload           8
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: pop            
        //    71: aload           6
        //    73: ldc_w           " , appVersion:"
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: pop            
        //    80: aload_2        
        //    81: ifnull          356
        //    84: aload_2        
        //    85: getfield        com/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo.LJIILIIL:I
        //    88: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    91: astore          8
        //    93: aload           6
        //    95: aload           8
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   100: pop            
        //   101: iconst_4       
        //   102: ldc_w           "anchorMuteGuest/anchor"
        //   105: aload           6
        //   107: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   110: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   113: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //   116: astore          6
        //   118: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   121: ldc             LX/HQ5;.class
        //   123: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   126: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   129: astore          8
        //   131: lconst_0       
        //   132: lstore          9
        //   134: aload           8
        //   136: ifnull          350
        //   139: aload           8
        //   141: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   144: lstore          11
        //   146: aload_0        
        //   147: invokevirtual   X/0ql.LIZ:()J
        //   150: lstore          13
        //   152: iload           4
        //   154: ifeq            303
        //   157: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveAnchorOneVnSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveAnchorOneVnSetting;
        //   160: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveAnchorOneVnSetting.enable1vn:()Z
        //   163: ifeq            343
        //   166: getstatic       X/0sD.LIZJ:LX/0sC;
        //   169: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   172: invokevirtual   X/0sD.LIZLLL:()Z
        //   175: ifeq            343
        //   178: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //   181: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.channelId:()Ljava/lang/String;
        //   186: invokestatic    X/353.LJI:(Ljava/lang/String;)Ljava/lang/Long;
        //   189: astore          8
        //   191: aload           8
        //   193: ifnull          203
        //   196: aload           8
        //   198: invokevirtual   java/lang/Long.longValue:()J
        //   201: lstore          9
        //   203: aload           7
        //   205: astore          8
        //   207: aload_2        
        //   208: ifnull          236
        //   211: aload_2        
        //   212: getfield        com/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo.LIZJ:Lcom/bytedance/android/live/base/model/user/User;
        //   215: astore          15
        //   217: aload           7
        //   219: astore          8
        //   221: aload           15
        //   223: ifnull          236
        //   226: aload           15
        //   228: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   231: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   234: astore          8
        //   236: aload           6
        //   238: new             LX/1Wc;
        //   241: dup            
        //   242: lload           11
        //   244: lload           13
        //   246: lload           9
        //   248: aload           8
        //   250: iload_3        
        //   251: invokespecial   X/1Wc.<init>:(JJJLjava/lang/Long;I)V
        //   254: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.anchorMuteGuest:(LX/1Wc;)LX/FBF;
        //   259: astore          8
        //   261: aload           8
        //   263: ifnull          374
        //   266: aload           8
        //   268: new             LX/1Tw;
        //   271: dup            
        //   272: iload_3        
        //   273: aload_2        
        //   274: aload_1        
        //   275: invokespecial   X/1Tw.<init>:(ILcom/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo;Landroid/content/Context;)V
        //   278: new             LX/1Tx;
        //   281: dup            
        //   282: aload_2        
        //   283: aload_1        
        //   284: invokespecial   X/1Tx.<init>:(Lcom/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo;Landroid/content/Context;)V
        //   287: invokevirtual   X/FBF.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   290: astore_1       
        //   291: aload_1        
        //   292: ifnull          374
        //   295: aload_0        
        //   296: aload_1        
        //   297: aload           5
        //   299: invokevirtual   X/0ql.LIZ:(LX/2fc;LX/FH6;)V
        //   302: return         
        //   303: getstatic       X/0sD.LIZJ:LX/0sC;
        //   306: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   309: invokevirtual   X/0sD.LIZLLL:()Z
        //   312: ifeq            343
        //   315: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //   318: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.channelId:()Ljava/lang/String;
        //   323: invokestatic    X/353.LJI:(Ljava/lang/String;)Ljava/lang/Long;
        //   326: astore          8
        //   328: aload           8
        //   330: ifnull          203
        //   333: aload           8
        //   335: invokevirtual   java/lang/Long.longValue:()J
        //   338: lstore          9
        //   340: goto            203
        //   343: lload           11
        //   345: lstore          9
        //   347: goto            203
        //   350: lconst_0       
        //   351: lstore          11
        //   353: goto            146
        //   356: aconst_null    
        //   357: astore          8
        //   359: goto            93
        //   362: aconst_null    
        //   363: astore          8
        //   365: goto            63
        //   368: aconst_null    
        //   369: astore          8
        //   371: goto            36
        //   374: return         
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
    
    public final void LIZ(final View view) {
        public final class 0qk implements ViewTreeObserver$OnGlobalLayoutListener
        {
            public final /* synthetic */ View LIZ;
            
            static {
                Covode.recordClassIndex(8472);
            }
            
            public 0qk(final View liz) {
                this.LIZ = liz;
            }
            
            public final void onGlobalLayout() {
                View liz = this.LIZ;
                while (liz != null) {
                    if (!liz.hasOnClickListeners()) {
                        if (liz.getParent() != null) {
                            final ViewParent parent = liz.getParent();
                            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                            if (!((liz = (View)parent) instanceof GrB)) {
                                continue;
                            }
                        }
                        return;
                    }
                    final StringBuilder sb = new StringBuilder("should not register onCLickListener on view , use BaseSingleTapEvent instead!! Entry = ");
                    sb.append(this.LIZ);
                    sb.append(" , Click = ");
                    sb.append(liz);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            12
        //     6: getstatic       X/H25.LJFF:Z
        //     9: ifeq            33
        //    12: aload_1        
        //    13: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    16: astore_2       
        //    17: aload_2        
        //    18: ifnull          33
        //    21: aload_2        
        //    22: new             LX/0qk;
        //    25: dup            
        //    26: aload_1        
        //    27: invokespecial   X/0qk.<init>:(Landroid/view/View;)V
        //    30: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //    33: return         
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
    
    public final void LIZ(final ImageView imageView, final int n, final Context context) {
        CTM.LIZ((Object)imageView);
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    if (imageView instanceof 1It) {
                        ((1It)imageView).setIcon(0eI.LIZ(context, 2131886327, 2130970562));
                        return;
                    }
                    imageView.setImageDrawable(0cB.LIZJ(2131234597));
                }
            }
            else {
                if (imageView instanceof 1It) {
                    ((1It)imageView).setIcon(0eI.LIZ(context, 2131886327, 2130970558));
                    return;
                }
                imageView.setImageDrawable(0cB.LIZJ(2131234601));
            }
        }
        else {
            if (imageView instanceof 1It) {
                ((1It)imageView).setIcon(2131234598);
                return;
            }
            imageView.setImageDrawable(0cB.LIZJ(2131234598));
        }
    }
    
    public final void LIZ(final Long n) {
        0ql.LIZIZ.put(n, System.currentTimeMillis());
    }
    
    public final boolean LIZ(final MotionEvent motionEvent, final View view) {
        if (motionEvent == null || view == null) {
            return false;
        }
        final int[] array2;
        final int[] array = array2 = new int[2];
        array2[1] = (array2[0] = 0);
        view.getLocationOnScreen(array);
        return new Rect(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight()).contains((int)motionEvent.getX(), (int)motionEvent.getY());
    }
    
    public final boolean LIZ(final User user) {
        CTM.LIZ((Object)user);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final User owner = room.getOwner();
            if (owner != null && owner.getId() == user.getId() && user.getId() != 0L) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean LIZ(final LinkPlayerInfo linkPlayerInfo, final int n, final boolean b) {
        boolean b2 = true;
        final Object o = null;
    Label_0076_Outer:
        while (true) {
            Label_0513: {
                if (linkPlayerInfo == null) {
                    break Label_0513;
                }
                final User lizj = linkPlayerInfo.LIZJ;
                if (lizj == null) {
                    break Label_0513;
                }
                final String liz = 0W3.LIZ(lizj);
                String s = 0cB.LIZ(2131831217, liz);
                Label_0054: {
                    if (s == null || !b) {
                        while (true) {
                            Label_0507: {
                                if (linkPlayerInfo == null) {
                                    break Label_0507;
                                }
                                final User lizj2 = linkPlayerInfo.LIZJ;
                                if (lizj2 == null) {
                                    break Label_0507;
                                }
                                final String liz2 = 0W3.LIZ(lizj2);
                                s = 0cB.LIZ(2131831218, liz2);
                                n.LIZIZ((Object)s, "");
                                break Label_0054;
                            }
                            final String liz2 = null;
                            continue Label_0076_Outer;
                        }
                    }
                }
            Label_0124_Outer:
                while (true) {
                    Label_0452: {
                        if (linkPlayerInfo == null) {
                            break Label_0452;
                        }
                        final User lizj3 = linkPlayerInfo.LIZJ;
                        if (lizj3 == null) {
                            break Label_0452;
                        }
                        final String liz3 = 0W3.LIZ(lizj3);
                        String s2 = 0cB.LIZ(2131831220, liz3);
                        Label_0102: {
                            if (s2 == null || !b) {
                                while (true) {
                                    Label_0446: {
                                        if (linkPlayerInfo == null) {
                                            break Label_0446;
                                        }
                                        final User lizj4 = linkPlayerInfo.LIZJ;
                                        if (lizj4 == null) {
                                            break Label_0446;
                                        }
                                        final String liz4 = 0W3.LIZ(lizj4);
                                        s2 = 0cB.LIZ(2131831221, liz4);
                                        n.LIZIZ((Object)s2, "");
                                        break Label_0102;
                                    }
                                    final String liz4 = null;
                                    continue Label_0124_Outer;
                                }
                            }
                        }
                        while (true) {
                            Label_0391: {
                                if (linkPlayerInfo == null) {
                                    break Label_0391;
                                }
                                final User lizj5 = linkPlayerInfo.LIZJ;
                                if (lizj5 == null) {
                                    break Label_0391;
                                }
                                final String liz5 = 0W3.LIZ(lizj5);
                                n.LIZIZ((Object)0cB.LIZ(2131831183, liz5), "");
                                if (((H25.LJFF && AnchorMuteGuestCheckVersionSetting.INSTANCE.getValue() == 1) || !H25.LJFF) && (linkPlayerInfo == null || linkPlayerInfo.LJIILIIL < 2460)) {
                                    if (n == 1) {
                                        Hf4.LIZ(0cB.LJ(), s, 0L);
                                    }
                                    else {
                                        Hf4.LIZ(0cB.LJ(), s2, 0L);
                                    }
                                }
                                else {
                                    b2 = false;
                                }
                                final StringBuilder sb = new StringBuilder("checkMuteLimitedAndShowToast-> userid:");
                                while (true) {
                                    Label_0367: {
                                        if (linkPlayerInfo == null) {
                                            break Label_0367;
                                        }
                                        final User lizj6 = linkPlayerInfo.LIZJ;
                                        if (lizj6 == null) {
                                            break Label_0367;
                                        }
                                        final String idStr = lizj6.getIdStr();
                                        sb.append(idStr);
                                        sb.append(" , interactId:");
                                        String ljiiiz;
                                        if (linkPlayerInfo != null) {
                                            ljiiiz = linkPlayerInfo.LJIIIZ;
                                        }
                                        else {
                                            ljiiiz = null;
                                        }
                                        sb.append(ljiiiz);
                                        sb.append(" , status:");
                                        sb.append(n);
                                        sb.append(" , isOpCamera:");
                                        sb.append(b);
                                        sb.append(" , appVersion:");
                                        Object value = o;
                                        if (linkPlayerInfo != null) {
                                            value = linkPlayerInfo.LJIILIIL;
                                        }
                                        sb.append(value);
                                        sb.append(" , limited:");
                                        sb.append(b2);
                                        0ba.LIZ(4, "anchorMuteGuest/anchor", sb.toString());
                                        return b2;
                                    }
                                    final String idStr = null;
                                    continue;
                                }
                            }
                            final String liz5 = null;
                            continue;
                        }
                    }
                    final String liz3 = null;
                    continue;
                }
            }
            final String liz = null;
            continue;
        }
    }
    
    public final boolean LIZ(final String ljff, final Context context, final FH6 fh6) {
        public final class 1lc extends Fww<0W5>
        {
            public final /* synthetic */ FH6 LIZ;
            
            static {
                Covode.recordClassIndex(8473);
            }
            
            public 1lc(final FH6 liz) {
                this.LIZ = liz;
            }
            
            public final void onSubscribe(final 2fc 2fc) {
                CTM.LIZ((Object)2fc);
                super.onSubscribe(2fc);
                this.LIZ.LIZ(2fc);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_3        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //     8: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //    11: astore          4
        //    13: aload           4
        //    15: ldc             ""
        //    17: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: aload           4
        //    22: invokeinterface X/GIK.LJ:()Z
        //    27: ifne            108
        //    30: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //    33: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //    36: astore          4
        //    38: invokestatic    X/GGS.LIZ:()LX/GGR;
        //    41: astore          5
        //    43: aload           5
        //    45: ldc_w           2131835702
        //    48: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //    51: putfield        X/GGR.LIZ:Ljava/lang/String;
        //    54: aload           5
        //    56: iconst_m1      
        //    57: putfield        X/GGR.LIZJ:I
        //    60: aload           5
        //    62: ldc_w           "gift"
        //    65: putfield        X/GGR.LJ:Ljava/lang/String;
        //    68: aload           5
        //    70: aload_1        
        //    71: putfield        X/GGR.LJFF:Ljava/lang/String;
        //    74: aload           5
        //    76: ldc_w           "popup"
        //    79: putfield        X/GGR.LIZLLL:Ljava/lang/String;
        //    82: aload           4
        //    84: aload_2        
        //    85: aload           5
        //    87: invokevirtual   X/GGR.LIZ:()LX/GGS;
        //    90: invokeinterface X/GIK.LIZ:(Landroid/content/Context;LX/GGS;)LX/FBF;
        //    95: new             LX/1lc;
        //    98: dup            
        //    99: aload_3        
        //   100: invokespecial   X/1lc.<init>:(LX/FH6;)V
        //   103: invokevirtual   X/FBF.LIZ:(LX/Cx6;)V
        //   106: iconst_0       
        //   107: ireturn        
        //   108: invokestatic    X/0ql.LJFF:()Z
        //   111: ifne            125
        //   114: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //   117: ldc_w           2131831041
        //   120: invokestatic    X/Hf4.LIZ:(Landroid/content/Context;I)V
        //   123: iconst_0       
        //   124: ireturn        
        //   125: iconst_1       
        //   126: ireturn        
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
    
    public final int LIZIZ(LinkPlayerInfo liz, final 1Uo 1Uo) {
        CTM.LIZ((Object)1Uo);
        final 1Uo.a ljjijiijil = 1Uo.LJJIJIIJIL;
        long ljiiljjil;
        if (liz != null) {
            ljiiljjil = liz.LJIILJJIL;
        }
        else {
            ljiiljjil = 3L;
        }
        final int liz2 = ljjijiijil.LIZ(ljiiljjil);
        final int n = 0;
        int n2;
        if (liz2 == 3 || liz2 == 1) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Object liz3 = 1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        final boolean b = liz3 instanceof 1XD;
        final String s = null;
        if (!b) {
            liz3 = null;
        }
        final 1XD 1xd = (1XD)liz3;
        int n3;
        if (n2 == 0) {
            n3 = n;
        }
        else {
            String ljiiiz = s;
            if (liz != null) {
                ljiiiz = liz.LJIIIZ;
            }
            final Boolean lizj = 1Uo.LIZJ(ljiiiz);
            Label_0204: {
                if (lizj != null) {
                    final boolean booleanValue = lizj;
                    final Integer value = 2;
                    value.intValue();
                    if (booleanValue && value != null) {
                        n3 = value;
                        return n3;
                    }
                }
                else {
                    final Integer value2 = 2;
                    value2.intValue();
                    if (1xd != null) {
                        final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> ljff = 1xd.LJFF();
                        if (ljff != null) {
                            String ljiiiz2;
                            if (liz == null || (ljiiiz2 = liz.LJIIIZ) == null) {
                                ljiiiz2 = "";
                            }
                            CTM.LIZ((Object)ljff, (Object)ljiiiz2);
                            if (TextUtils.isEmpty((CharSequence)ljiiiz2)) {
                                break Label_0204;
                            }
                            liz = 0sc.LIZ(ljff, ljiiiz2);
                            if (liz == null || liz.LJFF == 1) {
                                break Label_0204;
                            }
                        }
                    }
                    if (value2 != null) {
                        n3 = value2;
                        return n3;
                    }
                }
            }
            n3 = 1;
        }
        return n3;
    }
    
    public final int LIZIZ(LinkListUser lizlll, final 1Uo 1Uo) {
        CTM.LIZ((Object)1Uo);
        final long ljjii = 1Uo.LJJII;
        final int n = 0;
        int n2;
        if (ljjii == 3L || ljjii == 1L) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        final boolean b = liz instanceof 1XE;
        final String s = null;
        if (!b) {
            liz = null;
        }
        final 1XE 1xe = (1XE)liz;
        int n3;
        if (n2 == 0) {
            n3 = n;
        }
        else {
            String lj = s;
            if (lizlll != null) {
                lj = lizlll.LJ;
            }
            final Boolean lizj = 1Uo.LIZJ(lj);
            Label_0198: {
                if (lizj != null) {
                    final boolean booleanValue = lizj;
                    final Integer value = 2;
                    value.intValue();
                    if (booleanValue && value != null) {
                        n3 = value;
                        return n3;
                    }
                }
                else {
                    final Integer value2 = 2;
                    value2.intValue();
                    if (1xe != null) {
                        final 0sh<LinkListUser, LinkMessage> ljff = 1xe.LJFF();
                        if (ljff != null) {
                            String lj2;
                            if (lizlll == null || (lj2 = lizlll.LJ) == null) {
                                lj2 = "";
                            }
                            CTM.LIZ((Object)ljff, (Object)lj2);
                            if (TextUtils.isEmpty((CharSequence)lj2)) {
                                break Label_0198;
                            }
                            lizlll = 0sc.LIZLLL(ljff, lj2);
                            if (lizlll == null || lizlll.LIZJ == 1) {
                                break Label_0198;
                            }
                        }
                    }
                    if (value2 != null) {
                        n3 = value2;
                        return n3;
                    }
                }
            }
            n3 = 1;
        }
        return n3;
    }
    
    public final LinkPlayerInfo LIZIZ() {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return null;
        }
        final LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LJIILL = 0;
        final User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        linkPlayerInfo.LIZJ = owner;
        return linkPlayerInfo;
    }
    
    public final void LIZIZ(final ImageView imageView, final int n, final Context context) {
        CTM.LIZ((Object)imageView);
        if (n != 1) {
            if (n == 2) {
                if (imageView instanceof 1It) {
                    ((1It)imageView).setIcon(0eI.LIZ(context, 2131886327, 2130970408));
                    return;
                }
                imageView.setImageDrawable(0cB.LIZJ(2131234486));
            }
            return;
        }
        if (imageView instanceof 1It) {
            ((1It)imageView).setIcon(0eI.LIZ(context, 2131886327, 2130970407));
            return;
        }
        imageView.setImageDrawable(0cB.LIZJ(2131234487));
    }
    
    public final boolean LIZIZ(final User user) {
        CTM.LIZ((Object)user);
        final UserAttr userAttr = user.getUserAttr();
        n.LIZIZ((Object)userAttr, "");
        return userAttr.LIZIZ;
    }
    
    public final boolean LIZIZ(final Long n) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        Object value = null;
        if (room != null) {
            final User owner = room.getOwner();
            value = value;
            if (owner != null) {
                value = owner.getId();
            }
        }
        return n.LIZ(value, (Object)n);
    }
    
    public final boolean LIZJ() {
        if (System.currentTimeMillis() - 0ql.LIZJ <= 500L) {
            return true;
        }
        0ql.LIZJ = System.currentTimeMillis();
        return false;
    }
    
    public final boolean LIZLLL() {
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        final User liziz2 = liziz.LIZIZ();
        n.LIZIZ((Object)liziz2, "");
        return this.LIZ(liziz2);
    }
    
    public final boolean LJ() {
        if (LiveAnchorOneVnSetting.INSTANCE.enable1vn() && GCe.LIZ().LIZJ) {
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            final User liziz2 = liziz.LIZIZ();
            n.LIZIZ((Object)liziz2, "");
            if (!this.LIZ(liziz2) || !a.LIZLLL) {
                final GIK liziz3 = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz3, "");
                final User liziz4 = liziz3.LIZIZ();
                n.LIZIZ((Object)liziz4, "");
                if (this.LIZ(liziz4) || !a.LJII) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final class a
    {
        public static boolean LIZ;
        public static boolean LIZIZ;
        public static boolean LIZJ;
        public static boolean LIZLLL;
        public static boolean LJ;
        public static boolean LJFF;
        public static boolean LJI;
        public static boolean LJII;
        public static boolean LJIIIIZZ;
        
        static {
            Covode.recordClassIndex(8467);
            final int liz = AnchorMuteGuestAnchorSetting.INSTANCE.getValue().LIZ;
            final boolean b = false;
            a.LIZ = (liz == 0 || !LiveAnchorOneVnSetting.INSTANCE.enable1vn());
            a.LIZIZ = (AnchorMuteGuestAnchorSetting.INSTANCE.getValue().LIZIZ == 1 && LiveAnchorOneVnSetting.INSTANCE.enable1vn());
            a.LIZJ = (AnchorMuteGuestAnchorSetting.INSTANCE.getValue().LIZJ == 1 && LiveAnchorOneVnSetting.INSTANCE.enable1vn());
            while (true) {
                Label_0296: {
                    if (AnchorMuteGuestAnchorSetting.INSTANCE.getValue().LIZLLL != 1 || !LiveAnchorOneVnSetting.INSTANCE.enable1vn()) {
                        break Label_0296;
                    }
                    final IInteractService liz2 = 0jR.LIZ(IInteractService.class);
                    n.LIZIZ((Object)liz2, "");
                    if (!liz2.isInMultiGuest()) {
                        break Label_0296;
                    }
                    final boolean lizlll = true;
                    a.LIZLLL = lizlll;
                    a.LJ = (AnchorMuteGuestGuestSetting.INSTANCE.getValue().LIZ == 1 && LiveAnchorOneVnSetting.INSTANCE.enable1vn());
                    a.LJFF = (AnchorMuteGuestGuestSetting.INSTANCE.getValue().LIZIZ == 0);
                    a.LJI = (AnchorMuteGuestGuestSetting.INSTANCE.getValue().LIZJ == 0 && LiveAnchorOneVnSetting.INSTANCE.enable1vn());
                    a.LJII = (AnchorMuteGuestGuestSetting.INSTANCE.getValue().LIZLLL == 1 && LiveAnchorOneVnSetting.INSTANCE.enable1vn());
                    boolean ljiiiizz = b;
                    if (AnchorMuteGuestDoubletouchSetting.INSTANCE.getValue() == 1) {
                        ljiiiizz = b;
                        if (LiveAnchorOneVnSetting.INSTANCE.enable1vn()) {
                            ljiiiizz = true;
                        }
                    }
                    a.LJIIIIZZ = ljiiiizz;
                    return;
                }
                final boolean lizlll = false;
                continue;
            }
        }
    }
}
