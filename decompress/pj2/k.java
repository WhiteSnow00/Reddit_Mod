// 
// Decompiled by Procyon v0.6.0
// 

package pj2;

import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface k {
    String[] names();
}
