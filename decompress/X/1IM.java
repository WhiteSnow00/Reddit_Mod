// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import android.text.TextUtils;
import android.os.Looper;
import java.util.Set;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect$AudioGraphBean;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Map;
import java.util.List;

public final class 1im implements 1JQ
{
    public static final 5DO LIZIZ;
    public static final a LIZJ;
    public 0gU LIZ;
    public String LIZLLL;
    public String LJ;
    public final List<0g7> LJFF;
    public final List<0g6> LJI;
    public final List<0hK> LJII;
    public final List<0hK> LJIIIIZZ;
    public final List<0hK> LJIIIZ;
    public final Map<String, List<LiveEffect>> LJIIJ;
    public final ArrayList<0hK> LJIIJJI;
    public boolean LJIIL;
    public final 5DO LJIILIIL;
    
    static {
        Covode.recordClassIndex(6158);
        LIZJ = new a((byte)0);
        LIZIZ = 3Os.LIZ(3Oq.SYNCHRONIZED, (QgG)1sq.LIZ);
    }
    
    public 1im() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/concurrent/CopyOnWriteArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/concurrent/CopyOnWriteArrayList.<init>:()V
        //    12: putfield        X/1im.LJFF:Ljava/util/List;
        //    15: aload_0        
        //    16: new             Ljava/util/ArrayList;
        //    19: dup            
        //    20: invokespecial   java/util/ArrayList.<init>:()V
        //    23: putfield        X/1im.LJI:Ljava/util/List;
        //    26: aload_0        
        //    27: new             Ljava/util/ArrayList;
        //    30: dup            
        //    31: invokespecial   java/util/ArrayList.<init>:()V
        //    34: putfield        X/1im.LJII:Ljava/util/List;
        //    37: aload_0        
        //    38: new             Ljava/util/ArrayList;
        //    41: dup            
        //    42: invokespecial   java/util/ArrayList.<init>:()V
        //    45: putfield        X/1im.LJIIIIZZ:Ljava/util/List;
        //    48: aload_0        
        //    49: new             Ljava/util/ArrayList;
        //    52: dup            
        //    53: invokespecial   java/util/ArrayList.<init>:()V
        //    56: putfield        X/1im.LJIIIZ:Ljava/util/List;
        //    59: aload_0        
        //    60: new             Ljava/util/HashMap;
        //    63: dup            
        //    64: invokespecial   java/util/HashMap.<init>:()V
        //    67: putfield        X/1im.LJIIJ:Ljava/util/Map;
        //    70: aload_0        
        //    71: new             Ljava/util/ArrayList;
        //    74: dup            
        //    75: invokespecial   java/util/ArrayList.<init>:()V
        //    78: putfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //    81: aload_0        
        //    82: iconst_1       
        //    83: putfield        X/1im.LJIIL:Z
        //    86: aload_0        
        //    87: getstatic       X/1sr.LIZ:LX/1sr;
        //    90: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    93: putfield        X/1im.LJIILIIL:LX/5DO;
        //    96: return         
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
    
    public static /* synthetic */ 0hK LIZ(final 1im 1im, final String s, final LiveEffect liveEffect, boolean b, final int n) {
        if ((n & 0x8) != 0x0) {
            b = true;
        }
        return 1im.LIZ(s, liveEffect, false, b, null);
    }
    
    private final 0hK LIZ(final String s, final LiveEffect liveEffect, final boolean b) {
        if (this.LIZ == null) {
            return null;
        }
        while (true) {
            for (final 0hK next : this.LJII) {
                if (n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId())) {
                    final 0hK 0hK = next;
                    if (0hK == null) {
                        return null;
                    }
                    this.LJII.remove(0hK);
                    final 0gU liz = this.LIZ;
                    List<String> lj;
                    if (liz == null || (lj = liz.LJ) == null) {
                        lj = new ArrayList<String>();
                    }
                    if (lj.contains(0hK.LIZ)) {
                        0hK.LJII = false;
                        this.LJII.add(0hK);
                    }
                    if (b) {
                        this.LIZIZ(true);
                    }
                    final Iterator<Object> iterator2 = this.LJFF.iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().LIZ(false, s, liveEffect);
                    }
                    return 0hK;
                }
            }
            0hK next = null;
            continue;
        }
    }
    
    private final LiveEffect LIZ(final 0hK 0hK) {
        final List list = this.LJIIJ.get(0hK.LIZ);
        LiveEffect liveEffect = null;
        final LiveEffect liveEffect2 = null;
        if (list != null) {
            final Iterator iterator = list.iterator();
            Object next;
            do {
                next = liveEffect2;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
            } while (!n.LIZ((Object)((LiveEffect)next).getResourceId(), (Object)0hK.LIZIZ));
            liveEffect = (LiveEffect)next;
        }
        return liveEffect;
    }
    
    private final ArrayList<0hL> LIZ(final LiveEffect liveEffect, final List<0hL> list) {
        final ArrayList list2 = new ArrayList();
        list2.addAll(list);
        final List composerConfigList = liveEffect.composerConfigList;
        final ArrayList list3 = new ArrayList();
    Label_0037:
        for (final Object next : composerConfigList) {
            final Gaz gaz = (Gaz)next;
            for (final Object next2 : list2) {
                final 0hL 0hL = (0hL)next2;
                if (n.LIZ((Object)0hL.LIZJ, (Object)gaz.LIZJ) && 0hL.LIZ != null) {
                    if (next2 == null) {
                        break;
                    }
                    continue Label_0037;
                }
            }
            list3.add(next);
        }
        for (final Gaz gaz2 : list3) {
            final Iterator iterator4 = list2.iterator();
            n.LIZIZ((Object)iterator4, "");
            while (iterator4.hasNext()) {
                if (n.LIZ((Object)((0hL)iterator4.next()).LIZJ, (Object)gaz2.LIZJ)) {
                    iterator4.remove();
                }
            }
            final 0hL 0hL2 = new 0hL(gaz2.LIZJ);
            0hL2.LIZ = 0g3.LIZ(gaz2, gaz2.LJII);
            0hL2.LIZ(liveEffect.getResourceId());
            list2.add(0hL2);
        }
        final ArrayList updateKeys = liveEffect.updateKeys;
        final ArrayList list4 = new ArrayList();
        Label_0295:
        for (final Object next3 : updateKeys) {
            for (final Object next4 : list2) {
                if (n.LIZ((Object)((0hL)next4).LIZJ, next3)) {
                    if (next4 == null) {
                        break;
                    }
                    continue Label_0295;
                }
            }
            list4.add(next3);
        }
        final Iterator iterator7 = list4.iterator();
        while (iterator7.hasNext()) {
            list2.add(new 0hL((String)iterator7.next()));
        }
        return list2;
    }
    
    private final void LIZ(final List<0hK> list) {
        final 0g3 liz = 0g3.LIZ;
        final boolean b = false;
        final String[] liz2 = liz.LIZ(list, false);
        final String[] liz3 = 0g3.LIZ.LIZ(this.LJIIJ, liz2);
        int n = 0;
        Label_0096: {
            if (list instanceof Collection) {
                n = (b ? 1 : 0);
                if (list.isEmpty()) {
                    break Label_0096;
                }
            }
            final Iterator<Object> iterator = list.iterator();
            do {
                n = (b ? 1 : 0);
                if (iterator.hasNext()) {
                    continue;
                }
                break Label_0096;
            } while (!kotlin.jvm.internal.n.LIZ((Object)iterator.next().LJIIIIZZ, (Object)true));
            n = 1;
        }
        this.LIZIZ(list);
        if (n != 0) {
            final 0gU liz4 = this.LIZ;
            if (liz4 != null) {
                final 0g5 lizj = liz4.LIZJ;
                if (lizj != null) {
                    lizj.LIZLLL(liz2, liz3);
                }
            }
        }
        else {
            final 0gU liz5 = this.LIZ;
            if (liz5 != null) {
                final 0g5 lizj2 = liz5.LIZJ;
                if (lizj2 != null) {
                    lizj2.LIZJ(liz2, liz3);
                }
            }
        }
        0ba.LIZ(3, "LiveComposerManagerB", "add composer node with extra: ".concat(String.valueOf(liz2)));
    }
    
    private final boolean LIZ(final List<Integer> list, final List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (list2.contains(((Number)iterator.next()).intValue())) {
                return true;
            }
        }
        return false;
    }
    
    private final void LIZIZ(final String s, final boolean b) {
        final 0gU liz = this.LIZ;
        if (liz == null) {
            return;
        }
        if (liz.LIZJ != null) {
            try {
                final 0gU liz2 = this.LIZ;
                if (liz2 != null) {
                    final 0g5 lizj = liz2.LIZJ;
                    if (lizj != null) {
                        lizj.LIZ(new String[0]);
                    }
                }
                final 0gU liz3 = this.LIZ;
                if (liz3 != null) {
                    final 0g5 lizj2 = liz3.LIZJ;
                    if (lizj2 != null) {
                        lizj2.LIZ();
                    }
                }
            }
            finally {
                final Throwable t;
                0ba.LIZ("LiveComposerManagerB", t);
            }
        }
        if (this.LJIIL) {
            final 0gU liz4 = this.LIZ;
            String ljff = s;
            if (liz4 != null) {
                ljff = liz4.LJFF;
                if (ljff == null) {
                    ljff = s;
                }
            }
            n.LIZIZ((Object)ljff, "");
            this.LIZ(ljff, b);
        }
        this.LJII.clear();
        this.LJIIJ.clear();
        this.LJFF.clear();
        this.LJI.clear();
        this.LJIIIIZZ.clear();
        this.LJIIJJI.clear();
        this.LIZ = null;
    }
    
    private final void LIZIZ(final List<0hK> list) {
        final Iterator iterator = 6Jd.LIZIZ((Iterable)this.LJIIJ.values()).iterator();
        Object next;
        int n;
        do {
            final boolean hasNext = iterator.hasNext();
            n = 1;
            if (!hasNext) {
                next = null;
                break;
            }
            next = iterator.next();
        } while (((LiveEffect)next).quiz.length() <= 0);
        final LiveEffect liveEffect = (LiveEffect)next;
        if (liveEffect != null && (!(list instanceof Collection) || !list.isEmpty())) {
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                if (kotlin.jvm.internal.n.LIZ((Object)liveEffect.getResourceId(), (Object)iterator2.next().LIZIZ)) {
                    final String liz = 1Kj.LIZIZ.LIZ(liveEffect);
                    if (liz.length() <= 0) {
                        n = 0;
                    }
                    if (n != 0) {
                        0fx.LIZ.LIZ().LIZ("quiz", liz);
                        return;
                    }
                    0fx.LIZ.LIZ().LIZ("quiz", "");
                    break;
                }
            }
        }
    }
    
    private final void LIZIZ(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_0        
        //     3: monitorenter   
        //     4: sipush          4902
        //     7: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    10: getstatic       X/0gX.LIZ:LX/0gX;
        //    13: astore_3       
        //    14: new             Ljava/lang/StringBuilder;
        //    17: astore          4
        //    19: aload           4
        //    21: ldc_w           "show sticker: "
        //    24: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    27: aload           4
        //    29: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    35: pop            
        //    36: aload_3        
        //    37: aload           4
        //    39: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    42: invokevirtual   X/0gX.LIZ:(Ljava/lang/String;)V
        //    45: aload_2        
        //    46: getfield        X/1im.LIZ:LX/0gU;
        //    49: ifnonnull       61
        //    52: sipush          4902
        //    55: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    58: aload_0        
        //    59: monitorexit    
        //    60: return         
        //    61: new             Ljava/util/ArrayList;
        //    64: astore          4
        //    66: aload           4
        //    68: invokespecial   java/util/ArrayList.<init>:()V
        //    71: new             Ljava/util/ArrayList;
        //    74: astore_3       
        //    75: aload_3        
        //    76: invokespecial   java/util/ArrayList.<init>:()V
        //    79: aload_2        
        //    80: getfield        X/1im.LIZ:LX/0gU;
        //    83: astore          5
        //    85: aload           5
        //    87: ifnull          430
        //    90: aload           5
        //    92: getfield        X/0gU.LIZ:Ljava/util/List;
        //    95: astore          5
        //    97: aload           5
        //    99: ifnull          430
        //   102: aload           5
        //   104: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   109: astore          5
        //   111: iconst_0       
        //   112: istore          6
        //   114: iload           6
        //   116: istore          7
        //   118: aload           5
        //   120: invokeinterface java/util/Iterator.hasNext:()Z
        //   125: ifeq            433
        //   128: aload           5
        //   130: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   135: checkcast       LX/0g4;
        //   138: astore          8
        //   140: aload_2        
        //   141: getfield        X/1im.LJII:Ljava/util/List;
        //   144: astore          9
        //   146: new             Ljava/util/ArrayList;
        //   149: astore          10
        //   151: aload           10
        //   153: invokespecial   java/util/ArrayList.<init>:()V
        //   156: aload           9
        //   158: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   163: astore          9
        //   165: aload           9
        //   167: invokeinterface java/util/Iterator.hasNext:()Z
        //   172: ifeq            306
        //   175: aload           9
        //   177: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   182: astore          11
        //   184: aload           11
        //   186: checkcast       LX/0hK;
        //   189: astore          12
        //   191: aload           12
        //   193: getfield        X/0hK.LJIIIZ:Ljava/lang/String;
        //   196: astore          13
        //   198: aload           13
        //   200: ifnull          279
        //   203: aload           13
        //   205: ldc_w           "beauty"
        //   208: iconst_0       
        //   209: invokestatic    kotlin/n/y.LIZIZ:(Ljava/lang/String;Ljava/lang/String;Z)Z
        //   212: iconst_1       
        //   213: if_icmpne       279
        //   216: aload           12
        //   218: getfield        X/0hK.LIZ:Ljava/lang/String;
        //   221: aload           8
        //   223: getfield        X/0g4.LIZIZ:Ljava/lang/String;
        //   226: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   229: ifeq            165
        //   232: aload           12
        //   234: getfield        X/0hK.LJII:Z
        //   237: ifeq            165
        //   240: getstatic       X/GST.LJJII:LX/44V;
        //   243: astore          13
        //   245: aload           13
        //   247: ldc             ""
        //   249: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   252: aload           13
        //   254: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   257: checkcast       Ljava/lang/Boolean;
        //   260: invokestatic    X/GTi.LIZIZ:(Ljava/lang/Boolean;)Z
        //   263: ifeq            165
        //   266: aload           10
        //   268: aload           11
        //   270: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   275: pop            
        //   276: goto            165
        //   279: aload           12
        //   281: getfield        X/0hK.LIZ:Ljava/lang/String;
        //   284: aload           8
        //   286: getfield        X/0g4.LIZIZ:Ljava/lang/String;
        //   289: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   292: ifeq            165
        //   295: aload           12
        //   297: getfield        X/0hK.LJII:Z
        //   300: ifeq            165
        //   303: goto            266
        //   306: aload           10
        //   308: checkcast       Ljava/util/List;
        //   311: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   316: astore          8
        //   318: iload           6
        //   320: istore          7
        //   322: iload           7
        //   324: istore          6
        //   326: aload           8
        //   328: invokeinterface java/util/Iterator.hasNext:()Z
        //   333: ifeq            114
        //   336: aload           8
        //   338: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   343: checkcast       LX/0hK;
        //   346: astore          10
        //   348: aload_2        
        //   349: aload_3        
        //   350: aload           10
        //   352: getfield        X/0hK.LJFF:Ljava/util/List;
        //   355: invokespecial   X/1im.LIZ:(Ljava/util/List;Ljava/util/List;)Z
        //   358: ifeq            322
        //   361: aload_3        
        //   362: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   365: ifeq            381
        //   368: aload_3        
        //   369: aload           10
        //   371: getfield        X/0hK.LJFF:Ljava/util/List;
        //   374: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   377: pop            
        //   378: goto            391
        //   381: aload_3        
        //   382: aload           10
        //   384: getfield        X/0hK.LJFF:Ljava/util/List;
        //   387: invokevirtual   java/util/ArrayList.retainAll:(Ljava/util/Collection;)Z
        //   390: pop            
        //   391: iload           7
        //   393: istore          6
        //   395: iload           7
        //   397: ifne            415
        //   400: iload           7
        //   402: istore          6
        //   404: aload           10
        //   406: getfield        X/0hK.LIZLLL:Z
        //   409: ifeq            415
        //   412: iconst_1       
        //   413: istore          6
        //   415: aload           4
        //   417: aload           10
        //   419: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   422: pop            
        //   423: iload           6
        //   425: istore          7
        //   427: goto            322
        //   430: iconst_0       
        //   431: istore          7
        //   433: aload_2        
        //   434: getfield        X/1im.LJIIIIZZ:Ljava/util/List;
        //   437: invokeinterface java/util/List.clear:()V
        //   442: aload_2        
        //   443: getfield        X/1im.LJIIIIZZ:Ljava/util/List;
        //   446: aload           4
        //   448: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   453: pop            
        //   454: getstatic       X/0gX.LIZ:LX/0gX;
        //   457: astore_3       
        //   458: aload_3        
        //   459: ldc_w           "LiveComposerManagerB"
        //   462: invokevirtual   X/0gX.LIZIZ:(Ljava/lang/String;)LX/0gX;
        //   465: pop            
        //   466: aload_3        
        //   467: ldc_w           "showSticker"
        //   470: invokevirtual   X/0gX.LIZJ:(Ljava/lang/String;)LX/0gX;
        //   473: pop            
        //   474: aload_3        
        //   475: aload_2        
        //   476: getfield        X/1im.LJIIIIZZ:Ljava/util/List;
        //   479: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   482: invokevirtual   X/0gX.LIZ:(Ljava/lang/String;)V
        //   485: getstatic       X/0g3.LIZ:LX/0g3;
        //   488: aload_2        
        //   489: getfield        X/1im.LJIIIIZZ:Ljava/util/List;
        //   492: invokevirtual   X/0g3.LIZJ:(Ljava/util/List;)Ljava/util/List;
        //   495: astore_2       
        //   496: new             Ljava/util/ArrayList;
        //   499: astore          9
        //   501: aload           9
        //   503: invokespecial   java/util/ArrayList.<init>:()V
        //   506: aload_2        
        //   507: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   512: astore          11
        //   514: aload           11
        //   516: invokeinterface java/util/Iterator.hasNext:()Z
        //   521: ifeq            638
        //   524: aload           11
        //   526: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   531: astore          10
        //   533: aload           10
        //   535: checkcast       LX/0hK;
        //   538: astore          5
        //   540: aload_0        
        //   541: getfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //   544: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   549: astore_3       
        //   550: aload_3        
        //   551: invokeinterface java/util/Iterator.hasNext:()Z
        //   556: ifeq            635
        //   559: aload_3        
        //   560: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   565: astore          8
        //   567: aload           8
        //   569: checkcast       LX/0hK;
        //   572: astore          4
        //   574: aload           4
        //   576: getfield        X/0hK.LIZIZ:Ljava/lang/String;
        //   579: aload           5
        //   581: getfield        X/0hK.LIZIZ:Ljava/lang/String;
        //   584: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   587: ifeq            550
        //   590: aload           4
        //   592: getfield        X/0hK.LJ:J
        //   595: aload           5
        //   597: getfield        X/0hK.LJ:J
        //   600: lcmp           
        //   601: ifeq            550
        //   604: aload           5
        //   606: getfield        X/0hK.LIZ:Ljava/lang/String;
        //   609: invokestatic    X/0gZ.LIZ:()Ljava/lang/String;
        //   612: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   615: iconst_1       
        //   616: ixor           
        //   617: ifeq            550
        //   620: aload           8
        //   622: ifnull          635
        //   625: aload           9
        //   627: aload           10
        //   629: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   634: pop            
        //   635: goto            514
        //   638: aload           9
        //   640: checkcast       Ljava/util/List;
        //   643: astore_3       
        //   644: new             Ljava/util/ArrayList;
        //   647: astore          9
        //   649: aload           9
        //   651: invokespecial   java/util/ArrayList.<init>:()V
        //   654: aload_2        
        //   655: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   660: astore          11
        //   662: aload           11
        //   664: invokeinterface java/util/Iterator.hasNext:()Z
        //   669: ifeq            755
        //   672: aload           11
        //   674: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   679: astore          5
        //   681: aload           5
        //   683: checkcast       LX/0hK;
        //   686: astore          4
        //   688: aload_0        
        //   689: getfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //   692: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   697: astore          10
        //   699: aload           10
        //   701: invokeinterface java/util/Iterator.hasNext:()Z
        //   706: ifeq            742
        //   709: aload           10
        //   711: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   716: astore          8
        //   718: aload           8
        //   720: checkcast       LX/0hK;
        //   723: getfield        X/0hK.LIZIZ:Ljava/lang/String;
        //   726: aload           4
        //   728: getfield        X/0hK.LIZIZ:Ljava/lang/String;
        //   731: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   734: ifeq            699
        //   737: aload           8
        //   739: ifnonnull       662
        //   742: aload           9
        //   744: aload           5
        //   746: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   751: pop            
        //   752: goto            662
        //   755: aload           9
        //   757: checkcast       Ljava/util/List;
        //   760: astore          4
        //   762: aload_0        
        //   763: getfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //   766: astore          10
        //   768: new             Ljava/util/ArrayList;
        //   771: astore          5
        //   773: aload           5
        //   775: invokespecial   java/util/ArrayList.<init>:()V
        //   778: aload           10
        //   780: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   785: astore          13
        //   787: aload           13
        //   789: invokeinterface java/util/Iterator.hasNext:()Z
        //   794: ifeq            881
        //   797: aload           13
        //   799: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   804: astore          11
        //   806: aload           11
        //   808: checkcast       LX/0hK;
        //   811: astore          8
        //   813: aload_2        
        //   814: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   819: astore          9
        //   821: aload           9
        //   823: invokeinterface java/util/Iterator.hasNext:()Z
        //   828: ifeq            868
        //   831: aload           9
        //   833: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   838: astore          12
        //   840: aload           12
        //   842: checkcast       LX/0hK;
        //   845: astore          10
        //   847: aload           8
        //   849: getfield        X/0hK.LIZIZ:Ljava/lang/String;
        //   852: aload           10
        //   854: getfield        X/0hK.LIZIZ:Ljava/lang/String;
        //   857: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   860: ifeq            821
        //   863: aload           12
        //   865: ifnonnull       787
        //   868: aload           5
        //   870: aload           11
        //   872: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   877: pop            
        //   878: goto            787
        //   881: aload           5
        //   883: checkcast       Ljava/util/List;
        //   886: astore          5
        //   888: aload_0        
        //   889: getfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //   892: invokevirtual   java/util/ArrayList.clear:()V
        //   895: aload_2        
        //   896: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   901: astore          8
        //   903: aload           8
        //   905: invokeinterface java/util/Iterator.hasNext:()Z
        //   910: ifeq            954
        //   913: aload           8
        //   915: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   920: checkcast       LX/0hK;
        //   923: astore          9
        //   925: aload_0        
        //   926: getfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //   929: astore          10
        //   931: new             LX/0hK;
        //   934: astore          11
        //   936: aload           11
        //   938: aload           9
        //   940: invokespecial   X/0hK.<init>:(LX/0hK;)V
        //   943: aload           10
        //   945: aload           11
        //   947: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   950: pop            
        //   951: goto            903
        //   954: iload_1        
        //   955: ifne            967
        //   958: sipush          4902
        //   961: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   964: aload_0        
        //   965: monitorexit    
        //   966: return         
        //   967: aload_0        
        //   968: getfield        X/1im.LIZ:LX/0gU;
        //   971: astore          10
        //   973: aload           10
        //   975: ifnull          999
        //   978: aload           10
        //   980: getfield        X/0gU.LIZJ:LX/0g5;
        //   983: astore          10
        //   985: aload           10
        //   987: ifnull          999
        //   990: aload           10
        //   992: iload           7
        //   994: invokeinterface X/0g5.LIZ:(Z)V
        //   999: aload           4
        //  1001: invokeinterface java/util/Collection.isEmpty:()Z
        //  1006: iconst_1       
        //  1007: ixor           
        //  1008: ifeq            1306
        //  1011: getstatic       X/0g3.LIZ:LX/0g3;
        //  1014: aload           4
        //  1016: invokevirtual   X/0g3.LIZ:(Ljava/util/List;)Ljava/util/List;
        //  1019: astore          10
        //  1021: aload           10
        //  1023: invokeinterface java/util/List.isEmpty:()Z
        //  1028: ifeq            1266
        //  1031: aload_0        
        //  1032: aload           4
        //  1034: invokespecial   X/1im.LIZ:(Ljava/util/List;)V
        //  1037: getstatic       X/1KD.LJFF:LX/0hB;
        //  1040: invokevirtual   X/0hB.LIZ:()LX/1KD;
        //  1043: getfield        X/1KD.LIZ:Ljava/util/List;
        //  1046: astore          4
        //  1048: getstatic       X/GST.LJIIZILJ:LX/44V;
        //  1051: astore          10
        //  1053: aload           10
        //  1055: ldc             ""
        //  1057: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1060: aload           10
        //  1062: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //  1065: checkcast       Ljava/lang/Integer;
        //  1068: astore          10
        //  1070: aload           10
        //  1072: invokevirtual   java/lang/Integer.intValue:()I
        //  1075: iflt            1136
        //  1078: aload           10
        //  1080: invokevirtual   java/lang/Integer.intValue:()I
        //  1083: aload           4
        //  1085: invokeinterface java/util/List.size:()I
        //  1090: if_icmpge       1136
        //  1093: aload           10
        //  1095: ldc             ""
        //  1097: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1100: aload           4
        //  1102: aload           10
        //  1104: invokevirtual   java/lang/Integer.intValue:()I
        //  1107: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1112: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //  1115: invokevirtual   com/bytedance/android/livesdkapi/depend/model/LiveEffect.getResourceId:()Ljava/lang/String;
        //  1118: ldc_w           "0"
        //  1121: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1124: ifeq            1136
        //  1127: getstatic       X/1KD.LJFF:LX/0hB;
        //  1130: invokevirtual   X/0hB.LIZ:()LX/1KD;
        //  1133: invokevirtual   X/1KD.LIZJ:()V
        //  1136: aload_3        
        //  1137: invokeinterface java/util/Collection.isEmpty:()Z
        //  1142: iconst_1       
        //  1143: ixor           
        //  1144: ifeq            1152
        //  1147: aload_0        
        //  1148: aload_3        
        //  1149: invokespecial   X/1im.LIZ:(Ljava/util/List;)V
        //  1152: aload           5
        //  1154: invokeinterface java/util/Collection.isEmpty:()Z
        //  1159: iconst_1       
        //  1160: ixor           
        //  1161: ifeq            1205
        //  1164: getstatic       X/0g3.LIZ:LX/0g3;
        //  1167: aload           5
        //  1169: iconst_1       
        //  1170: invokevirtual   X/0g3.LIZ:(Ljava/util/List;Z)[Ljava/lang/String;
        //  1173: astore_3       
        //  1174: aload_0        
        //  1175: getfield        X/1im.LIZ:LX/0gU;
        //  1178: astore          4
        //  1180: aload           4
        //  1182: ifnull          1205
        //  1185: aload           4
        //  1187: getfield        X/0gU.LIZJ:LX/0g5;
        //  1190: astore          4
        //  1192: aload           4
        //  1194: ifnull          1205
        //  1197: aload           4
        //  1199: aload_3        
        //  1200: invokeinterface X/0g5.LIZIZ:([Ljava/lang/String;)V
        //  1205: aload_0        
        //  1206: getfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //  1209: invokevirtual   java/util/ArrayList.clear:()V
        //  1212: aload_2        
        //  1213: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1218: astore          4
        //  1220: aload           4
        //  1222: invokeinterface java/util/Iterator.hasNext:()Z
        //  1227: ifeq            1313
        //  1230: aload           4
        //  1232: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1237: checkcast       LX/0hK;
        //  1240: astore_2       
        //  1241: aload_0        
        //  1242: getfield        X/1im.LJIIJJI:Ljava/util/ArrayList;
        //  1245: astore          5
        //  1247: new             LX/0hK;
        //  1250: astore_3       
        //  1251: aload_3        
        //  1252: aload_2        
        //  1253: invokespecial   X/0hK.<init>:(LX/0hK;)V
        //  1256: aload           5
        //  1258: aload_3        
        //  1259: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1262: pop            
        //  1263: goto            1220
        //  1266: aload_0        
        //  1267: aload           10
        //  1269: invokespecial   X/1im.LIZ:(Ljava/util/List;)V
        //  1272: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveComposerFilterSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveComposerFilterSetting;
        //  1275: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveComposerFilterSetting.isComposerSupported:()Z
        //  1278: ifne            1287
        //  1281: getstatic       X/0hE.LIZ:LX/1KJ;
        //  1284: invokevirtual   X/1KJ.LIZIZ:()V
        //  1287: aload_0        
        //  1288: invokespecial   X/1im.LJIIIIZZ:()V
        //  1291: aload_0        
        //  1292: getstatic       X/0g3.LIZ:LX/0g3;
        //  1295: aload           4
        //  1297: invokevirtual   X/0g3.LIZIZ:(Ljava/util/List;)Ljava/util/List;
        //  1300: invokespecial   X/1im.LIZ:(Ljava/util/List;)V
        //  1303: goto            1037
        //  1306: aload_0        
        //  1307: invokespecial   X/1im.LJIIIIZZ:()V
        //  1310: goto            1037
        //  1313: sipush          4902
        //  1316: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //  1319: aload_0        
        //  1320: monitorexit    
        //  1321: return         
        //  1322: astore_2       
        //  1323: goto            1331
        //  1326: astore_2       
        //  1327: goto            1331
        //  1330: astore_2       
        //  1331: aload_0        
        //  1332: monitorexit    
        //  1333: aload_2        
        //  1334: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  4      58     1326   1330   Any
        //  61     85     1326   1330   Any
        //  90     97     1326   1330   Any
        //  102    111    1326   1330   Any
        //  118    165    1326   1330   Any
        //  165    198    1326   1330   Any
        //  203    266    1326   1330   Any
        //  266    276    1326   1330   Any
        //  279    303    1326   1330   Any
        //  306    318    1326   1330   Any
        //  326    378    1326   1330   Any
        //  381    391    1326   1330   Any
        //  404    412    1326   1330   Any
        //  415    423    1326   1330   Any
        //  433    514    1326   1330   Any
        //  514    524    1326   1330   Any
        //  524    550    1330   1331   Any
        //  550    620    1330   1331   Any
        //  625    635    1330   1331   Any
        //  638    662    1330   1331   Any
        //  662    688    1330   1331   Any
        //  688    699    1322   1326   Any
        //  699    737    1322   1326   Any
        //  742    752    1322   1326   Any
        //  755    787    1322   1326   Any
        //  787    821    1322   1326   Any
        //  821    863    1322   1326   Any
        //  868    878    1322   1326   Any
        //  881    903    1322   1326   Any
        //  903    951    1322   1326   Any
        //  958    964    1322   1326   Any
        //  967    973    1322   1326   Any
        //  978    985    1322   1326   Any
        //  990    999    1322   1326   Any
        //  999    1037   1322   1326   Any
        //  1037   1136   1322   1326   Any
        //  1136   1152   1322   1326   Any
        //  1152   1180   1322   1326   Any
        //  1185   1192   1322   1326   Any
        //  1197   1205   1322   1326   Any
        //  1205   1220   1322   1326   Any
        //  1220   1263   1322   1326   Any
        //  1266   1287   1322   1326   Any
        //  1287   1303   1322   1326   Any
        //  1306   1310   1322   1326   Any
        //  1313   1319   1322   1326   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0550:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    private final void LJ(final String s, final LiveEffect liveEffect) {
        if (0iM.LIZ(liveEffect)) {
            final List subStickers = liveEffect.subStickers;
            if (subStickers != null) {
                final Iterator iterator = subStickers.iterator();
                while (iterator.hasNext()) {
                    this.LJ(s, (LiveEffect)iterator.next());
                }
            }
            return;
        }
        final Iterator<Object> iterator2 = this.LJIIIZ.iterator();
        0hK next;
        do {
            final boolean hasNext = iterator2.hasNext();
            next = null;
            if (!hasNext) {
                break;
            }
            next = iterator2.next();
        } while (!n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId()));
        final 0hK 0hK = next;
        if (0hK != null) {
            final Iterator<Object> iterator3 = 0hK.LJI.iterator();
            while (iterator3.hasNext()) {
                liveEffect.updateKeys.add(iterator3.next().LIZJ);
            }
            for (final 0hL next2 : 0hK.LJI) {
                if (next2.LIZ != null) {
                    if (next2 != null) {
                        this.LIZ(s, liveEffect, false, 0hK.LJII, 0hK.LJ);
                        final List<0hL> lji = 0hK.LJI;
                        final ArrayList list = new ArrayList();
                        for (final 0hL next3 : lji) {
                            if (next3.LIZ != null) {
                                list.add(next3);
                            }
                        }
                        for (final 0hL 0hL : list) {
                            final String lizj = 0hL.LIZJ;
                            final Float liz = 0hL.LIZ;
                            float floatValue;
                            if (liz != null) {
                                floatValue = liz;
                            }
                            else {
                                floatValue = 0.0f;
                            }
                            this.LIZ(s, liveEffect, lizj, floatValue, 0hK.LJ);
                        }
                        return;
                    }
                    break;
                }
            }
            this.LIZ(s, liveEffect, 0hK.LJII, 0hK.LJII, 0hK.LJ);
        }
    }
    
    private final void LJFF(final String s, final LiveEffect liveEffect) {
        if (this.LIZ == null) {
            return;
        }
        if (liveEffect.coexistGroup.isEmpty()) {
            final 0gU liz = this.LIZ;
            if (liz != null) {
                final List<0g4> liz2 = liz.LIZ;
                if (liz2 != null) {
                    final ArrayList list = new ArrayList();
                    for (final 0g4 next : liz2) {
                        if (n.LIZ((Object)next.LIZIZ, (Object)s)) {
                            list.add(next);
                        }
                    }
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        liveEffect.coexistGroup.addAll(((0g4)iterator2.next()).LIZ);
                    }
                }
            }
        }
        Label_0191: {
            if (liveEffect.isWithoutFace == null) {
                final 0gU liz3 = this.LIZ;
                while (true) {
                    Label_0257: {
                        if (liz3 == null) {
                            break Label_0257;
                        }
                        final List<String> lizlll = liz3.LIZLLL;
                        if (lizlll == null) {
                            break Label_0257;
                        }
                        final boolean contains = lizlll.contains(s);
                        liveEffect.isWithoutFace = contains;
                        break Label_0191;
                    }
                    final boolean contains = false;
                    continue;
                }
            }
        }
        if (!this.LJIIJ.containsKey(s)) {
            this.LJIIJ.put(s, new ArrayList<LiveEffect>());
        }
        final List list2 = this.LJIIJ.get(s);
        if (list2 != null) {
            list2.remove(liveEffect);
            list2.add(liveEffect);
        }
    }
    
    private final 0fy LJII() {
        return (0fy)this.LJIILIIL.getValue();
    }
    
    private final void LJIIIIZZ() {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            final 44V ljijj = GST.LJIJJ;
            final String s = "";
            n.LIZIZ((Object)ljijj, "");
            if (!(boolean)((44T)ljijj).LIZ()) {
                final List<LiveEffect> liz = 1KD.LJFF.LIZ().LIZ;
                final String liz2 = 0gZ.LIZ();
                final 44V ljiizilj = GST.LJIIZILJ;
                n.LIZIZ((Object)ljiizilj, "");
                final Integer n = (Integer)((44T)ljiizilj).LIZ();
                if (n >= 0 && n < liz.size()) {
                    final 44V ljijj2 = GST.LJIJJ;
                    kotlin.jvm.internal.n.LIZIZ((Object)ljijj2, "");
                    ((44T)ljijj2).LIZ((Object)true);
                    kotlin.jvm.internal.n.LIZIZ((Object)n, "");
                    final LiveEffect liveEffect = liz.get(n);
                    final 44V ljiji = GST.LJIJI;
                    kotlin.jvm.internal.n.LIZIZ((Object)ljiji, "");
                    ((44T)ljiji).LIZ((Object)liveEffect.getResourceId());
                    final float lizlll = 1KD.LJFF.LIZ().LIZLLL(liveEffect);
                    kotlin.jvm.internal.n.LIZIZ((Object)liz2, "");
                    final 44V llliiii = GST.LLLIIII;
                    kotlin.jvm.internal.n.LIZIZ((Object)llliiii, "");
                    this.LIZ(liz2, liveEffect, false, true, (Long)((44T)llliiii).LIZ());
                    final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
                    String lizj = s;
                    if (smallItemConfig != null) {
                        lizj = smallItemConfig.LIZJ;
                        if (lizj == null) {
                            lizj = s;
                        }
                    }
                    b.LIZ(this, liz2, liveEffect, lizj, lizlll);
                }
            }
        }
    }
    
    public final 0hK LIZ(final String s, final LiveEffect liveEffect, final boolean b, final boolean b2, final Long n) {
        final 0gU liz = this.LIZ;
        final Boolean b3 = null;
        if (liz == null) {
            return null;
        }
        this.LJFF(s, liveEffect);
        while (true) {
            for (final 0hK next : this.LJII) {
                if (n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId())) {
                    final 0hK 0hK = next;
                    0hK 0hK2;
                    if (0hK != null) {
                        if (0hK.LJII == b2 && n == null) {
                            return 0hK;
                        }
                        this.LJII.remove(0hK);
                        final ArrayList<0hL> liz2 = this.LIZ(liveEffect, 0hK.LJI);
                        0hK.LJI.clear();
                        0hK.LJI.addAll(liz2);
                        long lj;
                        if (n != null) {
                            lj = n;
                        }
                        else {
                            lj = System.currentTimeMillis();
                        }
                        0hK.LJ = lj;
                        0hK.LJII = b2;
                        this.LJII.add(0hK);
                        0hK2 = 0hK;
                    }
                    else {
                        final String resourceId = liveEffect.getResourceId();
                        final String unzipPath = liveEffect.unzipPath;
                        final Boolean isWithoutFace = liveEffect.isWithoutFace;
                        if (isWithoutFace == null) {
                            n.LIZIZ();
                        }
                        final boolean booleanValue = isWithoutFace;
                        long n2;
                        if (n != null) {
                            n2 = n;
                        }
                        else {
                            n2 = System.currentTimeMillis();
                        }
                        final 0hK 0hK3 = new 0hK(s, resourceId, unzipPath, booleanValue, n2);
                        0hK3.LJIIIZ = liveEffect.effectPanelKey;
                        0hK3.LJII = b2;
                        final GbB sdkExtraModel = liveEffect.sdkExtraModel;
                        Boolean value = b3;
                        if (sdkExtraModel != null) {
                            final LiveEffect$AudioGraphBean liziz = sdkExtraModel.LIZIZ;
                            value = b3;
                            if (liziz != null) {
                                value = liziz.getUseOutput();
                            }
                        }
                        0hK3.LJIIIIZZ = value;
                        0hK3.LJFF.addAll(liveEffect.coexistGroup);
                        final ArrayList<0hL> liz3 = this.LIZ(liveEffect, 0hK3.LJI);
                        0hK3.LJI.clear();
                        0hK3.LJI.addAll(liz3);
                        this.LJII.add(0hK3);
                        0hK2 = 0hK3;
                    }
                    if (b) {
                        this.LIZIZ(true);
                    }
                    final Iterator<Object> iterator2 = this.LJFF.iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().LIZ(true, s, liveEffect);
                    }
                    return 0hK2;
                }
            }
            0hK next = null;
            continue;
        }
    }
    
    @Override
    public final Map<String, Map<String, LiveEffect>> LIZ() {
        final HashMap hashMap = new HashMap();
        final List<0hK> ljii = this.LJII;
        final ArrayList list = new ArrayList();
        for (final 0hK next : ljii) {
            final 0hK 0hK = next;
            if (this.LJIIJ.containsKey(0hK.LIZ) && 0hK.LJII) {
                list.add(next);
            }
        }
    Label_0099:
        for (final 0hK 0hK2 : list) {
            if (!hashMap.containsKey(0hK2.LIZ)) {
                hashMap.put(0hK2.LIZ, new HashMap());
            }
            final Object value = hashMap.get(0hK2.LIZ);
            if (value == null) {
                n.LIZIZ();
            }
            final Map map = (Map)value;
            if (!map.containsKey(0hK2.LIZIZ)) {
                final List list2 = this.LJIIJ.get(0hK2.LIZ);
                if (list2 != null) {
                    while (true) {
                        for (final Object next2 : list2) {
                            if (n.LIZ((Object)((LiveEffect)next2).getResourceId(), (Object)0hK2.LIZIZ)) {
                                final LiveEffect liveEffect = (LiveEffect)next2;
                                if (liveEffect != null) {
                                    map.put(liveEffect.getResourceId(), liveEffect);
                                    continue Label_0099;
                                }
                                continue Label_0099;
                            }
                        }
                        Object next2 = null;
                        continue;
                    }
                }
                continue;
            }
        }
        return hashMap;
    }
    
    @Override
    public final void LIZ(final 0g6 0g6) {
        CTM.LIZ((Object)0g6);
        if (!this.LJI.contains(0g6)) {
            this.LJI.add(0g6);
        }
    }
    
    @Override
    public final void LIZ(final 0g7 0g7) {
        CTM.LIZ((Object)0g7);
        if (!this.LJFF.contains(0g7)) {
            this.LJFF.add(0g7);
        }
    }
    
    @Override
    public final void LIZ(final 0gU liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        if (liz.LJI) {
            String ljff;
            if ((ljff = liz.LJFF) == null) {
                ljff = "broadcast";
            }
            n.LIZIZ((Object)ljff, "");
            CTM.LIZ((Object)ljff);
            final 0fy ljii = this.LJII();
            final 0gU liz2 = this.LIZ;
            String ljff2;
            if (liz2 == null || (ljff2 = liz2.LJFF) == null) {
                ljff2 = ljff;
            }
            n.LIZIZ((Object)ljff2, "");
            final List<0hK> liz3 = ljii.LIZ(ljff2);
            final ArrayList list = new ArrayList();
            for (final 0hK next : liz3) {
                final 0hK 0hK = next;
                final 0gU liz4 = this.LIZ;
                if (liz4 != null) {
                    final List<String> liziz = liz4.LIZIZ;
                    if (liziz == null || !liziz.contains(0hK.LIZ)) {
                        continue;
                    }
                    list.add(next);
                }
            }
            List list2;
            if ((list2 = list).isEmpty()) {
                final Set<String> liz5 = 0fu.LIZ.LIZ(ljff);
                final List<0hK> liz6 = this.LJII().LIZ();
                final ArrayList list3 = new ArrayList();
                for (final 0hK next2 : liz6) {
                    if (liz5.contains(next2.LIZ)) {
                        list3.add(next2);
                    }
                }
                list2 = list3;
            }
            List list4 = list2;
            if (LiveBeautyReverseExperiment.INSTANCE.isInV3()) {
                list4 = list2;
                if (n.LIZ((Object)ljff, (Object)"broadcast")) {
                    final List<0hK> liz7 = this.LJII().LIZ();
                    final ArrayList list5 = new ArrayList();
                    for (final 0hK next3 : liz7) {
                        final 0hK 0hK2 = next3;
                        final 0gU liz8 = this.LIZ;
                        if (liz8 != null) {
                            final List<String> liziz2 = liz8.LIZIZ;
                            if (liziz2 == null || !liziz2.contains(0hK2.LIZ) || !(n.LIZ((Object)0hK2.LIZ, (Object)0gZ.LIZLLL) ^ true)) {
                                continue;
                            }
                            list5.add(next3);
                        }
                    }
                    list4 = list5;
                }
            }
            final List<0hK> ljiiiz = this.LJIIIZ;
            ljiiiz.clear();
            ljiiiz.addAll(list4);
        }
    }
    
    @Override
    public final void LIZ(final LiveEffect liveEffect, final String s, final float n) {
        CTM.LIZ((Object)liveEffect, (Object)s);
        final 0gU liz = this.LIZ;
        if (liz != null && liz.LIZJ != null) {
            final 0gU liz2 = this.LIZ;
            if (liz2 != null) {
                final 0g5 lizj = liz2.LIZJ;
                if (lizj != null) {
                    lizj.LIZ(liveEffect.unzipPath, s, n);
                }
            }
        }
        while (true) {
            for (final 0hK next : this.LJII) {
                if (n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId())) {
                    final 0hK 0hK = next;
                    if (0hK != null) {
                    Label_0131:
                        for (final Gaz gaz : liveEffect.composerConfigList) {
                            if (!(n.LIZ((Object)gaz.LIZJ, (Object)s) ^ true)) {
                                final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
                                int lizlll = 0;
                                int lj;
                                if (smallItemConfig != null) {
                                    lj = smallItemConfig.LJ;
                                }
                                else {
                                    lj = 0;
                                }
                                final Gaz smallItemConfig2 = liveEffect.getSmallItemConfig();
                                if (smallItemConfig2 != null) {
                                    lizlll = smallItemConfig2.LIZLLL;
                                }
                                final int liz3 = 0g3.LIZ(lizlll, lj, n);
                                gaz.LJI = liz3;
                                while (true) {
                                    for (final 0hL next2 : 0hK.LJI) {
                                        if (n.LIZ((Object)gaz.LIZJ, (Object)next2.LIZJ)) {
                                            final 0hL 0hL = next2;
                                            if (0hL != null) {
                                                0hL.LIZ = 0g3.LIZ(lizlll, lj, liz3);
                                                continue Label_0131;
                                            }
                                            continue Label_0131;
                                        }
                                    }
                                    0hL next2 = null;
                                    continue;
                                }
                            }
                        }
                        0hK.LJ = System.currentTimeMillis();
                    }
                    return;
                }
            }
            0hK next = null;
            continue;
        }
    }
    
    @Override
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final List<0hK> ljii = this.LJII;
        final ArrayList list = new ArrayList();
        for (final 0hK next : ljii) {
            if (n.LIZ((Object)next.LIZ, (Object)s)) {
                list.add(next);
            }
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add((Object)this.LIZ((0hK)iterator2.next()));
        }
        for (final LiveEffect liveEffect : list3) {
            if (liveEffect != null) {
                this.LIZ(s, liveEffect, true);
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final LiveEffect liveEffect) {
        public final class 0fw implements Runnable
        {
            public final /* synthetic */ 1im LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ LiveEffect LIZJ;
            
            static {
                Covode.recordClassIndex(6161);
            }
            
            public 0fw(final 1im liz, final String liziz, final LiveEffect lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            @Override
            public final void run() {
                this.LIZ.LIZ(this.LIZIZ, this.LIZJ, true, true, System.currentTimeMillis());
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //     8: astore_3       
        //     9: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    12: astore          4
        //    14: aload           4
        //    16: ldc             ""
        //    18: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload_3        
        //    22: aload           4
        //    24: invokevirtual   android/os/Looper.getThread:()Ljava/lang/Thread;
        //    27: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    30: iconst_1       
        //    31: ixor           
        //    32: ifeq            56
        //    35: getstatic       X/F8V.LIZ:LX/FFV;
        //    38: invokestatic    X/F8U.LIZ:(LX/FFV;)LX/FFV;
        //    41: new             LX/0fw;
        //    44: dup            
        //    45: aload_0        
        //    46: aload_1        
        //    47: aload_2        
        //    48: invokespecial   X/0fw.<init>:(LX/1im;Ljava/lang/String;Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;)V
        //    51: invokevirtual   X/FFV.LIZ:(Ljava/lang/Runnable;)LX/2fc;
        //    54: pop            
        //    55: return         
        //    56: aload_0        
        //    57: aload_1        
        //    58: aload_2        
        //    59: iconst_1       
        //    60: iconst_1       
        //    61: invokestatic    java/lang/System.currentTimeMillis:()J
        //    64: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    67: invokevirtual   X/1im.LIZ:(Ljava/lang/String;Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;ZZLjava/lang/Long;)LX/0hK;
        //    70: pop            
        //    71: return         
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
    public final void LIZ(final String s, final LiveEffect liveEffect, final int lji) {
        CTM.LIZ((Object)s, (Object)liveEffect);
        if (this.LIZ == null) {
            return;
        }
        while (true) {
        Label_0125_Outer:
            for (final 0hK next : this.LJII) {
                if (n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId())) {
                    boolean b = false;
                    if (next == null) {
                        LIZ(this, s, liveEffect, false, 16);
                    }
                    else {
                        b = true;
                    }
                    while (true) {
                        for (final 0hK next2 : this.LJII) {
                            if (n.LIZ((Object)next2.LIZIZ, (Object)liveEffect.getResourceId())) {
                                final 0hK 0hK = next2;
                                if (0hK != null) {
                                Label_0146:
                                    for (final Gaz gaz : liveEffect.composerConfigList) {
                                        if (gaz.LJI != lji) {
                                            gaz.LJI = lji;
                                            while (true) {
                                                for (final 0hL next3 : 0hK.LJI) {
                                                    if (n.LIZ((Object)gaz.LIZJ, (Object)next3.LIZJ)) {
                                                        final 0hL 0hL = next3;
                                                        if (0hL == null) {
                                                            continue Label_0146;
                                                        }
                                                        final float liz = 0g3.LIZ(gaz, lji);
                                                        if (!n.LIZ(0hL.LIZ, liz)) {
                                                            0hL.LIZ = liz;
                                                            continue Label_0146;
                                                        }
                                                        continue Label_0146;
                                                    }
                                                }
                                                0hL next3 = null;
                                                continue;
                                            }
                                        }
                                    }
                                    0hK.LJ = System.currentTimeMillis();
                                }
                                if (b) {
                                    this.LIZIZ(true);
                                }
                                final Iterator<Object> iterator5 = this.LJI.iterator();
                                while (iterator5.hasNext()) {
                                    iterator5.next();
                                    if (0hK != null) {
                                        final List<0hL> lji2 = 0hK.LJI;
                                        if (lji2 == null) {
                                            continue Label_0125_Outer;
                                        }
                                        final Iterator<Object> iterator6 = lji2.iterator();
                                        while (iterator6.hasNext()) {
                                            final Float liz2 = iterator6.next().LIZ;
                                            if (liz2 != null) {
                                                liz2.floatValue();
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                        }
                        0hK next2 = null;
                        continue;
                    }
                }
            }
            0hK next = null;
            continue;
        }
    }
    
    @Override
    public final void LIZ(final String s, final LiveEffect liveEffect, final LiveEffect liveEffect2) {
        CTM.LIZ((Object)s, (Object)liveEffect2);
        if (this.LIZ == null) {
            return;
        }
        0hK liz;
        if (liveEffect == null) {
            liz = null;
        }
        else {
            liz = this.LIZ(s, liveEffect, false);
        }
        final 0hK liz2 = LIZ(this, s, liveEffect2, false, 24);
        this.LIZIZ(false);
        if (liz2 == null) {
            return;
        }
        final String[] liz3 = 0g3.LIZ.LIZ(liz2);
        final String[] liz4 = 0g3.LIZ.LIZ(this.LJIIJ, liz3);
        this.LIZIZ(FIT.LIZ((Object)liz2));
        if (liz != null) {
            final String[] liz5 = 0g3.LIZ.LIZ(liz);
            final 0gU liz6 = this.LIZ;
            if (liz6 != null) {
                final 0g5 lizj = liz6.LIZJ;
                if (lizj != null) {
                    lizj.LIZ(liz5, liz3, liz4);
                }
            }
            return;
        }
        final 0gU liz7 = this.LIZ;
        if (liz7 != null) {
            final 0g5 lizj2 = liz7.LIZJ;
            if (lizj2 != null) {
                lizj2.LIZJ(liz3, liz4);
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final LiveEffect liveEffect, final String s2, final float n, final Long n2) {
        CTM.LIZ((Object)s, (Object)liveEffect, (Object)s2);
        if (this.LIZ == null) {
            return;
        }
        final Iterator<Object> iterator = this.LJII.iterator();
        0hK next;
        0hK 0hK;
        do {
            final boolean hasNext = iterator.hasNext();
            0hK = null;
            if (!hasNext) {
                next = null;
                break;
            }
            next = iterator.next();
        } while (!n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId()));
        boolean b = false;
        if (next == null) {
            LIZ(this, s, liveEffect, false, 16);
        }
        else {
            b = true;
        }
        final Iterator<Object> iterator2 = this.LJII.iterator();
        0hK next2;
        do {
            next2 = 0hK;
            if (!iterator2.hasNext()) {
                break;
            }
            next2 = iterator2.next();
        } while (!n.LIZ((Object)next2.LIZIZ, (Object)liveEffect.getResourceId()));
        final 0hK 0hK2 = next2;
        if (0hK2 != null) {
            for (final 0hL 0hL : 0hK2.LJI) {
                if (!n.LIZ(0hL.LIZ, n) || n2 != null) {
                    0hL.LIZ = n;
                }
            }
            for (final Gaz gaz : liveEffect.composerConfigList) {
                final int liz = 0g3.LIZ(gaz, n);
                if (gaz.LJI != liz || n2 != null) {
                    gaz.LJI = liz;
                }
            }
            long lj;
            if (n2 != null) {
                lj = n2;
            }
            else {
                lj = System.currentTimeMillis();
            }
            0hK2.LJ = lj;
        }
        if (b) {
            this.LIZIZ(true);
        }
        for (Object o : this.LJI) {}
    }
    
    @Override
    public final void LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final 0gU liz = this.LIZ;
        if (liz != null) {
            final 0g5 lizj = liz.LIZJ;
            if (lizj != null) {
                lizj.LIZ(s, s2);
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final List<? extends LiveEffect> list) {
        CTM.LIZ((Object)s, (Object)list);
        final 0gU liz = this.LIZ;
        if (liz == null) {
            return;
        }
        List<String> liziz;
        if ((liziz = liz.LIZIZ) == null) {
            liziz = new ArrayList<String>();
        }
        if (!liziz.contains(s)) {
            return;
        }
        if (this.LJIIIZ.isEmpty()) {
            return;
        }
        final ArrayList list2 = new ArrayList();
        for (final 0hK 0hK : this.LJIIIZ) {
            for (final LiveEffect next : list) {
                if (n.LIZ((Object)0hK.LIZIZ, (Object)next.getResourceId())) {
                    if (next != null) {
                        list2.add(next);
                        break;
                    }
                    break;
                }
            }
        }
        final Iterator iterator3 = list2.iterator();
        while (iterator3.hasNext()) {
            this.LJ(s, (LiveEffect)iterator3.next());
        }
        final List<0hK> ljiiiz = this.LJIIIZ;
        final ArrayList<0hK> list3 = new ArrayList<0hK>();
        for (final 0hK next2 : ljiiiz) {
            if (n.LIZ((Object)next2.LIZ, (Object)s)) {
                list3.add(next2);
            }
        }
        this.LJIIIZ.removeAll(list3);
    }
    
    @Override
    public final void LIZ(final String s, final boolean b) {
        CTM.LIZ((Object)s);
        final 0gU liz = this.LIZ;
        if (liz != null) {
            if (!liz.LJII) {
                return;
            }
            final ArrayList list = new ArrayList();
            for (final 0hK 0hK : this.LJII) {
                if (!list.contains(0hK.LIZ)) {
                    list.add(0hK.LIZ);
                }
            }
            for (final 0hK 0hK2 : this.LJIIIZ) {
                if (!list.contains(0hK2.LIZ)) {
                    this.LJII.add(0hK2);
                }
            }
            this.LJIIIZ.clear();
            final List<0hK> ljiiiz = this.LJIIIZ;
            final List<0hK> ljii = this.LJII;
            final ArrayList list2 = new ArrayList();
            for (final 0hK next : ljii) {
                final 0hK 0hK3 = next;
                final 0gU liz2 = this.LIZ;
                List<String> liziz;
                if (liz2 == null || (liziz = liz2.LIZIZ) == null) {
                    liziz = new ArrayList<String>();
                }
                if (liziz.contains(0hK3.LIZ)) {
                    list2.add(next);
                }
            }
            ljiiiz.addAll(list2);
            this.LJII().LIZ(s, this.LJIIIZ);
            if (!b) {
                this.LJIIIZ.clear();
            }
        }
    }
    
    @Override
    public final void LIZ(final boolean ljiil) {
        this.LJIIL = ljiil;
    }
    
    @Override
    public final boolean LIZ(final LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        final Iterator<Object> iterator = this.LJII.iterator();
        0hK next;
        0hL 0hL;
        do {
            final boolean hasNext = iterator.hasNext();
            0hL = null;
            if (!hasNext) {
                next = null;
                break;
            }
            next = iterator.next();
        } while (!n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId()));
        final 0hK 0hK = next;
        while (true) {
            Label_0226: {
                if (0hK == null) {
                    break Label_0226;
                }
                final List<0hL> lji = 0hK.LJI;
                if (lji == null) {
                    break Label_0226;
                }
                final Iterator<Object> iterator2 = lji.iterator();
                0hL 0hL2;
                while (true) {
                    0hL2 = 0hL;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final 0hL next2 = iterator2.next();
                    final String lizj = next2.LIZJ;
                    final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
                    String lizj2;
                    if (smallItemConfig != null) {
                        lizj2 = smallItemConfig.LIZJ;
                    }
                    else {
                        lizj2 = null;
                    }
                    if (n.LIZ((Object)lizj, (Object)lizj2)) {
                        0hL2 = next2;
                        break;
                    }
                }
                final 0hL 0hL3 = 0hL2;
                if (0hL3 == null) {
                    break Label_0226;
                }
                final Float liz = 0hL3.LIZ;
                if (liz == null) {
                    break Label_0226;
                }
                final float floatValue = liz;
                final Gaz smallItemConfig2 = liveEffect.getSmallItemConfig();
                int ljii;
                if (smallItemConfig2 != null) {
                    ljii = smallItemConfig2.LJII;
                }
                else {
                    ljii = 0;
                }
                return floatValue != 0g3.LIZ(liveEffect, ljii);
            }
            final float floatValue = 0.0f;
            continue;
        }
    }
    
    @Override
    public final Float LIZIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        while (true) {
            for (final 0hK next : this.LJII) {
                if (n.LIZ((Object)next.LIZIZ, (Object)s)) {
                    final 0hK 0hK = next;
                    final 0hK 0hK2 = 0hK;
                    if (0hK2 == null) {
                        return null;
                    }
                    while (true) {
                        for (final 0hL next2 : 0hK2.LJI) {
                            if (n.LIZ((Object)next2.LIZJ, (Object)s2)) {
                                final 0hL 0hL = next2;
                                if (0hL == null) {
                                    return null;
                                }
                                return 0hL.LIZ;
                            }
                        }
                        0hL next2 = null;
                        continue;
                    }
                }
            }
            final 0hK 0hK = null;
            continue;
        }
    }
    
    @Override
    public final List<LiveEffect> LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        if (!this.LJIIJ.containsKey(s)) {
            return Qsi.LJIIL((Iterable)hashMap.values());
        }
        final List<0hK> ljii = this.LJII;
        final ArrayList list = new ArrayList();
        for (final 0hK next : ljii) {
            final 0hK 0hK = next;
            if (n.LIZ((Object)0hK.LIZ, (Object)s) && this.LJIIJ.containsKey(0hK.LIZ) && 0hK.LJII) {
                list.add(next);
            }
        }
    Label_0242_Outer:
        for (final 0hK 0hK2 : list) {
            if (!hashMap.containsKey(0hK2.LIZIZ)) {
                final List list2 = this.LJIIJ.get(s);
                if (list2 != null) {
                    while (true) {
                        for (final Object next2 : list2) {
                            if (n.LIZ((Object)((LiveEffect)next2).getResourceId(), (Object)0hK2.LIZIZ)) {
                                final LiveEffect liveEffect = (LiveEffect)next2;
                                if (liveEffect != null) {
                                    hashMap.put(liveEffect.getResourceId(), liveEffect);
                                    for (final Gaz gaz : liveEffect.composerConfigList) {
                                        final 0hL 0hL = (0hL)Qsi.LJIIJJI((List)0hK2.LJI);
                                        while (true) {
                                            Label_0353: {
                                                if (0hL == null) {
                                                    break Label_0353;
                                                }
                                                final Float liz = 0hL.LIZ;
                                                if (liz == null) {
                                                    break Label_0353;
                                                }
                                                final float floatValue = liz;
                                                gaz.LJI = 0g3.LIZ(liveEffect, floatValue);
                                                continue Label_0242_Outer;
                                            }
                                            final float floatValue = 0.0f;
                                            continue;
                                        }
                                    }
                                    continue Label_0242_Outer;
                                }
                                continue Label_0242_Outer;
                            }
                        }
                        Object next2 = null;
                        continue;
                    }
                }
                continue;
            }
        }
        return Qsi.LJIIL((Iterable)hashMap.values());
    }
    
    @Override
    public final void LIZIZ() {
        final 0gU liz = this.LIZ;
        String ljff;
        if (liz == null || (ljff = liz.LJFF) == null) {
            ljff = "broadcast";
        }
        n.LIZIZ((Object)ljff, "");
        this.LIZIZ(ljff, true);
    }
    
    @Override
    public final void LIZIZ(final 0g6 0g6) {
        CTM.LIZ((Object)0g6);
        this.LJI.remove(0g6);
    }
    
    @Override
    public final void LIZIZ(final 0g7 0g7) {
        CTM.LIZ((Object)0g7);
        this.LJFF.remove(0g7);
    }
    
    @Override
    public final void LIZIZ(final String s, final LiveEffect liveEffect) {
        CTM.LIZ((Object)s, (Object)liveEffect);
        if (this.LIZ == null) {
            return;
        }
        final ArrayList list = new ArrayList();
        final List<LiveEffect> liziz = this.LIZIZ(s);
        final ArrayList list2 = new ArrayList();
        for (final LiveEffect next : liziz) {
            if (TextUtils.isEmpty((CharSequence)next.unzipPath) ^ true) {
                list2.add(next);
            }
        }
        final List list3 = list2;
        final ArrayList list4 = new ArrayList(6Jd.LIZ((Iterable)list3, 10));
        final Iterator iterator2 = list3.iterator();
        while (iterator2.hasNext()) {
            list4.add((Object)((LiveEffect)iterator2.next()).unzipPath);
        }
        list.addAll(list4);
        final ArrayList<String> list5 = new ArrayList<String>();
        list5.add(liveEffect.unzipPath);
        final ArrayList<String> list6 = new ArrayList<String>();
        String extra;
        if ((extra = liveEffect.extra) == null) {
            extra = "";
        }
        list6.add(extra);
        final 0gU liz = this.LIZ;
        if (liz != null) {
            final 0g5 lizj = liz.LIZJ;
            if (lizj != null) {
                final Object[] array = list.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                final String[] array2 = (String[])array;
                final String[] array3 = list5.toArray(new String[0]);
                Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
                final String[] array4 = array3;
                final String[] array5 = list6.toArray(new String[0]);
                Objects.requireNonNull(array5, "null cannot be cast to non-null type kotlin.Array<T>");
                lizj.LIZ(array2, array4, array5);
            }
        }
        final Iterator<Object> iterator3 = this.LIZIZ(s).iterator();
        while (iterator3.hasNext()) {
            this.LIZ(s, iterator3.next(), false);
        }
        LIZ(this, s, liveEffect, false, 24);
        this.LIZIZ(false);
    }
    
    @Override
    public final void LIZIZ(final String s, final LiveEffect liveEffect, final int lji) {
        CTM.LIZ((Object)s, (Object)liveEffect);
        if (this.LIZ == null) {
            return;
        }
        while (true) {
        Label_0125_Outer:
            for (final 0hK next : this.LJII) {
                if (n.LIZ((Object)next.LIZIZ, (Object)liveEffect.getResourceId())) {
                    boolean b = false;
                    if (next == null) {
                        LIZ(this, s, liveEffect, false, 16);
                    }
                    else {
                        b = true;
                    }
                    while (true) {
                        for (final 0hK next2 : this.LJII) {
                            if (n.LIZ((Object)next2.LIZIZ, (Object)liveEffect.getResourceId())) {
                                final 0hK 0hK = next2;
                                if (0hK != null) {
                                Label_0147:
                                    for (final Gaz gaz : liveEffect.composerConfigList) {
                                        gaz.LJI = lji;
                                        while (true) {
                                            for (final 0hL next3 : 0hK.LJI) {
                                                if (n.LIZ((Object)gaz.LIZJ, (Object)next3.LIZJ)) {
                                                    final 0hL 0hL = next3;
                                                    if (0hL != null) {
                                                        0hL.LIZ = 0g3.LIZ(gaz, lji);
                                                        continue Label_0147;
                                                    }
                                                    continue Label_0147;
                                                }
                                            }
                                            0hL next3 = null;
                                            continue;
                                        }
                                    }
                                    0hK.LJ = System.currentTimeMillis();
                                }
                                if (b) {
                                    this.LIZIZ(true);
                                }
                                final Iterator<Object> iterator5 = this.LJI.iterator();
                                while (iterator5.hasNext()) {
                                    iterator5.next();
                                    if (0hK != null) {
                                        final List<0hL> lji2 = 0hK.LJI;
                                        if (lji2 == null) {
                                            continue Label_0125_Outer;
                                        }
                                        final Iterator<Object> iterator6 = lji2.iterator();
                                        while (iterator6.hasNext()) {
                                            final Float liz = iterator6.next().LIZ;
                                            if (liz != null) {
                                                liz.floatValue();
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                        }
                        0hK next2 = null;
                        continue;
                    }
                }
            }
            0hK next = null;
            continue;
        }
    }
    
    @Override
    public final int LIZJ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final int[] array = { 0 };
        final 0gU liz = this.LIZ;
        if (liz != null) {
            final 0g5 lizj = liz.LIZJ;
            if (lizj != null) {
                lizj.LIZ(s, s2, array);
            }
        }
        return array[0];
    }
    
    @Override
    public final void LIZJ() {
        0gX.LIZ.LIZ("refresh Sticker");
        this.LJIIJJI.clear();
        this.LJIIIIZZ.clear();
        this.LIZIZ(true);
    }
    
    @Override
    public final void LIZJ(final String lizlll) {
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final void LIZJ(final String s, final LiveEffect liveEffect) {
        CTM.LIZ((Object)s, (Object)liveEffect);
        this.LIZ(s, liveEffect, true);
    }
    
    @Override
    public final 0hK LIZLLL(final String s, final LiveEffect liveEffect) {
        CTM.LIZ((Object)s, (Object)liveEffect);
        return this.LIZ(s, liveEffect, true, true, System.currentTimeMillis());
    }
    
    @Override
    public final String LIZLLL() {
        return this.LIZLLL;
    }
    
    @Override
    public final void LIZLLL(final String lj) {
        this.LJ = lj;
    }
    
    @Override
    public final String LJ() {
        return this.LJ;
    }
    
    @Override
    public final List<LiveEffect> LJ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        if (!this.LJIIJ.containsKey(s)) {
            return Qsi.LJIIL((Iterable)hashMap.values());
        }
        final List<0hK> ljii = this.LJII;
        final ArrayList list = new ArrayList();
        for (final 0hK next : ljii) {
            final 0hK 0hK = next;
            if (n.LIZ((Object)0hK.LIZ, (Object)s) && this.LJIIJ.containsKey(0hK.LIZ)) {
                list.add(next);
            }
        }
    Label_0133:
        for (final 0hK 0hK2 : list) {
            if (!hashMap.containsKey(0hK2.LIZIZ)) {
                final List list2 = this.LJIIJ.get(s);
                if (list2 != null) {
                    while (true) {
                        for (final Object next2 : list2) {
                            if (n.LIZ((Object)((LiveEffect)next2).getResourceId(), (Object)0hK2.LIZIZ)) {
                                final LiveEffect liveEffect = (LiveEffect)next2;
                                if (liveEffect != null) {
                                    hashMap.put(liveEffect.getResourceId(), liveEffect);
                                    continue Label_0133;
                                }
                                continue Label_0133;
                            }
                        }
                        Object next2 = null;
                        continue;
                    }
                }
                continue;
            }
        }
        return Qsi.LJIIL((Iterable)hashMap.values());
    }
    
    @Override
    public final void LJFF() {
        final 0gU liz = this.LIZ;
        String ljff;
        if (liz == null || (ljff = liz.LJFF) == null) {
            ljff = "broadcast";
        }
        n.LIZIZ((Object)ljff, "");
        this.LIZ(ljff, false);
    }
    
    @Override
    public final void LJFF(final String s) {
        CTM.LIZ((Object)s);
        this.LIZIZ(s, false);
    }
    
    @Override
    public final boolean LJI() {
        return this.LIZ != null;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(6159);
        }
        
        public final 1im LIZ() {
            return (1im)1im.LIZIZ.getValue();
        }
    }
}
