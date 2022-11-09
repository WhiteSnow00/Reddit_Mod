// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import java.util.Arrays;
import java.lang.reflect.WildcardType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.ParameterizedType;
import d7.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;

public abstract class k implements j
{
    public final /* synthetic */ int f;
    public final Collection g;
    
    public k() {
        this.f = 1;
        this.g = new HashSet();
    }
    
    public k(final List g) {
        this.f = 0;
        this.g = g;
    }
    
    public final void a(final Type... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: istore_2       
        //     3: iconst_0       
        //     4: istore_3       
        //     5: iload_3        
        //     6: iload_2        
        //     7: if_icmpge       220
        //    10: aload_1        
        //    11: iload_3        
        //    12: aaload         
        //    13: astore          4
        //    15: aload           4
        //    17: ifnull          214
        //    20: aload_0        
        //    21: getfield        x6/k.g:Ljava/util/Collection;
        //    24: checkcast       Ljava/util/Set;
        //    27: aload           4
        //    29: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    34: ifne            40
        //    37: goto            214
        //    40: aload           4
        //    42: instanceof      Ljava/lang/reflect/TypeVariable;
        //    45: ifeq            60
        //    48: aload_0        
        //    49: aload           4
        //    51: checkcast       Ljava/lang/reflect/TypeVariable;
        //    54: invokevirtual   x6/k.h:(Ljava/lang/reflect/TypeVariable;)V
        //    57: goto            214
        //    60: aload           4
        //    62: instanceof      Ljava/lang/reflect/WildcardType;
        //    65: ifeq            80
        //    68: aload_0        
        //    69: aload           4
        //    71: checkcast       Ljava/lang/reflect/WildcardType;
        //    74: invokevirtual   x6/k.i:(Ljava/lang/reflect/WildcardType;)V
        //    77: goto            214
        //    80: aload           4
        //    82: instanceof      Ljava/lang/reflect/ParameterizedType;
        //    85: ifeq            100
        //    88: aload_0        
        //    89: aload           4
        //    91: checkcast       Ljava/lang/reflect/ParameterizedType;
        //    94: invokevirtual   x6/k.f:(Ljava/lang/reflect/ParameterizedType;)V
        //    97: goto            214
        //   100: aload           4
        //   102: instanceof      Ljava/lang/Class;
        //   105: ifeq            120
        //   108: aload_0        
        //   109: aload           4
        //   111: checkcast       Ljava/lang/Class;
        //   114: invokevirtual   x6/k.c:(Ljava/lang/Class;)V
        //   117: goto            214
        //   120: aload           4
        //   122: instanceof      Ljava/lang/reflect/GenericArrayType;
        //   125: ifeq            140
        //   128: aload_0        
        //   129: aload           4
        //   131: checkcast       Ljava/lang/reflect/GenericArrayType;
        //   134: invokevirtual   x6/k.d:(Ljava/lang/reflect/GenericArrayType;)V
        //   137: goto            214
        //   140: new             Ljava/lang/AssertionError;
        //   143: astore          5
        //   145: aload           4
        //   147: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   150: astore          6
        //   152: aload           6
        //   154: invokevirtual   java/lang/String.length:()I
        //   157: istore_3       
        //   158: new             Ljava/lang/StringBuilder;
        //   161: astore_1       
        //   162: aload_1        
        //   163: iload_3        
        //   164: bipush          14
        //   166: iadd           
        //   167: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   170: aload_1        
        //   171: ldc             "Unknown type: "
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: pop            
        //   177: aload_1        
        //   178: aload           6
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: pop            
        //   184: aload           5
        //   186: aload_1        
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   193: aload           5
        //   195: athrow         
        //   196: astore_1       
        //   197: aload_0        
        //   198: getfield        x6/k.g:Ljava/util/Collection;
        //   201: checkcast       Ljava/util/Set;
        //   204: aload           4
        //   206: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   211: pop            
        //   212: aload_1        
        //   213: athrow         
        //   214: iinc            3, 1
        //   217: goto            5
        //   220: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  40     57     196    214    Any
        //  60     77     196    214    Any
        //  80     97     196    214    Any
        //  100    117    196    214    Any
        //  120    137    196    214    Any
        //  140    196    196    214    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public void c(final Class clazz) {
    }
    
    public void d(final GenericArrayType genericArrayType) {
    }
    
    @Override
    public final boolean e() {
        final boolean empty = ((List)this.g).isEmpty();
        final boolean b = false;
        if (!empty) {
            boolean b2 = b;
            if (((List)this.g).size() != 1) {
                return b2;
            }
            b2 = b;
            if (!((List)this.g).get(0).c()) {
                return b2;
            }
        }
        return true;
    }
    
    public void f(final ParameterizedType parameterizedType) {
    }
    
    @Override
    public final List g() {
        return (List)this.g;
    }
    
    public abstract void h(final TypeVariable p0);
    
    public abstract void i(final WildcardType p0);
    
    @Override
    public final String toString() {
        switch (this.f) {
            default: {
                return super.toString();
            }
            case 0: {
                final StringBuilder sb = new StringBuilder();
                if (!((List)this.g).isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(((List)this.g).toArray()));
                }
                return sb.toString();
            }
        }
    }
}
