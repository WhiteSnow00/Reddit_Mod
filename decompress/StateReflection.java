// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD })
public @interface StateReflection {
    Class<? extends Bundler> value() default Bundler.class;
}
