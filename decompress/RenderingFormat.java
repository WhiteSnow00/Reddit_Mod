// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum RenderingFormat
{
    HTML("HTML", 1), 
    PLAIN("PLAIN", 0);
    
    public abstract String escape(final String p0);
}
