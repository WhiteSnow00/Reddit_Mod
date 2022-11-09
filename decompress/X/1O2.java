// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import com.bytedance.covode.number.Covode;

public final class 1o2 extends F5g implements QgG<Boolean>
{
    public final /* synthetic */ 0On LIZ;
    
    static {
        Covode.recordClassIndex(4007);
    }
    
    public 1o2(final 0On liz) {
        this.LIZ = liz;
        super(0);
    }
    
    public final boolean LIZ() {
        public final class 1o1 extends F5g implements SRU<0Or, Set<0Or>, LinkedList<0Or>, 2P9>
        {
            public final /* synthetic */ 3tH LIZ;
            
            static {
                Covode.recordClassIndex(4008);
            }
            
            public 1o1(final 3tH liz) {
                this.LIZ = liz;
                super(3);
            }
            
            public final void LIZ(final 0Or 0Or, final Set<0Or> set, final LinkedList<0Or> list) {
                CTM.LIZ((Object)0Or, (Object)set, (Object)list);
                if (this.LIZ.element) {
                    return;
                }
                if (list.contains(0Or)) {
                    this.LIZ.element = true;
                    return;
                }
                if (!set.contains(0Or)) {
                    set.add(0Or);
                    list.add(0Or);
                    final Iterator<Object> iterator = 0Or.LIZ.LIZIZ.iterator();
                    while (iterator.hasNext()) {
                        this.LIZ(iterator.next(), set, list);
                    }
                    list.removeLast();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   X/3tH.<init>:()V
        //     7: astore_1       
        //     8: iconst_0       
        //     9: istore_2       
        //    10: aload_1        
        //    11: iconst_0       
        //    12: putfield        X/3tH.element:Z
        //    15: new             LX/1o1;
        //    18: dup            
        //    19: aload_1        
        //    20: invokespecial   X/1o1.<init>:(LX/3tH;)V
        //    23: astore_3       
        //    24: new             Ljava/util/LinkedHashSet;
        //    27: dup            
        //    28: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    31: astore          4
        //    33: new             Ljava/util/LinkedList;
        //    36: dup            
        //    37: invokespecial   java/util/LinkedList.<init>:()V
        //    40: astore          5
        //    42: aload_0        
        //    43: getfield        X/1o2.LIZ:LX/0On;
        //    46: getfield        X/0On.LJIIJ:[LX/0Or;
        //    49: astore          6
        //    51: aload           6
        //    53: arraylength    
        //    54: istore          7
        //    56: iload_2        
        //    57: iload           7
        //    59: if_icmpge       80
        //    62: aload_3        
        //    63: aload           6
        //    65: iload_2        
        //    66: aaload         
        //    67: aload           4
        //    69: aload           5
        //    71: invokevirtual   X/1o1.LIZ:(LX/0Or;Ljava/util/Set;Ljava/util/LinkedList;)V
        //    74: iinc            2, 1
        //    77: goto            56
        //    80: aload_1        
        //    81: getfield        X/3tH.element:Z
        //    84: ireturn        
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
}
