// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.livesdkapi.host.IHostLog;
import com.bytedance.android.live.toolbar.IToolbarService;
import kotlin.jvm.internal.n;
import android.os.Looper;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;

public final class 1QB implements GOM
{
    public boolean LIZ;
    public boolean LIZIZ;
    public GO3 LIZJ;
    public Context LIZLLL;
    public 1ib LJ;
    public 2Bo LJFF;
    public 2Bo LJI;
    public 1si LJII;
    public 1si LJIIIIZZ;
    public DataChannel LJIIIZ;
    public Long LJIIJ;
    public User LJIIJJI;
    public 2fc LJIIL;
    public int LJIILIIL;
    public View LJIILJJIL;
    public 1sp LJIILL;
    public final G1l<Integer> LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public final 0mk.a LJIJI;
    public final 0CH LJIJJ;
    public final 1d6 LJIJJLI;
    
    static {
        Covode.recordClassIndex(7643);
    }
    
    public 1QB(final 0mk.a ljiji, final 0CH ljijj, final 1d6 ljijjli) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        X/1QB.LJIJI:LX/0mj;
        //    15: aload_0        
        //    16: aload_2        
        //    17: putfield        X/1QB.LJIJJ:LX/0CH;
        //    20: aload_0        
        //    21: aload_3        
        //    22: putfield        X/1QB.LJIJJLI:LX/1d6;
        //    25: aload_0        
        //    26: bipush          8
        //    28: putfield        X/1QB.LJIILIIL:I
        //    31: aload_0        
        //    32: new             LX/1Q6;
        //    35: dup            
        //    36: aload_0        
        //    37: invokespecial   X/1Q6.<init>:(LX/1QB;)V
        //    40: putfield        X/1QB.LJIILLIIL:LX/G1l;
        //    43: return         
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
    
    private final void LJIIIIZZ() {
        if (this.LJIIZILJ) {
            final 2Bo ljff = this.LJFF;
            if (ljff != null) {
                GTi.LIZ((View)ljff, true);
            }
            final 1sp ljiill = this.LJIILL;
            if (ljiill != null) {
                GTi.LIZ((View)ljiill, true);
            }
        }
    }
    
    private final int LJIIIZ() {
        if (this.LJIIZILJ) {
            return 2131234473;
        }
        return 2131234472;
    }
    
    public final void LIZ() {
        final 2Bo ljff = this.LJFF;
        if (ljff != null) {
            ljff.setVisibility(0);
        }
        final Drawable lizj = 0cB.LIZJ(this.LJIIIZ());
        if (lizj != null) {
            GNY.LIZ(lizj);
            if (this.LJIIZILJ) {
                final 2Bo ljff2 = this.LJFF;
                if (ljff2 != null) {
                    ljff2.clearAnimation();
                }
                final 2Bo ljff3 = this.LJFF;
                if (ljff3 != null) {
                    ljff3.setBackgroundResource(0);
                }
                final 2Bo ljff4 = this.LJFF;
                if (ljff4 != null) {
                    ((SEd)ljff4).setImageDrawable((Drawable)null);
                }
                this.LJIIIIZZ();
                final 2Bo ljff5 = this.LJFF;
                if (ljff5 != null) {
                    ((SEd)ljff5).setImageDrawable((Drawable)new 1Iu(lizj));
                }
                return;
            }
            final 2Bo ljff6 = this.LJFF;
            if (ljff6 != null) {
                ljff6.clearAnimation();
            }
            final 2Bo ljff7 = this.LJFF;
            if (ljff7 != null) {
                ljff7.setBackgroundResource(0);
            }
            final 2Bo ljff8 = this.LJFF;
            if (ljff8 != null) {
                ((SEd)ljff8).setImageDrawable((Drawable)new 1Iu(lizj));
            }
        }
    }
    
    public final void LIZ(final int n) {
        final GO3 lizj = this.LIZJ;
        if (lizj != null) {
            Object value = null;
            if (n == 0) {
                if (!this.LJI()) {
                    return;
                }
                final boolean pluginAvailable = LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC);
                0xo.LIZJ("LinkMic_Plugin", "byteResult = ".concat(String.valueOf(pluginAvailable)));
                final IInteractService interactService = 0jR.LIZ(IInteractService.class);
                if (interactService != null && interactService.isInCoHost()) {
                    return;
                }
                if (!pluginAvailable) {
                    final 0yA liz = 1dP.LIZJ.LIZ();
                    if (liz == null || !liz.LIZ()) {
                        final StringBuilder sb = new StringBuilder("byteResult = ");
                        sb.append(pluginAvailable);
                        sb.append(' ');
                        0ba.LIZ(4, "FindCrashLog#ToolbarMultiGuestBehavior#setVisibility", sb.toString());
                        final 1dP.a lizj2 = 1dP.LIZJ;
                        final StringBuilder sb2 = new StringBuilder("not show guest entrance ");
                        final 0yA liz2 = 1dP.LIZJ.LIZ();
                        if (liz2 != null) {
                            value = liz2.LIZ();
                        }
                        sb2.append(value);
                        sb2.append(' ');
                        lizj2.LIZ(sb2.toString());
                        1mk.LIZ(this.LIZIZ);
                        if (!this.LIZIZ) {
                            1mk.LIZ("link_icon_show_error", "bundle");
                            return;
                        }
                        1mk.LIZ(2L, this.LJIJJLI.LIZ());
                        return;
                    }
                }
                this.LJII();
            }
            final 1dP.a lizj3 = 1dP.LIZJ;
            final StringBuilder sb3 = new StringBuilder("visible: ");
            sb3.append(n);
            sb3.append(" show guest entrance ");
            final 0yA liz3 = 1dP.LIZJ.LIZ();
            Boolean value2;
            if (liz3 != null) {
                value2 = liz3.LIZ();
            }
            else {
                value2 = null;
            }
            sb3.append(value2);
            sb3.append(' ');
            sb3.append(n.LIZ((Object)Looper.getMainLooper(), (Object)Looper.myLooper()));
            sb3.append(' ');
            lizj3.LIZ(sb3.toString());
            if (!this.LJIJJLI.LIZIZ && n == 0) {
                if (this.LIZIZ) {
                    1mk.LIZIZ(2L, this.LJIJJLI.LIZ());
                }
                this.LJIJJLI.LIZIZ = true;
            }
            lizj.LIZIZ(n);
            if (this.LIZIZ && n == 0 && !this.LJIJ) {
                this.LJIJ = true;
                0xy.LIZ("connecton_icon", false, false);
            }
            if (!this.LIZIZ) {
                final IToolbarService toolbarService = 0jR.LIZ(IToolbarService.class);
                GOI toolbarManager;
                if (toolbarService != null) {
                    toolbarManager = toolbarService.toolbarManager(this.LJIIIZ);
                }
                else {
                    toolbarManager = null;
                }
                if (n != 0) {
                    if (n == 8 && toolbarManager != null) {
                        toolbarManager.LIZIZ(GOJ.LINK_HOST, this.LJIIIZ);
                    }
                }
                else if (toolbarManager != null) {
                    toolbarManager.LIZ(GOJ.LINK_HOST, this.LJIIIZ);
                }
            }
            0ba.LIZ(4, "FindCrashLog#ToolbarMultiGuestBehavior#setVisibility", "it.visibility = ".concat(String.valueOf(n)));
            if (!this.LIZIZ && n == 0) {
                1mk.LIZ("link_icon_show", (String)null);
            }
        }
    }
    
    public final void LIZ(final GO3 lizj, final DataChannel ljiiiz) {
        public final class 1x7 extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ 1QB LIZ;
            
            static {
                Covode.recordClassIndex(7648);
            }
            
            public 1x7(final 1QB liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1x6 extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ 1QB LIZ;
            
            static {
                Covode.recordClassIndex(7647);
            }
            
            public 1x6(final 1QB liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: aload_2        
        //     7: putfield        X/1QB.LJIIIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        X/1QB.LIZJ:LX/GO3;
        //    15: aload_0        
        //    16: aload_1        
        //    17: invokeinterface X/GO3.LIZ:()Landroid/content/Context;
        //    22: putfield        X/1QB.LIZLLL:Landroid/content/Context;
        //    25: aload_2        
        //    26: ldc_w           LX/G5l;.class
        //    29: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    32: astore_3       
        //    33: aload_3        
        //    34: ifnonnull       40
        //    37: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //    40: aload_0        
        //    41: aload_3        
        //    42: checkcast       Ljava/lang/Boolean;
        //    45: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    48: putfield        X/1QB.LIZIZ:Z
        //    51: aload_0        
        //    52: aload_1        
        //    53: ldc_w           2131366758
        //    56: invokeinterface X/GO3.LIZ:(I)Landroid/view/View;
        //    61: checkcast       LX/2Bo;
        //    64: putfield        X/1QB.LJFF:LX/2Bo;
        //    67: aload_0        
        //    68: aload_1        
        //    69: ldc_w           2131367091
        //    72: invokeinterface X/GO3.LIZ:(I)Landroid/view/View;
        //    77: checkcast       LX/2Bo;
        //    80: putfield        X/1QB.LJI:LX/2Bo;
        //    83: aload_0        
        //    84: aload_1        
        //    85: ldc_w           2131366775
        //    88: invokeinterface X/GO3.LIZ:(I)Landroid/view/View;
        //    93: checkcast       LX/1si;
        //    96: putfield        X/1QB.LJII:LX/1si;
        //    99: aload_0        
        //   100: aload_1        
        //   101: ldc_w           2131366772
        //   104: invokeinterface X/GO3.LIZ:(I)Landroid/view/View;
        //   109: checkcast       LX/1si;
        //   112: putfield        X/1QB.LJIIIIZZ:LX/1si;
        //   115: aload_0        
        //   116: aload_1        
        //   117: ldc_w           2131370283
        //   120: invokeinterface X/GO3.LIZ:(I)Landroid/view/View;
        //   125: putfield        X/1QB.LJIILJJIL:Landroid/view/View;
        //   128: aload_1        
        //   129: ldc_w           2131374224
        //   132: invokeinterface X/GO3.LIZ:(I)Landroid/view/View;
        //   137: checkcast       LX/1ib;
        //   140: astore_3       
        //   141: aload_0        
        //   142: aload_3        
        //   143: putfield        X/1QB.LJ:LX/1ib;
        //   146: aload_3        
        //   147: ifnull          327
        //   150: aload_3        
        //   151: invokevirtual   X/1ib.getVisibility:()I
        //   154: istore          4
        //   156: aload_0        
        //   157: iload           4
        //   159: putfield        X/1QB.LJIILIIL:I
        //   162: aload_0        
        //   163: invokevirtual   X/1QB.LJII:()V
        //   166: aload_2        
        //   167: ldc_w           LX/G6o;.class
        //   170: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   173: checkcast       Ljava/lang/Boolean;
        //   176: astore_3       
        //   177: aload_3        
        //   178: ifnull          321
        //   181: aload_3        
        //   182: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   185: istore          5
        //   187: aload_0        
        //   188: iload           5
        //   190: putfield        X/1QB.LJIIZILJ:Z
        //   193: aload_0        
        //   194: getfield        X/1QB.LJFF:LX/2Bo;
        //   197: astore_3       
        //   198: aload_3        
        //   199: ifnull          210
        //   202: aload_3        
        //   203: aload_0        
        //   204: invokespecial   X/1QB.LJIIIZ:()I
        //   207: invokevirtual   X/SE3.setImageResource:(I)V
        //   210: aload_0        
        //   211: getfield        X/1QB.LJIIZILJ:Z
        //   214: ifeq            260
        //   217: aload_1        
        //   218: ldc_w           2131372442
        //   221: invokeinterface X/GO3.LIZ:(I)Landroid/view/View;
        //   226: checkcast       LX/1sp;
        //   229: astore_1       
        //   230: aload_1        
        //   231: ifnull          316
        //   234: aload_0        
        //   235: getfield        X/1QB.LIZIZ:Z
        //   238: ifeq            308
        //   241: ldc_w           2131831181
        //   244: istore          4
        //   246: aload_1        
        //   247: iload           4
        //   249: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   252: invokevirtual   X/1sp.setText:(Ljava/lang/CharSequence;)V
        //   255: aload_0        
        //   256: aload_1        
        //   257: putfield        X/1QB.LJIILL:LX/1sp;
        //   260: invokestatic    X/1NO.LIZ:()LX/1NO;
        //   263: aload_0        
        //   264: getfield        X/1QB.LJIILLIIL:LX/G1l;
        //   267: invokevirtual   X/G1k.LIZ:(LX/G1l;)V
        //   270: aload_2        
        //   271: aload_0        
        //   272: ldc_w           LX/2Gc;.class
        //   275: new             LX/1x6;
        //   278: dup            
        //   279: aload_0        
        //   280: invokespecial   X/1x6.<init>:(LX/1QB;)V
        //   283: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   286: pop            
        //   287: aload_2        
        //   288: aload_0        
        //   289: getfield        X/1QB.LJIJJ:LX/0CH;
        //   292: ldc_w           LX/2Ga;.class
        //   295: new             LX/1x7;
        //   298: dup            
        //   299: aload_0        
        //   300: invokespecial   X/1x7.<init>:(LX/1QB;)V
        //   303: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   306: pop            
        //   307: return         
        //   308: ldc_w           2131830848
        //   311: istore          4
        //   313: goto            246
        //   316: aconst_null    
        //   317: astore_1       
        //   318: goto            255
        //   321: iconst_0       
        //   322: istore          5
        //   324: goto            187
        //   327: bipush          8
        //   329: istore          4
        //   331: goto            156
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
    
    public final void LIZ(final boolean b) {
    }
    
    public final void LIZIZ() {
        final 2Bo ljff = this.LJFF;
        if (ljff != null) {
            ljff.setVisibility(0);
        }
        final int ljiiiz = this.LJIIIZ();
        if (this.LJIIZILJ) {
            final 2Bo ljff2 = this.LJFF;
            if (ljff2 != null) {
                ljff2.clearAnimation();
            }
            final 2Bo ljff3 = this.LJFF;
            if (ljff3 != null) {
                ljff3.setBackgroundResource(0);
            }
            final 2Bo ljff4 = this.LJFF;
            if (ljff4 != null) {
                ((SEd)ljff4).setImageDrawable((Drawable)null);
            }
            this.LJIIIIZZ();
            final 2Bo ljff5 = this.LJFF;
            if (ljff5 != null) {
                ljff5.setImageResource(ljiiiz);
            }
            return;
        }
        final 2Bo ljff6 = this.LJFF;
        if (ljff6 != null) {
            ljff6.clearAnimation();
        }
        final 2Bo ljff7 = this.LJFF;
        if (ljff7 != null) {
            ljff7.setBackgroundResource(0);
        }
        final 2Bo ljff8 = this.LJFF;
        if (ljff8 != null) {
            ljff8.setImageResource(ljiiiz);
        }
    }
    
    public final void LIZIZ(final GO3 go3, final DataChannel dataChannel) {
        CTM.LIZ((Object)go3, (Object)dataChannel);
        dataChannel.LIZIZ((Object)this);
        1NO.LIZ().LIZIZ((G1l)this.LJIILLIIL);
    }
    
    public final void LIZIZ(final boolean b) {
        if (b) {
            final 1ib lj = this.LJ;
            if (lj != null) {
                lj.setVisibility(this.LJIILIIL);
            }
            final 2Bo ljff = this.LJFF;
            if (ljff != null) {
                GlD.LIZJ((View)ljff);
            }
            return;
        }
        final 1ib lj2 = this.LJ;
        if (lj2 != null) {
            GlD.LIZ((View)lj2);
        }
        final 2Bo ljff2 = this.LJFF;
        if (ljff2 != null) {
            GlD.LIZ((View)ljff2);
        }
    }
    
    public final void LIZJ() {
    }
    
    public final void LIZLLL() {
    }
    
    public final boolean LJ() {
        if (H25.LJFF) {
            Hf4.LIZ(0cB.LJ(), "\u3010LocalTest\u3011 Ready to upload ALog!", 0L);
            final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostLog.class);
            n.LIZIZ((Object)liz, "");
            ((IHostLog)liz).LIZ();
            return true;
        }
        return false;
    }
    
    public final boolean LJFF() {
        return true;
    }
    
    public final boolean LJI() {
        return this.LIZ || !this.LIZIZ;
    }
    
    public final void LJII() {
        final View ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ljiiljjil.setVisibility(8);
        }
    }
    
    public final void onClick(final View view) {
        CTM.LIZ((Object)view);
        this.LJIJI.LIZLLL(this.LIZIZ);
        final Long ljiij = this.LJIIJ;
        if (ljiij != null && System.currentTimeMillis() - ljiij.longValue() < 10000L) {
            String idStr = null;
            this.LJIIJ = null;
            final 0uW lizj = 0uW.LIZJ;
            final User ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                idStr = ljiijji.getIdStr();
            }
            final User ljiijji2 = this.LJIIJJI;
            while (true) {
                Label_0118: {
                    if (ljiijji2 == null) {
                        break Label_0118;
                    }
                    final FollowInfo followInfo = ljiijji2.getFollowInfo();
                    if (followInfo == null || (int)followInfo.getFollowStatus() != 2) {
                        break Label_0118;
                    }
                    final boolean b = true;
                    lizj.LIZ(true, idStr, b);
                    return;
                }
                final boolean b = false;
                continue;
            }
        }
    }
}
