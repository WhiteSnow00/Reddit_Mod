// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004?\u0006\u0005" }, d2 = { "Landroidx/compose/ui/platform/TextToolbarStatus;", "", "(Ljava/lang/String;I)V", "Shown", "Hidden", "ui_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum TextToolbarStatus
{
    private static final TextToolbarStatus[] $VALUES;
    
    Hidden, 
    Shown;
    
    private static final TextToolbarStatus[] $values() {
        return new TextToolbarStatus[] { TextToolbarStatus.Shown, TextToolbarStatus.Hidden };
    }
    
    static {
        $VALUES = $values();
    }
}
