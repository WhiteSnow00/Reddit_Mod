// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import b5.k;
import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class Mute
{
    public static final a<Mute, Builder> ADAPTER;
    public final Long last_mute_timestamp;
    public final String state;
    public final Integer total_mutes;
    
    static {
        ADAPTER = (a)new MuteAdapter(null);
    }
    
    private Mute(final Builder builder) {
        this.total_mutes = Builder.access$100(builder);
        this.last_mute_timestamp = Builder.access$200(builder);
        this.state = Builder.access$300(builder);
    }
    
    public Mute(final Builder builder, final Mute$1 object) {
        this(builder);
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
        if (!(o instanceof Mute)) {
            return false;
        }
        final Mute mute = (Mute)o;
        final Integer total_mutes = this.total_mutes;
        final Integer total_mutes2 = mute.total_mutes;
        if (total_mutes == total_mutes2 || (total_mutes != null && total_mutes.equals(total_mutes2))) {
            final Long last_mute_timestamp = this.last_mute_timestamp;
            final Long last_mute_timestamp2 = mute.last_mute_timestamp;
            if (last_mute_timestamp == last_mute_timestamp2 || (last_mute_timestamp != null && last_mute_timestamp.equals(last_mute_timestamp2))) {
                final String state = this.state;
                final String state2 = mute.state;
                boolean b2 = b;
                if (state == state2) {
                    return b2;
                }
                if (state != null && state.equals(state2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer total_mutes = this.total_mutes;
        int hashCode = 0;
        int hashCode2;
        if (total_mutes == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = total_mutes.hashCode();
        }
        final Long last_mute_timestamp = this.last_mute_timestamp;
        int hashCode3;
        if (last_mute_timestamp == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = last_mute_timestamp.hashCode();
        }
        final String state = this.state;
        if (state != null) {
            hashCode = state.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Mute{total_mutes=");
        t.append(this.total_mutes);
        t.append(", last_mute_timestamp=");
        t.append(this.last_mute_timestamp);
        t.append(", state=");
        return ph0.a.f(t, this.state, "}");
    }
    
    public void write(final e e) throws IOException {
        Mute.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<Mute>
    {
        private Long last_mute_timestamp;
        private String state;
        private Integer total_mutes;
        
        public Builder() {
        }
        
        public Builder(final Mute mute) {
            this.total_mutes = mute.total_mutes;
            this.last_mute_timestamp = mute.last_mute_timestamp;
            this.state = mute.state;
        }
        
        public static Integer access$100(final Builder builder) {
            return builder.total_mutes;
        }
        
        public static Long access$200(final Builder builder) {
            return builder.last_mute_timestamp;
        }
        
        public static String access$300(final Builder builder) {
            return builder.state;
        }
        
        public Mute build() {
            return new Mute(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder last_mute_timestamp(final Long last_mute_timestamp) {
            this.last_mute_timestamp = last_mute_timestamp;
            return this;
        }
        
        public void reset() {
            this.total_mutes = null;
            this.last_mute_timestamp = null;
            this.state = null;
        }
        
        public Builder state(final String state) {
            this.state = state;
            return this;
        }
        
        public Builder total_mutes(final Integer total_mutes) {
            this.total_mutes = total_mutes;
            return this;
        }
    }
    
    public static final class MuteAdapter implements a<Mute, Builder>
    {
        private MuteAdapter() {
        }
        
        public MuteAdapter(final Mute$1 object) {
            this();
        }
        
        public Mute read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Mute read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final ft.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            ht.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.state(e.F());
                        }
                        else {
                            ht.a.a(e, a);
                        }
                    }
                    else if (a == 10) {
                        builder.last_mute_timestamp(e.v());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 8) {
                    builder.total_mutes(e.t());
                }
                else {
                    ht.a.a(e, a);
                }
                e.r();
            }
            e.I();
            return builder.build();
        }
        
        public /* bridge */ Object read(final e e) throws ThriftException, IOException {
            return this.read(e);
        }
        
        public /* bridge */ Object read(final e e, final b b) throws ThriftException, IOException {
            return this.read(e, (Builder)b);
        }
        
        public void write(final e e, final Mute mute) throws IOException {
            e.X();
            if (mute.total_mutes != null) {
                e.O(1, (byte)8);
                aq2.a.x(mute.total_mutes, e);
            }
            if (mute.last_mute_timestamp != null) {
                e.O(2, (byte)10);
                k.w(mute.last_mute_timestamp, e);
            }
            if (mute.state != null) {
                e.O(3, (byte)11);
                e.W(mute.state);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (Mute)o);
        }
    }
}
