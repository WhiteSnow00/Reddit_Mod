// 
// Decompiled by Procyon v0.6.0
// 

package w6;

import java.util.Arrays;
import java.lang.reflect.WildcardType;
import c7.a;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.HashSet;

public abstract class j implements i
{
    public final int f;
    public final Object g;
    
    public j() {
        this.f = 1;
        this.g = new HashSet();
    }
    
    public j(final List g) {
        this.f = 0;
        this.g = g;
    }
    
    public j(final byte[] g) {
        this.f = 2;
        this.g = g;
    }
    
    public final void a(final Type... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: istore_3       
        //     3: iconst_0       
        //     4: istore_2       
        //     5: iload_2        
        //     6: iload_3        
        //     7: if_icmpge       222
        //    10: aload_1        
        //    11: iload_2        
        //    12: aaload         
        //    13: astore          4
        //    15: aload           4
        //    17: ifnull          216
        //    20: aload_0        
        //    21: getfield        w6/j.g:Ljava/lang/Object;
        //    24: checkcast       Ljava/util/Set;
        //    27: aload           4
        //    29: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    34: ifne            40
        //    37: goto            216
        //    40: aload           4
        //    42: instanceof      Ljava/lang/reflect/TypeVariable;
        //    45: ifeq            60
        //    48: aload_0        
        //    49: aload           4
        //    51: checkcast       Ljava/lang/reflect/TypeVariable;
        //    54: invokevirtual   w6/j.g:(Ljava/lang/reflect/TypeVariable;)V
        //    57: goto            216
        //    60: aload           4
        //    62: instanceof      Ljava/lang/reflect/WildcardType;
        //    65: ifeq            80
        //    68: aload_0        
        //    69: aload           4
        //    71: checkcast       Ljava/lang/reflect/WildcardType;
        //    74: invokevirtual   w6/j.i:(Ljava/lang/reflect/WildcardType;)V
        //    77: goto            216
        //    80: aload           4
        //    82: instanceof      Ljava/lang/reflect/ParameterizedType;
        //    85: ifeq            100
        //    88: aload_0        
        //    89: aload           4
        //    91: checkcast       Ljava/lang/reflect/ParameterizedType;
        //    94: invokevirtual   w6/j.e:(Ljava/lang/reflect/ParameterizedType;)V
        //    97: goto            216
        //   100: aload           4
        //   102: instanceof      Ljava/lang/Class;
        //   105: ifeq            120
        //   108: aload_0        
        //   109: aload           4
        //   111: checkcast       Ljava/lang/Class;
        //   114: invokevirtual   w6/j.c:(Ljava/lang/Class;)V
        //   117: goto            216
        //   120: aload           4
        //   122: instanceof      Ljava/lang/reflect/GenericArrayType;
        //   125: ifeq            140
        //   128: aload_0        
        //   129: aload           4
        //   131: checkcast       Ljava/lang/reflect/GenericArrayType;
        //   134: invokevirtual   w6/j.d:(Ljava/lang/reflect/GenericArrayType;)V
        //   137: goto            216
        //   140: new             Ljava/lang/AssertionError;
        //   143: astore_1       
        //   144: aload           4
        //   146: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   149: astore          5
        //   151: aload           5
        //   153: invokevirtual   java/lang/String.length:()I
        //   156: istore_2       
        //   157: new             Ljava/lang/StringBuilder;
        //   160: astore          6
        //   162: aload           6
        //   164: iload_2        
        //   165: bipush          14
        //   167: iadd           
        //   168: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   171: aload           6
        //   173: ldc             "Unknown type: "
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: pop            
        //   179: aload           6
        //   181: aload           5
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: pop            
        //   187: aload_1        
        //   188: aload           6
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //   196: aload_1        
        //   197: athrow         
        //   198: astore_1       
        //   199: aload_0        
        //   200: getfield        w6/j.g:Ljava/lang/Object;
        //   203: checkcast       Ljava/util/Set;
        //   206: aload           4
        //   208: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   213: pop            
        //   214: aload_1        
        //   215: athrow         
        //   216: iinc            2, 1
        //   219: goto            5
        //   222: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  40     57     198    216    Any
        //  60     77     198    216    Any
        //  80     97     198    216    Any
        //  100    117    198    216    Any
        //  120    137    198    216    Any
        //  140    198    198    216    Any
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
    
    public void e(final ParameterizedType parameterizedType) {
    }
    
    @Override
    public final List f() {
        return (List)this.g;
    }
    
    public abstract void g(final TypeVariable p0);
    
    @Override
    public final boolean h() {
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
