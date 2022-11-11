// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.json.annotation;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonProperty {
    boolean required() default false;
}
