// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Field;
import java.util.Collection;
import kotlin.jvm.internal.n;
import java.util.ArrayList;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public class 1Na implements 0kT
{
    public final 5DO LIZ;
    
    static {
        Covode.recordClassIndex(7146);
    }
    
    public 1Na() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: getstatic       X/1vE.LIZ:LX/1vE;
        //     8: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    11: putfield        X/1Na.LIZ:LX/5DO;
        //    14: return         
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
    
    public final Object LIZ(final String s) {
        CTM.LIZ((Object)s);
        return this.LIZ().get(s);
    }
    
    public final HashMap<String, Object> LIZ() {
        return (HashMap)this.LIZ.getValue();
    }
    
    public final void LIZ(Object o) {
        CTM.LIZ(o);
        Class<?> clazz = o.getClass();
        final ArrayList list = new ArrayList();
        while (clazz != null && (n.LIZ((Object)clazz, (Object)Object.class) ^ true)) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            n.LIZIZ((Object)declaredFields, "");
            Qsk.LIZ((Collection)list, (Object[])declaredFields);
            clazz = clazz.getSuperclass();
        }
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (((Field)next).getAnnotation(0kW.class) != null) {
                list2.add(next);
            }
        }
        final List list3 = list2;
        final ArrayList list4 = new ArrayList(6Jd.LIZ((Iterable)list3, 10));
        for (final Field field : list3) {
            final 0kW 0kW = field.getAnnotation(0kW.class);
            String liz;
            if (0kW != null) {
                liz = 0kW.LIZ();
            }
            else {
                liz = null;
            }
            list4.add((Object)8sj.LIZ((Object)field, (Object)liz));
        }
        for (final 8si 8si : list4) {
            final Object value = this.LIZ().get(8si.getSecond());
            final 0kW 0kW2 = ((Field)8si.getFirst()).getAnnotation(0kW.class);
            final boolean b = 0kW2 != null && 0kW2.LIZIZ();
            if (value == null) {
                if (b) {
                    continue;
                }
                o = new StringBuilder();
                ((StringBuilder)o).append((String)8si.getSecond());
                ((StringBuilder)o).append(" has not provided, please check it's provider. Provider size is:");
                ((StringBuilder)o).append(this.LIZ().size());
                ((StringBuilder)o).append(",provider's key is: ");
                ((StringBuilder)o).append(this.LIZ().keySet());
                throw new IllegalStateException(((StringBuilder)o).toString());
            }
            else {
                ((Field)8si.getFirst()).setAccessible(true);
                ((Field)8si.getFirst()).set(o, this.LIZ().get(8si.getSecond()));
            }
        }
    }
    
    @Override
    public final void LIZ(final Object o, final String s) {
        CTM.LIZ(o);
        final 0kX 0kX = o.getClass().getAnnotation(0kX.class);
        String liz = null;
        Label_0039: {
            if (0kX != null) {
                liz = 0kX.LIZ();
                if (liz != null) {
                    break Label_0039;
                }
            }
            if ((liz = s) == null) {
                return;
            }
        }
        this.LIZ().get(liz);
        this.LIZ().put(liz, o);
    }
    
    public final <T> T LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        Object value;
        if (!((value = this.LIZ().get(s)) instanceof Object)) {
            value = null;
        }
        return (T)value;
    }
    
    public final void LIZIZ(final Object o) {
        CTM.LIZ(o);
        Class<?> clazz = o.getClass();
        final ArrayList list = new ArrayList();
        while (clazz != null && (n.LIZ((Object)clazz, (Object)Object.class) ^ true)) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            n.LIZIZ((Object)declaredFields, "");
            Qsk.LIZ((Collection)list, (Object[])declaredFields);
            clazz = clazz.getSuperclass();
        }
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (((Field)next).getAnnotation(0kV.class) != null) {
                list2.add(next);
            }
        }
        final List list3 = list2;
        final ArrayList list4 = new ArrayList(6Jd.LIZ((Iterable)list3, 10));
        for (final Field field : list3) {
            final 0kV 0kV = field.getAnnotation(0kV.class);
            String liz;
            if (0kV != null) {
                liz = 0kV.LIZ();
            }
            else {
                liz = null;
            }
            list4.add((Object)8sj.LIZ((Object)field, (Object)liz));
        }
        for (final 8si 8si : list4) {
            if (this.LIZ().get(8si.getSecond()) == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append((String)8si.getSecond());
                sb.append(" has not provided, please check it's provider. Provider size is:");
                sb.append(this.LIZ().size());
                sb.append(",provider's key is: ");
                sb.append(this.LIZ().keySet());
                0ba.LIZ("Injector", new IllegalStateException(sb.toString()));
            }
            else {
                ((Field)8si.getFirst()).setAccessible(true);
                ((Field)8si.getFirst()).set(o, this.LIZ().get(8si.getSecond()));
            }
        }
    }
    
    public final boolean LIZJ(final String s) {
        CTM.LIZ((Object)s);
        return this.LIZ().get(s) == null;
    }
}
