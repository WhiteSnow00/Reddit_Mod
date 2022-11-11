// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.LinkedHashMap;
import com.bytedance.covode.number.Covode;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.Map;

public final class 1ly implements 1cz
{
    public int LIZ;
    public Map<String, LinkPlayerInfo> LIZIZ;
    public String LIZJ;
    public 1NP LIZLLL;
    public Vuc LJ;
    public View LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public final CopyOnWriteArrayList<0xS> LJIIIZ;
    public final ConcurrentHashMap<String, 0xS> LJIIJ;
    public final HashMap<String, Boolean> LJIIJJI;
    public final HashMap<String, Integer> LJIIL;
    public long LJIILIIL;
    public FrameLayout LJIILJJIL;
    public final 5DO LJIILL;
    
    static {
        Covode.recordClassIndex(9041);
    }
    
    public 1ly(final CopyOnWriteArrayList<0xS> ljiiiz, final ConcurrentHashMap<String, 0xS> ljiij, final HashMap<String, Boolean> ljiijji, final HashMap<String, Integer> ljiil) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        X/1ly.LJIIIZ:Ljava/util/concurrent/CopyOnWriteArrayList;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        X/1ly.LJIIJ:Ljava/util/concurrent/ConcurrentHashMap;
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        X/1ly.LJIIJJI:Ljava/util/HashMap;
        //    19: aload_0        
        //    20: aload           4
        //    22: putfield        X/1ly.LJIIL:Ljava/util/HashMap;
        //    25: aload_0        
        //    26: iconst_1       
        //    27: putfield        X/1ly.LIZ:I
        //    30: aload_0        
        //    31: new             Ljava/util/LinkedHashMap;
        //    34: dup            
        //    35: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    38: putfield        X/1ly.LIZIZ:Ljava/util/Map;
        //    41: aload_0        
        //    42: getstatic       X/22d.LIZ:LX/22d;
        //    45: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    48: putfield        X/1ly.LJIILL:LX/5DO;
        //    51: aload_0        
        //    52: getstatic       X/Vuc.NORMAL:LX/Vuc;
        //    55: putfield        X/1ly.LJ:LX/Vuc;
        //    58: return         
        //    Signature:
        //  (Ljava/util/concurrent/CopyOnWriteArrayList<LX/0xS;>;Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;LX/0xS;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
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
    
    private final void LIZ(final Vva vva) {
        final FrameLayout ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil == null) {
            return;
        }
        final Rect containerActualRange = vva.getContainerActualRange();
        if (ljiiljjil.getWidth() > containerActualRange.right - containerActualRange.left) {
            final View ljii = this.LJII;
            final FrameLayout$LayoutParams frameLayout$LayoutParams = null;
            Object layoutParams;
            if (ljii != null) {
                layoutParams = ljii.getLayoutParams();
            }
            else {
                layoutParams = null;
            }
            Object o = layoutParams;
            if (!(layoutParams instanceof FrameLayout$LayoutParams)) {
                o = null;
            }
            final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)o;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = containerActualRange.top;
                layoutParams2.height = containerActualRange.height();
                layoutParams2.width = containerActualRange.left;
                final View ljii2 = this.LJII;
                if (ljii2 != null) {
                    ljii2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                }
                final View ljii3 = this.LJII;
                if (ljii3 != null) {
                    ljii3.setVisibility(0);
                }
            }
            final View ljiiiizz = this.LJIIIIZZ;
            Object layoutParams3;
            if (ljiiiizz != null) {
                layoutParams3 = ljiiiizz.getLayoutParams();
            }
            else {
                layoutParams3 = null;
            }
            if (!(layoutParams3 instanceof FrameLayout$LayoutParams)) {
                layoutParams3 = frameLayout$LayoutParams;
            }
            final FrameLayout$LayoutParams layoutParams4 = (FrameLayout$LayoutParams)layoutParams3;
            if (layoutParams4 != null) {
                layoutParams4.topMargin = containerActualRange.top;
                layoutParams4.height = containerActualRange.height();
                layoutParams4.width = ljiiljjil.getWidth() - containerActualRange.right;
                final View ljiiiizz2 = this.LJIIIIZZ;
                if (ljiiiizz2 != null) {
                    ljiiiizz2.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
                }
                final View ljiiiizz3 = this.LJIIIIZZ;
                if (ljiiiizz3 != null) {
                    ljiiiizz3.setVisibility(0);
                }
            }
        }
        final View ljff = this.LJFF;
        if (ljff != null) {
            final ViewGroup$LayoutParams layoutParams5 = ljff.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = containerActualRange.top;
                final View ljff2 = this.LJFF;
                if (ljff2 != null) {
                    ljff2.setLayoutParams(layoutParams5);
                }
                final View ljff3 = this.LJFF;
                if (ljff3 != null) {
                    ljff3.setVisibility(0);
                }
            }
        }
        final View lji = this.LJI;
        if (lji != null) {
            final ViewGroup$LayoutParams layoutParams6 = lji.getLayoutParams();
            if (layoutParams6 != null) {
                layoutParams6.height = ljiiljjil.getHeight() - containerActualRange.bottom;
                final View lji2 = this.LJI;
                if (lji2 != null) {
                    lji2.setLayoutParams(layoutParams6);
                }
                final View lji3 = this.LJI;
                if (lji3 != null) {
                    lji3.setVisibility(0);
                }
            }
        }
        final StringBuilder sb = new StringBuilder("empty view show: params=");
        sb.append(containerActualRange);
        sb.append(' ');
        sb.append(ljiiljjil.getWidth());
        sb.append(' ');
        sb.append(ljiiljjil.getHeight());
        sb.append(' ');
        sb.append(2vV.LIZIZ());
        sb.append(' ');
        sb.append(2vV.LIZ());
        this.LIZ(sb.toString());
    }
    
    private final void LIZ(final Vvh vvh, final boolean b) {
        public final class 22g extends F5g implements SRU<Vvh, Boolean, 1lx, 2P9>
        {
            public final /* synthetic */ 1ly LIZ;
            
            static {
                Covode.recordClassIndex(9047);
            }
            
            public 22g(final 1ly liz) {
                this.LIZ = liz;
                super(3);
            }
            
            public final void LIZ(final Vvh vvh, final boolean b, final 1lx 1lx) {
                CTM.LIZ((Object)vvh, (Object)1lx);
                if (1lx.LJIIJ) {
                    1lx.LIZJ = this.LIZ.LIZIZ.get(vvh.LIZIZ());
                    1lx.LIZ(this.LIZ.LJ);
                    1lx.LIZ(1lx, b, this.LIZ.LJ);
                }
            }
        }
        public final class 22f extends F5g implements SRT<Vvh, Boolean, 2P9>
        {
            public final /* synthetic */ 1ly LIZ;
            
            static {
                Covode.recordClassIndex(9046);
            }
            
            public 22f(final 1ly liz) {
                this.LIZ = liz;
                super(2);
            }
            
            public final void LIZ(final Vvh vvh, final boolean b) {
                MethodCollector.i(11576);
                CTM.LIZ((Object)vvh);
                String liziz;
                if ((liziz = vvh.LIZIZ()) == null) {
                    liziz = "";
                }
                final 1lx 1lx = new 1lx(liziz);
                vvh.LJ().removeAllViews();
                1lx.LIZIZ((ViewGroup)vvh.LJ());
                1lx.LIZJ = this.LIZ.LIZIZ.get(vvh.LIZIZ());
                1lx.LIZLLL = n.LIZ((Object)vvh.LIZIZ(), (Object)this.LIZ.LIZJ);
                1lx.LIZ(this.LIZ.LJ);
                1lx.LIZ(b, this.LIZ.LIZ, this.LIZ.LJ);
                while (true) {
                    for (final 0xS next : this.LIZ.LJIIIZ) {
                        if (n.LIZ((Object)next.LIZLLL(), (Object)vvh.LIZIZ())) {
                            final 0xS 0xS = next;
                            if (0xS != null) {
                                this.LIZ.LJIIIZ.remove(0xS);
                                this.LIZ.LJIIJ.remove(0xS.LIZLLL());
                            }
                            this.LIZ.LJIIIZ.add(1lx);
                            final String liziz2 = vvh.LIZIZ();
                            if (liziz2 != null) {
                                this.LIZ.LJIIJ.put(liziz2, 1lx);
                                MethodCollector.o(11576);
                                return;
                            }
                            MethodCollector.o(11576);
                            return;
                        }
                    }
                    0xS next = null;
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
        //     4: ldc             "showLinkMicWindow "
        //     6: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //     9: astore_3       
        //    10: aload_3        
        //    11: aload_1        
        //    12: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    15: pop            
        //    16: aload_3        
        //    17: ldc             ", "
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: pop            
        //    23: aload_3        
        //    24: iload_2        
        //    25: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    28: pop            
        //    29: aload_0        
        //    30: aload_3        
        //    31: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    34: invokevirtual   X/1ly.LIZ:(Ljava/lang/String;)V
        //    37: new             LX/22f;
        //    40: dup            
        //    41: aload_0        
        //    42: invokespecial   X/22f.<init>:(LX/1ly;)V
        //    45: astore          4
        //    47: new             LX/22g;
        //    50: dup            
        //    51: aload_0        
        //    52: invokespecial   X/22g.<init>:(LX/1ly;)V
        //    55: astore          5
        //    57: aload_0        
        //    58: getfield        X/1ly.LJIIIZ:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    61: astore          6
        //    63: new             Ljava/util/ArrayList;
        //    66: dup            
        //    67: invokespecial   java/util/ArrayList.<init>:()V
        //    70: astore_3       
        //    71: aload           6
        //    73: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    78: astore          7
        //    80: aload           7
        //    82: invokeinterface java/util/Iterator.hasNext:()Z
        //    87: ifeq            119
        //    90: aload           7
        //    92: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    97: astore          6
        //    99: aload           6
        //   101: instanceof      LX/1lx;
        //   104: ifeq            80
        //   107: aload_3        
        //   108: aload           6
        //   110: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   115: pop            
        //   116: goto            80
        //   119: aload_3        
        //   120: checkcast       Ljava/util/List;
        //   123: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   128: astore          7
        //   130: aload           7
        //   132: invokeinterface java/util/Iterator.hasNext:()Z
        //   137: ifeq            242
        //   140: aload           7
        //   142: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   147: astore_3       
        //   148: aload_3        
        //   149: checkcast       LX/1lx;
        //   152: astore          6
        //   154: aload           6
        //   156: getfield        X/1lx.LJII:Ljava/lang/String;
        //   159: aload_1        
        //   160: invokeinterface X/Vvh.LIZIZ:()Ljava/lang/String;
        //   165: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   168: ifeq            130
        //   171: aload           6
        //   173: getfield        X/0xS.LJIIJ:Z
        //   176: ifeq            130
        //   179: aload           6
        //   181: getfield        X/0xS.LJIIIZ:Landroid/view/ViewGroup;
        //   184: aload_1        
        //   185: invokeinterface X/Vvh.LJ:()Landroid/widget/FrameLayout;
        //   190: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   193: ifeq            130
        //   196: aload_3        
        //   197: checkcast       LX/1lx;
        //   200: astore_3       
        //   201: aload_3        
        //   202: ifnull          247
        //   205: aload           5
        //   207: aload_1        
        //   208: iload_2        
        //   209: aload_3        
        //   210: invokevirtual   X/22g.LIZ:(LX/Vvh;ZLX/1lx;)V
        //   213: new             Ljava/lang/StringBuilder;
        //   216: dup            
        //   217: ldc_w           "updateExistLinkMicWindow "
        //   220: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   223: astore_1       
        //   224: aload_1        
        //   225: aload_3        
        //   226: getfield        X/1lx.LJII:Ljava/lang/String;
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: pop            
        //   233: aload_0        
        //   234: aload_1        
        //   235: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   238: invokevirtual   X/1ly.LIZ:(Ljava/lang/String;)V
        //   241: return         
        //   242: aconst_null    
        //   243: astore_3       
        //   244: goto            196
        //   247: aload           4
        //   249: aload_1        
        //   250: iload_2        
        //   251: invokevirtual   X/22f.LIZ:(LX/Vvh;Z)V
        //   254: aload_0        
        //   255: ldc_w           "create LinkMic window"
        //   258: invokevirtual   X/1ly.LIZ:(Ljava/lang/String;)V
        //   261: return         
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
    
    private final void LIZIZ(final L76 l76) {
        final CopyOnWriteArrayList<0xS> ljiiiz = this.LJIIIZ;
        final ArrayList list = new ArrayList();
        for (final Object next : ljiiiz) {
            if (next instanceof 1lx) {
                list.add(next);
            }
        }
        final List list2 = list;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RjR.LIZJ(FJ4.LIZ(6Jd.LIZ((Iterable)list2, 10)), 16));
        for (final Object next2 : list2) {
            linkedHashMap.put((Object)((1lx)next2).LJII, next2);
        }
        final List lj = l76.LJ;
        if (lj != null) {
        Label_0293_Outer:
            for (final L77 l77 : lj) {
                n.LIZIZ((Object)l77, "");
                if (l77.LIZ() != null && l77.LJIILL) {
                    final 1lx 1lx = (1lx)linkedHashMap.get(l77.LIZ());
                    if (1lx == null) {
                        continue;
                    }
                    final int ljiijji = l77.LJIIJJI;
                    if (1lx.LJI) {
                        final 0r4 lj2 = 1lx.LJ();
                        if (lj2 != null && (boolean)lj2.LIZ(ljiijji)) {
                            final 0y9 liz = 0y9.LIZ;
                            final 0y9.a liz2 = liz.LIZ("viewer");
                            final LinkPlayerInfo lizj = 1lx.LIZJ;
                            while (true) {
                                Label_0344: {
                                    if (lizj == null) {
                                        break Label_0344;
                                    }
                                    final User lizj2 = lizj.LIZJ;
                                    if (lizj2 == null) {
                                        break Label_0344;
                                    }
                                    final long id = lizj2.getId();
                                    String s;
                                    if (1lx.LIZLLL) {
                                        s = "anchor";
                                    }
                                    else {
                                        s = "guest";
                                    }
                                    liz2.LIZ(id, s);
                                    CTM.LIZ((Object)"feed_card");
                                    liz2.LIZJ = "feed_card";
                                    liz.LIZ(liz2);
                                    continue Label_0293_Outer;
                                }
                                final long id = 0L;
                                continue;
                            }
                        }
                        continue;
                    }
                    else {
                        final 0r4 lj3 = 1lx.LJ();
                        if (lj3 != null) {
                            lj3.LIZ = true;
                        }
                        final 1si ljff = 1lx.LJFF;
                        if (ljff == null) {
                            continue;
                        }
                        GlD.LIZ((View)ljff);
                    }
                }
            }
        }
    }
    
    private final void LIZJ(final L76 l76) {
        final List lj = l76.LJ;
        if (lj != null) {
            for (final L77 l77 : lj) {
                n.LIZIZ((Object)l77, "");
                if (l77.LIZ() != null && (n.LIZ((Object)this.LJIIJJI.get(l77.LIZ()), (Object)l77.LJIILL) ^ true)) {
                    0xS value;
                    if (!((value = this.LJIIJ.get(l77.LIZ())) instanceof 1lx)) {
                        value = null;
                    }
                    final 1lx 1lx = (1lx)value;
                    if (1lx == null) {
                        continue;
                    }
                    X.1lx.LIZ(1lx, l77.LJIILL, this.LJ);
                    final HashMap<String, Boolean> ljiijji = this.LJIIJJI;
                    final String liz = l77.LIZ();
                    n.LIZIZ((Object)liz, "");
                    ljiijji.put(liz, l77.LJIILL);
                }
            }
        }
    }
    
    private final void LIZLLL() {
        final CopyOnWriteArrayList<0xS> ljiiiz = this.LJIIIZ;
        final ArrayList list = new ArrayList();
        for (final Object next : ljiiiz) {
            if (next.getClass().isAssignableFrom(1XS.class)) {
                list.add(next);
            }
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList();
        for (final Object next2 : list2) {
            if (next2 instanceof 1XS) {
                list3.add(next2);
            }
        }
        final Iterator iterator3 = list3.iterator();
        while (iterator3.hasNext()) {
            ((1XS)iterator3.next()).LIZIZ();
        }
    }
    
    private final void LIZLLL(final L76 l76) {
        final HashMap hashMap = new HashMap();
        final List lj = l76.LJ;
        boolean b = false;
        int i = 0;
        if (lj != null) {
            final int size = lj.size();
            b = false;
            while (i < size) {
                final L77 l77 = lj.get(i);
                n.LIZIZ((Object)l77, "");
                final String liz = l77.LIZ();
                n.LIZIZ((Object)liz, "");
                hashMap.put(liz, l77.LJIILIIL);
                if (!this.LJIIL.containsKey(l77.LIZ())) {
                    b = true;
                }
                ++i;
            }
        }
        this.LJIIL.putAll(hashMap);
        if (b) {
            final 1NP lizlll = this.LIZLLL;
            if (lizlll == null) {
                return;
            }
            final Long liz2 = lizlll.LIZ;
            if (liz2 != null) {
                liz2.longValue();
                final 1NP lizlll2 = this.LIZLLL;
                if (lizlll2 != null) {
                    final Long liziz = lizlll2.LIZIZ;
                    if (liziz != null) {
                        liziz.longValue();
                        this.LIZ("onLinkListhChange");
                        final long ljiiliil = this.LJIILIIL;
                        final long n = 0L;
                        Label_0392: {
                            if (ljiiliil != 0L) {
                                final 1NP lizlll3 = this.LIZLLL;
                                if (lizlll3 != null) {
                                    final Long liz3 = lizlll3.LIZ;
                                    if (liz3 != null) {
                                        if (liz3 == 0L) {
                                            break Label_0392;
                                        }
                                    }
                                }
                                final 1NP lizlll4 = this.LIZLLL;
                                if (lizlll4 != null) {
                                    final Long liziz2 = lizlll4.LIZIZ;
                                    if (liziz2 != null && liziz2 == 0L) {
                                        break Label_0392;
                                    }
                                }
                                final MultiLiveApi multiLiveApi = 0yr.LIZ().LIZ(MultiLiveApi.class);
                                final 1NP lizlll5 = this.LIZLLL;
                                while (true) {
                                    Label_0365: {
                                        if (lizlll5 == null) {
                                            break Label_0365;
                                        }
                                        final Long liz4 = lizlll5.LIZ;
                                        if (liz4 == null) {
                                            break Label_0365;
                                        }
                                        final long longValue = liz4;
                                        final 1NP lizlll6 = this.LIZLLL;
                                        long longValue2 = n;
                                        if (lizlll6 != null) {
                                            final Long liziz3 = lizlll6.LIZIZ;
                                            longValue2 = n;
                                            if (liziz3 != null) {
                                                longValue2 = liziz3;
                                            }
                                        }
                                        final 2fc liz5 = multiLiveApi.getListByType(longValue, longValue2, this.LJIILIIL, 1, 1).LIZ((FCC)new FC5()).LIZ((2d6)new 1XT(this), (2d6)new 1XU(this));
                                        kotlin.jvm.internal.n.LIZIZ((Object)liz5, "");
                                        GTi.LIZ(liz5, this.LIZ());
                                        return;
                                    }
                                    final long longValue = 0L;
                                    continue;
                                }
                            }
                        }
                        final StringBuilder sb = new StringBuilder("onLInkListChange return ");
                        sb.append(this.LJIILIIL);
                        sb.append(' ');
                        sb.append(this.LIZLLL);
                        this.LIZ(sb.toString());
                    }
                }
            }
        }
    }
    
    private final void LJ() {
        final CopyOnWriteArrayList<0xS> ljiiiz = this.LJIIIZ;
        final ArrayList list = new ArrayList();
        for (final Object next : ljiiiz) {
            if (next.getClass().isAssignableFrom(1XS.class)) {
                list.add(next);
            }
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList();
        for (final Object next2 : list2) {
            if (next2 instanceof 1XS) {
                list3.add(next2);
            }
        }
        final Iterator iterator3 = list3.iterator();
        while (iterator3.hasNext()) {
            ((1XS)iterator3.next()).LIZJ();
        }
    }
    
    public final FH6 LIZ() {
        return (FH6)this.LJIILL.getValue();
    }
    
    @Override
    public final void LIZ(final L76 l76) {
        CTM.LIZ((Object)l76);
        final String lizlll = l76.LIZLLL;
        while (true) {
            Label_0163: {
                if (lizlll == null) {
                    break Label_0163;
                }
                final Long lji = 353.LJI(lizlll);
                if (lji == null) {
                    break Label_0163;
                }
                final long longValue = lji;
                this.LJIILIIL = longValue;
                this.LIZJ = l76.LJIIJ;
                final int lji2 = l76.LJI;
                final int liz = this.LIZ;
                if (lji2 != liz) {
                    final int lji3 = l76.LJI;
                    this.LIZ = lji3;
                    final StringBuilder sb = new StringBuilder("onLinkConditionChange ");
                    sb.append(liz);
                    sb.append(' ');
                    sb.append(lji3);
                    this.LIZ(sb.toString());
                    if (liz != lji3) {
                        if (lji3 == 3) {
                            this.LJ();
                        }
                        else if (liz == 3 && lji3 != 3) {
                            this.LIZLLL();
                        }
                    }
                }
                this.LIZLLL(l76);
                this.LIZJ(l76);
                this.LIZIZ(l76);
                return;
            }
            final long longValue = 0L;
            continue;
        }
    }
    
    @Override
    public final void LIZ(final FrameLayout ljiiljjil) {
        MethodCollector.i(8569);
        CTM.LIZ((Object)ljiiljjil);
        this.LJIILJJIL = ljiiljjil;
        final 1NP lizlll = this.LIZLLL;
        Context lizj = null;
        if (lizlll != null) {
            lizj = lizlll.LIZJ;
        }
        final FrameLayout ljiiljjil2 = this.LJIILJJIL;
        Context context;
        if ((context = lizj) == null && (ljiiljjil2 == null || (context = ljiiljjil2.getContext()) == null)) {
            MethodCollector.o(8569);
            return;
        }
        if (ljiiljjil2 == null) {
            MethodCollector.o(8569);
            return;
        }
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(0, 0);
        frameLayout$LayoutParams.gravity = 8388659;
        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = new FrameLayout$LayoutParams(-1, 0);
        frameLayout$LayoutParams2.gravity = 48;
        final FrameLayout$LayoutParams frameLayout$LayoutParams3 = new FrameLayout$LayoutParams(0, 0);
        frameLayout$LayoutParams3.gravity = 8388661;
        final FrameLayout$LayoutParams frameLayout$LayoutParams4 = new FrameLayout$LayoutParams(-1, 0);
        frameLayout$LayoutParams4.gravity = 80;
        final View ljii = this.LJII;
        if (ljii != null) {
            0sM.LIZ(ljii);
        }
        final View ljii2 = new View(context);
        ljii2.setId(2131367529);
        ljii2.setVisibility(8);
        ljii2.setBackgroundColor(-16777216);
        ljiiljjil2.addView(ljii2, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.LJII = ljii2;
        final View ljff = this.LJFF;
        if (ljff != null) {
            0sM.LIZ(ljff);
        }
        final View ljff2 = new View(context);
        ljff2.setId(2131372500);
        ljff2.setVisibility(8);
        ljff2.setBackgroundColor(-16777216);
        ljiiljjil2.addView(ljff2, (ViewGroup$LayoutParams)frameLayout$LayoutParams2);
        this.LJFF = ljff2;
        final View ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            0sM.LIZ(ljiiiizz);
        }
        final View ljiiiizz2 = new View(context);
        ljiiiizz2.setId(2131370505);
        ljiiiizz2.setVisibility(8);
        ljiiiizz2.setBackgroundColor(-16777216);
        ljiiljjil2.addView(ljiiiizz2, (ViewGroup$LayoutParams)frameLayout$LayoutParams3);
        this.LJIIIIZZ = ljiiiizz2;
        final View lji = this.LJI;
        if (lji != null) {
            0sM.LIZ(lji);
        }
        final View lji2 = new View(context);
        lji2.setId(2131362936);
        lji2.setVisibility(8);
        lji2.setBackgroundColor(-16777216);
        ljiiljjil2.addView(lji2, (ViewGroup$LayoutParams)frameLayout$LayoutParams4);
        this.LJI = lji2;
        MethodCollector.o(8569);
    }
    
    public final void LIZ(final String s) {
        0ba.LIZ(3, "qiuyihao_test_MultiGuestV3FeedMaskWindowHandler", s);
    }
    
    @Override
    public final void LIZIZ() {
        public final class 22e extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1ly LIZ;
            
            static {
                Covode.recordClassIndex(9045);
            }
            
            public 22e(final 1ly liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   X/22e.<init>:(LX/1ly;)V
        //     8: invokestatic    X/GTi.LIZ:(LX/QgG;)V
        //    11: return         
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
    
    public final void LIZJ() {
        final View ljii = this.LJII;
        if (ljii != null) {
            ljii.setVisibility(8);
        }
        final View ljff = this.LJFF;
        if (ljff != null) {
            ljff.setVisibility(8);
        }
        final View ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.setVisibility(8);
        }
        final View lji = this.LJI;
        if (lji != null) {
            lji.setVisibility(8);
        }
    }
    
    public final void onLayoutSwitch(final Vva vva, int n) {
        CTM.LIZ((Object)vva);
        this.LIZ("onLayoutSwitch, layout ".concat(String.valueOf(vva)));
        if (vva.getLayoutName() == null) {
            return;
        }
        final String layoutName = vva.getLayoutName();
        Boolean value;
        if (layoutName != null) {
            value = Vui.LIZ(layoutName);
        }
        else {
            value = null;
        }
        if (GTi.LIZIZ(value)) {
            return;
        }
        String s;
        if ((s = vva.getLayoutName()) == null) {
            s = Vuc.NORMAL.name();
        }
        final Vuc value2 = Vuc.valueOf(s);
        this.LJ = value2;
        n = 0sw.LIZ[value2.ordinal()];
        if (n == 1) {
            this.LIZ(vva);
            return;
        }
        if (n == 2) {
            this.LIZ(vva);
            return;
        }
        if (n != 3) {
            if (n != 4) {
                this.LJ = Vuc.NORMAL;
            }
            else if (this.LJIILJJIL != null) {
                if (vva.getAllLayoutWindows().size() == 1) {
                    this.LIZJ();
                    return;
                }
                this.LIZ(vva);
            }
            return;
        }
        this.LIZJ();
    }
    
    public final void onLayoutWindowUpdate(final Vva vva, final int n) {
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
    }
    
    public final void onPlayerRangeCalculateFinish(final Vva vva) {
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
    }
    
    public final void onPreLayoutSwitch(final Vva vva) {
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
        CTM.LIZ((Object)vva);
        if (vva.getLayoutName() == null) {
            return;
        }
        final String layoutName = vva.getLayoutName();
        Boolean value;
        if (layoutName != null) {
            value = Vui.LIZ(layoutName);
        }
        else {
            value = null;
        }
        if (GTi.LIZIZ(value)) {
            return;
        }
        String s;
        if ((s = vva.getLayoutName()) == null) {
            s = Vuc.NORMAL.name();
        }
        this.LJ = Vuc.valueOf(s);
    }
    
    public final void onSeiBattleIdUpdated(final long n) {
    }
    
    public final void onUserJoinedForHost(final Vwg vwg) {
        CTM.LIZ((Object)vwg);
        CTM.LIZ((Object)vwg);
        CTM.LIZ((Object)vwg);
    }
    
    public final void onWindowStateChanged(final Vvh vvh, Vv3 lizj, final Vv3 vv3, final PZ3 pz3, final 2XZ 2xz) {
        MethodCollector.i(8574);
        CTM.LIZ((Object)vvh, (Object)lizj, (Object)vv3, (Object)pz3);
        final StringBuilder sb = new StringBuilder("onWindowStateChange ");
        sb.append(vvh);
        sb.append(' ');
        sb.append(lizj);
        sb.append(' ');
        sb.append(vv3);
        this.LIZ(sb.toString());
        lizj = vvh.LIZJ();
        switch (0sw.LIZIZ[lizj.ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6: {
                if (2xz != null && Boolean.valueOf(2xz.LIZJ) != null && vvh.LIZIZ() != null) {
                    final String liziz = vvh.LIZIZ();
                    if (liziz != null) {
                        this.LJIIJJI.put(liziz, 2xz.LIZJ);
                    }
                    this.LIZ(vvh, 2xz.LIZJ);
                    MethodCollector.o(8574);
                    return;
                }
                final StringBuilder sb2 = new StringBuilder("extra == null ");
                sb2.append(vvh);
                sb2.append(", do nothing.");
                this.LIZ(sb2.toString());
                break;
            }
            case 1:
            case 2: {
                final StringBuilder sb3 = new StringBuilder("showEmpty mask condition = ");
                sb3.append(this.LIZ);
                this.LIZ(sb3.toString());
                final 1XS 1xs = new 1XS();
                vvh.LJ().removeAllViews();
                1xs.LIZIZ((ViewGroup)vvh.LJ());
                if (this.LIZ == 3) {
                    1xs.LIZJ();
                }
                else {
                    1xs.LIZIZ();
                }
                this.LJIIIZ.add(1xs);
                MethodCollector.o(8574);
                return;
            }
        }
        MethodCollector.o(8574);
    }
}
