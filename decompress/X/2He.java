// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.live.ICommentService;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;

public abstract class 2He<MESSAGE extends H31> extends 2HI<MESSAGE> implements 10R
{
    public static final int LJJIIJ;
    public static final int LJJIIJZLJL;
    public static final int LJJIIZ;
    public boolean LJJI;
    public EmoteModel LJJIFFI;
    public final SpannableStringBuilder LJJII;
    public boolean LJJIII;
    
    static {
        Covode.recordClassIndex(10837);
        LJJIIJ = 0cB.LIZLLL(2131166233);
        0cB.LIZLLL(2131166234);
        LJJIIJZLJL = 0cB.LIZLLL(2131166235);
        LJJIIZ = 0cB.LIZLLL(2131166232);
    }
    
    public 2He(final MESSAGE message) {
        CTM.LIZ((Object)message);
        super(message);
        this.LJJII = this.LJJIIZ();
        this.LJJIII = true;
    }
    
    private final void LJJIJ() {
        public final class 1f3 extends GG3
        {
            public final /* synthetic */ a LIZ;
            public final /* synthetic */ 2He LIZIZ;
            
            static {
                Covode.recordClassIndex(10841);
            }
            
            public 1f3(final a liz, final 2He liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onClick(final View view) {
                CTM.LIZ((Object)view);
                final 2He liziz = this.LIZIZ;
                final EmoteModel ljff = this.LIZ.LJFF;
                if (liziz.t_() != null) {
                    Label_0103: {
                        if (liziz.t_().LJIIL) {
                            final DataChannel ljiizilj = liziz.t_().LJIIZILJ;
                            while (true) {
                                Label_0304: {
                                    if (ljiizilj == null) {
                                        break Label_0304;
                                    }
                                    final Room room = (Room)ljiizilj.LIZIZ((Class)G69.class);
                                    if (room == null) {
                                        break Label_0304;
                                    }
                                    final User owner = room.getOwner();
                                    n.LIZIZ((Object)owner, "");
                                    final int subscribed = owner.isSubscribed() ? 1 : 0;
                                    if (Go9.LIZ.LIZ(liziz.t_().LJIIZILJ) == 0 || subscribed == 0) {
                                        liziz.LIZ(ljff);
                                        break Label_0103;
                                    }
                                    final GCd gCd = new GCd(4, "", "emote", false);
                                    gCd.LJIIJ = ljff;
                                    final DataChannel ljiizilj2 = liziz.t_().LJIIZILJ;
                                    if (ljiizilj2 != null) {
                                        ljiizilj2.LIZJ((Class)2Dn.class, (Object)gCd);
                                    }
                                    break Label_0103;
                                }
                                final int subscribed = 0;
                                continue;
                            }
                        }
                        liziz.LJJIFFI = ljff;
                        FGP.LIZ().LIZ((Object)new Ffv(1));
                    }
                    final User liziz2 = liziz.LIZIZ();
                    String s;
                    if (liziz2 != null && liziz2.getId() == liziz.t_().LIZJ) {
                        if (liziz.t_().LJIILJJIL) {
                            s = "live_anchor_c_anchor";
                        }
                        else {
                            s = "live_audience_c_anchor";
                        }
                    }
                    else if (liziz.t_().LJIILJJIL) {
                        s = "live_anchor_c_audience";
                    }
                    else {
                        s = "live_audience_c_audience";
                    }
                    final Gkn liz = Gkn.LJFF.LIZ("livesdk_privilege_emote_click");
                    liz.LIZ(liziz.t_().LJIIZILJ);
                    liz.LIZ("request_page", s);
                    liz.LIZ("click_position", "comment_area");
                    final int liziz3 = Gpk.LIZ.LIZIZ(liziz.LJJJJL(), liziz.LJJJJLI());
                    if (liziz3 != -1) {
                        liz.LIZ("show_type", String.valueOf(liziz3));
                    }
                    liz.LIZLLL();
                    Gkm.LIZ(Gkm.LIZJ, "subscription_publicscreen_emote_click", new JSONObject());
                }
            }
            
            public final void updateDrawState(final TextPaint textPaint) {
                CTM.LIZ((Object)textPaint);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   X/2He.LJJJJJL:()Ljava/util/List;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          434
        //     9: new             Landroid/graphics/drawable/GradientDrawable;
        //    12: dup            
        //    13: invokespecial   android/graphics/drawable/GradientDrawable.<init>:()V
        //    16: astore_2       
        //    17: getstatic       X/2He.LJJIIJ:I
        //    20: istore_3       
        //    21: iconst_0       
        //    22: istore          4
        //    24: aload_2        
        //    25: iconst_0       
        //    26: iconst_0       
        //    27: iload_3        
        //    28: iload_3        
        //    29: invokevirtual   android/graphics/drawable/GradientDrawable.setBounds:(IIII)V
        //    32: aload_2        
        //    33: getstatic       X/2He.LJJIIZ:I
        //    36: i2f            
        //    37: invokevirtual   android/graphics/drawable/GradientDrawable.setCornerRadius:(F)V
        //    40: aload_2        
        //    41: aload_0        
        //    42: invokevirtual   X/2AW.t_:()LX/10r;
        //    45: getfield        X/10r.LJIIIZ:Landroid/content/Context;
        //    48: ldc             2130971383
        //    50: invokestatic    X/0eI.LIZ:(Landroid/content/Context;I)I
        //    53: invokevirtual   android/graphics/drawable/GradientDrawable.setColor:(I)V
        //    56: aload_2        
        //    57: aload_0        
        //    58: getfield        X/2He.LJJI:Z
        //    61: invokestatic    X/08U.LIZIZ:(Landroid/graphics/drawable/Drawable;I)Z
        //    64: pop            
        //    65: aload_1        
        //    66: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    71: astore          5
        //    73: iconst_0       
        //    74: istore_3       
        //    75: aload           5
        //    77: invokeinterface java/util/Iterator.hasNext:()Z
        //    82: ifeq            343
        //    85: aload           5
        //    87: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    92: astore_1       
        //    93: iload_3        
        //    94: ifge            100
        //    97: invokestatic    X/Ey9.LIZ:()V
        //   100: aload_1        
        //   101: checkcast       LX/2He$a;
        //   104: astore          6
        //   106: aload_0        
        //   107: getfield        X/2He.LJJII:Landroid/text/SpannableStringBuilder;
        //   110: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   113: iload_3        
        //   114: if_icmplt       337
        //   117: new             Landroid/text/SpannableStringBuilder;
        //   120: dup            
        //   121: invokespecial   android/text/SpannableStringBuilder.<init>:()V
        //   124: astore          7
        //   126: aload           7
        //   128: ldc             65532
        //   130: invokevirtual   android/text/SpannableStringBuilder.append:(C)Landroid/text/SpannableStringBuilder;
        //   133: pop            
        //   134: aload           6
        //   136: getfield        X/2He$a.LIZ:Landroid/graphics/drawable/Drawable;
        //   139: astore          8
        //   141: aload           8
        //   143: astore_1       
        //   144: aload           8
        //   146: ifnonnull       151
        //   149: aload_2        
        //   150: astore_1       
        //   151: new             LX/7wk;
        //   154: dup            
        //   155: aload_1        
        //   156: invokespecial   X/7wk.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   159: astore_1       
        //   160: aload_1        
        //   161: getstatic       X/2He.LJJIIZ:I
        //   164: i2f            
        //   165: invokevirtual   X/7wk.LIZ:(F)V
        //   168: getstatic       X/2He.LJJIIJZLJL:I
        //   171: istore          9
        //   173: aload_1        
        //   174: iload           9
        //   176: putfield        X/7wk.LIZJ:I
        //   179: aload_1        
        //   180: iload           9
        //   182: putfield        X/7wk.LIZLLL:I
        //   185: aload_1        
        //   186: iload           9
        //   188: putfield        X/7wj.LIZ:I
        //   191: aload_1        
        //   192: iload           9
        //   194: putfield        X/7wj.LIZIZ:I
        //   197: aload           6
        //   199: aload_1        
        //   200: putfield        X/2He$a.LIZLLL:LX/7wk;
        //   203: aload           7
        //   205: aload_1        
        //   206: aload           7
        //   208: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   211: iconst_1       
        //   212: isub           
        //   213: aload           7
        //   215: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   218: bipush          33
        //   220: invokevirtual   android/text/SpannableStringBuilder.setSpan:(Ljava/lang/Object;III)V
        //   223: aload           7
        //   225: new             LX/1f3;
        //   228: dup            
        //   229: aload           6
        //   231: aload_0        
        //   232: invokespecial   X/1f3.<init>:(LX/2He$a;LX/2He;)V
        //   235: aload           7
        //   237: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   240: iconst_1       
        //   241: isub           
        //   242: aload           7
        //   244: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   247: bipush          33
        //   249: invokevirtual   android/text/SpannableStringBuilder.setSpan:(Ljava/lang/Object;III)V
        //   252: getstatic       X/Gpk.LIZ:LX/Gpk;
        //   255: astore_1       
        //   256: aload_0        
        //   257: getfield        X/2He.LJJII:Landroid/text/SpannableStringBuilder;
        //   260: invokevirtual   android/text/SpannableStringBuilder.toString:()Ljava/lang/String;
        //   263: astore          8
        //   265: aload           8
        //   267: ldc             ""
        //   269: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   272: aload_1        
        //   273: aload           8
        //   275: aload           6
        //   277: getfield        X/2He$a.LJ:I
        //   280: invokevirtual   X/Gpk.LIZ:(Ljava/lang/String;I)I
        //   283: istore          9
        //   285: iload           9
        //   287: iconst_m1      
        //   288: if_icmpne       304
        //   291: aload_0        
        //   292: getfield        X/2He.LJJII:Landroid/text/SpannableStringBuilder;
        //   295: ldc             " "
        //   297: invokevirtual   android/text/SpannableStringBuilder.append:(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //   300: pop            
        //   301: goto            252
        //   304: aload           6
        //   306: iload           9
        //   308: putfield        X/2He$a.LJI:I
        //   311: iload           9
        //   313: iconst_m1      
        //   314: if_icmpne       320
        //   317: goto            252
        //   320: aload_0        
        //   321: getfield        X/2He.LJJII:Landroid/text/SpannableStringBuilder;
        //   324: iload           9
        //   326: aload           7
        //   328: invokevirtual   android/text/SpannableStringBuilder.insert:(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //   331: pop            
        //   332: aload           6
        //   334: invokevirtual   X/2He$a.LIZ:()V
        //   337: iinc            3, 1
        //   340: goto            75
        //   343: aload_0        
        //   344: getfield        X/2He.LJJIFFI:Lcom/bytedance/android/live/base/model/emoji/EmoteModel;
        //   347: astore_1       
        //   348: aload_1        
        //   349: ifnull          434
        //   352: aload_0        
        //   353: invokevirtual   X/2AW.t_:()LX/10r;
        //   356: getfield        X/10r.LJIIZILJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   359: astore_2       
        //   360: iload           4
        //   362: istore          10
        //   364: aload_2        
        //   365: ifnull          403
        //   368: aload_2        
        //   369: ldc             LX/G69;.class
        //   371: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   374: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   377: astore_2       
        //   378: iload           4
        //   380: istore          10
        //   382: aload_2        
        //   383: ifnull          403
        //   386: aload_2        
        //   387: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   390: astore_2       
        //   391: aload_2        
        //   392: ldc             ""
        //   394: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   397: aload_2        
        //   398: invokevirtual   com/bytedance/android/live/base/model/user/User.isSubscribed:()Z
        //   401: istore          10
        //   403: getstatic       X/Go9.LIZ:LX/GoA;
        //   406: aload_0        
        //   407: invokevirtual   X/2AW.t_:()LX/10r;
        //   410: getfield        X/10r.LJIIZILJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   413: invokevirtual   X/GoA.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)I
        //   416: ifeq            424
        //   419: iload           10
        //   421: ifne            435
        //   424: aload_0        
        //   425: aload_1        
        //   426: invokevirtual   X/2He.LIZ:(Lcom/bytedance/android/live/base/model/emoji/EmoteModel;)V
        //   429: aload_0        
        //   430: aconst_null    
        //   431: putfield        X/2He.LJJIFFI:Lcom/bytedance/android/live/base/model/emoji/EmoteModel;
        //   434: return         
        //   435: new             LX/GCd;
        //   438: dup            
        //   439: iconst_4       
        //   440: ldc             ""
        //   442: invokespecial   X/GCd.<init>:(ILjava/lang/String;)V
        //   445: astore_2       
        //   446: aload_2        
        //   447: aload_1        
        //   448: putfield        X/GCd.LJIIJ:Lcom/bytedance/android/live/base/model/emoji/EmoteModel;
        //   451: aload_2        
        //   452: ldc_w           "emote"
        //   455: putfield        X/GCd.LJ:Ljava/lang/String;
        //   458: aload_0        
        //   459: invokevirtual   X/2AW.t_:()LX/10r;
        //   462: getfield        X/10r.LJIIZILJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   465: astore_1       
        //   466: aload_1        
        //   467: ifnull          429
        //   470: aload_1        
        //   471: ldc_w           LX/2Dn;.class
        //   474: aload_2        
        //   475: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   478: pop            
        //   479: goto            429
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
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
    
    public abstract void LIZ(final a p0);
    
    public final void LIZ(final EmoteModel emoteModel) {
        final DataChannel ljiizilj = this.t_().LJIIZILJ;
        if (ljiizilj != null) {
            final 0AB 0ab = (0AB)ljiizilj.LIZIZ((Class)G73.class);
            if (0ab != null) {
                0jR.LIZ(ICommentService.class).showEmoteDetailDialog(emoteModel, 0ab, GTi.LIZ(Boolean.valueOf(GTi.LIZJ(this.t_().LJIIZILJ))));
            }
        }
    }
    
    @Override
    public void LIZIZ(final 10r 10r) {
        CTM.LIZ((Object)10r);
        super.LIZIZ(10r);
        final DataChannel ljiizilj = 10r.LJIIZILJ;
        if (ljiizilj != null) {
            final Room ljiill = 10r.LJIILL;
            if (ljiill != null) {
                0jR.LIZ(ISubscribeService.class).sendSubscribeGuideIfNeed(10r.LJIIIZ, ljiizilj, ljiill);
            }
        }
        this.LJJI = 10r.LJIIJJI;
        this.LJJIJ();
    }
    
    @Override
    public final void LIZLLL(final 10r 10r) {
        CTM.LIZ((Object)10r);
        super.LIZLLL(10r);
        this.LJJIJ();
    }
    
    @Override
    public void LJIIJ() {
        super.LJIIJ();
    }
    
    @Override
    public void LJIIJJI() {
        super.LJIIJJI();
        this.LJJIII = true;
    }
    
    @Override
    public void LJJIIJZLJL() {
        super.LJJIIJZLJL();
        final List<a> ljjjjjl = this.LJJJJJL();
        if (ljjjjjl != null) {
            for (final a a : ljjjjjl) {
                a.LIZJ = false;
                final Qom<S0P<S5q>> liziz = a.LIZIZ;
                if (liziz != null) {
                    liziz.LJI();
                }
            }
        }
    }
    
    public abstract SpannableStringBuilder LJJIIZ();
    
    public abstract boolean LJJIIZI();
    
    public abstract List<a> LJJJJJL();
    
    public abstract String LJJJJL();
    
    public abstract int LJJJJLI();
    
    @Override
    public final void q_() {
        super.q_();
        final List<a> ljjjjjl = this.LJJJJJL();
        if (ljjjjjl != null) {
            final Iterator<Object> iterator = ljjjjjl.iterator();
            while (iterator.hasNext()) {
                iterator.next().LIZ();
            }
        }
        if (this.t_() == null) {
            return;
        }
        if (this.LJJIII && this.LJJIIZI()) {
            this.LJJIII = false;
            final int liziz = Gpk.LIZ.LIZIZ(this.LJJJJL(), this.LJJJJLI());
            if (liziz != -1) {
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_privilege_emote_show");
                liz.LIZ(this.t_().LJIIZILJ);
                liz.LIZ("show_entrance", "comment_area");
                liz.LIZ("show_type", String.valueOf(liziz));
                liz.LIZLLL();
            }
        }
    }
    
    public final class a
    {
        public Drawable LIZ;
        public Qom<S0P<S5q>> LIZIZ;
        public boolean LIZJ;
        public 7wk LIZLLL;
        public final int LJ;
        public final EmoteModel LJFF;
        public int LJI;
        
        static {
            Covode.recordClassIndex(10838);
        }
        
        public a(final int lj, final EmoteModel ljff) {
            CTM.LIZ((Object)ljff);
            this.LJ = lj;
            this.LJFF = ljff;
            this.LJI = 0;
            this.LIZ = ljff.LJIIL;
        }
        
        public final void LIZ() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        X/2He$a.LIZ:Landroid/graphics/drawable/Drawable;
            //     4: ifnonnull       80
            //     7: aload_0        
            //     8: getfield        X/2He$a.LIZJ:Z
            //    11: ifne            80
            //    14: aload_0        
            //    15: iconst_1       
            //    16: putfield        X/2He$a.LIZJ:Z
            //    19: aload_0        
            //    20: getfield        X/2He$a.LIZIZ:LX/Qom;
            //    23: astore_1       
            //    24: aload_1        
            //    25: ifnull          35
            //    28: aload_1        
            //    29: invokeinterface X/Qom.LJI:()Z
            //    34: pop            
            //    35: aload_0        
            //    36: getfield        X/2He$a.LJFF:Lcom/bytedance/android/live/base/model/emoji/EmoteModel;
            //    39: getfield        com/bytedance/android/live/base/model/emoji/EmoteModel.LJI:Lcom/bytedance/android/live/base/model/ImageModel;
            //    42: astore_1       
            //    43: getstatic       X/2He.LJJIIJ:I
            //    46: istore_2       
            //    47: aload_1        
            //    48: iload_2        
            //    49: iload_2        
            //    50: invokestatic    X/0ch.LIZ:(Lcom/bytedance/android/live/base/model/ImageModel;II)LX/Qom;
            //    53: astore_1       
            //    54: aload_0        
            //    55: aload_1        
            //    56: putfield        X/2He$a.LIZIZ:LX/Qom;
            //    59: aload_1        
            //    60: ifnull          80
            //    63: aload_1        
            //    64: new             LX/2Ak;
            //    67: dup            
            //    68: aload_0        
            //    69: invokespecial   X/2Ak.<init>:(LX/2He$a;)V
            //    72: getstatic       X/Qzq.LIZ:LX/Qzq;
            //    75: invokeinterface X/Qom.LIZ:(LX/SAV;Ljava/util/concurrent/Executor;)V
            //    80: return         
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
    }
}
