// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData$TopHostInfo;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoHostPreviewAnchorAndroidSwitchSetting;
import android.widget.ImageView;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.live.base.model.user.User;
import android.view.View$OnClickListener;
import android.animation.TypeEvaluator;
import android.animation.ArgbEvaluator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import java.util.Objects;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.animation.ValueAnimator;

public final class 1PL extends Evv<1P3, a>
{
    public ValueAnimator LIZ;
    public final DataChannel LIZIZ;
    public final 0lW LIZJ;
    
    static {
        Covode.recordClassIndex(7422);
    }
    
    public 1PL(final 0lW lizj, final DataChannel liziz) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
        this.LIZIZ = liziz;
    }
    
    private final void LIZ(final View view) {
        public final class 0lk implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ View LIZ;
            
            static {
                Covode.recordClassIndex(7440);
            }
            
            public 0lk(final View liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this.LIZ.setBackgroundColor((int)animatedValue);
            }
        }
        public final class 0lj implements Animator$AnimatorListener
        {
            public final /* synthetic */ 1PL LIZ;
            
            static {
                Covode.recordClassIndex(7439);
            }
            
            public 0lj(final 1PL liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationEnd(final Animator animator) {
                CTM.LIZ((Object)animator);
                this.LIZ.LIZ();
            }
            
            public final void onAnimationRepeat(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationStart(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
        }
        public final class 0li implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ View LIZ;
            
            static {
                Covode.recordClassIndex(7438);
            }
            
            public 0li(final View liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this.LIZ.setBackgroundColor((int)animatedValue);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   android/animation/ArgbEvaluator.<init>:()V
        //     7: iconst_2       
        //     8: anewarray       Ljava/lang/Object;
        //    11: dup            
        //    12: iconst_0       
        //    13: ldc             2131100904
        //    15: invokestatic    X/0cB.LIZIZ:(I)I
        //    18: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    21: aastore        
        //    22: dup            
        //    23: iconst_1       
        //    24: ldc             2131100923
        //    26: invokestatic    X/0cB.LIZIZ:(I)I
        //    29: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    32: aastore        
        //    33: invokestatic    android/animation/ValueAnimator.ofObject:(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;
        //    36: astore_2       
        //    37: aload_2        
        //    38: ldc2_w          1700
        //    41: invokevirtual   android/animation/ValueAnimator.setStartDelay:(J)V
        //    44: aload_2        
        //    45: ldc2_w          1700
        //    48: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //    51: pop            
        //    52: aload_2        
        //    53: iconst_0       
        //    54: invokevirtual   android/animation/ValueAnimator.setRepeatCount:(I)V
        //    57: aload_2        
        //    58: new             LX/0li;
        //    61: dup            
        //    62: aload_1        
        //    63: invokespecial   X/0li.<init>:(Landroid/view/View;)V
        //    66: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //    69: aload_2        
        //    70: new             LX/0lj;
        //    73: dup            
        //    74: aload_0        
        //    75: invokespecial   X/0lj.<init>:(LX/1PL;)V
        //    78: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    81: aload_2        
        //    82: ldc             ""
        //    84: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    87: aload_0        
        //    88: aload_2        
        //    89: putfield        X/1PL.LIZ:Landroid/animation/ValueAnimator;
        //    92: aload_2        
        //    93: invokevirtual   android/animation/ValueAnimator.start:()V
        //    96: new             Landroid/animation/ArgbEvaluator;
        //    99: dup            
        //   100: invokespecial   android/animation/ArgbEvaluator.<init>:()V
        //   103: iconst_2       
        //   104: anewarray       Ljava/lang/Object;
        //   107: dup            
        //   108: iconst_0       
        //   109: ldc             2131100923
        //   111: invokestatic    X/0cB.LIZIZ:(I)I
        //   114: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   117: aastore        
        //   118: dup            
        //   119: iconst_1       
        //   120: ldc             2131100904
        //   122: invokestatic    X/0cB.LIZIZ:(I)I
        //   125: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   128: aastore        
        //   129: invokestatic    android/animation/ValueAnimator.ofObject:(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;
        //   132: astore_2       
        //   133: aload_2        
        //   134: ldc2_w          200
        //   137: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   140: pop            
        //   141: aload_2        
        //   142: iconst_0       
        //   143: invokevirtual   android/animation/ValueAnimator.setRepeatCount:(I)V
        //   146: aload_2        
        //   147: new             LX/0lk;
        //   150: dup            
        //   151: aload_1        
        //   152: invokespecial   X/0lk.<init>:(Landroid/view/View;)V
        //   155: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   158: aload_2        
        //   159: invokevirtual   android/animation/ValueAnimator.start:()V
        //   162: return         
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
    
    private final void LIZIZ(final a a, final 1P3 1p3) {
        public final class 0lm implements View$OnClickListener
        {
            public final /* synthetic */ User LIZ;
            public final /* synthetic */ 1P3 LIZIZ;
            
            static {
                Covode.recordClassIndex(7443);
            }
            
            public 0lm(final User liz, final 1P3 liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onClick(final View view) {
                final FGP liz = FGP.LIZ();
                final UserProfileEvent userProfileEvent = new UserProfileEvent(this.LIZ);
                userProfileEvent.coHostEnable = true;
                userProfileEvent.linkInRoomEnable = false;
                userProfileEvent.roomId = this.LIZIZ.LIZJ.getId();
                final 0kf lj = this.LIZIZ.LJ;
                final 0kf follow_INVITE = 0kf.FOLLOW_INVITE;
                final String s = "mutual_follow";
                String mSource;
                if (lj == follow_INVITE) {
                    mSource = "mutual_follow";
                }
                else {
                    mSource = "recommend";
                }
                userProfileEvent.mSource = mSource;
                userProfileEvent.mClickUserPosition = "connection_list";
                String s2;
                if (this.LIZIZ.LJ == 0kf.FOLLOW_INVITE) {
                    s2 = "mutual_follow";
                }
                else {
                    s2 = "recommend";
                }
                userProfileEvent.trackExtra = FJ3.LIZLLL(new 8si[] { 8sj.LIZ((Object)"invitee_list", (Object)s2) });
                String s3;
                if (this.LIZIZ.LJ == 0kf.FOLLOW_INVITE) {
                    s3 = s;
                }
                else {
                    s3 = "recommend";
                }
                userProfileEvent.extraParams = FJ3.LIZLLL(new 8si[] { 8sj.LIZ((Object)"invitee_list", (Object)s3) });
                liz.LIZ((Object)userProfileEvent);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //     4: astore_3       
        //     5: aconst_null    
        //     6: astore          4
        //     8: aconst_null    
        //     9: astore          5
        //    11: aload_3        
        //    12: ifnull          707
        //    15: aload_3        
        //    16: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //    19: astore_3       
        //    20: aload_1        
        //    21: invokevirtual   X/1PI.LIZ:()LX/2Bo;
        //    24: astore          6
        //    26: aload_0        
        //    27: invokevirtual   X/1PL.LIZ:()V
        //    30: aload_2        
        //    31: getfield        X/1P3.LJII:Z
        //    34: ifeq            694
        //    37: aload_0        
        //    38: aload           6
        //    40: invokespecial   X/1PL.LIZ:(Landroid/view/View;)V
        //    43: aload_1        
        //    44: invokevirtual   X/1PI.LIZIZ:()LX/7wT;
        //    47: astore          6
        //    49: aload_3        
        //    50: ldc             ""
        //    52: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    55: aload           6
        //    57: aload_3        
        //    58: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //    61: aload           6
        //    63: invokevirtual   X/7wT.getWidth:()I
        //    66: aload           6
        //    68: invokevirtual   X/7wT.getHeight:()I
        //    71: ldc             2131234398
        //    73: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //    76: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting;
        //    79: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting.getValue:()Z
        //    82: ifeq            99
        //    85: aload           6
        //    87: new             LX/0lm;
        //    90: dup            
        //    91: aload_3        
        //    92: aload_2        
        //    93: invokespecial   X/0lm.<init>:(Lcom/bytedance/android/live/base/model/user/User;LX/1P3;)V
        //    96: invokevirtual   X/7wT.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    99: aload_1        
        //   100: invokevirtual   X/1PI.LIZJ:()LX/1ib;
        //   103: aload_3        
        //   104: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //   107: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   110: aload_1        
        //   111: invokevirtual   X/1PI.LIZLLL:()Landroidx/appcompat/widget/AppCompatImageView;
        //   114: astore          6
        //   116: aload_3        
        //   117: invokevirtual   com/bytedance/android/live/base/model/user/User.getAuthenticationInfo:()Lcom/bytedance/android/livesdk/model/AuthenticationInfo;
        //   120: ifnull          687
        //   123: iconst_0       
        //   124: istore          7
        //   126: aload           6
        //   128: iload           7
        //   130: invokevirtual   androidx/appcompat/widget/AppCompatImageView.setVisibility:(I)V
        //   133: aload_2        
        //   134: invokevirtual   X/1P3.LIZ:()Ljava/lang/String;
        //   137: invokestatic    X/5ow.LIZ:(Ljava/lang/String;)Z
        //   140: istore          8
        //   142: iconst_1       
        //   143: istore          7
        //   145: iload           8
        //   147: ifeq            510
        //   150: aload_2        
        //   151: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   154: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getUserCount:()I
        //   157: ifgt            510
        //   160: aload_1        
        //   161: invokevirtual   X/1PI.LJ:()Landroid/view/ViewGroup;
        //   164: bipush          8
        //   166: invokevirtual   android/view/ViewGroup.setVisibility:(I)V
        //   169: aload_2        
        //   170: getfield        X/1P3.LJ:LX/0kf;
        //   173: getstatic       X/0kf.FOLLOW_INVITE:LX/0kf;
        //   176: if_acmpne       386
        //   179: aload_1        
        //   180: invokevirtual   X/1PI.LJIIJ:()LX/1ib;
        //   183: bipush          8
        //   185: invokevirtual   X/1ib.setVisibility:(I)V
        //   188: aload_2        
        //   189: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   192: astore_3       
        //   193: aload_3        
        //   194: ifnull          380
        //   197: aload_3        
        //   198: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //   201: ifne            380
        //   204: aload_2        
        //   205: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   208: astore_3       
        //   209: aload_3        
        //   210: ifnull          374
        //   213: aload_3        
        //   214: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //   217: istore          9
        //   219: iload           9
        //   221: invokestatic    X/0lX.LIZ:(I)LX/0lu;
        //   224: astore_3       
        //   225: iload           7
        //   227: ifeq            348
        //   230: aload_2        
        //   231: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   234: astore_3       
        //   235: aload_3        
        //   236: ifnull          343
        //   239: aload_3        
        //   240: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   243: astore_3       
        //   244: aload_3        
        //   245: ifnull          343
        //   248: aload_3        
        //   249: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   252: astore_3       
        //   253: aload_3        
        //   254: invokestatic    X/5ow.LIZ:(Ljava/lang/String;)Z
        //   257: ifeq            285
        //   260: aload_1        
        //   261: invokevirtual   X/1PI.LJIIJ:()LX/1ib;
        //   264: bipush          8
        //   266: invokevirtual   X/1ib.setVisibility:(I)V
        //   269: aload_1        
        //   270: invokevirtual   X/1PI.LJIIJJI:()LX/1ib;
        //   273: bipush          8
        //   275: invokevirtual   X/1ib.setVisibility:(I)V
        //   278: aload_0        
        //   279: aload_1        
        //   280: aload_2        
        //   281: invokespecial   X/1PL.LIZJ:(LX/1PI;LX/1P3;)V
        //   284: return         
        //   285: aload_1        
        //   286: invokevirtual   X/1PI.LJIIJ:()LX/1ib;
        //   289: iconst_0       
        //   290: invokevirtual   X/1ib.setVisibility:(I)V
        //   293: aload_1        
        //   294: invokevirtual   X/1PI.LJIIJ:()LX/1ib;
        //   297: astore          4
        //   299: aload_2        
        //   300: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   303: astore          6
        //   305: aload           5
        //   307: astore_3       
        //   308: aload           6
        //   310: ifnull          334
        //   313: aload           6
        //   315: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   318: astore          6
        //   320: aload           5
        //   322: astore_3       
        //   323: aload           6
        //   325: ifnull          334
        //   328: aload           6
        //   330: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   333: astore_3       
        //   334: aload           4
        //   336: aload_3        
        //   337: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   340: goto            269
        //   343: aconst_null    
        //   344: astore_3       
        //   345: goto            253
        //   348: aload_3        
        //   349: ifnull          269
        //   352: aload_1        
        //   353: invokevirtual   X/1PI.LJIIJJI:()LX/1ib;
        //   356: iconst_0       
        //   357: invokevirtual   X/1ib.setVisibility:(I)V
        //   360: aload_1        
        //   361: invokevirtual   X/1PI.LJIIJJI:()LX/1ib;
        //   364: aload_3        
        //   365: invokevirtual   X/0lu.getReason:()Ljava/lang/String;
        //   368: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   371: goto            278
        //   374: iconst_0       
        //   375: istore          9
        //   377: goto            219
        //   380: iconst_0       
        //   381: istore          7
        //   383: goto            204
        //   386: aload_2        
        //   387: getfield        X/1P3.LJ:LX/0kf;
        //   390: getstatic       X/0kf.RECOMMEND_INVITE:LX/0kf;
        //   393: if_acmpne       278
        //   396: aload_2        
        //   397: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   400: astore_3       
        //   401: aload_3        
        //   402: ifnull          505
        //   405: aload_3        
        //   406: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   409: astore_3       
        //   410: aload_3        
        //   411: ifnull          505
        //   414: aload_3        
        //   415: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   418: astore_3       
        //   419: aload_3        
        //   420: invokestatic    X/5ow.LIZ:(Ljava/lang/String;)Z
        //   423: ifeq            447
        //   426: aload_1        
        //   427: invokevirtual   X/1PI.LJIIJ:()LX/1ib;
        //   430: bipush          8
        //   432: invokevirtual   X/1ib.setVisibility:(I)V
        //   435: aload_1        
        //   436: invokevirtual   X/1PI.LJIIJJI:()LX/1ib;
        //   439: bipush          8
        //   441: invokevirtual   X/1ib.setVisibility:(I)V
        //   444: goto            278
        //   447: aload_1        
        //   448: invokevirtual   X/1PI.LJIIJ:()LX/1ib;
        //   451: iconst_0       
        //   452: invokevirtual   X/1ib.setVisibility:(I)V
        //   455: aload_1        
        //   456: invokevirtual   X/1PI.LJIIJ:()LX/1ib;
        //   459: astore          5
        //   461: aload_2        
        //   462: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   465: astore          6
        //   467: aload           4
        //   469: astore_3       
        //   470: aload           6
        //   472: ifnull          496
        //   475: aload           6
        //   477: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   480: astore          6
        //   482: aload           4
        //   484: astore_3       
        //   485: aload           6
        //   487: ifnull          496
        //   490: aload           6
        //   492: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   495: astore_3       
        //   496: aload           5
        //   498: aload_3        
        //   499: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   502: goto            435
        //   505: aconst_null    
        //   506: astore_3       
        //   507: goto            419
        //   510: aload_1        
        //   511: invokevirtual   X/1PI.LJ:()Landroid/view/ViewGroup;
        //   514: iconst_0       
        //   515: invokevirtual   android/view/ViewGroup.setVisibility:(I)V
        //   518: aload_2        
        //   519: invokevirtual   X/1P3.LIZ:()Ljava/lang/String;
        //   522: invokestatic    X/GTi.LIZ:(Ljava/lang/CharSequence;)Z
        //   525: ifeq            666
        //   528: aload_2        
        //   529: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   532: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getUserCount:()I
        //   535: ifle            666
        //   538: aload_1        
        //   539: invokevirtual   X/1PI.LJI:()LX/1ib;
        //   542: iconst_0       
        //   543: invokevirtual   X/1ib.setVisibility:(I)V
        //   546: aload_2        
        //   547: invokevirtual   X/1P3.LIZ:()Ljava/lang/String;
        //   550: invokeinterface java/lang/CharSequence.length:()I
        //   555: ifne            613
        //   558: aload_1        
        //   559: invokevirtual   X/1PI.LJII:()LX/1It;
        //   562: bipush          8
        //   564: invokevirtual   X/1It.setVisibility:(I)V
        //   567: aload_1        
        //   568: invokevirtual   X/1PI.LJIIIIZZ:()LX/1ib;
        //   571: bipush          8
        //   573: invokevirtual   X/1ib.setVisibility:(I)V
        //   576: aload_1        
        //   577: invokevirtual   X/1PI.LJFF:()LX/1ib;
        //   580: astore_3       
        //   581: aload_2        
        //   582: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   585: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getUserCount:()I
        //   588: istore          9
        //   590: iload           9
        //   592: ifle            678
        //   595: aload_3        
        //   596: iconst_0       
        //   597: invokevirtual   X/1ib.setVisibility:(I)V
        //   600: aload_3        
        //   601: iload           9
        //   603: i2l            
        //   604: invokestatic    X/GKY.LIZIZ:(J)Ljava/lang/String;
        //   607: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   610: goto            169
        //   613: aload_1        
        //   614: invokevirtual   X/1PI.LJII:()LX/1It;
        //   617: iconst_0       
        //   618: invokevirtual   X/1It.setVisibility:(I)V
        //   621: aload_1        
        //   622: invokevirtual   X/1PI.LJIIIIZZ:()LX/1ib;
        //   625: iconst_0       
        //   626: invokevirtual   X/1ib.setVisibility:(I)V
        //   629: aload_1        
        //   630: invokevirtual   X/1PI.LJIIIIZZ:()LX/1ib;
        //   633: astore          6
        //   635: aload_2        
        //   636: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   639: getfield        com/bytedance/android/livesdkapi/depend/model/live/Room.hashtag:Lcom/bytedance/android/livesdk/model/Hashtag;
        //   642: astore_3       
        //   643: aload_3        
        //   644: ifnull          661
        //   647: aload_3        
        //   648: getfield        com/bytedance/android/livesdk/model/Hashtag.title:Ljava/lang/String;
        //   651: astore_3       
        //   652: aload           6
        //   654: aload_3        
        //   655: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   658: goto            576
        //   661: aconst_null    
        //   662: astore_3       
        //   663: goto            652
        //   666: aload_1        
        //   667: invokevirtual   X/1PI.LJI:()LX/1ib;
        //   670: bipush          8
        //   672: invokevirtual   X/1ib.setVisibility:(I)V
        //   675: goto            546
        //   678: aload_3        
        //   679: bipush          8
        //   681: invokevirtual   X/1ib.setVisibility:(I)V
        //   684: goto            169
        //   687: bipush          8
        //   689: istore          7
        //   691: goto            126
        //   694: aload           6
        //   696: ldc             2131100923
        //   698: invokestatic    X/0cB.LIZIZ:(I)I
        //   701: invokevirtual   X/2Bo.setBackgroundColor:(I)V
        //   704: goto            43
        //   707: aconst_null    
        //   708: astore_3       
        //   709: goto            20
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
    
    private final void LIZJ(final a a, final 1P3 1p3) {
        public final class 1w4 extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ a LIZ;
            
            static {
                Covode.recordClassIndex(7441);
            }
            
            public 1w4(final a liz) {
                this.LIZ = liz;
                super(0);
            }
            
            public final void LIZ() {
                final int n = 0ln.LIZ[this.LIZ.LIZJ.ordinal()];
                if (n == 1) {
                    final 1so ljiiiz = this.LIZ.LJIIIZ();
                    final int ljjjll = 1NN.LLFF.LIZ().LJJJLL;
                    ljiiiz.LIZ(2131886882);
                    ljiiiz.setEnabled(false);
                    ljiiiz.setText(H0H.LIZ(0cB.LIZ(2131829182), new Object[] { ljjjll }));
                    return;
                }
                if (n == 2) {
                    final 1so ljiiiz2 = this.LIZ.LJIIIZ();
                    ljiiiz2.LIZ(2131886882);
                    ljiiiz2.setEnabled(false);
                    ljiiiz2.setText(0cB.LIZ(2131829181));
                    return;
                }
                if (n != 3) {
                    if (n == 4) {
                        final 1so ljiiiz3 = this.LIZ.LJIIIZ();
                        ljiiiz3.LIZ(2131886878);
                        ljiiiz3.setEnabled(true);
                        ljiiiz3.setText(0cB.LIZ(2131829181));
                    }
                    return;
                }
                final 1so ljiiiz4 = this.LIZ.LJIIIZ();
                ljiiiz4.LIZ(2131886882);
                ljiiiz4.setEnabled(true);
                ljiiiz4.setText(0cB.LIZ(2131829181));
            }
        }
        public final class 0ll implements View$OnClickListener
        {
            public final /* synthetic */ 1PL LIZ;
            public final /* synthetic */ a LIZIZ;
            public final /* synthetic */ 1P3 LIZJ;
            
            static {
                Covode.recordClassIndex(7442);
            }
            
            public 0ll(final 1PL liz, final a liziz, final 1P3 lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            public final void onClick(View view) {
                final 1PL liz = this.LIZ;
                final a liziz = this.LIZIZ;
                final 1P3 lizj = this.LIZJ;
                final 0kd lizj2 = 1NN.LLFF.LIZ().LIZJ();
                if (!lizj.LJII) {
                    1NN.LLFF.LIZ().LJLJLLL = "";
                }
                final 1NN liz2 = 1NN.LLFF.LIZ();
                final RivalExtraInfo ljff = lizj.LJFF;
                while (true) {
                    Label_0205: {
                        if (ljff == null) {
                            break Label_0205;
                        }
                        final RivalExtraInfo$Tag ljiiiz = ljff.LJIIIZ;
                        if (ljiiiz == null) {
                            break Label_0205;
                        }
                        final Integer value = ljiiiz.LIZ;
                        liz2.LJLL = value;
                        1NN.LLFF.LIZ().LJLLILLLL = String.valueOf(lizj.LIZJ.getOwnerUserId());
                        if (LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
                            final Room lizj3 = lizj.LIZJ;
                            0kf 0kf;
                            if ((0kf = lizj.LJ) == null) {
                                0kf = X.0kf.NONE;
                            }
                            0xy.LIZ(lizj3, 0kf, lizj.LJI, "connection_list");
                        }
                        1jz.LIZ(lizj.LIZJ.getId());
                        if (liziz.LIZJ != 0lv.NORMAL) {
                            if (liziz.LIZJ != 0lv.INVITING && liziz.LIZJ == 0lv.MATURETHEME) {
                                Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131831810), 0L);
                            }
                            return;
                        }
                        if (!1NN.LLFF.LIZ().LJJZ) {
                            Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131829301), 0L);
                            return;
                        }
                        if (lizj2 == 0kd.INVITING) {
                            Hf4.LIZ(0cB.LJ(), 2131830319);
                            return;
                        }
                        if (lizj2 == 0kd.DISABLED) {
                            final GCe liz3 = GCe.LIZ();
                            n.LIZIZ((Object)liz3, "");
                            if (liz3.LIZLLL) {
                                DataChannelGlobal.LIZJ.LIZLLL((Class)2Gb.class);
                                return;
                            }
                            final DataChannel liziz2 = liz.LIZIZ;
                            if (liziz2 != null) {
                                final Room room = (Room)liziz2.LIZIZ((Class)G69.class);
                                if (room != null) {
                                    final User owner = room.getOwner();
                                    if (owner != null && owner.getSecret() == 1) {
                                        view = liziz.itemView;
                                        n.LIZIZ((Object)view, "");
                                        final Context context = view.getContext();
                                        n.LIZIZ((Object)context, "");
                                        final 1PJ 1pj = new 1PJ(liziz, lizj);
                                        0kf 0kf2;
                                        if ((0kf2 = lizj.LJ) == null) {
                                            0kf2 = 0kf.NONE;
                                        }
                                        0mD.LIZ(context, (0mD.a)1pj, false, 0kf2, String.valueOf(lizj.LIZJ.getId()));
                                        return;
                                    }
                                }
                            }
                            final 44V llzll = GST.LLZLL;
                            n.LIZIZ((Object)llzll, "");
                            final Object liz4 = ((44T)llzll).LIZ();
                            n.LIZIZ(liz4, "");
                            if ((boolean)liz4 || !LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
                                liz.LIZ(liziz, lizj);
                            }
                            else {
                                view = liziz.itemView;
                                n.LIZIZ((Object)view, "");
                                final Context context2 = view.getContext();
                                n.LIZIZ((Object)context2, "");
                                final 1PK 1pk = new 1PK(liziz, lizj);
                                0kf 0kf3;
                                if ((0kf3 = lizj.LJ) == null) {
                                    0kf3 = 0kf.NONE;
                                }
                                0m9.LIZ(context2, (0m9.a)1pk, 0kf3, String.valueOf(lizj.LIZJ.getId()));
                            }
                        }
                        return;
                    }
                    final Integer value = null;
                    continue;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   X/1w4.<init>:(LX/1PI;)V
        //     8: astore_3       
        //     9: aload_2        
        //    10: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //    13: astore          4
        //    15: aload           4
        //    17: ifnull          114
        //    20: aload           4
        //    22: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //    25: ifne            114
        //    28: getstatic       X/1NN.LLFF:LX/0k5;
        //    31: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    34: invokevirtual   X/1NN.LIZJ:()LX/0kd;
        //    37: getstatic       X/0kd.INVITING:LX/0kd;
        //    40: if_acmpne       104
        //    43: getstatic       X/1NN.LLFF:LX/0k5;
        //    46: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    49: getfield        X/1NN.LJJJLL:I
        //    52: iflt            104
        //    55: aload_2        
        //    56: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    59: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //    62: getstatic       X/1NN.LLFF:LX/0k5;
        //    65: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    68: getfield        X/1NN.LJFF:J
        //    71: lcmp           
        //    72: ifne            104
        //    75: aload_1        
        //    76: getstatic       X/0lv.INVITING:LX/0lv;
        //    79: invokevirtual   X/1PI.LIZ:(LX/0lv;)V
        //    82: aload_3        
        //    83: invokevirtual   X/1w4.LIZ:()V
        //    86: aload_1        
        //    87: invokevirtual   X/1PI.LJIIIZ:()LX/1so;
        //    90: new             LX/0ll;
        //    93: dup            
        //    94: aload_0        
        //    95: aload_1        
        //    96: aload_2        
        //    97: invokespecial   X/0ll.<init>:(LX/1PL;LX/1PI;LX/1P3;)V
        //   100: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   103: return         
        //   104: aload_1        
        //   105: getstatic       X/0lv.NORMAL:LX/0lv;
        //   108: invokevirtual   X/1PI.LIZ:(LX/0lv;)V
        //   111: goto            82
        //   114: aload_2        
        //   115: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   118: astore          4
        //   120: aload           4
        //   122: ifnull          145
        //   125: aload           4
        //   127: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //   130: bipush          7
        //   132: if_icmpne       145
        //   135: aload_1        
        //   136: getstatic       X/0lv.MATURETHEME:LX/0lv;
        //   139: invokevirtual   X/1PI.LIZ:(LX/0lv;)V
        //   142: goto            82
        //   145: aload_1        
        //   146: getstatic       X/0lv.UNAVAILABLE:LX/0lv;
        //   149: invokevirtual   X/1PI.LIZ:(LX/0lv;)V
        //   152: goto            82
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
    
    public final void LIZ() {
        if (this.LIZ != null) {
            final ValueAnimator liz = this.LIZ;
            if (liz == null) {
                n.LIZ("");
            }
            liz.cancel();
        }
    }
    
    public final void LIZ(final a a, final 1P3 1p3) {
        1NN.LLFF.LIZ().LJJIJLIJ = 1p3.LJI;
        1NN.LLFF.LIZ().LJJIL = 1p3.LIZJ;
        1NN.LLFF.LIZ().LJJIZ = 1p3.LJFF;
        final 1NN liz = 1NN.LLFF.LIZ();
        final RivalsListsData$TopHostInfo lizj = RivalsListsData$TopHostInfo.LIZJ;
        n.LIZIZ((Object)lizj, "");
        liz.LJJJIL = lizj;
        final 1NN liz2 = 1NN.LLFF.LIZ();
        0kf 0kf;
        if ((0kf = 1p3.LJ) == null) {
            0kf = X.0kf.NONE;
        }
        liz2.LIZ(0kf);
        a.LIZ(0lv.INVITING);
        final 0lW lizj2 = this.LIZJ;
        final Room lizj3 = 1p3.LIZJ;
        final RivalsListsData$TopHostInfo lizj4 = RivalsListsData$TopHostInfo.LIZJ;
        n.LIZIZ((Object)lizj4, "");
        lizj2.LIZ(lizj3, lizj4, 1p3);
    }
    
    public final class a extends ViewHolder
    {
        public final 5DO LIZ;
        public final 5DO LIZIZ;
        public 0lv LIZJ;
        public final 5DO LIZLLL;
        public final 5DO LJ;
        public final 5DO LJFF;
        public final 5DO LJI;
        public final 5DO LJII;
        public final 5DO LJIIIIZZ;
        public final 5DO LJIIIZ;
        public final 5DO LJIIJ;
        public final 5DO LJIIJJI;
        public final 5DO LJIIL;
        public final 5DO LJIILIIL;
        public final 5DO LJIILJJIL;
        
        static {
            Covode.recordClassIndex(7423);
        }
        
        public a(final View view) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
            //     4: aload_0        
            //     5: aload_1        
            //     6: invokespecial   androidx/recyclerview/widget/RecyclerView$ViewHolder.<init>:(Landroid/view/View;)V
            //     9: aload_0        
            //    10: new             LX/1vq;
            //    13: dup            
            //    14: aload_1        
            //    15: invokespecial   X/1vq.<init>:(Landroid/view/View;)V
            //    18: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    21: putfield        X/1PI.LIZLLL:LX/5DO;
            //    24: aload_0        
            //    25: new             LX/1w1;
            //    28: dup            
            //    29: aload_1        
            //    30: invokespecial   X/1w1.<init>:(Landroid/view/View;)V
            //    33: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    36: putfield        X/1PI.LJ:LX/5DO;
            //    39: aload_0        
            //    40: new             LX/1w0;
            //    43: dup            
            //    44: aload_1        
            //    45: invokespecial   X/1w0.<init>:(Landroid/view/View;)V
            //    48: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    51: putfield        X/1PI.LIZ:LX/5DO;
            //    54: aload_0        
            //    55: new             LX/1vw;
            //    58: dup            
            //    59: aload_1        
            //    60: invokespecial   X/1vw.<init>:(Landroid/view/View;)V
            //    63: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    66: putfield        X/1PI.LIZIZ:LX/5DO;
            //    69: aload_0        
            //    70: new             LX/1w3;
            //    73: dup            
            //    74: aload_1        
            //    75: invokespecial   X/1w3.<init>:(Landroid/view/View;)V
            //    78: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    81: putfield        X/1PI.LJFF:LX/5DO;
            //    84: aload_0        
            //    85: new             LX/1w2;
            //    88: dup            
            //    89: aload_1        
            //    90: invokespecial   X/1w2.<init>:(Landroid/view/View;)V
            //    93: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    96: putfield        X/1PI.LJI:LX/5DO;
            //    99: aload_0        
            //   100: new             LX/1vx;
            //   103: dup            
            //   104: aload_1        
            //   105: invokespecial   X/1vx.<init>:(Landroid/view/View;)V
            //   108: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   111: putfield        X/1PI.LJII:LX/5DO;
            //   114: aload_0        
            //   115: new             LX/1vr;
            //   118: dup            
            //   119: aload_1        
            //   120: invokespecial   X/1vr.<init>:(Landroid/view/View;)V
            //   123: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   126: putfield        X/1PI.LJIIIIZZ:LX/5DO;
            //   129: aload_0        
            //   130: new             LX/1vt;
            //   133: dup            
            //   134: aload_1        
            //   135: invokespecial   X/1vt.<init>:(Landroid/view/View;)V
            //   138: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   141: putfield        X/1PI.LJIIIZ:LX/5DO;
            //   144: aload_0        
            //   145: new             LX/1vy;
            //   148: dup            
            //   149: aload_1        
            //   150: invokespecial   X/1vy.<init>:(Landroid/view/View;)V
            //   153: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   156: putfield        X/1PI.LJIIJ:LX/5DO;
            //   159: aload_0        
            //   160: new             LX/1vz;
            //   163: dup            
            //   164: aload_1        
            //   165: invokespecial   X/1vz.<init>:(Landroid/view/View;)V
            //   168: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   171: putfield        X/1PI.LJIIJJI:LX/5DO;
            //   174: aload_0        
            //   175: new             LX/1vv;
            //   178: dup            
            //   179: aload_1        
            //   180: invokespecial   X/1vv.<init>:(Landroid/view/View;)V
            //   183: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   186: putfield        X/1PI.LJIIL:LX/5DO;
            //   189: aload_0        
            //   190: new             LX/1vu;
            //   193: dup            
            //   194: aload_1        
            //   195: invokespecial   X/1vu.<init>:(Landroid/view/View;)V
            //   198: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   201: putfield        X/1PI.LJIILIIL:LX/5DO;
            //   204: aload_0        
            //   205: new             LX/1vs;
            //   208: dup            
            //   209: aload_1        
            //   210: invokespecial   X/1vs.<init>:(Landroid/view/View;)V
            //   213: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   216: putfield        X/1PI.LJIILJJIL:LX/5DO;
            //   219: aload_0        
            //   220: getstatic       X/0lv.NORMAL:LX/0lv;
            //   223: putfield        X/1PI.LIZJ:LX/0lv;
            //   226: return         
            //    Signature:
            //  (Landroid/view/View;)V
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        
        public final 2Bo LIZ() {
            return (2Bo)this.LIZLLL.getValue();
        }
        
        public final void LIZ(final 0lv lizj) {
            CTM.LIZ((Object)lizj);
            this.LIZJ = lizj;
        }
        
        public final 7wT LIZIZ() {
            return (7wT)this.LJ.getValue();
        }
        
        public final 1ib LIZJ() {
            return (1ib)this.LJFF.getValue();
        }
        
        public final AppCompatImageView LIZLLL() {
            return (AppCompatImageView)this.LJI.getValue();
        }
        
        public final ViewGroup LJ() {
            return (ViewGroup)this.LJII.getValue();
        }
        
        public final 1ib LJFF() {
            return (1ib)this.LJIIIIZZ.getValue();
        }
        
        public final 1ib LJI() {
            return (1ib)this.LJIIIZ.getValue();
        }
        
        public final 1It LJII() {
            return (1It)this.LJIIJ.getValue();
        }
        
        public final 1ib LJIIIIZZ() {
            return (1ib)this.LJIIJJI.getValue();
        }
        
        public final 1so LJIIIZ() {
            return (1so)this.LJIIL.getValue();
        }
        
        public final 1ib LJIIJ() {
            return (1ib)this.LJIILIIL.getValue();
        }
        
        public final 1ib LJIIJJI() {
            return (1ib)this.LJIILJJIL.getValue();
        }
    }
}
