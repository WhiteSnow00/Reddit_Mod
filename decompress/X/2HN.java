// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.model.message.PinMessage;
import java.util.Map;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender;
import java.util.HashMap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextPaint;
import android.view.View;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import android.os.SystemClock;
import webcast.data.MsgFilter;
import com.bytedance.android.live.base.model.user.User;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.android.livesdk.model.message.ChatMessage;

public class 2Hn extends 2He<ChatMessage> implements 11J, 1n9
{
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public char LJIJJLI;
    public char LJIL;
    public List<a> LJJ;
    public boolean LJJIIZI;
    public CharSequence LJJIJ;
    public final 10L LJJIJIIJI;
    public long LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public Runnable LJJIJLIJ;
    
    static {
        Covode.recordClassIndex(10832);
    }
    
    public 2Hn(final ChatMessage chatMessage) {
        super((H31)chatMessage);
        this.LJIJI = (float)0cB.LIZLLL(2131166232);
        this.LJIJJ = (float)0cB.LIZLLL(2131166235);
        this.LJJIIZI = false;
        this.LJIJJLI = 8207;
        this.LJIL = 8206;
        this.LJJIJIIJI = new 10L();
        this.LJJ = new ArrayList<a>();
        this.LJJIJIL = false;
        this.LJJIJL = false;
        this.LJJIJLIJ = new 11E(this);
        if (chatMessage.LIZ()) {
            super.LJFF.LIZ = false;
        }
    }
    
    @Override
    public final void LIZ(final a a) {
        final Drawable liz = a.LIZ;
        if (liz == null) {
            return;
        }
        if (super.LJJII.length() == 0) {
            return;
        }
        super.LJJII.removeSpan((Object)a.LIZLLL);
        final 7wk lizlll = new 7wk(liz);
        lizlll.LIZ(this.LJIJI);
        lizlll.LIZJ = (int)this.LJIJJ;
        lizlll.LIZLLL = (int)this.LJIJJ;
        ((7wj)lizlll).LIZIZ = (int)this.LJIJJ;
        ((7wj)lizlll).LIZ = (int)this.LJIJJ;
        a.LIZLLL = lizlll;
        final int ljjiizi = this.LJJIIZI ? 1 : 0;
        super.LJJII.setSpan((Object)lizlll, a.LJI + ljjiizi, a.LJI + 1 + ljjiizi, 33);
        super.LIZJ = null;
        if (super.LIZLLL != null) {
            super.LIZLLL.LIZ(this);
        }
    }
    
    @Override
    public final void LIZ(final CharSequence ljjij) {
        this.LJJIJ = ljjij;
    }
    
    @Override
    public final void LIZ(final boolean ljjijil) {
        this.LJJIJIL = ljjijil;
    }
    
    @Override
    public final User LIZIZ() {
        return ((ChatMessage)super.LJIILIIL).LIZJ;
    }
    
    @Override
    public final void LIZIZ(final boolean ljij) {
        this.LJIJ = ljij;
    }
    
    @Override
    public final MsgFilter LIZJ() {
        return ((ChatMessage)super.LJIILIIL).LJII;
    }
    
    @Override
    public final void LIZJ(final boolean ljiilliil) {
        this.LJIIZILJ = true;
        this.LJIILLIIL = ljiilliil;
    }
    
    @Override
    public final 10L LIZLLL() {
        return this.LJJIJIIJI;
    }
    
    @Override
    public final void LIZLLL(final boolean b) {
        super.LIZLLL(b);
        this.LJJIJIIJIL = SystemClock.elapsedRealtime();
        if (!b) {
            0cf.LIZ().postDelayed(this.LJJIJLIJ, LiveBeingAtConfigSetting.getValue().LIZJ);
            return;
        }
        this.LJJJJIZL();
    }
    
    @Override
    public final User LJ() {
        User ljiiliil;
        final User user = ljiiliil = ((ChatMessage)super.LJIILIIL).LJIILIIL;
        if (user != null) {
            ljiiliil = user;
            if (user.getId() != super.LIZLLL.LIZIZ()) {
                ljiiliil = user;
                if (LiveBeingAtConfigSetting.getValue().LIZLLL) {
                    ljiiliil = null;
                }
            }
        }
        return ljiiliil;
    }
    
    @Override
    public final long LJFF() {
        return ((HDi)super.LJIILIIL).localTimestamp;
    }
    
    @Override
    public final User LJI() {
        return ((ChatMessage)super.LJIILIIL).LIZJ;
    }
    
    @Override
    public final boolean LJII() {
        return this.LJJIJIL;
    }
    
    @Override
    public final void LJIIIIZZ() {
        this.LJJIJL = true;
    }
    
    @Override
    public final boolean LJIIIZ() {
        return this.LJJIJL;
    }
    
    @Override
    public final void LJIIJ() {
        super.LJIIJ();
        if (this.LJ() != null && !this.LJJIJIIJI.LIZ && super.LIZLLL != null && super.LIZLLL.LJIJI != null && !super.LIZLLL.LJIJI.LJI().contains(this)) {
            super.LIZLLL.LJIJI.LJI().add(this);
        }
    }
    
    @Override
    public final void LJIIJJI() {
        super.LJIIJJI();
        if (this.LJ() != null && this.LJJIJIIJIL != 0L) {
            0cf.LIZ().removeCallbacks(this.LJJIJLIJ);
            if (SystemClock.elapsedRealtime() - this.LJJIJIIJIL < LiveBeingAtConfigSetting.getValue().LIZJ && !this.LJJIJIIJI.LIZ) {
                if (super.LIZLLL != null && super.LIZLLL.LJIJI != null) {
                    super.LIZLLL.LJIJI.LIZ(this, true);
                }
            }
            else {
                this.LJJJJIZL();
            }
            if (super.LIZLLL != null && super.LIZLLL.LJIJI != null) {
                super.LIZLLL.LJIJI.LJI().remove(this);
            }
            this.LJJIJIIJIL = 0L;
        }
    }
    
    @Override
    public final boolean LJIJ() {
        return this.LJIILLIIL;
    }
    
    @Override
    public final void LJJIIJZLJL() {
        super.LJJIIJZLJL();
        this.LIZJ(false);
    }
    
    @Override
    public SpannableStringBuilder LJJIIZ() {
        public final class 1f2 extends GG3
        {
            public final /* synthetic */ 2Hn LIZ;
            
            static {
                Covode.recordClassIndex(10835);
            }
            
            public 1f2(final 2Hn liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                if (((ChatMessage)this.LIZ.LJIILIIL).LIZ()) {
                    this.LIZ.LIZLLL.LIZ((ChatMessage)this.LIZ.LJIILIIL, this.LIZ);
                    return;
                }
                this.LIZ.LJJJJJ();
            }
            
            public final void updateDrawState(final TextPaint textPaint) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   android/text/SpannableStringBuilder.<init>:()V
        //     7: pop            
        //     8: aload_0        
        //     9: getfield        X/2Gk.LJIILIIL:LX/H31;
        //    12: checkcast       Lcom/bytedance/android/livesdk/model/message/ChatMessage;
        //    15: getfield        com/bytedance/android/livesdk/model/message/ChatMessage.LIZIZ:Ljava/lang/String;
        //    18: invokestatic    X/0et.LIZ:(Ljava/lang/String;)Ljava/lang/String;
        //    21: astore_1       
        //    22: aload_1        
        //    23: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    26: ifne            64
        //    29: aload_1        
        //    30: invokestatic    android/text/SpannableStringBuilder.valueOf:(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //    33: astore_2       
        //    34: new             Landroid/text/SpannableString;
        //    37: dup            
        //    38: aload_1        
        //    39: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //    42: astore_1       
        //    43: aload_2        
        //    44: new             LX/1f2;
        //    47: dup            
        //    48: aload_0        
        //    49: invokespecial   X/1f2.<init>:(LX/2Hn;)V
        //    52: iconst_0       
        //    53: aload_1        
        //    54: invokevirtual   android/text/SpannableString.length:()I
        //    57: bipush          33
        //    59: invokevirtual   android/text/SpannableStringBuilder.setSpan:(Ljava/lang/Object;III)V
        //    62: aload_2        
        //    63: areturn        
        //    64: ldc_w           ""
        //    67: invokestatic    android/text/SpannableStringBuilder.valueOf:(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //    70: areturn        
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
    public boolean LJJIIZI() {
        return true;
    }
    
    @Override
    public final boolean LJJIJ() {
        return this.LJIJ;
    }
    
    @Override
    public final CharSequence LJJIJIIJI() {
        public final class 1f1 extends GG3
        {
            public final /* synthetic */ 2Hn LIZ;
            
            static {
                Covode.recordClassIndex(10834);
            }
            
            public 1f1(final 2Hn liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.LJJJJJ();
            }
            
            public final void updateDrawState(final TextPaint textPaint) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/2Hn.LJJIJ:Ljava/lang/CharSequence;
        //     4: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     7: ifeq            14
        //    10: ldc_w           ""
        //    13: areturn        
        //    14: new             Ljava/lang/StringBuilder;
        //    17: dup            
        //    18: invokespecial   java/lang/StringBuilder.<init>:()V
        //    21: astore_1       
        //    22: iconst_0       
        //    23: istore_2       
        //    24: iload_2        
        //    25: aload_0        
        //    26: getfield        X/2Hn.LJJIJ:Ljava/lang/CharSequence;
        //    29: invokeinterface java/lang/CharSequence.length:()I
        //    34: if_icmpge       74
        //    37: aload_0        
        //    38: getfield        X/2Hn.LJJIJ:Ljava/lang/CharSequence;
        //    41: iload_2        
        //    42: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    47: ldc_w           65532
        //    50: if_icmpeq       68
        //    53: aload_1        
        //    54: aload_0        
        //    55: getfield        X/2Hn.LJJIJ:Ljava/lang/CharSequence;
        //    58: iload_2        
        //    59: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    64: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: iinc            2, 1
        //    71: goto            24
        //    74: aload_0        
        //    75: aload_1        
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: putfield        X/2Hn.LJJIJ:Ljava/lang/CharSequence;
        //    82: new             Landroid/text/SpannableString;
        //    85: dup            
        //    86: aload_0        
        //    87: getfield        X/2Hn.LJJIJ:Ljava/lang/CharSequence;
        //    90: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //    93: astore_1       
        //    94: aload_1        
        //    95: new             LX/1f1;
        //    98: dup            
        //    99: aload_0        
        //   100: invokespecial   X/1f1.<init>:(LX/2Hn;)V
        //   103: iconst_0       
        //   104: aload_1        
        //   105: invokevirtual   android/text/SpannableString.length:()I
        //   108: bipush          33
        //   110: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   113: aload_1        
        //   114: areturn        
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
    public final CharSequence LJJIJIIJIL() {
        return this.LJIJI();
    }
    
    @Override
    public final boolean LJJIJIL() {
        final CharSequence ljiji = this.LJIJI();
        if (ljiji == null) {
            return false;
        }
        for (int i = 0; i < ljiji.length(); ++i) {
            final char char1 = ljiji.charAt(i);
            if (char1 != ' ' && char1 != '\ufffc' && char1 != this.LJIL && char1 != this.LJIJJLI) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean LJJJJ() {
        return true;
    }
    
    @Override
    public final void LJJJJIZL() {
        if (this.LJ() != null && !this.LJJIJIIJI.LIZ && super.LIZLLL != null && super.LIZLLL.LJIJI != null) {
            final ArrayList list = new ArrayList();
            list.add(this);
            super.LIZLLL.LJIJI.LIZ(this);
            super.LIZLLL.LJIJI.LIZ(list);
        }
    }
    
    public final void LJJJJJ() {
        final CharSequence ljjjji = this.LJJJJI();
        if (this.LIZIZ() != null && !TextUtils.isEmpty(ljjjji)) {
            final GCd gCd = new GCd(1, ljjjji.toString(), "positive_reply", false);
            gCd.LJIIIIZZ = "message";
            final HashMap logArgs = new HashMap();
            if (super.LJFF.LIZIZ && super.LJFF.LIZJ != null) {
                logArgs.put("reply_method", "pin");
                final PinMessage lji = super.LJFF.LIZJ.LJI;
                if (lji != null) {
                    logArgs.put("pin_msg_id", String.valueOf(((H31)lji).getMessageId()));
                    logArgs.put("pin_id", String.valueOf(lji.LJIIJ));
                }
            }
            else if (this.LJJIJLIJ()) {
                logArgs.put("reply_method", "anchor");
            }
            else {
                logArgs.put("reply_method", "viewer");
            }
            logArgs.put("reply_event_page", "click_msg");
            final ISendCommentEvent$Sender reply = ISendCommentEvent$Sender.REPLY;
            reply.setLogArgs((Map)logArgs);
            gCd.LJIIIZ = reply;
            gCd.LIZLLL = this.LIZIZ();
            FGP.LIZ().LIZ((Object)gCd);
        }
        GkR.LIZIZ(super.LJIILIIL);
    }
    
    @Override
    public final List<a> LJJJJJL() {
        if (this.LJIIZILJ) {
            return new ArrayList<a>();
        }
        if (!this.LJJ.isEmpty()) {
            return this.LJJ;
        }
        final List ljiiljjil = ((ChatMessage)super.LJIILIIL).LJIILJJIL;
        if (ljiiljjil == null) {
            return this.LJJ;
        }
        for (int i = 0; i < ljiiljjil.size(); ++i) {
            this.LJJ.add(new a(((EmoteWithIndex)ljiiljjil.get(i)).index, ((EmoteWithIndex)ljiiljjil.get(i)).emoteModel));
        }
        return this.LJJ;
    }
    
    @Override
    public final String LJJJJL() {
        if (super.LJIILIIL == null || ((ChatMessage)super.LJIILIIL).LIZIZ == null) {
            return "";
        }
        return ((ChatMessage)super.LJIILIIL).LIZIZ;
    }
    
    @Override
    public final int LJJJJLI() {
        if (super.LJIILIIL == null) {
            return 0;
        }
        if (((ChatMessage)super.LJIILIIL).LJIILJJIL == null) {
            return 0;
        }
        return ((ChatMessage)super.LJIILIIL).LJIILJJIL.size();
    }
    
    @Override
    public final CharSequence p_() {
        final SpannableStringBuilder ljjii = super.LJJII;
        if (Ghp.LIZ(super.LIZLLL.LJIIIZ) && ljjii.length() > 0 && ljjii.charAt(0) != this.LJIJJLI) {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.LJIJJLI);
            ljjii.insert(0, (CharSequence)spannableStringBuilder);
            this.LJJIIZI = true;
        }
        else if (ljjii.length() > 0 && ljjii.charAt(0) != this.LJIL) {
            final SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(this.LJIL);
            ljjii.insert(0, (CharSequence)spannableStringBuilder2);
            this.LJJIIZI = true;
        }
        return (CharSequence)ljjii;
    }
}
