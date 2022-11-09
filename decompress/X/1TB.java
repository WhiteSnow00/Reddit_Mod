// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import android.view.View$OnClickListener;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.base.model.user.User;
import android.widget.ImageView;
import kotlin.jvm.internal.n;
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

public final class 1TB extends Evv<1P3, a>
{
    public ValueAnimator LIZ;
    public final 0qN LIZIZ;
    public final 0qF LIZJ;
    public final DataChannel LIZLLL;
    
    static {
        Covode.recordClassIndex(8322);
    }
    
    public 1TB(final 0qN liziz, final 0qF lizj, final DataChannel lizlll) {
        CTM.LIZ((Object)liziz, (Object)lizj);
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    private final void LIZ(final View view) {
        public final class 0qJ implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ View LIZ;
            
            static {
                Covode.recordClassIndex(8347);
            }
            
            public 0qJ(final View liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this.LIZ.setBackgroundColor((int)animatedValue);
            }
        }
        public final class 0qI implements Animator$AnimatorListener
        {
            public final /* synthetic */ 1TB LIZ;
            
            static {
                Covode.recordClassIndex(8346);
            }
            
            public 0qI(final 1TB liz) {
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
        public final class 0qH implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ View LIZ;
            
            static {
                Covode.recordClassIndex(8345);
            }
            
            public 0qH(final View liz) {
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
        //    58: new             LX/0qH;
        //    61: dup            
        //    62: aload_1        
        //    63: invokespecial   X/0qH.<init>:(Landroid/view/View;)V
        //    66: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //    69: aload_2        
        //    70: new             LX/0qI;
        //    73: dup            
        //    74: aload_0        
        //    75: invokespecial   X/0qI.<init>:(LX/1TB;)V
        //    78: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    81: aload_2        
        //    82: ldc             ""
        //    84: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    87: aload_0        
        //    88: aload_2        
        //    89: putfield        X/1TB.LIZ:Landroid/animation/ValueAnimator;
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
        //   147: new             LX/0qJ;
        //   150: dup            
        //   151: aload_1        
        //   152: invokespecial   X/0qJ.<init>:(Landroid/view/View;)V
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
        final User owner = 1p3.LIZJ.getOwner();
        final 2Bo liz = a.LIZ();
        this.LIZ();
        if (1p3.LJII) {
            this.LIZ((View)liz);
        }
        else {
            liz.setBackgroundColor(0cB.LIZIZ(2131100923));
        }
        final 7wT liziz = a.LIZIZ();
        n.LIZIZ((Object)owner, "");
        HFv.LIZ((ImageView)liziz, owner.getAvatarThumb(), liziz.getWidth(), liziz.getHeight(), 2131234398);
        a.LIZJ().setText((CharSequence)0W3.LIZ(owner));
        final AppCompatImageView lizlll = a.LIZLLL();
        int visibility;
        if (owner.getAuthenticationInfo() != null) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        lizlll.setVisibility(visibility);
        final boolean lizlll2 = this.LIZLLL(a, 1p3);
        final boolean lizj = this.LIZJ(a, 1p3);
        final boolean lj = this.LJ(a, 1p3);
        final boolean ljff = this.LJFF(a, 1p3);
        a.LJ().setVisibility(8);
        a.LJI().setVisibility(8);
        a.LJIILLIIL().setVisibility(8);
        a.LJIILL().setVisibility(8);
        final RivalExtraInfo ljff2 = 1p3.LJFF;
        boolean b;
        if (ljff2 != null && ljff2.LJFF == 0) {
            b = true;
        }
        else {
            b = false;
        }
        int n3 = 0;
        Label_0262: {
            int n2;
            if (1p3.LJ == 0kf.FOLLOW_INVITE && !b) {
                int n;
                if (lizlll2) {
                    a.LJ().setVisibility(0);
                    n = 1;
                }
                else {
                    n = 0;
                }
                n2 = n;
                if (lizj) {
                    a.LJI().setVisibility(0);
                    n2 = n + 1;
                }
                n3 = n2;
                if (!ljff) {
                    break Label_0262;
                }
                a.LJIILLIIL().setVisibility(0);
            }
            else {
                int n4;
                if (lizlll2) {
                    a.LJ().setVisibility(0);
                    n4 = 1;
                }
                else {
                    n4 = 0;
                }
                n2 = n4;
                if (lizj) {
                    a.LJI().setVisibility(0);
                    n2 = n4 + 1;
                }
                n3 = n2;
                if (!lj) {
                    break Label_0262;
                }
                a.LJIILL().setVisibility(0);
            }
            n3 = n2 + 1;
        }
        if (lizlll2 && !lizj) {
            a.LJFF().setMaxWidth(0cB.LIZ(128.0f));
        }
        if (n3 > 1) {
            GTi.LIZ((View)a.LJIIZILJ(), 0cB.LIZ(14.0f));
            if (lj) {
                GTi.LJFF((View)a.LJIILL(), 0cB.LIZ(0.0f));
            }
        }
        else {
            GTi.LIZ((View)a.LJIIZILJ(), 0cB.LIZ(22.0f));
            if (lj) {
                GTi.LJFF((View)a.LJIILL(), 0cB.LIZ(114.0f));
            }
        }
        this.LJI(a, 1p3);
    }
    
    private final boolean LIZIZ() {
        final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
        final ArrayList list = new ArrayList();
        for (final 0pc next : coHostUserList) {
            final 0pc 0pc = next;
            if ((0pc.LJFF == 0pg.INVITING || 0pc.LJFF == 0pg.INVITED) && 0pc.LIZJ()) {
                list.add(next);
            }
        }
        final int size = list.size();
        final int size2 = 0jz.LIZLLL().getCoHostUserList().size();
        if (size >= 3) {
            Hf4.LIZ(0cB.LJ(), 2131829299);
            return false;
        }
        if (size2 >= 4) {
            if (size > 0) {
                Hf4.LIZ(0cB.LJ(), 2131829297);
            }
            else {
                Hf4.LIZ(0cB.LJ(), 2131829296);
            }
            return false;
        }
        return true;
    }
    
    private final boolean LIZJ(final a a, final 1P3 1p3) {
        final int userCount = 1p3.LIZJ.getUserCount();
        boolean b;
        if (userCount > 0) {
            b = true;
        }
        else {
            b = false;
        }
        final boolean liz = GTi.LIZ((CharSequence)1p3.LIZ());
        while (true) {
            Label_0143: {
                if (!b) {
                    a.LJIIIIZZ().setVisibility(8);
                    a.LJII().setVisibility(8);
                    break Label_0143;
                }
                final 1ib ljiiiizz = a.LJIIIIZZ();
                if (userCount > 0) {
                    ljiiiizz.setVisibility(0);
                    ljiiiizz.setText((CharSequence)GKY.LIZIZ((long)userCount));
                }
                else {
                    ljiiiizz.setVisibility(8);
                }
                a.LJII().setVisibility(0);
                if (!liz) {
                    break Label_0143;
                }
                a.LJIIIZ().setVisibility(0);
                a.LJIIJJI().setText((CharSequence)1p3.LIZ());
                a.LJIIJ().setVisibility(0);
                a.LJIIJJI().setVisibility(0);
                return b || liz;
            }
            a.LJIIIZ().setVisibility(8);
            if (liz) {
                continue;
            }
            break;
        }
        a.LJIIJ().setVisibility(8);
        a.LJIIJJI().setVisibility(8);
        return b || liz;
    }
    
    private final boolean LIZLLL(final a a, final 1P3 1p3) {
        final RivalExtraInfo ljff = 1p3.LJFF;
        while (true) {
            Label_0038: {
                if (ljff == null) {
                    break Label_0038;
                }
                final LinkerInfo lji = ljff.LJI;
                if (lji == null) {
                    break Label_0038;
                }
                final List liz = lji.LIZ;
                if (liz == null || liz.isEmpty()) {
                    return false;
                }
                if (liz != null) {
                    final Iterator iterator = liz.iterator();
                    int n = 0;
                    while (iterator.hasNext()) {
                        final Object next = iterator.next();
                        if (n < 0) {
                            Ey9.LIZ();
                        }
                        final UserInfo userInfo = (UserInfo)next;
                        if (n != 0) {
                            if (n != 1) {
                                if (n == 2) {
                                    a.LJIILJJIL().setAvatar(userInfo.LIZJ);
                                    a.LJIILJJIL().setVisibility(0);
                                }
                            }
                            else {
                                a.LJIILIIL().setAvatar(userInfo.LIZJ);
                                a.LJIILIIL().setVisibility(0);
                                a.LJIILJJIL().setVisibility(8);
                            }
                        }
                        else {
                            a.LJIIL().setAvatar(userInfo.LIZJ);
                            a.LJIIL().setVisibility(0);
                            a.LJIILIIL().setVisibility(8);
                            a.LJIILJJIL().setVisibility(8);
                        }
                        ++n;
                    }
                }
                return true;
            }
            final List liz = null;
            continue;
        }
    }
    
    private final boolean LJ(final a a, final 1P3 1p3) {
        final RivalExtraInfo ljff = 1p3.LJFF;
        while (true) {
            Label_0047: {
                if (ljff == null) {
                    break Label_0047;
                }
                final RivalExtraInfo$Tag ljiiiz = ljff.LJIIIZ;
                if (ljiiiz == null) {
                    break Label_0047;
                }
                final int liz = ljiiiz.LIZ;
                if (1p3.LJ == 0kf.FOLLOW_INVITE && liz != 5E0.COHOST_TYPE.value) {
                    return false;
                }
                final RivalExtraInfo ljff2 = 1p3.LJFF;
                final CharSequence charSequence = null;
                while (true) {
                    Label_0088: {
                        if (ljff2 == null) {
                            break Label_0088;
                        }
                        final RivalExtraInfo$Tag ljiiiz2 = ljff2.LJIIIZ;
                        if (ljiiiz2 == null) {
                            break Label_0088;
                        }
                        final String lizj = ljiiiz2.LIZJ;
                        if (5ow.LIZ(lizj)) {
                            return false;
                        }
                        final 1ib ljiill = a.LJIILL();
                        final RivalExtraInfo ljff3 = 1p3.LJFF;
                        CharSequence lizj2 = charSequence;
                        if (ljff3 != null) {
                            final RivalExtraInfo$Tag ljiiiz3 = ljff3.LJIIIZ;
                            lizj2 = charSequence;
                            if (ljiiiz3 != null) {
                                lizj2 = ljiiiz3.LIZJ;
                            }
                        }
                        ljiill.setText(lizj2);
                        return true;
                    }
                    final String lizj = null;
                    continue;
                }
            }
            final int liz = 0;
            continue;
        }
    }
    
    private final boolean LJFF(final a a, final 1P3 1p3) {
        if (1p3.LJ == 0kf.FOLLOW_INVITE) {
            final RivalExtraInfo ljff = 1p3.LJFF;
            boolean b;
            if (ljff != null && ljff.LJFF == 0) {
                b = true;
            }
            else {
                b = false;
            }
            final RivalExtraInfo ljff2 = 1p3.LJFF;
            int ljff3;
            if (ljff2 != null) {
                ljff3 = ljff2.LJFF;
            }
            else {
                ljff3 = 0;
            }
            final 0lu liz = 0lX.LIZ(ljff3);
            if (!b && liz != null) {
                a.LJIILLIIL().setText((CharSequence)liz.getReason());
                return true;
            }
        }
        return false;
    }
    
    private final void LJI(final a a, final 1P3 1p3) {
        public final class 0qK implements View$OnClickListener
        {
            public final /* synthetic */ 1TB LIZ;
            public final /* synthetic */ a LIZIZ;
            public final /* synthetic */ 1P3 LIZJ;
            
            static {
                Covode.recordClassIndex(8351);
            }
            
            public 0qK(final 1TB liz, final a liziz, final 1P3 lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            public final void onClick(final View view) {
                final 1TB liz = this.LIZ;
                final a liziz = this.LIZIZ;
                final 1P3 lizj = this.LIZJ;
                if (liziz.LIZJ != 0lv.UNAVAILABLE) {
                    if (liziz.LIZJ == 0lv.MATURETHEME) {
                        Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131831810), 0L);
                        return;
                    }
                    if (!lizj.LJII) {
                        1NN.LLFF.LIZ().LJLJLLL = "";
                    }
                    final RivalExtraInfo ljff = lizj.LJFF;
                    final boolean b = ljff != null && ljff.LJII == 5Fw.PLAYTYPE_APPLY.value;
                    final 1lW liz2 = 1lW.LIZ.LIZ();
                    if (b) {
                        liz2.LJ(lizj.LIZJ.getOwnerUserId());
                    }
                    else {
                        liz2.LIZ(lizj.LIZJ.getOwnerUserId());
                    }
                    final 0pc coHostUserWithPlayType = 0jz.LIZLLL().getCoHostUserWithPlayType(lizj.LIZJ.getOwnerUserId(), b);
                    0pg 0pg;
                    if (coHostUserWithPlayType == null || (0pg = coHostUserWithPlayType.LJFF) == null) {
                        0pg = X.0pg.IDLE;
                    }
                    0ba.LIZ(4, "InteractUserViewBinder", "inviteBtnClickEvent, coHostUser = ".concat(String.valueOf(coHostUserWithPlayType)));
                    switch (0qL.LIZIZ[0pg.ordinal()]) {
                        case 6: {
                            final GCe liz3 = GCe.LIZ();
                            n.LIZIZ((Object)liz3, "");
                            if (liz3.LIZLLL) {
                                DataChannelGlobal.LIZJ.LIZLLL((Class)2Gb.class);
                                return;
                            }
                            final DataChannel lizlll = liz.LIZLLL;
                            if (lizlll != null) {
                                final Room room = (Room)lizlll.LIZIZ((Class)G69.class);
                                if (room != null) {
                                    final User owner = room.getOwner();
                                    if (owner != null && owner.getSecret() == 1) {
                                        final 1la.b lizj2 = 1la.LIZJ;
                                        final View itemView = liziz.itemView;
                                        n.LIZIZ((Object)itemView, "");
                                        final Context context = itemView.getContext();
                                        n.LIZIZ((Object)context, "");
                                        lizj2.LIZ(context, 0qE.REQUEST, (QgG<2P9>)new 1zU(liz, liziz, lizj));
                                        return;
                                    }
                                }
                            }
                            liz.LIZ(liziz, lizj);
                            break;
                        }
                        case 1:
                        case 2:
                        case 3: {
                            Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131829301), 0L);
                            break;
                        }
                        case 5: {
                            lizj.LIZIZ = true;
                            liz.LIZJ.LIZIZ(lizj.LIZJ);
                            return;
                        }
                        case 4: {
                            lizj.LIZIZ = true;
                            liz.LIZIZ.LIZ(lizj.LIZJ);
                        }
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //     4: astore_3       
        //     5: iconst_1       
        //     6: istore          4
        //     8: aload_3        
        //     9: ifnull          256
        //    12: aload_3        
        //    13: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //    16: ifne            256
        //    19: iconst_1       
        //    20: istore          5
        //    22: aload_2        
        //    23: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //    26: astore_3       
        //    27: aload_3        
        //    28: ifnull          250
        //    31: aload_3        
        //    32: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJII:I
        //    35: getstatic       X/5Fw.PLAYTYPE_APPLY:LX/5Fw;
        //    38: getfield        X/5Fw.value:I
        //    41: if_icmpne       250
        //    44: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //    47: aload_2        
        //    48: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    51: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //    54: iload           4
        //    56: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserWithPlayType:(JZ)LX/0pc;
        //    61: astore          6
        //    63: new             Ljava/lang/StringBuilder;
        //    66: dup            
        //    67: ldc_w           "updateInviteBtn, ownerUserId = "
        //    70: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    73: astore_3       
        //    74: aload_3        
        //    75: aload_2        
        //    76: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    79: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //    82: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    85: pop            
        //    86: aload_3        
        //    87: ldc_w           " coHostUser = "
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: aload_3        
        //    95: aload           6
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   100: pop            
        //   101: iconst_4       
        //   102: ldc_w           "InteractUserViewBinder"
        //   105: aload_3        
        //   106: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   109: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   112: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   115: aload_2        
        //   116: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   119: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   122: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserCountDown:(J)J
        //   127: lstore          7
        //   129: aload           6
        //   131: ifnull          180
        //   134: aload           6
        //   136: invokevirtual   X/0pc.LIZ:()Z
        //   139: ifeq            180
        //   142: lload           7
        //   144: lconst_0       
        //   145: lcmp           
        //   146: ifle            180
        //   149: aload_1        
        //   150: getstatic       X/0lv.INVITING:LX/0lv;
        //   153: invokevirtual   X/1TA.LIZ:(LX/0lv;)V
        //   156: aload_0        
        //   157: aload_1        
        //   158: aload_2        
        //   159: invokespecial   X/1TB.LJII:(LX/1TA;LX/1P3;)V
        //   162: aload_1        
        //   163: invokevirtual   X/1TA.LJIIZILJ:()LX/1so;
        //   166: new             LX/0qK;
        //   169: dup            
        //   170: aload_0        
        //   171: aload_1        
        //   172: aload_2        
        //   173: invokespecial   X/0qK.<init>:(LX/1TB;LX/1TA;LX/1P3;)V
        //   176: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   179: return         
        //   180: aload_2        
        //   181: getfield        X/1P3.LIZIZ:Z
        //   184: ifeq            197
        //   187: aload_1        
        //   188: getstatic       X/0lv.NORMAL:LX/0lv;
        //   191: invokevirtual   X/1TA.LIZ:(LX/0lv;)V
        //   194: goto            156
        //   197: iload           5
        //   199: ifeq            212
        //   202: aload_1        
        //   203: getstatic       X/0lv.NORMAL:LX/0lv;
        //   206: invokevirtual   X/1TA.LIZ:(LX/0lv;)V
        //   209: goto            156
        //   212: aload_2        
        //   213: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   216: astore_3       
        //   217: aload_3        
        //   218: ifnull          240
        //   221: aload_3        
        //   222: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJFF:I
        //   225: bipush          7
        //   227: if_icmpne       240
        //   230: aload_1        
        //   231: getstatic       X/0lv.MATURETHEME:LX/0lv;
        //   234: invokevirtual   X/1TA.LIZ:(LX/0lv;)V
        //   237: goto            156
        //   240: aload_1        
        //   241: getstatic       X/0lv.UNAVAILABLE:LX/0lv;
        //   244: invokevirtual   X/1TA.LIZ:(LX/0lv;)V
        //   247: goto            156
        //   250: iconst_0       
        //   251: istore          4
        //   253: goto            44
        //   256: iconst_0       
        //   257: istore          5
        //   259: goto            22
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
    
    private final void LJII(final a a, final 1P3 1p3) {
        final RivalExtraInfo ljff = 1p3.LJFF;
        boolean enabled = false;
        boolean b;
        if (ljff != null && ljff.LJII == 5Fw.PLAYTYPE_APPLY.value) {
            b = true;
        }
        else {
            b = false;
        }
        final int n = 0qL.LIZ[a.LIZJ.ordinal()];
        1so ljiizilj2 = null;
        String text = null;
        Label_0219: {
            if (n == 1) {
                final 1so ljiizilj = a.LJIIZILJ();
                final long coHostUserCountDown = 0jz.LIZLLL().getCoHostUserCountDown(1p3.LIZJ.getOwnerUserId());
                final StringBuilder sb = new StringBuilder("updateBtnByState, ownerUserId = ");
                sb.append(1p3.LIZJ.getOwnerUserId());
                sb.append(" time = ");
                sb.append(coHostUserCountDown);
                0ba.LIZ(4, "InteractUserViewBinder", sb.toString());
                ljiizilj.LIZ(2131886887);
                ljiizilj.setEnabled(true);
                final String liz = H0H.LIZ(0cB.LIZ(2131829218), new Object[] { coHostUserCountDown });
                ljiizilj2 = ljiizilj;
                text = liz;
                break Label_0219;
            }
            if (n == 2 || n == 3) {
                final 1so ljiizilj3 = a.LJIIZILJ();
                ljiizilj3.LIZ(2131886882);
                if (a.LIZJ == 0lv.NORMAL) {
                    enabled = true;
                }
                ljiizilj3.setEnabled(enabled);
                String text2;
                if (b) {
                    text2 = 0cB.LIZ(2131829249);
                }
                else {
                    text2 = 0cB.LIZ(2131829181);
                }
                ljiizilj3.setText(text2);
                return;
            }
            if (n == 4) {
                ljiizilj2 = a.LJIIZILJ();
                ljiizilj2.LIZ(2131886878);
                ljiizilj2.setEnabled(true);
                if (b) {
                    text = 0cB.LIZ(2131829249);
                    break Label_0219;
                }
                text = 0cB.LIZ(2131829181);
                break Label_0219;
            }
            return;
        }
        ljiizilj2.setText(text);
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
        public final class 1zT extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1TB LIZ;
            public final /* synthetic */ 1P3 LIZIZ;
            public final /* synthetic */ 0kf LIZJ;
            
            static {
                Covode.recordClassIndex(8349);
            }
            
            public 1zT(final 1TB liz, final 1P3 liziz, final 0kf lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                super(0);
            }
        }
        public final class 1zS extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1TB LIZ;
            public final /* synthetic */ 1P3 LIZIZ;
            public final /* synthetic */ 0kf LIZJ;
            
            static {
                Covode.recordClassIndex(8348);
            }
            
            public 1zS(final 1TB liz, final 1P3 liziz, final 0kf lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //     6: aload_2        
        //     7: getfield        X/1P3.LJI:Ljava/lang/String;
        //    10: putfield        X/1NN.LJJIJLIJ:Ljava/lang/String;
        //    13: getstatic       X/1NN.LLFF:LX/0k5;
        //    16: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    19: getfield        X/1NN.LJJIL:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    22: astore_3       
        //    23: getstatic       X/1NN.LLFF:LX/0k5;
        //    26: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    29: aload_2        
        //    30: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    33: putfield        X/1NN.LJJIL:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    36: getstatic       X/1NN.LLFF:LX/0k5;
        //    39: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    42: aload_2        
        //    43: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    46: putfield        X/1NN.LJJJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    49: getstatic       X/1NN.LLFF:LX/0k5;
        //    52: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    55: getfield        X/1NN.LJJIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //    58: astore          4
        //    60: getstatic       X/1NN.LLFF:LX/0k5;
        //    63: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    66: aload_2        
        //    67: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //    70: putfield        X/1NN.LJJJI:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //    73: getstatic       X/1NN.LLFF:LX/0k5;
        //    76: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    79: aload_2        
        //    80: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //    83: putfield        X/1NN.LJJIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //    86: getstatic       X/1NN.LLFF:LX/0k5;
        //    89: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    92: aload_2        
        //    93: getfield        X/1P3.LIZLLL:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalsListsData$TopHostInfo;
        //    96: putfield        X/1NN.LJJJIL:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalsListsData$TopHostInfo;
        //    99: getstatic       X/1NN.LLFF:LX/0k5;
        //   102: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   105: astore          5
        //   107: aload_2        
        //   108: getfield        X/1P3.LJ:LX/0kf;
        //   111: astore          6
        //   113: aload           6
        //   115: astore          7
        //   117: aload           6
        //   119: ifnonnull       127
        //   122: getstatic       X/0kf.NONE:LX/0kf;
        //   125: astore          7
        //   127: aload           5
        //   129: aload           7
        //   131: invokevirtual   X/1NN.LIZ:(LX/0kf;)V
        //   134: getstatic       X/1NN.LLFF:LX/0k5;
        //   137: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   140: astore          6
        //   142: aload_2        
        //   143: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   146: astore          7
        //   148: aconst_null    
        //   149: astore          5
        //   151: aload           7
        //   153: ifnull          403
        //   156: aload           7
        //   158: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJIIIZ:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag;
        //   161: astore          7
        //   163: aload           7
        //   165: ifnull          403
        //   168: aload           7
        //   170: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo$Tag.LIZ:I
        //   173: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   176: astore          7
        //   178: aload           6
        //   180: aload           7
        //   182: putfield        X/1NN.LJLL:Ljava/lang/Integer;
        //   185: getstatic       X/1NN.LLFF:LX/0k5;
        //   188: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   191: aload_2        
        //   192: getfield        X/1P3.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   195: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   198: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   201: putfield        X/1NN.LJLLILLLL:Ljava/lang/String;
        //   204: aload_1        
        //   205: getstatic       X/0lv.INVITING:LX/0lv;
        //   208: invokevirtual   X/1TA.LIZ:(LX/0lv;)V
        //   211: aload_2        
        //   212: getfield        X/1P3.LJFF:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   215: astore          7
        //   217: aload           7
        //   219: ifnull          395
        //   222: aload           7
        //   224: getfield        com/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo.LJII:I
        //   227: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   230: astore          6
        //   232: aload_2        
        //   233: getfield        X/1P3.LJ:LX/0kf;
        //   236: astore          8
        //   238: aload           8
        //   240: astore          7
        //   242: aload           8
        //   244: ifnonnull       252
        //   247: getstatic       X/0kf.NONE:LX/0kf;
        //   250: astore          7
        //   252: aload_0        
        //   253: getfield        X/1TB.LIZLLL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   256: astore          8
        //   258: aload           8
        //   260: ifnull          273
        //   263: aload           8
        //   265: ldc_w           LX/2FI;.class
        //   268: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   271: astore          5
        //   273: new             Ljava/lang/StringBuilder;
        //   276: dup            
        //   277: ldc_w           "handleRequest, state = "
        //   280: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   283: astore          8
        //   285: aload           8
        //   287: aload           5
        //   289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   292: pop            
        //   293: aload           8
        //   295: ldc_w           ", playTypeType = "
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: pop            
        //   302: aload           8
        //   304: aload           6
        //   306: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   309: pop            
        //   310: iconst_4       
        //   311: ldc_w           "InteractUserViewBinder"
        //   314: aload           8
        //   316: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   319: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   322: aload           6
        //   324: getstatic       X/5Fw.PLAYTYPE_APPLY:LX/5Fw;
        //   327: getfield        X/5Fw.value:I
        //   330: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   333: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   336: ifeq            446
        //   339: aload           5
        //   341: getstatic       X/0pM.Invited:LX/0pM;
        //   344: if_acmpne       409
        //   347: getstatic       X/1lZ.LIZJ:LX/0qB;
        //   350: astore          6
        //   352: aload_1        
        //   353: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   356: astore_1       
        //   357: aload_1        
        //   358: ldc             ""
        //   360: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   363: aload_1        
        //   364: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   367: astore_1       
        //   368: aload_1        
        //   369: ldc             ""
        //   371: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   374: aload           6
        //   376: aload_1        
        //   377: getstatic       X/0q4.INVITE_APPLY:LX/0q4;
        //   380: new             LX/1zS;
        //   383: dup            
        //   384: aload_0        
        //   385: aload_2        
        //   386: aload           7
        //   388: invokespecial   X/1zS.<init>:(LX/1TB;LX/1P3;LX/0kf;)V
        //   391: invokevirtual   X/0qB.LIZ:(Landroid/content/Context;LX/0q4;LX/QgG;)V
        //   394: return         
        //   395: getstatic       X/5Fw.PLAYTYPE_INVITE:LX/5Fw;
        //   398: astore          6
        //   400: goto            232
        //   403: aconst_null    
        //   404: astore          7
        //   406: goto            178
        //   409: aload           5
        //   411: getstatic       X/0pM.Applied:LX/0pM;
        //   414: if_acmpne       427
        //   417: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //   420: ldc_w           2131829298
        //   423: invokestatic    X/Hf4.LIZ:(Landroid/content/Context;I)V
        //   426: return         
        //   427: aload_0        
        //   428: getfield        X/1TB.LIZJ:LX/0qF;
        //   431: aload_2        
        //   432: aload           7
        //   434: iconst_0       
        //   435: invokeinterface X/0qF.LIZIZ:(LX/1P3;LX/0kf;Z)V
        //   440: aload_2        
        //   441: iconst_0       
        //   442: putfield        X/1P3.LIZIZ:Z
        //   445: return         
        //   446: aload           5
        //   448: getstatic       X/0pM.Applied:LX/0pM;
        //   451: if_acmpne       523
        //   454: getstatic       X/1NN.LLFF:LX/0k5;
        //   457: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   460: aload           4
        //   462: putfield        X/1NN.LJJJI:Lcom/bytedance/android/livesdk/chatroom/interact/model/RivalExtraInfo;
        //   465: getstatic       X/1NN.LLFF:LX/0k5;
        //   468: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   471: aload_3        
        //   472: putfield        X/1NN.LJJJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   475: getstatic       X/1lZ.LIZJ:LX/0qB;
        //   478: astore          6
        //   480: aload_1        
        //   481: getfield        androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView:Landroid/view/View;
        //   484: astore_1       
        //   485: aload_1        
        //   486: ldc             ""
        //   488: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   491: aload_1        
        //   492: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   495: astore_1       
        //   496: aload_1        
        //   497: ldc             ""
        //   499: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   502: aload           6
        //   504: aload_1        
        //   505: getstatic       X/0q4.APPLY_INVITE:LX/0q4;
        //   508: new             LX/1zT;
        //   511: dup            
        //   512: aload_0        
        //   513: aload_2        
        //   514: aload           7
        //   516: invokespecial   X/1zT.<init>:(LX/1TB;LX/1P3;LX/0kf;)V
        //   519: invokevirtual   X/0qB.LIZ:(Landroid/content/Context;LX/0q4;LX/QgG;)V
        //   522: return         
        //   523: aload_0        
        //   524: invokespecial   X/1TB.LIZIZ:()Z
        //   527: ifeq            548
        //   530: aload_0        
        //   531: getfield        X/1TB.LIZIZ:LX/0qN;
        //   534: aload_2        
        //   535: aload           7
        //   537: iconst_0       
        //   538: invokeinterface X/0qN.LIZ:(LX/1P3;LX/0kf;Z)V
        //   543: aload_2        
        //   544: iconst_0       
        //   545: putfield        X/1P3.LIZIZ:Z
        //   548: return         
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
        public final 5DO LJIILL;
        public final 5DO LJIILLIIL;
        public final 5DO LJIIZILJ;
        public final 5DO LJIJ;
        public final 5DO LJIJI;
        public final 5DO LJIJJ;
        
        static {
            Covode.recordClassIndex(8323);
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
            //    10: new             LX/1z7;
            //    13: dup            
            //    14: aload_1        
            //    15: invokespecial   X/1z7.<init>:(Landroid/view/View;)V
            //    18: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    21: putfield        X/1TA.LIZLLL:LX/5DO;
            //    24: aload_0        
            //    25: new             LX/1zP;
            //    28: dup            
            //    29: aload_1        
            //    30: invokespecial   X/1zP.<init>:(Landroid/view/View;)V
            //    33: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    36: putfield        X/1TA.LJ:LX/5DO;
            //    39: aload_0        
            //    40: new             LX/1zO;
            //    43: dup            
            //    44: aload_1        
            //    45: invokespecial   X/1zO.<init>:(Landroid/view/View;)V
            //    48: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    51: putfield        X/1TA.LIZ:LX/5DO;
            //    54: aload_0        
            //    55: new             LX/1zK;
            //    58: dup            
            //    59: aload_1        
            //    60: invokespecial   X/1zK.<init>:(Landroid/view/View;)V
            //    63: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    66: putfield        X/1TA.LIZIZ:LX/5DO;
            //    69: aload_0        
            //    70: new             LX/1zR;
            //    73: dup            
            //    74: aload_1        
            //    75: invokespecial   X/1zR.<init>:(Landroid/view/View;)V
            //    78: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    81: putfield        X/1TA.LJFF:LX/5DO;
            //    84: aload_0        
            //    85: new             LX/1zQ;
            //    88: dup            
            //    89: aload_1        
            //    90: invokespecial   X/1zQ.<init>:(Landroid/view/View;)V
            //    93: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //    96: putfield        X/1TA.LJI:LX/5DO;
            //    99: aload_0        
            //   100: new             LX/1zI;
            //   103: dup            
            //   104: aload_1        
            //   105: invokespecial   X/1zI.<init>:(Landroid/view/View;)V
            //   108: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   111: putfield        X/1TA.LJII:LX/5DO;
            //   114: aload_0        
            //   115: new             LX/1zE;
            //   118: dup            
            //   119: aload_1        
            //   120: invokespecial   X/1zE.<init>:(Landroid/view/View;)V
            //   123: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   126: putfield        X/1TA.LJIIIIZZ:LX/5DO;
            //   129: new             LX/1zJ;
            //   132: dup            
            //   133: aload_1        
            //   134: invokespecial   X/1zJ.<init>:(Landroid/view/View;)V
            //   137: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   140: pop            
            //   141: aload_0        
            //   142: new             LX/1zL;
            //   145: dup            
            //   146: aload_1        
            //   147: invokespecial   X/1zL.<init>:(Landroid/view/View;)V
            //   150: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   153: putfield        X/1TA.LJIIIZ:LX/5DO;
            //   156: aload_0        
            //   157: new             LX/1z8;
            //   160: dup            
            //   161: aload_1        
            //   162: invokespecial   X/1z8.<init>:(Landroid/view/View;)V
            //   165: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   168: putfield        X/1TA.LJIIJ:LX/5DO;
            //   171: aload_0        
            //   172: new             LX/1z9;
            //   175: dup            
            //   176: aload_1        
            //   177: invokespecial   X/1z9.<init>:(Landroid/view/View;)V
            //   180: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   183: putfield        X/1TA.LJIIJJI:LX/5DO;
            //   186: aload_0        
            //   187: new             LX/1zF;
            //   190: dup            
            //   191: aload_1        
            //   192: invokespecial   X/1zF.<init>:(Landroid/view/View;)V
            //   195: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   198: putfield        X/1TA.LJIIL:LX/5DO;
            //   201: aload_0        
            //   202: new             LX/1zM;
            //   205: dup            
            //   206: aload_1        
            //   207: invokespecial   X/1zM.<init>:(Landroid/view/View;)V
            //   210: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   213: putfield        X/1TA.LJIILIIL:LX/5DO;
            //   216: aload_0        
            //   217: new             LX/1zN;
            //   220: dup            
            //   221: aload_1        
            //   222: invokespecial   X/1zN.<init>:(Landroid/view/View;)V
            //   225: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   228: putfield        X/1TA.LJIILJJIL:LX/5DO;
            //   231: aload_0        
            //   232: new             LX/1zB;
            //   235: dup            
            //   236: aload_1        
            //   237: invokespecial   X/1zB.<init>:(Landroid/view/View;)V
            //   240: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   243: putfield        X/1TA.LJIILL:LX/5DO;
            //   246: aload_0        
            //   247: new             LX/1zC;
            //   250: dup            
            //   251: aload_1        
            //   252: invokespecial   X/1zC.<init>:(Landroid/view/View;)V
            //   255: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   258: putfield        X/1TA.LJIILLIIL:LX/5DO;
            //   261: aload_0        
            //   262: new             LX/1zD;
            //   265: dup            
            //   266: aload_1        
            //   267: invokespecial   X/1zD.<init>:(Landroid/view/View;)V
            //   270: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   273: putfield        X/1TA.LJIIZILJ:LX/5DO;
            //   276: aload_0        
            //   277: new             LX/1zG;
            //   280: dup            
            //   281: aload_1        
            //   282: invokespecial   X/1zG.<init>:(Landroid/view/View;)V
            //   285: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   288: putfield        X/1TA.LJIJ:LX/5DO;
            //   291: aload_0        
            //   292: new             LX/1zA;
            //   295: dup            
            //   296: aload_1        
            //   297: invokespecial   X/1zA.<init>:(Landroid/view/View;)V
            //   300: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   303: putfield        X/1TA.LJIJI:LX/5DO;
            //   306: aload_0        
            //   307: new             LX/1zH;
            //   310: dup            
            //   311: aload_1        
            //   312: invokespecial   X/1zH.<init>:(Landroid/view/View;)V
            //   315: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
            //   318: putfield        X/1TA.LJIJJ:LX/5DO;
            //   321: aload_0        
            //   322: getstatic       X/0lv.NORMAL:LX/0lv;
            //   325: putfield        X/1TA.LIZJ:LX/0lv;
            //   328: return         
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
        
        public final ViewGroup LJI() {
            return (ViewGroup)this.LJIIIZ.getValue();
        }
        
        public final 1It LJII() {
            return (1It)this.LJIIJ.getValue();
        }
        
        public final 1ib LJIIIIZZ() {
            return (1ib)this.LJIIJJI.getValue();
        }
        
        public final 1ib LJIIIZ() {
            return (1ib)this.LJIIL.getValue();
        }
        
        public final 1It LJIIJ() {
            return (1It)this.LJIILIIL.getValue();
        }
        
        public final 1ib LJIIJJI() {
            return (1ib)this.LJIILJJIL.getValue();
        }
        
        public final H1S LJIIL() {
            return (H1S)this.LJIILL.getValue();
        }
        
        public final H1S LJIILIIL() {
            return (H1S)this.LJIILLIIL.getValue();
        }
        
        public final H1S LJIILJJIL() {
            return (H1S)this.LJIIZILJ.getValue();
        }
        
        public final 1ib LJIILL() {
            return (1ib)this.LJIJ.getValue();
        }
        
        public final 1ib LJIILLIIL() {
            return (1ib)this.LJIJI.getValue();
        }
        
        public final 1so LJIIZILJ() {
            return (1so)this.LJIJJ.getValue();
        }
    }
}
