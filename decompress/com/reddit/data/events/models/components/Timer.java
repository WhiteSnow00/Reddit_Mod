// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Timer
{
    public static final a<Timer, Timer.Timer$Builder> ADAPTER;
    public final Long first_contentful_paint;
    public final Long first_input_delay;
    public final Long first_meaningful_paint;
    public final Long millis;
    public final String referrer;
    public final String referrer_correlation_id;
    public final Long time_to_first_byte;
    public final String type;
    
    static {
        ADAPTER = (a)new Timer.Timer$TimerAdapter((Timer$1)null);
    }
    
    private Timer(final Timer.Timer$Builder timer$Builder) {
        this.type = Timer.Timer$Builder.access$100(timer$Builder);
        this.millis = Timer.Timer$Builder.access$200(timer$Builder);
        this.time_to_first_byte = Timer.Timer$Builder.access$300(timer$Builder);
        this.first_contentful_paint = Timer.Timer$Builder.access$400(timer$Builder);
        this.first_meaningful_paint = Timer.Timer$Builder.access$500(timer$Builder);
        this.first_input_delay = Timer.Timer$Builder.access$600(timer$Builder);
        this.referrer = Timer.Timer$Builder.access$700(timer$Builder);
        this.referrer_correlation_id = Timer.Timer$Builder.access$800(timer$Builder);
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
        if (!(o instanceof Timer)) {
            return false;
        }
        final Timer timer = (Timer)o;
        final String type = this.type;
        final String type2 = timer.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final Long millis = this.millis;
            final Long millis2 = timer.millis;
            if (millis == millis2 || (millis != null && millis.equals(millis2))) {
                final Long time_to_first_byte = this.time_to_first_byte;
                final Long time_to_first_byte2 = timer.time_to_first_byte;
                if (time_to_first_byte == time_to_first_byte2 || (time_to_first_byte != null && time_to_first_byte.equals(time_to_first_byte2))) {
                    final Long first_contentful_paint = this.first_contentful_paint;
                    final Long first_contentful_paint2 = timer.first_contentful_paint;
                    if (first_contentful_paint == first_contentful_paint2 || (first_contentful_paint != null && first_contentful_paint.equals(first_contentful_paint2))) {
                        final Long first_meaningful_paint = this.first_meaningful_paint;
                        final Long first_meaningful_paint2 = timer.first_meaningful_paint;
                        if (first_meaningful_paint == first_meaningful_paint2 || (first_meaningful_paint != null && first_meaningful_paint.equals(first_meaningful_paint2))) {
                            final Long first_input_delay = this.first_input_delay;
                            final Long first_input_delay2 = timer.first_input_delay;
                            if (first_input_delay == first_input_delay2 || (first_input_delay != null && first_input_delay.equals(first_input_delay2))) {
                                final String referrer = this.referrer;
                                final String referrer2 = timer.referrer;
                                if (referrer == referrer2 || (referrer != null && referrer.equals(referrer2))) {
                                    final String referrer_correlation_id = this.referrer_correlation_id;
                                    final String referrer_correlation_id2 = timer.referrer_correlation_id;
                                    boolean b2 = b;
                                    if (referrer_correlation_id == referrer_correlation_id2) {
                                        return b2;
                                    }
                                    if (referrer_correlation_id != null && referrer_correlation_id.equals(referrer_correlation_id2)) {
                                        b2 = b;
                                        return b2;
                                    }
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
        final String type = this.type;
        int hashCode = 0;
        int hashCode2;
        if (type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = type.hashCode();
        }
        final Long millis = this.millis;
        int hashCode3;
        if (millis == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = millis.hashCode();
        }
        final Long time_to_first_byte = this.time_to_first_byte;
        int hashCode4;
        if (time_to_first_byte == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = time_to_first_byte.hashCode();
        }
        final Long first_contentful_paint = this.first_contentful_paint;
        int hashCode5;
        if (first_contentful_paint == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = first_contentful_paint.hashCode();
        }
        final Long first_meaningful_paint = this.first_meaningful_paint;
        int hashCode6;
        if (first_meaningful_paint == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = first_meaningful_paint.hashCode();
        }
        final Long first_input_delay = this.first_input_delay;
        int hashCode7;
        if (first_input_delay == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = first_input_delay.hashCode();
        }
        final String referrer = this.referrer;
        int hashCode8;
        if (referrer == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = referrer.hashCode();
        }
        final String referrer_correlation_id = this.referrer_correlation_id;
        if (referrer_correlation_id != null) {
            hashCode = referrer_correlation_id.hashCode();
        }
        return ((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Timer{type=");
        r.append(this.type);
        r.append(", millis=");
        r.append(this.millis);
        r.append(", time_to_first_byte=");
        r.append(this.time_to_first_byte);
        r.append(", first_contentful_paint=");
        r.append(this.first_contentful_paint);
        r.append(", first_meaningful_paint=");
        r.append(this.first_meaningful_paint);
        r.append(", first_input_delay=");
        r.append(this.first_input_delay);
        r.append(", referrer=");
        r.append(this.referrer);
        r.append(", referrer_correlation_id=");
        return a.o(r, this.referrer_correlation_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Timer.ADAPTER.write(e, (Object)this);
    }
}
