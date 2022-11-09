// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import android.widget.ImageView;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.widget.FrameLayout;

public final class 0uj extends FrameLayout
{
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LIZ;
    public 2fc LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public DataChannel LJ;
    public HashMap LJFF;
    
    static {
        Covode.recordClassIndex(9526);
    }
    
    public 0uj(final Context context, final DataChannel lj, final boolean lizj) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   android/widget/FrameLayout.<init>:(Landroid/content/Context;)V
        //     9: sipush          8150
        //    12: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    15: aload_0        
        //    16: aload_2        
        //    17: putfield        X/0uj.LJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    20: aload_0        
        //    21: iload_3        
        //    22: putfield        X/0uj.LIZJ:Z
        //    25: getstatic       X/1jw.LIZ:LX/1jw;
        //    28: aload_0        
        //    29: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;)V
        //    32: aload_1        
        //    33: ldc             2131562369
        //    35: aload_0        
        //    36: invokestatic    android/widget/FrameLayout.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
        //    39: pop            
        //    40: aload_0        
        //    41: aload_0        
        //    42: invokespecial   X/0uj.LIZIZ:()Z
        //    45: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    48: invokevirtual   X/0uj.LIZ:(Ljava/lang/Boolean;)V
        //    51: aload_0        
        //    52: ldc             2131368952
        //    54: invokevirtual   X/0uj.LIZ:(I)Landroid/view/View;
        //    57: checkcast       LX/1si;
        //    60: new             LX/0ui;
        //    63: dup            
        //    64: aload_0        
        //    65: invokespecial   X/0ui.<init>:(LX/0uj;)V
        //    68: invokevirtual   X/1si.post:(Ljava/lang/Runnable;)Z
        //    71: pop            
        //    72: aload_0        
        //    73: getfield        X/0uj.LJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    76: astore_1       
        //    77: aload_1        
        //    78: ifnull          120
        //    81: aload_1        
        //    82: aload_0        
        //    83: ldc             LX/2Fe;.class
        //    85: new             LX/265;
        //    88: dup            
        //    89: aload_0        
        //    90: invokespecial   X/265.<init>:(LX/0uj;)V
        //    93: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    96: pop            
        //    97: aload_1        
        //    98: aload_0        
        //    99: ldc             LX/2GD;.class
        //   101: new             LX/266;
        //   104: dup            
        //   105: aload_0        
        //   106: invokespecial   X/266.<init>:(LX/0uj;)V
        //   109: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   112: pop            
        //   113: sipush          8150
        //   116: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   119: return         
        //   120: sipush          8150
        //   123: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   126: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    private boolean LIZIZ() {
        final DataChannel lj = this.LJ;
        while (true) {
            Label_0036: {
                if (lj == null) {
                    break Label_0036;
                }
                final Room room = (Room)lj.LIZIZ((Class)G69.class);
                if (room == null) {
                    break Label_0036;
                }
                final long ownerUserId = room.getOwnerUserId();
                if (ownerUserId == 0L) {
                    return true;
                }
                final String liz = 5ob.LIZ.LIZ(ownerUserId);
                if (liz == null || liz.length() == 0) {
                    return true;
                }
                final 1Uo liz2 = this.LIZ;
                if (liz2 == null) {
                    n.LIZ("");
                }
                final Boolean lizj = liz2.LIZJ(liz);
                return lizj == null || !lizj;
            }
            final long ownerUserId = 0L;
            continue;
        }
    }
    
    private final void LIZJ() {
        final 1si 1si = (1si)this.LIZ(2131368952);
        n.LIZIZ((Object)1si, "");
        1si.setVisibility(0);
        final DataChannel lj = this.LJ;
        while (true) {
            Label_0173: {
                if (lj == null) {
                    break Label_0173;
                }
                final Room room = (Room)lj.LIZIZ((Class)G69.class);
                if (room == null) {
                    break Label_0173;
                }
                final User owner = room.getOwner();
                if (owner == null) {
                    break Label_0173;
                }
                final ImageModel avatarThumb = owner.getAvatarThumb();
                final ImageView imageView = (ImageView)this.LIZ(2131368952);
                final 1si 1si2 = (1si)this.LIZ(2131368952);
                n.LIZIZ((Object)1si2, "");
                final int width = 1si2.getWidth();
                final 1si 1si3 = (1si)this.LIZ(2131368952);
                n.LIZIZ((Object)1si3, "");
                HFv.LIZ(imageView, avatarThumb, width, 1si3.getHeight(), 2131234398);
                if (this.LIZJ) {
                    final 1Uo liz = this.LIZ;
                    if (liz == null) {
                        n.LIZ("");
                    }
                    if (liz.LJIILL == 0k8.FLOATING) {
                        final 1si 1si4 = (1si)this.LIZ(2131368955);
                        n.LIZIZ((Object)1si4, "");
                        1si4.setVisibility(8);
                        return;
                    }
                }
                final 1si 1si5 = (1si)this.LIZ(2131368955);
                n.LIZIZ((Object)1si5, "");
                1si5.setVisibility(0);
                if (!this.LIZLLL) {
                    this.LIZLLL();
                    this.LIZLLL = true;
                }
                return;
            }
            final ImageModel avatarThumb = null;
            continue;
        }
    }
    
    private final void LIZLLL() {
        final DataChannel lj = this.LJ;
        while (true) {
            Label_0102: {
                if (lj == null) {
                    break Label_0102;
                }
                final Room room = (Room)lj.LIZIZ((Class)G69.class);
                if (room == null) {
                    break Label_0102;
                }
                final User owner = room.getOwner();
                if (owner == null) {
                    break Label_0102;
                }
                final ImageModel avatarThumb = owner.getAvatarThumb();
                final HZ0 ljiij = new HZ0(5, 0.74698794f);
                if (avatarThumb != null) {
                    final List<String> urls = avatarThumb.getUrls();
                    if (urls != null && urls.size() == 0) {
                        final S8f liz = S8f.LIZ(Ql3.LIZ(2131234398));
                        liz.LJIIJ = (Qys)ljiij;
                        final S8e liz2 = liz.LIZ();
                        final SAp liziz = SBH.LIZIZ();
                        ((SDU)liziz).LIZIZ((Object)liz2);
                        final SEd sEd = (SEd)this.LIZ(2131368955);
                        n.LIZIZ((Object)sEd, "");
                        ((SDU)liziz).LIZ(sEd.getController());
                        final SDT lizj = ((SDU)liziz).LIZJ();
                        final SEd sEd2 = (SEd)this.LIZ(2131368955);
                        n.LIZIZ((Object)sEd2, "");
                        sEd2.setController((SDe)lizj);
                        return;
                    }
                }
                final G18 liz3 = 0cp.LIZ();
                0cq.LIZ(liz3, avatarThumb);
                liz3.LIZ(0.74698794f);
                liz3.LIZ(this.LIZ(2131368955));
                return;
            }
            final ImageModel avatarThumb = null;
            continue;
        }
    }
    
    public final View LIZ(final int n) {
        if (this.LJFF == null) {
            this.LJFF = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJFF.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LJFF.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ() {
        this.LIZ(this.LIZIZ());
    }
    
    public final void LIZ(final Boolean b) {
        if (n.LIZ((Object)b, (Object)true)) {
            final 1si 1si = (1si)this.LIZ(2131368952);
            n.LIZIZ((Object)1si, "");
            1si.setVisibility(8);
            final 1si 1si2 = (1si)this.LIZ(2131368955);
            n.LIZIZ((Object)1si2, "");
            1si2.setVisibility(8);
            final 1ib 1ib = (1ib)this.LIZ(2131373049);
            n.LIZIZ((Object)1ib, "");
            1ib.setVisibility(8);
            return;
        }
        this.LIZJ();
    }
    
    public final DataChannel getMDataChannel() {
        return this.LJ;
    }
    
    public final 1Uo getMDataHolder() {
        final 1Uo liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public final boolean getMIsNormalAudience() {
        return this.LIZJ;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final DataChannel lj = this.LJ;
        if (lj != null) {
            lj.LIZIZ((Object)this);
        }
    }
    
    public final void setMDataChannel(final DataChannel lj) {
        this.LJ = lj;
    }
    
    public final void setMDataHolder(final 1Uo liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final void setMIsNormalAudience(final boolean lizj) {
        this.LIZJ = lizj;
    }
}
