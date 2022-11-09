// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.highlight;

import X.44T;
import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import X.44V;
import X.GST;
import X.GZb;
import X.G18;
import android.widget.ImageView$ScaleType;
import X.0cp;
import X.GTi;
import X.2P9;
import X.0aG;
import X.SRS;
import X.F5g;
import android.content.Context;
import X.GIK;
import X.0jR;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import kotlin.jvm.internal.n;
import X.Fk2;
import X.Gkn;
import X.CTM;
import android.view.View;
import android.view.View$OnClickListener;
import X.0ZX;
import X.Fqb;
import X.0ba;
import X.H25;
import java.util.TimeZone;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.G8y;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import X.Fra;
import X.1si;
import X.6mZ;
import com.bytedance.android.live.broadcast.banner.BannerWidget;

public final class PreviewHighLightVideoWidget extends BannerWidget implements 6mZ
{
    public 1si LJI;
    public Fra LJII;
    public boolean LJIIIIZZ;
    public GameLiveFragment LJIIIZ;
    public boolean LJIIJJI;
    public String LJIIL;
    
    static {
        Covode.recordClassIndex(5405);
    }
    
    public PreviewHighLightVideoWidget() {
        final DataChannel dataChannel = super.dataChannel;
        Fra video;
        if (dataChannel == null || (video = (Fra)dataChannel.LIZIZ((Class)G8y.class)) == null) {
            video = Fra.VIDEO;
        }
        this.LJII = video;
        super.LIZIZ = 5;
        super.LIZJ = true;
        this.LJIIL = "highlight_banner";
    }
    
    private final long LIZ(final long n, final TimeZone timeZone) {
        final long n2 = (timeZone.getOffset(n) + n) / 86400000L;
        if (H25.LJFF) {
            final StringBuilder sb = new StringBuilder("millis2Days(). millis=");
            sb.append(n);
            sb.append(", day=");
            sb.append(n2);
            0ba.LIZ(4, "PreviewHighLightVideoWidget", sb.toString());
        }
        return n2;
    }
    
    private final boolean LIZ(final long n, final long n2, final TimeZone timeZone) {
        final long n3 = n - n2;
        return n3 < 86400000L && n3 > -86400000L && this.LIZ(n, timeZone) == this.LIZ(n2, timeZone);
    }
    
    @Override
    public final String LIZ() {
        return this.LJIIL;
    }
    
    @Override
    public final void LIZJ() {
        super.LIZJ();
        if (!super.LJ) {
            if (H25.LJFF) {
                0ba.LIZ(4, "PreviewHighLightVideoWidget", "show().");
            }
            this.LJIIJJI = true;
            0ZX.LIZ(Fqb.LIZ(this.LJII));
        }
    }
    
    @Override
    public final void LIZLLL() {
        super.LIZLLL();
        if (super.LJ) {
            if (H25.LJFF) {
                0ba.LIZ(4, "PreviewHighLightVideoWidget", "show().");
            }
            this.LJIIJJI = true;
            0ZX.LIZ(Fqb.LIZ(this.LJII));
        }
    }
    
    public final void LJ() {
        public final class 1s5 extends F5g implements SRS<0aG, 2P9>
        {
            public final /* synthetic */ PreviewHighLightVideoWidget LIZ;
            
            static {
                Covode.recordClassIndex(5407);
            }
            
            public 1s5(final PreviewHighLightVideoWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 0ZU implements View$OnClickListener
        {
            public final /* synthetic */ PreviewHighLightVideoWidget LIZ;
            
            static {
                Covode.recordClassIndex(5406);
            }
            
            public 0ZU(final PreviewHighLightVideoWidget liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final String liz = Fqb.LIZ(this.LIZ.LJII);
                CTM.LIZ((Object)liz);
                final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_live_takepage_highlight_guide_click");
                final GIK liziz = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz, "");
                liz2.LIZ("anchor_id", liziz.LIZJ());
                liz2.LIZ("live_type", liz);
                liz2.LIZLLL();
                final GameLiveFragment ljiiiz = this.LIZ.LJIIIZ;
                String s;
                if (ljiiiz == null || (s = ljiiiz.LIZIZ) == null) {
                    s = String.valueOf(System.currentTimeMillis());
                }
                final GameLiveFragment ljiiiz2 = this.LIZ.LJIIIZ;
                String ljff;
                if (ljiiiz2 != null) {
                    ljff = ljiiiz2.LJFF;
                }
                else {
                    ljff = null;
                }
                final IGameService gameService = 0jR.LIZ(IGameService.class);
                final Context context = ((Widget)this.LIZ).context;
                n.LIZIZ((Object)context, "");
                gameService.downloadVideoAndJumpShortVideoEditPage(context, ljff, "live_takepage_highlight_guide", ".mp4", s);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/broadcast/preview/PreviewWidget.LJ:()V
        //     4: aload_0        
        //     5: aload_0        
        //     6: ldc             2131367070
        //     8: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //    11: checkcast       LX/1si;
        //    14: putfield        com/bytedance/android/live/broadcast/highlight/PreviewHighLightVideoWidget.LJI:LX/1si;
        //    17: aload_0        
        //    18: invokevirtual   com/bytedance/android/widget/Widget.getView:()Landroid/view/View;
        //    21: astore_1       
        //    22: aload_1        
        //    23: ifnull          38
        //    26: aload_1        
        //    27: new             LX/0ZU;
        //    30: dup            
        //    31: aload_0        
        //    32: invokespecial   X/0ZU.<init>:(Lcom/bytedance/android/live/broadcast/highlight/PreviewHighLightVideoWidget;)V
        //    35: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    38: aload_0        
        //    39: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    42: astore_1       
        //    43: aload_1        
        //    44: ifnull          63
        //    47: aload_1        
        //    48: aload_0        
        //    49: ldc             LX/G6A;.class
        //    51: new             LX/1s5;
        //    54: dup            
        //    55: aload_0        
        //    56: invokespecial   X/1s5.<init>:(Lcom/bytedance/android/live/broadcast/highlight/PreviewHighLightVideoWidget;)V
        //    59: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    62: pop            
        //    63: return         
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
    
    public final void LJFF() {
        super.LJFF();
        if (H25.LJFF) {
            0ba.LIZ(4, "PreviewHighLightVideoWidget", "hide().");
        }
    }
    
    public final boolean LJI() {
        final Boolean b = (Boolean)super.dataChannel.LIZIZ((Class)GZb.class);
        final boolean b2 = false;
        if (b != null && b) {
            return false;
        }
        final 44V lliffjfjj = GST.LLIFFJFJJ;
        n.LIZIZ((Object)lliffjfjj, "");
        final String s = (String)((44T)lliffjfjj).LIZ();
        final 44V llii = GST.LLII;
        n.LIZIZ((Object)llii, "");
        final Long n = (Long)((44T)llii).LIZ();
        boolean liz;
        if (!super.LJ) {
            final long currentTimeMillis = System.currentTimeMillis();
            kotlin.jvm.internal.n.LIZIZ((Object)n, "");
            final long longValue = n;
            final TimeZone default1 = TimeZone.getDefault();
            kotlin.jvm.internal.n.LIZIZ((Object)default1, "");
            liz = this.LIZ(currentTimeMillis, longValue, default1);
        }
        else {
            liz = false;
        }
        final boolean ljiiiizz = this.LJIIIIZZ;
        final String s2 = null;
        boolean b3 = b2;
        if (ljiiiizz) {
            final GameLiveFragment ljiiiz = this.LJIIIZ;
            b3 = b2;
            if (ljiiiz != null) {
                b3 = b2;
                if (ljiiiz.LIZ()) {
                    final GameLiveFragment ljiiiz2 = this.LJIIIZ;
                    String lj;
                    if (ljiiiz2 != null) {
                        lj = ljiiiz2.LJ;
                    }
                    else {
                        lj = null;
                    }
                    b3 = b2;
                    if (kotlin.jvm.internal.n.LIZ((Object)lj, (Object)s) ^ true) {
                        b3 = b2;
                        if (!liz) {
                            final 44V lli = GST.LLI;
                            kotlin.jvm.internal.n.LIZIZ((Object)lli, "");
                            b3 = b2;
                            if (kotlin.jvm.internal.n.LIZ(((44T)lli).LIZ(), (Object)true)) {
                                b3 = true;
                            }
                        }
                    }
                }
            }
        }
        if (H25.LJFF) {
            final StringBuilder sb = new StringBuilder("shouldShow(). hasFragment=");
            sb.append(this.LJIIIIZZ);
            sb.append(", showingFragment?.isValid=");
            final GameLiveFragment ljiiiz3 = this.LJIIIZ;
            Boolean value;
            if (ljiiiz3 != null) {
                value = ljiiiz3.LIZ();
            }
            else {
                value = null;
            }
            sb.append(value);
            sb.append(", showingFragment?.vid=");
            final GameLiveFragment ljiiiz4 = this.LJIIIZ;
            String lj2 = s2;
            if (ljiiiz4 != null) {
                lj2 = ljiiiz4.LJ;
            }
            sb.append(lj2);
            sb.append(", lastShowFragmentVid=");
            sb.append(s);
            sb.append(", !isSameDay=");
            sb.append(liz ^ true);
            sb.append(", SERVER_ENABLE_HIGHLIGHT_BUTTON=");
            final 44V lli2 = GST.LLI;
            kotlin.jvm.internal.n.LIZIZ((Object)lli2, "");
            sb.append(((44T)lli2).LIZ());
            0ba.LIZ(4, "PreviewHighLightVideoWidget", sb.toString());
        }
        return b3;
    }
    
    public final int getLayoutId() {
        return 2131562502;
    }
    
    public final void onDestroy() {
        super.onDestroy();
        if (H25.LJFF) {
            final StringBuilder sb = new StringBuilder("onDestroy(). shouldShow=");
            sb.append(this.LJI());
            sb.append(' ');
            0ba.LIZ(4, "PreviewHighLightVideoWidget", sb.toString());
        }
        if (this.LJIIJJI) {
            final 44V lliffjfjj = GST.LLIFFJFJJ;
            n.LIZIZ((Object)lliffjfjj, "");
            final GameLiveFragment ljiiiz = this.LJIIIZ;
            String lj;
            if (ljiiiz != null) {
                lj = ljiiiz.LJ;
            }
            else {
                lj = null;
            }
            ((44T)lliffjfjj).LIZ((Object)lj);
            final 44V llii = GST.LLII;
            n.LIZIZ((Object)llii, "");
            ((44T)llii).LIZ((Object)System.currentTimeMillis());
        }
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    @Override
    public final void show() {
        if (this.LJI()) {
            super.show();
        }
    }
}
