// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
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

public final class 1PP extends Evv<1P3, a>
{
    public ValueAnimator LIZ;
    public final DataChannel LIZIZ;
    public final 0lW LIZJ;
    
    static {
        Covode.recordClassIndex(7447);
    }
    
    public 1PP(final 0lW lizj, final DataChannel liziz) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
        this.LIZIZ = liziz;
    }
    
    private final void LIZ(final View view) {
        public final class 0lq implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ View LIZ;
            
            static {
                Covode.recordClassIndex(7465);
            }
            
            public 0lq(final View liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this.LIZ.setBackgroundColor((int)animatedValue);
            }
        }
        public final class 0lp implements Animator$AnimatorListener
        {
            public final /* synthetic */ 1PP LIZ;
            
            static {
                Covode.recordClassIndex(7464);
            }
            
            public 0lp(final 1PP liz) {
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
        public final class 0lo implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ View LIZ;
            
            static {
                Covode.recordClassIndex(7463);
            }
            
            public 0lo(final View liz) {
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
        //    58: new             LX/0lo;
        //    61: dup            
        //    62: aload_1        
        //    63: invokespecial   X/0lo.<init>:(Landroid/view/View;)V
        //    66: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //    69: aload_2        
        //    70: new             LX/0lp;
        //    73: dup            
        //    74: aload_0        
        //    75: invokespecial   X/0lp.<init>:(LX/1PP;)V
        //    78: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    81: aload_2        
        //    82: ldc             ""
        //    84: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    87: aload_0        
        //    88: aload_2        
        //    89: putfield        X/1PP.LIZ:Landroid/animation/ValueAnimator;
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
        //   147: new             LX/0lq;
        //   150: dup            
        //   151: aload_1        
        //   152: invokespecial   X/0lq.<init>:(Landroid/view/View;)V
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
        public final class 0ls implements View$OnClickListener
        {
            public final /* synthetic */ User LIZ;
            public final /* synthetic */ 1P3 LIZIZ;
            
            static {
                Covode.recordClassIndex(7468);
            }
            
            public 0ls(final User liz, final 1P3 liziz) {
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
        //     4: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //     7: astore_3       
        //     8: aload_1        
        //     9: invokevirtual   X/1PM.LIZ:()LX/2Bo;
        //    12: astore          4
        //    14: aload_0        
        //    15: invokevirtual   X/1PP.LIZ:()V
        //    18: aload_2        
        //    19: getfield        X/1P3.LJII:Z
        //    22: ifeq            664
        //    25: aload_0        
        //    26: aload           4
        //    28: invokespecial   X/1PP.LIZ:(Landroid/view/View;)V
        //    31: aload_1        
        //    32: invokevirtual   X/1PM.LIZIZ:()LX/7wT;
        //    35: astore          4
        //    37: aload_3        
        //    38: ldc             ""
        //    40: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    43: aload           4
        //    45: aload_3        
        //    46: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //    49: aload           4
        //    51: invokevirtual   X/7wT.getWidth:()I
        //    54: aload           4
        //    56: invokevirtual   X/7wT.getHeight:()I
        //    59: ldc             2131234398
        //    61: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //    64: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting;
        //    67: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveCoHostPreviewAnchorAndroidSwitchSetting.getValue:()Z
        //    70: ifeq            87
        //    73: aload           4
        //    75: new             LX/0ls;
        //    78: dup            
        //    79: aload_3        
        //    80: aload_2        
        //    81: invokespecial   X/0ls.<init>:(Lcom/bytedance/android/live/base/model/user/User;LX/1P3;)V
        //    84: invokevirtual   X/7wT.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    87: aload_1        
        //    88: invokevirtual   X/1PM.LIZJ:()LX/1ib;
        //    91: aload_3        
        //    92: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //    95: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //    98: aload_1        
        //    99: invokevirtual   X/1PM.LIZLLL:()Landroidx/appcompat/widget/AppCompatImageView;
        //   102: astore          4
        //   104: aload_3        
        //   105: invokevirtual   com/bytedance/android/live/base/model/user/User.getAuthenticationInfo:()Lcom/bytedance/android/livesdk/model/AuthenticationInfo;
        //   108: ifnull          657
        //   111: iconst_0       
        //   112: istore          5
        //   114: aload           4
        //   116: iload           5
        //   118: invokevirtual   androidx/appcompat/widget/AppCompatImageView.setVisibility:(I)V
        //   121: aload_2        
        //   122: getfield        X/1P3.LJ:LX/0kf;
        //   125: astore          6
        //   127: getstatic       X/0kf.FOLLOW_INVITE:LX/0kf;
        //   130: astore_3       
        //   131: aconst_null    
        //   132: astore          4
        //   134: aload           6
        //   136: aload_3        
        //   137: if_acmpne       540
        //   140: aload_1        
        //   141: invokevirtual   X/1PM.LJI:()LX/1ib;
        //   144: bipush          8
        //   146: invokevirtual   X/1ib.setVisibility:(I)V
        //   149: aload_2        
        //   150: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   153: astore_3       
        //   154: aload_3        
        //   155: ifnull          534
        //   158: aload_3        
        //   159: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //   162: ifne            534
        //   165: iconst_1       
        //   166: istore          5
        //   168: aload_2        
        //   169: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   172: astore_3       
        //   173: aload_3        
        //   174: ifnull          528
        //   177: aload_3        
        //   178: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //   181: istore          7
        //   183: iload           7
        //   185: invokestatic    X/0lX.LIZ:(I)LX/0lu;
        //   188: astore_3       
        //   189: iload           5
        //   191: ifeq            502
        //   194: aload_2        
        //   195: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   198: astore_3       
        //   199: aload_3        
        //   200: ifnull          497
        //   203: aload_3        
        //   204: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   207: astore_3       
        //   208: aload_3        
        //   209: ifnull          497
        //   212: aload_3        
        //   213: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   216: astore_3       
        //   217: aload_3        
        //   218: invokestatic    X/5ow.LIZ:(Ljava/lang/String;)Z
        //   221: ifeq            446
        //   224: aload_1        
        //   225: invokevirtual   X/1PM.LJI:()LX/1ib;
        //   228: bipush          8
        //   230: invokevirtual   X/1ib.setVisibility:(I)V
        //   233: aload_1        
        //   234: invokevirtual   X/1PM.LJIIJJI:()LX/1ib;
        //   237: bipush          8
        //   239: invokevirtual   X/1ib.setVisibility:(I)V
        //   242: aload_2        
        //   243: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   246: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getUserCount:()I
        //   249: istore          5
        //   251: aload_2        
        //   252: invokevirtual   X/1P3.LIZ:()Ljava/lang/String;
        //   255: invokestatic    X/5ow.LIZ:(Ljava/lang/String;)Z
        //   258: ifeq            282
        //   261: iload           5
        //   263: ifgt            282
        //   266: aload_1        
        //   267: invokevirtual   X/1PM.LJII:()Landroid/view/ViewGroup;
        //   270: bipush          8
        //   272: invokevirtual   android/view/ViewGroup.setVisibility:(I)V
        //   275: aload_0        
        //   276: aload_1        
        //   277: aload_2        
        //   278: invokespecial   X/1PP.LIZJ:(LX/1PM;LX/1P3;)V
        //   281: return         
        //   282: aload_1        
        //   283: invokevirtual   X/1PM.LJII:()Landroid/view/ViewGroup;
        //   286: iconst_0       
        //   287: invokevirtual   android/view/ViewGroup.setVisibility:(I)V
        //   290: aload_2        
        //   291: invokevirtual   X/1P3.LIZ:()Ljava/lang/String;
        //   294: invokestatic    X/GTi.LIZ:(Ljava/lang/CharSequence;)Z
        //   297: ifeq            425
        //   300: iload           5
        //   302: ifle            425
        //   305: aload_1        
        //   306: invokevirtual   X/1PM.LJIIIIZZ:()LX/1ib;
        //   309: iconst_0       
        //   310: invokevirtual   X/1ib.setVisibility:(I)V
        //   313: aload_2        
        //   314: invokevirtual   X/1P3.LIZ:()Ljava/lang/String;
        //   317: invokeinterface java/lang/CharSequence.length:()I
        //   322: ifne            371
        //   325: aload_1        
        //   326: invokevirtual   X/1PM.LJIIIZ:()LX/1It;
        //   329: bipush          8
        //   331: invokevirtual   X/1It.setVisibility:(I)V
        //   334: aload_1        
        //   335: invokevirtual   X/1PM.LJIIJ:()LX/1ib;
        //   338: bipush          8
        //   340: invokevirtual   X/1ib.setVisibility:(I)V
        //   343: aload_1        
        //   344: invokevirtual   X/1PM.LJ:()LX/1ib;
        //   347: astore_3       
        //   348: iload           5
        //   350: ifle            437
        //   353: aload_3        
        //   354: iconst_0       
        //   355: invokevirtual   X/1ib.setVisibility:(I)V
        //   358: aload_3        
        //   359: iload           5
        //   361: i2l            
        //   362: invokestatic    X/GKY.LIZIZ:(J)Ljava/lang/String;
        //   365: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   368: goto            275
        //   371: aload_1        
        //   372: invokevirtual   X/1PM.LJIIIZ:()LX/1It;
        //   375: iconst_0       
        //   376: invokevirtual   X/1It.setVisibility:(I)V
        //   379: aload_1        
        //   380: invokevirtual   X/1PM.LJIIJ:()LX/1ib;
        //   383: iconst_0       
        //   384: invokevirtual   X/1ib.setVisibility:(I)V
        //   387: aload_1        
        //   388: invokevirtual   X/1PM.LJIIJ:()LX/1ib;
        //   391: astore          6
        //   393: aload_2        
        //   394: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   397: getfield        com/bytedance/android/livesdkapi/depend/model/live/Room.hashtag:Lcom/bytedance/android/livesdk/model/Hashtag;
        //   400: astore          8
        //   402: aload           4
        //   404: astore_3       
        //   405: aload           8
        //   407: ifnull          416
        //   410: aload           8
        //   412: getfield        com/bytedance/android/livesdk/model/Hashtag.title:Ljava/lang/String;
        //   415: astore_3       
        //   416: aload           6
        //   418: aload_3        
        //   419: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   422: goto            343
        //   425: aload_1        
        //   426: invokevirtual   X/1PM.LJIIIIZZ:()LX/1ib;
        //   429: bipush          8
        //   431: invokevirtual   X/1ib.setVisibility:(I)V
        //   434: goto            313
        //   437: aload_3        
        //   438: bipush          8
        //   440: invokevirtual   X/1ib.setVisibility:(I)V
        //   443: goto            275
        //   446: aload_1        
        //   447: invokevirtual   X/1PM.LJI:()LX/1ib;
        //   450: iconst_0       
        //   451: invokevirtual   X/1ib.setVisibility:(I)V
        //   454: aload_1        
        //   455: invokevirtual   X/1PM.LJI:()LX/1ib;
        //   458: astore          6
        //   460: aload_2        
        //   461: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   464: astore_3       
        //   465: aload_3        
        //   466: ifnull          492
        //   469: aload_3        
        //   470: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   473: astore_3       
        //   474: aload_3        
        //   475: ifnull          492
        //   478: aload_3        
        //   479: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   482: astore_3       
        //   483: aload           6
        //   485: aload_3        
        //   486: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   489: goto            233
        //   492: aconst_null    
        //   493: astore_3       
        //   494: goto            483
        //   497: aconst_null    
        //   498: astore_3       
        //   499: goto            217
        //   502: aload_3        
        //   503: ifnull          233
        //   506: aload_1        
        //   507: invokevirtual   X/1PM.LJIIJJI:()LX/1ib;
        //   510: iconst_0       
        //   511: invokevirtual   X/1ib.setVisibility:(I)V
        //   514: aload_1        
        //   515: invokevirtual   X/1PM.LJIIJJI:()LX/1ib;
        //   518: aload_3        
        //   519: invokevirtual   X/0lu.getReason:()Ljava/lang/String;
        //   522: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   525: goto            242
        //   528: iconst_0       
        //   529: istore          7
        //   531: goto            183
        //   534: iconst_0       
        //   535: istore          5
        //   537: goto            168
        //   540: aload_2        
        //   541: getfield        X/1P3.LJ:LX/0kf;
        //   544: getstatic       X/0kf.RECOMMEND_INVITE:LX/0kf;
        //   547: if_acmpne       242
        //   550: aload_2        
        //   551: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   554: astore_3       
        //   555: aload_3        
        //   556: ifnull          652
        //   559: aload_3        
        //   560: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   563: astore_3       
        //   564: aload_3        
        //   565: ifnull          652
        //   568: aload_3        
        //   569: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   572: astore_3       
        //   573: aload_3        
        //   574: invokestatic    X/5ow.LIZ:(Ljava/lang/String;)Z
        //   577: ifeq            601
        //   580: aload_1        
        //   581: invokevirtual   X/1PM.LJI:()LX/1ib;
        //   584: bipush          8
        //   586: invokevirtual   X/1ib.setVisibility:(I)V
        //   589: aload_1        
        //   590: invokevirtual   X/1PM.LJIIJJI:()LX/1ib;
        //   593: bipush          8
        //   595: invokevirtual   X/1ib.setVisibility:(I)V
        //   598: goto            242
        //   601: aload_1        
        //   602: invokevirtual   X/1PM.LJI:()LX/1ib;
        //   605: iconst_0       
        //   606: invokevirtual   X/1ib.setVisibility:(I)V
        //   609: aload_1        
        //   610: invokevirtual   X/1PM.LJI:()LX/1ib;
        //   613: astore          6
        //   615: aload_2        
        //   616: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   619: astore_3       
        //   620: aload_3        
        //   621: ifnull          647
        //   624: aload_3        
        //   625: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   628: astore_3       
        //   629: aload_3        
        //   630: ifnull          647
        //   633: aload_3        
        //   634: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZJ:Ljava/lang/String;
        //   637: astore_3       
        //   638: aload           6
        //   640: aload_3        
        //   641: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   644: goto            589
        //   647: aconst_null    
        //   648: astore_3       
        //   649: goto            638
        //   652: aconst_null    
        //   653: astore_3       
        //   654: goto            573
        //   657: bipush          8
        //   659: istore          5
        //   661: goto            114
        //   664: aload           4
        //   666: ldc             2131100923
        //   668: invokestatic    X/0cB.LIZIZ:(I)I
        //   671: invokevirtual   X/2Bo.setBackgroundColor:(I)V
        //   674: goto            31
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
        public final class 1wJ extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ a LIZ;
            
            static {
                Covode.recordClassIndex(7466);
            }
            
            public 1wJ(final a liz) {
                this.LIZ = liz;
                super(0);
            }
            
            public final void LIZ() {
                final int n = 0lt.LIZ[this.LIZ.LIZJ.ordinal()];
                if (n == 1) {
                    final 1so ljff = this.LIZ.LJFF();
                    final int ljjjll = 1NN.LLFF.LIZ().LJJJLL;
                    ljff.LIZ(2131886882);
                    ljff.setEnabled(false);
                    ljff.setText(H0H.LIZ(0cB.LIZ(2131829182), new Object[] { ljjjll }));
                    return;
                }
                if (n == 2) {
                    final 1so ljff2 = this.LIZ.LJFF();
                    ljff2.LIZ(2131886882);
                    ljff2.setEnabled(false);
                    ljff2.setText(0cB.LIZ(2131829181));
                    return;
                }
                if (n != 3) {
                    if (n == 4) {
                        final 1so ljff3 = this.LIZ.LJFF();
                        ljff3.LIZ(2131886878);
                        ljff3.setEnabled(true);
                        ljff3.setText(0cB.LIZ(2131829181));
                    }
                    return;
                }
                final 1so ljff4 = this.LIZ.LJFF();
                ljff4.LIZ(2131886882);
                ljff4.setEnabled(true);
                ljff4.setText(0cB.LIZ(2131829181));
            }
        }
        public final class 0lr implements View$OnClickListener
        {
            public final /* synthetic */ 1PP LIZ;
            public final /* synthetic */ a LIZIZ;
            public final /* synthetic */ 1P3 LIZJ;
            
            static {
                Covode.recordClassIndex(7467);
            }
            
            public 0lr(final 1PP liz, final a liziz, final 1P3 lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            public final void onClick(View view) {
                final 1PP liz = this.LIZ;
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
                                        final 1PN 1pn = new 1PN(liziz, lizj);
                                        0kf 0kf2;
                                        if ((0kf2 = lizj.LJ) == null) {
                                            0kf2 = 0kf.NONE;
                                        }
                                        0mD.LIZ(context, (0mD.a)1pn, false, 0kf2, String.valueOf(lizj.LIZJ.getId()));
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
                                final 1PO 1po = new 1PO(liziz, lizj);
                                0kf 0kf3;
                                if ((0kf3 = lizj.LJ) == null) {
                                    0kf3 = 0kf.NONE;
                                }
                                0m9.LIZ(context2, (0m9.a)1po, 0kf3, String.valueOf(lizj.LIZJ.getId()));
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
        //     5: invokespecial   X/1wJ.<init>:(LX/1PM;)V
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
        //    79: invokevirtual   X/1PM.LIZ:(LX/0lv;)V
        //    82: aload_3        
        //    83: invokevirtual   X/1wJ.LIZ:()V
        //    86: aload_1        
        //    87: invokevirtual   X/1PM.LJFF:()LX/1so;
        //    90: new             LX/0lr;
        //    93: dup            
        //    94: aload_0        
        //    95: aload_1        
        //    96: aload_2        
        //    97: invokespecial   X/0lr.<init>:(LX/1PP;LX/1PM;LX/1P3;)V
        //   100: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   103: return         
        //   104: aload_1        
        //   105: getstatic       X/0lv.NORMAL:LX/0lv;
        //   108: invokevirtual   X/1PM.LIZ:(LX/0lv;)V
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
        //   139: invokevirtual   X/1PM.LIZ:(LX/0lv;)V
        //   142: goto            82
        //   145: aload_1        
        //   146: getstatic       X/0lv.UNAVAILABLE:LX/0lv;
        //   149: invokevirtual   X/1PM.LIZ:(LX/0lv;)V
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
        1NN.LLFF.LIZ().LJJJIL = 1p3.LIZLLL;
        final 1NN liz = 1NN.LLFF.LIZ();
        0kf 0kf;
        if ((0kf = 1p3.LJ) == null) {
            0kf = X.0kf.NONE;
        }
        liz.LIZ(0kf);
        a.LIZ(0lv.INVITING);
        this.LIZJ.LIZ(1p3.LIZJ, 1p3.LIZLLL, 1p3);
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
            Covode.recordClassIndex(7448);
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
            //    10: new             LX/1w5;
            //    13: dup            
            //    14: aload_1        
            //    15: invokespecial   X/1w5.<init>:(Landroid/view/View;)V
            //    18: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    21: putfield        X/1PM.LIZLLL:LX/5DO;
            //    24: aload_0        
            //    25: new             LX/1wG;
            //    28: dup            
            //    29: aload_1        
            //    30: invokespecial   X/1wG.<init>:(Landroid/view/View;)V
            //    33: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    36: putfield        X/1PM.LJ:LX/5DO;
            //    39: aload_0        
            //    40: new             LX/1wF;
            //    43: dup            
            //    44: aload_1        
            //    45: invokespecial   X/1wF.<init>:(Landroid/view/View;)V
            //    48: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    51: putfield        X/1PM.LIZ:LX/5DO;
            //    54: aload_0        
            //    55: new             LX/1wB;
            //    58: dup            
            //    59: aload_1        
            //    60: invokespecial   X/1wB.<init>:(Landroid/view/View;)V
            //    63: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    66: putfield        X/1PM.LIZIZ:LX/5DO;
            //    69: aload_0        
            //    70: new             LX/1wI;
            //    73: dup            
            //    74: aload_1        
            //    75: invokespecial   X/1wI.<init>:(Landroid/view/View;)V
            //    78: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    81: putfield        X/1PM.LJFF:LX/5DO;
            //    84: aload_0        
            //    85: new             LX/1wH;
            //    88: dup            
            //    89: aload_1        
            //    90: invokespecial   X/1wH.<init>:(Landroid/view/View;)V
            //    93: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    96: putfield        X/1PM.LJI:LX/5DO;
            //    99: aload_0        
            //   100: new             LX/1w6;
            //   103: dup            
            //   104: aload_1        
            //   105: invokespecial   X/1w6.<init>:(Landroid/view/View;)V
            //   108: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   111: putfield        X/1PM.LJII:LX/5DO;
            //   114: aload_0        
            //   115: new             LX/1wA;
            //   118: dup            
            //   119: aload_1        
            //   120: invokespecial   X/1wA.<init>:(Landroid/view/View;)V
            //   123: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   126: putfield        X/1PM.LJIIIIZZ:LX/5DO;
            //   129: aload_0        
            //   130: new             LX/1w9;
            //   133: dup            
            //   134: aload_1        
            //   135: invokespecial   X/1w9.<init>:(Landroid/view/View;)V
            //   138: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   141: putfield        X/1PM.LJIIIZ:LX/5DO;
            //   144: aload_0        
            //   145: new             LX/1wC;
            //   148: dup            
            //   149: aload_1        
            //   150: invokespecial   X/1wC.<init>:(Landroid/view/View;)V
            //   153: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   156: putfield        X/1PM.LJIIJ:LX/5DO;
            //   159: aload_0        
            //   160: new             LX/1w8;
            //   163: dup            
            //   164: aload_1        
            //   165: invokespecial   X/1w8.<init>:(Landroid/view/View;)V
            //   168: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   171: putfield        X/1PM.LJIIJJI:LX/5DO;
            //   174: aload_0        
            //   175: new             LX/1wD;
            //   178: dup            
            //   179: aload_1        
            //   180: invokespecial   X/1wD.<init>:(Landroid/view/View;)V
            //   183: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   186: putfield        X/1PM.LJIIL:LX/5DO;
            //   189: aload_0        
            //   190: new             LX/1wE;
            //   193: dup            
            //   194: aload_1        
            //   195: invokespecial   X/1wE.<init>:(Landroid/view/View;)V
            //   198: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   201: putfield        X/1PM.LJIILIIL:LX/5DO;
            //   204: aload_0        
            //   205: new             LX/1w7;
            //   208: dup            
            //   209: aload_1        
            //   210: invokespecial   X/1w7.<init>:(Landroid/view/View;)V
            //   213: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   216: putfield        X/1PM.LJIILJJIL:LX/5DO;
            //   219: aload_0        
            //   220: getstatic       X/0lv.NORMAL:LX/0lv;
            //   223: putfield        X/1PM.LIZJ:LX/0lv;
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
        
        public final 1ib LJ() {
            return (1ib)this.LJII.getValue();
        }
        
        public final 1so LJFF() {
            return (1so)this.LJIIIIZZ.getValue();
        }
        
        public final 1ib LJI() {
            return (1ib)this.LJIIIZ.getValue();
        }
        
        public final ViewGroup LJII() {
            return (ViewGroup)this.LJIIJ.getValue();
        }
        
        public final 1ib LJIIIIZZ() {
            return (1ib)this.LJIIJJI.getValue();
        }
        
        public final 1It LJIIIZ() {
            return (1It)this.LJIIL.getValue();
        }
        
        public final 1ib LJIIJ() {
            return (1ib)this.LJIILIIL.getValue();
        }
        
        public final 1ib LJIIJJI() {
            return (1ib)this.LJIILJJIL.getValue();
        }
    }
}
