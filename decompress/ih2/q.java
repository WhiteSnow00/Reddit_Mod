// 
// Decompiled by Procyon v0.6.0
// 

package ih2;

import yh2.c;
import java.lang.reflect.Modifier;
import ch2.o0;
import java.lang.reflect.AnnotatedElement;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.Member;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a;
import rh2.p;

public abstract class q extends m implements g, s, p
{
    public final a A() {
        final Class<?> declaringClass = this.P().getDeclaringClass();
        e.e((Object)declaringClass, "member.declaringClass");
        return new a((Class)declaringClass);
    }
    
    public abstract Member P();
    
    public final ArrayList Q(final Type[] p0, final Annotation[][] p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: arraylength    
        //     6: invokespecial   java/util/ArrayList.<init>:(I)V
        //     9: astore          10
        //    11: getstatic       ih2/c.a:Lih2/c;
        //    14: astore          12
        //    16: aload_0        
        //    17: invokevirtual   ih2/q.P:()Ljava/lang/reflect/Member;
        //    20: astore          11
        //    22: aload           11
        //    24: ldc             "member"
        //    26: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: getstatic       ih2/c.b:Lih2/c$a;
        //    32: astore          9
        //    34: aload           9
        //    36: astore          8
        //    38: aload           9
        //    40: ifnonnull       84
        //    43: aload           12
        //    45: monitorenter   
        //    46: getstatic       ih2/c.b:Lih2/c$a;
        //    49: astore          9
        //    51: aload           9
        //    53: astore          8
        //    55: aload           9
        //    57: ifnonnull       72
        //    60: aload           11
        //    62: invokestatic    ih2/c.a:(Ljava/lang/reflect/Member;)Lih2/c$a;
        //    65: astore          8
        //    67: aload           8
        //    69: putstatic       ih2/c.b:Lih2/c$a;
        //    72: aload           12
        //    74: monitorexit    
        //    75: goto            84
        //    78: astore_1       
        //    79: aload           12
        //    81: monitorexit    
        //    82: aload_1        
        //    83: athrow         
        //    84: aload           8
        //    86: getfield        ih2/c$a.a:Ljava/lang/reflect/Method;
        //    89: astore          9
        //    91: aload           9
        //    93: ifnonnull       99
        //    96: goto            111
        //    99: aload           8
        //   101: getfield        ih2/c$a.b:Ljava/lang/reflect/Method;
        //   104: astore          12
        //   106: aload           12
        //   108: ifnonnull       117
        //   111: aconst_null    
        //   112: astore          8
        //   114: goto            215
        //   117: aload           9
        //   119: aload           11
        //   121: iconst_0       
        //   122: anewarray       Ljava/lang/Object;
        //   125: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   128: astore          8
        //   130: aload           8
        //   132: ldc             "null cannot be cast to non-null type kotlin.Array<*>"
        //   134: invokestatic    ng2/e.d:(Ljava/lang/Object;Ljava/lang/String;)V
        //   137: aload           8
        //   139: checkcast       [Ljava/lang/Object;
        //   142: astore          11
        //   144: new             Ljava/util/ArrayList;
        //   147: dup            
        //   148: aload           11
        //   150: arraylength    
        //   151: invokespecial   java/util/ArrayList.<init>:(I)V
        //   154: astore          9
        //   156: aload           11
        //   158: arraylength    
        //   159: istore          5
        //   161: iconst_0       
        //   162: istore          4
        //   164: aload           9
        //   166: astore          8
        //   168: iload           4
        //   170: iload           5
        //   172: if_icmpge       215
        //   175: aload           12
        //   177: aload           11
        //   179: iload           4
        //   181: aaload         
        //   182: iconst_0       
        //   183: anewarray       Ljava/lang/Object;
        //   186: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   189: astore          8
        //   191: aload           8
        //   193: ldc             "null cannot be cast to non-null type kotlin.String"
        //   195: invokestatic    ng2/e.d:(Ljava/lang/Object;Ljava/lang/String;)V
        //   198: aload           9
        //   200: aload           8
        //   202: checkcast       Ljava/lang/String;
        //   205: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   208: pop            
        //   209: iinc            4, 1
        //   212: goto            164
        //   215: aload           8
        //   217: ifnull          235
        //   220: aload           8
        //   222: invokeinterface java/util/List.size:()I
        //   227: aload_1        
        //   228: arraylength    
        //   229: isub           
        //   230: istore          4
        //   232: goto            238
        //   235: iconst_0       
        //   236: istore          4
        //   238: aload_1        
        //   239: arraylength    
        //   240: istore          6
        //   242: iconst_0       
        //   243: istore          5
        //   245: iload           5
        //   247: iload           6
        //   249: if_icmpge       437
        //   252: aload_1        
        //   253: iload           5
        //   255: aaload         
        //   256: invokestatic    ih2/w$a.a:(Ljava/lang/reflect/Type;)Lih2/w;
        //   259: astore          11
        //   261: aload           8
        //   263: ifnull          383
        //   266: iload           5
        //   268: iload           4
        //   270: iadd           
        //   271: aload           8
        //   273: invokestatic    kotlin/collections/CollectionsKt___CollectionsKt.V4:(ILjava/util/List;)Ljava/lang/Object;
        //   276: checkcast       Ljava/lang/String;
        //   279: astore          9
        //   281: aload           9
        //   283: ifnull          289
        //   286: goto            386
        //   289: new             Ljava/lang/StringBuilder;
        //   292: dup            
        //   293: invokespecial   java/lang/StringBuilder.<init>:()V
        //   296: astore_1       
        //   297: aload_1        
        //   298: ldc             "No parameter with index "
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: pop            
        //   304: aload_1        
        //   305: iload           5
        //   307: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   310: pop            
        //   311: aload_1        
        //   312: bipush          43
        //   314: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   317: pop            
        //   318: aload_1        
        //   319: iload           4
        //   321: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   324: pop            
        //   325: aload_1        
        //   326: ldc             " (name="
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: pop            
        //   332: aload_1        
        //   333: aload_0        
        //   334: invokevirtual   ih2/q.getName:()Lyh2/e;
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   340: pop            
        //   341: aload_1        
        //   342: ldc             " type="
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   347: pop            
        //   348: aload_1        
        //   349: aload           11
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   354: pop            
        //   355: aload_1        
        //   356: ldc             ") in "
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: pop            
        //   362: aload_1        
        //   363: aload_0        
        //   364: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   367: pop            
        //   368: new             Ljava/lang/IllegalStateException;
        //   371: dup            
        //   372: aload_1        
        //   373: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   376: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   379: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   382: athrow         
        //   383: aconst_null    
        //   384: astore          9
        //   386: iload_3        
        //   387: ifeq            405
        //   390: iload           5
        //   392: aload_1        
        //   393: arraylength    
        //   394: iconst_1       
        //   395: isub           
        //   396: if_icmpne       405
        //   399: iconst_1       
        //   400: istore          7
        //   402: goto            408
        //   405: iconst_0       
        //   406: istore          7
        //   408: aload           10
        //   410: new             Lih2/y;
        //   413: dup            
        //   414: aload           11
        //   416: aload_2        
        //   417: iload           5
        //   419: aaload         
        //   420: aload           9
        //   422: iload           7
        //   424: invokespecial   ih2/y.<init>:(Lih2/w;[Ljava/lang/annotation/Annotation;Ljava/lang/String;Z)V
        //   427: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   430: pop            
        //   431: iinc            5, 1
        //   434: goto            245
        //   437: aload           10
        //   439: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  46     51     78     84     Any
        //  60     72     78     84     Any
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
    
    public final boolean equals(final Object o) {
        return o instanceof q && e.a((Object)this.P(), (Object)((q)o).P());
    }
    
    public final Collection getAnnotations() {
        return g$a.b((g)this);
    }
    
    public final AnnotatedElement getElement() {
        final Member p = this.P();
        e.d((Object)p, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement)p;
    }
    
    public final int getModifiers() {
        return this.P().getModifiers();
    }
    
    public final yh2.e getName() {
        final String name = this.P().getName();
        yh2.e g;
        if (name != null) {
            g = yh2.e.g(name);
        }
        else {
            g = null;
        }
        yh2.e a = g;
        if (g == null) {
            a = yh2.g.a;
        }
        return a;
    }
    
    public final o0 getVisibility() {
        return s$a.a((s)this);
    }
    
    public final boolean h() {
        return Modifier.isStatic(this.getModifiers());
    }
    
    public final int hashCode() {
        return this.P().hashCode();
    }
    
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.getModifiers());
    }
    
    public final boolean isFinal() {
        return Modifier.isFinal(this.getModifiers());
    }
    
    public final rh2.a l(final c c) {
        return (rh2.a)g$a.a((g)this, c);
    }
    
    public final void t() {
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(": ");
        sb.append(this.P());
        return sb.toString();
    }
}
