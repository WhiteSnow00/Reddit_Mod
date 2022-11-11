// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum AnnotationArgumentsRenderingPolicy
{
    ALWAYS_PARENTHESIZED(true, true), 
    NO_ARGUMENTS(false, false, 3, (DefaultConstructorMarker)null), 
    UNLESS_EMPTY(true, false, 2, (DefaultConstructorMarker)null);
    
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    
    private AnnotationArgumentsRenderingPolicy(final boolean includeAnnotationArguments, final boolean includeEmptyAnnotationArguments) {
        this.includeAnnotationArguments = includeAnnotationArguments;
        this.includeEmptyAnnotationArguments = includeEmptyAnnotationArguments;
    }
    
    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }
    
    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }
}
