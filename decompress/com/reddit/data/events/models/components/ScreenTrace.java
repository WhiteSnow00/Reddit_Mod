// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ScreenTrace
{
    public static final a<ScreenTrace, ScreenTrace.ScreenTrace$Builder> ADAPTER;
    public final Integer fps_frames_1_28;
    public final Integer fps_frames_28_54;
    public final Integer fps_frames_above_54;
    public final Integer fps_frames_below_1;
    public final Integer frozen_frames;
    public final Integer slow_frames;
    public final Integer total_frames;
    
    static {
        ADAPTER = (a)new ScreenTrace.ScreenTrace$ScreenTraceAdapter((ScreenTrace$1)null);
    }
    
    private ScreenTrace(final ScreenTrace.ScreenTrace$Builder screenTrace$Builder) {
        this.total_frames = ScreenTrace.ScreenTrace$Builder.access$100(screenTrace$Builder);
        this.slow_frames = ScreenTrace.ScreenTrace$Builder.access$200(screenTrace$Builder);
        this.frozen_frames = ScreenTrace.ScreenTrace$Builder.access$300(screenTrace$Builder);
        this.fps_frames_above_54 = ScreenTrace.ScreenTrace$Builder.access$400(screenTrace$Builder);
        this.fps_frames_28_54 = ScreenTrace.ScreenTrace$Builder.access$500(screenTrace$Builder);
        this.fps_frames_1_28 = ScreenTrace.ScreenTrace$Builder.access$600(screenTrace$Builder);
        this.fps_frames_below_1 = ScreenTrace.ScreenTrace$Builder.access$700(screenTrace$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof ScreenTrace)) {
            return false;
        }
        final ScreenTrace screenTrace = (ScreenTrace)o;
        final Integer total_frames = this.total_frames;
        final Integer total_frames2 = screenTrace.total_frames;
        if (total_frames == total_frames2 || (total_frames != null && total_frames.equals(total_frames2))) {
            final Integer slow_frames = this.slow_frames;
            final Integer slow_frames2 = screenTrace.slow_frames;
            if (slow_frames == slow_frames2 || (slow_frames != null && slow_frames.equals(slow_frames2))) {
                final Integer frozen_frames = this.frozen_frames;
                final Integer frozen_frames2 = screenTrace.frozen_frames;
                if (frozen_frames == frozen_frames2 || (frozen_frames != null && frozen_frames.equals(frozen_frames2))) {
                    final Integer fps_frames_above_54 = this.fps_frames_above_54;
                    final Integer fps_frames_above_55 = screenTrace.fps_frames_above_54;
                    if (fps_frames_above_54 == fps_frames_above_55 || (fps_frames_above_54 != null && fps_frames_above_54.equals(fps_frames_above_55))) {
                        final Integer fps_frames_28_54 = this.fps_frames_28_54;
                        final Integer fps_frames_28_55 = screenTrace.fps_frames_28_54;
                        if (fps_frames_28_54 == fps_frames_28_55 || (fps_frames_28_54 != null && fps_frames_28_54.equals(fps_frames_28_55))) {
                            final Integer fps_frames_1_28 = this.fps_frames_1_28;
                            final Integer fps_frames_1_29 = screenTrace.fps_frames_1_28;
                            if (fps_frames_1_28 == fps_frames_1_29 || (fps_frames_1_28 != null && fps_frames_1_28.equals(fps_frames_1_29))) {
                                final Integer fps_frames_below_1 = this.fps_frames_below_1;
                                final Integer fps_frames_below_2 = screenTrace.fps_frames_below_1;
                                boolean b2 = b;
                                if (fps_frames_below_1 == fps_frames_below_2) {
                                    return b2;
                                }
                                if (fps_frames_below_1 != null && fps_frames_below_1.equals(fps_frames_below_2)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer total_frames = this.total_frames;
        int hashCode = 0;
        int hashCode2;
        if (total_frames == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = total_frames.hashCode();
        }
        final Integer slow_frames = this.slow_frames;
        int hashCode3;
        if (slow_frames == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = slow_frames.hashCode();
        }
        final Integer frozen_frames = this.frozen_frames;
        int hashCode4;
        if (frozen_frames == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = frozen_frames.hashCode();
        }
        final Integer fps_frames_above_54 = this.fps_frames_above_54;
        int hashCode5;
        if (fps_frames_above_54 == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = fps_frames_above_54.hashCode();
        }
        final Integer fps_frames_28_54 = this.fps_frames_28_54;
        int hashCode6;
        if (fps_frames_28_54 == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = fps_frames_28_54.hashCode();
        }
        final Integer fps_frames_1_28 = this.fps_frames_1_28;
        int hashCode7;
        if (fps_frames_1_28 == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = fps_frames_1_28.hashCode();
        }
        final Integer fps_frames_below_1 = this.fps_frames_below_1;
        if (fps_frames_below_1 != null) {
            hashCode = fps_frames_below_1.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("ScreenTrace{total_frames=");
        r.append(this.total_frames);
        r.append(", slow_frames=");
        r.append(this.slow_frames);
        r.append(", frozen_frames=");
        r.append(this.frozen_frames);
        r.append(", fps_frames_above_54=");
        r.append(this.fps_frames_above_54);
        r.append(", fps_frames_28_54=");
        r.append(this.fps_frames_28_54);
        r.append(", fps_frames_1_28=");
        r.append(this.fps_frames_1_28);
        r.append(", fps_frames_below_1=");
        r.append(this.fps_frames_below_1);
        r.append("}");
        return r.toString();
    }
    
    public void write(final e e) throws IOException {
        ScreenTrace.ADAPTER.write(e, (Object)this);
    }
}
