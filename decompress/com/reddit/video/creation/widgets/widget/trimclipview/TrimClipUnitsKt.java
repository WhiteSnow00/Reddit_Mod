// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget.trimclipview;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0006" }, d2 = { "max", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Milliseconds;", "a", "b", "Lcom/reddit/video/creation/widgets/widget/trimclipview/TrimClipUnits$Pixels;", "min", "widgets_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class TrimClipUnitsKt
{
    public static final TrimClipUnits.Milliseconds max(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Milliseconds milliseconds2) {
        e.f((Object)milliseconds, "a");
        e.f((Object)milliseconds2, "b");
        return new TrimClipUnits.Milliseconds(Math.max(milliseconds.getValue(), milliseconds2.getValue()));
    }
    
    public static final TrimClipUnits.Pixels max(final TrimClipUnits.Pixels pixels, final TrimClipUnits.Pixels pixels2) {
        e.f((Object)pixels, "a");
        e.f((Object)pixels2, "b");
        return new TrimClipUnits.Pixels(Math.max(pixels.getValue(), pixels2.getValue()));
    }
    
    public static final TrimClipUnits.Milliseconds min(final TrimClipUnits.Milliseconds milliseconds, final TrimClipUnits.Milliseconds milliseconds2) {
        e.f((Object)milliseconds, "a");
        e.f((Object)milliseconds2, "b");
        return new TrimClipUnits.Milliseconds(Math.min(milliseconds.getValue(), milliseconds2.getValue()));
    }
}
