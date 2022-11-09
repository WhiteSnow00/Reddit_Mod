// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Timer
{
    public static final a<Timer, Builder> ADAPTER;
    public final Long first_contentful_paint;
    public final Long first_input_delay;
    public final Long first_meaningful_paint;
    public final Long millis;
    public final String referrer;
    public final String referrer_correlation_id;
    public final Long time_to_first_byte;
    public final String type;
    
    static {
        ADAPTER = (a)new TimerAdapter(null);
    }
    
    private Timer(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.millis = Builder.access$200(builder);
        this.time_to_first_byte = Builder.access$300(builder);
        this.first_contentful_paint = Builder.access$400(builder);
        this.first_meaningful_paint = Builder.access$500(builder);
        this.first_input_delay = Builder.access$600(builder);
        this.referrer = Builder.access$700(builder);
        this.referrer_correlation_id = Builder.access$800(builder);
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
        final StringBuilder k = a.k("Timer{type=");
        k.append(this.type);
        k.append(", millis=");
        k.append(this.millis);
        k.append(", time_to_first_byte=");
        k.append(this.time_to_first_byte);
        k.append(", first_contentful_paint=");
        k.append(this.first_contentful_paint);
        k.append(", first_meaningful_paint=");
        k.append(this.first_meaningful_paint);
        k.append(", first_input_delay=");
        k.append(this.first_input_delay);
        k.append(", referrer=");
        k.append(this.referrer);
        k.append(", referrer_correlation_id=");
        return b.j(k, this.referrer_correlation_id, "}");
    }
    
    public void write(final e e) throws IOException {
        Timer.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Timer>
    {
        private Long first_contentful_paint;
        private Long first_input_delay;
        private Long first_meaningful_paint;
        private Long millis;
        private String referrer;
        private String referrer_correlation_id;
        private Long time_to_first_byte;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final Timer timer) {
            this.type = timer.type;
            this.millis = timer.millis;
            this.time_to_first_byte = timer.time_to_first_byte;
            this.first_contentful_paint = timer.first_contentful_paint;
            this.first_meaningful_paint = timer.first_meaningful_paint;
            this.first_input_delay = timer.first_input_delay;
            this.referrer = timer.referrer;
            this.referrer_correlation_id = timer.referrer_correlation_id;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static /* synthetic */ Long access$200(final Builder builder) {
            return builder.millis;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.time_to_first_byte;
        }
        
        public static /* synthetic */ Long access$400(final Builder builder) {
            return builder.first_contentful_paint;
        }
        
        public static /* synthetic */ Long access$500(final Builder builder) {
            return builder.first_meaningful_paint;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.first_input_delay;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.referrer;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.referrer_correlation_id;
        }
        
        public Timer build() {
            return new Timer(this, null);
        }
        
        public Builder first_contentful_paint(final Long first_contentful_paint) {
            this.first_contentful_paint = first_contentful_paint;
            return this;
        }
        
        public Builder first_input_delay(final Long first_input_delay) {
            this.first_input_delay = first_input_delay;
            return this;
        }
        
        public Builder first_meaningful_paint(final Long first_meaningful_paint) {
            this.first_meaningful_paint = first_meaningful_paint;
            return this;
        }
        
        public Builder millis(final Long millis) {
            this.millis = millis;
            return this;
        }
        
        public Builder referrer(final String referrer) {
            this.referrer = referrer;
            return this;
        }
        
        public Builder referrer_correlation_id(final String referrer_correlation_id) {
            this.referrer_correlation_id = referrer_correlation_id;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.millis = null;
            this.time_to_first_byte = null;
            this.first_contentful_paint = null;
            this.first_meaningful_paint = null;
            this.first_input_delay = null;
            this.referrer = null;
            this.referrer_correlation_id = null;
        }
        
        public Builder time_to_first_byte(final Long time_to_first_byte) {
            this.time_to_first_byte = time_to_first_byte;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class TimerAdapter implements a<Timer, Builder>
    {
        private TimerAdapter() {
        }
        
        public Timer read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Timer read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.referrer_correlation_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.referrer(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.first_input_delay(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 10) {
                            builder.first_meaningful_paint(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 10) {
                            builder.first_contentful_paint(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.time_to_first_byte(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 10) {
                            builder.millis(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Timer timer) throws IOException {
            e.a0();
            if (timer.type != null) {
                e.N(1, (byte)11);
                e.Z(timer.type);
                e.O();
            }
            if (timer.millis != null) {
                e.N(2, (byte)10);
                a.r(timer.millis, e);
            }
            if (timer.time_to_first_byte != null) {
                e.N(3, (byte)10);
                a.r(timer.time_to_first_byte, e);
            }
            if (timer.first_contentful_paint != null) {
                e.N(4, (byte)10);
                a.r(timer.first_contentful_paint, e);
            }
            if (timer.first_meaningful_paint != null) {
                e.N(5, (byte)10);
                a.r(timer.first_meaningful_paint, e);
            }
            if (timer.first_input_delay != null) {
                e.N(6, (byte)10);
                a.r(timer.first_input_delay, e);
            }
            if (timer.referrer != null) {
                e.N(7, (byte)11);
                e.Z(timer.referrer);
                e.O();
            }
            if (timer.referrer_correlation_id != null) {
                e.N(8, (byte)11);
                e.Z(timer.referrer_correlation_id);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}
