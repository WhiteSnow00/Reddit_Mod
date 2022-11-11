// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import java.util.Comparator;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public final class 0Wv
{
    public boolean LIZ;
    public final String LIZIZ;
    public final Fra LIZJ;
    public final int LIZLLL;
    public final LinkedList<2Ws> LJ;
    public LinkedHashSet<a> LJFF;
    public LinkedHashSet<a> LJI;
    public final GSV<String> LJII;
    public final GSV<String> LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(5092);
    }
    
    public 0Wv(final Fra lizj, int lizlll, final LinkedList<2Ws> lj) {
        CTM.LIZ((Object)lizj, (Object)lj);
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = new LinkedHashSet<a>();
        this.LJI = new LinkedHashSet<a>();
        this.LJII = (GSV<String>)GST.F;
        this.LJIIIIZZ = (GSV<String>)GST.E;
        lizlll = 0Ww.LIZ[lizj.ordinal()];
        String liziz;
        if (lizlll != 1) {
            if (lizlll != 2) {
                if (lizlll != 3) {
                    liziz = "else";
                }
                else {
                    liziz = Fra.LIVE_STUDIO.logStreamingType;
                }
            }
            else {
                liziz = Fra.THIRD_PARTY.logStreamingType;
            }
        }
        else {
            liziz = Fra.SCREEN_RECORD.logStreamingType;
        }
        this.LIZIZ = liziz;
    }
    
    private final void LIZ(final boolean b) {
        public final class 0Wu<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(5094);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)((a)t).LIZ.LIZJ, (Comparable)((a)t2).LIZ.LIZJ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0Wv.LJFF:Ljava/util/LinkedHashSet;
        //     4: new             LX/0Wu;
        //     7: dup            
        //     8: invokespecial   X/0Wu.<init>:()V
        //    11: invokestatic    X/Qsi.LIZ:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //    14: astore_2       
        //    15: new             Ljava/util/ArrayList;
        //    18: dup            
        //    19: invokespecial   java/util/ArrayList.<init>:()V
        //    22: astore_3       
        //    23: aload_2        
        //    24: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    29: astore_2       
        //    30: iconst_0       
        //    31: istore          4
        //    33: aload_2        
        //    34: invokeinterface java/util/Iterator.hasNext:()Z
        //    39: ifeq            82
        //    42: aload_2        
        //    43: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    48: astore          5
        //    50: iload           4
        //    52: ifge            58
        //    55: invokestatic    X/Ey9.LIZ:()V
        //    58: iload           4
        //    60: aload_0        
        //    61: getfield        X/0Wv.LIZLLL:I
        //    64: if_icmpge       76
        //    67: aload_3        
        //    68: aload           5
        //    70: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    75: pop            
        //    76: iinc            4, 1
        //    79: goto            33
        //    82: aload_3        
        //    83: checkcast       Ljava/util/List;
        //    86: astore_2       
        //    87: new             Ljava/util/LinkedHashSet;
        //    90: dup            
        //    91: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    94: astore_3       
        //    95: aload_2        
        //    96: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   101: astore          5
        //   103: aload           5
        //   105: invokeinterface java/util/Iterator.hasNext:()Z
        //   110: ifeq            140
        //   113: aload           5
        //   115: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   120: checkcast       LX/0Wt;
        //   123: astore_2       
        //   124: aload_3        
        //   125: aload_2        
        //   126: invokevirtual   java/util/LinkedHashSet.add:(Ljava/lang/Object;)Z
        //   129: pop            
        //   130: aload_2        
        //   131: getfield        X/0Wt.LIZ:LX/2Ws;
        //   134: getfield        X/2Ws.LIZIZ:Z
        //   137: ifne            103
        //   140: iload_1        
        //   141: ifeq            193
        //   144: aload_0        
        //   145: getfield        X/0Wv.LJI:Ljava/util/LinkedHashSet;
        //   148: invokevirtual   java/util/LinkedHashSet.iterator:()Ljava/util/Iterator;
        //   151: astore_2       
        //   152: aload_2        
        //   153: invokeinterface java/util/Iterator.hasNext:()Z
        //   158: ifeq            193
        //   161: aload_2        
        //   162: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   167: checkcast       LX/0Wt;
        //   170: astore          5
        //   172: aload_3        
        //   173: aload           5
        //   175: invokevirtual   java/util/LinkedHashSet.contains:(Ljava/lang/Object;)Z
        //   178: ifne            152
        //   181: aload           5
        //   183: getfield        X/0Wt.LIZIZ:Lcom/bytedance/android/live/broadcast/banner/BannerWidget;
        //   186: iconst_0       
        //   187: invokevirtual   com/bytedance/android/live/broadcast/banner/BannerWidget.LIZ:(Z)V
        //   190: goto            152
        //   193: aload_0        
        //   194: aload_3        
        //   195: putfield        X/0Wv.LJI:Ljava/util/LinkedHashSet;
        //   198: return         
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
    
    private final void LIZJ() {
        this.LJFF.clear();
        this.LJI.clear();
    }
    
    private final void LIZJ(final BannerWidget bannerWidget) {
        if (!(n.LIZ((Object)this.LIZIZ, (Object)bannerWidget.LIZ) ^ true) && !n.LIZ((Object)this.LIZIZ, (Object)"else")) {
            bannerWidget.LIZLLL();
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZIZ);
            sb.append(bannerWidget.LIZ());
            final String string = sb.toString();
            if (bannerWidget.LIZJ) {
                this.LJIIIIZZ.LIZ(string, (Object)String.valueOf(System.currentTimeMillis()));
            }
            if (bannerWidget.LIZIZ != Integer.MAX_VALUE) {
                String s;
                if ((s = (String)this.LJII.LIZ(string)) == null) {
                    s = "0";
                }
                this.LJII.LIZ(string, (Object)String.valueOf(Integer.parseInt(s) + 1));
            }
        }
    }
    
    private final a LIZLLL(final BannerWidget bannerWidget) {
        for (final 2Ws 2Ws : this.LJ) {
            if (n.LIZ((Object)bannerWidget.LIZ(), (Object)2Ws.LIZ)) {
                n.LIZIZ((Object)2Ws, "");
                return new a(2Ws, bannerWidget);
            }
        }
        final StringBuilder sb = new StringBuilder("bannerWidget not found");
        sb.append(bannerWidget.LIZ());
        0ba.LIZ(3, "ALogger", sb.toString());
        return null;
    }
    
    public final void LIZ() {
        final Iterator<Object> iterator = this.LJI.iterator();
        while (iterator.hasNext()) {
            this.LIZJ(iterator.next().LIZIZ);
        }
        this.LIZJ();
    }
    
    public final void LIZ(final BannerWidget bannerWidget) {
        CTM.LIZ((Object)bannerWidget);
        if (!this.LIZ) {
            return;
        }
        final Iterator<Object> iterator = this.LJFF.iterator();
        while (iterator.hasNext()) {
            if (n.LIZ((Object)iterator.next().LIZIZ, (Object)bannerWidget)) {
                return;
            }
        }
        final a lizlll = this.LIZLLL(bannerWidget);
        if (lizlll == null) {
            return;
        }
        this.LJFF.add(lizlll);
        this.LIZ(true);
        if (!this.LJI.contains(lizlll)) {
            lizlll.LIZIZ.LIZ(false);
        }
    }
    
    public final void LIZ(final BannerWidget bannerWidget, final boolean b) {
        CTM.LIZ((Object)bannerWidget);
        final Iterator<Object> iterator = this.LJFF.iterator();
        Object o = null;
        while (iterator.hasNext()) {
            final a a = iterator.next();
            if (n.LIZ((Object)a.LIZIZ, (Object)bannerWidget)) {
                o = a;
            }
        }
        if (o != null) {
            this.LJFF.remove(o);
            this.LJI.remove(o);
            if (!b) {
                this.LIZ(true);
                return;
            }
            this.LIZJ(bannerWidget);
        }
    }
    
    public final void LIZIZ() {
        this.LIZJ();
        this.LIZ = true;
    }
    
    public final boolean LIZIZ(final BannerWidget bannerWidget) {
        CTM.LIZ((Object)bannerWidget);
        if (!this.LIZ) {
            return true;
        }
        final Iterator<Object> iterator = this.LJFF.iterator();
        while (iterator.hasNext()) {
            if (n.LIZ((Object)iterator.next().LIZIZ, (Object)bannerWidget)) {
                return true;
            }
        }
        final a lizlll = this.LIZLLL(bannerWidget);
        if (lizlll == null) {
            return true;
        }
        final Object clone = this.LJFF.clone();
        n.LIZIZ(clone, "");
        final Object clone2 = this.LJI.clone();
        n.LIZIZ(clone2, "");
        this.LJFF.add(lizlll);
        this.LIZ(false);
        final boolean contains = this.LJI.contains(lizlll);
        Objects.requireNonNull(clone, "null cannot be cast to non-null type java.util.LinkedHashSet<com.bytedance.android.live.broadcast.banner.BannerWidgetManager.BannerWrapper>");
        this.LJFF = (LinkedHashSet<a>)clone;
        Objects.requireNonNull(clone2, "null cannot be cast to non-null type java.util.LinkedHashSet<com.bytedance.android.live.broadcast.banner.BannerWidgetManager.BannerWrapper>");
        this.LJI = (LinkedHashSet<a>)clone2;
        return contains ^ true;
    }
    
    public static final class a
    {
        public final 2Ws LIZ;
        public final BannerWidget LIZIZ;
        
        static {
            Covode.recordClassIndex(5093);
        }
        
        public a(final 2Ws liz, final BannerWidget liziz) {
            CTM.LIZ((Object)liz, (Object)liziz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
}
