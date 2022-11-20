// 
// Decompiled by Procyon v0.6.0
// 

package lj2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.TYPE_USE })
public @interface e {
    Class<? extends b<?>> with() default b.class;
}
