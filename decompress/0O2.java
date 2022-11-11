// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Comparator;
import kotlin.n.y;
import org.w3c.dom.Document;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import kotlin.n.z;
import java.util.Objects;
import kotlin.jvm.internal.n;
import org.w3c.dom.Node;
import javax.xml.xpath.XPathFactory;
import com.bytedance.covode.number.Covode;
import javax.xml.xpath.XPath;

public final class 0O2
{
    public final XPath LIZ;
    public int LIZIZ;
    public final 0Np LIZJ;
    public final 0Nr LIZLLL;
    public final 0Nv LJ;
    
    static {
        Covode.recordClassIndex(3931);
    }
    
    public 0O2(final 0Np 0Np) {
        this(0Np, null, 6);
    }
    
    public 0O2(final 0Np 0Np, final 0Nr 0Nr) {
        this(0Np, 0Nr, 4);
    }
    
    public 0O2(final 0Np lizj, final 0Nr lizlll, final 0Nv lj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LIZ = XPathFactory.newInstance().newXPath();
    }
    
    private final void LIZ(final Node node, final 0Nl 0Nl) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final Iterator liz2 = 0Nt.LIZ(liz, node, "./Linear/TrackingEvents/Tracking").LIZ();
        while (liz2.hasNext()) {
            final Object next = liz2.next();
            final 0No 0No = new 0No();
            final String evaluate = this.LIZ.evaluate("./@event", next);
            n.LIZIZ((Object)evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            0No.name = z.LIZIZ((CharSequence)evaluate).toString();
            final String evaluate2 = this.LIZ.evaluate("./@offset", next);
            n.LIZIZ((Object)evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            0No.offset = z.LIZIZ((CharSequence)evaluate2).toString();
            final String evaluate3 = this.LIZ.evaluate("./text()", next);
            n.LIZIZ((Object)evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            0No.url = z.LIZIZ((CharSequence)evaluate3).toString();
            0Nl.trackingEventList = 0Ns.LIZ(0Nl.trackingEventList, 0No);
        }
    }
    
    private final void LIZ(Node node, final boolean byWrapper) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final Iterator liz2 = 0Nt.LIZ(liz, node, "./Creatives/Creative").LIZ();
        while (liz2.hasNext()) {
            node = (Node)liz2.next();
            final 0Nl 0Nl = new 0Nl();
            0Nl.byWrapper = byWrapper;
            final String evaluate = this.LIZ.evaluate("./@id", node);
            n.LIZIZ((Object)evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            0Nl.id = z.LIZIZ((CharSequence)evaluate).toString();
            final XPath liz3 = this.LIZ;
            n.LIZIZ((Object)liz3, "");
            CTM.LIZ((Object)liz3, (Object)node, (Object)"./Linear/Duration");
            0Nl.duration = (String)Qso.LIZLLL((3L2)0Nt.LIZ(0Nt.LIZ(liz3, node, "./Linear/Duration"), liz3));
            this.LIZ(node, 0Nl);
            this.LIZIZ(node, 0Nl);
            this.LIZJ(node, 0Nl);
            this.LIZLLL(node, 0Nl);
            if (byWrapper) {
                final 0Np lizj = this.LIZJ;
                List<0Nl> creativeList;
                if ((creativeList = lizj.creativeList) == null) {
                    creativeList = new LinkedList<0Nl>();
                }
                creativeList.add(0, 0Nl);
                lizj.creativeList = creativeList;
            }
            else {
                final 0Np lizj2 = this.LIZJ;
                lizj2.creativeList = 0Ns.LIZ(lizj2.creativeList, 0Nl);
            }
        }
    }
    
    private final boolean LIZ(final Document document, final int n, final int n2) {
        final String version = this.LIZJ.version;
        if (version == null || version.length() == 0) {
            this.LIZJ.version = this.LIZ.evaluate("/VAST/@version", document);
        }
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final Iterator liz2 = 0Nt.LIZ(liz, document, "/VAST/Ad/InLine").LIZ();
        while (liz2.hasNext()) {
            final Node node = liz2.next();
            final 0Nv lj = this.LJ;
            if (lj != null) {
                lj.LIZJ();
            }
            final String adSystem = this.LIZJ.adSystem;
            if (adSystem == null || adSystem.length() == 0) {
                final 0Np lizj = this.LIZJ;
                final XPath liz3 = this.LIZ;
                n.LIZIZ((Object)liz3, "");
                final 3L2<Node> liz4 = 0Nt.LIZ(liz3, node, "./AdSystem");
                final XPath liz5 = this.LIZ;
                n.LIZIZ((Object)liz5, "");
                lizj.adSystem = (String)Qso.LIZLLL((3L2)0Nt.LIZ(liz4, liz5));
            }
            final String adTitle = this.LIZJ.adTitle;
            if (adTitle == null || adTitle.length() == 0) {
                final 0Np lizj2 = this.LIZJ;
                final XPath liz6 = this.LIZ;
                n.LIZIZ((Object)liz6, "");
                final 3L2<Node> liz7 = 0Nt.LIZ(liz6, node, "./AdTitle");
                final XPath liz8 = this.LIZ;
                n.LIZIZ((Object)liz8, "");
                lizj2.adTitle = (String)Qso.LIZLLL((3L2)0Nt.LIZ(liz7, liz8));
            }
            final String evaluate = this.LIZ.evaluate("./Description/text()", node);
            n.LIZIZ((Object)evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            final String string = z.LIZIZ((CharSequence)evaluate).toString();
            if (string.length() > 0) {
                this.LIZJ.description = string;
            }
            this.LIZ(node, false);
            this.LIZIZ(node);
        }
        final XPath liz9 = this.LIZ;
        n.LIZIZ((Object)liz9, "");
        final Iterator liz10 = 0Nt.LIZ(liz9, document, "/VAST/Ad/Wrapper").LIZ();
        while (liz10.hasNext()) {
            final Node node2 = liz10.next();
            this.LIZ(node2, true);
            this.LIZIZ(node2);
            if (!this.LIZ(node2, n - 1, n2)) {
                return false;
            }
        }
        return true;
    }
    
    private final boolean LIZ(final Node node, final int n, final int n2) {
        if (n < 0) {
            final 0Nv lj = this.LJ;
            if (lj != null) {
                final XPath liz = this.LIZ;
                n.LIZIZ((Object)liz, "");
                final 3L2<Node> liz2 = 0Nt.LIZ(liz, node, "./VASTAdTagURI");
                final XPath liz3 = this.LIZ;
                n.LIZIZ((Object)liz3, "");
                final Iterator liz4 = 0Nt.LIZ(liz2, liz3).LIZ();
                while (liz4.hasNext()) {
                    liz4.next();
                    lj.LIZLLL();
                }
            }
            return false;
        }
        final XPath liz5 = this.LIZ;
        n.LIZIZ((Object)liz5, "");
        final 3L2<Node> liz6 = 0Nt.LIZ(liz5, node, "./VASTAdTagURI");
        final XPath liz7 = this.LIZ;
        n.LIZIZ((Object)liz7, "");
        final Iterator liz8 = 0Nt.LIZ(liz6, liz7).LIZ();
        boolean b = false;
    Label_0193_Outer:
        while (liz8.hasNext()) {
            final String s = liz8.next();
            final 0Nv lj2 = this.LJ;
            while (true) {
                if (lj2 != null) {
                    lj2.LIZ();
                    try {
                        Document liz9;
                        try {
                            0Nr 0Nr;
                            if ((0Nr = this.LIZLLL) == null) {
                                0Nr = 1CT.LIZ;
                            }
                            liz9 = 0Nr.LIZ(s);
                        }
                        catch (final 0Nj 0Nj) {
                            final 0Nv lj3 = this.LJ;
                            if (lj3 != null) {
                                lj3.LIZ(0Nj);
                                return false;
                            }
                            return false;
                        }
                        catch (final 0Ni 0Ni) {
                            VYh.LIZ((Throwable)0Ni);
                            final 0Nv lj4 = this.LJ;
                            if (lj4 != null) {
                                lj4.LIZ(0Ni);
                                return false;
                            }
                            return false;
                        }
                        if (liz9 != null) {
                            if (!this.LIZ(liz9, n, n2 + 1)) {
                                return false;
                            }
                            final 0Nv lj5 = this.LJ;
                            if (lj5 != null) {
                                lj5.LJ();
                            }
                            b = true;
                            continue Label_0193_Outer;
                        }
                        return false;
                    }
                    finally {
                        final 0Nv lj6 = this.LJ;
                        if (lj6 != null) {
                            lj6.LJ();
                        }
                    }
                    break;
                }
                continue;
            }
        }
        if (!b) {
            final 0Nv lj7 = this.LJ;
            if (lj7 != null) {
                lj7.LIZ(new 0Nj("VASTAdTagURI missing"));
            }
        }
        return b;
    }
    
    private final void LIZIZ(final Node node) {
        this.LIZJ(node);
        this.LIZLLL(node);
        this.LJ(node);
        this.LJFF(node);
    }
    
    private final void LIZIZ(final Node node, final 0Nl 0Nl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0O2.LIZ:Ljavax/xml/xpath/XPath;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ldc             ""
        //     8: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    11: aload_3        
        //    12: aload_1        
        //    13: iconst_1       
        //    14: anewarray       Ljava/lang/String;
        //    17: dup            
        //    18: iconst_0       
        //    19: ldc_w           "./Linear/VideoClicks"
        //    22: aastore        
        //    23: invokestatic    X/0Nt.LIZ:(Ljavax/xml/xpath/XPath;Ljava/lang/Object;[Ljava/lang/String;)LX/3L2;
        //    26: new             LX/2Gv;
        //    29: dup            
        //    30: aload_0        
        //    31: invokespecial   X/2Gv.<init>:(LX/0O2;)V
        //    34: invokestatic    X/Qso.LJ:(LX/3L2;LX/SRS;)LX/3L2;
        //    37: invokeinterface X/3L2.LIZ:()Ljava/util/Iterator;
        //    42: astore_1       
        //    43: aload_1        
        //    44: invokeinterface java/util/Iterator.hasNext:()Z
        //    49: ifeq            74
        //    52: aload_1        
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: astore_3       
        //    59: aload_2        
        //    60: aload_2        
        //    61: getfield        X/0Nl.clickList:Ljava/util/List;
        //    64: aload_3        
        //    65: invokestatic    X/0Ns.LIZ:(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
        //    68: putfield        X/0Nl.clickList:Ljava/util/List;
        //    71: goto            43
        //    74: return         
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
    
    private final void LIZJ(final Node node) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final 3L2<Node> liz2 = 0Nt.LIZ(liz, node, "./Error");
        final XPath liz3 = this.LIZ;
        n.LIZIZ((Object)liz3, "");
        final Iterator liz4 = 0Nt.LIZ(liz2, liz3).LIZ();
        while (liz4.hasNext()) {
            final Object next = liz4.next();
            final 0Np lizj = this.LIZJ;
            lizj.errorSet = 0Ns.LIZ(lizj.errorSet, (String)next);
        }
    }
    
    private final void LIZJ(final Node node, final 0Nl 0Nl) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final Iterator liz2 = 0Nt.LIZ(liz, node, "./Linear/MediaFiles/MediaFile").LIZ();
        while (liz2.hasNext()) {
            final Object next = liz2.next();
            final 0Nn 0Nn = new 0Nn();
            final String evaluate = this.LIZ.evaluate("./@delivery", next);
            n.LIZIZ((Object)evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            0Nn.delivery = z.LIZIZ((CharSequence)evaluate).toString();
            final String evaluate2 = this.LIZ.evaluate("./@type", next);
            n.LIZIZ((Object)evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            0Nn.type = z.LIZIZ((CharSequence)evaluate2).toString();
            final String evaluate3 = this.LIZ.evaluate("./text()", next);
            n.LIZIZ((Object)evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            0Nn.url = z.LIZIZ((CharSequence)evaluate3).toString();
            final XPath liz3 = this.LIZ;
            n.LIZIZ((Object)liz3, "");
            final String evaluate4 = liz3.evaluate("./@bitrate", next);
            n.LIZIZ((Object)evaluate4, "");
            Objects.requireNonNull(evaluate4, "null cannot be cast to non-null type kotlin.CharSequence");
            final Integer lj = 353.LJ(z.LIZIZ((CharSequence)evaluate4).toString());
            if (lj != null) {
                0Nn.bitRate = lj.intValue();
            }
            final XPath liz4 = this.LIZ;
            n.LIZIZ((Object)liz4, "");
            final String evaluate5 = liz4.evaluate("./@width", next);
            n.LIZIZ((Object)evaluate5, "");
            Objects.requireNonNull(evaluate5, "null cannot be cast to non-null type kotlin.CharSequence");
            final Integer lj2 = 353.LJ(z.LIZIZ((CharSequence)evaluate5).toString());
            if (lj2 != null) {
                0Nn.width = lj2.intValue();
            }
            final XPath liz5 = this.LIZ;
            n.LIZIZ((Object)liz5, "");
            final String evaluate6 = liz5.evaluate("./@height", next);
            n.LIZIZ((Object)evaluate6, "");
            Objects.requireNonNull(evaluate6, "null cannot be cast to non-null type kotlin.CharSequence");
            final Integer lj3 = 353.LJ(z.LIZIZ((CharSequence)evaluate6).toString());
            if (lj3 != null) {
                0Nn.height = lj3.intValue();
            }
            final XPath liz6 = this.LIZ;
            n.LIZIZ((Object)liz6, "");
            final String evaluate7 = liz6.evaluate("./@scalable", next);
            n.LIZIZ((Object)evaluate7, "");
            Objects.requireNonNull(evaluate7, "null cannot be cast to non-null type kotlin.CharSequence");
            final String string = z.LIZIZ((CharSequence)evaluate7).toString();
            int n;
            if (string.length() > 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                0Nn.scalable = y.LIZ("true", string, true);
            }
            final XPath liz7 = this.LIZ;
            kotlin.jvm.internal.n.LIZIZ((Object)liz7, "");
            final String evaluate8 = liz7.evaluate("./@maintainAspectRatio", next);
            kotlin.jvm.internal.n.LIZIZ((Object)evaluate8, "");
            Objects.requireNonNull(evaluate8, "null cannot be cast to non-null type kotlin.CharSequence");
            final String string2 = z.LIZIZ((CharSequence)evaluate8).toString();
            if (string2.length() > 0) {
                0Nn.maintainAspectRatio = y.LIZ("true", string2, true);
            }
            0Nl.mediaFileList = 0Ns.LIZ(0Nl.mediaFileList, 0Nn);
        }
    }
    
    private final void LIZLLL(final Node node) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final 3L2<Node> liz2 = 0Nt.LIZ(liz, node, "./Impression");
        final XPath liz3 = this.LIZ;
        n.LIZIZ((Object)liz3, "");
        final Iterator liz4 = 0Nt.LIZ(liz2, liz3).LIZ();
        while (liz4.hasNext()) {
            final Object next = liz4.next();
            final 0Np lizj = this.LIZJ;
            lizj.impressionSet = 0Ns.LIZ(lizj.impressionSet, (String)next);
        }
    }
    
    private final void LIZLLL(final Node node, final 0Nl 0Nl) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final Iterator liz2 = 0Nt.LIZ(liz, node, "./Linear/Icons/Icon").LIZ();
        while (liz2.hasNext()) {
            final Object next = liz2.next();
            final 0Nm 0Nm = new 0Nm();
            final XPath liz3 = this.LIZ;
            n.LIZIZ((Object)liz3, "");
            final String evaluate = liz3.evaluate("./@width", next);
            n.LIZIZ((Object)evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            final Integer lj = 353.LJ(z.LIZIZ((CharSequence)evaluate).toString());
            if (lj != null) {
                0Nm.width = lj.intValue();
            }
            final XPath liz4 = this.LIZ;
            n.LIZIZ((Object)liz4, "");
            final String evaluate2 = liz4.evaluate("./@height", next);
            n.LIZIZ((Object)evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            final Integer lj2 = 353.LJ(z.LIZIZ((CharSequence)evaluate2).toString());
            if (lj2 != null) {
                0Nm.width = lj2.intValue();
            }
            0Nm.program = this.LIZ.evaluate("./@program", next);
            final XPath liz5 = this.LIZ;
            n.LIZIZ((Object)liz5, "");
            final 3L2<Node> liz6 = 0Nt.LIZ(liz5, next, "./StaticResource");
            final XPath liz7 = this.LIZ;
            n.LIZIZ((Object)liz7, "");
            0Nm.staticResource = Qso.LJI((3L2)0Nt.LIZ(liz6, liz7));
            final XPath liz8 = this.LIZ;
            n.LIZIZ((Object)liz8, "");
            final 3L2<Node> liz9 = 0Nt.LIZ(liz8, next, "./HTMLResource");
            final XPath liz10 = this.LIZ;
            n.LIZIZ((Object)liz10, "");
            0Nm.htmlResource = (String)Qso.LIZLLL((3L2)0Nt.LIZ(liz9, liz10));
            final XPath liz11 = this.LIZ;
            n.LIZIZ((Object)liz11, "");
            final 3L2<Node> liz12 = 0Nt.LIZ(liz11, next, "./IFrameResource");
            final XPath liz13 = this.LIZ;
            n.LIZIZ((Object)liz13, "");
            0Nm.iFrameResource = (String)Qso.LIZLLL((3L2)0Nt.LIZ(liz12, liz13));
            final XPath liz14 = this.LIZ;
            n.LIZIZ((Object)liz14, "");
            final 3L2<Node> liz15 = 0Nt.LIZ(liz14, next, "./IconViewTracking");
            final XPath liz16 = this.LIZ;
            n.LIZIZ((Object)liz16, "");
            0Nm.viewTracking = Qso.LJI((3L2)0Nt.LIZ(liz15, liz16));
            final XPath liz17 = this.LIZ;
            n.LIZIZ((Object)liz17, "");
            final Iterator liz18 = 0Nt.LIZ(liz17, next, "./IconClicks").LIZ();
            while (liz18.hasNext()) {
                0Nm.clickList = 0Ns.LIZ(0Nm.clickList, this.LIZ((Node)liz18.next()));
            }
            0Nl.iconList = 0Ns.LIZ(0Nl.iconList, 0Nm);
        }
    }
    
    private final void LJ(final Node node) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final Iterator liz2 = 0Nt.LIZ(liz, node, "./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification").LIZ();
        while (liz2.hasNext()) {
            final Object next = liz2.next();
            final 0Nk 0Nk = new 0Nk();
            final String evaluate = this.LIZ.evaluate("./@vendor", next);
            n.LIZIZ((Object)evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            0Nk.vender = z.LIZIZ((CharSequence)evaluate).toString();
            final String evaluate2 = this.LIZ.evaluate("./JavaScriptResource/text()", next);
            n.LIZIZ((Object)evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            0Nk.javascriptResource = z.LIZIZ((CharSequence)evaluate2).toString();
            final String evaluate3 = this.LIZ.evaluate("./VerificationParameters/text()", next);
            n.LIZIZ((Object)evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            0Nk.verificationParameters = z.LIZIZ((CharSequence)evaluate3).toString();
            final 0Np lizj = this.LIZJ;
            lizj.adVerificationList = 0Ns.LIZ(lizj.adVerificationList, 0Nk);
        }
    }
    
    private final void LJFF(final Node node) {
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final Iterator liz2 = 0Nt.LIZ(liz, node, "./ViewableImpression").LIZ();
        while (liz2.hasNext()) {
            final Object next = liz2.next();
            final XPath liz3 = this.LIZ;
            n.LIZIZ((Object)liz3, "");
            final 3L2<Node> liz4 = 0Nt.LIZ(liz3, next, "./Viewable");
            final XPath liz5 = this.LIZ;
            n.LIZIZ((Object)liz5, "");
            final Iterator liz6 = 0Nt.LIZ(liz4, liz5).LIZ();
            while (liz6.hasNext()) {
                final Object next2 = liz6.next();
                final 0Np lizj = this.LIZJ;
                lizj.viewableSet = 0Ns.LIZ(lizj.viewableSet, (String)next2);
            }
            final XPath liz7 = this.LIZ;
            n.LIZIZ((Object)liz7, "");
            final 3L2<Node> liz8 = 0Nt.LIZ(liz7, next, "./NotViewable");
            final XPath liz9 = this.LIZ;
            n.LIZIZ((Object)liz9, "");
            final Iterator liz10 = 0Nt.LIZ(liz8, liz9).LIZ();
            while (liz10.hasNext()) {
                final Object next3 = liz10.next();
                final 0Np lizj2 = this.LIZJ;
                lizj2.notViewableSet = 0Ns.LIZ(lizj2.notViewableSet, (String)next3);
            }
            final XPath liz11 = this.LIZ;
            n.LIZIZ((Object)liz11, "");
            final 3L2<Node> liz12 = 0Nt.LIZ(liz11, next, "./ViewUndetermined");
            final XPath liz13 = this.LIZ;
            n.LIZIZ((Object)liz13, "");
            final Iterator liz14 = 0Nt.LIZ(liz12, liz13).LIZ();
            while (liz14.hasNext()) {
                final Object next4 = liz14.next();
                final 0Np lizj3 = this.LIZJ;
                lizj3.viewUndeterminedSet = 0Ns.LIZ(lizj3.viewUndeterminedSet, (String)next4);
            }
        }
    }
    
    public final 0Nq LIZ(final Node node) {
        final 0Nq 0Nq = new 0Nq();
        final XPath liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        final 3L2 liz2 = Qsp.LIZ((Object[])new String[] { "./ClickThrough", "./IconClickThrough" });
        CTM.LIZ((Object)liz, (Object)node, (Object)liz2);
        0Nq.clickThrough = (String)Qso.LIZLLL((3L2)0Nt.LIZ(0Nt.LIZ(liz, node, (3L2<String>)liz2), liz));
        final XPath liz3 = this.LIZ;
        n.LIZIZ((Object)liz3, "");
        final 3L2<Node> liz4 = 0Nt.LIZ(liz3, node, (3L2<String>)Qsp.LIZ((Object[])new String[] { "./ClickTracking", "./IconClickTracking" }));
        final XPath liz5 = this.LIZ;
        n.LIZIZ((Object)liz5, "");
        final Iterator liz6 = 0Nt.LIZ(liz4, liz5).LIZ();
        while (liz6.hasNext()) {
            0Nq.clickTracking = 0Ns.LIZ(0Nq.clickTracking, (String)liz6.next());
        }
        return 0Nq;
    }
    
    public final boolean LIZ(final String s, final int liziz) {
        public final class 0O1<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(3938);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)(int)(((0Nl)t).byWrapper ? 1 : 0), (Comparable)(int)(((0Nl)t2).byWrapper ? 1 : 0));
            }
        }
        public final class 0O0<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(3937);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)(int)(((0Nl)t).byWrapper ? 1 : 0), (Comparable)(int)(((0Nl)t2).byWrapper ? 1 : 0));
            }
        }
        public final class 0Nz<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(3936);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)(int)(((0Nl)t).byWrapper ? 1 : 0), (Comparable)(int)(((0Nl)t2).byWrapper ? 1 : 0));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0O2.LJ:LX/0Nv;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          15
        //     9: aload_3        
        //    10: invokeinterface X/0Nv.LIZ:()V
        //    15: aload_0        
        //    16: aload_0        
        //    17: getfield        X/0O2.LIZIZ:I
        //    20: iconst_1       
        //    21: iadd           
        //    22: putfield        X/0O2.LIZIZ:I
        //    25: aconst_null    
        //    26: astore          4
        //    28: aload_0        
        //    29: getfield        X/0O2.LIZLLL:LX/0Nr;
        //    32: astore          5
        //    34: aload           5
        //    36: astore_3       
        //    37: aload           5
        //    39: ifnonnull       46
        //    42: getstatic       X/1CT.LIZ:LX/1CT;
        //    45: astore_3       
        //    46: aload_3        
        //    47: aload_1        
        //    48: invokeinterface X/0Nr.LIZ:(Ljava/lang/String;)Lorg/w3c/dom/Document;
        //    53: astore_1       
        //    54: goto            116
        //    57: astore_3       
        //    58: aload_0        
        //    59: getfield        X/0O2.LJ:LX/0Nv;
        //    62: astore          5
        //    64: aload           4
        //    66: astore_1       
        //    67: aload           5
        //    69: ifnull          116
        //    72: aload           5
        //    74: aload_3        
        //    75: invokeinterface X/0Nv.LIZ:(LX/0Nj;)V
        //    80: aload           4
        //    82: astore_1       
        //    83: goto            116
        //    86: astore          5
        //    88: aload           5
        //    90: invokestatic    X/VYh.LIZ:(Ljava/lang/Throwable;)V
        //    93: aload_0        
        //    94: getfield        X/0O2.LJ:LX/0Nv;
        //    97: astore_3       
        //    98: aload           4
        //   100: astore_1       
        //   101: aload_3        
        //   102: ifnull          116
        //   105: aload_3        
        //   106: aload           5
        //   108: invokeinterface X/0Nv.LIZ:(LX/0Ni;)V
        //   113: aload           4
        //   115: astore_1       
        //   116: aload_1        
        //   117: ifnonnull       186
        //   120: aload_0        
        //   121: getfield        X/0O2.LJ:LX/0Nv;
        //   124: astore_1       
        //   125: aload_1        
        //   126: ifnull          135
        //   129: aload_1        
        //   130: invokeinterface X/0Nv.LJ:()V
        //   135: aload_0        
        //   136: getfield        X/0O2.LIZIZ:I
        //   139: iconst_1       
        //   140: isub           
        //   141: istore_2       
        //   142: aload_0        
        //   143: iload_2        
        //   144: putfield        X/0O2.LIZIZ:I
        //   147: iload_2        
        //   148: ifne            184
        //   151: aload_0        
        //   152: getfield        X/0O2.LIZJ:LX/0Np;
        //   155: getfield        X/0Np.creativeList:Ljava/util/List;
        //   158: astore_1       
        //   159: aload_1        
        //   160: ifnull          184
        //   163: aload_1        
        //   164: invokeinterface java/util/List.size:()I
        //   169: iconst_1       
        //   170: if_icmple       184
        //   173: aload_1        
        //   174: new             LX/0Nz;
        //   177: dup            
        //   178: invokespecial   X/0Nz.<init>:()V
        //   181: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //   184: iconst_0       
        //   185: ireturn        
        //   186: aload_0        
        //   187: aload_1        
        //   188: iload_2        
        //   189: iconst_0       
        //   190: invokespecial   X/0O2.LIZ:(Lorg/w3c/dom/Document;II)Z
        //   193: istore          6
        //   195: aload_0        
        //   196: getfield        X/0O2.LJ:LX/0Nv;
        //   199: astore_1       
        //   200: aload_1        
        //   201: ifnull          210
        //   204: aload_1        
        //   205: invokeinterface X/0Nv.LJ:()V
        //   210: aload_0        
        //   211: getfield        X/0O2.LIZIZ:I
        //   214: iconst_1       
        //   215: isub           
        //   216: istore_2       
        //   217: aload_0        
        //   218: iload_2        
        //   219: putfield        X/0O2.LIZIZ:I
        //   222: iload_2        
        //   223: ifne            259
        //   226: aload_0        
        //   227: getfield        X/0O2.LIZJ:LX/0Np;
        //   230: getfield        X/0Np.creativeList:Ljava/util/List;
        //   233: astore_1       
        //   234: aload_1        
        //   235: ifnull          259
        //   238: aload_1        
        //   239: invokeinterface java/util/List.size:()I
        //   244: iconst_1       
        //   245: if_icmple       259
        //   248: aload_1        
        //   249: new             LX/0O0;
        //   252: dup            
        //   253: invokespecial   X/0O0.<init>:()V
        //   256: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //   259: iload           6
        //   261: ireturn        
        //   262: astore_1       
        //   263: aload_0        
        //   264: getfield        X/0O2.LJ:LX/0Nv;
        //   267: astore_3       
        //   268: aload_3        
        //   269: ifnull          278
        //   272: aload_3        
        //   273: invokeinterface X/0Nv.LJ:()V
        //   278: aload_0        
        //   279: getfield        X/0O2.LIZIZ:I
        //   282: iconst_1       
        //   283: isub           
        //   284: istore_2       
        //   285: aload_0        
        //   286: iload_2        
        //   287: putfield        X/0O2.LIZIZ:I
        //   290: iload_2        
        //   291: ifne            327
        //   294: aload_0        
        //   295: getfield        X/0O2.LIZJ:LX/0Np;
        //   298: getfield        X/0Np.creativeList:Ljava/util/List;
        //   301: astore_3       
        //   302: aload_3        
        //   303: ifnull          327
        //   306: aload_3        
        //   307: invokeinterface java/util/List.size:()I
        //   312: iconst_1       
        //   313: if_icmple       327
        //   316: aload_3        
        //   317: new             LX/0O1;
        //   320: dup            
        //   321: invokespecial   X/0O1.<init>:()V
        //   324: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //   327: aload_1        
        //   328: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type   
        //  -----  -----  -----  -----  -------
        //  28     34     86     116    LX/0Ni;
        //  28     34     57     86     LX/0Nj;
        //  28     34     262    329    Any
        //  42     46     86     116    LX/0Ni;
        //  42     46     57     86     LX/0Nj;
        //  42     46     262    329    Any
        //  46     54     86     116    LX/0Ni;
        //  46     54     57     86     LX/0Nj;
        //  46     54     262    329    Any
        //  58     64     262    329    Any
        //  72     80     262    329    Any
        //  88     98     262    329    Any
        //  105    113    262    329    Any
        //  186    195    262    329    Any
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
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
    
    public final boolean LIZIZ(final String s, final int liziz) {
        public final class 0Ny<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(3934);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)(int)(((0Nl)t).byWrapper ? 1 : 0), (Comparable)(int)(((0Nl)t2).byWrapper ? 1 : 0));
            }
        }
        public final class 0Nx<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(3933);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)(int)(((0Nl)t).byWrapper ? 1 : 0), (Comparable)(int)(((0Nl)t2).byWrapper ? 1 : 0));
            }
        }
        public final class 0Nw<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(3932);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)(int)(((0Nl)t).byWrapper ? 1 : 0), (Comparable)(int)(((0Nl)t2).byWrapper ? 1 : 0));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0O2.LJ:LX/0Nv;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnull          15
        //     9: aload_3        
        //    10: invokeinterface X/0Nv.LIZIZ:()V
        //    15: aload_0        
        //    16: aload_0        
        //    17: getfield        X/0O2.LIZIZ:I
        //    20: iconst_1       
        //    21: iadd           
        //    22: putfield        X/0O2.LIZIZ:I
        //    25: aconst_null    
        //    26: astore          4
        //    28: aload           4
        //    30: astore_3       
        //    31: aload_1        
        //    32: ifnull          73
        //    35: aload_1        
        //    36: invokestatic    X/0Nt.LIZIZ:(Ljava/lang/String;)Lorg/w3c/dom/Document;
        //    39: astore_3       
        //    40: goto            73
        //    43: astore          5
        //    45: aload           5
        //    47: invokestatic    X/VYh.LIZ:(Ljava/lang/Throwable;)V
        //    50: aload_0        
        //    51: getfield        X/0O2.LJ:LX/0Nv;
        //    54: astore_1       
        //    55: aload           4
        //    57: astore_3       
        //    58: aload_1        
        //    59: ifnull          73
        //    62: aload_1        
        //    63: aload           5
        //    65: invokeinterface X/0Nv.LIZ:(LX/0Nj;)V
        //    70: aload           4
        //    72: astore_3       
        //    73: aload_3        
        //    74: ifnonnull       143
        //    77: aload_0        
        //    78: getfield        X/0O2.LJ:LX/0Nv;
        //    81: astore_1       
        //    82: aload_1        
        //    83: ifnull          92
        //    86: aload_1        
        //    87: invokeinterface X/0Nv.LJ:()V
        //    92: aload_0        
        //    93: getfield        X/0O2.LIZIZ:I
        //    96: iconst_1       
        //    97: isub           
        //    98: istore_2       
        //    99: aload_0        
        //   100: iload_2        
        //   101: putfield        X/0O2.LIZIZ:I
        //   104: iload_2        
        //   105: ifne            141
        //   108: aload_0        
        //   109: getfield        X/0O2.LIZJ:LX/0Np;
        //   112: getfield        X/0Np.creativeList:Ljava/util/List;
        //   115: astore_1       
        //   116: aload_1        
        //   117: ifnull          141
        //   120: aload_1        
        //   121: invokeinterface java/util/List.size:()I
        //   126: iconst_1       
        //   127: if_icmple       141
        //   130: aload_1        
        //   131: new             LX/0Nw;
        //   134: dup            
        //   135: invokespecial   X/0Nw.<init>:()V
        //   138: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //   141: iconst_0       
        //   142: ireturn        
        //   143: aload_0        
        //   144: aload_3        
        //   145: iload_2        
        //   146: iconst_0       
        //   147: invokespecial   X/0O2.LIZ:(Lorg/w3c/dom/Document;II)Z
        //   150: istore          6
        //   152: aload_0        
        //   153: getfield        X/0O2.LJ:LX/0Nv;
        //   156: astore_1       
        //   157: aload_1        
        //   158: ifnull          167
        //   161: aload_1        
        //   162: invokeinterface X/0Nv.LJ:()V
        //   167: aload_0        
        //   168: getfield        X/0O2.LIZIZ:I
        //   171: iconst_1       
        //   172: isub           
        //   173: istore_2       
        //   174: aload_0        
        //   175: iload_2        
        //   176: putfield        X/0O2.LIZIZ:I
        //   179: iload_2        
        //   180: ifne            216
        //   183: aload_0        
        //   184: getfield        X/0O2.LIZJ:LX/0Np;
        //   187: getfield        X/0Np.creativeList:Ljava/util/List;
        //   190: astore_1       
        //   191: aload_1        
        //   192: ifnull          216
        //   195: aload_1        
        //   196: invokeinterface java/util/List.size:()I
        //   201: iconst_1       
        //   202: if_icmple       216
        //   205: aload_1        
        //   206: new             LX/0Nx;
        //   209: dup            
        //   210: invokespecial   X/0Nx.<init>:()V
        //   213: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //   216: iload           6
        //   218: ireturn        
        //   219: astore_1       
        //   220: aload_0        
        //   221: getfield        X/0O2.LJ:LX/0Nv;
        //   224: astore_3       
        //   225: aload_3        
        //   226: ifnull          235
        //   229: aload_3        
        //   230: invokeinterface X/0Nv.LJ:()V
        //   235: aload_0        
        //   236: getfield        X/0O2.LIZIZ:I
        //   239: iconst_1       
        //   240: isub           
        //   241: istore_2       
        //   242: aload_0        
        //   243: iload_2        
        //   244: putfield        X/0O2.LIZIZ:I
        //   247: iload_2        
        //   248: ifne            284
        //   251: aload_0        
        //   252: getfield        X/0O2.LIZJ:LX/0Np;
        //   255: getfield        X/0Np.creativeList:Ljava/util/List;
        //   258: astore_3       
        //   259: aload_3        
        //   260: ifnull          284
        //   263: aload_3        
        //   264: invokeinterface java/util/List.size:()I
        //   269: iconst_1       
        //   270: if_icmple       284
        //   273: aload_3        
        //   274: new             LX/0Ny;
        //   277: dup            
        //   278: invokespecial   X/0Ny.<init>:()V
        //   281: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //   284: aload_1        
        //   285: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type   
        //  -----  -----  -----  -----  -------
        //  35     40     43     73     LX/0Nj;
        //  35     40     219    286    Any
        //  45     55     219    286    Any
        //  62     70     219    286    Any
        //  143    152    219    286    Any
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
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
}
