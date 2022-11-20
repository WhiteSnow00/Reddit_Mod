// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import et.b;
import java.io.IOException;
import ft.e;
import et.a;

public final class ModqueueTrigger
{
    public static final a<ModqueueTrigger, Builder> ADAPTER;
    public final String message;
    public final String type;
    
    static {
        ADAPTER = (a)new ModqueueTriggerAdapter(null);
    }
    
    private ModqueueTrigger(final Builder builder) {
        this.type = Builder.access$100(builder);
        this.message = Builder.access$200(builder);
    }
    
    public ModqueueTrigger(final Builder builder, final ModqueueTrigger$1 object) {
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
        if (!(o instanceof ModqueueTrigger)) {
            return false;
        }
        final ModqueueTrigger modqueueTrigger = (ModqueueTrigger)o;
        final String type = this.type;
        final String type2 = modqueueTrigger.type;
        if (type == type2 || (type != null && type.equals(type2))) {
            final String message = this.message;
            final String message2 = modqueueTrigger.message;
            boolean b2 = b;
            if (message == message2) {
                return b2;
            }
            if (message != null && message.equals(message2)) {
                b2 = b;
                return b2;
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
        final String message = this.message;
        if (message != null) {
            hashCode = message.hashCode();
        }
        return ((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ModqueueTrigger{type=");
        t.append(this.type);
        t.append(", message=");
        return ph0.a.f(t, this.message, "}");
    }
    
    public void write(final e e) throws IOException {
        ModqueueTrigger.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements b<ModqueueTrigger>
    {
        private String message;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final ModqueueTrigger modqueueTrigger) {
            this.type = modqueueTrigger.type;
            this.message = modqueueTrigger.message;
        }
        
        public static String access$100(final Builder builder) {
            return builder.type;
        }
        
        public static String access$200(final Builder builder) {
            return builder.message;
        }
        
        public ModqueueTrigger build() {
            return new ModqueueTrigger(this, null);
        }
        
        public /* bridge */ Object build() {
            return this.build();
        }
        
        public Builder message(final String message) {
            this.message = message;
            return this;
        }
        
        public void reset() {
            this.type = null;
            this.message = null;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
    
    public static final class ModqueueTriggerAdapter implements a<ModqueueTrigger, Builder>
    {
        private ModqueueTriggerAdapter() {
        }
        
        public ModqueueTriggerAdapter(final ModqueueTrigger$1 object) {
            this();
        }
        
        public ModqueueTrigger read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ModqueueTrigger read(final e e, final Builder builder) throws IOException {
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
                        ht.a.a(e, a);
                    }
                    else if (a == 11) {
                        builder.message(e.F());
                    }
                    else {
                        ht.a.a(e, a);
                    }
                }
                else if (a == 11) {
                    builder.type(e.F());
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
        
        public void write(final e e, final ModqueueTrigger modqueueTrigger) throws IOException {
            e.X();
            if (modqueueTrigger.type != null) {
                e.O(1, (byte)11);
                e.W(modqueueTrigger.type);
                e.P();
            }
            if (modqueueTrigger.message != null) {
                e.O(2, (byte)11);
                e.W(modqueueTrigger.message);
                e.P();
            }
            e.R();
            e.Y();
        }
        
        public /* bridge */ void write(final e e, final Object o) throws IOException {
            this.write(e, (ModqueueTrigger)o);
        }
    }
}
